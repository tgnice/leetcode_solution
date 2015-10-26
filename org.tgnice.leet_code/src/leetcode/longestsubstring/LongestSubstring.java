package leetcode.longestsubstring;

import java.util.LinkedList;
import java.util.Queue;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 1;
        int length = 0;
        byte[] base = s.getBytes();
        Queue<Byte> subPattern = new LinkedList<>();
        if(base.length == 0){
        	return 0;
        }
        int[] bit = new int[256];
        for(int i = 0 ; i< base.length; i++){
        	if(bit[base[i]] == 1){
        		if(length > maxLength){
        			maxLength = length;
        		}
           		while(subPattern.peek().compareTo(base[i]) != 0){
            			bit[subPattern.poll()] = 0;
            			length--;
           		}
        			bit[subPattern.poll()] = 0;
        			length--;
        	}
        	subPattern.add(base[i]);
        	bit[base[i]] = 1;
        	length++;
        }
        if(length > maxLength){
        	maxLength = length;
        }
    	return maxLength;
    }
	
    public static void main(String[] args){
    	LongestSubstring ls = new LongestSubstring();
    	System.out.println(ls.lengthOfLongestSubstring("aab"));
    }
    
}
