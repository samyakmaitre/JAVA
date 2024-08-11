import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        // Base case
        if (rowIndex < 0)
            return row;
        
        // The first row always contains a single element which is 1
        row.add(1);
        
        for (int i = 1; i <= rowIndex; i++) {
            // Calculate the current row based on the previous row
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // First element of each row is always 1            
            // Calculate middle elements using values from the previous row
            for (int j = 1; j < i; j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }
            newRow.add(1); // Last element of each row is always 
            // Update the current row
            row = newRow;
        }                       
        return row;
    }
}
