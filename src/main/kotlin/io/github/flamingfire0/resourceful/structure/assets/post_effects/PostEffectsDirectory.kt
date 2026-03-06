package io.github.flamingfire0.resourceful.structure.assets.post_effects

import io.github.flamingfire0.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [PostEffectFile]s.
 * 
 * Location: /assets/{namespace}/post_effect
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see PostEffectFile
 */
class PostEffectsDirectory(override val path: Path): ResourceContainerDirectory<PostEffectFile>({ PostEffectFile(it) })
