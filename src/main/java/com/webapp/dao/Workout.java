package com.webapp.dao;

public class Workout {
	private String bodypart, difficulty, workoutname, videolink, fullbody;
	private int reps, sets;
	
	public Workout(String bodypart, String difficulty, String workoutname, String videolink, int reps, int sets, String fullbody) {
		super();
		this.bodypart = bodypart;
		this.difficulty = difficulty;
		this.workoutname = workoutname;
		this.videolink = videolink;
		this.reps = reps;
		this.sets = sets;
		this.fullbody = fullbody;
	}
	
	public String getFullbody() {
		return fullbody;
	}

	public void setFullbody(String fullbody) {
		this.fullbody = fullbody;
	}

	public String getBodypart() {
		return bodypart;
	}
	
	public void setBodypart(String bodypart) {
		this.bodypart = bodypart;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getWorkoutname() {
		return workoutname;
	}
	public void setWorkoutname(String workoutname) {
		this.workoutname = workoutname;
	}
	public String getVideolink() {
		return videolink;
	}
	public void setVideolink(String videolink) {
		this.videolink = videolink;
	}
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
	public int getSets() {
		return sets;
	}
	public void setSets(int sets) {
		this.sets = sets;
	}
	
	
}
