﻿# MoBoilerplate
Java-Boilerplate for Plugins @ Abyss.
 
Based on https://github.com/RsAbyss/Java-Plugin-Boilerplate
 
Uses https://github.com/RsAbyss/AbyssAPI
 
# Setup
1. Clone this repository
2. Rename the package
3. Rename the MoBoilerplate.java to a plugin name of your choice. Make sure to rename your class as well
4. Go to build.gradle.kts
    1. Rename the group to your package name from step 2
    2. If your want edit the version
    3. Replace the output directory in copyJar task to your desired location
5. Set the name in settings.gradle.kts to the same as in step 3
6. Execute the gradle build task.
7. Done
