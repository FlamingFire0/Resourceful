plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    `java-library`
    `maven-publish`
}

group = "me.flamingo"
version = "0.1.0"

dependencies {
    api(libs.kotlinx.serialization.json)
    testImplementation(libs.bundles.testing)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "resourceful"
            from(components["java"])
        }
    }
}

tasks.test { useJUnitPlatform() }

kotlin {
    jvmToolchain(libs.versions.java.get().toInt())
}