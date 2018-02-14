package kon.blats.design.patterns.creational.singleton;

import java.util.Objects;

/**
 * Created by k.blatsoukas on 2/1/2018.
 */
// This class returns the singleton instance through a public static method
public class SingletonExampleSecondWay {

  private static final SingletonExampleSecondWay INSTANCE = new SingletonExampleSecondWay();

  private SingletonExampleSecondWay() {}

  public static SingletonExampleSecondWay getInstance() {
    return INSTANCE;
  }

  public static void main(String[] args) {
    Objects.requireNonNull(null);

    SingletonExampleSecondWay iAmTheOnlyInstance = SingletonExampleSecondWay.getInstance();
    System.out.println("iAmTheOnlyInstance = " + iAmTheOnlyInstance);

    SingletonExampleSecondWay aTryToCreateASecondInstance = SingletonExampleSecondWay.getInstance();
    System.out.println("aTryToCreateASecondInstance = " + aTryToCreateASecondInstance);

    if (aTryToCreateASecondInstance == iAmTheOnlyInstance) {
      System.out.println("Both variables are referring to the same object");
    } else {
      System.out.println("The above singleton doesn't works properly");
    }


  }
}
