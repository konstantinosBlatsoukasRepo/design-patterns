package kon.blats.design.patterns.structural.composite;

/**
 * Created by kon on 22/4/2018.
 */
public class AbstractFileDirectory {
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
