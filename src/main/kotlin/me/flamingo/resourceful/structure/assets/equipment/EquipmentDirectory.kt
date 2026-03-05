package me.flamingo.resourceful.structure.assets.equipment

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class EquipmentDirectory(override val path: Path): ResourceContainerDirectory<EquipmentFile>({ EquipmentFile(it) })