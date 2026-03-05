package me.flamingo.resourceful.backend.structure.pack

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import me.flamingo.resourceful.structure.ResourcePack
import java.io.File
import kotlin.io.path.exists

class ResourcePackTest : ShouldSpec(
    {
        val exampleResourcepack = File(ClassLoader.getSystemResource("example_resourcepack").toURI()).toPath()
        val resourcePack = _root_ide_package_.me.flamingo.resourceful.structure.ResourcePack(exampleResourcepack)
    
        should("example resource pack should be recursively valid") {
            resourcePack.loop { 
                if(!it.path.exists()) return@loop // Some paths might be reserved in the structure, but won't exist in the pack. Just skip them
                it.isValid() shouldBe true
            }
        }
    }
)