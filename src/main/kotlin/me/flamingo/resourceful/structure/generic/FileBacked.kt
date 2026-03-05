package me.flamingo.resourceful.structure.generic

import kotlin.io.path.isRegularFile

interface FileBacked: PathBacked {
    override fun isValid(): Boolean = super.isValid() && path.isRegularFile() && path.fileName.toString().endsWith(".$fileExtension")
    val fileExtension: String
}