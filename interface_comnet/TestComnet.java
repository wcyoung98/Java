package interface_comnet;

public class TestComnet {

	public static void main(String[] args) {
		Comnet[] c = new Comnet[5];
		c[0] = new AhnByungHo();
		c[1] = new AhnJungWoo();
		c[2] = new JangJaeHyun();
		c[3] = new ParkChangYul();
		c[4] = new WonChiYoung();
		
		for(Comnet hanyang : c){
			System.out.println("/*******************************/");
			hanyang.name();
			hanyang.number();
			hanyang.height();
			hanyang.weight();
			System.out.println("/*******************************/");
		}
		
	}

}
