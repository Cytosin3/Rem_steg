from PIL import Image

img = Image.open('Rem_secret.png')
(width, height) = img.size

secretImg = Image.new('RGB', (width, height))

for h in range(height):
    for w in range(width):
        (r, g, b) = img.getpixel((w, h))
        lsb = r % 2
        if lsb == 0:
            secretImg.putpixel((w, h), (0, 0, 0))
        else:
            secretImg.putpixel((w, h), (255, 255, 255))

secretImg.save('secret.png')
secretImg.show()
