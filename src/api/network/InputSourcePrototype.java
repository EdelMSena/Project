package api.network;

import project.annotations.NetworkAPIPrototype;

public class InputSourcePrototype {
    private InputSource is;

    public InputSourcePrototype(InputSource is){
        this.is = is;
    }

    @NetworkAPIPrototype
    public void submitJob(InputSource is){
        Job val = new Job("file.txt");
        OutputResponse output = is.submitJob(val);
    }
}