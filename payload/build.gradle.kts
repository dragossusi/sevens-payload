plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    `maven-publish`
    signing
}

group = "ro.dragossusi.sevens"
version = "0.0.1"

kotlin {
    /* Targets configuration omitted. 
    *  To find out how to configure the targets, please follow the link:
    *  https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html#setting-up-targets */
    jvm()
    js() {
        nodejs()
    }
//    ios() {
//        binaries {
//            framework {
//                baseName = "SevensPayload"
//            }
//        }
//    }
//    linuxX64()

    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serialization}")
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
//        iosMain {
//            dependencies {
//            }
//        }
//        linuxX64Main {
//            dependencies {
//            }
//        }

    }
}

afterEvaluate {
    publishing {
        publications {
            // Creates a Maven publication called "release".
            filterIsInstance<MavenPublication>().forEach {

                // You can then customize attributes of the publication as shown below.
                it.groupId = "ro.dragossusi.sevens"
                it.artifactId = "payload"
                version = Versions.app

                it.pom {
                    name.set("Sevens Payload")
                    description.set("Payload data used in sevens")
                    url.set("http://www.dragossusi.ro/sevens")
                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }
                    developers {
                        developer {
                            id.set("dragossusi")
                            name.set("Dragos Rachieru")
                            email.set("rachierudragos97@gmail.com")
                        }
                    }
                    scm {
                        connection.set("scm:git:git://github.com/dragossusi/sevens-payload.git")
                        developerConnection.set("scm:git:ssh://github.com/dragossusi/sevens-payload.git")
                        url.set("https://github.com/dragossusi/sevens-payload/")
                    }
                }
            }
        }
        repositories {
            maven {
                name = "sonatype"
                url = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
                credentials {
                    username = project.property("sonatype.username").toString()
                    password = project.property("sonatype.password").toString()
                }
            }
        }
    }

    signing {
        publishing.publications.forEach { publication ->
            sign(publication)
        }
    }

}