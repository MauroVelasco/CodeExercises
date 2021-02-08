package birthdayCakeCandles;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

class Solution{
    public static void main(String[] args) {
        System.out.println("__ birthdayCakeCandles __");

        List<Integer> candles = new ArrayList<Integer>(
            Arrays.asList(1,2,3,4,5,4,3,2,3)
        );
        System.out.println( birthdayCakeCandles(candles) );
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        Map<Integer,Integer> result = new HashMap<Integer,Integer>();
        int newCandlesAmount = 0;
        int maxAmount = 0;

        for (Integer candle : candles) {
            if( !result.containsKey(candle) ){
                result.put(candle, 1);
                continue;
            }

            newCandlesAmount = result.get(candle) +1;
            result.put(candle, newCandlesAmount);
             
            if(newCandlesAmount>maxAmount){
                maxAmount=newCandlesAmount;
            }
        }
        return maxAmount;
    }

}