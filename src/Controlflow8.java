/**
 * 筈側 溌昔 覗稽益轡 拙失馬獣神
 * @author smart02
 *
 */
public class Controlflow8 {

	public static void main(String[] args) {
		/*int i=59;
		// System.out.println("[DEG]"+(i%2==0));
		if (i % 2 == 0) {
			System.out.println("i澗 側呪脊艦陥.");
		} else { 
			System.out.println("i澗 筈呪脊艦陥."); 
		}*/

		/*int i=1;
		if (i % 3 == 1 ) {
			System.out.println("謝還税 渋軒脊艦陥.");
		}
		else if (i % 3==2) {
			System.out.println("謝還税 渋軒脊艦陥.");
		}else {
			System.out.println("蟹税 渋軒脊艦陥.");
		}*/
	
		//亜是郊是左 覗稽益轡聖 拙失馬獣神
		int user1 = (int)(Math.random()*3)+1; //沙昔
		int user2 = (int)(Math.random()*3)+1; //雌企号
		
		if (user1==1) {
			System.out.println("蟹澗 亜是");
		} else if (user1==2) {
			System.out.println("蟹澗 郊是");
		} else { 
			System.out.println("蟹澗 左");
		}
		
		if (user2==1) {
			System.out.println("雌企号精 亜是");
		} else if (user2==2) {
			System.out.println("雌企号精 郊是");
		} else { 
			System.out.println("雌企号精 左");
		}
		if (user1 == 1 && user2==1) {
			System.out.println("搾医柔艦陥.");
		} else if (user1==1 && user2 ==2) {
			System.out.println("ばば");
		} else if (user1==1 && user2==3) {
			System.out.println("ぞぞ");
		} else if(user1 == 2 && user2==1) {
			System.out.println("ぞぞ");
		} else if (user1==2 && user2==2) {
			System.out.println("搾沿");
		} else if (user1==2 && user2==3) {
			System.out.println("ばば");
		} else if(user1 ==3 && user2==1) {
			System.out.println("ばば");
		} else if (user1==3 && user2==2) {
			System.out.println("ぞぞ");
		} else if (user1==3 && user2==3) {
			System.out.println("搾沿.");
		} 
		
	}
}
	