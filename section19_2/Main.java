package section19_2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null; // 기반 스트림
        BufferedInputStream bis = null; // 보조 스트림
        // 1바이트씩이 아니라 1라인씩 실행함
        try {
            fis = new FileInputStream("my_file.txt");
            bis = new BufferedInputStream(fis);

            int read = 0; // read 메서드의 반환값을 담을 변수

            while ((read = bis.read()) != -1){
                System.out.print(read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // 나중에 선언한 스트림부터 담아줌
                bis.close();
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
