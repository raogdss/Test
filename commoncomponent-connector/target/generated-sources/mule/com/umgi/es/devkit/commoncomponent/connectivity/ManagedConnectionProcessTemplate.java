
package com.umgi.es.devkit.commoncomponent.connectivity;

import javax.annotation.Generated;
import com.umgi.es.devkit.commoncomponent.adapters.CommonComponentConnectorConnectionIdentifierAdapter;
import com.umgi.es.devkit.commoncomponent.connection.ConnectionManager;
import com.umgi.es.devkit.commoncomponent.process.ManagedConnectionProcessInterceptor;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessInterceptor;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.security.oauth.callback.ProcessCallback;
import org.mule.security.oauth.process.ProcessCallbackProcessInterceptor;
import org.mule.security.oauth.process.RetryProcessInterceptor;

@Generated(value = "Mule DevKit Version 3.5.1", date = "2014-09-24T02:23:28+05:30", comments = "Build UNNAMED.1967.45d0eb0")
public class ManagedConnectionProcessTemplate<P >implements ProcessTemplate<P, CommonComponentConnectorConnectionIdentifierAdapter>
{

    private final ProcessInterceptor<P, CommonComponentConnectorConnectionIdentifierAdapter> processInterceptor;

    public ManagedConnectionProcessTemplate(ConnectionManager<CommonComponentConnectorConnectionKey, CommonComponentConnectorConnectionIdentifierAdapter> connectionManager, MuleContext muleContext) {
        ProcessInterceptor<P, CommonComponentConnectorConnectionIdentifierAdapter> processCallbackProcessInterceptor = new ProcessCallbackProcessInterceptor<P, CommonComponentConnectorConnectionIdentifierAdapter>();
        ProcessInterceptor<P, CommonComponentConnectorConnectionIdentifierAdapter> managedConnectionProcessInterceptor = new ManagedConnectionProcessInterceptor<P>(processCallbackProcessInterceptor, connectionManager, muleContext);
        ProcessInterceptor<P, CommonComponentConnectorConnectionIdentifierAdapter> retryProcessInterceptor = new RetryProcessInterceptor<P, CommonComponentConnectorConnectionIdentifierAdapter>(managedConnectionProcessInterceptor, muleContext, connectionManager.getRetryPolicyTemplate());
        processInterceptor = retryProcessInterceptor;
    }

    public P execute(ProcessCallback<P, CommonComponentConnectorConnectionIdentifierAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, messageProcessor, event);
    }

    public P execute(ProcessCallback<P, CommonComponentConnectorConnectionIdentifierAdapter> processCallback, Filter filter, MuleMessage message)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, filter, message);
    }

}
