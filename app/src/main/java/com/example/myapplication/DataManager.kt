package com.example.myapplication

class DataManager {
    var courses = HashMap<String, CourseInfo>()
    var notes = ArrayList<NoteInfo>()
    init {
        initializeCourses()

    }

    private fun initializeCourses(){
        var course = CourseInfo("Android_Intent", "Android Programming with intents")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "Android async programming and services")
        courses.set(course.courseId, course)
        course = CourseInfo(courseId = "Java Fundamentals: The Java Language", title = "java_lang")
        courses.set(course.courseId, course)
        course = CourseInfo("java_core", "Java fundamentals: The Core Platform")
        courses.set(course.courseId, course)




    }
}