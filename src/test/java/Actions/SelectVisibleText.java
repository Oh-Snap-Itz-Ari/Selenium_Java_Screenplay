package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectVisibleText {

    public static void select(WebDriver driver,  By locator, String text){
        Select combo = new Select (driver.findElement(locator));
        combo.selectByVisibleText(text);
    }
    
}
