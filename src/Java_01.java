
public class Java_01 {

	public static void main(String[] args) {
		
		//*****개가 5줄
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {System.out.print("*");}
			System.out.println();
		}
		
		//삼각형
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {System.out.print("*");}
			System.out.println("");
		}
		
		//역삼각형
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {System.out.print("*");}
			System.out.println("");
		}
			
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {System.out.print("*");}
			System.out.println("");
		}
		//삼각형 반대
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=4; j++) {System.out.print(" ");}
			for(int j=1; j<=i; j++) {System.out.print("*");}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<i ;j++) {System.out.print(" ");}
			for(int j=6; j>i; j--) {System.out.print("*");} //j는 위에 j랑 완전히 다른거라서 int 선언 해줘야한다.
			System.out.println();
		}
	}
}