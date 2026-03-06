package me.flamingo.resourceful.structure.generic

/**
 * A JSON file.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 * @see FileBacked
 */
abstract class JsonFile<T>: FileBacked, ResourceContainer<T> {
    override val fileExtension: String = "json"
}