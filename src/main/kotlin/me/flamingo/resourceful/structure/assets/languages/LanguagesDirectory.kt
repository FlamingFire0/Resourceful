package me.flamingo.resourceful.structure.assets.languages

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class LanguagesDirectory(override val path: Path): ResourceContainerDirectory<LanguageFile>({ LanguageFile(it) })
