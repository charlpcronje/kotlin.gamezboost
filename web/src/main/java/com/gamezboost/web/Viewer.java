package com.gamezboost.web;

class Viewer {
    private static final Viewer Instance = new Viewer();
    static Viewer Instance() {
        return Instance;
    }

    private Viewer() {
    }
}
