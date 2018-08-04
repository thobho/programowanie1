package com.sdacademy.day4.todolist;

import java.time.LocalDate;
import java.util.Date;

public class ToDo implements Comparable<ToDo> {
    private int id;
    private String text;
    private LocalDate created;
    private int prio;

    public ToDo(String text, LocalDate created, int prio) {
        this.text = text;
        this.created = created;
        this.prio = prio;
    }


    @Override
    public int compareTo(ToDo o) {
        return text.compareTo(o.getText());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String shortString() {
        return String.format("%s &%d& %s\n", text, prio, created.toString());
    }

}
