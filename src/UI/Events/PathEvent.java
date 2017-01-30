package UI.Events;

import javax.swing.*;
import java.awt.event.ContainerEvent;
import java.util.EventObject;

/**
 * Created by stiv on 30.01.17.
 */
public class PathEvent extends EventObject {
    private String path;
    private String discription;

    public PathEvent(Object source, String path, String discription) {
        super(source);
        this.path = path;
        this.discription = discription;
    }

    public String getPath() {
        return this.path;
    }

    public String toString() {
        return this.discription;
    }
}
