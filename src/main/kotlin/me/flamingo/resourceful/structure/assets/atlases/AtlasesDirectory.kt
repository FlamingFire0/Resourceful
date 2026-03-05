package me.flamingo.resourceful.structure.assets.atlases

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class AtlasesDirectory(override val path: Path): ResourceContainerDirectory<AtlasFile>({ AtlasFile(it) })
