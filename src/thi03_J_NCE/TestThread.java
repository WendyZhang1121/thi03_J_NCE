package thi03_J_NCE;

import java.util.Vector;

public class TestThread implements Runnable {

	private Vector vector; //...
	
	public void run() { 
		if (vector.isEmpty()) {
			try {
				vector.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	// Resume when condition holds 
		}
	}
	
	public static void main(String[] args) { 
		for (int i = 0; i < 5; i++) {
			new Thread(new TestThread()).start(); 
			}
		}
}
