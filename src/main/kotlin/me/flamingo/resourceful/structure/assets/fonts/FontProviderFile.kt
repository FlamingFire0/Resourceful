package me.flamingo.resourceful.structure.assets.fonts

import kotlinx.serialization.json.JsonObject
import me.flamingo.resourceful.Json
import me.flamingo.resourceful.structure.generic.JsonFile
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