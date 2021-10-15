package com.github.bangwu.fitnesscheck.services

import com.intellij.openapi.project.Project
import com.github.bangwu.fitnesscheck.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
