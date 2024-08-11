public class ion {

    public static void sIdx(int[] nums){
        int tow = 0;
        int minLeft= Integer.MIN_VALUE;
        int minRight = Integer.MAX_VALUE;
        int[] idx = new int[nums.length];
        while(tow < nums.length)
        {
            //left
            for(int i=0; i<tow; i++){
                if(nums[i]<nums[tow]){
                    minLeft = i;
                }else{
                    minLeft = -1;
                }
            }
            //right
            for(int j=nums.length-1; j<tow+1; j++){
                if(nums[j]<nums[tow]){
                    minRight = j;
                }
                else{
                    minRight = -1;
                }
            }
            idx[tow] = Math.min(minLeft,minRight);
            tow++;
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(idx[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] arr = {4, 8, 3, 5, 3};
        sIdx(arr);
    }
}
