plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    `maven-publish`
    signing
}

version = Versions.app

kotlin {

    jvm()
    js {
        nodejs()
    }
    ios {
        binaries.framework {
            baseName = "SevensPayload"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serialization}")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jsMain by getting {}
        val jsTest by getting {}
        val jvmMain by getting {}
        val jvmTest by getting {}

    }
}

publishing {
    publications.withType<MavenPublication> {
        addPom()
    }
    publications.getByName<MavenPublication>("kotlinMultiplatform") {
        addPom()
    }
}

fun MavenPublication.addPom() {
    pom {
        name.set("Sevens Payload")
        description.set("Payload data used in sevens")
        url.set("http://www.dragossusi.ro/sevens")
    }
}

apply<PublishPlugin>()
