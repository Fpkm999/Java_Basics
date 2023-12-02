package section19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main3 {
    public static void main(String[] args) {
        int read = 0; // read 메서드 반환 값을 담을 변수

        Reader reader = null;
        try {
            reader = new FileReader("my_file.txt");
            while(true){
                read = reader.read();

                if (read == -1 ){
                    break;
                }
                System.out.print((char)read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
