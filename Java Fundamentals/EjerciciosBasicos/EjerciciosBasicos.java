import java.util.*;

// Eliminar Números Negativos

public class EjerciciosBasicos {

//1. Imprimir 1 - 255
	public static void main(String[] args) {
		for (int i = 1; i <=255; i++ ) {
			System.out.println(i); 
		}

//2. 	Imprimir los Números Impares Entre 1 - 255
		public static void main(String[] args) {
		for (int i = 1; i <= 255; i++ ) {
			if (i%2==1) {
				System.out.println(i);
			}
			
		}
		
	}


//3. 	Imprimir la Suma	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 255; i++) {
	           System.out.print("Nuevo numero: " + i);
	           System.out.println(" Suma: " + (sum += i));
	           
	      	 }
	 }
		


//4. 	Recorrer un Arreglo
	public static void main(String[] args) {
		int[] myArray = {1,3,5,7,9,13};
   		Arrays.sort(myArray);
    	for (int arr: myArray) {
    		System.out.println(arr);
    		}
	}	



//5. 	Encontrar el Máximo	
	public static void main(String[] args) {
	int[] myArray = {-3,-5,-7};
		   int max = Integer.MIN_VALUE;
	        for (int i = 0; i < myArray.length; i++){
	            if (myArray[i] > max){
	                max = myArray[i];
	            }
	        }
	        System.out.println("El numero máximo es: " + max);
	    }


//6.  Obtener el Promedio		
	public static void main(String[] args) {
		int[] myArray = {2, 10, 3};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
            }
        int promedio = sum / myArray.length;
        System.out.println("Promedio de: " + promedio);
	}

//7.	Arreglo con Números Impares	
	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<>();
		for (int i = 1; i < 256; i++){
	            if (i % 2 == 1){
	                myArray.add(i);
	            }
	        }
	        System.out.println(myArray);
	}

//8. 	Mayor que Y	
	public static void main(String[] args) {
		int[] myArray = {1,3,5,7};
        int y = 3;
        int count = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > y){
                count ++;
            }
        }
        System.out.println(count);
    }

//9. 	Valores al Cuadrado 	
	public static void main(String[] args) {
		int[] myArray = {1,5,10,-2};
	    int[] newArr = new int[myArray.length];
        int cuadrado;
        for (int i = 0; i < myArray.length; i++) {
        	cuadrado = myArray[i] * myArray[i];
            newArr[i] = cuadrado;
        }
        System.out.print(Arrays.toString(newArr));
    }

//10. 	Eliminar Números Negativos 	
	public static void main(String[] args) {
		int[] myArray = {1,5,10,-2};
        for (int i = 0; i < myArray.length; i++) {
        	if(myArray[i] < 0) {
        		myArray[i] = 0;
        	}
        	System.out.print(myArray[i] + ",");
      	  }
	}


//11.	Mínimo, Máximo y Promedio
	public static void main(String[] args) {
		int[] myArray = {1, 5, 10, -2};
		int max = myArray[0];
	    int min = myArray[0];
	    int sum = 0;
	    for (int i = 0; i < myArray.length; i++){
	    	if (myArray[i] < min){
	                min = myArray[i];
	            }
	    	if (myArray[i] > max){
	                max = myArray[i];
	            }
	    	sum += myArray[i];
	    	}
	    
	    int prom = sum / myArray.length;
	    
	    System.out.println("El mínimo es: " + min);
	    System.out.println("El máximo es: " + max);
	    System.out.println("El promedio es: " + prom);
	}


//12.	Cambiando los Valores del Arreglo
	public static void main(String[] args) {
		ArrayList<Integer> newArray = new ArrayList<>();
		int[] arr = {1, 5, 10, 7, -2};
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				newArray.add(0);
				} else {
					newArray.add(arr[i + 1]);
	            }
	        }
	        System.out.print(newArray + ",");
	   }
	}
}


