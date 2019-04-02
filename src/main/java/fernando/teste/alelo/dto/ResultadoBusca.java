package fernando.teste.alelo.dto;

public class ResultadoBusca {
	
	String titulo;
	
	String url;

	@Override
	public String toString() {
		return "ResultadoBusca [titulo=" + titulo + ", url=" + url + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
