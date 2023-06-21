
public class Java_05_method_void {
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	public static char gradChar(double num1) {
		if(num1>=90) {return '수';}
		else if(num1>=80){return '우';}
		else if(num1>=70){return '미';}
		else if(num1>=60){return '양';}
		else
		{return '가';}
			}
	
	
//  답	
//	public static char gradChar(double avg ) {
//	      char ch = '가';
//	      
//	      if(avg >= 90) {
//	         ch = '수';
//	      }else if(avg >=80) {
//	         ch = '우';
//	      }else if(avg >=70) {
//	         ch = '미';
//	      }else if(avg >=60) {
//	         ch = '양';
//	      }else {
//	         ch = '가';
//	      }
//	      
//	      return ch;
//	   }
	
	public static void showStar(int n) {
		
				for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		}

	public static void main(String[] args) {
		System.out.println(add(3,5));
		System.out.println(sub(3,5));
		System.out.println(mul(3,5));
		System.out.println(gradChar(90.8));
		System.out.println(gradChar(80.8));
		System.out.println(gradChar(50));
		showStar(4);
	}
	
}
