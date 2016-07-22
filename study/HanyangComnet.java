package study;

public class HanyangComnet {
	String studentNumber;
	private int height;
	
	public void setHeight(int height) {
		if(height < 0) {
			this.height = 100;
		} else {
			this.height = height;
		}
	}
	public int getHeight() {
		return this.height;
	}
}
