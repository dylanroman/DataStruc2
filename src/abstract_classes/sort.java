package abstract_classes;

import java.util.ArrayList;

public abstract class sort {
    //universal variables
    protected ArrayList<Integer> data;

    //abstract run method
    public abstract void sort();

    //getters
    public ArrayList<Integer> getData() {
        return this.data;
    }
}
