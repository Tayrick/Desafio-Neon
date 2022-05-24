package utils;

import static commons.ConexaoApp.driver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.Scenario;


public class Utils {

	//Metodo para realizar scroll no select de estado, ao cadastrar novo cliente
	@SuppressWarnings("rawtypes")
	public static void scrollPage() throws Exception {
		Thread.sleep(2000);
		(new TouchAction(driver)).press(PointOption.point(871, 1636)).moveTo(PointOption.point(866, 1004)).release()
				.perform();
	}
	
	//Metodo para gerar screenshot`s
	public static void capturarScreenshot(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    scenario.attach(screenshot, "image/png", "evidencia");
	}

	public static void filecreation(String phathFile, String contents) throws IOException {

		OutputStreamWriter bufferOut = new OutputStreamWriter(
				new FileOutputStream(phathFile), "UTF-8");

		bufferOut.write(contents);
		bufferOut.close();
	}
	
}
