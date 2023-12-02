package section19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main2 {
    public static void main(String[] args) {
        OutputStream out = null;
        // new FileOutputStream("경로/파일명, 이어쓰기 옵션);
        try {
            out = new FileOutputStream("write.txt",false);
            out.write('H');
            out.write('E');
            out.write('L');
            out.write('L');
            out.write('O');
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
/*
char랑 int는 아스키코드한정으로 서로 값을 주고 받을 수 있다.
 */