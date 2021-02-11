package LongestIncreasingSubsequence;

import java.util.*;

public class SequenceGenerator{
    public static ArrayList<Integer> generateSequence(int length, int max){
        ArrayList<Integer> a = new ArrayList<Integer>();
        Random rn = new Random();
        for(int i = 0; i < length; i++){
            a.add(rn.nextInt(max+1));
        }
        return a;
    }
}