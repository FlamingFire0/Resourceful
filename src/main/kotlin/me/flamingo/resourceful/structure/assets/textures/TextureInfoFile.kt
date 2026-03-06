package me.flamingo.resourceful.structure.assets.textures

import kotlinx.serialization.json.JsonObject
import me.flamingo.resourceful.Json
import me.flamingo.resourceful.structure.generic.JsonFile
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * A MCMETA file that holds additional information about textures.
 * 
 * Location: /assets/{namespace}/textures/.../{file}.png.mcmeta
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see TexturesDirectory
 * @see TextureFile
 */
class TextureInfoFile(override val path: Path): JsonFile<JsonObject>() {
    override val fileExtension: String = "mcmeta"
    override fun resolve(): JsonObject? {
        if (!isValid()) return null
        return Json.decodeFromString(path.readText())
    }
}