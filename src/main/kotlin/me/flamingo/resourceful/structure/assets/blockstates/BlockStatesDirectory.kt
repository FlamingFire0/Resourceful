package me.flamingo.resourceful.structure.assets.blockstates

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [BlockStateFile]s.
 * 
 * Location: /assets/{namespace}/blockstates
 *
 * @author FlamingFire0
 * @since 0.1.0
 * @see BlockStateFile
 */
class BlockStatesDirectory(override val path: Path): ResourceContainerDirectory<BlockStateFile>({ BlockStateFile(it) })