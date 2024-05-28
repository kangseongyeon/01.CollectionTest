package kr.or.ddit.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class T08HashMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		// 데이터 추가 => put (key 값, value 값);
		map.put("name", "홍길동");
		map.put("tel", "010-1111-1111");
		map.put("addr", "대전");
		
		System.out.println("map => " + map);				// map => {name=홍길동, tel=010-1111-1111, addr=대전}
		
		// 데이터 수정 => 데이터를 저장할 때 key 값이 같으면 나중에 입력한 값이 저장된다
		// 			   put(수정할 key 값, 새로운 value값);
		map.put("addr", "서울");
		System.out.println("수정 후 map => " + map); 			// 수정 후 map => {name=홍길동, tel=010-1111-1111, addr=서울} 
		
		// 데이터 삭제 => remove (삭제할 key 값)
		map.remove("name");
		System.out.println("삭제 후 map => " + map);			// 삭제 후 map => {tel=010-1111-1111, addr=서울}
		
		// 데이터 읽기(가져오기) => get(key 값)
		System.out.println("addr = " + map.get("addr"));	// addr = 서울
		System.out.println("=================================");
		
		// key 값들을 읽어와 데이터를 출력하는 방법
		Set <String> keySet = map.keySet();
		
		System.out.println("Iterator를 이용한 방법");
		
		// 방법 1 => keySet() 메서드 사용하기
		//		=> key만을 모아놓은 컬랙션 객체인 set을 리턴
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + map.get(key));	
		}
		System.out.println("=================================");
		
		// 방법 2 => 향상된 for문 'for-each문'을 이용한 방법
		for (String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("=================================");
		
		
		// 방법 3 => value 값들만 읽어와 출력하기 
		// key 값을 안가져옴 
		System.out.println("value() 메서드 이용하는 방법");
		for (String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("=================================");
		
		
		// 방법 4 => Map 관련 클래스에는 Map.Entry 타입의 내부 클래스가 만들어져 있다
		// 		   Map에서 이 Map.Entry 타입의 객체들을 Set 타입의 객체로 반환해주는 메서드를 제공한다
		System.out.println("entrySet() 메서드를 이용한 방법");
		
//		Set endtrySet = map.entrySet();
		Set<Map.Entry<String, String>> endtrySet = map.entrySet();
		
		// 가져온 Entry 객체들을 접근하기 위한 Iterator 객체 가져오기
		Iterator entryIt = endtrySet.iterator();
		
		while(entryIt.hasNext()) {
//			Map.Entry entry = (Entry)entryIt.next();
			Map.Entry entry = (Map.Entry)entryIt.next();
			
			System.out.println("key 값 : " + entry.getKey());
			System.out.println("value 값 : " + entry.getValue());
			System.out.println();
		}
	}
	
}
