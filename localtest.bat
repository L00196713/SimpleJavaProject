@echo off
set JAVA_HOME="C:\Jenkins_agent\apps\jdk-21.0.2"
set MAVEN_HOME="C:\Jenkins_agent\apps\apache-maven-3.9.11"
set PATH=%JAVA_HOME%\bin;%MAVEN_HOME%\bin;%PATH%

mvn clean package