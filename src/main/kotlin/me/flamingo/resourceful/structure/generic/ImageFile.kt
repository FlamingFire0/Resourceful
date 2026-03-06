package me.flamingo.resourceful.structure.generic

import java.nio.file.Path

/**
 * A PNG image file.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see FileBacked
 */
open class ImageFile(override val path: Path): FileBacked {
    override val fileExtension: String = "png"
    override fun toString(): String = path.toString()
}