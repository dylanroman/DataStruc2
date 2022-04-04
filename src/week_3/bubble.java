package week_3;

import abstract_classes.sort;

import java.util.ArrayList;

public class bubble extends sort {

    public bubble (ArrayList<Integer> data) {
        super.data = data;
    }

    @Override
    public void sort() {
        boolean change = true;

        for(;;) {
            for(int i = 0; i < this.data.size() - 1; i++) {
                change = false;
                if(this.data.get(i) > this.data.get(i + 1)) {
                    int temp = this.data.get(i);
                    this.data.set(i, this.data.get(i + 1));
                    this.data.set(i + 1, temp);
                    change = true;
                }
            }

            if (change == false) {
                break;
            }
        }
    }

    public static void main(String [] args) {
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(2);
        test.add(4);
        test.add(1);
        test.add(5);
        test.add(3);
        bubble mySort = new bubble(test);

        System.out.println(mySort.getData());

        mySort.sort();

        System.out.println(mySort.getData());
    }
}