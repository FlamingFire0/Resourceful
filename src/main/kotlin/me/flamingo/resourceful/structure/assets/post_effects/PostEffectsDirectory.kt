package me.flamingo.resourceful.structure.assets.post_effects

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class PostEffectsDirectory(override val path: Path): ResourceContainerDirectory<PostEffectFile>({ PostEffectFile(it) })
