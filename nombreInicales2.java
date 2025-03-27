import java.util.Scanner;
import java.util.Random;

public class nombreInicales2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            // Solicitar el nombre de usuario
            System.out.print("Por favor, introduce tu nombre: ");
            String nombreUsuario = scanner.nextLine();

            // Validar si el usuario ingresó algo
            if (nombreUsuario.trim().isEmpty()) {
                System.out.println("No ingresaste ningún nombre. Por favor, vuelve a intentarlo.");
            } else {
                // Generar un saludo único basado en un número aleatorio
                int opcionSaludo = random.nextInt(3);
                switch (opcionSaludo) {
                    case 0:
                        System.out.println("Hola, " + nombreUsuario + "! Eres increíble.");
                        break;
                    case 1:
                        System.out.println("¡" + nombreUsuario + ", te envío un saludo lleno de energía positiva!");
                        break;
                    
                }
                System.out.println("Gracias por usar el programa.");
            }
        }
    }
}