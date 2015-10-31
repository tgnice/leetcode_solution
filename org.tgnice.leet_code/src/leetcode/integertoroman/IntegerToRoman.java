package leetcode.integertoroman;
/*
I	1
II	2
III	3
IV	4
V	5
VI	6
VII	7
VIII	8
IX	9
X	10
XI	11
XII	12
XIII	13
XIV	14
XV	15
XVI	16
XVII	17
XVIII	18
XIX	19
XX	20
XXX	30
XL	40
L	50
LX	60
LXX	70
LXXX	80
XC	90
C	100
CC	200
CCC	300
CD	400
D	500
DC	600
DCC	700
DCCC	800
CM	900
M	1000
 */


public class IntegerToRoman {
	public enum RomanNeumeral{
	    M(1000),CM(900),D(500),CD(400),C(100),XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);
	    private final int value;
	    RomanNeumeral(int value) {
	        this.value = value;
	    }
	    public int getValue(){
	    	return this.value;
	    }
	};
	public String intToRoman(int num) {
	    StringBuilder roman = new StringBuilder();
	    for (RomanNeumeral r :RomanNeumeral.values()) {
	        while (num>=r.getValue()) {
	            roman.append(r);
	            num = num - r.getValue();
	        }
	    }
	    return roman.toString();
	}
	
	public static void main(String[] args){
		IntegerToRoman itr = new IntegerToRoman();
		System.out.println(itr.intToRoman(3999));
	}
}
