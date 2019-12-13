package mars.rover;

public enum Direction {
  N('W', 'E'),
  E('N', 'S'),
  S('E', 'W'),
  W('S', 'N');

  private char leftDirection;
  private char rightDirection;

  Direction(char leftDirection, char rightDirection) {
    this.leftDirection = leftDirection;
    this.rightDirection = rightDirection;
  }

  public char getLeftDirection() {
    return leftDirection;
  }

  public char getRightDirection() {
    return rightDirection;
  }
}
