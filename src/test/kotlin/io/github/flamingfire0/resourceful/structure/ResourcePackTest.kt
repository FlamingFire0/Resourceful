package io.github.flamingfire0.resourceful.structure

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import java.io.File
import kotlin.io.path.exists

@Suppress("Unused")
class ResourcePackTest : ShouldSpec(
    {
        val resourceUrl = checkNotNull(ClassLoader.getSystemResource("example_resourcepack")) {
            "Test resource 'example_resourcepack' not found on classpath — check src/test/resources/"
        }
        val exampleResourcepack = File(resourceUrl.toURI()).toPath()
        val resourcePack = ResourcePack(exampleResourcepack)
    
        should("example resource pack should be recursively valid") {
            resourcePack.loop { 
                if(!it.path.exists()) return@loop // Some paths might be reserved in the structure, but won't exist in the pack. Just skip them
                it.isValid() shouldBe true
            }
        }
    }
)