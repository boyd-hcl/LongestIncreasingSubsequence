package LongestIncreasingSubsequence;

import java.util.*;

public class LongestIncreasingSubsequence{
    public static ArrayList<Integer> getSequence(ArrayList<Integer> a){
        //Start by checking the second element
        int currentIndex = 1;
        //And set current run and longest run variables appropriately
        int currentRun = 1;
        int currentBegin = 0;
        int longestRun = 1;
        int longestBegin = 0;
        if(a.size() == 0){
            return a;
        }
        while(currentIndex < a.size()){
            if(a.get(currentIndex) > a.get(currentIndex - 1)){
                currentRun++;
                if(currentRun > longestRun){
                    longestRun = currentRun;
                    longestBegin = currentBegin;
                }
            }
            else{
                currentRun = 1;
                currentBegin = currentIndex;
            }
            currentIndex++;
        }
        ArrayList<Integer> longest = new ArrayList<Integer>();
        for(int i = longestBegin; i < longestBegin+longestRun; i++){
            longest.add(a.get(i));
        }
        return longest;
    }
}