package section15;

public class User {
    // to String 오버라이딩
    // 필드에 값이 잘 들어왔는지 확인용으로 거의 사용함
    private String userId;
    private String userPw;
        public void setUserId(String userId){
            this.userId = userId;
        }
        public String getUserId(){
           return userId;
        }
        public void setUserPw(String userPw){
            this.userPw = userPw;
        }
        public String getUserPw(){
           return  userPw;
       }
        @Override
        public String toString() {
        return "userID : " + userId + ", userPw : " +userPw;
        }
}
