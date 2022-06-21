package com.kaleidoscope.testemployees.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employees_response {
    @SerializedName("response")
    @Expose
    private List<Employees_response> employees_response = null;

    public List<Employees_response> getResponse() {
        return employees_response;
    }

    public void setResponse(List<Employees_response> response) {
        this.employees_response = response;
    }
}
