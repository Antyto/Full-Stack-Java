public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        String resultado = str1.trim() + str2.trim();
        return resultado;
    }
    
    public Integer getIndexOrNull(String str3, char c){
    	if (str3.indexOf(c) >= 0){
        return str3.indexOf(c);
    }
    else {
        return null;
    	}
    }
    

    public Integer getIndexOrNull(String str4, String str5){
        if (str4.indexOf(str5) >= 0){
            return str4.indexOf(str5);
        }
        else {
            return null;
        }
    }
    
    public String concatSubstring(String str1, int a, int b, String str2){
        return str1.substring(a, b).concat(str2);
    }
}