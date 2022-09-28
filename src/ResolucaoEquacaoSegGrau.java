import java.util.Scanner;

public class ResolucaoEquacaoSegGrau {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner valor = new Scanner(System.in);

        System.out.println("Informe o valor de a");
        int a = valor.nextInt();
        System.out.println("Informe o valor de b");
        int b = valor.nextInt();
        System.out.println("Informe o valor de c");
        int c = valor.nextInt();

        try {
            System.out.printf("O valor de delta é: %2f", calcularDelta(a,b,c));
            System.out.printf("O valor de x1 é: %2f",valorX1(a,b,c));
            System.out.printf("O valor de x2 é: %2f",valorX2(a,b,c));
        }catch(IllegalArgumentException ie){
            System.out.println(ie.getMessage());
        }
    }

    public  static double valorX1(int a, int b, int c) throws IllegalArgumentException{
        return (-b + Math.sqrt(calcularDelta(a,b,c))) / (2 * a);
    }

    public  static double valorX2(int a, int b, int c) throws IllegalArgumentException{
        return (-b - Math.sqrt(calcularDelta(a,b,c))) / (2 * a);
    }

    private static double calcularDelta(int a, int b, int c) throws IllegalArgumentException{
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta<0) {
            throw new IllegalArgumentException("Delta é: "+delta+"\nNão existem raízes reais.");
        }
        return delta;
    }
}



