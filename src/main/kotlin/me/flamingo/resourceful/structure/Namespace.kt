package me.flamingo.resourceful.structure

import me.flamingo.resourceful.structure.assets.atlases.AtlasesDirectory
import me.flamingo.resourceful.structure.assets.blockstates.BlockStatesDirectory
import me.flamingo.resourceful.structure.assets.equipment.EquipmentDirectory
import me.flamingo.resourceful.structure.assets.fonts.FontsDirectory
import me.flamingo.resourceful.structure.assets.items.ItemsDirectory
import me.flamingo.resourceful.structure.assets.languages.LanguagesDirectory
import me.flamingo.resourceful.structure.assets.models.ModelsDirectory
import me.flamingo.resourceful.structure.assets.particles.ParticlesDirectory
import me.flamingo.resourceful.structure.assets.post_effects.PostEffectsDirectory
import me.flamingo.resourceful.structure.assets.sounds.SoundDefinitions
import me.flamingo.resourceful.structure.assets.sounds.SoundsDirectory
import me.flamingo.resourceful.structure.assets.texts.TextsDirectory
import me.flamingo.resourceful.structure.assets.textures.TexturesDirectory
import me.flamingo.resourceful.structure.assets.waypoint_style.WaypointStylesDirectory
import me.flamingo.resourceful.structure.generic.DirectoryBacked
import me.flamingo.resourceful.structure.generic.PathBacked
import me.flamingo.resourceful.structure.generic.ResourceContainerDirectory
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