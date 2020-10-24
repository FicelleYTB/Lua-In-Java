package fr.ficelleytb.lua;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import java.util.Scanner;

public class lua {

	public static void main(String[] args) {
		
		System.out.println("Lua");

	}
	
	public static String print(String text) {
		System.out.println(text);
		return text;
	}
	
	public static int numbers(int numbers) {
		System.out.println(numbers);
		return numbers;
	}
	
	public static String inputSTR(boolean print) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String rep = sc.nextLine();
		if(print == true) {
			System.out.println(rep);
		}
		return rep;
	}
	
	public static int inputINT(boolean print) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		if(print == true) {
			System.out.println(rep);
		}
		return rep;
	}

	public static void repeat(int i, int j, boolean print) {
		for (int a = i; a <= j; a++) {
		if(print == true) {
			System.out.println(a);
		}
		
	}
		return;
	}
	
	public static int random(int number1, int number2, boolean print){
        Random random = new Random();
        int nb;
        nb = number1 + random.nextInt(number2-number1);
        if(print == true) {
        	System.out.println(nb);
        }
        return nb;
     }
	
	public static void error() {
		System.out.println("Lua error detected !");
		return;
	}
	
	public static int wait(int numbers) throws InterruptedException {
		Thread.sleep(numbers);
		return numbers;
	}
	
	public static String text(String text) {
		System.out.println(text);
		return text;
	}
	
	public static void sendpacket(String link, boolean date, boolean getPermission,  boolean print) {
		
		try {
			URL url;
			url = new URL(link);
			URLConnection urlconnect = url.openConnection();
			
			if(print == true) {
			System.out.println("Packet send !");
			}
			
			if(date == true) {
				System.out.println(urlconnect.getDate());
			}
			
			if(getPermission == true) {
				System.out.println(urlconnect.getPermission());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
