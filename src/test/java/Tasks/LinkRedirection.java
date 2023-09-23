package Tasks;

import Actions.Click;
import Actions.SelectVisibleText;
import Actions.Write;
import Objects.PO_SearchForm;
import org.openqa.selenium.WebDriver;

public class LinkRedirection {

    public static void Redirection (WebDriver driver) throws InterruptedException {

        Click.click(driver, PO_SearchForm.LinkRedirection);
        Thread.sleep(5000);

    }
}
