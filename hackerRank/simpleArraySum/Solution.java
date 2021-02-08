package simpleArraySum;

class Solution {
    
    public static void main(String[] args) {
        System.out.println("__ simpleArraySum __");
        
        int[] a = new int[]{1,2,3};

        System.out.println("sum: " + simpleArraySum(a));
    }

        /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int i : ar) {
            sum += i;
        }
        return sum;
    }

}