from gimpformats.gimpXcfDocument import GimpDocument
project = GimpDocument("100flowers.xcf")

for layer in project.layers:
    if layer.name == "FLOWER":
        for i in range(100):
            x = i % 10
            y = int(i / 10)

            x = x * (16+6) + 8
            y = y * (16+6) + 8

            flower_image = layer.image.crop((x, y, x+16, y+16))

            if not flower_image.getbbox():
                flower_image.paste((200, 200, 200), [
                                   0, 0, 16, 16])

            flower_image.save(
                f"mod/src/main/resources/assets/iflowers/textures/block/flower{str(i).rjust(2,'0')}.png")
