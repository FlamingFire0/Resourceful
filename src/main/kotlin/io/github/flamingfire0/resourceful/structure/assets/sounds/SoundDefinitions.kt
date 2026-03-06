package io.github.flamingfire0.resourceful.structure.assets.sounds

import io.github.flamingfire0.resourceful.structure.generic.JsonFile
import kotlinx.serialization.json.JsonObject
import io.github.flamingfire0.resourceful.structure.Namespace
import java.nio.file.Path

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
class SoundDefinitions(override val path: Path): JsonFile<JsonObject>()