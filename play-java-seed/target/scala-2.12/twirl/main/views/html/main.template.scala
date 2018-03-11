
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Employee Management - """),_display_(/*9.35*/title),format.raw/*9.40*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Employee Details</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="Projects" )/*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""class="active"""")))}),format.raw/*26.60*/(""">
                    <a href="#">About Employees</a>
                </li>

                <li>
                    <a href="#">Departments</a>
                </li>

                <li><a href="address">Addresses</a></li>

                <li """),_display_(/*36.22*/if(title=="Login")/*36.40*/{_display_(Seq[Any](format.raw/*36.41*/("""class="active"""")))}),format.raw/*36.56*/(""">
                    """),_display_(/*37.22*/if(user != null)/*37.38*/ {_display_(Seq[Any](format.raw/*37.40*/("""
                        """),format.raw/*38.25*/("""<a href=""""),_display_(/*38.35*/routes/*38.41*/.LoginController.logout()),format.raw/*38.66*/("""">Logout """),_display_(/*38.76*/user/*38.80*/.getName()),format.raw/*38.90*/("""</a>
                    """)))}/*39.23*/else/*39.28*/{_display_(Seq[Any](format.raw/*39.29*/("""
                        """),format.raw/*40.25*/("""<a href=""""),_display_(/*40.35*/routes/*40.41*/.LoginController.login()),format.raw/*40.65*/("""">Login</a>
                    """)))}),format.raw/*41.22*/("""

                """),format.raw/*43.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*53.18*/content),format.raw/*53.25*/("""
            """),format.raw/*54.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Online Shop</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*68.19*/routes/*68.25*/.Assets.versioned("javascripts/main.js")),format.raw/*68.65*/(""""></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 16:09:00 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/main.scala.html
                  HASH: 4739b4c45119b29186ea350fa5097f271633bd4e
                  MATRIX: 970->1|1121->57|1149->59|1278->162|1303->167|1515->352|1530->358|1592->399|1928->708|1959->730|1998->731|2044->746|2319->994|2346->1012|2385->1013|2431->1028|2481->1051|2506->1067|2546->1069|2599->1094|2636->1104|2651->1110|2697->1135|2734->1145|2747->1149|2778->1159|2823->1186|2836->1191|2875->1192|2928->1217|2965->1227|2980->1233|3025->1257|3089->1290|3135->1308|3298->1444|3326->1451|3367->1464|3675->1745|3690->1751|3751->1791
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|58->26|58->26|58->26|58->26|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|73->41|75->43|85->53|85->53|86->54|100->68|100->68|100->68
                  -- GENERATED --
              */
          