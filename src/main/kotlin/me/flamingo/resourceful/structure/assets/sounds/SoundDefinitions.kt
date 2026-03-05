package me.flamingo.resourceful.structure.assets.sounds

import me.flamingo.resourceful.structure.generic.FileBacked
import java.nio.file.Path

class SoundDefinitions(override val path: Path): FileBacked {
    override val fileExtension: String = "json"
}