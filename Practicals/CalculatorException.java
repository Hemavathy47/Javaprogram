package programjava;

public class CalculatorException {
	if(n<0 || p<0) {
		throw new Exception("n or p should not be negative");
	}
	else if(n == 0 && p ==0) {
		throw new Exception("n and p should not be zero");
    }
    else {
    return (long) Math.pow(n,p);
		
    }
    public static void main(String[] args) {
    	CalculatorException c = new CalculatorException();
    	System.out.println(c.power(-1,0));
    }

    }
   
