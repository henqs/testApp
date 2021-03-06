
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE HTML>
<!--
	PVT 15 - Grupp 11
	OBS: För att kunna se login-knappen behöver man ansluta från en URL som är specificerad i Facebooks
	egen apputvecklingsmiljö. Jag kör för tillfället på http://people.dsv.su.se/~axna8273/login.html som
	hemsida. På den syns knappen men inte CSS:en. Använder den för att testa funktionalitet.
-->
<html>
	<head>
		<title>Festivalkampen</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
	    <script  src=""""),_display_(/*15.21*/routes/*15.27*/.Assets.at("/javascripts/jquery.min.js")),format.raw/*15.67*/(""""></script>
		<script  src=""""),_display_(/*16.18*/routes/*16.24*/.Assets.at("/javascripts/jquery.dropotron.min.js")),format.raw/*16.74*/(""""></script>
		<script  src=""""),_display_(/*17.18*/routes/*17.24*/.Assets.at("/javascripts/skel.min.js")),format.raw/*17.62*/(""""></script>
		<script  src=""""),_display_(/*18.18*/routes/*18.24*/.Assets.at("/javascripts/skel-layers.min.js")),format.raw/*18.69*/(""""></script>
		<script  src=""""),_display_(/*19.18*/routes/*19.24*/.Assets.at("/javascripts/init.js")),format.raw/*19.58*/(""""></script>
		<script  src=""""),_display_(/*20.18*/routes/*20.24*/.Assets.at("/javascripts/facebookSDK.js")),format.raw/*20.65*/(""""></script>
		<script>
		window.fbAsyncInit = function() """),format.raw/*22.35*/("""{"""),format.raw/*22.36*/("""
			"""),format.raw/*23.4*/("""FB.init("""),format.raw/*23.12*/("""{"""),format.raw/*23.13*/("""
				"""),format.raw/*24.5*/("""appId      : '909582695765355',
				cookie     : true,  // enable cookies to allow the server to access 
									// the session
				xfbml      : true,  // parse social plugins on this page
				version    : 'v2.2' // use version 2.2
			"""),format.raw/*29.4*/("""}"""),format.raw/*29.5*/(""");
	
			FB.Event.subscribe('auth.login', function()"""),format.raw/*31.47*/("""{"""),format.raw/*31.48*/("""
			"""),format.raw/*32.4*/("""window.location.href = """"),_display_(/*32.29*/routes/*32.35*/.Application.index()),format.raw/*32.55*/("""";
			"""),format.raw/*33.4*/("""}"""),format.raw/*33.5*/(""");
			// Now that we've initialized the JavaScript SDK, we call 
			// FB.getLoginStatus().  This function gets the state of the
			// person visiting this page and can return one of three states to
			// the callback you provide.  They can be:
			//
			// 1. Logged into your app ('connected')
			// 2. Logged into Facebook, but not your app ('not_authorized')
			// 3. Not logged into Facebook and can't tell if they are logged into
			//    your app or not.
			//
			// These three cases are handled in the callback function.

			FB.getLoginStatus(function(response) """),format.raw/*46.41*/("""{"""),format.raw/*46.42*/("""
				"""),format.raw/*47.5*/("""statusChangeCallback(response);
				if (response.status === 'connected') """),format.raw/*48.42*/("""{"""),format.raw/*48.43*/("""
					"""),format.raw/*49.6*/("""// Logged into your app and Facebook.
					console.log('Logged in!');
					window.location = """"),_display_(/*51.26*/routes/*51.32*/.Application.index()),format.raw/*51.52*/("""";
				"""),format.raw/*52.5*/("""}"""),format.raw/*52.6*/(""" """),format.raw/*52.7*/("""else if (response.status === 'not_authorized') """),format.raw/*52.54*/("""{"""),format.raw/*52.55*/("""
					"""),format.raw/*53.6*/("""// The person is logged into Facebook, but not your app.
				"""),format.raw/*54.5*/("""}"""),format.raw/*54.6*/(""" """),format.raw/*54.7*/("""else """),format.raw/*54.12*/("""{"""),format.raw/*54.13*/("""
					"""),format.raw/*55.6*/("""// The person is not logged into Facebook, so we're not sure if
					// they are logged into this app or not.
				"""),format.raw/*57.5*/("""}"""),format.raw/*57.6*/("""
			"""),format.raw/*58.4*/("""}"""),format.raw/*58.5*/(""");
		"""),format.raw/*59.3*/("""}"""),format.raw/*59.4*/(""";
	</script>
	</head>
	<body class="login-page">

		<!-- Header -->
			<div id="header-wrapper">
				<header id="header" class="container">
				
					<!-- Logo -->
						<div id="logo">
							<h1><a href=""""),_display_(/*70.22*/routes/*70.28*/.Application.index()),format.raw/*70.48*/("""">Festivalkampen</a></h1>
							<span>av Grupp 11</span>
						</div>
					
					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li><a href=""""),_display_(/*77.23*/routes/*77.29*/.Application.index()),format.raw/*77.49*/("""">Välkommen</a></li>
								<li>
									<a href="">Spel</a>
									<ul>
										<li><a href="#">Meny steg 1.1</a></li>
										<li><a href="#">Meny steg 1.2</a></li>
										<li>
											<a href="">Undermeny steg2</a>
											<ul>
												<li><a href="#">Test3.1</a></li>
												<li><a href="#">Test3.2</a></li>
											</ul>
									</ul>
								</li>
								<li><a href=""""),_display_(/*91.23*/routes/*91.29*/.Application.gruppSida()),format.raw/*91.53*/("""">Gruppsida</a></li>
								<li><a href=""""),_display_(/*92.23*/routes/*92.29*/.Application.kontakta()),format.raw/*92.52*/("""">Kontakta oss</a></li>
							</ul>
						</nav>
					
				</header>
			</div>
		
		<!-- Main -->
			<div id="main-wrapper">
				<div class="container">
					<div class="row 200%">
						<div class="8u">
							<div id="login">
								<!-- Content -->
									<article>
										
										<h2>Logga in</h2>
										<p>För att kunna delta i Festivalkampen behöver du logga in med ditt Facebook-konto</p>
										<fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
										</fb:login-button>
										<p>Om du inte har ett Facebook-konto kan du skapa ett <a href="http://www.facebook.com">här</a>
									</article>
							</div>
						</div>
					</div>
				</div>
			</div>

		<!-- Footer -->
			<div id="footer-wrapper">
				<footer id="footer" class="container">
					<div class="row">
						<div class="3u">
						
							<!-- Links -->
								<section class="widget links">
									<h3>Vad som helst1</h3>
									<ul class="style2">
										<li><a href="#">Text alt. l�nk - rad1, kolumn 1</a></li>
										<li>Text alt. l�nk - rad2, kolumn 1</li>
										<li>Text alt. l�nk - rad3, kolumn 1</li>
									</ul>
								</section>
						
						</div>
						<div class="3u">
						
							<!-- Links -->
								<section class="widget links">
									<h3>Vad som helst2</h3>
									<ul class="style2">
										<li><a href="#">Text alt. l�nk - rad1, kolumn 2</a></li>
										<li>Text alt. l�nk - rad2, kolumn 2</li>
									</ul>
								</section>
						
						</div>
						<div class="3u">
						
							<!-- Links -->
								<section class="widget links">
									<h3>Vad som helst3</h3>
									<ul class="style2">
										<li><a href="#">Text alt. l�nk - rad1, kolumn 3</a></li>
									</ul>
								</section>
						
						</div>
						<div class="3u">
						
							<!-- Contact -->
								<section class="widget contact last">
									<h3><a name=""""),_display_(/*164.24*/routes/*164.30*/.Application.kontakta()),format.raw/*164.53*/(""""> Kontakta oss</a></h3>
									<ul>
										<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
										<li><a href="http://facebook.com/festivalkampen" class="icon fa-facebook" target="_blank"><span class="label">Facebook</span></a></li>
										<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
									</ul>
									<p>Stockholms Universitet<br />
									Borgarfjordsgatan 12, 164 55 Kista<br />
									Sweden</p>
								</section>
						
						</div>
					</div>
					<div class="row">
						<div class="12u">
							<div id="copyright">
								<ul class="menu">
									<li>&copy; Festivalkampen. All rights reserved</li><li>Grupp 11</li>
								</ul>
							</div>
						</div>
					</div>
				</footer>
			</div>

	</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 12 11:38:42 CEST 2015
                  SOURCE: C:/Users/svett_000/Documents/GitHub/testApp/app/views/login.scala.html
                  HASH: 7caca1a9440322e434c7885dd9b0f584f10f68d1
                  MATRIX: 798->0|1456->631|1471->637|1532->677|1588->706|1603->712|1674->762|1730->791|1745->797|1804->835|1860->864|1875->870|1941->915|1997->944|2012->950|2067->984|2123->1013|2138->1019|2200->1060|2285->1117|2314->1118|2345->1122|2381->1130|2410->1131|2442->1136|2705->1372|2733->1373|2812->1424|2841->1425|2872->1429|2924->1454|2939->1460|2980->1480|3013->1486|3041->1487|3639->2057|3668->2058|3700->2063|3801->2136|3830->2137|3863->2143|3985->2238|4000->2244|4041->2264|4075->2271|4103->2272|4131->2273|4206->2320|4235->2321|4268->2327|4356->2388|4384->2389|4412->2390|4445->2395|4474->2396|4507->2402|4648->2516|4676->2517|4707->2521|4735->2522|4767->2527|4795->2528|5029->2735|5044->2741|5085->2761|5262->2911|5277->2917|5318->2937|5751->3343|5766->3349|5811->3373|5881->3416|5896->3422|5940->3445|7891->5368|7907->5374|7952->5397
                  LINES: 29->1|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|50->22|50->22|51->23|51->23|51->23|52->24|57->29|57->29|59->31|59->31|60->32|60->32|60->32|60->32|61->33|61->33|74->46|74->46|75->47|76->48|76->48|77->49|79->51|79->51|79->51|80->52|80->52|80->52|80->52|80->52|81->53|82->54|82->54|82->54|82->54|82->54|83->55|85->57|85->57|86->58|86->58|87->59|87->59|98->70|98->70|98->70|105->77|105->77|105->77|119->91|119->91|119->91|120->92|120->92|120->92|192->164|192->164|192->164
                  -- GENERATED --
              */
          