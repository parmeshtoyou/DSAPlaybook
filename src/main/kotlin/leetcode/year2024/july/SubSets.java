package leetcode.year2024.july;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), subsets);
        return subsets;
    }

    public void generateSubsets(int index, int nums[],
                                List<Integer> current, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(current));
        for(int i = index; i<nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(i + 1, nums, current, subsets);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        SubSets subSets = new SubSets();
        List<List<Integer>> result = subSets.subsets(new int[]{1,2,3});
        for (List<Integer> list: result){
            System.out.println(list);
        }
    }
}
