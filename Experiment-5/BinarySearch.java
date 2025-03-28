import java.util.Scanner;
import java.util.Arrays;

class BinarySearch {
    
    void define(int arr[], int n, int item) { 
        Arrays.sort(arr);
        
 
        int low = 0;
        int high = n - 1;
        boolean found = false;       
        while (low <= high) {
            int mid = (low + high) / 2;
            
    
            if (arr[mid] == item) {
                System.out.println("Item found at position: " + (mid + 1));
                found = true;
                break;
            }
        
            else if (arr[mid] < item) {
                low = mid + 1;
            }
        
            else {
                high = mid - 1;
            }
        }
        
   
        if (!found) {
            System.out.println("Item not found");
        }
    }

    public static void main(String args[]) {
        int n, item, i;
        Scanner sc = new Scanner(System.in);
        BinarySearch binSearch = new BinarySearch();
        
     
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        
        int[] arr = new int[n];
        
    
        System.out.println("Enter " + n + " numbers: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
      
        System.out.println("Enter the number to be searched: ");
        item = sc.nextInt();
        
       
        binSearch.define(arr, n, item);
    }
}

