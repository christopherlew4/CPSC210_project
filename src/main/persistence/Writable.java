package persistence;

import org.json.JSONObject;

//interface where subclasses can be turned into Json objects
//from JsonSerializationDemo
//https://github.students.cs.ubc.ca/CPSC210/JsonSerializationDemo
public interface Writable {
    // EFFECTS: returns this as JSON object
    JSONObject toJson();
}
