
public class ex804 extends Math {

	public static void main(String[] args) {
		int a = 10, b = 5;
		double c = 2.5, d = 4.5;
		
		ex804 calc = new ex804();
		//Add 더하기
		System.out.println(a + "+" + b + "=" + calc.add(a,b)); //(int,int)
		System.out.println(a + "+" + c + "=" + calc.add(a,c)); //(int,double)
		System.out.println(c + "+" + d + "=" + calc.add(c,d)); //(double,double)
		
		//Divide 나누기
		System.out.println(a + "/" + b + "=" + calc.div(a,b)); //(int,int)
		System.out.println(a + "/" + c + "=" + calc.div(a,c)); //(int,double)
		System.out.println(c + "/" + d + "=" + calc.div(c,d)); //(double,double)
		//Square 제곱하기
		System.out.println(a + "^2" + "=" + calc.sqr(a)); //(int,int)
		System.out.println(b + "^2" + "=" + calc.sqr(b)); //(int,double)
		System.out.println(c + "^2" + "=" + calc.sqr(c)); //(double,double)
		System.out.println(d + "^2" + "=" + calc.sqr(d)); //(double,double)
	}

}
