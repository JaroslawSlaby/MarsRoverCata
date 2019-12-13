package mars.rover;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {

  private static Map<Direction, MoveCommandInterface> moves = new HashMap<Direction, MoveCommandInterface>() {{
    put(Direction.N, Rover::moveNorth);
    put(Direction.S, Rover::moveSouth);
    put(Direction.E, Rover::moveEast);
    put(Direction.W, Rover::moveWest);
  }};

  private static Map<String, Command> commands = new HashMap<String, Command>() {{
    put("M", MarsRover::moveRover);
    put("L", Rover::turnLeft);
    put("R", Rover::turnRight);
  }};

  private static void moveRover(Rover rover) {
    moves.get(rover.direction).move(rover);
  }

  static String move(int x, int y, char direction, String instructions) {

    Rover rover = new Rover(x, y, Direction.valueOf(String.valueOf(direction)));

    for (char instruction : instructions.toCharArray()) {
      commands.get(String.valueOf(instruction)).execute(rover);
    }

    return rover.x + " " + rover.y + " " + rover.direction.toString();
  }
}
