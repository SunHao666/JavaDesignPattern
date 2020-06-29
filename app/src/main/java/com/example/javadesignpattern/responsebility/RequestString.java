package com.example.javadesignpattern.responsebility;

public class RequestString extends Request<String> {

    public RequestString(String t) {
        super(t);
    }

    @Override
    public boolean isSame(Request<String> request) {
        if(request.getRequest().equals(t)){
            return true;
        }
        return false;
    }

}
