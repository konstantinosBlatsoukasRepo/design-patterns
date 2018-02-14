package kon.blats.design.patterns.creational.singleton;

/**
 * Created by k.blatsoukas on 2/1/2018.
 */
// This class returns the singleton instance through a public static field
public class SingletonExampleOneWay {
  public static final SingletonExampleOneWay INSTANCE = new SingletonExampleOneWay();

  private SingletonExampleOneWay() {}

  public static void main(String[] args) {
    SingletonExampleOneWay iAmTheOnlyInstance = SingletonExampleOneWay.INSTANCE;
    System.out.println("iAmTheOnlyInstance = " + iAmTheOnlyInstance);

    SingletonExampleOneWay aTryToCreateASecondInstance = SingletonExampleOneWay.INSTANCE;
    System.out.println("aTryToCreateASecondInstance = " + aTryToCreateASecondInstance);

    if (aTryToCreateASecondInstance == iAmTheOnlyInstance) {
      System.out.println("Both variables are referring to the same object");
    } else {
      System.out.println("The above singleton doesn't works properly");
    }
  }

}
