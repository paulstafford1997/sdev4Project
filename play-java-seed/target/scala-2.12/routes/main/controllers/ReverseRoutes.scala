
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paul/sdev4Project/sdev4Project/play-java-seed/conf/routes
// @DATE:Mon Mar 12 00:05:59 GMT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def addProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProject")
    }
  
    // @LINE:24
    def updateDepartment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateDepartment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:23
    def updateEmployee(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:18
    def deleteProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:29
    def updateDepartmentSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateDepartmentSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:26
    def updateProjectSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateProjectSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:22
    def updateProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:9
    def employee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee")
    }
  
    // @LINE:31
    def projectDetails(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "projectDetails/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:13
    def addEmployeeSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addEmployeeSubmit")
    }
  
    // @LINE:7
    def address(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "address")
    }
  
    // @LINE:28
    def updateAddressSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateAddressSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:8
    def department(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "department")
    }
  
    // @LINE:14
    def addAddress(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addAddress")
    }
  
    // @LINE:17
    def addDepartmentSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addDepartmentSubmit")
    }
  
    // @LINE:21
    def deleteDepartment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delDepartment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:20
    def deleteAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delAddress/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:19
    def deleteEmployee(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(cat:Long = 0L): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:11
    def addEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addEmployee")
    }
  
    // @LINE:27
    def updateEmployeeSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateEmployeeSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:12
    def addProjectSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProjectSubmit")
    }
  
    // @LINE:25
    def updateAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateAddress/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:16
    def addDepartment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addDepartment")
    }
  
    // @LINE:15
    def addAddressSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addAddressSubmit")
    }
  
  }

  // @LINE:33
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:35
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:33
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:38
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
