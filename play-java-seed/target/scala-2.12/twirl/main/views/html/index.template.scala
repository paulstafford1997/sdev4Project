
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

"""),format.raw/*5.1*/("""<div class="row">
    <div class="col-sm-10">
        <table class="table table-bordered table-hover table-condensed">
          """),_display_(/*8.12*/if(flash.containsKey("success"))/*8.44*/ {_display_(Seq[Any](format.raw/*8.46*/("""
            """),format.raw/*9.13*/("""<div class="alert alert-success">
              """),_display_(/*10.16*/flash/*10.21*/.get("success")),format.raw/*10.36*/("""
            """),format.raw/*11.13*/("""</div>
          """)))}),format.raw/*12.12*/("""
          """),format.raw/*13.11*/("""<thead>
            <tr>
              <th>ID</th>
              <th>Employee</th>
              <th>Name</th>
              <th>No. Of Members</th>
              <th colspan="2"></th>      
            </tr>
          </thead>
    
          <tbody>
            """),_display_(/*24.14*/for(p<-projects) yield /*24.30*/ {_display_(Seq[Any](format.raw/*24.32*/("""
              """),format.raw/*25.15*/("""<tr>
                <td>"""),_display_(/*26.22*/p/*26.23*/.getEmployee),format.raw/*26.35*/("""</td>
                  """),_display_(/*27.20*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*27.108*/ {_display_(Seq[Any](format.raw/*27.110*/("""
                    """),format.raw/*28.21*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*28.76*/(p.getId + ".jpg")),format.raw/*28.94*/(""""/></td>
                """)))}/*29.19*/else/*29.24*/{_display_(Seq[Any](format.raw/*29.25*/("""
                    """),format.raw/*30.21*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
                """)))}),format.raw/*31.18*/("""
                """),format.raw/*32.17*/("""<td class="numeric">"""),_display_(/*32.38*/p/*32.39*/.getId),format.raw/*32.45*/("""</td>
                <td><a href=""""),_display_(/*33.31*/routes/*33.37*/.HomeController.projectDetails(p.getId)),format.raw/*33.76*/("""">
                    """),_display_(/*34.22*/p/*34.23*/.getName),format.raw/*34.31*/("""</td>
                   </a>
                <td>"""),_display_(/*36.22*/p/*36.23*/.getEmployee),format.raw/*36.35*/("""</td>
                <td>
                  <a href=""""),_display_(/*38.29*/routes/*38.35*/.HomeController.updateProject(p.getId)),format.raw/*38.73*/("""" class="button xs btn-danger">
                    <span class="glyphicon glyphicon-pencil"></span>
                  </a>
                </td>        <td>
                  <a href=""""),_display_(/*42.29*/routes/*42.35*/.HomeController.deleteProject(p.getId)),format.raw/*42.73*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span>
                  </a>
                </td>
              </tr>
            """)))}),format.raw/*47.14*/("""
          """),format.raw/*48.11*/("""</tbody>
    
        </table>
    
        <p>
          <a href=""""),_display_(/*53.21*/routes/*53.27*/.HomeController.addProject()),format.raw/*53.55*/("""">
            <button class="btn btn-primary">Add a project</button>
          </a>
        </p>
      </div>
    </div>

""")))}),format.raw/*60.2*/("""
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
                  DATE: Sun Mar 11 20:23:32 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/index.scala.html
                  HASH: c35252b55f9b10bc9e3cb45fc22118accbb6a70d
                  MATRIX: 1023->1|1236->118|1264->121|1293->142|1332->144|1360->146|1516->276|1556->308|1595->310|1635->323|1711->372|1725->377|1761->392|1802->405|1851->423|1890->434|2181->698|2213->714|2253->716|2296->731|2349->757|2359->758|2392->770|2444->795|2542->883|2583->885|2632->906|2714->961|2753->979|2798->1006|2811->1011|2850->1012|2899->1033|3021->1124|3066->1141|3114->1162|3124->1163|3151->1169|3214->1205|3229->1211|3289->1250|3340->1274|3350->1275|3379->1283|3457->1334|3467->1335|3500->1347|3582->1402|3597->1408|3656->1446|3869->1632|3884->1638|3943->1676|4183->1885|4222->1896|4317->1964|4332->1970|4381->1998|4535->2122
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|45->13|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|64->32|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|68->36|68->36|68->36|70->38|70->38|70->38|74->42|74->42|74->42|79->47|80->48|85->53|85->53|85->53|92->60
                  -- GENERATED --
              */
          