
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object updateProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProjectForm: Form[models.Project], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.78*/("""
"""),_display_(/*3.2*/main("Update project", user)/*3.30*/{_display_(Seq[Any](format.raw/*3.31*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Project</p>

"""),_display_(/*6.2*/form(action=routes.HomeController.updateProjectSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),format.raw/*8.33*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""
    """),_display_(/*10.6*/inputText(updateProjectForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.87*/("""
    """),_display_(/*11.6*/select(updateProjectForm("employee.id"),options(Employee.options),'_label -> "Employee", '_default -> "-- Choose an employee --", '_showConstraints -> false, 'class -> "form-control")),format.raw/*11.189*/("""     
    
    """),format.raw/*13.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Project" class="btn btn-primary">
        <a href=""""),_display_(/*19.19*/routes/*19.25*/.HomeController.index(0)),format.raw/*19.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*23.3*/("""
""")))}))
      }
    }
  }

  def render(id:Long,updateProjectForm:Form[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProjectForm,user)

  def f:((Long,Form[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProjectForm,user) => apply(id,updateProjectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 21:47:05 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/updateProject.scala.html
                  HASH: 23821f236977cc317a2ca4c1ad3996e9c79c265b
                  MATRIX: 993->1|1142->79|1187->77|1214->96|1250->124|1288->125|1315->126|1378->164|1525->303|1564->305|1596->338|1627->344|1639->348|1669->358|1701->364|1803->445|1835->451|2040->634|2082->649|2333->873|2348->879|2393->903|2526->1006
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|43->11|43->11|45->13|51->19|51->19|51->19|55->23
                  -- GENERATED --
              */
          