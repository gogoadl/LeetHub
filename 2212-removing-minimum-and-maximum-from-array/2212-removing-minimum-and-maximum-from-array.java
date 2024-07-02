import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int minimumDeletions(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int val: nums) {
            list.add(val);
        }
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        int minIdx = list.indexOf(min);
        int maxIdx = list.indexOf(max);
        int size = list.size();
        if (size <= 2) return size;
        int rMin = Math.min(minIdx, maxIdx)+1;
        int rMax = Math.max(maxIdx, minIdx)+1;


        return Math.min(size - rMin+1,Math.min(rMax,rMin + size-rMax+1));
    }
}