package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for JSON Operations Addon */
public class JSONOperations {
  /**
   * Factory method for EditValueFromJSON */
  public static EditValueFromJSON getEditValueFromJSON() {
    return new EditValueFromJSON();
  }

  /**
   * Factory method for EditValueFromJSON
   * @param JSONFile The JSON Object Value
   * @param key The key to search for
   * @param value The new value to set */
  public static EditValueFromJSON editValueFromJSON(String JSONFile, String key, String value) {
    return new EditValueFromJSON(JSONFile,key,value);
  }

  /**
   * Factory method for GetTenValuesFromJSON */
  public static GetTenValuesFromJSON getGetTenValuesFromJSON() {
    return new GetTenValuesFromJSON();
  }

  /**
   * Factory method for GetTenValuesFromJSON
   * @param jsonFile The JSON value
   * @param jsonPaths The JSON Paths, you can input up too 10 paths, delimited with a new line */
  public static GetTenValuesFromJSON getTenValuesFromJSON(String jsonFile, String jsonPaths) {
    return new GetTenValuesFromJSON(jsonFile,jsonPaths);
  }

  /**
   * Factory method for GetValueFromJSON */
  public static GetValueFromJSON getGetValueFromJSON() {
    return new GetValueFromJSON();
  }

  /**
   * Factory method for GetValueFromJSON
   * @param jsonFile JSON String value
   * @param jsonPath JayWay JsonPath value to search
   * @param setJsonObject Set result as JSON Object? (Default: false) */
  public static GetValueFromJSON getValueFromJSON(String jsonFile, String jsonPath,
      String setJsonObject) {
    return new GetValueFromJSON(jsonFile,jsonPath,setJsonObject);
  }

  /**
   * Factory method for GetValueFromJSONLocal */
  public static GetValueFromJSONLocal getGetValueFromJSONLocal() {
    return new GetValueFromJSONLocal();
  }

  /**
   * Factory method for GetValueFromJSONLocal
   * @param jsonFile Local path to JSON file */
  public static GetValueFromJSONLocal getValueFromJSONLocal(String jsonFile) {
    return new GetValueFromJSONLocal(jsonFile);
  }

  /**
   * Factory method for IsJSON */
  public static IsJSON getIsJSON() {
    return new IsJSON();
  }

  /**
   * Factory method for IsJSON
   * @param jsonString JSON String value
   * @param expectedResult Expected result (true/false) */
  public static IsJSON isJSON(String jsonString, boolean expectedResult) {
    return new IsJSON(jsonString,expectedResult);
  }

  /**
   * Factory method for IsJSONArray */
  public static IsJSONArray getIsJSONArray() {
    return new IsJSONArray();
  }

  /**
   * Factory method for IsJSONArray
   * @param jsonString JSON String value
   * @param expectedResult Expected result (true/false) */
  public static IsJSONArray isJSONArray(String jsonString, boolean expectedResult) {
    return new IsJSONArray(jsonString,expectedResult);
  }

  /**
   * Factory method for IsJSONObject */
  public static IsJSONObject getIsJSONObject() {
    return new IsJSONObject();
  }

  /**
   * Factory method for IsJSONObject
   * @param jsonString JSON String value
   * @param expectedResult Expected result (true/false) */
  public static IsJSONObject isJSONObject(String jsonString, boolean expectedResult) {
    return new IsJSONObject(jsonString,expectedResult);
  }

  /**
   * Factory method for IsPropertyExists */
  public static IsPropertyExists getIsPropertyExists() {
    return new IsPropertyExists();
  }

  /**
   * Factory method for IsPropertyExists
   * @param jsonFile JSON String value
   * @param jsonPath JayWay JsonPath value to search
   * @param expectedResult Expected result (true/false) */
  public static IsPropertyExists isPropertyExists(String jsonFile, String jsonPath,
      boolean expectedResult) {
    return new IsPropertyExists(jsonFile,jsonPath,expectedResult);
  }

