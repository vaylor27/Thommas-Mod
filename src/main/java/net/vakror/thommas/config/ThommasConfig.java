package net.vakror.thommas.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.vakror.thommas.Thommas;

@Config(name = Thommas.MOD_ID)
public class ThommasConfig implements ConfigData {
    public int quartzElevatorDistance = 200;
    public boolean mixTypes = false;
    public boolean isPlayerOnly = false;
    public boolean displayParticles = true;
    public boolean renderToughnessBar = true;
}
