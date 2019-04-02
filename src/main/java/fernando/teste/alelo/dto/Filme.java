
package fernando.teste.alelo.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Filme {

	@SerializedName("nomeFilme")
	@Expose
	private String nomeFilme;
	@SerializedName("dataLancamento")
	@Expose
	private String dataLancamento;
	@SerializedName("diretor")
	@Expose
	private Diretor diretor;

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

}
