/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;

/**
 *
 * @author Ajay
 */
public class TestAction extends ActionSupport{
       private String name;
    private Date nowDate;
 
    @Override
    public void validate(){
        if (name==null || name.length()==0)
            addActionError(getText("error.enter.message"));
    }
 
    @Override
    public String execute() throws Exception {
        nowDate = new Date();
        return ActionSupport.SUCCESS;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getNowDate() {
        return nowDate;
    }
}
