package j0610;

public class StarTest2 {
// 별 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a(행의 수), b(행이 증가할 때마다 별도 증가)
		for(int a=1;a<=5;a++) {
			//System.out.print("*"); 행이 증가함에 따라 *도 증가해야 함!-> 여기서 행은 변수a!
			for(int b=1;b<=a;b++) { //b는 *을 말하는 것!
				System.out.print("*"); 
			}//inner for
			System.out.println();//줄바꿈
		}//outer for
			
	}//main

}
