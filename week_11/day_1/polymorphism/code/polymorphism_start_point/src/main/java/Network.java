import java.util.*;

public class Network {
    private String name;
//    private ArrayList<Desktop> devicesDesktop;
//    private ArrayList<Printer> devicesPrinter;
    private ArrayList<IConnect> devices; // we can do this now that we have extended the IConnect in desktop and printer

    public Network(String name){
        this.devices = new ArrayList<IConnect>();
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int deviceCount(){
        return devices.size() + devices.size();
    }
    public void connect(IConnect device){ //two methods with same name.
        devices.add(device);
    }
    public void disconnectAll(){
        devices.clear();
        devices.clear();
    }

}