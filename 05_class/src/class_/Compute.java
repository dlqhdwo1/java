package class_;

public class Compute { //1인분
	private int x;
	private int y;
	private int sum;
	private int sub;
	private int mul;
	private double div;
	
	
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
		
	}
	public void setSum(int x, int y) {
		this.sum = x+y;
	}
	public void setSub(int x, int y) {
		this.sub = x-y;
	}
	public void setMul(int x, int y) {
		this.mul = x*y;
	}
	public void setDiv(int x, int y) {
		this.div = (double)x/y;
	}
	
	public int getX() {
		return x;
	}
	public int getY(){
		return y;
	}
	public int getSum() {
		return sum;
	}
	public int getSub() {
		return sub;
	}
	public int getMul() {
		return mul;
	}
	public double getDiv() {
		return div;
	}
	

}
