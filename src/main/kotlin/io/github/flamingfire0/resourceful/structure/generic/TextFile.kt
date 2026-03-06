package io.github.flamingfire0.resourceful.structure.generic

import java.nio.file.Path

/**
 * A TXT file containing text.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see FileBacked
 */
open class TextFile(override val path: Path): FileBacked {
    override val fileExtension: String = "txt"
}