
public class Java_04_method {
	public static void hiEveryone() {
		System.out.println("안녕하세요. 함수입니다");
	}
	public static void hiCar() {
		System.out.println("안녕하세요. 함수입니다");
	}
	public static void showFunction() {
		System.out.println("함수1");
		System.out.println("함수2");
	}
	public static void showStar1() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {System.out.print("*");}
				System.out.println();
		}
	}
	public static void showAge(int age, int tall) {
		System.out.println("제나이는 " + age +"입니다");
		System.out.println("제키는 " + tall +"입니다");
	}
	
	public static void main(String[] args) {
		showAge(29,160); //value = 값 = 변수값
		
		int height = 190;
		showAge(29,height);
	}

	
}
