package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;

	public void gearChange(int afterGear) {
		if (afterGear < 1 || afterGear > 5) {
			System.out.println("ギアは1から5の間で指定してください");
			return;
		}

		System.out.println("ギア" + this.gear + "からギア" + afterGear + "に切り替えました");
		this.gear = afterGear;

		switch (afterGear) {
			case 1: this.speed = 10; break;
			case 2: this.speed = 20; break;
			case 3: this.speed = 30; break;
			case 4: this.speed = 40; break;
			case 5: this.speed = 50; break;
		}
	}

	public void run() {
		System.out.println("現在の速度は " + this.speed + " km/h です。");
	}
}