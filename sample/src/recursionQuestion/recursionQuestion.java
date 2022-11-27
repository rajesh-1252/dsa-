package recursionQuestion;

import java.io.Console;
import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.Source;

public class recursionQuestion {
    public static void main(String[] args) {
        int[] x = { 100, 2, 35000, 4000, 500 };
        // System.out.println(traverse(0, x, 0, 0, 100000000));
        System.out.println(binarySearch(x, 0, 4, 500));
    }

    // static void printTriangle(int arr[]) {
    // if (arr.length == 1) {
    // return;
    // }
    // int[] temp = new int[arr.length - 1];

    // helper(temp, arr, 0);
    // printTriangle(temp);
    // System.out.println(Arrays.toString(temp));
    // }

    // static int[] helper(int[] temp, int[] arr, int index) {
    // if (index == arr.length - 1) {
    // return temp;
    // }
    // temp[index] = arr[index] + arr[index + 1];

    // return helper(temp, arr, index + 1);
    // }
    static void printTriangle(int arr[]) {
        if (arr.length == 1) {
            return;
        }
        int[] temp = new int[arr.length - 1];

        helper(arr, temp, 0);
        printTriangle(temp);
        System.out.println(Arrays.toString(temp));

    }

    static int[] helper(int arr[], int temp[], int index) {
        if (index == arr.length - 1) {
            return temp;
        }
        temp[index] = arr[index] + arr[index + 1];
        helper(arr, temp, index + 1);
        return temp;

    }

    int max = 0;

    static int[] traverse(int start, int arr[], int index, int max, int min) {

        if (start == arr.length - 1) {
            int[] ans = new int[2];
            ans[0] = min;
            ans[1] = max;
            System.out.println(Arrays.toString(ans));
            return ans;
        }
        // max
        if (arr[start] > arr[index] & arr[start] > max) {
            max = arr[start];
        }
        if (arr[start] < arr[index] && arr[start] < min) {
            min = arr[start];
        }
        if (index == arr.length - 1) {
            return traverse(start + 1, arr, start, max, min);
        }

        return traverse(start, arr, index + 1, max, min);
    }

    static int binarySearch(int arr[], int s, int e, int target) {
        int mid = ((e + s) / 2);
        if (s > e) {
            return arr[mid];
        }

        if (target == arr[mid]) {
            return arr[mid];
        } else if (arr[mid] > target) {
            return binarySearch(arr, s, e = mid - 1, target);
        } else {
            return binarySearch(arr, s = mid + 1, e, target);
        }
    }
}