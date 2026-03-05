package me.flamingo.resourceful.structure.assets.blockstates

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class BlockStatesDirectory(override val path: Path): ResourceContainerDirectory<BlockStateFile>({ BlockStateFile(it) })