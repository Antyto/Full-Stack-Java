import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava {
    public void ejercicioUno(int[] arr){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                newArray.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(newArray);
    }

    public void ejercicioDos(String[] arr){
        ArrayList<String> newList = new ArrayList<String>();
        ArrayList<String> newList2 = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 5){
                newList2.add(arr[i]);
            }
            newList.add(arr[i]);
        }
        Collections.shuffle(newList);
        System.out.println(newList);
        System.out.println(newList2);
    }

    public void ejercicioTres(){
        ArrayList<String> arr = new ArrayList<String>();
        for(char abc = 'A'; abc <= 'Z'; abc++){
            arr.add(Character.toString(abc));
        }
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);

        System.out.println("La primera letra del arreglo es: " + arr.get(0));
        System.out.println("La ultima letra del arreglo es: " + arr.get(25));
        String sample = arr.get(0);

        if("AEIOU".indexOf(sample) > 0){
            System.out.println("La primera letra es una vocal!");
        }   
    }

    public void ejercicioCuatro() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int random = ThreadLocalRandom.current().nextInt(55, 101);
            numeros.add(random);
        }
        System.out.println(numeros);
    }

    public void ejercicioCinco(){
        ArrayList<Integer> numeros2 = new ArrayList<Integer>();
        int min = 101;
        int max = 55;
        for(int i = 0; i < 10; i++){
            int random2 = ThreadLocalRandom.current().nextInt(55, 101);
            numeros2.add(random2);
            if(random2 < min){
                min = random2;
            }
            if(random2 > max){
                max= random2;
            }
        }
        Collections.sort(numeros2);
        System.out.println(numeros2);
        System.out.println("El valor minimo del arreglo es: " + min);
        System.out.println("El valor maximo del arreglo es: " + max);
    }

    public void ejercicioSeis(){
        Random mezcla = new Random();
        StringBuilder cadena = new StringBuilder();
        String abcNum = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i < 5; i++){
            cadena.append(abcNum.charAt(mezcla.nextInt(abcNum.length())));
        }
        String resultado = cadena.toString();
        System.out.println(resultado);
    }

    public void ejercicioSiete(){
        Random mezcla2 = new Random();
        StringBuilder cadena2 = new StringBuilder();
        ArrayList<String> lista = new ArrayList<String>();
        String abcNum2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i <10; i++){
            for(int j = 0; j < 5; j++){
                cadena2.append(abcNum2.charAt(mezcla2.nextInt(abcNum2.length())));
            }
            String resultado = cadena2.toString();
            lista.add(resultado);
            cadena2.setLength(0);
        }
        System.out.println(lista);
    }
}
