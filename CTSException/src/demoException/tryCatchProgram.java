package demoException;

public class tryCatchProgram {
	public static void main(String args[])
    {
       try {
          int num[] = new int[10];
          System.out.println("Accessing the element :" + num[7]);
       }
       catch (ArrayIndexOutOfBoundsException e) 
       {
          System.out.println("Exception thrown  :" + e);
       }
       System.out.println("Out of the block");
    }
 }

