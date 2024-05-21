plugins {
    id("java")
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.5"
}

group = "net.leibi.versiontest"

repositories {
    mavenCentral()
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

tasks.withType<JavaCompile> {
//    options.compilerArgs.add("--enable-preview")
    options.compilerArgs.add("-XprintProcessorInfo")
    options.compilerArgs.add("-XprintRounds")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation(project(":BetaAnnotation"))
    annotationProcessor(project(":BetaProcessor"))
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}