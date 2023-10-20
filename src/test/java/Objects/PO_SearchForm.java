package Objects;

import org.openqa.selenium.By;

public class PO_SearchForm {

    // Se crea la sección de objetos (Elementos de la página) - Si se quiere usar otra página se crea otra clase

    public static By txtName = By.id("search_name");
    public static By comboGrade = By.id("search_grade");
    public static By ChBxPageSize5 = By.id("p5");
    public static By ChBxPageSize10 = By.id("p10");
    public static By ChBxPageSize15 = By.id("p15");
    public static By chPrivacy = By.id("privacypolicy");
    public static By chTerms = By.id("termsconditions");
    public static By btnSearch = By.id("search");
    public static By LinkRedirection = By.xpath("//a[@href='http://www.web2py.com/']");

}
