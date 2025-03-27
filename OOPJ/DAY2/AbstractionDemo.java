abstract class Shape{
	abstract void draw();
}

class Circle extends Shape{
	void draw(){
		System.out.println("circle");
	}
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("rectanglr");
	}
}

class AbstractionDemo{
	public static void main(String args[]){
		Shape s1 = new Circle();
		s1.draw();
		
		Shape s2 = new Rectangle();
		s2.draw();
		
		//Shape s4 = new Shape(); //err: abstraction
	}
}