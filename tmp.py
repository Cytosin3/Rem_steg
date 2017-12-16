from PIL import Image

def putPixel(img, width_start, height, rgb):
    """
    在 img 中，从 width_start 开始处，将 30 个像素填充为 rgb 。
    """
    for h in range(height):
        for i in range(30):
            img.putpixel((width_start + i, h), rgb)
    return


if __name__ == '__main__':

    (width, height) = (30, 30)
    img = Image.new('RGB', (width * 10, height))

    (r, g, b) = (255, 0, 0)
    for i in range(10):
        putPixel(img, i * 30, height, (r - i, g, b))

    img.save('tmp.png')
    img.show()
