class Employee{
	private int id;
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}

class Ecap{
	public static void main(String...args){
		Employee e = new Employee();
		e.setName("sjm");
		System.out.println("employee name: " + e.getName());
	}
}