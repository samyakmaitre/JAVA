class GFG{
 
// Function to find a pair in the given
// array whose sum is equal to z
static boolean findPair(int a[], int n, int z)
{
    for(int i = 0; i < n; i++)                   // Iterate through all the pairs
        for(int j = 0; j < n; j++)
            if (i != j && a[i] + a[j] == z)      // Check if the sum of the pair
                return true;
                            // (a[i], a[j]) is equal to z

    return false;
}public static void main(String[] args)          // Driver code
{

    // Given Input
    int a[] = { 1, -2, 1, 0, 5 };
    int z = 0;
    int n = a.length;

    // Function Call
    if (findPair(a, n, z))
        System.out.println("True");
    else
        System.out.println("False");
}
}

