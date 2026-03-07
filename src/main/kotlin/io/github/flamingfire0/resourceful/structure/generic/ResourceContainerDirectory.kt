package io.github.flamingfire0.resourceful.structure.generic

import io.github.flamingfire0.resourceful.helper.caching.Cache
import java.nio.file.Path
import kotlin.io.path.isRegularFile
import kotlin.io.path.listDirectoryEntries

/**
 * A directory that contains resources.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see ResourceContainer
 * @see DirectoryBacked
 * @see PathBacked
 */
abstract class ResourceContainerDirectory<T: PathBacked>(val constructor: (Path) -> T): DirectoryBacked, ResourceContainer<Set<T>>() {
    
    override val resource: Cache<Set<T>> = Cache {
        if(!isValid()) return@Cache emptySet()
        path.listDirectoryEntries()
            .filter { it.isRegularFile() }
            .map { constructor(it) }
            .filter { it.isValid() }
            .toSet()
    }
    
    override val children: Cache<Set<T>> = resource
}