package kon.blats.design.patterns.structural.composite;

import java.util.List;

/**
 * Created by kon on 22/4/2018.
 */
public class Directory extends AbstractFileDirectory {
    private String name;
    private int size;
    private List<AbstractFileDirectory> childs;

    public Directory(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public List<AbstractFileDirectory> getChilds() {
        return childs;
    }

    public void setChilds(List<AbstractFileDirectory> childs) {
        this.childs = childs;
    }
}
