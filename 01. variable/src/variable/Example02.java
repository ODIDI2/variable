package variable;

public class Example02 {
	public static void main(String[] args) {
		//변수
		
		//정수, 문자, 실수, 
		//1) 변수의 선언
		// 변수타입 변수이름
		int a;
		
		//2) 변수의 초기화
		//변수이름 = 값
		//등호 오른쪽에 있는 값을 왼쪽 변수에 대입한다.
		a = 50;
		System.out.println(a);
		
	
		//1. 정수
		//5가지 종류의 타입이 있다.
		
		//1-1. byte
		byte b;
		// bit > byte > kb > mb > gb...
		//1byte > 8bit
		// -128 ~ 127
		b = 20;
		//127까지만 가능하고 128부턴 안 됨
		System.out.println(b);

		//1-2. short
		short s;
		//2byte > 16 bit
		// -32768 ~ 32767
		s = 150;
		System.out.println(s);
		
		//1-3. char
		char c;
		//2byte > 16bit
		//0~ 65535 (음수는 안 됨)
		c = 65;
		System.out.println(c);
		//아스키 코드로 변환하는 거였다!
		//char = character의 줄임말
		
		c = 'A';
		System.out.println((int)c);
		//A라는 문자가 아스키 코드로 몇 번인지
		
		//1-4. int
		//가장 많이 쓰임, 현업에서 계속 쓰임
		int i;
		//4byte > 32bit > 2^32
		//-21억 ~ 21억 (wow)
		i = 2000;
		System.out.println(i);
		
		//1-5. long
		long l;
		//8byte > 64bit > 2^64
		//-900해 ~ 900해 (woooow)
		l = 22222222222L;
		//값에 대문자 L을 붙여줘야 함
		//L이 붙어도 그냥 숫자입니다
		System.out.println(l);
		
	}
}
