package me.flamingo.resourceful.structure.generic

import java.nio.file.Path
import kotlin.io.path.isRegularFile
import kotlin.io.path.walk

abstract class ResourceContainerDirectory<T: PathBacked>(val constructor: (Path) -> T): DirectoryBacked, ResourceContainer<Set<T>> {
    
    private var _children: Set<T>? = null
    final override val children: Set<T> get() = _children ?: resolve().also { _children = it } ?: emptySet()
    
    final override fun resolve(): Set<T>? {
        if(!isValid()) return null
        return path.walk()
            .filter { it.isRegularFile() }
            .map { constructor(it) }
            .filter { it.isValid() }
            .toSet()
    }
}