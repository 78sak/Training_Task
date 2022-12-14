package java_training;

public class account {
	private double balance = 500.00; 
	  public double  getBalance(int x) {    
	    // logic here
	    return balance;}
	  public static void main(String[] args) {
		    account accnt = new account();            
		    double value = accnt.getBalance(123456);
		    System.out.println("The balance is: " + value);
		  }
}
