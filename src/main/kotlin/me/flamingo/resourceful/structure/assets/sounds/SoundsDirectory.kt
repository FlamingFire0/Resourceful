package me.flamingo.resourceful.structure.assets.sounds

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [SoundFile]s.
 * 
 * Location: /assets/{namespace}/sounds
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see SoundFile
 * @see SoundDefinitions
 */
class SoundsDirectory(override val path: Path): ResourceContainerDirectory<SoundFile>({ SoundFile(it) })
