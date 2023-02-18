package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		
		//DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
		try {
			
		//파일출력
		FileOutputStream fos = new FileOutputStream("result.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeInt(25);
		dos.writeDouble(185.3);
		
		dos.close();
		
		
		//파일입력
		FileInputStream fos2 = new FileInputStream("result.txt");
		DataInputStream dos2 = new DataInputStream(fos2);
		
		
		String name = dos2.readUTF();
		
		System.out.println(name);
		
		int age = dos2.readInt();
		System.out.println(age);
		double p = dos2.readDouble();
		System.out.println(p);
		

		dos2.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	}
