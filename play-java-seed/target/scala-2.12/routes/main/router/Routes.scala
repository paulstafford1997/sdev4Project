
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paul/sdev4Project/sdev4Project/play-java-seed/conf/routes
// @DATE:Sun Mar 11 13:28:51 GMT 2018

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
  // @LINE:20
  LoginController_2: controllers.LoginController,
  // @LINE:25
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:20
    LoginController_2: controllers.LoginController,
    // @LINE:25
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProject""", """controllers.HomeController.addProject"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProductSubmit""", """controllers.HomeController.addProjectSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAddress""", """controllers.HomeController.addAddress"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAddressSubmit""", """controllers.HomeController.addAddressSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delAddress/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteAddress(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateAddress/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateAddress(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProjectSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProjectSubmit(id:Long)"""),
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
  private[this] lazy val controllers_HomeController_addProject2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProject")))
  )
  private[this] lazy val controllers_HomeController_addProject2_invoker = createInvoker(
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

  // @LINE:9
  private[this] lazy val controllers_HomeController_addProjectSubmit3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProductSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProjectSubmit3_invoker = createInvoker(
    HomeController_0.addProjectSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProjectSubmit",
      Nil,
      "POST",
      this.prefix + """addProductSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_addAddress4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAddress")))
  )
  private[this] lazy val controllers_HomeController_addAddress4_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_HomeController_addAddressSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAddressSubmit")))
  )
  private[this] lazy val controllers_HomeController_addAddressSubmit5_invoker = createInvoker(
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

  // @LINE:12
  private[this] lazy val controllers_HomeController_deleteProject6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProject6_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_HomeController_deleteAddress7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delAddress/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteAddress7_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_HomeController_updateProject8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProject8_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_HomeController_updateAddress9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateAddress/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateAddress9_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_HomeController_updateProjectSubmit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProjectSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProjectSubmit10_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_HomeController_projectDetails11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projectDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_projectDetails11_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_LoginController_login12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login12_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_LoginController_loginSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit13_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_LoginController_logout14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout14_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
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
    case controllers_HomeController_addProject2_route(params@_) =>
      call { 
        controllers_HomeController_addProject2_invoker.call(HomeController_0.addProject)
      }
  
    // @LINE:9
    case controllers_HomeController_addProjectSubmit3_route(params@_) =>
      call { 
        controllers_HomeController_addProjectSubmit3_invoker.call(HomeController_0.addProjectSubmit)
      }
  
    // @LINE:10
    case controllers_HomeController_addAddress4_route(params@_) =>
      call { 
        controllers_HomeController_addAddress4_invoker.call(HomeController_0.addAddress)
      }
  
    // @LINE:11
    case controllers_HomeController_addAddressSubmit5_route(params@_) =>
      call { 
        controllers_HomeController_addAddressSubmit5_invoker.call(HomeController_0.addAddressSubmit)
      }
  
    // @LINE:12
    case controllers_HomeController_deleteProject6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProject6_invoker.call(HomeController_0.deleteProject(id))
      }
  
    // @LINE:13
    case controllers_HomeController_deleteAddress7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteAddress7_invoker.call(HomeController_0.deleteAddress(id))
      }
  
    // @LINE:14
    case controllers_HomeController_updateProject8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProject8_invoker.call(HomeController_0.updateProject(id))
      }
  
    // @LINE:15
    case controllers_HomeController_updateAddress9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateAddress9_invoker.call(HomeController_0.updateAddress(id))
      }
  
    // @LINE:16
    case controllers_HomeController_updateProjectSubmit10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProjectSubmit10_invoker.call(HomeController_0.updateProjectSubmit(id))
      }
  
    // @LINE:18
    case controllers_HomeController_projectDetails11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_projectDetails11_invoker.call(HomeController_0.projectDetails(id))
      }
  
    // @LINE:20
    case controllers_LoginController_login12_route(params@_) =>
      call { 
        controllers_LoginController_login12_invoker.call(LoginController_2.login)
      }
  
    // @LINE:21
    case controllers_LoginController_loginSubmit13_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit13_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:22
    case controllers_LoginController_logout14_route(params@_) =>
      call { 
        controllers_LoginController_logout14_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:25
    case controllers_Assets_versioned15_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
