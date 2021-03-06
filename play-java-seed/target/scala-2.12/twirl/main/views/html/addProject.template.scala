
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectForm: Form[models.Project], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Project",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new project</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProjectSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(projectForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.85*/("""

        """),_display_(/*15.10*/inputText(projectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*15.74*/("""
        
        """),format.raw/*17.9*/("""<br><br>
        <div class="actions">
            <input type="submit" value="Add Project" class="btn btn-primary">
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.HomeController.index(0)),format.raw/*20.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*24.6*/("""
""")))}))
      }
    }
  }

  def render(projectForm:Form[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,user)

  def f:((Form[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,user) => apply(projectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 00:58:55 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/addProject.scala.html
                  HASH: d54677ea304804db3e1d64421b18f067755bfc74
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1387->155|1543->303|1582->305|1619->342|1656->352|1669->356|1700->366|1738->377|1834->452|1872->463|1957->527|2002->545|2168->684|2183->690|2228->714|2376->832
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|47->15|47->15|49->17|52->20|52->20|52->20|56->24
                  -- GENERATED --
              */
          