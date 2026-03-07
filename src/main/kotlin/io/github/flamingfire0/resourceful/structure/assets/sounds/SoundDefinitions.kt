package io.github.flamingfire0.resourceful.structure.assets.sounds

import io.github.flamingfire0.resourceful.helper.Json
import io.github.flamingfire0.resourceful.helper.caching.Cache
import io.github.flamingfire0.resourceful.structure.Namespace
import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import kotlinx.serialization.json.JsonObject
import java.nio.file.Path
import kotlin.io.path.readText

/**
 * An JSON file used to tell the sound system what sound files to play when a sound event is triggered by one or more in-game events.
 * 
 * Location: /assets/{namespace}/sounds.json
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see SoundsDirectory
 * @see Namespace
 */
class SoundDefinitions(override val path: Path): JsonFile<JsonObject>() {
    override val resource: Cache<JsonObject> = Cache { Json.decodeFromString(path.readText()) }
}