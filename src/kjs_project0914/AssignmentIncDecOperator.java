package kjs_project0914;

public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3, b=3, c=3;
	    a += 3; // a=a+3 = 6
		b *= 3; // b=b*3 = 9
		c %= 2; // c=c%2 = 1
		System.out.println
		("a=" + a + ", b=" + b + ", c=" + c);
		int d=3;
		a = d++; // a=3, d=4
		System.out.println("a=" + a + ", d=" + d);
		a = ++d; 
		System.out.println("a=" + a + ", d=" + d);
		a = d--; 
		System.out.println("a=" + a + ", d=" + d);
		a = --d; // d=3, a=3
		System.out.println("a=" + a + ", d=" + d);
	}

}
