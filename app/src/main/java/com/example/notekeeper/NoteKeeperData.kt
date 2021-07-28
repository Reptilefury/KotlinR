class  CourseInfo( val courseId: String,val CourseTitle: String)
class NoteInfo(var course: CourseInfo, var title: String, var text : String)