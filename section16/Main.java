package section16;

import access1.A;
import java.util.*;

public class Main {
    public static void main(String[] args){

        // 제네릭 타입
        User<Integer> user = new User<>();  // T자리가 integer드감
        User<Double> user2 = new User<>();  // T자리가 Double 드감

        user.setHeight(170); // 정수 형태 Interger로 타입을 고정 해놔서 다른거 못드감

        user2.setHeight(175.5); // 실수 형태 DOuble로 타입을 정해놓아서 실수형태만 들어올 수 있음

//      int userHeight = (int)user.getHeight(); //object니까 int로 강제 형 변환 <-- 제네릭을 사용하지 않았다면 이렇게 강제 형 변환을 해줘야함
//      double user2Height = (double)user2.getHeight(); //object가 가장 크니까 강제 형 변환

        int userHeight = user.getHeight(); // 강제 형 변환 할 필요가 없어짐 제네릭을 사용해서 타입이 이미 정해짐
        double user2Height = user2.getHeight(); //

        System.out.println("==========List 컬렉션==============");

        // List 컬렉션
        // 배열과 유사한 자료 구조로 중복이 허용되면서 저장 순서가 유지되는 구조를 제공
        // 즉, 배열처럼 index를 사용해 데이터를 저장하고 검색 가능
        // 다만, 배열과는 다르게 크기의 제한이 없으며 삽입, 삭제, 변경 기능이 자유로움
        // 배열은 legnth list는 size

        // list의 모든 데이터는 String 값
        // 기본 구조
        // ArrayList<데이터 타입> list = new ArrayList<>();
        // ArrayList에 객체를 추가하면 내부 배열에 객체가 저장된다. 일반 배열과 차이점은 제한없이 객체를
        // 추가할 수 있다는 점이다.
        ArrayList<String> list = new ArrayList<>(); // ArrayList 선언

        // 데이터 저장
        // void  add(E e) 또는 void  add(int index, E e) E는 우리가 정해놓은 데이터 타입
        list.add("딸기"); // 0 번째 인덱스 값 추가
        list.add("바나나"); // 1 번째 인덱스 값 추가

        System.out.println("ArrayList 출력 : " + list);
        System.out.println("ArrayList 출력 : " + list.toString());    //toString이 생략되어있다.

        list.add(1,"수박"); // 덮어 씌우는게 아니라 옆으로 밀어냄

        System.out.println("ArrayList Index 1에 수박 추가 : "+list);

        // 번번한 객체 삭제와 삽입이 일어나는곳에서는 ArrayList를 사용하는것은 바람직하지 않다.
        // LinkedList를 사용하는것이 좋다.

        System.out.println("=1==============1==================================");

        // 데이터 치환 #set
        // void set(int index, E e)
        list.set(1,"복숭아");  // 덮어 씌움

        System.out.println("set1을 복숭아로 한 결과 : "+list);


        // 데이터 삭제
        // void remove(int index), void remove(Object o)
        list.remove(1); // 삭제를 하면 당겨진다 1번 자리가 자라지니 2번자리놈이 1번자리로 내려옴
        // 수박을 지우니 딸기 바나나만 남음
        System.out.println("remove 인덱스1 결과 : "+list);

        list.remove("딸기"); // 위치 상관없이 해당하는거를 삭제
//        list.remove <-- 인덱스로 지워도 되고, 원하는 문자열이나 객체를 선택해도 된다.
        System.out.println(list);   // result : 바나나

        System.out.println("======================ArrayList 연습==================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("add1,2,3 : "+list2);  // list2 출력


        list2.remove(2);     // 값을 2라는 녀석을 지우고 싶은데 이렇게 하면 인덱스 번호 2번이 지워진다.
        list2.remove("Integer.valueOf 를 이용해 아무 위치의 2를 제거 : "+Integer.valueOf(2)); // 이렇계 하면 값이 2인 녀석을 지운다.
//        list2.remove("Integer.parseInt 로 아무 위치의 2를 제거 : "+Integer.parseInt("2")); 이녀석은 안된다.
//        Integer.parseInt() vs Integer.valueOf() 차이
//        ArrayList의 타입이 Integer로 명시해서 정수만 들어 올 수 있는 상황에 인덱스가 아닌 정수값2를 지우기 위해
        System.out.println(list2);


        System.out.println("========================================================");

        list.add("딸기");
        list.add("수박");

        System.out.println(list);   // 기존에 바나나에서  + 딸기 + 수박 추가됨

        // 데이터 얻기
        // E get(int index) 여기서 E는 반환 값이 String
        String listIndexData = list.get(1); // 딸기 라는 값을 얻음
        System.out.println("list.get(1) : "+listIndexData);

        list.add("복숭아");
        list.add("사과");
//        list.add("포도");
//        list.add("청포도");
//        list.add("귤");

        // List의 크기 얻기
        // int size()
        System.out.println("list.size() : "+list.size());
        System.out.println(list); // result size = 5

        // list 의 값들을 하나하나 출력
        // [값, 값, 값, 값, 값]
        // size, get, if
        System.out.print("[");
        for(int i = 0 ; i < list.size() ; i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.print("]");

//        LinkedList<데이터 타입> list = new LinkedList<데이터 타입>();
//        ArrayList와 사용할 수 있는 메서드는 동일함
//        ArrayList : 요소의 삽입 또는 삭제가 많지 않고 데이터를 얻는 작업을 많이 할 때 사용
//        LinkedList : 요소의 삽입 또는 삭제가 빈번한 경우 사용
//        ArrayList : 회원가입 삭제시 한칸 밀림. <== 삽입과 삭제가 ㅈㄴ 느려짐
//        LinkedList : 1개를 삭제하고 그 사이를 한번만 연결해주면 끝남. 간단함

        System.out.println();
        System.out.println("================================================");

        // 데이터 존재 여부 확인 (반환값이 불린값임)
        // 예시 코드 : boolean contains(Object o)

        boolean bananaContain = list.contains("바나나");
        System.out.println("바나나 존재 여부 : "+bananaContain);
        // contains 로 사용자 찾기 ,list의 값을 담아주기, 일단 뭐 찾아서  true면 담으면됨

        System.out.println(list);

        for(int i= 0 ; i< list.size();i++){ // 사이즈 만큼 돌리니까 0,1,2,3,4 로 총 5번 돌린다
            if(bananaContain){  //true 이다
                if("바나나".equals(list.get(i))){  // 바나나가 포함되어 있는 인덱스가 존재하면 해당하는 인덱스만 제거
                list.remove(i);
                System.out.println(list.get(i));
                } else {
                    System.out.println(list.get(i));
                }
            }
        }
        System.out.println("=====================================================");
        for(int i= 0 ; i< list.size();i++){ // 사이즈 만큼 돌리니까 0,1,2,3 로 총 4번 돌린다
            if(bananaContain){  //true 이다
                if("딸기".equals(list.get(i))){  // 딸기가 포함되어 있는 인덱스가 존재하면 해당하는 인덱스만 제거
                list.remove(i);
                System.out.println(list.get(i));
                } else {
                    System.out.println(list.get(i));
                }
            }
        }

        System.out.println("===========HashSet====================");

        // HashSet
        // 기본구조
        // HashSet<데이터 타입> set = new HashSet<>();
        HashSet<String> hashset = new HashSet<>();

        // 데이터 저장
        // 인덱스가 없기 때문에 인덱스를 이용한 저장은 없다.
        // void add(E e)
        hashset.add("딸기");
        hashset.add("바나나");
        hashset.add("딸기");// hashset은 중복이 안되기 때문에 이건 안들어감
        hashset.add("포도");
        System.out.println(hashset); // toString 이 생략되어 있음

        // 데이터 삭제
        // void remove(Object o)
        hashset.remove("딸기");

        System.out.println("set의 내용물 Open : "+hashset);
        System.out.println("set의 사이즈 : "+hashset.size());
        System.out.println("set에서 딸기가 있는지 여부 : "+hashset.contains("딸기"));

        // Map 컬렉션

        // HashMap
        // Map 인터페이스에서 가장 많이 사용되는 구현 클래스
        // 기본 구조
        // HashMap<KEY의 데이터 타입, VALUE의 데이터 타입> map = new HashMap<>(); <-- KEY와 VALUE 둘다 있기 때문
        HashMap<Integer,String> map = new HashMap<>();
//               KEY   , VALUE
        // 데이터 삽입
        // void put(K key, V value)
        map.put(1,"봄");//key:1,value:봄
        map.put(2,"여름");
        map.put(3,"가을");
        map.put(4,"겨울");
        //자주 쓰이니까 잘 알아야 한다.

        System.out.println("map 출력 : "+map);
        // result
        // {1=봄, 2=여름, 3=가을, 4=겨울}

        // KEY 중복 불가

        map.put(2,"여름아님");
        System.out.println(map);    // KEY가 중복될 경우 VALUE 변경

        // 선택된 KEY로 KEY와 VALUE 삭제
        map.remove(1); // 봄이 삭제
        System.out.println(map);

        // 선택된 KEY와 VALUE 삭제
        map.remove(3,"겨울");
        System.out.println(map); // 키와 value 가 맞아야 삭제된다.

        map.remove(3,"가을");
        System.out.println(map);


        // KEY에 대응하는 VALUE 반환
        // V get (K KEY 값)  : 앞의 V는 벨류 K는 KEY값

        System.out.println("map.get(4) : "+map.get(4));

        ArrayList<HashMap<String, String>> list3 = new ArrayList<>();
        // 어레이 리스트 안에느 해쉬 맵으로 만들거야 그리고 맵안에 해쉬를 넣기 위해 해쉬맵을 또 만들어줘야해

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("1","봄");
        map2.put("2","여름");
        map2.put("3","가을");
        map2.put("4","겨울");

        list3.add(map2);
        list3.add(map2);

        System.out.println(list3);
        System.out.println(list3.get(0).get("1"));

//        https://jojoldu.tistory.com/62
//        https://www.acmicpc.net/problemset

    }
}
