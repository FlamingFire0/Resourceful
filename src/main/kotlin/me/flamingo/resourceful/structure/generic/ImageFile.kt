package me.flamingo.resourceful.structure.generic

import java.nio.file.Path

open class ImageFile(override val path: Path): FileBacked {
    override val fileExtension: String = "png"
    override fun toString(): String = path.toString()
}