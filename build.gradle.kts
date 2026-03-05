plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.shadow)
    alias(libs.plugins.kotlin.serialization)
}

group = "me.flamingo"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(libs.kotlinx.serialization.json)
    
    testImplementation(libs.bundles.testing)
}

tasks.test { useJUnitPlatform() }

kotlin {
    jvmToolchain(libs.versions.java.get().toInt())
}