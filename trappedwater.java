public class trappedwater {
    public static int trapped(int height[]){
        int n = height.length;

        //calculate left max boundary array
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //calculate right max boundary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater = 0;

        //loop
        for(int i=0;i<n;i++){
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];

        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] myarr = {4,2,0,6,3,2,5};
        System.out.println(trapped(myarr));
    }
}


// public boolean isMonotonic(int[] nums){
    //     if(nums[0]<nums[nums.length-1]){
    //         for(int i=0; i<nums.length-1; i++){
    //             if(nums[i]>nums[i+1]){
    //                 return false;
    //             }
    //         }
    //     }else{
    //         for(int i=0; i<nums.length-1; i++){
    //             if(nums[i]<nums[i+1])
    //             {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    // class Solution{
    //     public int findShortestSubarray(int[] nums){
    //         Map<Integer, Integer> freqMap = new HashMap<>();
    //         Map<Integer, Integer> firstOcc = new HashMap<>();
    //         Map<Integer, Integer> LastOcc = new HashMap<>();

    //         int degree = 0;

    //         for(int i=0; i<nums.length; i++){
    //             int num = nums[i];
    //             freqMap.put(num, freqMap.getOrDefault(num,0)+1);
    //             if(!firstOcc.contains.Key(num)){
    //                 firstOcc.put(num,i);
    //             }
    //             lastOcc.put(num,i);
    //             degree = Math.max(degree, freqMap.get(num));
    //         }
    //         int minLength = nums.length;

    //         for(int num : freqMap.keySet()){
    //             if(freqMap.get(num)==degree){
    //                 minLength = Math.min(minLength, lastOcc.get(num)-firstOcc.get(num)+1);
    //             }
    //         }
    //         return minLength;
    //     }
    // }

// class Solution
// {
//     public List<integer> fDN(int[] nums){
//         int n = nums.length;
//         int freq[] = new int[n + 1];
//         List<Integer> ans = new ArrayList<>();
//         for(int i=0; i<n; i++){
//             freq[nums[i]]++;
//         }
//         for(int i = 0; i<n ; i++){
//             if(freq[i]==0){
//                 ans.add(i);
//             }
//         }
//         return ans;
//     }
// }

// class Solution{
//     public int removeDup(int[] nums){
//         if(nums.length == 0){
//             return 0;
//         }
//         int k = 1;
//         for(int i = 11; i<nums.length;i++){
//             if(nums[i]!=nums[i-1]){
//                 nums[k]=nums[i];
//                 k++;
//             }
//         }
//         return k;
//     }
// }
