import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class flights {

    public static void main (String args[]){
        System.setProperty("webdriver.chrome.driver","/Users/rjoshi/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {


            String baseUrl = "https://www.makemytrip.com/";
            driver.get(baseUrl);

            driver.findElement(By.cssSelector("#ch_login_icon")).click();

            WebElement myElement = driver.findElement(By.cssSelector("#ch_login_email"));
            myElement.sendKeys("revatijoshi19@gmail.com");

            WebElement myElement1 = driver.findElement(By.cssSelector("#ch_login_password"));
            myElement1.sendKeys("password123");

            driver.findElement(By.cssSelector("#header_tab_flights")).click();

            driver.findElement(By.cssSelector("#js-switch__option #switch__input_2")).click();

            driver.findElement(By.cssSelector("#hp-widget__sfrom")).click();
            WebElement element = driver.findElement(By.cssSelector("#hp-widget__sfrom"));
            Select se = new Select(element);
            se.selectByValue("Goa, India");

            WebElement element1 = driver.findElement(By.cssSelector("#hp-widget__sTo"));
            Select se1 = new Select(element);
            se1.selectByValue("Pune, India");

            WebElement element2 = driver.findElement(By.cssSelector("#hp-widget__depart"));
            Select se2 = new Select(element);

            driver.findElement(By.cssSelector("#hp-widget__return")).click();

        }finally {
            driver.quit();
        }


    }
}
