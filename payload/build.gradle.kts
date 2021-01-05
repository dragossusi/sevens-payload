plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    `maven-publish`
    signing
}

group = "ro.dragossusi.sevens"
version = Versions.app

kotlin {
    /* Targets configuration omitted. 
    *  To find out how to configure the targets, please follow the link:
    *  https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html#setting-up-targets */
    jvm()
    js {
        nodejs()
        browser()
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

val emptyJavadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}


val emptyJar by tasks.creating(Jar::class)

publishing {
//    publications.getByName<MavenPublication>("kotlinMultiplatform") {
//        artifact(emptyJar)
//        artifact(emptyJar) {
//            classifier = "javadoc"
//        }
//        artifact(emptyJar) {
//            classifier = "sources"
//        }
//    }
    publications.withType<MavenPublication> {
        pom {
            name.set("Sevens Payload")
            description.set("Payload data used in sevens")
            url.set("http://www.dragossusi.ro/sevens")
        }
    }
//    publications.withType<MavenPublication>().all {
//        artifact(emptyJavadocJar.get())
//    }
}

apply<PublishPlugin>()
