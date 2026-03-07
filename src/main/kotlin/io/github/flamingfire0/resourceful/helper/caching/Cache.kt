package io.github.flamingfire0.resourceful.helper.caching

/**
 * A resettable cache.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 */
class Cache<out T: Any>(private val initializer: () -> T?) {
    @Volatile private var _value: T? = null
    fun get(): T = _value ?: synchronized(this) { _value ?: initializer().also { _value = it } ?: _value!! }
    fun reset() = synchronized(this) { _value = null }
    val value: T get() = get()
    
    typealias CacheSet<T> = Cache<Set<T>>
    
    companion object {
        fun <T> staticCacheSet(vararg elements: T) = CacheSet { elements.toSet() }
    }
}