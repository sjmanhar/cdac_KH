interface Animal{
	void sound(); //astract method
}

class Dog implements Animal{ // implemented in classes only
	public void sound(){
		System.out.println("dog barks");
}
}

class InterfaceDemo{
	public static void main(String args[]){
		Animal a = new Dog();
		a.sound();
	}
}