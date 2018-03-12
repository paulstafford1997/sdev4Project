
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paul/sdev4Project/sdev4Project/play-java-seed/conf/routes
// @DATE:Mon Mar 12 00:05:59 GMT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:33
  LoginController_2: controllers.LoginController,
  // @LINE:38
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:33
    LoginController_2: controllers.LoginController,
    // @LINE:38
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """address""", """controllers.HomeController.address"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """department""", """controllers.HomeController.department"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee""", """controllers.HomeController.employee"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProject""", """controllers.HomeController.addProject"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployee""", """controllers.HomeController.addEmployee"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProjectSubmit""", """controllers.HomeController.addProjectSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployeeSubmit""", """controllers.HomeController.addEmployeeSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAddress""", """controllers.HomeController.addAddress"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAddressSubmit""", """controllers.HomeController.addAddressSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addDepartment""", """controllers.HomeController.addDepartment"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addDepartmentSubmit""", """controllers.HomeController.addDepartmentSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEmployee(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delAddress/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteAddress(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delDepartment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteDepartment(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEmployee(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateDepartment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateDepartment(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateAddress/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateAddress(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProjectSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProjectSubmit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployeeSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEmployeeSubmit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateAddressSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateAddressSubmit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateDepartmentSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateDepartmentSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projectDetails/""" + "$" + """id<[^/]+>""", """controllers.HomeController.projectDetails(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_address1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("address")))
  )
  private[this] lazy val controllers_HomeController_address1_invoker = createInvoker(
    HomeController_0.address,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "address",
      Nil,
      "GET",
      this.prefix + """address""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_department2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("department")))
  )
  private[this] lazy val controllers_HomeController_department2_invoker = createInvoker(
    HomeController_0.department,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "department",
      Nil,
      "GET",
      this.prefix + """department""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_employee3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee")))
  )
  private[this] lazy val controllers_HomeController_employee3_invoker = createInvoker(
    HomeController_0.employee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "employee",
      Nil,
      "GET",
      this.prefix + """employee""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_addProject4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProject")))
  )
  private[this] lazy val controllers_HomeController_addProject4_invoker = createInvoker(
    HomeController_0.addProject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProject",
      Nil,
      "GET",
      this.prefix + """addProject""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_addEmployee5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployee")))
  )
  private[this] lazy val controllers_HomeController_addEmployee5_invoker = createInvoker(
    HomeController_0.addEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployee",
      Nil,
      "GET",
      this.prefix + """addEmployee""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_addProjectSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProjectSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProjectSubmit6_invoker = createInvoker(
    HomeController_0.addProjectSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProjectSubmit",
      Nil,
      "POST",
      this.prefix + """addProjectSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_addEmployeeSubmit7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployeeSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEmployeeSubmit7_invoker = createInvoker(
    HomeController_0.addEmployeeSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployeeSubmit",
      Nil,
      "GET",
      this.prefix + """addEmployeeSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_addAddress8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAddress")))
  )
  private[this] lazy val controllers_HomeController_addAddress8_invoker = createInvoker(
    HomeController_0.addAddress,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addAddress",
      Nil,
      "GET",
      this.prefix + """addAddress""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_addAddressSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAddressSubmit")))
  )
  private[this] lazy val controllers_HomeController_addAddressSubmit9_invoker = createInvoker(
    HomeController_0.addAddressSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addAddressSubmit",
      Nil,
      "POST",
      this.prefix + """addAddressSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_addDepartment10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addDepartment")))
  )
  private[this] lazy val controllers_HomeController_addDepartment10_invoker = createInvoker(
    HomeController_0.addDepartment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addDepartment",
      Nil,
      "GET",
      this.prefix + """addDepartment""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_addDepartmentSubmit11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addDepartmentSubmit")))
  )
  private[this] lazy val controllers_HomeController_addDepartmentSubmit11_invoker = createInvoker(
    HomeController_0.addDepartmentSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addDepartmentSubmit",
      Nil,
      "POST",
      this.prefix + """addDepartmentSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_deleteProject12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProject12_invoker = createInvoker(
    HomeController_0.deleteProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_deleteEmployee13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEmployee13_invoker = createInvoker(
    HomeController_0.deleteEmployee(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteEmployee",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_deleteAddress14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delAddress/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteAddress14_invoker = createInvoker(
    HomeController_0.deleteAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteAddress",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delAddress/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_deleteDepartment15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delDepartment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteDepartment15_invoker = createInvoker(
    HomeController_0.deleteDepartment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteDepartment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delDepartment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_updateProject16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProject16_invoker = createInvoker(
    HomeController_0.updateProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_updateEmployee17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEmployee17_invoker = createInvoker(
    HomeController_0.updateEmployee(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEmployee",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_updateDepartment18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateDepartment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateDepartment18_invoker = createInvoker(
    HomeController_0.updateDepartment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateDepartment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateDepartment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_updateAddress19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateAddress/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateAddress19_invoker = createInvoker(
    HomeController_0.updateAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateAddress",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateAddress/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_updateProjectSubmit20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProjectSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProjectSubmit20_invoker = createInvoker(
    HomeController_0.updateProjectSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProjectSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """updateProjectSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_updateEmployeeSubmit21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployeeSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEmployeeSubmit21_invoker = createInvoker(
    HomeController_0.updateEmployeeSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEmployeeSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """updateEmployeeSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_updateAddressSubmit22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateAddressSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateAddressSubmit22_invoker = createInvoker(
    HomeController_0.updateAddressSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateAddressSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """updateAddressSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_updateDepartmentSubmit23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateDepartmentSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateDepartmentSubmit23_invoker = createInvoker(
    HomeController_0.updateDepartmentSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateDepartmentSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """updateDepartmentSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_projectDetails24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projectDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_projectDetails24_invoker = createInvoker(
    HomeController_0.projectDetails(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "projectDetails",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """projectDetails/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_LoginController_login25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login25_invoker = createInvoker(
    LoginController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_LoginController_loginSubmit26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit26_invoker = createInvoker(
    LoginController_2.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_LoginController_logout27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout27_invoker = createInvoker(
    LoginController_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Assets_versioned28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned28_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_index0_invoker.call(HomeController_0.index(cat))
      }
  
    // @LINE:7
    case controllers_HomeController_address1_route(params@_) =>
      call { 
        controllers_HomeController_address1_invoker.call(HomeController_0.address)
      }
  
    // @LINE:8
    case controllers_HomeController_department2_route(params@_) =>
      call { 
        controllers_HomeController_department2_invoker.call(HomeController_0.department)
      }
  
    // @LINE:9
    case controllers_HomeController_employee3_route(params@_) =>
      call { 
        controllers_HomeController_employee3_invoker.call(HomeController_0.employee)
      }
  
    // @LINE:10
    case controllers_HomeController_addProject4_route(params@_) =>
      call { 
        controllers_HomeController_addProject4_invoker.call(HomeController_0.addProject)
      }
  
    // @LINE:11
    case controllers_HomeController_addEmployee5_route(params@_) =>
      call { 
        controllers_HomeController_addEmployee5_invoker.call(HomeController_0.addEmployee)
      }
  
    // @LINE:12
    case controllers_HomeController_addProjectSubmit6_route(params@_) =>
      call { 
        controllers_HomeController_addProjectSubmit6_invoker.call(HomeController_0.addProjectSubmit)
      }
  
    // @LINE:13
    case controllers_HomeController_addEmployeeSubmit7_route(params@_) =>
      call { 
        controllers_HomeController_addEmployeeSubmit7_invoker.call(HomeController_0.addEmployeeSubmit)
      }
  
    // @LINE:14
    case controllers_HomeController_addAddress8_route(params@_) =>
      call { 
        controllers_HomeController_addAddress8_invoker.call(HomeController_0.addAddress)
      }
  
    // @LINE:15
    case controllers_HomeController_addAddressSubmit9_route(params@_) =>
      call { 
        controllers_HomeController_addAddressSubmit9_invoker.call(HomeController_0.addAddressSubmit)
      }
  
    // @LINE:16
    case controllers_HomeController_addDepartment10_route(params@_) =>
      call { 
        controllers_HomeController_addDepartment10_invoker.call(HomeController_0.addDepartment)
      }
  
    // @LINE:17
    case controllers_HomeController_addDepartmentSubmit11_route(params@_) =>
      call { 
        controllers_HomeController_addDepartmentSubmit11_invoker.call(HomeController_0.addDepartmentSubmit)
      }
  
    // @LINE:18
    case controllers_HomeController_deleteProject12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProject12_invoker.call(HomeController_0.deleteProject(id))
      }
  
    // @LINE:19
    case controllers_HomeController_deleteEmployee13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteEmployee13_invoker.call(HomeController_0.deleteEmployee(id))
      }
  
    // @LINE:20
    case controllers_HomeController_deleteAddress14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteAddress14_invoker.call(HomeController_0.deleteAddress(id))
      }
  
    // @LINE:21
    case controllers_HomeController_deleteDepartment15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteDepartment15_invoker.call(HomeController_0.deleteDepartment(id))
      }
  
    // @LINE:22
    case controllers_HomeController_updateProject16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProject16_invoker.call(HomeController_0.updateProject(id))
      }
  
    // @LINE:23
    case controllers_HomeController_updateEmployee17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEmployee17_invoker.call(HomeController_0.updateEmployee(id))
      }
  
    // @LINE:24
    case controllers_HomeController_updateDepartment18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateDepartment18_invoker.call(HomeController_0.updateDepartment(id))
      }
  
    // @LINE:25
    case controllers_HomeController_updateAddress19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateAddress19_invoker.call(HomeController_0.updateAddress(id))
      }
  
    // @LINE:26
    case controllers_HomeController_updateProjectSubmit20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProjectSubmit20_invoker.call(HomeController_0.updateProjectSubmit(id))
      }
  
    // @LINE:27
    case controllers_HomeController_updateEmployeeSubmit21_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEmployeeSubmit21_invoker.call(HomeController_0.updateEmployeeSubmit(id))
      }
  
    // @LINE:28
    case controllers_HomeController_updateAddressSubmit22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateAddressSubmit22_invoker.call(HomeController_0.updateAddressSubmit(id))
      }
  
    // @LINE:29
    case controllers_HomeController_updateDepartmentSubmit23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateDepartmentSubmit23_invoker.call(HomeController_0.updateDepartmentSubmit(id))
      }
  
    // @LINE:31
    case controllers_HomeController_projectDetails24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_projectDetails24_invoker.call(HomeController_0.projectDetails(id))
      }
  
    // @LINE:33
    case controllers_LoginController_login25_route(params@_) =>
      call { 
        controllers_LoginController_login25_invoker.call(LoginController_2.login)
      }
  
    // @LINE:34
    case controllers_LoginController_loginSubmit26_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit26_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:35
    case controllers_LoginController_logout27_route(params@_) =>
      call { 
        controllers_LoginController_logout27_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:38
    case controllers_Assets_versioned28_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned28_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
