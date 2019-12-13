package mars.rover;

import java.util.HashMap;
import java.util.Map;

public interface Command {

  void execute(Rover rover);
}

class MoveCommand implements Command {

  private Map<Direction, MoveCommandInterface> moves = new HashMap<Direction, MoveCommandInterface>() {{
    put(Direction.N, new MoveNorth());
    put(Direction.S, new MoveSouth());
    put(Direction.E, new MoveEast());
    put(Direction.W, new MoveWest());
  }};

  @Override
  public void execute(Rover rover) {
    Direction direction = rover.direction;
    moves.get(direction).move(rover);
  }
}

class RotateLeftCommand implements Command {

  @Override
  public void execute(Rover rover) {
    Direction currentDirection = rover.direction;
    Direction direction = Direction.valueOf(String.valueOf(currentDirection));
    char leftDirection = direction.getLeftDirection();
    rover.direction = Direction.valueOf(String.valueOf(leftDirection));
  }
}

class RotateRightCommand implements Command {

  @Override
  public void execute(Rover rover) {
    Direction currentDirection = rover.direction;
    Direction direction = Direction.valueOf(String.valueOf(currentDirection));
    char rightDirection = direction.getRightDirection();
    rover.direction = Direction.valueOf(String.valueOf(rightDirection));
  }
}
