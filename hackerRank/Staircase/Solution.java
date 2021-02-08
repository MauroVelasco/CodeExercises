package Staircase;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution{
    public static void main(String[] args) {
        System.out.println("__ StairCase __");    

        staircase(3);
    }

    static void staircase(int n) {
        for(int x=n ; x>0 ; x--){
            int numSpaces = x-1;
            int numSymbols = n-numSpaces;

            for(int j=0; j<numSpaces ; j++ ){
                System.out.print(" ");
            }
            for(int i=0; i<numSymbols ; i++ ){
                System.out.print("#");
            }
            System.out.print("\n");    
        }
    }

}