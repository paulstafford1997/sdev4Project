
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.Employee],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Employee",user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new Employee</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addEmployeeSubmit(), 'class-> "form-horizontal", 'role -> "form")/*6.105*/ {_display_(Seq[Any](format.raw/*6.107*/("""
        """),_display_(/*7.10*/CSRF/*7.14*/.formField),format.raw/*7.24*/("""

        """),_display_(/*9.10*/inputText(employeeForm("name"), '_label -> "Employee Name", 'class -> "form_control")),format.raw/*9.95*/("""
        """),_display_(/*10.10*/select(
            employeeForm("department.id"),
            options(Department.options),
            '_label -> "Department", '_default -> "-- Choose a Department --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*15.10*/("""

        """),_display_(/*17.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.75*/("""

        """),format.raw/*19.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">

        <div class="actions">
            <input type="submit" value="Add/Update Employee" class="btn btn-primary">
            <a href=""""),_display_(/*24.23*/routes/*24.29*/.HomeController.employee),format.raw/*24.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
        """)))}),format.raw/*28.10*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 01:07:29 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/addEmployee.scala.html
                  HASH: e16f3ddc973d8be7d7ec8f9bccde872c6c7b0351
                  MATRIX: 987->1|1121->64|1166->62|1193->80|1220->82|1253->107|1292->109|1323->114|1392->158|1500->257|1540->259|1576->269|1588->273|1618->283|1655->294|1760->379|1797->389|2063->634|2101->645|2187->710|2224->720|2487->956|2502->962|2547->986|2700->1108
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|42->10|47->15|49->17|49->17|51->19|56->24|56->24|56->24|60->28
                  -- GENERATED --
              */
          