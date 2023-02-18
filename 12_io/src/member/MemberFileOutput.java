package member;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import io.PersonDTO;

public class MemberFileOutput implements Member {
	@Override
	public void execute(ArrayList<MemberDTO> arrayList){
		
		System.out.println();
		
		arrayList.clear();
		
		try {
		FileInputStream fos = new FileInputStream("Member.txt");
		ObjectInputStream os = new ObjectInputStream(fos);
	
			while(true) {
				
			try {
			MemberDTO memberDTO = (MemberDTO)os.readObject();
			arrayList.add(memberDTO);
			}
			catch(EOFException e) {
				 break;
				}
			}
			os.close();
			System.out.println("파일에 저장완료");
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	
	}

}
