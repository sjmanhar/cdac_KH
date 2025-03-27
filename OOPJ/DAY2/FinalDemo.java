class Parent{
	final void display(){
		System.out.println("final parent");
	}
}
class Child extends Parent{
   /* void display(){ //compile time error
		System.out.println("final child");
	}*/
}

class FinalDemo{
	public static void main(String...args){
		//Parent p = new Parent();
		//p.display();//error: display() in Child cannot override display() in Parent

         Child c = new Child();
		 c.display();
	}
	
}