package selenium.firefox.facebook;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FbLogin {
public static void main(String[] args)
 {
	MySecretPassword ms = new MySecretPassword();
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver",
			"Desktop\\Eclipes\\workspace\\Selenium\\lib\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.get("https://www.facebook.com/");    // URL

	driver.findElement(By.id("email")).sendKeys("rakshitbelwal06@gmail.com");
	driver.findElement(By.id("pass")).sendKeys(ms.password());
        driver.findElement(By.id("phone no.")).sendKeys("8126903433");  //You may also use phone number as id
	driver.findElement(By.id("loginbutton")).click(); // You may also use loginbutton as id

	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
	driver.findElement(By.xpath("//a[contains(@data-gt,'menu_logout')]")).click();

	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	driver.get("https://www.facebook.com/");

	driver.quit();

}
}
     // For the Facebook Password
package selenium.firefox.facebook;

public class MySecretPassword {
public String password() {
	return password;
}
}