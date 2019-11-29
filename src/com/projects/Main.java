package com.projects;

import com.projects.device.Device;
import com.projects.mouse.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DeviceManager deviceManager = new DeviceManager();

        List<Mouse> mouses = new ArrayList<>();
        mouses.add(new WiredMouse());
        mouses.add(new WirelessMouse());
        deviceManager.useDevices(mouses);

        List<Device> brokenDevices = new ArrayList<>();
        brokenDevices.add(new Device(true));
        brokenDevices = (List<Device>) deviceManager.checkForBrokenMouse(brokenDevices, mouses);

        System.out.println("__________ Broken devices __________");
        brokenDevices.forEach(deviceManager::checkDeviceName);






    }
}
