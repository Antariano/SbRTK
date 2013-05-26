package net.xereo.sbrtk;

import com.drdanick.McRKit.ToolkitEvent;
import com.drdanick.McRKit.module.Module;
import com.drdanick.McRKit.module.ModuleLoader;
import com.drdanick.McRKit.module.ModuleMetadata;

public class SbRTK extends Module
{
    protected SbRTK(ModuleMetadata moduleMetadata, ModuleLoader moduleLoader, ClassLoader classLoader,
                       ToolkitEvent toolkitEvent, ToolkitEvent toolkitEvent2)
    {
        super(moduleMetadata, moduleLoader, classLoader, toolkitEvent, toolkitEvent2);
    }

    @Override
    protected void onEnable()
    {
        // TODO Everything!
    }

    @Override
    protected void onDisable()
    {
        // TODO EVerything!
    }
}
