package leetcode.palindrome;

public class Palindrome {
    public boolean isPalindrome(int x) {
	    if(x < 0){
	    	return false;
	    }
	    String base = Integer.toString(x);
	    String reverse = new StringBuilder(base).reverse().toString();
	    if(base.equals(reverse)){
	    	return true;
	    } else {
	    	return false;
	    }
    }
}
