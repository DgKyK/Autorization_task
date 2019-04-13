package DB;

public enum DBUsers {
    USER1("Іван", "Іваненко", "user"),
    USER2("Александр", "Дубровский", "alex_man");

    private String firstName;
    private String secondName;
    private String nickName;

    DBUsers(String firstName , String secondName, String nickName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }
}
