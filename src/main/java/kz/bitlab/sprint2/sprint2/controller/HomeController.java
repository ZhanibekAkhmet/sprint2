package kz.bitlab.sprint2.sprint2.controller;

import kz.bitlab.sprint2.sprint2.Modals.Applications;
import kz.bitlab.sprint2.sprint2.Modals.Courses;
import kz.bitlab.sprint2.sprint2.repository.ApplicationRepository;
import kz.bitlab.sprint2.sprint2.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController{
 @Autowired
 private ApplicationRepository applicationRepository;
 @Autowired
 private CoursesRepository coursesRepository;
    @GetMapping(value = "/")
    public String sprintTask(Model model){
        List<Applications> applicationsList = applicationRepository.findAll();
        model.addAttribute("zayavki", applicationsList);
        return "index";
    }
    @GetMapping(value = "/acceptApp")
    public String acceptApplication(Model model){
        List<Applications> applicationsList = applicationRepository.findAllByHandled(true);
        model.addAttribute("zaver", applicationsList);
        return "accept";
    }
    @GetMapping(value = "/newApp")
    public String newApplication(Model model){
        List<Applications> applicationsList = applicationRepository.findAllByHandled(false);
        model.addAttribute("novaya", applicationsList);
        return "newAppIndex";
    }
    @PostMapping(value = "/addApp")
    public String addApplication(Applications applications){
        applicationRepository.save(applications);
        return "redirect:/";
    }

    @PostMapping(value = "/addCourse")
    public String addCourses(Courses courses){
        coursesRepository.save(courses);
        return "redirect:/";
    }
    @GetMapping(value = "/addKurs")
    public String addKurs(Model model){
        return "addKurses";
    }


    @GetMapping(value = "/addApplication")
    public String addApplic(Model model){
        List<Courses> coursesList= coursesRepository.findAll();
        model.addAttribute("kurs",coursesList);
        return "addApplication";
    }

    @GetMapping(value = "/details/{itemId}")
    public String detailsApplication(@PathVariable(name = "itemId") Long id, Model model){
       Applications applications= applicationRepository.findById(id).orElse(null);
       model.addAttribute("zaya",applications);
        return "details";
    }
    @PostMapping(value = "/saveApp")
    public String saveApplication(Applications applications){
        applicationRepository.save(applications);
        return "redirect:/";
    }
    @PostMapping(value = "/deleteApp")
    public String deleteApplication(Applications applications){
        applicationRepository.delete(applications);
        return "redirect:/";
    }

}
