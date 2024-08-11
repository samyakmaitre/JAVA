
public class destination {
    public static int steps(int target)
    {
        int count = 1;
        int n = 0;
        if(target%2==0){
            while(target!=n){
                n += count;
                if(n<target){
                    count++;
                }
                else if(n>target){
                    n -= count;
                }
                else{
                    return count;
                }
            }

        }
        //odd target
        else{
            while(target!=n){
                n -= count;
                if(n<target){
                    count--;
                }
                else if(n<target){
                    n += count;
                }
                else{
                    return count;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        steps(4);
    }
}
