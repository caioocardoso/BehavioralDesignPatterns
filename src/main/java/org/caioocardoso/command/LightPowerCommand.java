package org.caioocardoso.command;

public class LightPowerCommand implements SmartHouseCommand{
    SmartHouseLight smartHouseLight;

    public LightPowerCommand(SmartHouseLight smartHouseLight) {
        this.smartHouseLight = smartHouseLight;
    }

    @Override
    public void execute() {
        this.smartHouseLight.On();
    }

    @Override
    public void undo() {
        this.smartHouseLight.Off();
    }
}
