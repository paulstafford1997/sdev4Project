
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

object updateEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateEmployeeForm: Form[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.80*/("""
"""),_display_(/*3.2*/main("Update employee", user)/*3.31*/{_display_(Seq[Any](format.raw/*3.32*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Employee</p>

"""),_display_(/*6.2*/form(action=routes.HomeController.updateEmployeeSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),format.raw/*8.33*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""
    """),_display_(/*10.6*/inputText(updateEmployeeForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.88*/("""

    
    """),format.raw/*13.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Employee" class="btn btn-primary">
        <a href=""""),_display_(/*19.19*/routes/*19.25*/.HomeController.index(0)),format.raw/*19.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*23.3*/("""
""")))}))
      }
    }
  }

  def render(id:Long,updateEmployeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateEmployeeForm,user)

  def f:((Long,Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateEmployeeForm,user) => apply(id,updateEmployeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 00:40:47 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/updateEmployee.scala.html
                  HASH: ea95956cab6553c7f968478c90577c2d397dba81
                  MATRIX: 995->1|1146->81|1191->79|1218->98|1255->127|1293->128|1320->129|1384->168|1532->308|1571->310|1603->343|1634->349|1646->353|1676->363|1708->369|1811->451|1849->462|2101->687|2116->693|2161->717|2294->820
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|45->13|51->19|51->19|51->19|55->23
                  -- GENERATED --
              */
          