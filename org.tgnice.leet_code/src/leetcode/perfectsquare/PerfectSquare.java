package leetcode.perfectsquare;

public class PerfectSquare {
	int nSquare;
	int minN;
    public int numSquares(int n) {
    	this.nSquare = 0;
    	this.minN = Integer.MAX_VALUE;
        int square = (int) Math.sqrt(n);
      //  System.out.println("square =" + square);
        findSquare(square, n);
    	return minN;
    }
    private void findSquare(int start , int n){
    //	System.out.println("start = " + start +", n = " + n + ", nSquare = " + nSquare);
    	if(n == 0 ){
    		if(minN > nSquare){
    			minN = nSquare;
    		}
    	} else if(n < 0) {
    		return;
    	}
    	nSquare++;
    	for( int i = start ; i >= 1 ; i--){
    		if (nSquare >= minN){
    			break;
    		}else if( n < i*i){
    			continue;
    		} else
    		findSquare(i, n - (i*i));
    	}
    	nSquare--;
		return;
    }
    
    public static void main(String[] args){
    	PerfectSquare ps = new PerfectSquare();
    	System.out.println(ps.numSquares(230));
    }
}
