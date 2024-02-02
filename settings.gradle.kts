pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ComponentDemo"
include(":app")
include(":Business:Settings")
include(":Business:Offline")
include(":Service:Analyzer")
include(":Service:Network")
