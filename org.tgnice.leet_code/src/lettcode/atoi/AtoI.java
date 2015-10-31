package lettcode.atoi;

public class AtoI {
    public int myAtoi(String str) {
        long atoI = 0;
        boolean minus = false;
        int plusminusCount =0;
        byte[] base = str.getBytes();
        if(base.length == 0){
        	return 0;
        }
        for(int i = 0 ; i< base.length ; i++){
        	if(base[i] == ' '){
        		if(atoI > 0 || atoI <0 || plusminusCount >= 1){
        			return 0;
        		}
        		continue;
        	} else if(base[i] == '+'){
        		if(atoI > 0 || atoI <0 || plusminusCount >= 1){
        			return 0;
        		}
        		plusminusCount++;
        		continue;
        	}else if(base[i] == '-'){
        		if(atoI > 0 || atoI <0 || plusminusCount >= 1){
        			return 0;
        		}
        		minus = true;
        		plusminusCount++;
        		continue;
        	}else if(base[i] < 48 || base[i]> 57){
        		break;
        	}
        	base[i] = (byte) (base[i]-48);
        	atoI = atoI*10 + base[i];
        	if(i <base.length-1 && base[i+1] == ' '){
        		break;
        	}
        	if(minus == false && i < base.length && (atoI >= Integer.MAX_VALUE)){
        		return Integer.MAX_VALUE;
        	} else if(minus == true && i < base.length && -atoI <= (Integer.MIN_VALUE)){
        		return Integer.MIN_VALUE;
        	}
        }
        if( minus == true){
        	return (int) -atoI;
        }
        return (int) atoI;
    }
    
    public static void main(String[] args){
    	AtoI ati = new AtoI();
    	System.out.println(ati.myAtoi("      -11919730356x"));
    }
}
