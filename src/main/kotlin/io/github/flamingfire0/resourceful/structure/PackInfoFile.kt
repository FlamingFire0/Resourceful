package io.github.flamingfire0.resourceful.structure

import io.github.flamingfire0.resourceful.content.PackInfo
import io.github.flamingfire0.resourceful.helper.Json
import io.github.flamingfire0.resourceful.helper.caching.Cache
import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import io.github.flamingfire0.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * A MCMETA file that holds additional information about a pack.
 * 
 * Location: /pack.mcmeta
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see ResourceContainerDirectory
 */
class PackInfoFile(override val path: Path): JsonFile<PackInfo>() {
    override val fileExtension: String = "mcmeta"
    override val resource: Cache<PackInfo> = Cache { Json.decodeFromString(path.readText()) }
}