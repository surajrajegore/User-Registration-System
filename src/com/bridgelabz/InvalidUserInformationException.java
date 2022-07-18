package com.bridgelabz;

public class InvalidUserInformationException extends RuntimeException{
    public InvalidUserInformationException(){
        super();
    }
    public InvalidUserInformationException(String msg){
        super(msg);
    }
}
