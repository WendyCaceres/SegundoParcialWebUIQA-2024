package pages.todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class AddTaskSection {
    public TextBox taskNameTextBox = new TextBox(By.xpath("//div[@aria-label='Nombre tarea']//p"));
    public Button addTaskConfirmButton = new Button(By.xpath("//button[@data-testid='task-editor-submit-button']"));

    public void addTask(String taskName) {
        taskNameTextBox.setText(taskName);
        addTaskConfirmButton.click();
    }
}
