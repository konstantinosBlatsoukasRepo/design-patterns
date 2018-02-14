package kon.blats.design.patterns.structural.adapter;

/**
 * Created by k.blatsoukas on 2/14/2018.
 */
public class Employee {
  private String name;
  private String surname;
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }
}
