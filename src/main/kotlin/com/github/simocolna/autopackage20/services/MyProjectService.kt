package com.github.simocolna.autopackage20.services

import com.intellij.openapi.project.Project
import com.github.simocolna.autopackage20.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
