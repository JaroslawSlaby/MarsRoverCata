package mars.rover;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {

  private static Map<String, Command> commands = new HashMap<String, Command>() {{
    put("M", Rover::move);
    put("L", Rover::turnLeft);
    put("R", Rover::turnRight);
  }};

  static String move(int x, int y, char direction, String instructions) {

    Rover rover = Rover.createRover(x, y, Direction.valueOf(String.valueOf(direction)));

    for (char instruction : instructions.toCharArray()) {
      commands.get(String.valueOf(instruction)).execute(rover);
    }

    return rover.x + " " + rover.y + " " + rover.direction.toString();
  }
}
