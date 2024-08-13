package Bombilla;

public class Main {
    public static void main(String[] args) {
        boolean estado;

        if (args.length == 0) {
            System.out.println("Por favor, proporciona un argumento: 'true' o 'false'.");
            return;
        }

        // Procesar el argumento
        switch (args[0].toLowerCase()) {
            case "true":
                estado = true;
                break;
            case "false":
                estado = false;
                break;
            default:
                System.out.println("Argumento inválido. Usa 'true' o 'false'.");
                return;
        }

        Bombilla bombilla = new Bombilla(estado);

        bombilla.imprimirEstado();

        bombilla.cambiar();
        bombilla.imprimirEstado();

        bombilla.cambiar();
        bombilla.imprimirEstado();
    }
}