  /**
   * Factory method for JsonToXMLParser */
  public static JsonToXMLParser getJsonToXMLParser() {
    return new JsonToXMLParser();
  }

  /**
   * Factory method for JsonToXMLParser
   * @param json XML Value */
  public static JsonToXMLParser jsonToXMLParser(String json) {
    return new JsonToXMLParser(json);
  }

  /**
   * Edit value from JSON.  */
  public static class EditValueFromJSON extends ActionProxy {
    /**
     * The JSON Object Value (INPUT) */
    public String JSONFile;

    /**
     * The key to search for (INPUT) */
    public String key;

    /**
     * The new value to set (INPUT) */
    public String value;

    /**
     * The updated JSON (OUTPUT) */
    public String updatedJSON;

    public EditValueFromJSON() {
      this.setDescriptor(new ProxyDescriptor("0vl75E0Mr0G5TRI1xxul-w", "actions.EditValueFromJSON"));
    }

    public EditValueFromJSON(String JSONFile, String key, String value) {
      this();
      this.JSONFile = JSONFile;
      this.key = key;
      this.value = value;
    }
  }

  /**
   * Extract multiple JsonPaths. Extract up to 10 JsonPaths from {{jsonFile}} */
  public static class GetTenValuesFromJSON extends ActionProxy {
    /**
     * The JSON value (INPUT) */
    public String jsonFile;

    /**
     * The JSON Paths, you can input up too 10 paths, delimited with a new line (INPUT) */
    public String jsonPaths;

    /**
     * First path result (OUTPUT) */
    public String pathResultOne;

    /**
     * Second path result (OUTPUT) */
    public String pathResultTwo;

    /**
     * Third path result (OUTPUT) */
    public String pathResultThree;

    /**
     * Fourth path result (OUTPUT) */
    public String pathResultFour;

    /**
     * Fifth path result (OUTPUT) */
    public String pathResultFive;

    /**
     * Sixth path result (OUTPUT) */
    public String pathResultSix;

    /**
     * Seventh path result (OUTPUT) */
    public String pathResultSeven;

    /**
     * Eighth path result (OUTPUT) */
    public String pathResultEight;

    /**
     * Ninth path result (OUTPUT) */
    public String pathResultNine;

    /**
     * Tenth path result (OUTPUT) */
    public String pathResultTen;

    public GetTenValuesFromJSON() {
      this.setDescriptor(new ProxyDescriptor("0vl75E0Mr0G5TRI1xxul-w", "actions.GetTenValuesFromJSON"));
    }

    public GetTenValuesFromJSON(String jsonFile, String jsonPaths) {
      this();
      this.jsonFile = jsonFile;
      this.jsonPaths = jsonPaths;
    }
  }

  /**
   * Get value from JSON using JsonPath. Provides search ability in JSON objects using JsonPath. See docs: https://github.com/json-path/JsonPath */
  public static class GetValueFromJSON extends ActionProxy {
    /**
     * JSON String value (INPUT) */
    public String jsonFile;

    /**
     * JayWay JsonPath value to search (INPUT) */
    public String jsonPath;

    /**
     * Set result as JSON Object? (Default: false) (INPUT) */
    public String setJsonObject;

    /**
     * Search result (OUTPUT) */
    public String result;

    public GetValueFromJSON() {
      this.setDescriptor(new ProxyDescriptor("0vl75E0Mr0G5TRI1xxul-w", "actions.GetValueFromJSON"));
    }

    public GetValueFromJSON(String jsonFile, String jsonPath, String setJsonObject) {
      this();
      this.jsonFile = jsonFile;
      this.jsonPath = jsonPath;
      this.setJsonObject = setJsonObject;
    }
  }

  /**
   * Get JSON from local file.  */
  public static class GetValueFromJSONLocal extends ActionProxy {
    /**
     * Local path to JSON file (INPUT) */
    public String jsonFile;

    /**
     * Search result (OUTPUT) */
    public String result;

