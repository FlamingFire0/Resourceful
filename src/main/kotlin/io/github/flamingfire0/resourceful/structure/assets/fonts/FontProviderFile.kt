package io.github.flamingfire0.resourceful.structure.assets.fonts

import io.github.flamingfire0.resourceful.Json
import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import kotlinx.serialization.json.JsonObject
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * A JSON file defining font providers.
 * 
 * Location: /assets/{namespace}/font/.../{file}.json
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see FontsDirectory
 */
class FontProviderFile(override val path: Path): JsonFile<JsonObject>() {
    override val fileExtension: String = "json"
    override fun resolve(): JsonObject? {
        if (!isValid()) return null
        return Json.decodeFromString(path.readText())
    }
}