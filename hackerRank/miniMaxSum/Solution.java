package miniMaxSum;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution{
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};

        miniMaxSum(a);
    }

    static void miniMaxSum(int[] arr) {
        long min,max,sum;
        min=max=sum=0;

        for(int i=0; i<arr.length; i++ ){
            sum = 0;
            for(int j=0; j<arr.length; j++ ){
                if(i!=j){
                    sum += arr[j];
                }
            }

            if( i==0 ){
                min = sum;
                max = sum;
                continue;
            }

            if(sum<min){
                min = sum;
            }

            if(sum>max){
                max = sum;
            }
        }

        System.out.println(min + " " + max);
    }

}