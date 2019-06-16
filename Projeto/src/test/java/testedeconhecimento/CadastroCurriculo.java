package testedeconhecimento;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CadastroCurriculo {
	static WebDriver driver;

	public CadastroCurriculo(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clica(String link) {
		driver.findElement(By.linkText("Contato")).click();
	}
	
	public void preencheDados(String nome, String email, String telefone) throws IOException {
		driver.findElement(By.name("fld_8768091")).sendKeys(nome);
		tiraScreenShot("printNome.jpg");
		driver.findElement(By.name("fld_6009157")).sendKeys(email);
		tiraScreenShot("printEmail.jpg");
		driver.findElement(By.name("fld_9033886")).sendKeys(telefone);
		tiraScreenShot("printCompleto.jpg");
	}
	
	public static void tiraScreenShot(String nomeDaImagem) throws IOException{
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File arquivoScreenShot = screenshot.getScreenshotAs(OutputType.FILE);

		// imageFileDir = System.getProperty("java.io.tmpdir"); 
		String imageFileDir = "C:\\Users\\USER\\Desktop\\Teste Art IT\\Arquivos";
		FileUtils.copyFile(arquivoScreenShot, new File(imageFileDir, nomeDaImagem));

	}

}
