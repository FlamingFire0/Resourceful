package io.github.flamingfire0.resourceful.structure.assets.textures

import io.github.flamingfire0.resourceful.structure.generic.ImageFile
import java.nio.file.Path
import kotlin.io.path.name

/**
 * A PNG file used as textures for blocks, items, etc.
 * 
 * Location: /assets/{namespace}/textures/.../{file}.png
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see TexturesDirectory
 * @see TextureInfoFile
 */
class TextureFile(path: Path): ImageFile(path) {
    val info: TextureInfoFile = TextureInfoFile(path.resolveSibling("${path.name}.mcmeta"))
}