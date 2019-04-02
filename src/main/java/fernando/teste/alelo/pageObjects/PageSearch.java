package fernando.teste.alelo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import fernando.teste.alelo.dto.Filme;



public class PageSearch extends BasePage {

	public PageSearch(WebDriver navegador) {
		super(navegador);
	}
		
		public PageSearch selecionaFilmes(String filme,String diretor) {

		navegador.findElement(By.name("q")).sendKeys(filme+" com "+diretor);
		navegador.findElement(By.name("btnK")).click();
		
			return this;
		}
	

}
