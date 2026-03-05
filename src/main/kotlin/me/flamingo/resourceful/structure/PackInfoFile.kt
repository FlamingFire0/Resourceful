package me.flamingo.resourceful.structure

import kotlinx.serialization.json.JsonObject
import me.flamingo.resourceful.json
import me.flamingo.resourceful.structure.generic.FileBacked
import me.flamingo.resourceful.structure.generic.ResourceContainer
import java.nio.file.Path
import kotlin.io.path.readText

class PackInfoFile(override val path: Path): FileBacked, ResourceContainer<JsonObject> {
    override val fileExtension: String = "mcmeta"
    override fun resolve(): JsonObject? {
        if (!isValid()) return null
        return json.decodeFromString(path.readText())
    }
}