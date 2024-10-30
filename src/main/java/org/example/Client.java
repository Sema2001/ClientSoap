package org.example;

import proxy.StudentWebService;
import proxy.StudentWebService_Service;

public class Client {
    public static void main(String[] args) {

        StudentWebService stub = new StudentWebService_Service().getStudentWebServicePort();
        System.out.println("method increment age "+ stub.incrementAge(16));
    }
}
