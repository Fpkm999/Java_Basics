package section19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        int read = 0; // read 메서드의 반환 값을 담을 변수

        InputStream in = null;    // null 로 초기화
        // new FileInputStream("경로명/파일명");
        try {
            in = new FileInputStream("my_file.txt");    // 1바이트 단위로 읽어 들임

            while(true) {
                read = in.read();   // int값으로 저장

                if (read == -1){
                    break;
                }
//                System.out.print(read+" ");
                System.out.print((char)read);
            }
        } catch (IOException e) {   // Exception 보다 한단계 낮은 예외. 2가지를 한방에 잡을 수 있다.
            throw new RuntimeException(e);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
/*
result : 104101108108111321191111141081001310236149136235133149237149152236132184236154148
아스키코드 값으로 변환되어서 출력됨 char로 강제 형 변환하면 깨진다.
 */