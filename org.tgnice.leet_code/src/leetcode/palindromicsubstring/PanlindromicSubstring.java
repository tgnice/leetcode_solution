package leetcode.palindromicsubstring;

public class PanlindromicSubstring {
    public String longestPalindrome(String s) {
    	int maxLength = 1;
    	int start = 0;
    	byte[] base = s.getBytes();
    	String panlindromic = null;
    	for(int i =0; i< s.length() ; i++){
    		int j = i;
    		int z = i;
    		while(j>=0 && z< s.length() && (base[j] == base[z])){
    			j--;
    			z++;
    		}
    		if(maxLength < z-j-1){
    			maxLength = z-j-1;
    			start = j+1;
    		}
    		j=i;
    		z=i+1;
    		while(j>=0 && z< s.length() && (base[j] == base[z])){
    			j--;
    			z++;
    		}
    		if(maxLength < z-j-1){
    			maxLength = z-j-1;
    			start = j+1;
    		}
    	}
    	panlindromic = new String(base, start, maxLength);
    	
		return panlindromic;
    }
    
    
    
    public static void main(String[] args){
    	PanlindromicSubstring ps = new PanlindromicSubstring();
    	System.out.println(ps.longestPalindrome("aaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbb"));
    }
}
