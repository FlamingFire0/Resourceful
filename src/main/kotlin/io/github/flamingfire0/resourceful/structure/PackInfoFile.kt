package io.github.flamingfire0.resourceful.structure

import io.github.flamingfire0.resourceful.Json
import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import kotlinx.serialization.json.JsonObject
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
class PackInfoFile(override val path: Path): JsonFile<JsonObject>() {
    override val fileExtension: String = "mcmeta"
    override fun resolve(): JsonObject? {
        if (!isValid()) return null
        return Json.decodeFromString(path.readText())
    }
}