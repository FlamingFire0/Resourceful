package me.flamingo.resourceful.structure.assets.particles

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [ParticleFile]s.
 * 
 * Location: /assets/{namespace}/particles
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see ParticleFile
 */
class ParticlesDirectory(override val path: Path): ResourceContainerDirectory<ParticleFile>({ ParticleFile(it) })
