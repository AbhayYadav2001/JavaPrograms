package unit_01;

public class P2_Task02_ConstantInJava {
	static final double PI=3.14;

	public static void main(String[] args) {
		//Cont. in Java
		//piece of code/data that would never change
		System.out.println("Value of PI ::");
		System.out.println(PI);
		
		//final field P2_Task02_ConstantInJava PI cannot be assigned 
		//we can't be change the value of constant...
		
		PI=4.14;
	    Abc obj=new Abc();
	    System.out.println("Value of g ::");
	    System.out.println(obj);
	}
	
	public static void main(String args) {
		
		System.out.println("Value of PI ::");
		System.out.println(PI);
}
}
 class Abc 
 {
	 final double g=9.8;
	 void main(String args) {
		 System.out.println("Value of g ::");
		 System.out.println(g);
	 }
 }
