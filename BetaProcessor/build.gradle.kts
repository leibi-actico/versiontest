plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":BetaAnnotation"))
    implementation("com.google.auto.service:auto-service:1.1.1")
    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")
    implementation("org.apache.logging.log4j:log4j-core:2.23.1")

}

tasks.withType<JavaCompile> {
//    options.compilerArgs.add("--enable-preview")
//    options.compilerArgs.add("-XprintProcessorInfo")
//    options.compilerArgs.add("-XprintRounds")
}