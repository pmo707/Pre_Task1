package com.epam.pihnastyi.part1;

import java.util.Objects;

public class JavaEmployee extends Employee   {

    private String mainFramework;
    private String englishLevel;

    public JavaEmployee() {
    }

    public JavaEmployee(String name, int age, int experience, int salary, String mainFramework, String englishLevel) {
        super(name, age, experience, salary);
        this.mainFramework = mainFramework;
        this.englishLevel = englishLevel;
    }

    public String getMainFramework() {
        return mainFramework;
    }

    public void setMainFramework(String mainFramework) {
        this.mainFramework = mainFramework;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JavaEmployee that = (JavaEmployee) o;
        return mainFramework.equals(that.mainFramework) &&
                englishLevel.equals(that.englishLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mainFramework, englishLevel);
    }

    @Override
    public String toString() {
        return "JavaEmployee{" +
                "mainFramework='" + mainFramework + '\'' +
                ", englishLevel='" + englishLevel + '\'' +
                '}';
    }
}
