
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Project],List[models.Employee],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[models.Project], employees: List[models.Employee], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.119*/("""

"""),_display_(/*3.2*/main("Projects",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

  """),format.raw/*5.3*/("""<p class="lead">Projects</p>

<div class="row">
    <div class="col-sm-10">
        <table class="table table-bordered table-hover table-condensed">
          """),_display_(/*10.12*/if(flash.containsKey("success"))/*10.44*/ {_display_(Seq[Any](format.raw/*10.46*/("""
            """),format.raw/*11.13*/("""<div class="alert alert-success">
              """),_display_(/*12.16*/flash/*12.21*/.get("success")),format.raw/*12.36*/("""
            """),format.raw/*13.13*/("""</div>
          """)))}),format.raw/*14.12*/("""
          """),format.raw/*15.11*/("""<thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th colspan="2"></th>      
            </tr>
          </thead>
    
          <tbody>
            """),_display_(/*24.14*/for(p<-projects) yield /*24.30*/ {_display_(Seq[Any](format.raw/*24.32*/("""
              """),format.raw/*25.15*/("""<tr>
                <td class="numeric">"""),_display_(/*26.38*/p/*26.39*/.getId),format.raw/*26.45*/("""</td>
                <td><a href=""""),_display_(/*27.31*/routes/*27.37*/.HomeController.projectDetails(p.getId)),format.raw/*27.76*/("""">
                    """),_display_(/*28.22*/p/*28.23*/.getName),format.raw/*28.31*/("""</td>
                   </a>
                <td>
                  <a href=""""),_display_(/*31.29*/routes/*31.35*/.HomeController.updateProject(p.getId)),format.raw/*31.73*/("""" class="button xs btn-danger">
                    <span class="glyphicon glyphicon-pencil"></span>
                  </a>
                </td>        <td>
                  <a href=""""),_display_(/*35.29*/routes/*35.35*/.HomeController.deleteProject(p.getId)),format.raw/*35.73*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span>
                  </a>
                </td>
              </tr>
            """)))}),format.raw/*40.14*/("""
          """),format.raw/*41.11*/("""</tbody>
    
        </table>
    
        <p>
          <a href=""""),_display_(/*46.21*/routes/*46.27*/.HomeController.addProject()),format.raw/*46.55*/("""">
            <button class="btn btn-primary">Add a project</button>
          </a>
        </p>
      </div>
    </div>

""")))}),format.raw/*53.2*/("""
"""))
      }
    }
  }

  def render(projects:List[models.Project],employees:List[models.Employee],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(projects,employees,user,env)

  def f:((List[models.Project],List[models.Employee],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (projects,employees,user,env) => apply(projects,employees,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 00:54:06 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/index.scala.html
                  HASH: 87e1bdba09ca1bc7d309ddcfbbdc806909e425e4
                  MATRIX: 1023->1|1236->118|1264->121|1293->142|1332->144|1362->148|1549->308|1590->340|1630->342|1671->355|1747->404|1761->409|1797->424|1838->437|1887->455|1926->466|2147->660|2179->676|2219->678|2262->693|2331->735|2341->736|2368->742|2431->778|2446->784|2506->823|2557->847|2567->848|2596->856|2702->935|2717->941|2776->979|2989->1165|3004->1171|3063->1209|3303->1418|3342->1429|3437->1497|3452->1503|3501->1531|3655->1655
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|47->15|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|67->35|67->35|67->35|72->40|73->41|78->46|78->46|78->46|85->53
                  -- GENERATED --
              */
          