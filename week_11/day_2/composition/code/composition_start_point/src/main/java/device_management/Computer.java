package device_management;

import behaviours.IOutput;

public class Computer implements IOutput{
    private int ram;
    private int hddSize;

    private IOutput outputDevice;

    public Computer(int ram, int hddSize, IOutput outputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutPutDevice() {
        return this.outputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutPutDevice(IOutput _outputDevice) {

    this.outputDevice= _outputDevice;
    }
}
