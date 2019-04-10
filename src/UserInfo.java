public class UserInfo {
    private String firstName;
    private String secondName;
    private String nickName;

    public UserInfo(){

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
