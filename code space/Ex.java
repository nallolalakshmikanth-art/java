class Ex{
  
    public void myMethod(int m){
		
		int n;
		m=20;
		n=m;
		
		
	}
	public static void main(String args[]){
		int n=10;
		Ex obj=new Ex();
		obj.myMethod(n);
		System.out.println(n);
		
	}
}	