public class View{


    public void printMessage(String message){
        System.out.println(message);
    }

    public String stringConcat(String...v){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < v.length; i++){
            result.append(v[i]);
        }
        return new String(result);
    }
}
