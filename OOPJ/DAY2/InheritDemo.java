class Parent{
	int x;
}

class Child extends Parent {
	//object of child classs and referen is of parent class
	int y;
}

class InheritDemo{
	public static void main(String...args){
		Parent p1 = new Parent();
		System.out.println(p1,x);
		//System.out.println(p1,y);
		Child c = new Child();
		Parent p = new Child();//upcasting
		Child c1 = new Parent();//not correct
		Child c2 = (c)Parent();//down casting
		System.out.println(c,x);
		//System.out.println(c,y);
		
		System.out.println(p,x);
		//System.out.println(p,y);
	}
}