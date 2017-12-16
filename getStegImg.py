from PIL import Image
import numpy as np

imgrem = Image.open('Rem_origin.jpg')
imgqrcode = Image.open('qrcoderaw.png')

(widthrem, heightrem) = imgrem.size
(widthqr, heightqr) = imgqrcode.size

newimg = imgrem.copy()

qrMatrix = np.array(imgqrcode)

for h in range(heightqr):
    for w in range(widthqr):
        (r, g, b) = imgrem.getpixel((w, h))
        if qrMatrix[w, h, 0] > 253:
            qrvalue = 1
        else:
            qrvalue = 0
        r = r >> 1
        r = (r << 1) + qrvalue
        newimg.putpixel((w, h), (r, g, b))

newimg.save('Rem_secret.png')
