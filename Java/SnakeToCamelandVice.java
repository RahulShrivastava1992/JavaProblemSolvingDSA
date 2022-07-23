public class SnakeToCamelandVice{
public static void main(String[] args){
    String result = "";
    boolean isSnake=false;
    //String str="GeeksForGeeks";
    String str="GeeksFor_geeks";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='_'){
                isSnake=true;
                break;
        }
    }
    if(!isSnake)
    result=CamelToSnake(str);
    else
    result=SnakeToCamel(str);

    // return the result
    System.out.println(result);

}
public static String SnakeToCamel(String str){
    //String result = "";
    str = str.substring(0, 1).toUpperCase()
              + str.substring(1);
    StringBuilder builder= new StringBuilder(str);
    for (int i = 0; i < builder.length(); i++) {
  
        // Check char is underscore
        if (builder.charAt(i) == '_') {

            builder.deleteCharAt(i);
            builder.replace(
                i, i + 1,
                String.valueOf(
                    Character.toUpperCase(
                        builder.charAt(i))));
        }
    }

    // Return in String type
    return builder.toString();
}

public static String CamelToSnake(String str){
    String result = "";
    char c = str.charAt(0);
    result = result + Character.toLowerCase(c);
    for (int i = 1; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isUpperCase(ch)) {
            result = result + '_';
            result
                = result
                  + Character.toLowerCase(ch);
        }
        else {
            result = result + ch;
        }
    }
    return result;
}

}