
public class Method5 {
	
	public static void aaa(int i) { 
		System.out.println((++i) + "aaa가 호출되었습니다."  );
		return; // return문 만나면 중괄호 벗어남.
		// return문 아래엔 잘 안 넣음.
	}
	
	private static int bbb(int i) {
		i +=1;
		i = i + 1;
		i++;
		return i;
		
		
	}
	// static은 static이다.
	public static void main(String[] args) { // main method
		int i = 24;
		i = bbb(i);
		System.out.println(i);
	}

}
