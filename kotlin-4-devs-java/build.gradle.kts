plugins {
    kotlin("jvm") version "1.9.0"
}

group = "br.com.emerson"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://jcenter.bintray.com")
}

dependencies {
    implementation ("org.funktionale:funktionale-all:1.2")
    runtimeOnly ("org.jetbrains.kotlin:kotlin-reflect:1.9.10")

    testImplementation(kotlin("test"))
    testImplementation ("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation ("org.amshove.kluent:kluent:1.68")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}