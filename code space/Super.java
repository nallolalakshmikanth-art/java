class L{
    int i,j;
	L(int x,int y){
	     i=x;
		 j=y;
	}
	void show(){
		System.out.println("i= "+i);
	    System.out.println("j= "+j);
	}
	
}

class K extends L{
	int k;
	K(int i,int j,int k){
	    super(i,j);
		this.k=k;
    }
    void show(){
		System.out.println("k= "+k);
		
	}
}

class Super{
	public static void main(String args[]){
		K obj=new K(2,4,6);
		obj.show();
	}
}