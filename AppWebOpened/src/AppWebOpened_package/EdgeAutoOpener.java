package AppWebOpened_package;
import java.io.IOException;

public class EdgeAutoOpener {
    public static void main(String[] args) {
        String url = "https://www.google.com"; // Cambia la URL

        while (true) {
            try {
                // Abre Microsoft Edge con la URL
                Process browserProcess = Runtime.getRuntime().exec("cmd /c start msedge " + url);

                // Espera 3 segundos antes de cerrarlo
                Thread.sleep(3000);

                // Cierra Microsoft Edge
                Runtime.getRuntime().exec("taskkill /F /IM msedge.exe");

                // Espera 1 segundo antes de volver a abrirlo
                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                break;
            }
        }
    }
}
