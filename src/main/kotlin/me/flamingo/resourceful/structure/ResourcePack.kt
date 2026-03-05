package me.flamingo.resourceful.structure

import me.flamingo.resourceful.structure.generic.DirectoryBacked
import me.flamingo.resourceful.structure.generic.ImageFile
import me.flamingo.resourceful.structure.generic.PathBacked
import java.nio.file.Path

class ResourcePack(override val path: Path): DirectoryBacked {
    val packInfoFile: PackInfoFile = PackInfoFile(path.resolve("pack.mcmeta"))
    val assetsDirectory: AssetsDirectory = AssetsDirectory(path.resolve("assets"))
    val iconFile: ImageFile = ImageFile(path.resolve("pack.png"))
    
    override fun isValid(): Boolean = super.isValid() && packInfoFile.isValid() && assetsDirectory.isValid()
    override val children: Set<PathBacked> = setOf(packInfoFile, assetsDirectory, iconFile)
}