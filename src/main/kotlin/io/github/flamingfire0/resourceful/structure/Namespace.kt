package io.github.flamingfire0.resourceful.structure

import io.github.flamingfire0.resourceful.structure.assets.atlases.AtlasesDirectory
import io.github.flamingfire0.resourceful.structure.assets.blockstates.BlockStatesDirectory
import io.github.flamingfire0.resourceful.structure.assets.equipment.EquipmentDirectory
import io.github.flamingfire0.resourceful.structure.assets.fonts.FontsDirectory
import io.github.flamingfire0.resourceful.structure.assets.items.ItemsDirectory
import io.github.flamingfire0.resourceful.structure.assets.languages.LanguagesDirectory
import io.github.flamingfire0.resourceful.structure.assets.models.ModelsDirectory
import io.github.flamingfire0.resourceful.structure.assets.particles.ParticlesDirectory
import io.github.flamingfire0.resourceful.structure.assets.post_effects.PostEffectsDirectory
import io.github.flamingfire0.resourceful.structure.assets.sounds.SoundDefinitions
import io.github.flamingfire0.resourceful.structure.assets.sounds.SoundsDirectory
import io.github.flamingfire0.resourceful.structure.assets.texts.TextsDirectory
import io.github.flamingfire0.resourceful.structure.assets.textures.TexturesDirectory
import io.github.flamingfire0.resourceful.structure.assets.waypoint_style.WaypointStylesDirectory
import io.github.flamingfire0.resourceful.structure.generic.DirectoryBacked
import io.github.flamingfire0.resourceful.structure.generic.PathBacked
import io.github.flamingfire0.resourceful.structure.generic.ResourceContainerDirectory
import java.nio.file.Path

/**
 * A directory containing most [ResourceContainerDirectory]s.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see ResourceContainerDirectory
 */
class Namespace(override val path: Path): DirectoryBacked {
    val atlases     = AtlasesDirectory(path.resolve("atlases"))
    val blockStates = BlockStatesDirectory(path.resolve("blockstates"))
    val equipment   = EquipmentDirectory(path.resolve("equipment"))
    val fonts       = FontsDirectory(path.resolve("font"))
    val items       = ItemsDirectory(path.resolve("items"))
    val languages   = LanguagesDirectory(path.resolve("lang"))
    val models      = ModelsDirectory(path.resolve("models"))
    val particles   = ParticlesDirectory(path.resolve("particles"))
    val postEffects = PostEffectsDirectory(path.resolve("post_effect"))
    val sounds      = SoundsDirectory(path.resolve("sounds"))
    val texts       = TextsDirectory(path.resolve("texts"))
    val textures    = TexturesDirectory(path.resolve("textures"))
    val waypointStyle = WaypointStylesDirectory(path.resolve("waypoint_style"))
    val soundDefinitions: SoundDefinitions =
        SoundDefinitions(path.resolve("sounds.json"))
    
    override val children: Set<PathBacked> = setOf(
        atlases,
        blockStates,
        equipment,
        fonts, 
        items, 
        languages,
        models, 
        particles,
        postEffects,
        //shaders
        sounds, 
        texts,
        textures,
        waypointStyle,
        soundDefinitions,
    )
}