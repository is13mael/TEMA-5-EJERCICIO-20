public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.out.print("Por favor, introduzca la altura de la pirámide: ");
            int altura = Integer.parseInt(System.console().readLine());

            System.out.print("Introduzca el caracter de relleno: ");
            char caracter = System.console().readLine().charAt(0);

            for (int fila = 1; fila <= altura; fila++) {
                int espacios = altura - fila;
                for (int i = 0; i < espacios; i++) {
                    System.out.print(" ");
                }
                if (fila == 1) {
                    System.out.println(caracter);
                } else if (fila == altura) {
                    for (int j = 0; j < 2 * fila - 1; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                } else {
                    System.out.print(caracter);
                    for (int j = 0; j < 2 * fila - 3; j++) {
                        System.out.print(" ");
                    }
                    System.out.print(caracter);
                    System.out.println();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Número mal introducido.");
        } catch (Exception e) {
            System.out.println("Ha habido un error inesperado.");
        }
    }
}