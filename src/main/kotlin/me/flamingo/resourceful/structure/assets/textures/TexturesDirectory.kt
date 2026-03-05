package me.flamingo.resourceful.structure.assets.textures

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class TexturesDirectory(override val path: Path): ResourceContainerDirectory<TextureFile>({ TextureFile(it) })
