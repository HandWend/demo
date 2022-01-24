
public class Method3 {
	
	public static void aaa(int i) { 
		System.out.println((++i) + "가 호출되었습니다."  );
	}
	


	public static void main(String[] args) { // main method
		int i = 24;
		aaa(i);
		System.out.println(i);
	}

}
