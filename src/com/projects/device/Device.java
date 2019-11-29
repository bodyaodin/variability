package com.projects.device;

import java.util.Random;

public class Device {

    protected boolean broken;

    public Device() {
        broken = isBrokenDevice();
    }

    public Device(boolean broken) {
        this.broken = broken;
    }

    public void plugIn() {
        System.out.println("Device was plugged in!");
    }

    public void plugOut () {
        System.out.println("Device was plugged out!");
    }

    public void useDevice () {
        if (!broken) {
            System.out.println("Using...");
        } else {
            System.out.println("Device is broken!");
        }
    }

    private boolean isBrokenDevice() {
        return new Random().nextBoolean();
    }

    public boolean isBroken() {
        return broken;
    }
}
