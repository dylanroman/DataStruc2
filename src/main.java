import java.util.Dictionary;
import java.util.Hashtable;

public class main {

    public static void main(String[] args) {
        Dictionary<Integer, String> myElements = new Hashtable<Integer, String>(); {
            myElements.put(1, "Test_1");
            myElements.put(2, "Test_2");
        }

        menu myMenu = new menu(myElements);
    }
}
