package com.projects.mouse;

import com.projects.device.Device;

public class Mouse extends Device {

    @Override
    public void plugIn() {
        System.out.println("Mouse was plugged in!");
    }

    @Override
    public void plugOut() {
        System.out.println("Mouse was plugged out!");
    }

    @Override
    public void useDevice() {
        if (!broken) {
            rightClick();
            moveMouse();
            leftClick();
        } else {
            System.out.println("Mouse is broken!");
        }
    }

    protected void moveMouse () {
        System.out.println("Moving...");
    }

    protected void rightClick () {
        System.out.println("Right click!");
    }

    protected void leftClick () {
        System.out.println("Left click!");
    }

}
