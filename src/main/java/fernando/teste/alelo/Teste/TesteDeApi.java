package fernando.teste.alelo.Teste;

import static org.junit.Assert.assertTrue;

import com.google.gson.reflect.TypeToken;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import fernando.teste.alelo.application.TestApplication;
import fernando.teste.alelo.dto.RetornoApi;

public class TesteDeApi {

	TestApplication call = new TestApplication<>();
	String step;
	private RetornoApi retornoChamada;
	private RetornoApi retornoEsperado;
	Object objects;

	@Dado("^que eu efetue um post na url \"([^\"]*)\"$")
	public void que_eu_efetue_um_post_na_url(String url) throws Throwable {
		step = "Post na URL informada";

		objects = call.apiCall(new TypeToken<RetornoApi>() {
		}.getType(), url);

	}

	@Entao("^eu devo validar a mensagen de retorno$")
	public void eu_devo_validar_a_mensagen_de_retorno() throws Throwable {

		retornoChamada = (RetornoApi) objects;

		assertTrue("Diferente de false ", retornoChamada.getCompleted().toString() == "false");
		assertTrue("Id null ", retornoChamada.getId() != null);
		assertTrue("Diferente do esperado ", retornoChamada.getTitle().toString() != "delectus");
		assertTrue("User id null ", retornoChamada.getUserId() != null);

	}

}
