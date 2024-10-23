package testSuiteTodoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import pages.todoly.SignUpSection;
import session.Session;

import java.util.Date;

public class SignUpTest extends BaseTestTodoLy {

    SignUpSection signUpSection = new SignUpSection();

    @Test
    public void createAndDeleteUser() throws InterruptedException {
        String fullName = "TestUser " + new Date().getTime();
        String email = "examen2" + new Date().getTime() + "@mail.com";
        String password = "123456";

        mainPage.signUpButton.click();

        signUpSection.signUp(fullName, email, password);

        Assertions.assertTrue(menuSection.logoutButton.isControlDislayed(), "ERROR: El registro falló.");

        menuSection.settingsButton.click();
        settingsSection.navigateToAccountTab();

        settingsSection.deleteAccount();

        Alert alert = Session.getInstance().getBrowser().switchTo().alert();
        alert.accept();
        Thread.sleep(700);
        mainPage.loginButton.click();
        loginSection.login(email, password);

        Assertions.assertFalse(menuSection.logoutButton.isControlDislayed(), "ERROR: La cuenta no se eliminó correctamente.");
    }
}
