package io.github.flamingfire0.resourceful.structure

import io.github.flamingfire0.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [Namespace]s.
 * 
 * Location: /assets/
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see Namespace
 */
class AssetsDirectory(override val path: Path): ResourceContainerDirectory<Namespace>({ Namespace(it) })