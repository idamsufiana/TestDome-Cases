
public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    
    if (sortedArray == null || sortedArray.length == 0)
            return -1;
        
        int totalCount = sortedArray.length;

        if (sortedArray[totalCount - 1] < lessThan) 
            return totalCount;
        
        int low = 0;
        int high = totalCount - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (sortedArray[mid] == lessThan)
                return mid;
            
            if (sortedArray[mid] > lessThan) {
                if (mid >= 1 && lessThan > sortedArray[mid - 1])
                    return mid;
                else
                    high = mid - 1;
            }
                
            
            if (sortedArray[mid] < lessThan) {
                if (mid < totalCount - 1 && lessThan <= sortedArray[mid + 1])
                    return mid + 1;
                else
                    low = mid + 1; 
            }            
        }
        
        return -1;

    
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}