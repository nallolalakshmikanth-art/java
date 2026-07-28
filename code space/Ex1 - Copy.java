class Ex1{
	private String name;
	private int marks;
	
	public String getName(){
		return name;
	}
	
	public int getMarks(){
		return marks;
	}
	
	public setName(string name){
		this.name=name;
	}
	
	public void setMarks(int marks){
		if(mark>=0 && mark<=1000){
			this.mark=mark;
		}else{
			System.out.println("Invlid marks");
		}
	}
}