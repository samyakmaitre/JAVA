public class arraycc {

    public static void printSA(int arr[])
    {
        int lrg = Integer.MIN_VALUE;
        
        for (int i=0;i<arr.length;i++)
        {
            for(int j = 0;j<arr.length;j++){
                int curr = 0;
                for(int k=i;k<=j;k++)
                {   
                    curr = curr + arr[k] ;
                    if(curr>lrg){
                        lrg = curr;
                    }
                    
                }
                System.out.print(curr+" ");
                
            }
            System.out.println();
        }
        System.out.println(lrg);
    }

    public static void main(String args[]){
        int myarr[] = {1,-2,6,-1,3};
        printSA(myarr);
    }
}
