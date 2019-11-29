package com.projects.mouse;

public class WiredMouse extends Mouse {

    @Override
    public void plugIn() {
        System.out.println("Mouse plugged in via cable!");
    }
}
