public class StringManipulatorTesting{
    public static void main(String[] args){

    	StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(str); // HolaMundo 

        char letter = 'n';
        int a = manipulator.getIndexOrNull("Coding", letter);
        int b = manipulator.getIndexOrNull("Hola Mundo", letter);
    
        System.out.println(a); // 4
        System.out.println(b); // 7
    
    
    	String word = "Hola";
    	String subString = "la";
    	String notSubString = "mundo";
    	Integer var1 = manipulator.getIndexOrNull(word, subString);
    	Integer var2 = manipulator.getIndexOrNull(word, notSubString);
    	System.out.println(var1); // 2
    	System.out.println(var2); // -1
    	
    }
    
        public String concatSubstring(String str1, int a, int b, String str2){
        return str1.substring(a, b).concat(str2);
        
        }
    }