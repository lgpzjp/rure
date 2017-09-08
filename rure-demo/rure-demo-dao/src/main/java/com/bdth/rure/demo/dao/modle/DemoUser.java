package com.bdth.rure.demo.dao.modle;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/8.
 */
public class DemoUser implements Serializable{
    private Integer id;

    private String username;

    private String password;

    private Integer sex;

    private String crtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCrtime() {
        return crtime;
    }

    public void setCrtime(String crtime) {
        this.crtime = crtime;
    }

    @Override
    public String toString() {
        return "DemoUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", crtime='" + crtime + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DemoUser demoUser = (DemoUser) o;

        if (id != null ? !id.equals(demoUser.id) : demoUser.id != null) return false;
        if (username != null ? !username.equals(demoUser.username) : demoUser.username != null) return false;
        if (password != null ? !password.equals(demoUser.password) : demoUser.password != null) return false;
        if (sex != null ? !sex.equals(demoUser.sex) : demoUser.sex != null) return false;
        return crtime != null ? crtime.equals(demoUser.crtime) : demoUser.crtime == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (crtime != null ? crtime.hashCode() : 0);
        return result;
    }
}
