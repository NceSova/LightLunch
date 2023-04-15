package com.example.lightlunch;

public class Reciepe {
    private String Title;
    private String Description;
    private String Text;

    private String Ingredinets;

    public Reciepe(String Title, String Description, String Text) {
        this.Title = Title;
        this.Description = Description;
        this.Text = Text;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
