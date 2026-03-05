package me.flamingo.resourceful.structure.assets.models

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class ModelsDirectory(override val path: Path): ResourceContainerDirectory<ModelFile>({ ModelFile(it) })
