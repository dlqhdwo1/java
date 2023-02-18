package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {
	public static void main (String[] args) throws ClassNotFoundException {
		PersonDTO dto = new PersonDTO("홍길동",25,185.3);
		try {
			
		FileOutputStream fos = new FileOutputStream("result2.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
	
		os.writeObject(dto);
		os.close();
	
		FileInputStream fos2 = new FileInputStream("result.txt");
		ObjectInputStream os2 = new ObjectInputStream(fos2);
		
		PersonDTO dto2 = (PersonDTO)os2.readObject(); //os2는 Object타입이라서 자식클래스인 PersonDTO로 캐스팅해줘야함.
		
		System.out.println(dto2);
		System.out.println("이름 = "+dto2.getName());
		System.out.println("나이 = "+dto2.getAge());
		System.out.println("키 = "+dto2.getHeight());
		
		
		os2.close();
		
		
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}
