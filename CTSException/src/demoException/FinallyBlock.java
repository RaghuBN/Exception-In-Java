package demoException;

public class FinallyBlock {
	 public static void main(String args[]) 
	  {
	    int num[] = new int[10];
	    num[5] = 5;
	    try 
	    {
	      System.out.println("Accessing the fifth  element:" + num[61]);
	    } 
	    catch (ArrayIndexOutOfBoundsException e) 
	    {
	      System.out.println("Exception thrown  :" + e);
	    }
	    finally 
	    {
	      num[0] = 4;
	      System.out.println("The value of First element is: " + num[0]);
	      System.out.println("The finally statement is always executed");
	    }
	  }
}
