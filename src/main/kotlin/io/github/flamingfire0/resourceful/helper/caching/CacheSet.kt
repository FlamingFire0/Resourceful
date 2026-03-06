package io.github.flamingfire0.resourceful.helper.caching

class CacheSet<out T: Any>(initializer: () -> Set<T>): Set<T>, Cache<Set<T>>(initializer) {
    override val size get() = get().size
    override fun contains(element: @UnsafeVariance T) = get().contains(element)
    override fun containsAll(elements: Collection<@UnsafeVariance T>) = get().containsAll(elements)
    override fun isEmpty() = get().isEmpty()
    override fun iterator() = get().iterator()
    
    
    /**
     * **WARNING: This stays cached forever! Do not use it with non-static elements.**
     */
    constructor(vararg values: T): this({values.toSet()})
}