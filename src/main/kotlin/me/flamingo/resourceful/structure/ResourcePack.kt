package me.flamingo.resourceful.structure

import me.flamingo.resourceful.structure.generic.DirectoryBacked
import me.flamingo.resourceful.structure.generic.ImageFile
import me.flamingo.resourceful.structure.generic.PathBacked
import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory that is the root of the resource pack.
 * 
 * Location: /
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see ResourceContainerDirectory
 */
class ResourcePack(override val path: Path): DirectoryBacked {
    val packInfoFile: PackInfoFile = PackInfoFile(path.resolve("pack.mcmeta"))
    val assetsDirectory: AssetsDirectory = AssetsDirectory(path.resolve("assets"))
    val iconFile: ImageFile = ImageFile(path.resolve("pack.png"))
    
    override fun isValid(): Boolean = super.isValid() && packInfoFile.isValid() && assetsDirectory.isValid()
    override val children: Set<PathBacked> = setOf(packInfoFile, assetsDirectory, iconFile)
}