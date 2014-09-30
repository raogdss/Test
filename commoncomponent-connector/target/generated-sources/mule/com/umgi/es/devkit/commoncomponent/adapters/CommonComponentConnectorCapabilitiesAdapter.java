
package com.umgi.es.devkit.commoncomponent.adapters;

import javax.annotation.Generated;
import com.umgi.es.devkit.commoncomponent.CommonComponentConnector;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;


/**
 * A <code>CommonComponentConnectorCapabilitiesAdapter</code> is a wrapper around {@link CommonComponentConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.1", date = "2014-09-24T02:23:28+05:30", comments = "Build UNNAMED.1967.45d0eb0")
public class CommonComponentConnectorCapabilitiesAdapter
    extends CommonComponentConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        if (capability == ModuleCapability.CONNECTION_MANAGEMENT_CAPABLE) {
            return true;
        }
        return false;
    }

}
