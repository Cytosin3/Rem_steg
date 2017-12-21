import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Pixel {
	public static void main(String... args) throws IOException {
		BufferedImage image = ImageIO.read(new File("Rem_secret.png"));
		System.out.println(new Color(image.getRGB(0, 0)).toString());
	}
}
