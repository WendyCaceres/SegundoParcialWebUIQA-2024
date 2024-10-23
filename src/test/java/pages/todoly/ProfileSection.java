package pages.todoly;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class ProfileSection {
    public TextBox fullnameTxtBox = new TextBox(By.id("FullNameInput"));
    public Button okButton = new Button(By.xpath("//span[text()='Ok']"));

}
