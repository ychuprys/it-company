package com.solvd.itcompany.service;

import com.solvd.itcompany.domain.Educable;
import com.solvd.itcompany.domain.Employee;

public class EmployeeService implements IEmployeeService {

    private IEducationService educationService;

    public EmployeeService(IEducationService educationService) {
        this.educationService = educationService;
    }

    @Override
    public void getLevelOfEmployee(Employee employee) {
        int workExperienceMonth = employee.getWorkExperienceMonth();
        String level = null;
        if (workExperienceMonth < 0) {
            System.out.println("Work experience is set incorrect:" + workExperienceMonth);
        } else if (workExperienceMonth < 12) {
            level = "junior";
        } else if (workExperienceMonth > 12 & workExperienceMonth < 24) {
            level = "middle";
        } else {
            level = "senior";
        }
        employee.setRating(level);
    }

    @Override
    public void sendToCourse(Educable educable) {
        String level = educable.getLevel();
        if (level.equals("junior")) {
            educationService.upLevelToMiddle(educable);
        } else if (level.equals("middle")) {
            educationService.upLevelToSenior(educable);
        }
    }

}
