package me.flamingo.resourceful.structure.assets.sounds

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class SoundsDirectory(override val path: Path): ResourceContainerDirectory<SoundFile>({ SoundFile(it) })
