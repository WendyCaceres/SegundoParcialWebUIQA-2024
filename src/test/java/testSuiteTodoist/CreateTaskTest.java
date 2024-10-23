package testSuiteTodoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CreateTaskTest extends BaseTestTodoist {

    @Test
    public void createTaskSuccessfully() {
        String taskName = "Task " + new Date().getTime();

        mainPageTodoist.loginButton.click();
        loginPageTodoist.login("wcaceres683@gmail.com", "123456Wen");

        menuSectionTodoist.addTaskButton.click();
        addTaskSection.addTask(taskName);

        Assertions.assertTrue(addTaskSection.taskNameTextBox.isControlDislayed(), "ERROR: La tarea no se añadió correctamente.");
    }
}
