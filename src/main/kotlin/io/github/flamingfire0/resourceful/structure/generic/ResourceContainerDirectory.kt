package io.github.flamingfire0.resourceful.structure.generic

import io.github.flamingfire0.resourceful.helper.caching.CacheSet
import java.nio.file.Path
import kotlin.io.path.isRegularFile
import kotlin.io.path.walk

/**
 * A directory that contains resources.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see ResourceContainer
 */
abstract class ResourceContainerDirectory<T: PathBacked>(val constructor: (Path) -> T): DirectoryBacked, ResourceContainer<Set<T>> {
    override val children: CacheSet<T> = CacheSet { resolve() ?: emptySet() }
    
    final override fun resolve(): Set<T>? {
        if(!isValid()) return null
        return path.walk()
            .filter { it.isRegularFile() }
            .map { constructor(it) }
            .filter { it.isValid() }
            .toSet()
    }
}