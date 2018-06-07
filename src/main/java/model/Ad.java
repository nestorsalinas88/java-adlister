package model;

public class Ad {
    private int id;
    private int user_id;
    private String title;
    private String description;
    private String category;

    public Ad(int id, int userId, String title, String description, String category) {
        this.id = id;
        this.user_id = userId;
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public Ad(int userId, String title, String description, String category) {
        this.user_id = userId;
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getUserId() {
        return user_id;
    }

    public void setUserId(int userId) {
        this.user_id = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;

    }
}
