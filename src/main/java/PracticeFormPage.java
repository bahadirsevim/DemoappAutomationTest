import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage{

    private final By name = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By email = By.id("userEmail");

    private GenderSection genderSection;

    public PracticeFormPage(WebDriver driver){
        super(driver);
        driver.get(baseURL.concat("automation-practice-form"));
        genderSection = new GenderSection(driver);
    }

    public GenderSection getGenderSection() {
        return this.genderSection;
    }

    public void setName(String nameAsString){
        type(name, nameAsString);
    }

    public void setLastName(String lastNameAsString){
        type(lastName, lastNameAsString);
    }

    public void setEmail(String mailAddress){
        type(email, mailAddress);
    }

    public String getName(){
        return find(name).getAttribute("value");
    }

    public String getLastName(){
        return find(lastName).getAttribute("value");
    }

    public String getEmail(){
        return find(email).getAttribute("value");
    }

}
