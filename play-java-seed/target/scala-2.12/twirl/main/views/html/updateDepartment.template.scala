
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

object updateDepartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateDepartmentForm: Form[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.84*/("""
"""),_display_(/*3.2*/main("Update department", user)/*3.33*/{_display_(Seq[Any](format.raw/*3.34*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Department</p>

"""),_display_(/*6.2*/form(action=routes.HomeController.updateDepartmentSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),format.raw/*8.33*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""
    """),_display_(/*10.6*/inputText(updateDepartmentForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.90*/("""

    
    """),format.raw/*13.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Department" class="btn btn-primary">
        <a href=""""),_display_(/*19.19*/routes/*19.25*/.HomeController.index(0)),format.raw/*19.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*23.3*/("""
""")))}))
      }
    }
  }

  def render(id:Long,updateDepartmentForm:Form[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateDepartmentForm,user)

  def f:((Long,Form[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateDepartmentForm,user) => apply(id,updateDepartmentForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 21:49:46 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/updateDepartment.scala.html
                  HASH: 48f0ca6e018e97c22c212a114c4ee4d2013798f9
                  MATRIX: 999->1|1154->85|1199->83|1226->102|1265->133|1303->134|1330->135|1396->176|1546->318|1585->320|1617->353|1648->359|1660->363|1690->373|1722->379|1827->463|1865->474|2119->701|2134->707|2179->731|2312->834
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|45->13|51->19|51->19|51->19|55->23
                  -- GENERATED --
              */
          