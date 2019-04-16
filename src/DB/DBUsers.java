package DB;

import Exception.NickNameNotExclusiveException;

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

    public static boolean isNickNameExclusive(String inputedNickName) throws NickNameNotExclusiveException {
        for(DBUsers user : DBUsers.values()){
            if(inputedNickName.equals(user.getNickName())){
                NickNameNotExclusiveException exception = new NickNameNotExclusiveException(inputedNickName);
                throw exception;
            }
        }
        return true;
    }

    public String getNickName() {
        return nickName;
    }
}
