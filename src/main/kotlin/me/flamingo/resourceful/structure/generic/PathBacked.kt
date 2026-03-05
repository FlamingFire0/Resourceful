package me.flamingo.resourceful.structure.generic

import java.nio.file.Path
import kotlin.io.path.exists

sealed interface PathBacked {
    val path: Path
    fun isValid(): Boolean = path.exists()
    
    
    fun loop(function: (PathBacked) -> Unit) {
        function(this)
        if(this is DirectoryBacked) children.forEach { it.loop(function) }
    }
    
}