package io.github.flamingfire0.resourceful.helper.caching

/**
 * A resettable cache.
 * 
 * @author FlamingFire0
 * @since 0.1.0
 */
open class Cache<out T: Any>(private val initializer: () -> T) {
    @Volatile private var _value: T? = null
    
    fun get(): T = _value ?: synchronized(this) {
        _value ?: initializer().also { _value = it }
    }
    
    fun reset() { synchronized(this) { _value = null } }
}