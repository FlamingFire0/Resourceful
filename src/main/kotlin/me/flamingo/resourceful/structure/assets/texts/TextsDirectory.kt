package me.flamingo.resourceful.structure.assets.texts

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import me.flamingo.resourceful.structure.generic.TextFile
import java.nio.file.Path

/**
 * A directory of [TextFile]s.
 * 
 * Location: /assets/{namespace}/texts
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see TextFile
 */
class TextsDirectory(override val path: Path): ResourceContainerDirectory<TextFile>({ TextFile(it) })
