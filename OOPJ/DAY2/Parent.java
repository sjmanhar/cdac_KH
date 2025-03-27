class GrandParent{
	GrandParent(){
		System.out.println("GP");
	}
}

class Parent extends GrandParent{
	Parent(){
		super();
		System.out.println("parent");

	}
}
class Child extends Parent{
	Child(){
		super();
		System.out.println("child");

	}
}
class Parent{
	public static void main(String...args){
		Child c = new Child();
	}
}