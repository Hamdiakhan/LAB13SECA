package lab2;

public class MyThread1 extends Thread{
	TextManipulator t;
	MyThread1(TextManipulator t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}

}
