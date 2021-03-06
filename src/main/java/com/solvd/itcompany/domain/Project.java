package com.solvd.itcompany.domain;

public class Project implements Comparable<Project> {

    private String projectName;
    private Requirement requirement;
    private Customer customer;

    public Project(String projectName, Requirement requirement, Customer customer) {
        this.projectName = projectName;
        this.requirement = requirement;
        this.customer = customer;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public int compareTo(Project o) {
        return this.projectName.compareTo(o.projectName);
    }
}
