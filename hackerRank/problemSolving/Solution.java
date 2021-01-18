package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer[] result = new Integer[]{0,0};
        
        for(int i=0; i<a.size() ; i++){
            if( a.get(i)>b.get(i) ){
                result[0] += 1;
            }else if( b.get(i)>a.get(i) ){
                result[1] += 1;
            }
        }
        
        return Arrays.asList(result);
    }

    public static void main(String[] args) {
        System.out.println("** Compare the triplets ** ");

        Integer[] a = {17,28,30};
        Integer[] b = {99,16,8};

        List<Integer> results = compareTriplets(Arrays.asList(a), Arrays.asList(b));

        for (Integer result : results) {
            System.out.println(result);            
        }

    }
}

