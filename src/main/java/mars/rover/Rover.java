package mars.rover;

import java.util.HashMap;
import java.util.Map;

class Rover {

  private Map<Direction, MoveCommandInterface> moves = new HashMap<>();
  int x;
  int y;
  Direction direction;

  private Rover(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  static Rover createRover(int x, int y, Direction direction) {
    Rover rover = new Rover(x, y, direction);
    rover.prepareMoves();
    return rover;
  }

  void turnLeft() {
    direction = direction.getLeftDirection();
  }

  void turnRight() {
    direction = direction.getRightDirection();
  }

  void move() {
    moves.get(direction).move();
  }

  private void prepareMoves() {
    moves.put(Direction.N, this::moveNorth);
    moves.put(Direction.S, this::moveSouth);
    moves.put(Direction.E, this::moveEast);
    moves.put(Direction.W, this::moveWest);
  }

  private void moveNorth() {
    y++;
  }

  private void moveSouth() {
    y--;
  }

  private void moveEast() {
    x++;
  }

  private void moveWest() {
    x--;
  }
}
