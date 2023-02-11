package com.xample.titled.model;

import java.util.Objects;

public class Model {
    private String name;
    private Integer id;

    public Model() {}

    public Model(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "[ name: " + name + ", id: " + id.toString() + " ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Model model)) return false;
        return Objects.equals(getName(), model.getName()) && Objects.equals(getId(), model.getId());
    }
}
