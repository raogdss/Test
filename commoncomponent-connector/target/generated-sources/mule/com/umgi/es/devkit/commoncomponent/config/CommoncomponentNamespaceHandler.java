
package com.umgi.es.devkit.commoncomponent.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/commoncomponent</code>.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.1", date = "2014-09-24T02:23:28+05:30", comments = "Build UNNAMED.1967.45d0eb0")
public class CommoncomponentNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(CommoncomponentNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [commoncomponent] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [commoncomponent] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new CommonComponentConnectorConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("my-processor", new MyProcessorDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("my-processor", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("put-in-barn", new PutInBarnDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("put-in-barn", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query", new QueryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query", "@Processor", ex);
        }
    }

}
