package fernando.teste.alelo.Teste;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber" }, 
			monochrome = true, 
			glue = {"fernando.teste.alelo.Teste"},
			features = {"src/main/resources/features/testeApi.feature" }, 
			//plugin = "br.com.fast.commons.util.extent.reports.ExtentCucumberFormatter:target/DetalhesDaFatura.html", 
			tags = {"@CT01.1"},
			snippets = cucumber.api.SnippetType.CAMELCASE
		)

public class TesteDeApiRunner {

}
