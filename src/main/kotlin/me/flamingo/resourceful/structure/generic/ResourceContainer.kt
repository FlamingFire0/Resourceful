package me.flamingo.resourceful.structure.generic

interface ResourceContainer<T> {
    fun resolve(): T? = null
}