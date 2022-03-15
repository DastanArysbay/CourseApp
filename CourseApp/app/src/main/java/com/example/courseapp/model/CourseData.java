
package com.example.courseapp.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CourseData {

    @SerializedName("skills")
    @Expose
    private List<Skill> skills = null;
    @SerializedName("exercises")
    @Expose
    private List<Exercise> exercises = null;

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

}
