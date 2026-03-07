package io.github.flamingfire0.resourceful.structure.assets.blockstates

import io.github.flamingfire0.resourceful.helper.Json
import io.github.flamingfire0.resourceful.helper.caching.Cache
import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import kotlinx.serialization.json.JsonObject
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * A JSON file defining the models for each block state of blocks.
 * 
 * Location: /assets/{namespace}/blockstates/.../{file}.json
 *
 * @author FlamingFire0
 * @since 0.1.0
 * @see BlockStatesDirectory
 */
class BlockStateFile(override val path: Path): JsonFile<JsonObject>() {
    override val fileExtension: String = "json"
    override val resource: Cache<JsonObject> = Cache { Json.decodeFromString(path.readText()) }
}