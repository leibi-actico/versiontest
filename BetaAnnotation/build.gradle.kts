plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {


}

tasks.withType<JavaCompile> {
//    options.compilerArgs.add("--enable-preview")
//    options.compilerArgs.add("-XprintProcessorInfo")
//    options.compilerArgs.add("-XprintRounds")
}