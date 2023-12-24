package com.example.todosample;

public class TodoEntity {
    private Integer Id;
    private String title;
    private Boolean completed;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "TodoEntity{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
