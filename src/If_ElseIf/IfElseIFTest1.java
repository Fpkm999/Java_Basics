package If_ElseIf;
import java.util.Scanner;
public class IfElseIFTest1 {
    public static void main(String[] args) {

        // TITLE : Scanner 로 값을 받아 좋아하는 숫자 판별하기
//         Scanner 클래스로 int 값을 받고
//         경우1 : 5보다 크면 좋아하는 숫자가 5보다 큽니다.
//         경우2 : 5 보다 작으면 좋아하는 숫자가 5보다 작습니다.
//         경우3 : 좋아하는 숫자가 5입니다.

//        System.out.println("좋아하는 숫자를 입력하세요.");
//
//        Scanner sc = new Scanner(System.in);
//
//            int favoriteNumber = sc.nextInt();
//
//            if (favoriteNumber > 5) {
//                System.out.println("좋아하는 숫자가 5보다 큽니다.");
//            } else if (favoriteNumber < 5) {
//                System.out.println("좋아하는 숫자가 5보다 작습니다.");
//            } else {
//                System.out.println("좋아하는 숫자가 5 입니다.");
//            }
//              sc.close();
//    }
//}

//           System.out.println("===============================================");

        // TITLE : For 문을 이용한 구구단

//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.print(i + " X " + j + " = " + i * j+" ");
//            }
//            System.out.println("");
//        }
//    }
//}

//          System.out.println("===============================================");

        // TITLE : 별 찍기1

        for(int i = 0 ; i < 5 ; i++){
            for (int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


        System.out.println("================================");

        // TITLE : 별 찍기2 - 거꾸로

		for (int i = 5; i>0 ; i--) {
			for (int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}


        // TITLE : 배열에 값 넣기
        int[][] arr= new int[5][5];
        int result =1;

        for (int i=0 ; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                arr[i][j] = result;
                result++;
                System.out.print("arr[i][j] = "+arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}