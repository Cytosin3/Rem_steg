from PIL import Image

img = Image.open('Rem_secret.png')
print(img.getpixel((0, 0)))