package leetcode.twosum;

public class Twosum {
	private int[] indexes;
	public int[] twoSum(int[] nums, int target) {
		indexes = new int[2];
		
		for(int i =0 ; i< nums.length ; i++){
			for(int j = i+1; j< nums.length ; j++){
				if(nums[i] + nums[j] == target){
					indexes[0] = i+1;
					indexes[1] = j+1;
				}
			}
		}
		
		
		return indexes;
	}
	
	public static void main(String[] args){
		Twosum tw=new Twosum();
		int [] a=tw.twoSum(new int[]{-1,-2,-3,-4,-5}, -8);
		for(int i : a){
			System.out.println(i);
		}
	}
}
