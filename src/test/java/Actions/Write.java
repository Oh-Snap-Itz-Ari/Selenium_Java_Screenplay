package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Write {

    public static void write(WebDriver driver,  By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

}
