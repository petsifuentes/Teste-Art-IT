package testedeconhecimento;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCadastro {
	public static WebDriver driver;
	public static CadastroCurriculo dados;
	
	@BeforeClass
	static public void preCondicoes() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Teste Art IT\\Arquivos\\chromedriver.exe");
		driver = new ChromeDriver();
		dados = new CadastroCurriculo(driver);
	}
	
	@Before
	public void condicoes() {
		driver.get("https://artit.com.br/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void preencherDados() throws IOException {
		dados.clica("Contato");
		dados.preencheDados("Petrônio Sifuentes Gomes Júnior", "pet.sifuentesjr@gmail.com",
				"37991337936");
	}
	
	@After
	public void posCondicoes() {
		driver.quit();
	}
	

}
