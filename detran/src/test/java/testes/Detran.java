package testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Detran {

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
	public void test() {
		navegador.get("https://www.google.com.br") ;
	}

}
