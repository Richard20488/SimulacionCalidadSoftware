import org.junit.After;
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
	
	@Test
	public void SegundoTest() {
		
		WebElement txtUsername = driver.findElement(By.id("user-name"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		
		txtUsername.sendKeys("locked_out_user");
		txtPassword.sendKeys("secret_sauce");
		btnLogin.click();
	}
	
	@Test
	public void TercerTest() {
		
		WebElement txtUsername = driver.findElement(By.id("user-name"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		
		txtUsername.sendKeys("problem_user");
		txtPassword.sendKeys("secret_sauce");
		btnLogin.click();
		
		WebElement btnAgregarP = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		WebElement btnAgregarP1 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		
		btnAgregarP.click();
		btnAgregarP1.click();
		
		WebElement btnRemoverP = driver.findElement(By.id("remove-sauce-labs-backpack"));
		WebElement btnRemoverP1 = driver.findElement(By.id("remove-sauce-labs-bike-light"));
		
		btnRemoverP.click();
		btnRemoverP1.click();  // Los productos no se eliminan del carrito a la hora de tocar el botón de remover desde cada producto.
	}
	
	@Test
	public void CuartoTest() {
		
		WebElement txtUsername = driver.findElement(By.id("user-name"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		
		txtUsername.sendKeys("performance_glitch_user");
		txtPassword.sendKeys("secret_sauce");
		btnLogin.click(); // Dura mucho en recargar-reconocer el usuario y contraseña.
		
		WebElement btnAgregarP2 = driver.findElement(By.className("shopping_cart_link"));
		
		btnAgregarP2.click();
		
		WebElement btnAgregarP3 = driver.findElement(By.id("checkout"));
		
		btnAgregarP3.click();
		
		WebElement txtNombre = driver.findElement(By.id("first-name"));
		WebElement txtApellido = driver.findElement(By.id("last-name"));
		WebElement txtPostal = driver.findElement(By.id("postal-code"));
		
		txtNombre.sendKeys("prueba");
		txtApellido.sendKeys("prueba");  // Hay que intentarlo varias veces hasta que llene todos los datos.
		txtPostal.sendKeys("12346");
		
		WebElement btnAgregarP4 = driver.findElement(By.id("continue"));
				
		btnAgregarP4.click();
		
		WebElement btnAgregarP5 = driver.findElement(By.id("finish"));
		
		btnAgregarP5.click(); // Al final hace una compra con ningún producto dentro del carrito.
	}
	
	@Test
	public void QuintoTest() {
		
		WebElement txtUsername = driver.findElement(By.id("user-name"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		
		txtUsername.sendKeys("error_user");
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
		txtApellido.sendKeys("prueba"); // No deja escribir ningún tipo de caracter en el campo apellido.
		txtPostal.sendKeys("12346");
	}
	
	@Test
	public void SextoTest() {
		
		WebElement txtUsername = driver.findElement(By.id("user-name"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		
		txtUsername.sendKeys("visual_user");
		txtPassword.sendKeys("secret_sauce");
		btnLogin.click();
	}
	
	@After
	public void cierre() {
		driver.quit();
	}

}
