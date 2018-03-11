
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

object addAddress extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addressForm: Form[models.Address],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.61*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Address",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new address</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addAddressSubmit(), 'class-> "form-horizontal", 'role -> "form")/*6.104*/ {_display_(Seq[Any](format.raw/*6.106*/("""
        """),_display_(/*7.10*/CSRF/*7.14*/.formField),format.raw/*7.24*/("""

        """),_display_(/*9.10*/inputText(addressForm("houseNum"), '_label -> "House/Appartment Number", 'class -> "form_control")),format.raw/*9.108*/("""
        """),_display_(/*10.10*/inputText(addressForm("street"), '_label -> "Street Name", 'class -> "form_control")),format.raw/*10.94*/("""
        """),_display_(/*11.10*/inputText(addressForm("town"), '_label -> "Town", 'class -> "form_control")),format.raw/*11.85*/("""
        """),_display_(/*12.10*/inputText(addressForm("province"), '_label -> "Province", 'class -> "form_control")),format.raw/*12.93*/("""
        """),_display_(/*13.10*/inputText(addressForm("postcode"), '_label -> "Postcode", 'class -> "form_control")),format.raw/*13.93*/("""

        """),_display_(/*15.10*/inputText(addressForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*15.74*/("""

        """),format.raw/*17.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Address" class="btn btn-primary">
            <a href=""""),_display_(/*19.23*/routes/*19.29*/.HomeController.address),format.raw/*19.52*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
        """)))}),format.raw/*23.10*/("""
""")))}))
      }
    }
  }

  def render(addressForm:Form[models.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addressForm,user)

  def f:((Form[models.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addressForm,user) => apply(addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 20:23:32 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/addAddress.scala.html
                  HASH: 03770dde3e075b8dd2110bc3b740727e6f59a261
                  MATRIX: 985->1|1117->62|1162->60|1189->78|1216->80|1248->104|1287->106|1318->111|1386->154|1493->252|1533->254|1569->264|1581->268|1611->278|1648->289|1767->387|1804->397|1909->481|1946->491|2042->566|2079->576|2183->659|2220->669|2324->752|2362->763|2447->827|2484->837|2640->966|2655->972|2699->995|2852->1117
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|42->10|42->10|43->11|43->11|44->12|44->12|45->13|45->13|47->15|47->15|49->17|51->19|51->19|51->19|55->23
                  -- GENERATED --
              */
          