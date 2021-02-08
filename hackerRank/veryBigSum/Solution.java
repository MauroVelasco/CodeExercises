package veryBigSum;

class Solution{
    public static void main(String[] args) {
        System.out.println("__ Solution __");
        
        long[] numbers = new long[]{1000000001,1000000002,1000000003,1000000004,1000000005};
        System.out.println("sum: " + aVeryBigSum(numbers));
    }

    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (long i : ar) {
            sum += i;
        }
        return sum;
    }
}