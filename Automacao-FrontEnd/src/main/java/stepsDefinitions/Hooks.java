package stepsDefinitions;

import static commons.ConexaoApp.conectarApp;
import static commons.ConexaoApp.fecharApp;
import static utils.Utils.capturarScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	
	//Executado antes de cada cenario na feature
	@Before
	public void setUp() throws Exception {
		conectarApp();
	}
	
	//Executado depois de cada cenario na feature
	@After
	public void closeApp(Scenario scenario) throws Exception {
		capturarScreenshot(scenario);
		fecharApp();
	}

}
