package fernando.teste.alelo.application;

import static org.junit.Assert.fail;

import java.io.FileReader;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import fernando.teste.alelo.config.HttpClientConfig;
import fernando.teste.alelo.config.RestTemplateConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RestTemplateConfig.class, HttpClientConfig.class })
public class TestApplication<T> {

	RestTemplate restTemplate = new RestTemplate();

	// #######################################################****CHAMADA_GETSEM_PARAMETROS***##########################################################

	public T apiCall(java.lang.reflect.Type type, String url) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

		return apiService(type, builder);
	}

	private T apiService(java.lang.reflect.Type type, UriComponentsBuilder massa) {

		HttpEntity<Object> entity = new HttpEntity<Object>(massa);
		String fullresponse = restTemplate.getForObject(massa.toUriString(), String.class);
		Gson gson = new Gson();
		return gson.fromJson(fullresponse, type);
	}
	// #######################################################****ConverteJson**##########################################################

	public Object carregaMassaDeDados(String jsonFile) {

		try {

			Gson gson = new Gson();

			Object listagson = gson.fromJson(retornaConteudoArquivoJson(jsonFile), new TypeToken<Object>() {
			}.getType());

			return listagson;

		} catch (Exception e) {
			e.printStackTrace();
			// logger.error(“Erro ao deserealizar massa de dados”);
			fail();
		}
		return null;
	}

	private List<Object> carregaMassaDeDadosList(String jsonFile) {

		try {

			Gson gson = new Gson();

			List<Object> listagson = gson.fromJson(retornaConteudoArquivoJson(jsonFile), new TypeToken<List<Object>>() {
			}.getType());

			return listagson;

		} catch (Exception e) {
			e.printStackTrace();
			// logger.error(“Erro ao deserealizar massa de dados”);
			fail();
		}
		return null;
	}

	private String retornaConteudoArquivoJson(String fileName) {
		JsonParser parser = new JsonParser();
		try {
			Object json = parser.parse(new FileReader(fileName));
			String convert = json.toString();
			return convert;
		} catch (Exception e) {

			System.out.println(e);
		}
		return null;
	}
}
