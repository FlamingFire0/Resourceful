package io.github.flamingfire0.resourceful.structure.assets.waypoint_style

import io.github.flamingfire0.resourceful.Json
import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import kotlinx.serialization.json.JsonObject
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * A JSON file controlling the appearance of waypoints on the locator_bar.
 * 
 * Location: /assets/{namespace}/waypoint_style/.../{file}.json
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see WaypointStylesDirectory
 */
class WaypointStyleFile(override val path: Path): JsonFile<JsonObject>() {
    override val fileExtension: String = "json"
    override fun resolve(): JsonObject? {
        if (!isValid()) return null
        return Json.decodeFromString(path.readText())
    }
}