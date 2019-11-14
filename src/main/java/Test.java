import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
        public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\BrowserDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            Thread.sleep(1000);
            driver.get("http://www.baidu.com");
            Thread.sleep(2000);
            String title = driver.getTitle();
            System.out.print(title);
            Thread.sleep(1000);
            driver.close();
        }
    }
