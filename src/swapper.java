import java.util.ArrayList;
import java.util.Scanner;

public class swapper extends funcMaster{
    private ArrayList<Integer> nums;

    public swapper(String selection, ArrayList<Integer> nums) {
        super.selection = selection;
        this.nums = nums;

    }

    @Override
    public String getSelection() {
        return this.selection;
    }

    public void setNums(ArrayList<Integer> nums) {
        this.nums = nums;
    }

    @Override
    public void run() {
        //Before statement
        System.out.println("Before: " + nums.get(0) + " " + nums.get(1));

        //Switcher
        if(nums.get(0) > nums.get(1)) {
            Integer temp = nums.get(1);
            nums.set(1, nums.get(0));
            nums.set(0, temp);
        }

        //After statement
        System.out.println("After: " + nums.get(0) + " " + nums.get(1));

    }
}