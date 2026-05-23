package marco.htmlcssgenerator.utils.component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import marco.htmlcssgenerator.utils.event.ExecutableEvent;
import marco.htmlcssgenerator.utils.event.HTMLEvent;
import marco.htmlcssgenerator.utils.style.ComponentStyle;

public class Component {

    ComponentType type;

    ComponentPosition position;

    String content;

    ComponentStyle originalStyle;

    ComponentStyle currentStyle;

    List<Component> children = new ArrayList<>();

    Map<HTMLEvent, ExecutableEvent> events = new HashMap<>();


    

    


}
