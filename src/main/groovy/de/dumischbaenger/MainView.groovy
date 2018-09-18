package de.dumischbaenger;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@HtmlImport("styles/shared-styles.html")  
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        Button button = new Button("Click me now", {
          event -> 
          Notification.show("Clicked me now!")
        })
        add(button)
        
        setClassName("main-layout")
    }
}
