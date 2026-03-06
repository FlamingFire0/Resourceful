package io.github.flamingfire0.resourceful.structure.generic

import java.nio.file.Path
import kotlin.io.path.exists

/**
 * A file or directory. Anything with a [Path].
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see FileBacked
 * @see DirectoryBacked
 */
sealed interface PathBacked {
    val path: Path
    fun isValid(): Boolean = path.exists()
    
    fun loop(function: (PathBacked) -> Unit) {
        function(this)
        if(this is DirectoryBacked) children.forEach { it.loop(function) }
    }
    
}