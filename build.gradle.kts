plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.maven.publish)
    `java-library`
}

group = "io.github.flamingfire0"
version = "0.1.0-SNAPSHOT"
description = "A Kotlin library for creating, parsing, and modifying Minecraft Resource Packs."

dependencies {
    api(libs.kotlinx.serialization.json)
    testImplementation(libs.bundles.testing)
}

kotlin {
    jvmToolchain(libs.versions.java.get().toInt())
}

tasks.test { 
    outputs.upToDateWhen { false } // always run tests
    useJUnitPlatform()
}

mavenPublishing {
    publishToMavenCentral(com.vanniktech.maven.publish.SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
    
    pom {
        name = "Resourceful"
        url = "https://github.com/FlamingFire0/Resourceful"
        description = project.description
        licenses {
            license {
                name = "Apache-2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }
        developers {
            developer {
                id = "flamingfire0"
                name = "Flamingo"
                email = "flamingfire0@proton.me"
                url = "https://github.com/FlamingFire0"
            }
        }
        scm {
            url = "https://github.com/FlamingFire0/Resourceful"
        }
    }
}