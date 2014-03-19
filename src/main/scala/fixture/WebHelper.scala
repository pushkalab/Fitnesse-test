package fixture

import org.scalatest.selenium.WebBrowser
import org.scalatest.{FlatSpec, ShouldMatchers}
import org.openqa.selenium.WebDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.chrome.ChromeDriver

/**
 * Created by pushkala on 3/19/14.
 */
class WebHelper extends WebBrowser {

  System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver")


implicit val webDriver:WebDriver = new ChromeDriver()

  val host ="http://www.google.com"
  def open (url : String){
    go to (url)
  }
  def titlePage:String ={
    pageTitle
  }
  def tearDown:Unit={
    quit()
  }


}
