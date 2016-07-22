package study;

public class TestCarFactory {

	public static void main(String[] args) {
//		CarFactory sonata = new CarFactory("소나타", "레드");
//		CarFactory avante = new CarFactory("아반떼", "블랙");
//		CarFactory grandeur = new CarFactory("그랜져", "블루");
//		System.out.println(sonata);
//		System.out.println(avante);
//		System.out.println(grandeur);
		
		//Object Array
		CarFactory[] car = new CarFactory[5];
		car[0] = new CarFactory("소나타", "블랙");
		car[1] = new CarFactory("그랜져", "화이트");
		car[2] = new CarFactory("아반떼", "옐로우");
		car[3] = new CarFactory("말리부", "레드");
		car[4] = new CarFactory("크루즈", "블루");
		
		for(CarFactory cars: car){
			System.out.println(cars);
		}
	}

}