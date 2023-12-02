package section13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main4 {
    public static void main(String[] args) {
        Writer writer = null;

        try {
            writer = new FileWriter("write.txt",true);
            writer.write('\n');
            writer.write('안');
            writer.write('녕');
            writer.write('하');
            writer.write('세');
            writer.write('요');
            writer.write('\n');
            writer.write("자바");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
