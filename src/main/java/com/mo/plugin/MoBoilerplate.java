package com.mo.plugin;

import abyss.plugin.api.ComponentItem;
import abyss.plugin.api.Plugin;
import abyss.plugin.api.PluginContext;
import abyss.plugin.api.entities.Player;

import java.util.Random;

public class MoBoilerplate extends Plugin {

    @Override
    public boolean onLoaded(PluginContext pluginContext) {
        pluginContext.setName("Boilerplate Plugin");
        pluginContext.setCategory("Boilerplate Category");
        return super.onLoaded(pluginContext);
    }

    @Override
    public void onEnabled() {
        super.onEnabled();
    }

    @Override
    public void onDisabled() {
        super.onDisabled();
    }

    @Override
    public int onLoop() {
        return super.onLoop();
    }

    @Override
    public int onServerTick(long tickCount) {
        return super.onServerTick(tickCount);
    }

    @Override
    public void onPaint() {
        super.onPaint();
    }

    @Override
    public void onPaintOverlay() {
        super.onPaintOverlay();
    }

    @Override
    public void onWidgetVisibilityChanged(int id, boolean visible) {
        super.onWidgetVisibilityChanged(id, visible);
    }

    @Override
    public void onLocalPlayerChanged(Player self) {
        super.onLocalPlayerChanged(self);
    }

    @Override
    public void onInventoryItemChanged(ComponentItem prev, ComponentItem next) {
        super.onInventoryItemChanged(prev, next);
    }

    @Override
    public boolean interruptBreak() {
        return super.interruptBreak();
    }

    @Override
    public Random getAccountSpecificRandom() {
        return super.getAccountSpecificRandom();
    }

    @Override
    public Random getSecureRandom() {
        return super.getSecureRandom();
    }
}
