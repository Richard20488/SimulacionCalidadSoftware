import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class simulacion {
private WebDriver driver;
	
	@Before
	public void SetUp() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.getProperty("webdriver.chrome.drive", "./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void PrimerTest() {

		WebElement txtUsername = driver.findElement(By.id("user-name"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		
		txtUsername.sendKeys("standard_user");
		txtPassword.sendKeys("secret_sauce");
		btnLogin.click();
		
		WebElement btnAgregarP = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		WebElement btnAgregarP1 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		WebElement btnAgregarP2 = driver.findElement(By.className("shopping_cart_link"));
		
		
		btnAgregarP.click();
		btnAgregarP1.click();
		btnAgregarP2.click();	
		
		WebElement btnAgregarP3 = driver.findElement(By.id("checkout"));
		
		btnAgregarP3.click();
		
		WebElement txtNombre = driver.findElement(By.id("first-name"));
		WebElement txtApellido = driver.findElement(By.id("last-name"));
		WebElement txtPostal = driver.findElement(By.id("postal-code"));
		
		txtNombre.sendKeys("prueba");
		txtApellido.sendKeys("prueba");
		txtPostal.sendKeys("12346");
		
		WebElement btnAgregarP4 = driver.findElement(By.id("continue"));
				
		btnAgregarP4.click();
		
		WebElement btnAgregarP5 = driver.findElement(By.id("finish"));
		
		btnAgregarP5.click();
	}
}
