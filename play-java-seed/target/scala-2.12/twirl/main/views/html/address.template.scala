
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

"""),_display_(/*3.2*/main("Customers",user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

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
      <th>City</th>
      <th>Postcode</th>
      <th colspan="2"></th>      
    </tr>
  </thead>

  <tbody>
    """),_display_(/*29.6*/for(a<-address) yield /*29.21*/ {_display_(Seq[Any](format.raw/*29.23*/("""
      """),format.raw/*30.7*/("""<tr>
        <td class="numeric">"""),_display_(/*31.30*/a/*31.31*/.getId),format.raw/*31.37*/("""</td>
        <td>"""),_display_(/*32.14*/a/*32.15*/.getHouseNum),format.raw/*32.27*/("""</td>
        <td>"""),_display_(/*33.14*/a/*33.15*/.getStreet),format.raw/*33.25*/("""</td>
        <td>"""),_display_(/*34.14*/a/*34.15*/.getTown),format.raw/*34.23*/("""</td>
        <td>"""),_display_(/*35.14*/a/*35.15*/.getProvince),format.raw/*35.27*/("""</td>
        <td>"""),_display_(/*36.14*/a/*36.15*/.getCity),format.raw/*36.23*/("""</td>
        <td>"""),_display_(/*37.14*/a/*37.15*/.getPostcode),format.raw/*37.27*/("""</td>
        
        <td>
          <a href=""""),_display_(/*40.21*/routes/*40.27*/.HomeController.updateAddress(a.getId)),format.raw/*40.65*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*45.21*/routes/*45.27*/.HomeController.deleteAddress(a.getId)),format.raw/*45.65*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*50.6*/("""
  """),format.raw/*51.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*55.13*/routes/*55.19*/.HomeController.addAddress()),format.raw/*55.47*/("""">
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
                  DATE: Sun Mar 11 13:28:51 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/address.scala.html
                  HASH: fa6165bb9c23fa9247fac45f673668ab80bc3d25
                  MATRIX: 982->1|1133->57|1161->60|1191->82|1230->84|1258->86|1315->118|1355->150|1394->152|1423->155|1487->194|1500->199|1535->214|1565->217|1603->225|1632->227|1980->549|2011->564|2051->566|2085->573|2146->607|2156->608|2183->614|2229->633|2239->634|2272->646|2318->665|2328->666|2359->676|2405->695|2415->696|2444->704|2490->723|2500->724|2533->736|2579->755|2589->756|2618->764|2664->783|2674->784|2707->796|2782->844|2797->850|2856->888|3040->1045|3055->1051|3114->1089|3313->1258|3343->1261|3405->1296|3420->1302|3469->1330
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|61->29|61->29|61->29|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|72->40|72->40|72->40|77->45|77->45|77->45|82->50|83->51|87->55|87->55|87->55
                  -- GENERATED --
              */
          