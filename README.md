# 自定义的Gradle插件
## 使用方法
### (1)添加maven仓库,添加依赖
```
buildscript {
    repositories {
        maven {url "https://raw.githubusercontent.com/xiuyi/gradle_plugin/master"}
    }
    dependencies {
        classpath 'com.chen.plugin:gradle:1.0'
    }
}
```
### (2)引用插件
    apply plugin: 'gradle-plugin'

## 修改方法
    项目源码位于gradle_plugin目录下，修改src.main.groovy.com.chen.gradle.MyPlugin类<br/>
    如果修改了类名则需要修改<br/>
    src.main.resourecs.META-INF.gradle-plugins.gradle-plugin.properties文件的implementation-class引用

