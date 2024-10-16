#!/bin/bash

# Update Java version
find . -name "pom.xml" -type f -exec sed -i '
    s/<maven.compiler.source>11<\/maven.compiler.source>/<maven.compiler.source>21<\/maven.compiler.source>/g
    s/<maven.compiler.target>11<\/maven.compiler.target>/<maven.compiler.target>21<\/maven.compiler.target>/g
' {} +

# Update Spring Boot version
find . -name "pom.xml" -type f -exec sed -i '
    s/<spring-boot.version>2.5.5<\/spring-boot.version>/<spring-boot.version>3.1.5<\/spring-boot.version>/g
' {} +

# Update Spring Cloud version
find . -name "pom.xml" -type f -exec sed -i '
    s/<spring-cloud.version>2020.0.4<\/spring-cloud.version>/<spring-cloud.version>2022.0.4<\/spring-cloud.version>/g
' {} +

# Update JUnit dependency
find . -name "pom.xml" -type f -exec sed -i '
    /<groupId>junit<\/groupId>/,/<\/dependency>/ c\
        <dependency>\
            <groupId>org.junit.jupiter<\/groupId>\
            <artifactId>junit-jupiter<\/artifactId>\
            <version>5.9.2<\/version>\
            <scope>test<\/scope>\
        <\/dependency>
' {} +

# Add or update maven-compiler-plugin
find . -name "pom.xml" -type f -exec sed -i '
    /<build>/,/<\/build>/ {
        /<plugins>/,/<\/plugins>/ {
            /<groupId>org.apache.maven.plugins<\/groupId>/,/<\/plugin>/ {
                /<artifactId>maven-compiler-plugin<\/artifactId>/,/<\/plugin>/ c\
                <plugin>\
                    <groupId>org.apache.maven.plugins<\/groupId>\
                    <artifactId>maven-compiler-plugin<\/artifactId>\
                    <version>3.11.0<\/version>\
                    <configuration>\
                        <release>21<\/release>\
                    <\/configuration>\
                <\/plugin>
            }
        }
    }
' {} +