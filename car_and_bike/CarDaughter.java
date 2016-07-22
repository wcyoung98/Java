package car_and_bike;

public class CarDaughter implements Car{
	public void maxSpeed(){
		//Car의 추상적 프로토타입 maxSpeed의 애매한 선언을
		// 좀 더 구체적으로 구현한다.
		System.out.println("CarDaughter는 조금 빨라요");
	}
}