package com.github.yuyu1025.touchthefish.services

import com.intellij.openapi.project.Project
import com.github.yuyu1025.touchthefish.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
