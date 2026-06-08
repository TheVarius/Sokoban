import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class ResourceLoader {
    public static BufferedImage loadImage(String path) {
        try {
            URL url = ResourceLoader.class.getResource(path);
            if (url == null) {
                System.err.println("Ostrzeżenie: Nie znaleziono grafiki " + path + " - załadowano model zastępczy.");
                return null;
            }
            return ImageIO.read(url);
        } catch (Exception e) {
            System.err.println("Ostrzeżenie: Błąd ładowania grafiki " + path + " - załadowano model zastępczy.");
            return null;
        }
    }
}