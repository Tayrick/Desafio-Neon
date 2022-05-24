package commons;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class ConexaoApp {

	public static AppiumDriver<WebElement> driver;
	
	public static void conectarApp() throws Exception {
	
		//Criando a conexao com o emulador e configurando as capabilitys
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appium:appPackage", "br.com.dudstecnologia.cadastrodeclientes");
	    desiredCapabilities.setCapability("appium:appActivity", "br.com.dudstecnologia.cadastrodeclientes.MainClientes");
	    
	    driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	   
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public static void fecharApp() {
		driver.quit();
	}
}
