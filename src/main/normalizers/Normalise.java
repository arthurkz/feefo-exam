package main.normalizers;

public interface Normalise {

    String[] normalizedJobTitlesList = {"Architect", "Software engineer", "Quantity surveyor", "Accountant"};

    String normalise(String jobTitle);
}
