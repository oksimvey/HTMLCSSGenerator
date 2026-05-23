package utils;

import java.util.ArrayList;
import java.util.List;

import utils.component.Component;
import utils.style.Style;

public class Page {

    String title;

    Style background;

    List<Component> components = new ArrayList<>();

    public Page(String title){
        this.title = title;
        this.background = new Style();
    }

    public Page(String title, Style background) {
        this.title = title;
        this.background = background;
    }

    public Page(String title, Style background, List<Component> components) {
        this.title = title;
        this.background = background;
        this.components = components;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setBackground(Style background) {
        this.background = background;
    }

    public Style getBackground() {
        return background;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }







    
}
