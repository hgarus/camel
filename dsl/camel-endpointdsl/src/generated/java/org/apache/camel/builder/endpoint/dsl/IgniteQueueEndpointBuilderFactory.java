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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Interact with .
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteQueueEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Ignite Queues component.
     */
    public interface IgniteQueueEndpointBuilder
            extends
                EndpointProducerBuilder {
        /**
         * The queue capacity. Default: non-bounded.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param capacity the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder capacity(int capacity) {
            doSetProperty("capacity", capacity);
            return this;
        }
        /**
         * The queue capacity. Default: non-bounded.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param capacity the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder capacity(String capacity) {
            doSetProperty("capacity", capacity);
            return this;
        }
        /**
         * The collection configuration. Default: empty configuration. &lt;p&gt;
         * You can also conveniently set inner properties by using
         * &lt;tt&gt;configuration.xyz=123 options.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.ignite.configuration.CollectionConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder configuration(
                org.apache.ignite.configuration.CollectionConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The collection configuration. Default: empty configuration. &lt;p&gt;
         * You can also conveniently set inner properties by using
         * &lt;tt&gt;configuration.xyz=123 options.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.ignite.configuration.CollectionConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder configuration(String configuration) {
            doSetProperty("configuration", configuration);
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
        default IgniteQueueEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to invoke on the Ignite Queue. Superseded by the
         * IgniteConstants.IGNITE_QUEUE_OPERATION header in the IN message.
         * Possible values: CONTAINS, ADD, SIZE, REMOVE, ITERATOR, CLEAR,
         * RETAIN_ALL, ARRAY, DRAIN, ELEMENT, PEEK, OFFER, POLL, TAKE, PUT.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.ignite.queue.IgniteQueueOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder operation(
                org.apache.camel.component.ignite.queue.IgniteQueueOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to invoke on the Ignite Queue. Superseded by the
         * IgniteConstants.IGNITE_QUEUE_OPERATION header in the IN message.
         * Possible values: CONTAINS, ADD, SIZE, REMOVE, ITERATOR, CLEAR,
         * RETAIN_ALL, ARRAY, DRAIN, ELEMENT, PEEK, OFFER, POLL, TAKE, PUT.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.ignite.queue.IgniteQueueOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * The queue timeout in milliseconds. Default: no timeout.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeoutMillis the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder timeoutMillis(Long timeoutMillis) {
            doSetProperty("timeoutMillis", timeoutMillis);
            return this;
        }
        /**
         * The queue timeout in milliseconds. Default: no timeout.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeoutMillis the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder timeoutMillis(String timeoutMillis) {
            doSetProperty("timeoutMillis", timeoutMillis);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
    }

    public interface IgniteQueueBuilders {
        /**
         * Ignite Queues (camel-ignite)
         * Interact with .
         * 
         * Category: messaging,queue
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-queue:name</code>
         * 
         * Path parameter: name (required)
         * The queue name.
         * 
         * @param path name
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder igniteQueue(String path) {
            return IgniteQueueEndpointBuilderFactory.endpointBuilder("ignite-queue", path);
        }
        /**
         * Ignite Queues (camel-ignite)
         * Interact with .
         * 
         * Category: messaging,queue
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-queue:name</code>
         * 
         * Path parameter: name (required)
         * The queue name.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name
         * @return the dsl builder
         */
        default IgniteQueueEndpointBuilder igniteQueue(
                String componentName,
                String path) {
            return IgniteQueueEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static IgniteQueueEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class IgniteQueueEndpointBuilderImpl extends AbstractEndpointBuilder implements IgniteQueueEndpointBuilder {
            public IgniteQueueEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new IgniteQueueEndpointBuilderImpl(path);
    }
}