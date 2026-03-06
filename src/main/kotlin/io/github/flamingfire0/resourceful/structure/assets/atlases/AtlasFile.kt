package io.github.flamingfire0.resourceful.structure.assets.atlases

import io.github.flamingfire0.resourceful.Json
import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import kotlinx.serialization.json.JsonObject
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * A JSON file controlling which textures are included in an atlas.
 * 
 * Location: /assets/{namespace}/atlases/.../{file}.json
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see AtlasesDirectory
 */
class AtlasFile(override val path: Path): JsonFile<JsonObject>() {
    override val fileExtension: String = "json"
    override fun resolve(): JsonObject? {
        if (!isValid()) return null
        return Json.decodeFromString(path.readText())
    }
}