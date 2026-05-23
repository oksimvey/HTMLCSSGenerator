package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import utils.event.ExecutableEvent;
import utils.style.ComponentStyle;
import utils.event.HTMLEvent;

public class Component {


    ComponentType type;

    String content;

    ComponentStyle originalStyle;

    ComponentStyle currentStyle;

    List<Component> children = new ArrayList<>();

    Map<HTMLEvent, ExecutableEvent> events = new HashMap<>();

    




    
}
