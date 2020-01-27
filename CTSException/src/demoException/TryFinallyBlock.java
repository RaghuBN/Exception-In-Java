package demoException;

class TryFinallyBlock {
	public static void main(String args[]){
	    try{
	       int d = 20;
	       int n =0;
	       int fraction = n/d;
	    }
	  catch(ArithmeticException e){
	    System.out.println("In the catch block due to Exception = "+e);
	  }
	  finally{
		System.out.println("Inside the finally block");
	  }
	}
}
