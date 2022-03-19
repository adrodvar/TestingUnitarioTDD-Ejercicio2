package com.example.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MainTest {

    HtmlHome home = new HtmlHome();
    HtmlAboutUs about = new HtmlAboutUs();
    HtmlTemplate bodyHtmlHome = new HtmlHome();

    @Test
    void test1(){
        if(!bodyHtmlHome.head().contains("DOCTYPE"))
            System.out.println("\n head contains DOCTYPE: "+ bodyHtmlHome.head());
        assertNotNull(bodyHtmlHome.head());
    }

    @Test
    void test2(){
        if(!bodyHtmlHome.head().endsWith("</head><body>"))
            System.out.println("\n terminate with </head><body>: "+ bodyHtmlHome.head());
        assertNotNull(bodyHtmlHome.head());
    }

    @Test
    void test3(){
        if(!bodyHtmlHome.render().contains("<body>"))
            System.out.println("\n contains <body>: "+ bodyHtmlHome.head());
        assertNotNull(bodyHtmlHome.head());
    }

    @Test
    void displayHeaderNotNull(){
        if(!bodyHtmlHome.head().isEmpty())
            System.out.println("\n head not Null: "+ bodyHtmlHome.head());
        assertNotNull(bodyHtmlHome.head());
    }

    @Test
    void displayHeaderEstructure(){
        if(!bodyHtmlHome.head().isEmpty())
            System.out.println("\n head not Null: "+ bodyHtmlHome.head().formatted());
        assertNotNull(bodyHtmlHome.head());
    }

    @Test
    void displayBodyNotNull(){
        if(!bodyHtmlHome.body().isEmpty())
        System.out.println("\n body not Null: "+ bodyHtmlHome.body());
        assertNotNull(bodyHtmlHome.body());
    }

    @Test
    void displayFooterNotNull(){
        if(!bodyHtmlHome.footer().isEmpty())
            System.out.println("\n footer not Null: "+ bodyHtmlHome.footer());
        assertNotNull(bodyHtmlHome.footer());
    }

    @Test
        void ValidateNotNull(){
        assertAll(
                () -> assertNotNull(!bodyHtmlHome.head().isEmpty()),
                () -> assertNotNull(!bodyHtmlHome.body().isEmpty()),
                () -> assertNotNull(!bodyHtmlHome.footer().isEmpty())
        );
    }

}