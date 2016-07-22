package study;

public class TestHouse {

	public static void main(String[] args) {
		House prugio = new House();
		prugio.width = 200;
		prugio.height = 30;
		prugio.name = "프루지오";
		
		House raemian = new House();
		raemian.width = 300;
		raemian.height = 50;
		raemian.name = "래미안";
		
		//ctrl + alt + 화살표 아래키
		System.out.println(prugio.name + "(" + prugio.width + "," + prugio.height + ")");
		System.out.println(raemian.name + "(" + raemian.width + "," + raemian.height + ")");
	}

}