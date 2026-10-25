package api;

import project.annotations.NetworkAPIPrototype;

public class InputSourcePrototype {
    @NetworkAPIPrototype
    public void prototype(WebServer server) {
        if (server == null) {
            return;
        }
    }
}