package section19_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        FileReader fr = null;   // 기반 스트림 선언
        BufferedReader br = null; // 보조 스트림 사용
        try {
            fr = new FileReader("my_file.txt"); // 내 파일 불러 오기
            br = new BufferedReader(fr);    // 기반 스트림 연결

            String str = "";    // readLine() 의 반환 값을 담을 변수 <-- 문자열(1 라인)을 담을 변수

            // 보조 스트림을 사용 하여 라인 단위로 불러옴
            // 읽을 라인이 없으면 null을 반환함
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // close 메서드에서 IOException 예외를 던져서
            // 메서드를 호출한 곳에서 try - catch 를 사용 해야함
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
/*
바이트 기반 스트림에서 한글이 깨지는 이유
이거는 문자열스트림이라 한글이 안깨짐 
 */
