package com.chen.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

public class TestPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "Hello plugin"
    }

}
