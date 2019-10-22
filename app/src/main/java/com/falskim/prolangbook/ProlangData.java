package com.falskim.prolangbook;

import java.util.ArrayList;

public class ProlangData {

    private static Prolang[] prolangDetails = {
            // 1. Java
            new Prolang(
                    "Java",
                    "1995",
                    "James Gosling",
                    "Multi-paradigm: generic, object-oriented (class-based), imperative, reflective",
                    ".java, .class, .jar",
                    "Java SE 13 / September 17, 2019",
                    R.drawable.java
            ),
            // 2. Python
            new Prolang(
                    "Python",
                    "1990",
                    "Guido van Rossum",
                    "Multi-paradigm: functional, imperative, object-oriented, reflective",
                    ".py, .pyi, .pyc, .pyd, .pyo, .pyw, .pyz",
                    "3.8.0 / 14 October 2019",
                    R.drawable.python
            ),
            // 3. Javascript
            new Prolang(
                    "Javascript",
                    "1995",
                    "Brendan Eich",
                    "Multi-paradigm: event-driven,[1] functional, imperative, object-oriented (prototype-based)",
                    ".js, .mjs",
                    "ECMAScript 2018 / June 2018",
                    R.drawable.javascript
            ),
            // 4. Kotlin
            new Prolang(
                    "Kotlin",
                    "2011",
                    "JetSrains",
                    "Multi",
                    ".kt, .kts",
                    "1.3.50 / 22 August 2019",
                    R.drawable.kotlin
            ),
            // 5. C++
            new Prolang(
                    "C++",
                    "1985",
                    "Bjarne Stroustrup",
                    "Multi-paradigm: procedural, functional, object-oriented, generic",
                    ".C, .cc, .cpp, .cxx, .c++, .h, .hh, .hpp, .hxx, .h++",
                    "C++17 (ISO/IEC 14882:2017) / 1 December 2017",
                    R.drawable.cpp
            ),
            // 6. PHP
            new Prolang(
                    "PHP",
                    "1995",
                    "Rasmus Lerdorf",
                    "Imperative, functional, object-oriented, procedural, reflective",
                    ".php, .phtml, .php3, .php4, .php5, .php7, .phps, .php-s, .pht, .phar",
                    "7.3.10 / September 26, 2019",
                    R.drawable.php
            ),
            // 7. C#
            new Prolang(
                    "C#",
                    "2000",
                    "Microsoft",
                    "Structured, imperative, object-oriented, event-driven, task-driven, functional, generic, reflective, concurrent",
                    ".cs",
                    "8.0 / September 23, 2019",
                    R.drawable.csharp
            ),
            // 8. Ruby
            new Prolang(
                    "Ruby",
                    "1995",
                    "Yukihiro Matsumoto",
                    "Multi-paradigm: functional, imperative, object-oriented, reflective",
                    ".rb",
                    "2.6.5 (October 1, 2019",
                    R.drawable.ruby
            ),
            // 9. Swift
            new Prolang(
                    "Swift",
                    "2014",
                    "Chris Lattner, Doug Gregor, John McCall, Ted Kremenek, Joe Groff",
                    "Multi-paradigm: protocol-oriented, object-oriented, functional, imperative, block structured",
                    ".swift",
                    "5.1.1 / October 4, 2019",
                    R.drawable.swift
            ),
            // 10. LUA
            new Prolang(
                    "LUA",
                    "1993",
                    "Roberto Ierusalimschy, Waldemar Celes, Luiz Henrique de Figueiredo",
                    "Multi-paradigm: scripting, imperative (procedural, prototype-based, object-oriented), functional",
                    ".lua",
                    "5.3.5 / 10 July 2018",
                    R.drawable.lua
            )
    };

    static ArrayList<Prolang> getListData() {
        ArrayList<Prolang> list = new ArrayList<>();
        for(Prolang detail: prolangDetails){
            list.add(detail);
        }
        return list;
    }
}
