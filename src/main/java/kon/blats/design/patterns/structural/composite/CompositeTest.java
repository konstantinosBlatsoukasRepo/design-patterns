package kon.blats.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kon on 22/4/2018.
 */
public class CompositeTest {
    public static void main(String[] args) {
        File firstFile = new File("myFirstFile.txt", 40);
        File secondFile = new File("mySecondFile.txt", 31);

        //This is the composite object, an object that can hold
        //another composites or leaf objects
        Directory subDirectory = new Directory("subDirectory", 32);

        File thirdFile = new File("myThirdFile.txt", 40);
        File fourthFile = new File("myFourthFile.txt", 31);

        List<AbstractFileDirectory> filesAndDirsForSub = new ArrayList<>();
        filesAndDirsForSub.add(thirdFile);
        filesAndDirsForSub.add(fourthFile);
        subDirectory.setChilds(filesAndDirsForSub);

        List<AbstractFileDirectory> filesAndDirs = new ArrayList<>();
        filesAndDirs.add(firstFile);
        filesAndDirs.add(secondFile);
        filesAndDirs.add(subDirectory);

        Directory rootDirectory = new Directory("rootDirectory", 71);
        rootDirectory.setChilds(filesAndDirs);

        iterateOverTheStrucutre(rootDirectory);
    }

    public static void iterateOverTheStrucutre(AbstractFileDirectory rootDirectory) {
        if (rootDirectory instanceof Directory) {
            List<AbstractFileDirectory> childs = ((Directory) rootDirectory).getChilds();
            if (childs != null) {
                for (AbstractFileDirectory abstractFileDirectory : childs) {
                    iterateOverTheStrucutre(abstractFileDirectory);
                }
            }
        } else {
            File currentFile = (File) rootDirectory;
            System.out.println("Current file: " + currentFile.getName());
        }
    }
}
