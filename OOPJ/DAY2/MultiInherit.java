class Animal{
	void display(){
		System.out.println("parent");
	}
}

class Dog extends Animal{
	void childDisplay(){
		System.out.println("child");

	}
}

class Baby extends Dog{
	int babyId = 6;
	void babyDisplay(){
		System.out.println("baby");

	}
}

class MultiInherit{
	public static void main(String...args){
		Baby b = new Baby();
		b.babyDisplay();
		b.childDisplay();
		b.display();
		System.out.println(b.babyId);
	}
}