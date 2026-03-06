package me.flamingo.resourceful.structure.assets.languages

import kotlinx.serialization.json.JsonObject
import me.flamingo.resourceful.Json
import me.flamingo.resourceful.structure.generic.JsonFile
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * A JSON file containing translations of text.
 * 
 * Location: /assets/{namespace}/lang/.../{language code}.json
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see LanguagesDirectory
 */
class LanguageFile(override val path: Path): JsonFile<JsonObject>() {
    override val fileExtension: String = "json"
    override fun resolve(): JsonObject? {
        if (!isValid()) return null
        return Json.decodeFromString(path.readText())
    }
}