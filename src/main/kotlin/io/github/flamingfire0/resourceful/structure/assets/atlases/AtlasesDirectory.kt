package io.github.flamingfire0.resourceful.structure.assets.atlases

import io.github.flamingfire0.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A Directory of [AtlasFile]s.
 *
 * Location: /assets/{namespace}/atlases
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see AtlasFile
 */
class AtlasesDirectory(override val path: Path): ResourceContainerDirectory<AtlasFile>({ AtlasFile(it) })
