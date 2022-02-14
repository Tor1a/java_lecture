package ch1;

class Weapon{
	protected int fire() {
		return 1;
	}
}
class Cannon extends Weapon{

	@Override
	protected int fire() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}

public class MethodOverridingEx03 {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("기본무기의 attackd은"+weapon.fire());
		
		weapon = new Cannon();
		System.out.println("업그레이드 무기의 attacked은"+weapon.fire());
	}
}
