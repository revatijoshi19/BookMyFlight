import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Hashtable;


public class flights {

    public static void main (String args[]){
        System.setProperty("webdriver.chrome.driver","/Users/rjoshi/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {


//            String baseUrl = "https://www.makemytrip.com/";
//            driver.get(baseUrl);
//
//            driver.findElement(By.cssSelector("#ch_login_icon")).click();
//
//            WebElement myElement = driver.findElement(By.cssSelector("#ch_login_email"));
//            myElement.sendKeys("revatijoshi19@gmail.com");
//
//            WebElement myElement1 = driver.findElement(By.cssSelector("#ch_login_password"));
//            myElement1.sendKeys("password123");
//
//            driver.findElement(By.cssSelector("#header_tab_flights")).click();
//
//            driver.findElement(By.cssSelector("#js-switch__option #switch__input_2")).click();
//
//            driver.findElement(By.cssSelector("#hp-widget__sfrom")).click();
//            WebElement element = driver.findElement(By.cssSelector("#hp-widget__sfrom"));
//            Select se = new Select(element);
//            se.selectByValue("Goa, India");
//
//            WebElement element1 = driver.findElement(By.cssSelector("#hp-widget__sTo"));
//            Select se1 = new Select(element);
//            se1.selectByValue("Pune, India");
//
//            WebElement element2 = driver.findElement(By.cssSelector("#hp-widget__depart"));
//            Select se2 = new Select(element);
//
//            driver.findElement(By.cssSelector("#hp-widget__return")).click();

            String baseUrl = "https://www.goibibo.com";
            driver.get(baseUrl);

            driver.findElement(By.cssSelector("#gi_roundtrip_label")).click();
            Thread.sleep(10000);

            driver.findElement(By.cssSelector("#jrdp_end-calen_3_21_2017")).click();
            Thread.sleep(10000);

//            driver.findElement(By.cssSelector("#start-date")).click();
//            Thread.sleep(30000);

            WebElement myElement = driver.findElement(By.cssSelector("#gi_source_st"));
            myElement.sendKeys("Mumbai");
            Thread.sleep(10000);

            driver.findElement(By.cssSelector("#gi_destination_st")).click();
            WebElement myElement1 = driver.findElement(By.cssSelector("#gi_destination_st"));
            myElement1.sendKeys("Goa");
            Thread.sleep(10000);

            driver.findElement(By.cssSelector("#start-date")).click();
            Thread.sleep(30000);

            driver.findElement(By.cssSelector("#jrdp_start-calen_3_1_2017")).click();
            Thread.sleep(10000);

//            driver.findElement(By.cssSelector("#jrdp_end-calen_4_21_2017")).click();
//            Thread.sleep(10000);

            driver.findElement(By.cssSelector("#searchWidgetNew")).click();
            Thread.sleep(10000);

            driver.findElement(By.cssSelector("#gi_search_btn")).click();
            Thread.sleep(60000);

            driver.findElement(By.cssSelector(".button.orange.fr")).click();
            Thread.sleep(30000);

            driver.findElement(By.cssSelector("#leadchbx2")).click();
            Thread.sleep(5000);

            driver.findElement(By.cssSelector(".button.blue.small.marginT10.fr.Ok")).click();
            Thread.sleep(5000);

            WebElement element=driver.findElement(By.name("adultchoose1"));
            Select se=new Select(element);
            se.selectByIndex(3);
            Thread.sleep(5000);

            driver.findElement(By.cssSelector("#adultfirstname1")).click();
            WebElement myElement2 = driver.findElement(By.cssSelector("#adultfirstname1"));
            myElement2.sendKeys("Revati");
            Thread.sleep(5000);

            driver.findElement(By.cssSelector("#adultlastname1")).click();
            WebElement myElement3 = driver.findElement(By.cssSelector("#adultlastname1"));
            myElement3.sendKeys("Joshi");
            Thread.sleep(5000);

            driver.findElement(By.cssSelector("#email")).click();
            WebElement myElement4 = driver.findElement(By.cssSelector("#email"));
            myElement4.sendKeys("revatijoshi19@gmail.com");
            Thread.sleep(5000);

            driver.findElement(By.cssSelector("#mobile")).click();
            WebElement myElement5 = driver.findElement(By.cssSelector("#mobile"));
            myElement5.sendKeys("8123474054");
            Thread.sleep(5000);

            driver.findElement(By.cssSelector("#makePayment")).click();
            Thread.sleep(10000);

//            driver.findElement(By.cssSelector("#RoundTrip")).click();
//
//            WebElement myElement = driver.findElement(By.cssSelector("#FromTag"));
//            myElement.sendKeys("Mumbai");
//
//            WebElement myElement1 = driver.findElement(By.cssSelector("#ToTag"));
//            myElement1.sendKeys("oaG");
//
//            WebElement myElement3 = driver.findElement(By.cssSelector("#DepartDate"));
//            myElement3.sendKeys("01/05/2017");
//
//            WebElement myElement4 = driver.findElement(By.cssSelector("#ReturnDate"));
//            myElement4.sendKeys("15/05/2017");
//
//            driver.findElement(By.cssSelector("#Adults")).click();
//
//            driver.findElement(By.cssSelector(".booking")).click();
//            Thread.sleep(10000);
//
//
//            driver.findElement(By.cssSelector(".fRight")).click();


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }


    }
}
