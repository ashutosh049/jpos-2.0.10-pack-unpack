package com.in28minutes.springboot;

public class ByteArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ashutosh";
		byte[] bytes = str.getBytes();
		for (byte b : bytes) {
			System.out.print(b);
		}
		
	}

}
