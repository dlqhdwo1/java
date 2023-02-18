package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) {
		
		try {
		File file = new File("data.txt");
		FileInputStream fos = new FileInputStream(new File("data.txt"));
		BufferedInputStream bos = new BufferedInputStream(fos);
		
		int size = (int)file.length();
		byte[] b = new byte[size];
		
		bos.read(b,0,size);  //나중에 파일 다운로드할때 사용하는 메소드.
		bos.close();
		
		System.out.print(new String(b) + " ");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
