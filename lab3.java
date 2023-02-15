import java.util.Scanner;
import java.util.Arrays;

public class lab3{
    private static double meanArray(int[] arr) {
        
            
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double mean =  sum / arr.length;
        return mean;
    }
    private static double medianArray(int[] arr) {
        
            Arrays.sort(arr);
            int n = arr.length;
            if (n % 2 == 0) {
                return (double)(arr[n/2-1] + arr[n/2]) / 2.0;
            } else {
                return (double)arr[n/2];
           
            }
	   
        
    }
    public static double modeArray(int arr[]) {
        int maxValue = 0, maxCount = 0, i, j;
  
        for (i = 0; i < 10; ++i) {
           int count = 0;
           for (j = 0; j < 10; ++j) {
              if (arr[j] == arr[i])
              ++count;
           }
  
           if (count > maxCount) {
              maxCount = count;
              maxValue = arr[i];
           }
        }
        return maxValue;
     }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The array you entered is: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("press 1 to get the mean of array");
        System.out.println("press 2 to get the mean of array");
        System.out.println("press 3 to get the mean of array");
        System.out.println("press 4 to get the summary of array");
        
        int choice = input.nextInt();
      switch (choice) {
        case 1:
        System.out.println("mean : "+meanArray(arr));
         
        break;
        case 2:
        System.out.println("median : "+medianArray(arr));
        break; 

        case 3:
        System.out.println("mode : "+modeArray(arr));
        break;

        case 4:
        System.out.println("mean : "+meanArray(arr));
        System.out.println("mode : "+modeArray(arr));
        System.out.println("median : "+medianArray(arr));
        break;
         
       

        default:
          System.out.println("Invalid choice, try again.");
      }

        }
    }
