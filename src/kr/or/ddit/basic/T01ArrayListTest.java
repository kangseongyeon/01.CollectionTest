package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T01ArrayListTest {
	public static void main(String[] args) {
		// Default Capacity = 10
		List list1 = new ArrayList();
//		List list1 = new LinkedList();
		
		// add() 메서드를 사용하여 데이터 추가한다.
		list1.add("aaa");
		list1.add("bbb");
		list1.add(new Integer(111));
		list1.add('k');
		list1.add(true);
		list1.add(12.32);
		
		// size() => 데이터 개수
		System.out.println("size => " + list1.size());	// size => 6
		System.out.println("list1 => " + list1);		// list1 => [aaa, bbb, 111, k, true, 12.32]
		
		// get()으로 데이터 가져오기
		System.out.println("1번째 데이터 : " + list1.get(0));	// 1번째 데이터 : aaa
		
		// 데이터 끼워넣기
		list1.add(0,"zzz");
		System.out.println("zzz 끼워넣기 후 : " + list1);	// zzz 끼워넣기 후 : [zzz, aaa, bbb, 111, k, true, 12.32]
		
		// 데이터 변경하기
		String temp = (String) list1.set(0, "YYY");		// set(변경하고 싶은 위치, 변겨하고 싶은 내용)
		System.out.println("temp : " + temp);			// temp : zzz
		System.out.println("첫 번째 데이터를 YYY로 데이터 변경한 후 : " + list1);	// 첫 번째 데이터를 YYY로 데이터 변경한 후 : [YYY, aaa, bbb, 111, k, true, 12.32]
		
		// 데이터 삭제하기
		list1.remove(0);
		System.out.println("첫번째 데이터 삭제 후 : " + list1);	// 첫번째 데이터 삭제 후 : [aaa, bbb, 111, k, true, 12.32]
		
		list1.remove("bbb");
		System.out.println("bbb 데이터 삭제 후 : " + list1);		// bbb 데이터 삭제 후 : [aaa, 111, k, true, 12.32]
	
		list1.remove(new Integer(111));
		System.out.println("111 데이터 삭제 후 : " + list1);		// 111 데이터 삭제 후 : [aaa, k, true, 12.32]
		
		System.out.println("------------------------------------------");
		
		// 제너릭을 이용하여 선언할 수 있다
		List<String> list2 = new ArrayList<String>();
		list2.add("AAA");
		list2.add("BBB");
		list2.add("CCC");
		list2.add("DDD");
		list2.add("EEE");
		
		for (String str : list2) {
			System.out.println(str);
		}
		System.out.println("------------------------------------------");
		// contains (비교객체) => 리스트 '비교객체'가 존재하면 true, 없으면 false
		System.out.println(list2.contains("DDD"));		// true
		System.out.println(list2.contains("ZZZ"));		// false
		
		// indexOf(비교객체) => 리스트에서 '비교객체'를 찾아 존재하는 인덱스값을 반환한다
		// 				   => 존재하지 않으면 -1을 반환한다.
		System.out.println("DDD의 index값 : " + list2.indexOf("DDD"));		// DDD의 index값 : 3
		System.out.println("ZZZ의 index값 : " + list2.indexOf("ZZZ"));		// ZZZ의 index값 : -1
		System.out.println("------------------------------------------");
		
		// 모든 데이터 삭제
		for (int i = 0; i<list2.size(); i++) {
			list2.remove(i);
		}
		System.out.println("list의 개수 : " + list2.size());		// list의 개수 : 2
		
		list2.clear();		// 전체 제거
	}
}
