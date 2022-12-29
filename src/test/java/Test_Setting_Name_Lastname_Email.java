import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest{

    @Test
    public void setName(){
        practiceFormPage.setName("Bahadir");
        Assertions.assertEquals("Bahadir", practiceFormPage.getName(), "Name value is not correct!");
    }

    @Test
    public void setLastName(){
        practiceFormPage.setLastName("Sevim");
        Assertions.assertEquals("Sevim", practiceFormPage.getLastName(), "Last Name value is not correct!");
    }

    @Test
    public void setEmail(){
        practiceFormPage.setEmail("bahadirsevim@outlook.com");
        Assertions.assertEquals("bahadirsevim@outlook.com", practiceFormPage.getEmail(), "E-Mail value is not correct!");

    }

}
