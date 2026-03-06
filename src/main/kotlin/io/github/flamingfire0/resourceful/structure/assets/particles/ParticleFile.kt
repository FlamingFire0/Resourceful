package io.github.flamingfire0.resourceful.structure.assets.particles

import io.github.flamingfire0.resourceful.Json
import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import kotlinx.serialization.json.JsonObject
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * A JSON file specifying the textures to use for particles.
 * 
 * Location: /assets/{namespace}/particles/.../{file}.json
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see ParticlesDirectory
 */
class ParticleFile(override val path: Path): JsonFile<JsonObject>() {
    override val fileExtension: String = "json"
    override fun resolve(): JsonObject? {
        if (!isValid()) return null
        return Json.decodeFromString(path.readText())
    }
}