package com.example.demo.firstExam;

import com.example.demo.DemoApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
//
//@RestController
//public class RestEnpoints {

//    @Value("${default.course.name}")
//    private String cName;
//    @Value("${default.course.chapterCount}")
//    private int chaptersCount;

//    @Value("${course.name}")
//    private String cName;
//    @Value("${course.chapterCount}")
//    private int chaptersCount;

//    @Autowired
//    private CourseConfiguration courseConfiguration;
//
//    private static final Logger LOGGER = LogManager.getLogger(DemoApplication.class);
//
//    @RequestMapping("/tcourse")
//    public Course getEndpoint(@RequestParam(value="name", defaultValue = "Taaan", required = false) String name,
//                              @RequestParam(value="chapterCount", defaultValue = "2", required = false) int chapterCount){
//        return new Course(name, chapterCount);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/register/course")
//    public String saveCourse(@RequestBody Course course){
//        return "Your course named " + course.getName() + " with " + course.getChapterCount() + " chapters saved successfully.";
//    }
//
//
//
//    @RequestMapping("/tdefaultCourse")
//    public Course getDefaultCourse(@RequestParam(value="name", defaultValue = "Taaan", required = false) String name,
//                                   @RequestParam(value="chapterCount", defaultValue = "2", required = false) int chapterCount){
//
////
////        LOGGER.info("Info level log message");
////        LOGGER.debug("Debug level log message");
////        LOGGER.error("Error level log message");
//
//        return new Course(cName, chaptersCount);
//    }
//
//    @RequestMapping("/tgetHierarchical")
//    public HashMap<String, Object> getConfigAnnotateProperties(@RequestParam(value="name", defaultValue = "Taaan", required = false) String name,
//                                               @RequestParam(value="chapterCount", defaultValue = "2", required = false) int chapterCount){
//        HashMap<String, Object> map = new HashMap<String, Object>();
//        map.put("name", courseConfiguration.getName());
//        map.put("chapterCount", courseConfiguration.getChapterCount());
//        map.put("rating", courseConfiguration.getRating());
//        map.put("author", courseConfiguration.getAuthor());
//
//        return map;
//    }


//}
