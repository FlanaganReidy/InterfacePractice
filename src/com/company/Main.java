package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {
        Ninja koji = new Ninja("Junin", "Koji", 1243569183);
        System.out.println(koji.dodgeFlip());
        System.out.println(koji.flyingKick());
        System.out.println(koji.speak());

        Marine sally = new Marine("Corporal", "Sally", 1252938459);
        System.out.println(sally.makeABomb());
        sally.shootingDefaultMethod();

    }
}
