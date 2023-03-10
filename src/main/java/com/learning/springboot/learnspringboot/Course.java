package com.learning.springboot.learnspringboot;


/**
 * 
 * @author DhirajS
 *
 */
public class Course {
  
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Course [id="+id+",name="+name+",author="+author+"]";
		}
	private long id;
	private String name;
	private String author;
}
