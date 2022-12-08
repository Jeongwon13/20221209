import java.util.*;

public class ArrayEx {

	public static void main(String[] args) {
		
		//사용자가 직접 값을 입력할 수 있게 Scanner문을 가져온다.
		//사용자에게 가이드를 주기 위해 아래 질문을 만듦.
		Scanner scanner = new Scanner(System.in);
		System.out.print("새로 만들 2차원 배열의 전체 행 갯수를 입력하세요:");
		
		//사용자가 정수값을 입력할 수 있게 nextInt();
		int count = scanner.nextInt();
		
		//2차원 배열 선언
		//왜 여기서 갑자기 선언하는지는 잘 모르겠음.
		int[][] arr;
		
		if(count > 0) {
			System.out.println("사용자가 입력한 행의 갯수는 " + count);
			
			//행 갯수를 배열에 입력해놓았다.
			//근데 왜지? 아마 선언한 배열의 행을 완성했다는 의미인 것 같은데 맞을까.. 확인해봐야겠다.
			arr = new int[count][];
			
			
			//for반복문에 변수 row를 만들어 식 완성
			for(int row = 0; row < count; row++) {
				System.out.println("행 번호는 " + row);
				
				System.out.print("열의 갯수를 정수로 입력하세요:");
				int count2 = scanner.nextInt();
				
		if(count2 > 0) {
			arr[row] = new int[count2];
			System.out.println("사용자가 입력한 칸의 갯수로 실제 방을 만듦");
			System.out.println("실제로 만들어진 방의 갯수:" + count2);
			System.out.println("2차원 배열의 전체 행의 갯수:" + arr[row].length);
			
			//사용자가 0을 입력했을 경우, 모르고 입력했을 수 있으므로 기본값 5개의 방을 만들어줌
			}else if(count2 == 0) {
				arr[row] = new int[5];
				System.out.println("사용자가 입력한 값이 0이므로 기본적으로 5개의 방을 만듭니다.");		
				
			}
				//사용자가 음수를 입력했을 경우
				//Math.abs 함수를 사용하여 사용자가 입력한 값을 절댓값으로 바꿔주자.
				else {
				System.out.println("사용자가 음수를 입력했습니다.");
				int absCount2 = Math.abs(count2);
				System.out.println("절댓값을 구한 결과는 " + absCount2);
				arr[row] = new int[absCount2];
				System.out.println("사용자가 입력한 음수를 양수로 바꾸어 방을 만듦");
				System.out.println("만든 방의 갯수는 " + arr[row].length);
				
				
			}
		}
	}

		
		
	}
}
