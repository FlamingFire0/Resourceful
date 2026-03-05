package me.flamingo.resourceful.structure.assets.waypoint_style

import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

class WaypointStylesDirectory(override val path: Path): ResourceContainerDirectory<WaypointStyleFile>({ WaypointStyleFile(it) })
