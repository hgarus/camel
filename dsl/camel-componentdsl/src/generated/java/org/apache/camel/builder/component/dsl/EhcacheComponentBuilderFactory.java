/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.ehcache.EhcacheComponent;

/**
 * Perform caching operations using .
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface EhcacheComponentBuilderFactory {

    /**
     * Ehcache (camel-ehcache)
     * Perform caching operations using .
     * 
     * Category: cache,datagrid,clustering
     * Since: 2.18
     * Maven coordinates: org.apache.camel:camel-ehcache
     * 
     * @return the dsl builder
     */
    static EhcacheComponentBuilder ehcache() {
        return new EhcacheComponentBuilderImpl();
    }

    /**
     * Builder for the Ehcache component.
     */
    interface EhcacheComponentBuilder
            extends
                ComponentBuilder<EhcacheComponent> {
        /**
         * The cache manager.
         * 
         * The option is a: &lt;code&gt;org.ehcache.CacheManager&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param cacheManager the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder cacheManager(
                org.ehcache.CacheManager cacheManager) {
            doSetProperty("cacheManager", cacheManager);
            return this;
        }
        /**
         * The cache manager configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.ehcache.config.Configuration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param cacheManagerConfiguration the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder cacheManagerConfiguration(
                org.ehcache.config.Configuration cacheManagerConfiguration) {
            doSetProperty("cacheManagerConfiguration", cacheManagerConfiguration);
            return this;
        }
        /**
         * URI pointing to the Ehcache XML configuration file's location.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configurationUri the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder configurationUri(
                java.lang.String configurationUri) {
            doSetProperty("configurationUri", configurationUri);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param createCacheIfNotExist the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            doSetProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Set the delivery mode (synchronous, asynchronous).
         * 
         * The option is a:
         * &lt;code&gt;org.ehcache.event.EventFiring&lt;/code&gt; type.
         * 
         * Default: ASYNCHRONOUS
         * Group: consumer
         * 
         * @param eventFiring the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder eventFiring(
                org.ehcache.event.EventFiring eventFiring) {
            doSetProperty("eventFiring", eventFiring);
            return this;
        }
        /**
         * Set the delivery mode (ordered, unordered).
         * 
         * The option is a:
         * &lt;code&gt;org.ehcache.event.EventOrdering&lt;/code&gt; type.
         * 
         * Default: ORDERED
         * Group: consumer
         * 
         * @param eventOrdering the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder eventOrdering(
                org.ehcache.event.EventOrdering eventOrdering) {
            doSetProperty("eventOrdering", eventOrdering);
            return this;
        }
        /**
         * Set the type of events to listen for
         * (EVICTED,EXPIRED,REMOVED,CREATED,UPDATED). You can specify multiple
         * entries separated by comma.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param eventTypes the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder eventTypes(java.lang.String eventTypes) {
            doSetProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param action the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder action(java.lang.String action) {
            doSetProperty("action", action);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param key the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder key(java.lang.Object key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * The default cache configuration to be used to create caches.
         * 
         * The option is a:
         * &lt;code&gt;org.ehcache.config.CacheConfiguration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder configuration(
                org.ehcache.config.CacheConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * A map of cache configuration to be used to create caches.
         * 
         * The option is a: &lt;code&gt;java.util.Map&lt;java.lang.String,
         * org.ehcache.config.CacheConfiguration&gt;&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param configurations the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder configurations(
                java.util.Map<java.lang.String, org.ehcache.config.CacheConfiguration> configurations) {
            doSetProperty("configurations", configurations);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param keyType the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder keyType(java.lang.String keyType) {
            doSetProperty("keyType", keyType);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param valueType the value to set
         * @return the dsl builder
         */
        default EhcacheComponentBuilder valueType(java.lang.String valueType) {
            doSetProperty("valueType", valueType);
            return this;
        }
    }

    class EhcacheComponentBuilderImpl
            extends
                AbstractComponentBuilder<EhcacheComponent>
            implements
                EhcacheComponentBuilder {
        @Override
        protected EhcacheComponent buildConcreteComponent() {
            return new EhcacheComponent();
        }
        private org.apache.camel.component.ehcache.EhcacheConfiguration getOrCreateConfiguration(
                org.apache.camel.component.ehcache.EhcacheComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.ehcache.EhcacheConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "cacheManager": getOrCreateConfiguration((EhcacheComponent) component).setCacheManager((org.ehcache.CacheManager) value); return true;
            case "cacheManagerConfiguration": getOrCreateConfiguration((EhcacheComponent) component).setCacheManagerConfiguration((org.ehcache.config.Configuration) value); return true;
            case "configurationUri": getOrCreateConfiguration((EhcacheComponent) component).setConfigurationUri((java.lang.String) value); return true;
            case "createCacheIfNotExist": getOrCreateConfiguration((EhcacheComponent) component).setCreateCacheIfNotExist((boolean) value); return true;
            case "bridgeErrorHandler": ((EhcacheComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "eventFiring": getOrCreateConfiguration((EhcacheComponent) component).setEventFiring((org.ehcache.event.EventFiring) value); return true;
            case "eventOrdering": getOrCreateConfiguration((EhcacheComponent) component).setEventOrdering((org.ehcache.event.EventOrdering) value); return true;
            case "eventTypes": getOrCreateConfiguration((EhcacheComponent) component).setEventTypes((java.lang.String) value); return true;
            case "action": getOrCreateConfiguration((EhcacheComponent) component).setAction((java.lang.String) value); return true;
            case "key": getOrCreateConfiguration((EhcacheComponent) component).setKey((java.lang.Object) value); return true;
            case "lazyStartProducer": ((EhcacheComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((EhcacheComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "configuration": getOrCreateConfiguration((EhcacheComponent) component).setConfiguration((org.ehcache.config.CacheConfiguration) value); return true;
            case "configurations": getOrCreateConfiguration((EhcacheComponent) component).setConfigurations((java.util.Map) value); return true;
            case "keyType": getOrCreateConfiguration((EhcacheComponent) component).setKeyType((java.lang.String) value); return true;
            case "valueType": getOrCreateConfiguration((EhcacheComponent) component).setValueType((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}