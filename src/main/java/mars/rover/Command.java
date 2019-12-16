package mars.rover;

@FunctionalInterface
public interface Command {
  void execute(Rover rover);
}

