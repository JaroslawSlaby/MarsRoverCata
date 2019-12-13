package mars.rover;

public class Rover {

  int x;
  int y;
  Direction direction;

  public Rover(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  void moveNorth() {
    y++;
  }

  void moveSouth() {
    y--;
  }

  void moveEast() {
    x++;
  }

  void moveWest() {
    x--;
  }
}
