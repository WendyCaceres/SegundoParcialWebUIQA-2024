package pages.todoist;

import controls.Button;
import org.openqa.selenium.By;

public class MenuSectionTodoist {
    public Button profileButton = new Button(By.id(":r0:"));
    public Button addProjectButton = new Button(By.id(":r1:"));
    public Button confirmAddProjectButton = new Button(By.xpath("//div[@role='menuitem' and @class='sMSZZS5']"));
    public Button addTaskButton = new Button(By.xpath("//button[span[text()='Añadir Tarea']]"));
}
