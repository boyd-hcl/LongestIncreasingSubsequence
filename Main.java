package LongestIncreasingSubsequence;

import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> arr = SequenceGenerator.generateSequence(100, 1000);
        ArrayList<Integer> longest = LongestIncreasingSubsequence.getSequence(arr);
        System.out.println("Array: " + arr);
        
        System.out.println("Longest increasing subsequence: " + longest);
    }
}
