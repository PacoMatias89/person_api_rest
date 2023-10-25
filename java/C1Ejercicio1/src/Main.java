import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double indice, altura, peso;
        altura = 1.80;
        peso = 98.0;
        double potencia = Math.pow(altura, 2);

        indice = peso / (potencia);
        String resultado = new DecimalFormat("#.##").format(indice); // formateo a dos decimales
        System.out.println("Indice de masa corporal es: " + resultado);
    }
}