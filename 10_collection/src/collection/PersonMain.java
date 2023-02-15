package collection;

import java.util.ArrayList;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() {
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("프로도",30);
		PersonDTO cc = new PersonDTO("라이언",40);
		
		list.add(aa);
		list.add(bb);
		list.add(cc);
	
		return list;
		
	}
	public static void main(String[] args) {
		PersonMain p = new PersonMain();
		
		ArrayList<PersonDTO> list = p.init(); // list의주소를 가져옴. , 받아온 주소를 list에 보관.
	
		
		for(int i=0; i<list.size();i++) {
		System.out.print(list.get(i).getName() + "\t");
		System.out.println(list.get(i).getAge()+ "\t");	
		
		}
		
		System.out.println();
		
		for(PersonDTO dto : list) {
			System.out.print(dto.getName() + "\t");
			System.out.println(dto.getAge());
		}
		
		System.out.println();
	
		
		for(PersonDTO dto : list) {
			System.out.println(dto.toString());
		}
		
	}

}
