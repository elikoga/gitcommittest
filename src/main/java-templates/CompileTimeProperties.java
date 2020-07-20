package com.example.elikoga.gitcommittest;

public class CompileTimeProperties {
    public static String commitIDAbbrev = "${git.commit.id.abbrev}";
    public static String closestTag = "${git.closest.tag.name}";
}
