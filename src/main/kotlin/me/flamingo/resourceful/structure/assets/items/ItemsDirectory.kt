package me.flamingo.resourceful.structure.assets.items

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [ItemFile]s.
 * 
 * Location: /assets/{namespace}/items
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see ItemFile
 */
class ItemsDirectory(override val path: Path): ResourceContainerDirectory<ItemFile>({ ItemFile(it) })
