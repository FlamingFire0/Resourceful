package io.github.flamingfire0.resourceful.structure.assets.items

import io.github.flamingfire0.resourceful.Json
import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import kotlinx.serialization.json.JsonObject
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * A JSON file controlling the rendering of items.
 * 
 * Location: /assets/{namespace}/items/.../{file}.json
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see ItemsDirectory
 */
class ItemFile(override val path: Path): JsonFile<JsonObject>() {
    override val fileExtension: String = "json"
    override fun resolve(): JsonObject? {
        if (!isValid()) return null
        return Json.decodeFromString(path.readText())
    }
}