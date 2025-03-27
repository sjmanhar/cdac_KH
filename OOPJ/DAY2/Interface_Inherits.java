
/*class A{
	void msg(){
		System.out.println("class A msg");
	}
}
class B{
	void msg(){
		System.out.println("class B msg");
	}
}
class C extends A,B{ 
	void msg(){
		System.out.println("class C msg");
	}
}


class Interface_Inherits{
	public static void main(String...args){
		
		C c1 = new C(); // creating confusionb/w msgs
		c1.msg();
	}
}
*/
interface A{
	default void msg(){
		System.out.println("class A msg");
	}
}
interface B{
	default void msg(){
		System.out.println("class B msg");
	}
}
class C implements A,B{ 
	public void msg(){
		System.out.println("class C msg");
	}
}

class Interface_Inherits{
	public static void main(String...args){
		
		C c1 = new C(); 
		c1.msg();
		
	}
}