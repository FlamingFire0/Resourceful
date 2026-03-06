package me.flamingo.resourceful.structure.assets.fonts

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [FontProviderFile]s.
 * 
 * Location: /assets/{namespace}/font
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see FontProviderFile
 */
class FontsDirectory(override val path: Path): ResourceContainerDirectory<FontProviderFile>({ FontProviderFile(it) })
