package com.erudev.imooc.pattern.creational.builder.v2;

/**
 * Created by eru on 2020/1/28.
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseArticle;
    private String courseVideo;
    private String courseQA;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseQA = courseBuilder.courseQA;
    }

    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
    
    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseArticle;
        private String courseVideo;
        private String courseQA;
        
        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }
        
        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }
}
