
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

object address extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(address: List[models.Address], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/main("Address",user)/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

"""),format.raw/*5.1*/("""<p class="lead">Addresses</p>

"""),_display_(/*7.2*/if(flash.containsKey("success"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
  """),format.raw/*8.3*/("""<div class="alert alert-success">
    """),_display_(/*9.6*/flash/*9.11*/.get("success")),format.raw/*9.26*/("""
  """),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>ID</th>
      <th>House/Apartment Number</th>
      <th>Street</th>
      <th>Town</th>
      <th>Province</th>
      <th>Postcode</th>
      <th colspan="2"></th>      
    </tr>
  </thead>

  <tbody>
    """),_display_(/*28.6*/for(a<-address) yield /*28.21*/ {_display_(Seq[Any](format.raw/*28.23*/("""
      """),format.raw/*29.7*/("""<tr>
        <td class="numeric">"""),_display_(/*30.30*/a/*30.31*/.getId),format.raw/*30.37*/("""</td>
        <td>"""),_display_(/*31.14*/a/*31.15*/.getHouseNum),format.raw/*31.27*/("""</td>
        <td>"""),_display_(/*32.14*/a/*32.15*/.getStreet),format.raw/*32.25*/("""</td>
        <td>"""),_display_(/*33.14*/a/*33.15*/.getTown),format.raw/*33.23*/("""</td>
        <td>"""),_display_(/*34.14*/a/*34.15*/.getProvince),format.raw/*34.27*/("""</td>
        <td>"""),_display_(/*35.14*/a/*35.15*/.getPostcode),format.raw/*35.27*/("""</td>
        
        <td>
          <a href=""""),_display_(/*38.21*/routes/*38.27*/.HomeController.updateAddress(a.getId)),format.raw/*38.65*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*43.21*/routes/*43.27*/.HomeController.deleteAddress(a.getId)),format.raw/*43.65*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*48.6*/("""
  """),format.raw/*49.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*53.13*/routes/*53.19*/.HomeController.addAddress()),format.raw/*53.47*/("""">
    <button class="btn btn-primary">Add an Address</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(address:List[models.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(address,user)

  def f:((List[models.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (address,user) => apply(address,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 16:08:17 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/address.scala.html
                  HASH: 292c4dd811e9f41f8366011c3facbc9ebe0ef79b
                  MATRIX: 982->1|1133->57|1161->60|1189->80|1228->82|1256->84|1313->116|1353->148|1392->150|1421->153|1485->192|1498->197|1533->212|1563->215|1601->223|1630->225|1958->527|1989->542|2029->544|2063->551|2124->585|2134->586|2161->592|2207->611|2217->612|2250->624|2296->643|2306->644|2337->654|2383->673|2393->674|2422->682|2468->701|2478->702|2511->714|2557->733|2567->734|2600->746|2675->794|2690->800|2749->838|2933->995|2948->1001|3007->1039|3206->1208|3236->1211|3298->1246|3313->1252|3362->1280
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|70->38|70->38|70->38|75->43|75->43|75->43|80->48|81->49|85->53|85->53|85->53
                  -- GENERATED --
              */
          