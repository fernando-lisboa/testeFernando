package fernando.teste.alelo.commons;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web {


	public static WebDriver createChrome() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeDriver/chromedriver");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.get("http://google.com.br");
		navegador.manage().window().maximize();

		

		return navegador;
	}

	
	public static void Espera(WebDriver navegador, WebElement element) {
		navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(navegador, 10000);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
