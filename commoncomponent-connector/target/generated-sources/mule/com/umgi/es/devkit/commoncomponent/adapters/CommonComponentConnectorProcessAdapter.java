
package com.umgi.es.devkit.commoncomponent.adapters;

import javax.annotation.Generated;
import com.umgi.es.devkit.commoncomponent.CommonComponentConnector;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>CommonComponentConnectorProcessAdapter</code> is a wrapper around {@link CommonComponentConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.1", date = "2014-09-24T02:23:28+05:30", comments = "Build UNNAMED.1967.45d0eb0")
public class CommonComponentConnectorProcessAdapter
    extends CommonComponentConnectorLifecycleAdapter
    implements ProcessAdapter<CommonComponentConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, CommonComponentConnectorCapabilitiesAdapter> getProcessTemplate() {
        final CommonComponentConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,CommonComponentConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, CommonComponentConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, CommonComponentConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
