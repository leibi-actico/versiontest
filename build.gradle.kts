plugins {
    java

}

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
}


tasks.withType<Test> {
    useJUnitPlatform()
}

//reckonTagCreate.dependsOn check
