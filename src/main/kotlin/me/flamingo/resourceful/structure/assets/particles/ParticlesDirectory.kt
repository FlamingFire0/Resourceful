package me.flamingo.resourceful.structure.assets.particles

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class ParticlesDirectory(override val path: Path): ResourceContainerDirectory<ParticleFile>({ ParticleFile(it) })
