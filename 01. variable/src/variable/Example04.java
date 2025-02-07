package variable;

public class Example04 {

	public static void main(String[] args) {

		// 문자열 타입
		// 자바에서 문자열은 쌍따옴표 사이에 감싸서 사용해야 한다.
		// 공백, 띄어쓰기, 한 단어도 전부 문자열로 취급할 수 있다.
		
		String s;
		s = "hello";
		System.out.println(s);
		
		s = "h";
		System.out.println(s);
		// 한 단어도 문자열 취급을 한다
		
		s = "";
		System.out.println(s);
		// 아무것도 없는 걸 출력한 거긴 함! 이것도 문자열 취급을 함
		
		s = " ";
		System.out.println(s);
		// 공백 문자도 문자열 취급을 한다
	
		System.out.println("------------------");
		
		
		
	}

}
