package com.marshling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class StudentTest {
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		Student s=new  Student("Sriman", 02, "java", "createiq");
		Student s1=new  Student("Sri", 05, "java", "createiq");
		
		Student[] array= {s,s1};
		
		for (Student student : array) {
			JAXBContext context=JAXBContext.newInstance(Student.class);
			Marshaller mash=context.createMarshaller();
			mash.marshal(student, new FileOutputStream("src//com//marshling//Student.xml"));
			System.out.println("success");
		}
			
		
		
		
	}

}
