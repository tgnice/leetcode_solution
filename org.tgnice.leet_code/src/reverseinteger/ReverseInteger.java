package reverseinteger;

public class ReverseInteger {

	public int reverse(int base){
		int reversed =0;
		int i =1;
		if( base == 0 ){
			return reversed;
		} else {
			while(base%(Math.pow(10, i-1)) != base){
				int tmp  = reversed;
				tmp = (int) ((base%(Math.pow(10, i)) - base%(Math.pow(10, i-1))) / Math.pow(10, i-1));
				if(Integer.MAX_VALUE / 10 < reversed || Integer.MIN_VALUE / 10 > reversed){
					reversed = 0;
					return reversed;
				}
				reversed = (int) (reversed * 10  + tmp);
				i++;
			}
		}
		return reversed;
	}
	public static void main(String[] args){
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverse(-2147483648));
	}
}
