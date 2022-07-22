package io.spring.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.spring.pma.dao.EmployeeRepository;
import io.spring.pma.dao.ProjectRepository;
import io.spring.pma.entity.Employee;
import io.spring.pma.entity.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Value("${version}")
    private String ver;

    @Autowired
    ProjectRepository projRepo;

    @Autowired
    EmployeeRepository empRepo;

    // @RequestMapping(value="", method = RequestMethod.POST)
    @GetMapping
    public String displayProjects(Model model){
        List<Project> projects = projRepo.findAll();
        model.addAttribute("projectList", projects);
        model.addAttribute("versionNumber", ver);
        return "projects/list-projects";
    }

    @GetMapping("/new")
    public String displayProjectForm(Model model){
        List<Employee> employees = empRepo.findAll();
        model.addAttribute("employeeList", employees);

        model.addAttribute("project", new Project());
        return "projects/new-project";
    }

    @PostMapping("/save")
    public String createProject(Project project){
        // Project proj1 = new Project("Eating cookie project", "INPROGRESS", "nomnomnomnom");
        projRepo.save(project);
        return "redirect:/projects";
    }
}
