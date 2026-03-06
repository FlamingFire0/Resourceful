package io.github.flamingfire0.resourceful.structure.assets.models

import io.github.flamingfire0.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [ModelFile]s.
 * 
 * Location: /assets/{namespace}/models
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see ModelFile
 */
class ModelsDirectory(override val path: Path): ResourceContainerDirectory<ModelFile>({ ModelFile(it) })
