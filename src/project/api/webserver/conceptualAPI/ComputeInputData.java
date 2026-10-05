package project.api.webserver.conceptualAPI;

import java.util.List;

import project.annotations.ProcessAPI;
@ProcessAPI

public interface ComputeInputData {
    List getSourceDetails();
}