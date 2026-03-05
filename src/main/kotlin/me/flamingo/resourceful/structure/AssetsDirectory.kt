package me.flamingo.resourceful.structure

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class AssetsDirectory(override val path: Path): ResourceContainerDirectory<Namespace>({ Namespace(it) })