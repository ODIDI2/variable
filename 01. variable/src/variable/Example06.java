package variable;

public class Example06 {

	public static void main(String[] args) {
		// 변수의 형 변환
		// 형(type) 변환은 같은 형태의 값을 넣을 수 있는 변수끼리 변환하는 과정
		
	
		// byte b; & b = 20; < 이런 선언과 대입을 따로 하지 않고 동시에
		//short 타입 변수 s에 20 값을 넣어서 초기화
		//int 타입 변수 i에 20 값을 넣어서 초기화
		//long 타입 변수 l에 20 값을 넣어서 초기화
		
		byte b = 20; 	// 최대 127
		short s = 20;	// 최대 32626
		int i = 20;		// 최대 21억
		long l = 20L;	// 최대 900해
		
		s = b;	// 등호 기준으로 오른쪽에 있는 걸 왼쪽으로 대입
		i = s;
		l = i;
		// byte 타입의 변수 b에 담긴 20 값을 short 타입의 변수 s에 대입(옮겨담음)해도
		// short가 더 크기 때문에 byte에 담긴 값을 담을 수 있다.
		// 자동 타입 변환 (자동 형 변환 , 자동 타입 캐스팅)
		
		
		// 강제 타입 변환
		b = (byte)s; 	//s는 20
		s = (short)i;	
		i = (int)l;
		
	}

}
