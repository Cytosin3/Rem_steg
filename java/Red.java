import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Main {
	private static void putPixel(BufferedImage image, int widthStart, int height, int rgb) {
		for (int h = 0; h < height; ++h)
			for (int i = 0; i < 30; i++) image.setRGB(widthStart + i, h, rgb);
	}

	public static void main(String... args) throws IOException {
		int width = 30, height = 30;
		BufferedImage img = new BufferedImage(width * 10, height, BufferedImage.TYPE_INT_RGB);
		int r = 255, g = 0, b = 0;
		for (int i = 0; i < 10; i++) {
			putPixel(img, i * 30, height, new Color(r - i, g, b).getRGB());
		}
		ImageIO.write(img, "png", new File("tmp.png"));
	}
}
