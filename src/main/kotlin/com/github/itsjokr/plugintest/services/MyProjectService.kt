package com.github.itsjokr.plugintest.services

import com.intellij.openapi.project.Project
import com.github.itsjokr.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
