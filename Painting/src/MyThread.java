public class MyThread extends Thread {

	public final Canvas canvas;
	
	private int sleepingTime = 15000;

	public MyThread(Canvas canvas) {
		this.canvas = canvas;
		this.setDaemon(true);
	}
	public void run(){
		while (true){
			try {
				System.out.println("going to sleep for "+sleepingTime);
				sleep(sleepingTime);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted");
				
				e.printStackTrace();
			}
			System.out.println("woke up");
			canvas.reset();
			canvas.repaint();
		}
	}
	
	public int getSleepingTime() {
		return sleepingTime;
	}
	public void setSleepingTime(int sleepingTime) {
		this.sleepingTime = sleepingTime;
	}
	
	
}
