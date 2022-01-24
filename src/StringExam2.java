/**
 * 문자열 String 클래스 + equals
 * @author smart02
 *
 */
public class StringExam2 {

	public static void main(String[] args) {
		String str = ("ABC");
		String str2 = ("abc");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		// 문자열 비교는 equals, not ==
		System.out.println(str);
		System.out.println(str2);
	}

}
