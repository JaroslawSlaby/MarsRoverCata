package mars.rover;

import java.util.HashMap;
import java.util.Map;

public interface Command {

  void execute(Rover rover);
}

class MoveCommand implements Command {

  private Map<Direction, MoveCommandInterface> moves = new HashMap<Direction, MoveCommandInterface>() {{
    put(Direction.N, Rover::moveNorth);
    put(Direction.S, Rover::moveSouth);
    put(Direction.E, Rover::moveEast);
    put(Direction.W, Rover::moveWest);
  }};

  @Override
  public void execute(Rover rover) {
    Direction direction = rover.direction;
    moves.get(direction).move(rover);
  }
}
