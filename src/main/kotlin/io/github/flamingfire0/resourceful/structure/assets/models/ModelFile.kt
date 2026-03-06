package io.github.flamingfire0.resourceful.structure.assets.models

import io.github.flamingfire0.resourceful.helper.Json
import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import kotlinx.serialization.json.JsonObject
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * A JSON file defining three-dimensional shapes used to render blocks and items.
 * 
 * Location: /assets/{namespace}/models/.../{file}.json
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see ModelsDirectory
 */
class ModelFile(override val path: Path): JsonFile<JsonObject>() {
    override val fileExtension: String = "json"
    override fun resolve(): JsonObject? {
        if (!isValid()) return null
        return Json.decodeFromString(path.readText())
    }
}