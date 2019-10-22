package com.falskim.prolangbook;

public class Prolang {
    private String name;
    private String year;
    private String designer;
    private String paradigm;
    private String extension;
    private String version;
    private int image;

    public Prolang(String name, String year, String designer, String paradigm, String extension, String version, int image) {
        this.name = name;
        this.year = year;
        this.designer = designer;
        this.paradigm = paradigm;
        this.extension = extension;
        this.version = version;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getDesigner() {
        return designer;
    }

    public String getParadigm() {
        return paradigm;
    }

    public String getExtension() {
        return extension;
    }

    public String getVersion() {
        return version;
    }

    public int getImage() {
        return image;
    }
}
