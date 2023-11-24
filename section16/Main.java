package section16;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // 제네릭
    User<Integer> user = new User<>();  // T자리가 integer드감
    User<Double> user2 = new User<>();  // T자리가 Double 드감

        user.setHeight(170); // 정수 형태 Inter로 타입을 고정해놔서 다른거 못드감

        user2.setHeight(175.5); // 실수 형태

//        int userHeight = (int)user.getHeight(); //object니까 int로 강제 형 변환
//        double user2Height = (double)user2.getHeight(); //object가 가장 크니까 강제 형 변환

        int userHeight = user.getHeight(); // 강제 형 변환 할 필요가 없어짐 제네릭을 사용해서 타입이 이미 정해짐
        double user2Height = user2.getHeight(); //

        System.out.println("=================================================");

        //List 컬렉션
        //배열과 유사한 자료 구조로 중복이 허용되면서 저장 순서가 유지되는 구조를 제공
        //즉, 배열처럼 index를 사용해 데이터를 저장하고 검색 가능
        //다만, 배열과는 다르게 크기의 제한이 없으며 삽입, 삭제, 변경 기능이 자유로움
        // ㅂ ㅐ열은 legnth list는 size

        // list의 모든 데이터는 String 값
        // 기본 구조
        // ArrayList<데이터 타입> list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        // 데이터 저장
        // void  add(E e) 또는 void  add(int index, E e) E는 우리가 정해놓은 데이터 타입
        list.add("딸기"); // 0 번쨰 인덱스
        list.add("바나나"); // 1 번째

        System.out.println(list);
        System.out.println(list.toString());    //toString이 생략되어있다.

        list.add(1,"수박"); // 덮어 씌우는게 아니라 옆으로 밀어냄

        System.out.println(list);

        System.out.println("=================================================");

        // 데이터 치환
        // void set(int index, E e)
        list.set(1,"복숭아");  // 덮어 씌움

        System.out.println(list);

        // 데이터 삭제
        // void remove(int index), void remove(Object o)
        list.remove(1); // 삭제를 하면 당겨진다 1번 자리가 자라지니 2번자리놈이 1번자리로 내려옴

        System.out.println(list);

        list.remove("딸기"); // 위치 상관없이 해당하는거를 삭제

        System.out.println(list);

        // ==========================
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        list2.remove(2);     // 값을 2라는 녀석을 지우고 싶은데 이렇게 하면 인덱스 번호 2번이 지워진다.

        list2.remove(Integer.valueOf(2)); // 이렇계 하면 값이 2인 녀석을 지운다.

        System.out.println(list2);


        System.out.println("========================================================");

        list.add("딸기");
        list.add("수박");

        System.out.println(list);

        // 데이터 얻기
        // E get(int index) 여기서 E는 반환 값이 String
        String listIndexData = list.get(1); // 딸기 라는 값을 얻음
        System.out.println(listIndexData);

        list.add("복숭아");
        list.add("사과");
//        list.add("포도");
//        list.add("청포도");
//        list.add("귤");

        // List의 크기 얻기
        // int size()
        System.out.println(list.size());
        System.out.println(list);

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
        // ArrayList와 사용할 수 있는 메서드는 동일함
//        ArrayList : 요소의 삽입 또는 삭제가 많지 않고 데이터를 얻는 작업을 많이 할 때 사용
//        LinkedList : 요소의 삽입 또는 삭제가 빈번한 경우 사용
//        ArrayList : 회원가입 삭제시 한칸 밀림. <== 삽입과 삭제가 ㅈㄴ 느려짐
//        LinkedList : 1개를 삭제하고 그 사이를 한번만 연결해주면 끝남. 간단함

        System.out.println("================================================");
        // 데이터 존재 여부 확인 (반환값이 불린)
        // boolean contains(Object o)
        boolean bananaContain = list.contains("바나나");
        System.out.println("바나나 존재 여부 : "+bananaContain);
        // contains 로 사용자 찾기 ,list의 값을 담아주기, 일단 뭐 찾아서  true면 담으면됨

        System.out.println(list);



        for(int i= 0 ; i< list.size();i++){
            if(bananaContain){
                if("바나나".equals(list.get(i))){
                list.remove(i);
                System.out.println(list.get(i));
                }
                else {
                    System.out.println(list.get(i));
                }
            }
        }

        System.out.println("=====================================================");

        // HashSet
        // 기본구조
        // HashSet<데이터 타입> set = new HashSet<>();
        HashSet<String> set = new HashSet<>();

        // 데이터 저장
        // 인덱스가 없기 때문에 인덱스를 이용한 저장은 없다.
        // void add(E e)
        set.add("딸기");
        set.add("바나나");
        set.add("딸기");// set은 중복이 안되기 때문에 이건 안들어감

        System.out.println(set); // toString 이 생략되어 있음

        // 데이터 삭제
        // void remove(Object o)
        set.remove("딸기");

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains("딸기"));

        // Map 컬렉션

        // HashMap
        // Map 인터페이스에서 가장 많이 사용되는 구현 클래스
        // 기본 구조
        // HashMap<KEY의 데이터 타입, VALUE의 데이터 타입> map = new HashMap<>(); <-- KEY와 VALUE 둘다 있기 때문
        HashMap<Integer,String> map = new HashMap<>();

        // 데이터 삽입
        // void put(K key, V value)
        map.put(1,"봄");//key:1,value:봄
        map.put(2,"여름");
        map.put(3,"가을");
        map.put(4,"겨울");
        //자주 쓰이니까 잘 알아야 한다.

        System.out.println(map);
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

        System.out.println(map.get(4));

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
