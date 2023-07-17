package week1.day1;

public class Maths {
private int add(int a,int b) {
	return a+b;
}
public void multiply(int a,int b){
System.out.println("The multiplication result is:"+a*b);
}
private int div(int a,int b) {
	return a/b;
}
public static void main(String[] args) {
	Maths ms=new Maths();
	int add = ms.add(9, 5);
	System.out.println(add);
	ms.multiply(8, 2);
	int div = ms.div(10, 5);
	System.out.println(div);
}
}
