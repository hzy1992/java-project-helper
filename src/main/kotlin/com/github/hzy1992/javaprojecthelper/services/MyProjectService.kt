package com.github.hzy1992.javaprojecthelper.services

import com.intellij.openapi.project.Project
import com.github.hzy1992.javaprojecthelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
