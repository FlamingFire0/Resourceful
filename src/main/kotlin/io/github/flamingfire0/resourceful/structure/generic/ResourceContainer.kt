package io.github.flamingfire0.resourceful.structure.generic

/**
 * A container of resources/data.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 */
interface ResourceContainer<T> {
    fun resolve(): T? = null
}