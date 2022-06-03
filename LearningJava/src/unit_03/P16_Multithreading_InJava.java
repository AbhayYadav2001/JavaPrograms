package unit_03;

import java.util.Scanner;
//question: why our code starts from first line of public static void main (String [] args){}..... )  
/*
 * Multi-Threading  
 * 
 * Multi-Processing
 *   -Sequential Multi-Processing
 *   -Parallel Multi-Processing 
 *   -concurrent Multi-Processing
 *  
 * Multi-Tasking
 *   -Sequential Multi-Tasking
 *   -Parallel Multi-Tasking
 *   -concurrent Multi-Tasking
 * 
 */
public class P16_Multithreading_InJava {

	public static void main(String[] args) {
		
//		Threading obj=new Threading();
//		obj.threadConcept();
//		obj.threadSynchronization();
//		obj.interThreadCommunication();
//		obj.ProducerConsumersProblems();
//		obj.Wait_And_Notify();  
		
		Thread t1 = new Thread(new T1(),"T1");
		Thread t2 = new Thread(new T2(),"T2");
		Thread t3 = new Thread(new T3(),"T3");
		t1.start();
		t2.start();
		t3.start();
		
		
//		c1 obj1=new c1(); 
//		obj1.show1();
//		c2 obj2=new c2();
//		obj2.show2();
	}

}
class Threading
{
	void threadConcept()
	{
		
	}
	void threadSynchronization()
	{
		
	}
	void interThreadCommunication()
	{
		
	}
	void ProducerConsumersProblems()
	{
		
	}
	void Wait_And_Notify()
	{
		
	}
}
class c1{
	void show1() {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		System.out.println(a);
		sc.close();
	}
}
class c2{
	void show2() {
		for(int i=0;i<10;i++) {
			System.out.println("ROCKY");
		}
	}
}
class T1 extends Thread{
	public void run() {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		System.out.println(a);
		sc.close();
	}
}
class T2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("ROCKY-Thread");
		}
	}
}
class T3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("ROCKY-Thread-3");
		}
	}
}