package Exception;

public class NickNameNotExclusiveException extends Exception {
    private String wrongNickName;

    public NickNameNotExclusiveException(){

    }

    public NickNameNotExclusiveException(String wrongNickName){
        this.wrongNickName = wrongNickName;
    }
    public NickNameNotExclusiveException(String message, String wrongNickName){
        super(message);
        this.wrongNickName = wrongNickName;
    }

    public String getWrongNickName() {
        return wrongNickName;
    }
}
