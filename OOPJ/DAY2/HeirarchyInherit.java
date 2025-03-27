class Animal{
	void eat(){
		System.out.println("eat func parent class");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("dog barks: Bark()");

	}
}

class Cat extends Animal{
	
	void sound(){
		System.out.println("cat mews: sound()");

	}
}

class HeirarchyInherit{
	public static void main(String...args){
		Cat c = new Cat();
		c.eat();
		c.sound();
		//c.bark();
		
		Dog d = new Dog();
		d.eat();
		d.bark();

	}
}