package io.github.flamingfire0.resourceful.structure.assets.sounds

import io.github.flamingfire0.resourceful.structure.generic.FileBacked
import java.nio.file.Path

/**
 * An OGG file that provides audio such as music and sound effects for the game.
 * 
 * Location: /assets/{namespace}/sounds/.../{file}.json
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see SoundsDirectory
 * @see SoundDefinitions
 */
class SoundFile(override val path: Path): FileBacked {
    override val fileExtension: String = "ogg"
}