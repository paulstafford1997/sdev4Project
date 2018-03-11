
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paul/sdev4Project/sdev4Project/play-java-seed/conf/routes
// @DATE:Sun Mar 11 13:28:51 GMT 2018

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

  
    // @LINE:8
    def addProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProject")
    }
  
    // @LINE:12
    def deleteProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:16
    def updateProjectSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateProjectSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:14
    def updateProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:18
    def projectDetails(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "projectDetails/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:7
    def address(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "address")
    }
  
    // @LINE:10
    def addAddress(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addAddress")
    }
  
    // @LINE:13
    def deleteAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delAddress/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(cat:Long = 0L): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:9
    def addProjectSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProductSubmit")
    }
  
    // @LINE:15
    def updateAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateAddress/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:11
    def addAddressSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addAddressSubmit")
    }
  
  }

  // @LINE:20
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:22
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:20
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:25
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
