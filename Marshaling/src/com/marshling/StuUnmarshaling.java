package com.marshling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class StuUnmarshaling {public static void main(String[] args) throws JAXBException {
	

	
	 File file = new File("Student.xml");
     JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
     Unmarshaller un=jaxbContext.createUnmarshaller();
     Student s=(Student) un.unmarshal(file);
     System.out.println(s);


}}
