import java.lang.*;

public class Teorema {

   public double calcularHipotenusa(int catetoA, int catetoB) {
        double cuadrado = (catetoA * catetoA) + (catetoB * catetoB);
        double hipotenusa = Math.sqrt(cuadrado);
        return (hipotenusa);
    }
}