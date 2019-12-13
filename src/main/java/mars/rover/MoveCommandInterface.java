package mars.rover;

@FunctionalInterface
public interface MoveCommandInterface {

  void move(Rover rover);
}
