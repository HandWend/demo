
public class Method4 {
	
	public static void aaa(int i, char j) { 
		System.out.println(  "가 호출되었습니다."+(++i)+j  );
	}
	


	public static void main(String[] args) { // main method
		int i = 24;
		aaa(i, 'A');
		System.out.println(i);
	}

}
