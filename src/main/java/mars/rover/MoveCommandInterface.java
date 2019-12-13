package mars.rover;

public interface MoveCommandInterface {

  void move(Rover rover);
}

class MoveNorth implements MoveCommandInterface {

  @Override
  public void move(Rover rover) {
    rover.y += 1;
  }
}

class MoveSouth implements MoveCommandInterface {

  @Override
  public void move(Rover rover) {
    rover.y -= 1;
  }
}

class MoveEast implements MoveCommandInterface {

  @Override
  public void move(Rover rover) {
    rover.x += 1;
  }
}

class MoveWest implements MoveCommandInterface {

  @Override
  public void move(Rover rover) {
    rover.x -= 1;
  }
}