package me.flamingo.resourceful.structure.assets.texts

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class TextsDirectory(override val path: Path): ResourceContainerDirectory<TextFile>({ TextFile(it) })
