package me.flamingo.resourceful.structure.assets.fonts

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class FontsDirectory(override val path: Path): ResourceContainerDirectory<FontProviderFile>({ FontProviderFile(it) })
