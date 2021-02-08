package diagonalDifference;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution{
    public static void main(String[] args) {
        System.out.println("__ diagonalDifference __");
    
        List<List<Integer>> a = new ArrayList<>();

        List<Integer> a1 = new ArrayList<Integer>(
            Arrays.asList(1,2,3)
        );

        List<Integer> a2 = new ArrayList<Integer>(
            Arrays.asList(4,5,6)
        );

        List<Integer> a3 = new ArrayList<Integer>(
            Arrays.asList(9,8,9)
        );

        a.add(a1);
        a.add(a2);
        a.add(a3);

        // for (List<Integer> i : a) {
        //     System.out.println(i);
        // }

        System.out.println(diagonalDifference(a));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumX,sumY,i,j;
        sumX=sumY=i=0;

        j = arr.get(0).size()-1;

        for (List<Integer> a : arr) {
            sumX += a.get(i++);
            sumY += a.get(j--);
        }

        return Math.abs(sumX-sumY);
    }
}