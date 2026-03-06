package me.flamingo.resourceful.structure.assets.sounds

import kotlinx.serialization.json.JsonObject
import me.flamingo.resourceful.structure.Namespace
import me.flamingo.resourceful.structure.generic.JsonFile
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