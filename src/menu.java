import java.util.Dictionary;

public class menu {

    //Initialize variables
    private Dictionary elements;

    //Constructor
    public menu (Dictionary elements) {
        //Takes dictionary as input
        this.elements = elements;
    }

    //Iterate over dictionary and print all values
    public void print() {
        for(int i = 1; i <= this.elements.size(); i++) {
            System.out.print(i + " ");
            System.out.println(elements.get(i));
        }
    }


}