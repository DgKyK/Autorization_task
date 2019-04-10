public class Model {
    UserInfo userInfo;

    public Model(){
        this.userInfo = new UserInfo();
    }
    public void setUserSurName(String validInfo){
        userInfo.setSecondName(validInfo);
    }

    public void setUserName(String validInfo){
        userInfo.setFirstName(validInfo);
    }
    public void setUserNickName(String validInfo){
        userInfo.setNickName(validInfo);
    }

    public String getStringUserInfo(){
        return userInfo.toString();
    }


}
