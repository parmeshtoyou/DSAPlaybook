package leetcode.year2024.aug;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray {
    public static void main(String[] args) {
        PermutationArray permutationArray = new PermutationArray();
        List<List<Integer>> resultList = permutationArray.permutation(new int[]{1,2,3,4});
        for (List<Integer> result : resultList) {
            System.out.println(result);
        }
    }

    private List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        backTracking(resultList, new ArrayList<>(), nums);

        return resultList;
    }

    private void backTracking(List<List<Integer>> resultList, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            return;
        }

        for (int num: nums) {
            if(tempList.contains(num)) {
                continue;
            }
            tempList.add(num);
            backTracking(resultList, tempList, nums);
            tempList.remove(tempList.size() -1);
        }
    }
}
