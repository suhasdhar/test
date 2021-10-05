package test;

public class Main {

	  public static void main(String args[]) 
	    { 
	        Stack s = new Stack(); 
	        s.push(10); 
	        s.push(20); 
	        s.push(30); 
	        System.out.println(s.pop() + " Popped from stack"); 
	        s.pop();
	        s.display();
	        s.pop();
	        s.display();
	        s.peek();
	        s.pop();
	        s.pop();
	    }

}
