import java.util.Scanner;
import java.util.Random;

public class nombreInicales {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            // Presentación del programa
            System.out.println("------------------------------------------------");
            System.out.println("🌟 ¡Bienvenido al programa más divertido del universo, Lorenzo Pérez Carbonell - LPC! 🌟");
            System.out.println("Hoy vas a recibir un saludo tan único como tú. 😄");
            System.out.println("------------------------------------------------");

            // Solicitar el nombre de usuario
            System.out.print("¡Vamos allá! ¿Cómo te llamas?: ");
            String nombreUsuario = scanner.nextLine();

            // Validar si el usuario ingresó algo
            if (nombreUsuario.trim().isEmpty()) {
                System.out.println("------------------------------------------------");
                System.out.println("⚠️ ¡Oh no! Parece que olvidaste decir tu nombre. Sin nombre, no hay saludo. 😢");
                System.out.println("Por favor, vuelve a intentarlo. ¡No seas tímido!");
                System.out.println("------------------------------------------------");
            } else {
                // Generar un saludo único basado en un número aleatorio
                int opcionSaludo = random.nextInt(3);
                System.out.println("------------------------------------------------");
                switch (opcionSaludo) {
                    case 0:
                        System.out.println("🎉 ¡Hola, " + nombreUsuario + "! Eres tan increíble que el teclado se emocionó al escribir tu nombre. 😎");
                        break;
                    case 1:
                        System.out.println("🎈 ¡" + nombreUsuario + ", hoy es tu día de suerte! ¡Te envío un saludo cargado de buena energía! ✨");
                        break;
                    case 2:
                        System.out.println("😂 ¡" + nombreUsuario + ", el mundo entero debería conocer a alguien tan genial como tú!");
                        break;
                }
                System.out.println("🤝 Saludos cordiales, cortesía de Lorenzo Pérez Carbonell - LPC.");
                System.out.println("------------------------------------------------");
            }
        }
        // Mensaje de cierre
        System.out.println("✨ Esto es todo por hoy. ¡Hasta la próxima y no olvides sonreír! 😄");
    }
}