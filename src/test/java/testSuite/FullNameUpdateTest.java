package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todoly.ProfileSection;

import java.util.Date;

public class FullNameUpdateTest extends BaseTestTodoLy{

    ProfileSection profileSection = new ProfileSection();
    @Test
    public void verifyUpdateFullName() throws InterruptedException {
        String newName = "UPB"+new Date().getTime();
        mainPage.loginButton.click();
        loginSection.login("upb9000@upb9000.com","12345");
        menuSection.settingButton.click();
        profileSection.fullnameTxtBox.clearSetText(newName);
        profileSection.okButton.click();
        menuSection.settingButton.click();
        // verification
        Assertions.assertEquals(newName,profileSection.fullnameTxtBox.getPropertyValue("value"),"ERROR! the fullname was not updated");
    }
}
