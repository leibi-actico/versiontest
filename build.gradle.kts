plugins {
    java

}

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
}

tasks.withType<JavaCompile> {
//    options.compilerArgs.add("--enable-preview")
    options.compilerArgs.add("-XprintProcessorInfo")
    options.compilerArgs.add("-XprintRounds")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

//reckonTagCreate.dependsOn check
