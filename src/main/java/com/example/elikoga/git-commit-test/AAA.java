package com.example.elikoga.gitcommittest;


import java.io.*;
import java.util.*;


public class AAA {

    public AAA() {}

    public String owo() throws IOException
    {
        Properties properties = new Properties();
        properties.load(getClass().getClassLoader().getResourceAsStream("git.properties"));

        String id = properties.getProperty("git.commit.id.abbrev");

        return id;
    }

}


