import java.util.Scanner;

public class Ejerciciocondicionales {
    public static void main(String[] args) {
        int cedula;
        
        Scanner escaner = new Scanner(System.in);

        System.out.println("Por favor digite el ultimo digito de su cedula");
        cedula = escaner.nextInt();
        int dia;
        System.out.println("Por favor digite el dia de hoy");
        dia = escaner.nextInt();
        if(cedula%2==0 && dia %2==0){
            System.out.println("Usted puede salir hoy");
        } else if (cedula%2 != 0 && dia%2 != 0) {
            System.out.println("Usted puede salir hoy");
        }else {System.out.println("Usted no puede salir hoy");
        }
    }
}
