import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom.document
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

import spa.client.logger._

@JSExport("SPAMain")
object SPAMain extends js.JSApp {

  @JSExport
  def main(): Unit = {
    //log.warn("Application starting")
    // send log messages also to the server
    //log.enableServerLogging("/logging")
    //log.info("This message goes to server as well")

    // create stylesheet
    //GlobalStyles.addToDocument()

    val NoArgs =
      ScalaComponent.static("No args")(<.div("Hello!"))

    val Hello =
      ScalaComponent.builder[String]("Hello")
        .render_P(name => <.div("Hello there ", name))
        .build

    // Usage
//    val body = ScalaComponent.static("Body")(<.div(
//      NoArgs(),
//      Hello("John"),
//      Hello("Jane")))
    NoArgs().renderIntoDOM(document.body)
  }
}
