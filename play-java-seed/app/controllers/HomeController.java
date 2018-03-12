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
 * X00136814 Paul Stafford
 * X00139679 Conor Dillon
 * 
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

    public Result employee() {
        List<Employee> employeeList = Employee.findAll();
        return ok(employee.render(employeeList,User.getUserById(session().get("email"))));
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

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEmployee() {
        Form<Employee> employeeForm = formFactory.form(Employee.class);
        return ok(addEmployee.render(employeeForm,User.getUserById(session().get("email"))));
    }

    public Result addEmployeeSubmit() {
        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();
        

        if (newEmployeeForm.hasErrors()) {
            return badRequest(addEmployee.render(newEmployeeForm,User.getUserById(session().get("email"))));
            
        } 
        else {
            Employee newEmployee = newEmployeeForm.get();
            
            if (newEmployee.getId() == null) {
                newEmployee.save();
                flash("success", "Employee " + newEmployee.getName() + "was added");                
            }

            else {
                newEmployee.update();
                flash("success", "Employee " + newEmployee.getName() + " was updated");                
            }



            return redirect(controllers.routes.HomeController.employee());
        }
    }
    
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

    public Result deleteEmployee(Long id) {
        Employee.find.ref(id).delete();
        flash("success", "Employee has been deleted");

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
    public Result updateEmployee(Long id) {        
        Employee e;
        Form<Employee> employeeForm;

        try {
            e = Employee.find.byId(id);
            employeeForm = formFactory.form(Employee.class).fill(e);
        }
        catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addEmployee.render(employeeForm,User.getUserById(session().get("email"))));
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
            
            String mimeType = uploaded.getContentType(); 
            if (mimeType.startsWith("image/")) {
                String fileName = uploaded.getFilename();                
                
                File file = uploaded.getFile();
                
                IMOperation op = new IMOperation();
                
                op.addImage(file.getAbsolutePath());
                
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
        
        String mimeType = uploaded.getContentType(); 
        if (uploaded != null) {
            
            if (mimeType.startsWith("image/")) {
                
                String fileName = uploaded.getFilename();      
                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i+1);
                }
                
                File file = uploaded.getFile();
                
                File dir = new File("public/images/employeeImages");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                
                if(file.renameTo(new File("public/images/employeeImages/", id + "." + extension))) {
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
    }

    public Result updateProjectSubmit(Long id) {
        
        Form<Project> updateProjectForm = formFactory.form(Project.class).bindFromRequest();

        if (updateProjectForm.hasErrors()) {
            
            return badRequest(updateProject.render(id,updateProjectForm, User.getUserById(session().get("email"))));
        } else {
            Project p = updateProjectForm.get();
            p.setId(id);
            
            p.update();

            return redirect(controllers.routes.HomeController.index(0));
        }
    }

    public Result updateEmployeeSubmit(Long id) {
        
        Form<Employee> updateEmployeeForm = formFactory.form(Employee.class).bindFromRequest();

        if (updateEmployeeForm.hasErrors()) {
            
            return badRequest(updateEmployee.render(id,updateEmployeeForm, User.getUserById(session().get("email"))));
        } else {
            Employee e = updateEmployeeForm.get();
            e.setId(id);
            
            e.update();

            return redirect(controllers.routes.HomeController.index(0));
        }
    }

    public Result updateAddressSubmit(Long id) {
        
        Form<Address> updateAddressForm = formFactory.form(Address.class).bindFromRequest();

        if (updateAddressForm.hasErrors()) {
            return badRequest(updateAddress.render(id,updateAddressForm, User.getUserById(session().get("email"))));
        } else {
        
            Address ad = updateAddressForm.get();
            ad.setId(id);
            
            ad.update();

            return redirect(controllers.routes.HomeController.index(0));
        }
    }

    public Result updateDepartmentSubmit(Long id) {
        
        Form<Department> updateDepartmentForm = formFactory.form(Department.class).bindFromRequest();

        if (updateDepartmentForm.hasErrors()) {
            return badRequest(updateDepartment.render(id,updateDepartmentForm, User.getUserById(session().get("email"))));
        } else {
            Department dep = updateDepartmentForm.get();
            dep.setId(id);
            
            dep.update();
            return redirect(controllers.routes.HomeController.index(0));
        }
    }

}
