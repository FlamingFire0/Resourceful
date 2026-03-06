package me.flamingo.resourceful.structure.assets.textures

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [TextureFile]s.
 * 
 * Location: /assets/{namespace}/textures
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see TextureFile
 * @see TextureInfoFile
 */
class TexturesDirectory(override val path: Path): ResourceContainerDirectory<TextureFile>({ TextureFile(it) })
