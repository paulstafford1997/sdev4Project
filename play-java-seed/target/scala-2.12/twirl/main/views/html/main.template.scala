
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

                <li """),_display_(/*34.22*/if(title=="Login")/*34.40*/{_display_(Seq[Any](format.raw/*34.41*/("""class="active"""")))}),format.raw/*34.56*/(""">
                    """),_display_(/*35.22*/if(user != null)/*35.38*/ {_display_(Seq[Any](format.raw/*35.40*/("""
                        """),format.raw/*36.25*/("""<a href=""""),_display_(/*36.35*/routes/*36.41*/.LoginController.logout()),format.raw/*36.66*/("""">Logout """),_display_(/*36.76*/user/*36.80*/.getName()),format.raw/*36.90*/("""</a>
                    """)))}/*37.23*/else/*37.28*/{_display_(Seq[Any](format.raw/*37.29*/("""
                        """),format.raw/*38.25*/("""<a href=""""),_display_(/*38.35*/routes/*38.41*/.LoginController.login()),format.raw/*38.65*/("""">Login</a>
                    """)))}),format.raw/*39.22*/("""

                """),format.raw/*41.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*51.18*/content),format.raw/*51.25*/("""
            """),format.raw/*52.13*/("""</div>
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
    <script src=""""),_display_(/*66.19*/routes/*66.25*/.Assets.versioned("javascripts/main.js")),format.raw/*66.65*/(""""></script>
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
                  DATE: Sun Mar 11 14:50:22 GMT 2018
                  SOURCE: /home/paul/sdev4Project/sdev4Project/play-java-seed/app/views/main.scala.html
                  HASH: 0e9023a9943bfabd2df2b62308d7e0f25836ae2b
                  MATRIX: 970->1|1121->57|1149->59|1278->162|1303->167|1515->352|1530->358|1592->399|1928->708|1959->730|1998->731|2044->746|2261->936|2288->954|2327->955|2373->970|2423->993|2448->1009|2488->1011|2541->1036|2578->1046|2593->1052|2639->1077|2676->1087|2689->1091|2720->1101|2765->1128|2778->1133|2817->1134|2870->1159|2907->1169|2922->1175|2967->1199|3031->1232|3077->1250|3240->1386|3268->1393|3309->1406|3617->1687|3632->1693|3693->1733
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|58->26|58->26|58->26|58->26|66->34|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|71->39|73->41|83->51|83->51|84->52|98->66|98->66|98->66
                  -- GENERATED --
              */
          