
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

object projectDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.Project,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: models.Project,user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""

"""),_display_(/*3.2*/main("Full Image", user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

  """),format.raw/*5.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      <!-- """),_display_(/*7.13*/if(flash.containsKey("success"))/*7.45*/ {_display_(Seq[Any](format.raw/*7.47*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
          """),_display_(/*9.12*/flash/*9.17*/.get("success")),format.raw/*9.32*/("""
        """),format.raw/*10.9*/("""</div>
      """)))}),format.raw/*11.8*/(""" """),format.raw/*11.9*/("""-->
      <thead>
        <tr>
          <th>ID</th> 
          <th>Name</th>
          <th>Employee</th>
          <th colspan="2"></th>  
        </tr>
      </thead>

      <tbody>
            <tr>
                <td class="numeric">"""),_display_(/*23.38*/p/*23.39*/.getId),format.raw/*23.45*/("""</td>
                <td><a href=""""),_display_(/*24.31*/routes/*24.37*/.HomeController.projectDetails(p.getId)),format.raw/*24.76*/("""">
                    """),_display_(/*25.22*/p/*25.23*/.getName),format.raw/*25.31*/("""</td>
                    </a>
                <td>"""),_display_(/*27.22*/p/*27.23*/.getEmployee),format.raw/*27.35*/("""</td>
                <td>
                    <a href=""""),_display_(/*29.31*/routes/*29.37*/.HomeController.updateProject(p.getId)),format.raw/*29.75*/("""" class="button xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                </td>      
                <td>
                    <a href=""""),_display_(/*34.31*/routes/*34.37*/.HomeController.deleteProject(p.getId)),format.raw/*34.75*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                      <span class="glyphicon glyphicon-trash"></span>
                    </a>
                </td>
            </tr>
        
      </tbody>

    </table>

    
  </div>
</div>
""")))}),format.raw/*47.2*/("""
"""))
      }
    }
  }

  def render(p:models.Project,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(p,user,env)

  def f:((models.Project,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (p,user,env) => apply(p,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 20:23:32 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/projectDetails.scala.html
                  HASH: 10a0e77b5193237854b9ce883b506a6b8737449f
                  MATRIX: 1004->1|1168->70|1196->73|1228->97|1267->99|1297->103|1428->208|1468->240|1507->242|1542->251|1613->296|1626->301|1661->316|1697->325|1741->339|1769->340|2034->578|2044->579|2071->585|2134->621|2149->627|2209->666|2260->690|2270->691|2299->699|2378->751|2388->752|2421->764|2505->821|2520->827|2579->865|2813->1072|2828->1078|2887->1116|3176->1375
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|43->11|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|59->27|59->27|59->27|61->29|61->29|61->29|66->34|66->34|66->34|79->47
                  -- GENERATED --
              */
          