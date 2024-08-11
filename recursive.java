public class recursive {

    public static void printDec(int n){
        if(n<1){
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        
        if(n==1){
            System.out.println(n + " ");
            return;
        }
        printInc(n-1);
        System.out.println(n + " ");
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f = n * fact(n-1);
        return f;
    }

    public static int sum(int n){
        if(n==0){
            return n;
        }
    
        return n + sum(n-1);
    }

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static boolean func(int[] arr , int i){
        if(i == arr.length-1){
            return true;
        }        

        if(arr[i]>(arr[i+1])){
                return false;
        }        
        return func(arr, i+1);
    }

    public static int foc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return foc(arr, key, i+1);
    }

    public static int loc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return foc(arr, key, i+1);
            
        }
        return i;
        
    }

    public static int pow(int i, int n){
        if(n==0){
            return 1;
        }
        return i*pow(i ,n-1);
    }


    public static void main(String args[]){
        
        int result = pow(5,3);
        System.out.println(result);
    }



    
    
}
