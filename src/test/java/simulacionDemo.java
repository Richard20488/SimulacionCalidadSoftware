import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class simulacionDemo {
private WebDriver driver;
	
	@Before
	public void SetUp() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.getProperty("webdriver.chrome.drive", "./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	@Test
	public void SextoTest() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 250)");
		
		WebElement txtUsername = driver.findElement(By.id("firstName"));
		WebElement txtApellido = driver.findElement(By.id("lastName"));
		WebElement txtCorreo = driver.findElement(By.id("userEmail"));
		
		txtUsername.sendKeys("Ana");
		txtApellido.sendKeys("Perez");
		txtCorreo.sendKeys("anape@gmail.com");
		
		WebElement txtGenero = driver.findElement(By.className("custom-control-label"));
		
		txtGenero.click();
		
		WebElement txtNumero = driver.findElement(By.id("userNumber"));
		
		txtNumero.sendKeys("8523697410");
		
		
		
		WebElement txtAsunto = driver.findElement(By.id("subjectsInput"));
		
		txtAsunto.sendKeys("Compra.");
		
		WebElement txtGusto = driver.findElement(By.className("custom-control-label"));
		
		txtGusto.click();
		
		
		WebElement txtDireccion = driver.findElement(By.id("currentAddress"));
		
		txtDireccion.sendKeys("Puebla");
		
		
		WebElement btnAgregarP5 = driver.findElement(By.id("submit"));
		
		btnAgregarP5.click();
	}
}
