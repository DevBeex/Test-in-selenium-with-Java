import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Prueba {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C://Users/50760/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Object texto = driver.findElement(By.id("twotabsearchtextbox"));
        ((WebElement) texto).sendKeys("Laptop");
        Thread.sleep(5000);
        driver.quit();
    }
}
