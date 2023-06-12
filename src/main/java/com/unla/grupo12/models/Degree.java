package com.unla.grupo12.models;

public class Degree {
    private int idDegree;
    private String name;
    private String institution;
    private int year;

    public Degree() {
    }

    public Degree(int idDegree, String name, String institution, int year) {
        this.idDegree = idDegree;
        this.name = name;
        this.institution = institution;
        this.year = year;
    }

    public int getIdDegree() {
        return idDegree;
    }
    public void setIdDegree(int idDegree) {
        this.idDegree = idDegree;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getInstitution() {
        return institution;
    }
    public void setInstitution(String institution) {
        this.institution = institution;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Degree [idDegree=" + idDegree + ", name=" + name + ", institution=" + institution + ", year=" + year
                + "]";
    }

}
