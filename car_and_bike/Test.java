package car_and_bike;

public class Test {

	public static void main(String[] args) {
//		Car c = new Car();  //interface여서 객체생성이 불가능
//		AutoBike a = new AutoBike()  //추상적 클래스여서 객체생성이 불가능
		// 객체생성은 구체적인 클래스만 가능
		Honda h = new Honda();  //AutoBike를 상속받은 Honda의 객체를 생성
		
		CarSon s = new CarSon();  //Car를 상속받은 CarSon의 객체를 생성
		s.maxSpeed();
		CarDaughter d = new CarDaughter();  //Car를 상속받은 CarDaughter의 객체를 생성
		d.maxSpeed();
		
		//아빠(Car)의 이름으로 자식(CarSon)객체를 생성
		Car c = new CarSon();  //Car타입으로 CarSon 객체를 생성(다형성[Polymorphism])
		c.maxSpeed();

	}

}