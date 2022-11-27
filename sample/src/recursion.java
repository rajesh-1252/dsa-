import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class recursion {

   public static void main(String[] args) {

      int[] arr = { 9, 8, 7, 6 };
      bubbleSort(arr, arr.length - 1, 0);
      System.out.println(Arrays.toString(arr));
   }

   static void message(int n) {

      if (n == 0) {
         return;
      }
      message(n - 1);
      System.out.println(n);

   }

   static int factorial(int n) {
      if (n < 3) {
         return n;
      }
      return n * factorial(n - 1);
   }

   static int sumOfDigts(int n) {
      // int rem = n/10 ;
      // int last = n % 10 ;
      if (n == 0) {
         return 0;
      }

      return (n % 10) + sumOfDigts(n / 10);
   }
   // static int reverse (int n) {
   // return helper(n, 0);

   // }

   // static int helper(int n, int num) {
   // int rem = n / 10 ;
   // int last = n % 10;
   // if (rem ==n ) {
   // return num ;
   // }
   // return helper(rem, num * 10 + last );
   // }
   // count number of zeros
   static int count(int n) {

      return helper(n, 0);
   }

   static int helper(int n, int c) {
      int last = n % 10;
      if (n == 0) {
         return c;
      }
      if (last == 0) {
         return helper(n / 10, c + 1);
      }
      return helper(n / 10, c);

   }

   static boolean sortedArr(int[] arr, int index) {
      if (index == arr.length - 1) {
         return true;
      }
      return arr[index] < arr[index + 1] && sortedArr(arr, index + 1);
   }

   static boolean searchArr(int[] arr, int index, int target) {
      if (index == arr.length) {
         return false;
      }
      if (arr[index] == target) {
         return true;
      }

      // recurrence relation
      return searchArr(arr, index + 1, target);
   }

   static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
      ArrayList<Integer> list = new ArrayList<>();

      if (index == arr.length) {
         return list;
      }
      if (arr[index] == target) {
         list.add(index);
      }

      ArrayList<Integer> ansFromBellowCalls = findAllIndex(arr, target, index + 1);
      list.addAll(ansFromBellowCalls);
      // System.out.println(ansFromBellowCalls);

      return list;
   }

   static void pattern1(int r, int c) {
      if (r == 0) {
         return;
      }
      if (c < r) {
         System.out.print('*');
         pattern1(r, c + 1);
      } else {
         System.out.println();
         pattern1(r - 1, 0);
      }

   }

   static void bubbleSort(int arr[], int r, int c) {
      if (r == 0) {
         return;
      }
      if (c < r) {
         if (arr[c] > arr[c + 1]) {
            int temp = arr[c];
            arr[c] = arr[c + 1];
            arr[c + 1] = temp;
         }
         bubbleSort(arr, r, c + 1);
      } else {
         bubbleSort(arr, r - 1, 0);
      }
   }

   static void selectionSort(int[] arr, int r, int c) {

   }

}
