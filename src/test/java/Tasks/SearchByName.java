package Tasks;

import Actions.Click;
import Actions.SelectVisibleText;
import Actions.Write;
import Objects.PO_SearchForm;
import org.openqa.selenium.WebDriver;

public class SearchByName {

    public static void SearchByName (WebDriver driver, String name, String grade, Integer pageSize) throws InterruptedException {

        Write.write(driver, PO_SearchForm.txtName, name);
        Thread.sleep(2000);
        SelectVisibleText.select(driver, PO_SearchForm.comboGrade, grade);
        Thread.sleep(2000);

        if (pageSize == 5){
            Click.click(driver, PO_SearchForm.ChBxPageSize5);
            Thread.sleep(2000);
        }

        if (pageSize == 10){
            Click.click(driver, PO_SearchForm.ChBxPageSize10);
            Thread.sleep(2000);
        }

        if (pageSize == 15){
            Click.click(driver, PO_SearchForm.ChBxPageSize15);
            Thread.sleep(2000);
        }

        Click.click(driver, PO_SearchForm.chPrivacy);
        Thread.sleep(2000);

        Click.click(driver, PO_SearchForm.chTerms);
        Thread.sleep(2000);

        Click.click(driver, PO_SearchForm.btnSearch);
        Thread.sleep(2000);

    }
}
