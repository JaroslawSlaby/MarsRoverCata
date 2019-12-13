package mars.rover;

public class Rover {

  int x;
  int y;
  Direction direction = Direction.N;

  public Rover(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }
}
