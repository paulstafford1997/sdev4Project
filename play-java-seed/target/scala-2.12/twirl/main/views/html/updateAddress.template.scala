
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

object updateAddress extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateAddressForm: Form[models.Address], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.78*/("""
"""),_display_(/*3.2*/main("Update address", user)/*3.30*/{_display_(Seq[Any](format.raw/*3.31*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Address</p>

"""),_display_(/*6.2*/form(action=routes.HomeController.updateAddressSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),format.raw/*8.33*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""
    """),_display_(/*10.6*/inputText(updateAddressForm("houseNum"), '_label -> "House/Apartment Number", 'class -> "form-control")),format.raw/*10.109*/("""
    """),_display_(/*11.6*/inputText(updateAddressForm("street"), '_label -> "House/Apartment Number", 'class -> "form-control")),format.raw/*11.107*/("""
    """),_display_(/*12.6*/inputText(updateAddressForm("town"), '_label -> "House/Apartment Number", 'class -> "form-control")),format.raw/*12.105*/("""
    """),_display_(/*13.6*/inputText(updateAddressForm("province"), '_label -> "House/Apartment Number", 'class -> "form-control")),format.raw/*13.109*/("""
    """),_display_(/*14.6*/inputText(updateAddressForm("postcode"), '_label -> "House/Apartment Number", 'class -> "form-control")),format.raw/*14.109*/("""

    """),format.raw/*16.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Address" class="btn btn-primary">
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.HomeController.index(0)),format.raw/*22.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*26.3*/("""
""")))}))
      }
    }
  }

  def render(id:Long,updateAddressForm:Form[models.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateAddressForm,user)

  def f:((Long,Form[models.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateAddressForm,user) => apply(id,updateAddressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 21:47:05 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/updateAddress.scala.html
                  HASH: 1a1da959a7b00d61608325b38054c22f50ce1c00
                  MATRIX: 993->1|1142->79|1187->77|1214->96|1250->124|1288->125|1315->126|1378->164|1525->303|1564->305|1596->338|1627->344|1639->348|1669->358|1701->364|1826->467|1858->473|1981->574|2013->580|2134->679|2166->685|2291->788|2323->794|2448->897|2481->903|2732->1127|2747->1133|2792->1157|2925->1260
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|48->16|54->22|54->22|54->22|58->26
                  -- GENERATED --
              */
          