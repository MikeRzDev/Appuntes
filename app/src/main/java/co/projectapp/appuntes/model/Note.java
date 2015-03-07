package co.projectapp.appuntes.model;

import co.projectapp.appuntes.R;

/**
 * Created by User on 3/7/2015.
 */
public class Note {
    int id;
    String month;
    String day;
    String desc;
    String author;
    int type;


    public Note(int id, String month, String day, String desc, String author, int type) {
        this.id = id;
        this.month = month;
        this.day = day;
        this.desc = desc;
        this.author = author;
        this.type = type;

    }

    public Note(String month, String day, String desc, String author, int type) {
        this.month = month;
        this.day = day;
        this.desc = desc;
        this.author = author;
        this.type = type;
        this.id = -1;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
