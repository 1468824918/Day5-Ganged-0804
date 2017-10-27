package com.lanou.domain;

import java.util.List;

/**
 * Created by dllo on 17/10/27.
 */
public class Server {
    private int id;
    private String sname;

    @Override
    public String toString() {
        return "Server{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
