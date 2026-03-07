package io.github.flamingfire0.resourceful.structure.generic

import io.github.flamingfire0.resourceful.helper.caching.Cache.CacheSet
import kotlin.io.path.isDirectory

/**
 * A directory.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see FileBacked
 */
interface DirectoryBacked: PathBacked {
    override fun isValid(): Boolean = super.isValid() && path.isDirectory()
    val children: CacheSet<PathBacked>
}