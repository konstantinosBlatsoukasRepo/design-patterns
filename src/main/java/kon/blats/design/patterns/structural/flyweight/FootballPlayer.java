package kon.blats.design.patterns.structural.flyweight;

/**
 * Created by k.blatsoukas on 4/25/2018.
 */
public class FootballPlayer {
  private final String firstName;
  private final String lastName;
  private final String team;
  private final String position;

  public FootballPlayer(String firstName, String lastName, String team, String position) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.team = team;
    this.position = position;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getTeam() {
    return team;
  }

  public String getPosition() {
    return position;
  }
}
