package me.flamingo.resourceful.structure.assets.texts

import me.flamingo.resourceful.structure.generic.FileBacked
import java.nio.file.Path

class TextFile(override val path: Path): FileBacked {
    override val fileExtension: String = "txt"
}