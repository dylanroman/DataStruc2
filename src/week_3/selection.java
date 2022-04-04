package week_3;

import abstract_classes.sort;

import java.util.ArrayList;

public class selection extends sort {

    public selection (ArrayList<Integer> data) {
        super.data = data;
    }

    @Override
    public void sort() {
        for(int i = 0; i < this.data.size() - 1; i++) {
            int current = i;

            while(this.data.get(current + 1) < this.data.get(current)) {
                int temp = this.data.get(current);
                this.data.set(current, current + 1);
                this.data.set(current, temp);
                current --;
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
        selection mySort = new selection(test);

        System.out.println(mySort.getData());

        mySort.sort();

        System.out.println(mySort.getData());
    }
}