import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ShortenDecrypt {
	public static void main(String... args) throws IOException {
		BufferedImage secretImg = ImageIO.read(new File("Rem_secret.png"));
		for (int w = 0; w < secretImg.getWidth(); w++)
			for (int h = 0; h < secretImg.getHeight(); h++) {
				int lsb = new Color(secretImg.getRGB(w, h)).getRed() % 2; // 个人建议把 % 2 写成 & 1
				secretImg.setRGB(w, h, (lsb == 0 ? new Color(0, 0, 0) : new Color(255, 255, 255)).getRGB());
			}
		ImageIO.write(secretImg, "png", new File("secret.png"));
	}
}
