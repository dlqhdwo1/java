package member;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemberFileInput implements Member {
	
	
	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		System.out.println();
		
		try {
		FileOutputStream fos = new FileOutputStream("Member.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		for(MemberDTO dto : arrayList) {
		os.writeObject(dto);
		os.close();
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
