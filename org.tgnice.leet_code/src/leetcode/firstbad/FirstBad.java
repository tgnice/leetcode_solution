package leetcode.firstbad;
/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class FirstBad {
    public int firstBadVersion(int n) {
    	return checkBad(n/2, n);	
    }
    
    private int checkBad(int current , int max){
    	System.out.println("current = " + current + ", max = "+ max);
    	if(max <2){
    		return 1;
    	}else {
	    	if(isBadVersion(current) == false){
	    		if(max-current == 1){
	    			current = current +1;
	    		}
	    		return checkBad(current + (max-current)/2, max);
	    	} else if(isBadVersion(current) == true && isBadVersion(current -1) == false){
	    		return current;
	    	} else {
	    		return checkBad(current - current/2, current);
	    	}
    	}
    }
  /* below is not a part of solution
   * 
   * 
   * */  
    private boolean isBadVersion(int version){
    	if(version >=1702766719){
    		return true;
    	}
    	return false;
    }
    
    public static void main(String[] args){
    	FirstBad fb = new FirstBad();
    	System.out.println(fb.firstBadVersion(2126753390));
    }
}
