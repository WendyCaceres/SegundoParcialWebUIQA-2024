package pages.todoly;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class ItemSection {

    public TextBox addNameTxtBox = new TextBox(By.id("NewItemContentInput"));
    public TextBox updateNameTxtBox = new TextBox(By.id("ItemEditTextbox"));
    public Button addButton = new Button(By.id("NewItemAddButton"));

    public Label getTaskLabel(String name){
        Label nameLabel = new Label(By.xpath("//div[text()='"+name+"' and @class=\"ItemContentDiv\"]"));
        return nameLabel;
    }


}