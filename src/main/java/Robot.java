import java.util.List;

public class Robot {
    private List<Command> command;

    public Robot(List<Command> command) {
        this.command = command;
    }

    public void commandAction() {
        command.forEach(robot -> robot.makeMovement());
    }
}