package pages.todoly;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class SettingsSection {
    public TextBox fullNameTextbox = new TextBox(By.xpath("//input[@id='FullNameInput']"));

    public Button okButton = new Button(By.xpath("//button[span[text()='Ok']]"));
    public Label accountTab = new Label(By.xpath("//a[@href='#settings_Account']"));
    public Button deleteAccountButton = new Button(By.id("DeleteAccountBtn"));

    public void navigateToAccountTab() {
        accountTab.click();
    }

    public void deleteAccount() {
        deleteAccountButton.click();
    }
}