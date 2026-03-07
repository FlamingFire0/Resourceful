package io.github.flamingfire0.resourceful.content

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
data class PackInfo(val pack: JsonObject) {
}