package net.xereo.sbrtk;

import com.drdanick.McRKit.ToolkitEvent;
import com.drdanick.McRKit.module.Module;
import com.drdanick.McRKit.module.ModuleLoader;
import com.drdanick.McRKit.module.ModuleMetadata;

public class SbRTK extends Module {
    protected SbRTK(ModuleMetadata meta, ModuleLoader loader, ClassLoader classLoader, ToolkitEvent event1, ToolkitEvent event2) {
        super(meta, loader, classLoader, event1, event2);
    }

    @Override
    protected void onEnable() {
        // TODO Everything!
    }

    @Override
    protected void onDisable() {
        // TODO Everything!
    }
}
