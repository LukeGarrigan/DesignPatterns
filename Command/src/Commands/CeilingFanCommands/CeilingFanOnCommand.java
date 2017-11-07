package Commands.CeilingFanCommands;

import Commands.Command;
import Devices.CeilingFan;

public class CeilingFanOnCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.on();
    }
}
