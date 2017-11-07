package Commands.StereoCommands;

import Commands.Command;
import Devices.Stereo;

public class StereoOffCommand implements Command {

    Stereo stereo;
    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
