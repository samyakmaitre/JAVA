import java.util.*;

public class combinationgfg {
    class Solution{
        public List<List<Integer>> CombinationSum(int arr[], int n, int k){
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(arr);
            findCombinations(arr,0,k,new ArrayList<>(), result);

            return result;

        }

        private void findCombinations(int[] arr, int start, int target, List<Integer> current, List<List<Integer>> result){
            if(target == 0){
                result.add(new ArrayList<>(current));
                return;
            }

            for(int i = start; i < arr.length && arr[i] <= target; i++){
                if(i>start && arr[i]==arr[i-1])
                continue;

                current.add(arr[i]);
                findCombinations(arr, i+1, target - arr[i], current, result);
                current.remove(current.size()-1);
            }
        }
    }
}
