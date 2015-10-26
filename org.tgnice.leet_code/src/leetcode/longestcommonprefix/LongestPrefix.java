package leetcode.longestcommonprefix;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        String str = new String();
        int capacity = strs.length;
        int minLength = Integer.MAX_VALUE;
        if(capacity ==0){
        	return new String();
        } else if(capacity == 1){
        	return strs[0];
        }
        for(int i = 0; i<capacity;i++){
        	if(minLength >strs[i].length()){
        		minLength = strs[i].length();
        	}
        }
        
        for(int i = 0 ; i< minLength ; i++){
        	for(int j = 0 ; j< capacity-1; j++){
        		if( strs[j].charAt(i) != strs[j+1].charAt(i)){
        			return str;
        		}
        	}
        	str = str + strs[0].charAt(i);
        }
    	return str;
    }
}
