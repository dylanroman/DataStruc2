import abstract_classes.funcMaster;

public class exit extends funcMaster {

    public exit(String selection) {
        super.selection = selection;
    }

    @Override
    public void run() {
        System.out.println("Exiting");
        System.exit(0);
    }
}
