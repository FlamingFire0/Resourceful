package me.flamingo.resourceful.structure.assets.textures

import me.flamingo.resourceful.structure.generic.FileBacked
import me.flamingo.resourceful.structure.generic.ImageFile
import java.nio.file.Path
import kotlin.io.path.name

class TextureFile(path: Path): ImageFile(path) {
    val info: TextureInfoFile = TextureInfoFile(path.resolveSibling("${path.name}.mcmeta"))
}