plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "resourceful"

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    
    repositories {
        mavenCentral()
    }
    
    versionCatalogs {
        create("libs") {
            from(files("versions.gradle.toml"))
        }
    }
}