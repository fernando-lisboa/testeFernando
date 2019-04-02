package fernando.teste.alelo.Teste;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Então;
import fernando.teste.alelo.commons.Generator;
import fernando.teste.alelo.commons.Screenshot;
import fernando.teste.alelo.commons.Web;
import fernando.teste.alelo.dto.Filme;
import fernando.teste.alelo.dto.ResultadoBusca;
import fernando.teste.alelo.pageObjects.PageSearch;

public class BuscaPorFilmeTeste {

	List<ResultadoBusca> resultado = new ArrayList<>();
	private int linha = 1;
	private int qtdeLinhas = 10;
	private List<Filme> massaDeDadosList;
	private WebDriver navegador;
	private String enderecoArquivo = "/Users/006_fvfx20w1j1wv/Documents/testes/Screenshot/TesteAlelo/";

	private static final String JSON_FILES_PATH = "src/main/resources/json/";

	@Dado("^que eu tenha os nomes dos filmes a ser consultado \"([^\"]*)\"$")
	public void que_eu_tenha_os_nomes_dos_filmes_a_ser_consultado(String jsonFilmes) throws Throwable {

		carregaMassaDeDados(jsonFilmes);
		System.out.println("filme numero " + "1 " + massaDeDadosList.get(0).getNomeFilme());
		System.out.println("filme numero " + " 2 " + massaDeDadosList.get(1).getNomeFilme());
		System.out.println("filme numero " + " 3 " + massaDeDadosList.get(2).getNomeFilme());

	}

	@Dado("^efetue abusca no site do google\"([^\"]*)\"$")
	public void efetue_abusca_no_site_do_google(int ct) throws Throwable {

		navegador = Web.createChrome();

		System.out.println("Efetundo Busca na Web...");

		String filme = massaDeDadosList.get(ct).getNomeFilme();
		String diretor = massaDeDadosList.get(ct).getDiretor().getNomeDiretor();

			new PageSearch(navegador).selecionaFilmes(filme, diretor);

			Screenshot.print(navegador, enderecoArquivo + Generator.dataHoraParaArquivo() + ".png");
	}

	@Então("^tevo ter o resultado de acordo como nome do diretor e do filme$")
	public void tevo_ter_o_resultado_de_acordo_como_nome_do_diretor_e_do_filme() throws Throwable {

		String buscaAproximada = navegador.findElement(By.id("resultStats")).getText();

		assertTrue("Não retornou nenhum resultado", buscaAproximada != null);

		Assert.assertTrue(buscaAproximada.contains("Aproximadamente"));

	}

	// METODOS AUXILIARES JSON - GSON
	private void carregaMassaDeDados(String jsonFilmes) {

		massaDeDadosList = new ArrayList<Filme>();
		try {

			Gson gson = new Gson();

			List<Filme> listagson = gson.fromJson(retornaConteudoArquivoJson(JSON_FILES_PATH + jsonFilmes),
					new TypeToken<ArrayList<Filme>>() {
					}.getType());

			massaDeDadosList.addAll(listagson);

		} catch (Exception e) {
			e.printStackTrace();
			// logger.error("Erro ao deserealizar massa de dados");
			fail();
		}

	}

	private String retornaConteudoArquivoJson(String fileName) {
		JsonParser parser = new JsonParser();
		try {
			Object json = parser.parse(new FileReader(fileName));
			return json.toString();
		} catch (Exception e) {

			System.out.println(e);
		}
		return null;
	}

}
