package me.flamingo.resourceful.structure.assets.items

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class ItemsDirectory(override val path: Path): ResourceContainerDirectory<ItemFile>({ ItemFile(it) })
