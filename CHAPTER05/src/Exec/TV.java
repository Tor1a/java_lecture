package Exec;

interface Device {
	void on();
	void off();
}

public class TV implements Device{
	public static void main(String[] args) {
		TV myTv = new TV();
		myTv.on();
		myTv.watch();
		myTv.off();
	}


	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}
	private void watch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}
}
