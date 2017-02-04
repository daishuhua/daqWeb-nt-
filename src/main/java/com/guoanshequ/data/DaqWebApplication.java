package com.guoanshequ.data;

import com.guoanshequ.data.resources.ResourceMarker;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.mustache.MustacheMvcFeature;

/**
 * Created by daishuhua on 17-2-3.
 */
public class DaqWebApplication extends ResourceConfig {
    /**
     * Create a new resource configuration without any custom properties or
     * resource and provider classes.
     */
    public DaqWebApplication() {
        this.packages(ResourceMarker.class.getPackage().getName());
        this.register(MustacheMvcFeature.class);
        this.register(JacksonFeature.class);
        this.register(DetectDeviceRequestFilter.class);
    }
}
