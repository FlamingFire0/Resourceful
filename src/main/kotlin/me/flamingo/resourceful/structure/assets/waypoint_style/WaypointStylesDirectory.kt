package me.flamingo.resourceful.structure.assets.waypoint_style

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory of [WaypointStyleFile]s.
 * 
 * Location: /assets/{namespace}/waypoint_style
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see WaypointStylesDirectory
 */
class WaypointStylesDirectory(override val path: Path): ResourceContainerDirectory<WaypointStyleFile>({ WaypointStyleFile(it) })
