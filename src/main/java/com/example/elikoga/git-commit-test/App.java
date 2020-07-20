package com.example.elikoga.gitcommittest;


import java.io.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Commit:" + CompileTimeProperties.commitIDAbbrev);
        System.out.println("Closest Tag:" + CompileTimeProperties.closestTag);
    }

}

