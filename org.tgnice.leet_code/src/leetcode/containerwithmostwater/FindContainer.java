package leetcode.containerwithmostwater;

public class FindContainer {
    public int maxArea(int[] height) {
    	int maxCapacity = 0;
    	int tmp = 0;
    	int min;
    	min = height[0] < height[height.length-1] ? height[0] : height[height.length-1];
    	maxCapacity = min*(height.length-1);
    	int i =0;
    	int j = height.length-1;
    	while(i<j){
    		tmp = Math.max(maxCapacity, height[i] < height[j] ? height[i]*(j-i) : height[j]*(j-i));
    		if(maxCapacity < tmp){
    			maxCapacity = tmp;
    		}
    		while(i<j && height[i] <= maxCapacity/(j-i) ){
    			i++;
    		}
    		while(i<j && height[j] <= maxCapacity/(j-i)){
    			j--;
    		}
    	}
    	return maxCapacity;
    }
    
    public static void main(String[] args){
    	FindContainer fc = new FindContainer();
    	System.out.println(fc.maxArea(new int[]{1,1}));
    }
}

