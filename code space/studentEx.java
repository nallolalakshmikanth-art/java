class studentEx{
	String name;
	String rollno;
	public studentEx(){
		system.out.println("I am default constructer");
	}
	public studentEx(String name,String rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public static void main(Sting arge[]){
		studentEx s1=new studentEx("rahul,12");
		studentEx s2=new studentEx("eicky,10");
		studentEx s3=new studentEx();
		system.out.printlm(s1.name);
		system.out.printlm(s2.name);
		system.out.printlm(s3.name);
	}
}