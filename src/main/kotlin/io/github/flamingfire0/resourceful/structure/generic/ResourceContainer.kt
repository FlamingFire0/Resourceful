package io.github.flamingfire0.resourceful.structure.generic

import io.github.flamingfire0.resourceful.helper.caching.Cache

/**
 * A container of resources/data.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 */
abstract class ResourceContainer<out T: Any> {
    abstract val resource: Cache<T>
}