package me.flamingo.resourceful.structure.generic

import kotlin.io.path.isDirectory

interface DirectoryBacked: PathBacked {
    override fun isValid(): Boolean = super.isValid() && path.isDirectory()
    val children: Set<PathBacked>
}