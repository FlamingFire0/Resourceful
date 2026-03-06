package me.flamingo.resourceful.structure.assets.languages

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [LanguageFile]s.
 * 
 * Location: /assets/{namespace}/lang
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see LanguageFile
 */
class LanguagesDirectory(override val path: Path): ResourceContainerDirectory<LanguageFile>({ LanguageFile(it) })
