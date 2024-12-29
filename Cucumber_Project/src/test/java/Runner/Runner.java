package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Features/"},
glue= {"Step_Definaction"},
plugin= {"pretty", "html:target/Sumit.html"})
		

		
public class Runner extends AbstractTestNGCucumberTests {
	
	

}
