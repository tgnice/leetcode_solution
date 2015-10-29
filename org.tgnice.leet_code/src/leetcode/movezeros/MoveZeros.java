package leetcode.movezeros;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
    	if(nums.length <=1){
    		return;
    	}
    	int j=0;
        for(int i = 0 ;i < nums.length-j ; i++){
        	if(nums[i] == 0 ){
        		while((i+j) < nums.length && nums[i+j] == 0){
        			j++;
        		}
        		if((i+j) >= nums.length){
        			return;
        		}
        		swap(i, i+j , nums);
        	} 
        }
        for(int i = nums.length-j+1 ; i < nums.length ; i++){
        	nums[i] = 0;
        }
    }
    
    private void swap(int x, int y , int[] base){
    	int tmp = base[x];
    	base[x] = base[y];
    	base[y] = tmp;
    }
    
    public static void main(String[] args){
    	MoveZeros mz = new MoveZeros();
    	mz.moveZeroes(new int[]{0,0});
    }
}
