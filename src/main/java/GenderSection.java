import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection extends BasePage{

    private final By maleRadioButton = new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleRadioButton = new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherRadioButton = new By.ByCssSelector("label[for='gender-radio-3']");

    private final By maleRadioCircle = By.id("gender-radio-1");
    private final By femaleRadioCircle = By.id("gender-radio-2");
    private final By otherRadioCircle = By.id("gender-radio-3");

    public enum Genders{MALE, FEMALE, OTHER};
    public GenderSection(WebDriver driver){
        super(driver);
    }

    public void clickRadioButton(Genders gender){
        switch (gender){
            case FEMALE:
                click(femaleRadioButton);
                break;
            case MALE:
                click(maleRadioButton);
                break;
            case OTHER:
                click(otherRadioButton);
                break;
            default:
                System.out.println("ha value is not in enum");
                break;
        }
    }

    public boolean isRadioButtonChecked(Genders gender){
        boolean isChecked = false;
        switch (gender){
            case FEMALE:
                isChecked = isSelected(femaleRadioCircle);
                break;
            case MALE:
                isChecked = isSelected(maleRadioCircle);
                break;
            case OTHER:
                isChecked = isSelected(otherRadioCircle);
                break;
            default:
                System.out.println("ha value is not in enum");
                break;
        }
        return isChecked;
    }
}
