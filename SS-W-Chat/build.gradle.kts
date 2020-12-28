val project = Project.Chat
group = project.group

dependencies {
    project.dependProjectName.forEach { implementation(project(":$it")) }
}

bungee {
    name = project.name
    version = project.version
    main = project.main
    author = project.author
    depends = project.dependPlugin
}