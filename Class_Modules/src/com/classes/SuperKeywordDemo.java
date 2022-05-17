package com.classes;
class Base{
	int i=10;
	Base(){
		System.out.println("base zero args constructor");
	}
	Base(int i){
		System.out.println("base int args constructor");
	}
}

class Derived extends Base{
	int j=20;
	
	
	Derived(){
		super(20);
		System.out.println("Derived zero args constructor");
		
	}
	
	Derived(int k){
		System.out.println("Derived int args constructor");
	}
	
	void m1() {
		System.out.println("i="+i);
		System.out.println("j="+j);
		
	}
}
public class SuperKeywordDemo {

	public static void main(String[] args) {
		Derived d1=new Derived(50);
	}

}
