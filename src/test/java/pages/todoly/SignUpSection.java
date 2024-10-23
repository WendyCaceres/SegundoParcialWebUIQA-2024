package pages.todoly;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class SignUpSection {
    public TextBox fullNameTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox passwordTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Button termsCheckBox = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signUpButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

    public void signUp(String fullName, String email, String password){
        fullNameTextBox.setText(fullName);
        emailTextBox.setText(email);
        passwordTextBox.setText(password);
        termsCheckBox.click();
        signUpButton.click();
    }
}
