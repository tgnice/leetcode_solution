package leetcode.romantointeger;

public class RomanToInteger {
	public enum RomanNeumeral{
	    M(1000),CM(900),D(500),CD(400),C(100),XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);
	    private final int value;
	    RomanNeumeral(int value) {
	        this.value = value;
	    }
	    public int getValue(){
	    	return this.value;
	    }
	    
	    public byte[] getAsByte(){
	    	return this.toString().getBytes();
	    }
	    
	};
	
    public int romanToInt(String s) {
        int converted=0;
        byte[] roman = s.getBytes();
        for(int i = 0 ; i< roman.length ; i++){
        	for( RomanNeumeral r : RomanNeumeral.values()){
        		if( r.getAsByte().length == 2 && roman.length - i>= 2){
        			if(r.getAsByte()[0] == roman[i] && r.getAsByte()[1] == roman[i+1]){
        				System.out.println(r);
        				converted = converted + r.getValue();
        				i++;
        				break;
        			}
        		}
        		else if(r.getAsByte().length == 1){
        			if(r.getAsByte()[0] == roman[i] ){
        				System.out.println(r);
        				converted = converted + r.getValue();
        				break;
        			}
        		}
        	}
        }
        return converted;
    }
    
	public static void main(String[] args){
		RomanToInteger rti = new RomanToInteger();
		System.out.println(rti.romanToInt("MDCCCLXXXIV"));
		System.out.println((char)RomanNeumeral.C.getAsByte()[0]);
	}
}
