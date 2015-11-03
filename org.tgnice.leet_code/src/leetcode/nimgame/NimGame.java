package leetcode.nimgame;

public class NimGame {
    public boolean canWinNim(int n) {
        boolean status = true;
        if(n%4 == 0){
        	status = false;
        }
        return status;
    }
    
    public static void main(String[] args){
    	NimGame ng = new NimGame();
    	System.out.println(ng.canWinNim(8));
    }
}
