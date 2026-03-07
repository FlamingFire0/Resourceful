package io.github.flamingfire0.resourceful.structure.assets.equipment

import io.github.flamingfire0.resourceful.helper.Json
import io.github.flamingfire0.resourceful.helper.caching.Cache
import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import kotlinx.serialization.json.JsonObject
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * A JSON file controlling the appearance of worn equipment.
 * 
 * Location: /assets/{namespace}/equipment/.../{file}.json
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see EquipmentDirectory
 */
class EquipmentFile(override val path: Path): JsonFile<JsonObject>() {
    override val fileExtension: String = "json"
    override val resource: Cache<JsonObject> = Cache { Json.decodeFromString(path.readText()) }
}