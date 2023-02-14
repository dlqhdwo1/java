package class__;
class Fruit {
	
	//sumJan, sumFeb, sumMar  : 1월의합계  2월의합계 3월의합계
	private String pum;
    private int jan;
	private int feb;
	private int mar;
	private int tot;
	static private int sumJan;
	static private int sumFeb;
	static private int sumMar;
	
	Fruit(String pum, int jan, int feb, int mar){
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		
	}
	
	public void calc() {
		tot = jan + feb + mar;
	}
	
	public void display() {
		System.out.println(pum+"\t" + jan + "\t" + feb + "\t" + mar + "\t"+ tot);
		sumJan +=getJan();
		sumFeb +=getFeb();
		sumMar +=getMar();
	}
	
	public static void output() {
		System.out.println("\t"+sumJan + "\t" + sumFeb + "\t" + sumMar);
	}
	
	public int getSumJan() {
		return sumJan;
	}

	public void setSumJan(int sumJan) {
		this.sumJan =sumJan;
	}

	public int getSumFeb() {
		return sumFeb;
	}

	public void setSumFeb(int sumFeb) {
		this.sumFeb = sumFeb;
	}

	public int getSumMar() {
		return sumMar;
	}

	public void setSumMar(int sumMar) {
		this.sumMar = sumMar;
	}

	public String getPum() {
		return pum;
	}

	public void setPum(String pum) {
		this.pum = pum;
	}

	public int getJan() {
		return jan;
	}

	public void setJan(int jan) {
		this.jan =jan;
	}

	public int getFeb() {
		return feb;
	}

	public void setFeb(int feb) {
		this.feb = feb;
	}

	public int getMar() {
		return mar;
	}

	public void setMar(int mar) {
		this.mar = mar;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}
	
}

//----------------------------------------------------
public class FruitMain {
	public static void main (String[] args) {
		Fruit[] f= new Fruit[3];
	
		f[0] = new Fruit("사과",100,80,75);
		f[1] = new Fruit("포도",30,25,10);
		f[2] = new Fruit("딸기",25,30,95);
		


		System.out.println("[실행결과]\r\n"
				+ "---------------------------------\r\n"
				+ "PUM      JAN   FEB   MAR      TOT");
		for(int i=0; i<f.length;i++) {
	
			f[i].calc();
			f[i].display();
//			System.out.print(f[i].getPum() + "\t");
//			System.out.print(f[i].getJan()+ "\t");
//			System.out.print(f[i].getFeb()+ "\t");
//			System.out.print(f[i].getMar()+ "\t");
//			System.out.println(f[i].getTot());
			
		
		}
	
		System.out.println("---------------------------------");
		Fruit.output();

	}
}


/*
과일 판매량 구하기
월별 매출합계도 구하시오

메소드 : 생성자(품명, 1월, 2월, 3월)
		calcTot()
		display()
		public static void output()
		
클래스 : Fruit
필드 : pum, jan, feb, mar, tot
       sumJan, sumFeb, sumMar  : 1월의합계  2월의합계 3월의합계

생성자(품명, 1월, 2월, 3월)
calcTot()
display()
public static void output()

클래스 : FruitMain

[실행결과]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
사과    100    80    75     255
포도     30    25    10     xxx
딸기     25    30    90     xxx
---------------------------------
        xxx   xxx   xxx            output()로 처리


*/