package io.github.flamingfire0.resourceful.structure.assets.equipment

import io.github.flamingfire0.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [EquipmentFile]s.
 * 
 * Location: /assets/{namespace}/equipment
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see EquipmentFile
 */
class EquipmentDirectory(override val path: Path): ResourceContainerDirectory<EquipmentFile>({ EquipmentFile(it) })