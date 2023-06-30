package com.example.whatsapprun

import androidx.annotation.IdRes

class ImageResource(
    var previous: ImageResource?,
    var next: ImageResource?,
    @IdRes val resId:  Int
)

class DoubledLinkedList(
    private var cursor: ImageResource?,
    private var start: ImageResource?,
    private var end: ImageResource
) {
    private var size: Int = 0

    private val set: MutableSet<ImageResource> = mutableSetOf()
    fun add(imageResource: ImageResource) {
        if (set.size == 0) {
            cursor = imageResource
            start = imageResource
        }

        end = imageResource
        set.add(imageResource)
        size++
    }

    fun next() {

    }
}
