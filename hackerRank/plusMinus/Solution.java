package plusMinus;

import java.text.DecimalFormat;

class Solution{
    public static void main(String[] args) {
        System.out.println("__ Solution __");
        
        int[] arr = new int[]{-4, 3, -9, 0, 4, 1};

        plusMinus(arr);
    }

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float numOfPositives, numOfNegatives, numOfCero;
        numOfPositives = numOfNegatives = numOfCero = 0f;

        for (int i : arr) {
            if( i>0 ){
                ++numOfPositives;
            }else if( i<0 ){
                ++numOfNegatives;
            }else {
                ++numOfCero;
            }
        }

        float resultPositives = numOfPositives/arr.length; 
        float resultNegatives = numOfNegatives/arr.length;
        float resultCero = numOfCero/arr.length;

        String format = "0.000000";
        DecimalFormat weirdFormatter = new DecimalFormat(format);

        System.out.println(weirdFormatter.format(resultPositives));
        System.out.println(weirdFormatter.format(resultNegatives));
        System.out.println(weirdFormatter.format(resultCero));
    }
}