    public GetValueFromJSONLocal() {
      this.setDescriptor(new ProxyDescriptor("0vl75E0Mr0G5TRI1xxul-w", "actions.GetValueFromJSONLocal"));
    }

    public GetValueFromJSONLocal(String jsonFile) {
      this();
      this.jsonFile = jsonFile;
    }
  }

  /**
   * Is valid JSON?. Checks if the given string is a valid JSON object */
  public static class IsJSON extends ActionProxy {
    /**
     * JSON String value (INPUT) */
    public String jsonString;

    /**
     * Expected result (true/false) (INPUT) */
    public boolean expectedResult;

    /**
     * Is it a valid JSON (true/false) (OUTPUT) */
    public boolean isValidJSON;

    public IsJSON() {
      this.setDescriptor(new ProxyDescriptor("0vl75E0Mr0G5TRI1xxul-w", "actions.IsJSON"));
    }

    public IsJSON(String jsonString, boolean expectedResult) {
      this();
      this.jsonString = jsonString;
      this.expectedResult = expectedResult;
    }
  }

  /**
   * Is valid JSONArray?. Checks if a given string represents a JSONArray object */
  public static class IsJSONArray extends ActionProxy {
    /**
     * JSON String value (INPUT) */
    public String jsonString;

    /**
     * Expected result (true/false) (INPUT) */
    public boolean expectedResult;

    /**
     * Is it a valid JSONArray (true/false) (OUTPUT) */
    public boolean isJSONArray;

    public IsJSONArray() {
      this.setDescriptor(new ProxyDescriptor("0vl75E0Mr0G5TRI1xxul-w", "actions.IsJSONArray"));
    }

    public IsJSONArray(String jsonString, boolean expectedResult) {
      this();
      this.jsonString = jsonString;
      this.expectedResult = expectedResult;
    }
  }

  /**
   * Is valid JSONObject?. Checks if a given string represents a JSONObject */
  public static class IsJSONObject extends ActionProxy {
    /**
     * JSON String value (INPUT) */
    public String jsonString;

    /**
     * Expected result (true/false) (INPUT) */
    public boolean expectedResult;

    /**
     * Is it a valid JSONObject (true/false) (OUTPUT) */
    public boolean isJSONObject;

    public IsJSONObject() {
      this.setDescriptor(new ProxyDescriptor("0vl75E0Mr0G5TRI1xxul-w", "actions.IsJSONObject"));
    }

    public IsJSONObject(String jsonString, boolean expectedResult) {
      this();
      this.jsonString = jsonString;
      this.expectedResult = expectedResult;
    }
  }

  /**
   * Does a property exists in a JSON object?. Checks if a certain property exists in a JSON object */
  public static class IsPropertyExists extends ActionProxy {
    /**
     * JSON String value (INPUT) */
    public String jsonFile;

    /**
     * JayWay JsonPath value to search (INPUT) */
    public String jsonPath;

    /**
     * Expected result (true/false) (INPUT) */
    public boolean expectedResult;

    /**
     * Result (boolean) (OUTPUT) */
    public boolean result;

    public IsPropertyExists() {
      this.setDescriptor(new ProxyDescriptor("0vl75E0Mr0G5TRI1xxul-w", "actions.IsPropertyExists"));
    }

    public IsPropertyExists(String jsonFile, String jsonPath, boolean expectedResult) {
      this();
      this.jsonFile = jsonFile;
      this.jsonPath = jsonPath;
      this.expectedResult = expectedResult;
    }
  }

  /**
   * Convert XML to JSON.  */
  public static class JsonToXMLParser extends ActionProxy {
    /**
     * XML Value (INPUT) */
    public String json;

    /**
     * Converted Output (OUTPUT) */
    public String converted;

    public JsonToXMLParser() {
      this.setDescriptor(new ProxyDescriptor("0vl75E0Mr0G5TRI1xxul-w", "actions.JsonToXMLParser"));
    }

    public JsonToXMLParser(String json) {
      this();
      this.json = json;
    }
  }
}
