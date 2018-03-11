
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

object department extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(department: List[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""

"""),_display_(/*3.2*/main("Department",user)/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<p class="lead">Departments</p>

"""),_display_(/*7.2*/if(flash.containsKey("success"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
  """),format.raw/*8.3*/("""<div class="alert alert-success">
    """),_display_(/*9.6*/flash/*9.11*/.get("success")),format.raw/*9.26*/("""
  """),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th colspan="2"></th>      
    </tr>
  </thead>

  <tbody>
    """),_display_(/*24.6*/for(a<-department) yield /*24.24*/ {_display_(Seq[Any](format.raw/*24.26*/("""
      """),format.raw/*25.7*/("""<tr>
        <td class="numeric">"""),_display_(/*26.30*/a/*26.31*/.getId),format.raw/*26.37*/("""</td>
        <td>"""),_display_(/*27.14*/a/*27.15*/.getName),format.raw/*27.23*/("""</td>
        
        <td>
          <a href=""""),_display_(/*30.21*/routes/*30.27*/.HomeController.updateDepartment(a.getId)),format.raw/*30.68*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*35.21*/routes/*35.27*/.HomeController.deleteDepartment(a.getId)),format.raw/*35.68*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*40.6*/("""
  """),format.raw/*41.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*45.13*/routes/*45.19*/.HomeController.addDepartment()),format.raw/*45.50*/("""">
    <button class="btn btn-primary">Add a Department</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(department:List[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(department,user)

  def f:((List[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (department,user) => apply(department,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 20:23:32 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/department.scala.html
                  HASH: 71fb70193b3a40a96158a68fff3d6451cc5c8bfb
                  MATRIX: 988->1|1145->63|1173->66|1204->89|1243->91|1271->93|1330->127|1370->159|1409->161|1438->164|1502->203|1515->208|1550->223|1580->226|1618->234|1647->236|1867->430|1901->448|1941->450|1975->457|2036->491|2046->492|2073->498|2119->517|2129->518|2158->526|2233->574|2248->580|2310->621|2494->778|2509->784|2571->825|2770->994|2800->997|2862->1032|2877->1038|2929->1069
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|59->27|59->27|62->30|62->30|62->30|67->35|67->35|67->35|72->40|73->41|77->45|77->45|77->45
                  -- GENERATED --
              */
          