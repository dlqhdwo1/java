package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) {
		
		try {
			FileInputStream fos = new FileInputStream(new File("data.txt"));
			BufferedInputStream bos = new BufferedInputStream(fos);
			
			int age;  
			
			while((age =bos.read())!=-1){   //읽어들이고 마지막이면 -1을 가져옴. 13 10은 개행문자임.
				System.out.print((char)age + " "); //엔터 1.다음줄\n로 연결해줌 2. 다음줄 맨앞\r으로 보냄. 
				
			}
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	
		
		
		
		
		
	}

}
