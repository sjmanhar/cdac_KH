class Employee {
	float sal = 40000;//parent class
}
class Programmers extends Employee{
	int bonus =10000; //child class
}
class Inherit{
	public static void main(String...args){
		//Employee e = new Programmers();
		//System.out.println("sal: "+ e.sal);
		//System.out.println("bonus: "+ e.bonus);//referance not created.
		Programmers e = new Programmers();
		System.out.println("sal: "+ e.sal);
		System.out.println("bonus: "+ e.bonus);
	}
}