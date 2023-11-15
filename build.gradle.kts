import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val springBootVersion = "2.7.3"
    id ("org.springframework.boot") version springBootVersion
    id ("io.spring.dependency-management") version "1.1.3"
    kotlin("jvm") version "1.8.21"
    id ("org.jetbrains.kotlin.plugin.spring") version "1.8.21"
    id ("org.flywaydb.flyway") version "9.22.3"
}

group = "com.gorstreller"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
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
    implementation ("org.springframework.boot:spring-boot-starter")
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("org.springframework.boot:spring-boot-starter-security")
    implementation ("org.springframework.boot:spring-boot-devtools")
//    implementation ("org.springframework.boot:spring-boot-starter-oauth2-client")
    implementation ("org.springframework.boot:spring-boot-starter-thymeleaf")
//    implementation ("com.okta.spring:okta-spring-boot-starter")
    implementation("org.springdoc:springdoc-openapi-ui:1.6.15")
    implementation("org.springdoc:springdoc-openapi-kotlin:1.6.15")
    implementation ("javax.persistence:javax.persistence-api:2.2")
    implementation ("org.jetbrains.kotlin:kotlin-reflect")
    implementation ("io.github.microutils:kotlin-logging-jvm:3.0.5")
    implementation ("org.flywaydb:flyway-core:9.22.3")
//    implementation ("ch.qos.logback:logback-classic:1.4.11")
    implementation ("org.jetbrains.kotlinx:kotlinx-serialization-hocon:1.6.0")
    implementation ("com.typesafe:config:1.4.3")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.6")

    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    runtimeOnly("org.postgresql:postgresql")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

flyway {
    url = "jdbc:postgresql://localhost:5432/movies_project"
    user = "postgres"
    password = "root"
}

tasks.withType<Test> {
    useJUnitPlatform()
}
