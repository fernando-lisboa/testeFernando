package fernando.teste.alelo.dto;

public class Diretor{

	String nomeDiretor;
	String dataNascimento;
	
	public String getNomeDiretor() {
		return nomeDiretor;
	}
	public void setNomeDiretor(String nomeDiretor) {
		this.nomeDiretor = nomeDiretor;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public String toString() {
		return "Diretor [nomeDiretor=" + nomeDiretor + ", dataNascimento=" + dataNascimento + "]";
	}
	
	
}
