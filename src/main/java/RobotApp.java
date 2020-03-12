import java.util.Arrays;

public class RobotApp {
    public static void main(String... args) {
        Robot robot = new Robot(Arrays.asList(new LeftCommand(),
                new RightCommand(), new MoveCommand()));
        robot.commandAction();
    }
}