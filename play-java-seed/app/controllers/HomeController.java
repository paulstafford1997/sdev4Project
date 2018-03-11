package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import models.*;
import models.users.*;
import views.html.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    private FormFactory formFactory;
    private Environment e;
    
        @Inject
        public HomeController(FormFactory f,Environment env) {
            this.formFactory = f;
            this.e = env;
        }
    
        public Result index(Long emp) {
            List<Project> projectList = null;
            List<Employee> employeeList = Employee.findAll();
            if (emp == 0) {
                projectList = Project.findAll();
            }
            else {
                projectList = Employee.find.ref(emp).getProjects();
            }
            return ok(index.render(projectList, employeeList, User.getUserById(session().get("email")),e));
        }

    public Result address() {
        List<Address> addressList = Address.findAll();
        return ok(address.render(addressList,User.getUserById(session().get("email"))));
    }
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addProject() {
        Form<Project> projectForm = formFactory.form(Project.class);
        return ok(addProject.render(projectForm, User.getUserById(session().get("email"))));
    }
    public Result addProjectSubmit() {
        Project newProject;
        Form<Project> newProjectForm = formFactory.form(Project.class).bindFromRequest();

        if (newProjectForm.hasErrors()) {
            return badRequest(addProject.render(newProjectForm, User.getUserById(session().get("email"))));
        }
        else {
            newProject = newProjectForm.get();

            if (newProject.getId() == null) {
                newProject.save();    
                flash("success", "Project " + newProject.getName() + " was added");
                
            }
            else if (newProject.getId() != null) {
                newProject.update();
                flash("success", "Project " + newProject.getName() + " was updated");
            }
        }

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

        String saveImageMsg = saveFile(newProject.getId(), image);

        flash("success", "Project " + newProject.getName() + " has been created/updated " + saveImageMsg);

        return redirect(controllers.routes.HomeController.index(0));
    }
    //WAS Customer
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addAddress() {
        Form<Address> addressForm = formFactory.form(Address.class);
        return ok(addAddress.render(addressForm,User.getUserById(session().get("email"))));
    }

    public Result addAddressSubmit() {
        Form<Address> newAddressForm = formFactory.form(Address.class).bindFromRequest();
        

        if (newAddressForm.hasErrors()) {
            return badRequest(addAddress.render(newAddressForm,User.getUserById(session().get("email"))));
            
        } 
        else {
            Address newAddress = newAddressForm.get();
            
            if (newAddress.getId() == null) {
                newAddress.save();
                flash("success", "Address " + newAddress.getHouseNum() + " " + newAddress.getStreet() + " was added");                
            }

            else {
                newAddress.update();
                flash("success", "Address " + newAddress.getHouseNum() + " " + newAddress.getStreet() + " was updated");                
            }



            return redirect(controllers.routes.HomeController.address());
        }
    }

    public Result department() {
        List<Department> departmentList = Department.findAll();
        return ok(department.render(departmentList,User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addDepartment() {
        Form<Department> departmentForm = formFactory.form(Department.class);
        return ok(addDepartment.render(departmentForm,User.getUserById(session().get("email"))));
    }

    public Result addDepartmentSubmit() {
        Form<Department> newDepartmentForm = formFactory.form(Department.class).bindFromRequest();
        

        if (newDepartmentForm.hasErrors()) {
            return badRequest(addDepartment.render(newDepartmentForm,User.getUserById(session().get("email"))));
            
        } 
        else {
            Department newDepartment = newDepartmentForm.get();
            
            if (newDepartment.getId() == null) {
                newDepartment.save();
                flash("success", "Department " + newDepartment.getName() + "was added");                
            }

            else {
                newDepartment.update();
                flash("success", "Department " + newDepartment.getName() +  "was updated");                
            }



            return redirect(controllers.routes.HomeController.department());
        }
    }
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteProject(Long id) {
        Project.find.ref(id).delete();

        flash("success", "Project has been deleted");
        
        return redirect(routes.HomeController.index(0));
    }

    public Result deleteAddress(Long id) {
        Address.find.ref(id).delete();
        flash("success", "Address has been deleted");

        return redirect(routes.HomeController.index(0));
    }

    public Result deleteDepartment(Long id) {
        Department.find.ref(id).delete();
        flash("success", "Department has been deleted");

        return redirect(routes.HomeController.index(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateProject(Long id) {
        Project p;
        Form<Project> projectForm;

        try {
            p = Project.find.byId(id);
            projectForm = formFactory.form(Project.class).fill(p);
        } 
        catch (Exception ex) {
            return badRequest("error");
        }
        return ok(updateProject.render(id, projectForm, User.getUserById(session().get("email"))));
    }

    @Transactional
    public Result updateAddress(Long id) {        
        Address ad;
        Form<Address> addressForm;

        try {
            ad = Address.find.byId(id);
            addressForm = formFactory.form(Address.class).fill(ad);
        }
        catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addAddress.render(addressForm,User.getUserById(session().get("email"))));
    }

    @Transactional
    public Result updateDepartment(Long id) {        
        Department dep;
        Form<Department> departmentForm;

        try {
            dep = Department.find.byId(id);
            departmentForm = formFactory.form(Department.class).fill(dep);
        }
        catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addDepartment.render(departmentForm,User.getUserById(session().get("email"))));
    }
    public String saveFile(Long id, FilePart<File> uploaded) {
        // make sure that the file exists
        if (uploaded != null) {
            // make sure that the content is indeed an image
            String mimeType = uploaded.getContentType(); 
            if (mimeType.startsWith("image/")) {
                // get the file name
                String fileName = uploaded.getFilename();                
                // save the file object (created without a path, File saves
                // the content to a default location, usually the temp or tmp
                // directory)
                File file = uploaded.getFile();
                // create an ImageMagik operation - this object is used to specify
                // the required image processing
                IMOperation op = new IMOperation();
                // add the uploaded image to the operationop.addImage(file.getAbsolutePath());
                op.addImage(file.getAbsolutePath());
                // resize the image using height and width saveFileOld(Long id, FilePart<File> uploaded) {
                op.resize(300, 200);
                op.addImage("public/images/productImages/" + id + ".jpg");
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.resize(60);
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".jpg");
                File dir = new File("public/images/productImages/thumbnails/");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                ConvertCmd cmd = new ConvertCmd();
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "/ no file";
    }
    public String saveFileOld(Long id, FilePart<File> uploaded) {
        // make sure that the file exists
        String mimeType = uploaded.getContentType(); 
        if (uploaded != null) {
            // make sure that the content is indeed an image
            if (mimeType.startsWith("image/")) {
                // get the file name
                String fileName = uploaded.getFilename();      
                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i+1);
                }
                // save the file object (created without a path, File saves
                // the content to a default location, usually the temp or tmp
                // directory)
                File file = uploaded.getFile();
                // we must make sure that the directory for the images exists before we save it
                File dir = new File("public/images/productImages");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                // move the file to the required location (in a real application 
                // the path to where images are stored would be configurable, but 
                // for the lab we just hard-code it)
                if(file.renameTo(new File("public/images/productImages/", id + "." + extension))) {
                    return "/ file uploaded";
                } else {
                    return "/ file upload failed";
                }
            }
        }
        return "/ no file";
    }
    public Result projectDetails(Long id) {
        Project p;

        p = Project.find.byId(id);
            
        return ok(projectDetails.render(p,User.getUserById(session().get("email")),e));
        //return ok(addAddress.render(addressForm,User.getUserById(session().get("email"))));
    }

    public Result updateProjectSubmit(Long id) {
        
        // Retrieve the submitted form object (bind from the HTTP request)
        Form<Project> updateProjectForm = formFactory.form(Project.class).bindFromRequest();

        // Check for errors (based on constraints set in the Project class)
        if (updateProjectForm.hasErrors()) {
            // Display the form again by returning a bad request
            return badRequest(updateProject.render(id,updateProjectForm, User.getUserById(session().get("email"))));
        } else {
            // No errors found - extract the project detail from the form
            Project p = updateProjectForm.get();
            p.setId(id);
            
            //update (save) this product
            p.update();

            // Redirect to the index page
            return redirect(controllers.routes.HomeController.index(0));
        }
    }

    public Result updateAddressSubmit(Long id) {
        
        // Retrieve the submitted form object (bind from the HTTP request)
        Form<Address> updateAddressForm = formFactory.form(Address.class).bindFromRequest();

        // Check for errors (based on constraints set in the Project class)
        if (updateAddressForm.hasErrors()) {
            // Display the form again by returning a bad request
            return badRequest(updateAddress.render(id,updateAddressForm, User.getUserById(session().get("email"))));
        } else {
        
            Address ad = updateAddressForm.get();
            ad.setId(id);
            
            ad.update();

            // Redirect to the index page
            return redirect(controllers.routes.HomeController.index(0));
        }
    }

    public Result updateDepartmentSubmit(Long id) {
        
        // Retrieve the submitted form object (bind from the HTTP request)
        Form<Department> updateDepartmentForm = formFactory.form(Department.class).bindFromRequest();

        // Check for errors (based on constraints set in the Project class)
        if (updateDepartmentForm.hasErrors()) {
            // Display the form again by returning a bad request
            return badRequest(updateDepartment.render(id,updateDepartmentForm, User.getUserById(session().get("email"))));
        } else {
            // No errors found - extract the project detail from the form
            Department dep = updateDepartmentForm.get();
            dep.setId(id);
            
            
            //update (save) this product
            dep.update();

            // Redirect to the index page
            return redirect(controllers.routes.HomeController.index(0));
        }
    }

    // public Result updateProjectSubmit(Long id) {
        
    //     // Retrieve the submitted form object (bind from the HTTP request)
    //     Form<Project> updateProjectForm = formFactory.form(Project.class).bindFromRequest();

    //     // Check for errors (based on constraints set in the Project class)
    //     if (updateProjectForm.hasErrors()) {
    //         // Display the form again by returning a bad request
    //         return badRequest(updateProject.render(id,updateProjectForm, User.getUserById(session().get("email"))));
    //     } else {
    //         // No errors found - extract the project detail from the form
    //         Project p = updateProjectForm.get();
    //         p.setId(id);
            
            
    //         //update (save) this product
    //         p.update();

    //         MultipartFormData data = request().body().asMultipartFormData();
    //         FilePart<File> image = data.getFile("upload");

    //         String saveImageMsg = saveFile(p.getId(), image);

    //         if(saveImageMsg.equals("/ no file")){
    //             flash("success", "Project " + p.getName() + " has been updated");
    //         } else{
    //             flash("success", "Project " + p.getName() + " has been  updated " + saveImageMsg);
    //         }

    //         // Redirect to the index page
    //         return redirect(controllers.routes.HomeController.index(0));
    //     }
    // }
}
