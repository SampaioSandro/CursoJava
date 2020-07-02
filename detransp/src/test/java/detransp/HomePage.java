package detransp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver navegador;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Sampaio\\Drivers\\chromedriver.exe");
		navegador = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
//		navegador.quit();
	}

	@Test
	public void test() throws InterruptedException {
		navegador.get("https://www.detran.sp.gov.br/");
		assertTrue("Titulo diferente do esperado", navegador.getTitle().contentEquals(":: DETRAN-SP :: DEPARTAMENTO ESTADUAL DE TRÂNSITO DE SÃO PAULO"));
		Thread.sleep(3000);
		
//		WebElement checkBox = 
		
		navegador.findElement(By.id("chk_esquecer")).click();
//		navegador.findElement(By.xpath("//class[introjs-tooltipbuttons]")).click();
//		navegador.findElement(By.xpath("//a[@href='javascript:void(0);]")).click();
							
//		WebDriverWait wait = new WebDriverWait(navegador, 15);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'x')]"))).click();
		                              
//		navegador.findElement(By.xpath("//a[@href='javascript:void(0);']")).click();
		
		Thread.sleep(30);  
//		navegador.findElement(By.xpath("//class[introjs-button introjs-skipbutton]")).click();                        
		navegador.findElement(By.xpath("//a[contains(text(),'x')]")).click();
		navegador.findElement(By.xpath("//a[contains(text(),'esquecer')]")).click();
		navegador.findElement(By.xpath("//a[contains(text(),'Proximo')]")).click();
		navegador.findElement(By.xpath("//a[contains(text(),'Anterior')]")).click();
		

	}

}
