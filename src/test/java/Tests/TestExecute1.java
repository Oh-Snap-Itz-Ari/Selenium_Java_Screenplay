package Tests;

import Tasks.LinkRedirection;
import Tasks.SearchByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExecute1 {

    public static void main(String[] args) throws InterruptedException {

        // Inicialización del Driver
        WebDriver driver;

        // System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/Volumes/Disco local 1/Mr. Blue Sky/Automatización/Drivers/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://iqssdss2020.pythonanywhere.com/tutorial/form/search");
        driver.manage().window().maximize();

        SearchByName.SearchByName(driver,"Alex Fabián Melo Gómez", "K", 10);
        LinkRedirection.Redirection(driver);

        driver.quit();
    }
}
