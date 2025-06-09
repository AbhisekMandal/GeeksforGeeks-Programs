// arr = {10,20,30,60,40,50}
//largestNum = arr[0], secLargest = arr[1]

import java.util.Arrays;
public class SecondLargestNumber {
    public static int secondLargest(int[] arr){
      int largestNum = arr[0];
      int seclargeNum = arr[1];
      for(int n : arr){
          if(n > largestNum){
              seclargeNum = largestNum;
              largestNum = n;
          }

      }
        return seclargeNum;
    }

    public static void main(String[] args) {
        int[] arr = {20,10,50,30,60,40};
        Arrays.sort(arr);
        System.out.println("Second Largest number is : "+  SecondLargestNumber.secondLargest(arr));
    }
}
