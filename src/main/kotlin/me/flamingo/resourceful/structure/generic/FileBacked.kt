package me.flamingo.resourceful.structure.generic

import kotlin.io.path.isRegularFile

/**
 * A file.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see FileBacked
 */
interface FileBacked: PathBacked {
    override fun isValid(): Boolean = super.isValid() && path.isRegularFile() && path.fileName.toString().endsWith(".$fileExtension")
    val fileExtension: String
}