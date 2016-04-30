package cn.peacesky.iahau.application;

import org.litepal.LitePalApplication;

import cn.peacesky.iahau.service.CourseService;
import cn.peacesky.iahau.service.GradeService;
import cn.peacesky.iahau.service.LinkService;
import cn.peacesky.iahau.service.ReGradeService;
import cn.peacesky.iahau.service.StudentInfoService;

/**
 * Created by SuooL on 15/9/27.
 */
public class MyApplication extends LitePalApplication {
    private CourseService courseService;
    private LinkService linkService;
    private StudentInfoService studentInfoService;
    private GradeService gradeService;
    private ReGradeService reGradeService;

    @Override
    public void onCreate() {
        super.onCreate();
        courseService = new CourseService();
        linkService = new LinkService();
        studentInfoService = new StudentInfoService();
        gradeService = new GradeService();
        reGradeService = new ReGradeService();
    }

    public CourseService getCourseService() {
        return courseService;
    }

    public LinkService getLinkService() {
        return linkService;
    }

    public StudentInfoService getStudentInfoService() {
        return studentInfoService;
    }

    public GradeService getGradeService() {
        return gradeService;
    }

    public ReGradeService getReGradeService() {
        return reGradeService;
    }
}

