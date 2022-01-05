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
 * Generate messages in specified intervals using <code>java.util.Timer.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface TimerEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Timer component.
     */
    public interface TimerEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedTimerEndpointBuilder advanced() {
            return (AdvancedTimerEndpointBuilder) this;
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
        default TimerEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default TimerEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Delay before first event is triggered.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: consumer
         * 
         * @param delay the value to set
         * @return the dsl builder
         */
        default TimerEndpointBuilder delay(long delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * Delay before first event is triggered.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: consumer
         * 
         * @param delay the value to set
         * @return the dsl builder
         */
        default TimerEndpointBuilder delay(String delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * Events take place at approximately regular intervals, separated by
         * the specified period.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param fixedRate the value to set
         * @return the dsl builder
         */
        default TimerEndpointBuilder fixedRate(boolean fixedRate) {
            doSetProperty("fixedRate", fixedRate);
            return this;
        }
        /**
         * Events take place at approximately regular intervals, separated by
         * the specified period.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param fixedRate the value to set
         * @return the dsl builder
         */
        default TimerEndpointBuilder fixedRate(String fixedRate) {
            doSetProperty("fixedRate", fixedRate);
            return this;
        }
        /**
         * Whether to include metadata in the exchange such as fired time, timer
         * name, timer count etc. This information is default included.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param includeMetadata the value to set
         * @return the dsl builder
         */
        default TimerEndpointBuilder includeMetadata(boolean includeMetadata) {
            doSetProperty("includeMetadata", includeMetadata);
            return this;
        }
        /**
         * Whether to include metadata in the exchange such as fired time, timer
         * name, timer count etc. This information is default included.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param includeMetadata the value to set
         * @return the dsl builder
         */
        default TimerEndpointBuilder includeMetadata(String includeMetadata) {
            doSetProperty("includeMetadata", includeMetadata);
            return this;
        }
        /**
         * If greater than 0, generate periodic events every period.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: consumer
         * 
         * @param period the value to set
         * @return the dsl builder
         */
        default TimerEndpointBuilder period(long period) {
            doSetProperty("period", period);
            return this;
        }
        /**
         * If greater than 0, generate periodic events every period.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: consumer
         * 
         * @param period the value to set
         * @return the dsl builder
         */
        default TimerEndpointBuilder period(String period) {
            doSetProperty("period", period);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the timer will only fire once. If you set it to 5, it will only fire
         * five times. A value of zero or negative means fire forever.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param repeatCount the value to set
         * @return the dsl builder
         */
        default TimerEndpointBuilder repeatCount(long repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the timer will only fire once. If you set it to 5, it will only fire
         * five times. A value of zero or negative means fire forever.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param repeatCount the value to set
         * @return the dsl builder
         */
        default TimerEndpointBuilder repeatCount(String repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Timer component.
     */
    public interface AdvancedTimerEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default TimerEndpointBuilder basic() {
            return (TimerEndpointBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Specifies whether or not the thread associated with the timer
         * endpoint runs as a daemon. &lt;p/&gt; The default value is true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param daemon the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder daemon(boolean daemon) {
            doSetProperty("daemon", daemon);
            return this;
        }
        /**
         * Specifies whether or not the thread associated with the timer
         * endpoint runs as a daemon. &lt;p/&gt; The default value is true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param daemon the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder daemon(String daemon) {
            doSetProperty("daemon", daemon);
            return this;
        }
        /**
         * Allows you to specify a custom Date pattern to use for setting the
         * time option using URI syntax.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param pattern the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder pattern(String pattern) {
            doSetProperty("pattern", pattern);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * A java.util.Date the first event should be generated. If using the
         * URI, the pattern expected is: yyyy-MM-dd HH:mm:ss or
         * yyyy-MM-dd'T'HH:mm:ss.
         * 
         * The option is a: &lt;code&gt;java.util.Date&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param time the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder time(Date time) {
            doSetProperty("time", time);
            return this;
        }
        /**
         * A java.util.Date the first event should be generated. If using the
         * URI, the pattern expected is: yyyy-MM-dd HH:mm:ss or
         * yyyy-MM-dd'T'HH:mm:ss.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Date&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param time the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder time(String time) {
            doSetProperty("time", time);
            return this;
        }
        /**
         * To use a custom Timer.
         * 
         * The option is a: &lt;code&gt;java.util.Timer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param timer the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder timer(Timer timer) {
            doSetProperty("timer", timer);
            return this;
        }
        /**
         * To use a custom Timer.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Timer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param timer the value to set
         * @return the dsl builder
         */
        default AdvancedTimerEndpointBuilder timer(String timer) {
            doSetProperty("timer", timer);
            return this;
        }
    }

    public interface TimerBuilders {
        /**
         * Timer (camel-timer)
         * Generate messages in specified intervals using <code>java.util.Timer.
         * 
         * Category: core,scheduling
         * Since: 1.0
         * Maven coordinates: org.apache.camel:camel-timer
         * 
         * Syntax: <code>timer:timerName</code>
         * 
         * Path parameter: timerName (required)
         * The name of the timer
         * 
         * @param path timerName
         * @return the dsl builder
         */
        default TimerEndpointBuilder timer(String path) {
            return TimerEndpointBuilderFactory.endpointBuilder("timer", path);
        }
        /**
         * Timer (camel-timer)
         * Generate messages in specified intervals using <code>java.util.Timer.
         * 
         * Category: core,scheduling
         * Since: 1.0
         * Maven coordinates: org.apache.camel:camel-timer
         * 
         * Syntax: <code>timer:timerName</code>
         * 
         * Path parameter: timerName (required)
         * The name of the timer
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path timerName
         * @return the dsl builder
         */
        default TimerEndpointBuilder timer(String componentName, String path) {
            return TimerEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static TimerEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class TimerEndpointBuilderImpl extends AbstractEndpointBuilder implements TimerEndpointBuilder, AdvancedTimerEndpointBuilder {
            public TimerEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new TimerEndpointBuilderImpl(path);
    }
}