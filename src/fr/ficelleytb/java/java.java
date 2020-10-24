package fr.ficelleytb.java;

import fr.ficelleytb.lua.lua;

public class java {

	public static void main(String[] args) throws InterruptedException {
		
		// TEST CLASS
		
		lua.print("Hi");
		
		boolean a = true;
		boolean b = false;
		boolean c = false;
		
		if(a) {
			lua.error();
		}
		
		if(b) {
			lua.sendpacket("https://google.com", true, true, true);
		}
		
		if(c) {
			lua.inputINT(true);
			lua.inputSTR(true);
		}
		
		
	}

}
