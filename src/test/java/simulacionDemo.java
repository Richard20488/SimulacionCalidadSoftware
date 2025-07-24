import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class simulacionDemo {
private WebDriver driver;
	
	@Before
	public void SetUp() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.getProperty("webdriver.chrome.drive", "./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
	}
	
	@Test
	public void SextoTest() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 300)");
		
		WebElement txtUsername = driver.findElement(By.id("userName"));
		WebElement txtCorreo = driver.findElement(By.id("userEmail"));
		WebElement txtDireccion = driver.findElement(By.id("currentAddress"));
		WebElement txtDireccion2 = driver.findElement(By.id("permanentAddress"));
		
		txtUsername.sendKeys("Ana");
		txtCorreo.sendKeys("anape@gmail.com");
		txtDireccion.sendKeys("Ya tu sabe");
		txtDireccion2.sendKeys("Ya tu sabe x2");		
		
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		
		btnSubmit.click();
	}
}
