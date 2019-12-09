package com.gamezboost;

class ObjectData {
    private static final ObjectData Instance = new ObjectData();
    static ObjectData Instance() {
        return Instance;
    }
    private ObjectData() {
    }
}
