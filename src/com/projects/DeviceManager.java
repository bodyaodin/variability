package com.projects;

import com.projects.device.Device;
import com.projects.mouse.Mouse;

import java.util.List;

public class DeviceManager {

    public void useDevices (List<? extends Device> devices) {
        devices.forEach(device -> {
            device.plugIn();
            device.useDevice();
            device.plugOut();
            System.out.println();
        });
    }

    public List<? super Mouse> checkForBrokenMouse (List<? super Mouse> brokenDevices, List<? extends Mouse> mouses) {
        mouses.forEach(mouse -> {
            if (mouse.isBroken()) {
                brokenDevices.add(mouse);
            }
        });
        return brokenDevices;
    }

    public <T> void checkDeviceName (T device) {
        System.out.println("Device name is - " + device.getClass().getSimpleName());
    }

}
