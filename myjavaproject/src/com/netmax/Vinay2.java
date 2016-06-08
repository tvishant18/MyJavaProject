package com.netmax;
class Business extends Exception{
	String name;
public 	Business(String string2){
name=string2;	
}
	public boolean test() throws Business{
		if(name.length()>5)
			return true;
		else
			throw new Business("string not valid");
		
	}
		 
}
public class Vinay2 {

	public static void main(String[] args) {
	try{
		Business obj=new Business("vishant");
		if(obj.test())
		System.out.println("String is valid");
	}catch(Business ex){
		System.out.println(ex);
	}
	}
}
