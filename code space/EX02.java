class A{
	int i = 10;
	A(){}
	A(int i){
		this.i=i;
	System.out.println("parent class i =" +i);
	}
}
class B extends A{
	int i = 20;
	B(int i){
		super (i); 
	System.out.println("child class i=" + this.i);
	}
}
class EX02{
	public static void main(String args[]){
		B obj = new B (40);
	}
}