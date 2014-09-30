
package com.umgi.es.devkit.commoncomponent.adapters;

import javax.annotation.Generated;
import com.umgi.es.devkit.commoncomponent.CommonComponentConnector;
import com.umgi.es.devkit.commoncomponent.connection.Connection;


/**
 * A <code>CommonComponentConnectorConnectionIdentifierAdapter</code> is a wrapper around {@link CommonComponentConnector } that implements {@link org.mule.devkit.dynamic.api.helper.Connection} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.1", date = "2014-09-24T02:23:28+05:30", comments = "Build UNNAMED.1967.45d0eb0")
public class CommonComponentConnectorConnectionIdentifierAdapter
    extends CommonComponentConnectorProcessAdapter
    implements Connection
{


    public String getConnectionIdentifier() {
        return super.connectionId();
    }

}
