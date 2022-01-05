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
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Poll for incoming messages in Google Mail.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleMailStreamEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Google Mail Stream component.
     */
    public interface GoogleMailStreamEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGoogleMailStreamEndpointBuilder advanced() {
            return (AdvancedGoogleMailStreamEndpointBuilder) this;
        }
        /**
         * Google mail application name. Example would be camel-google-mail/1.0.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param applicationName the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder applicationName(
                String applicationName) {
            doSetProperty("applicationName", applicationName);
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
        default GoogleMailStreamEndpointBuilder bridgeErrorHandler(
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
        default GoogleMailStreamEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Client ID of the mail application.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param clientId the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Comma separated list of labels to take into account.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param labels the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder labels(String labels) {
            doSetProperty("labels", labels);
            return this;
        }
        /**
         * Mark the message as read once it has been consumed.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param markAsRead the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder markAsRead(boolean markAsRead) {
            doSetProperty("markAsRead", markAsRead);
            return this;
        }
        /**
         * Mark the message as read once it has been consumed.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param markAsRead the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder markAsRead(String markAsRead) {
            doSetProperty("markAsRead", markAsRead);
            return this;
        }
        /**
         * Max results to be returned.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: consumer
         * 
         * @param maxResults the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder maxResults(long maxResults) {
            doSetProperty("maxResults", maxResults);
            return this;
        }
        /**
         * Max results to be returned.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: consumer
         * 
         * @param maxResults the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder maxResults(String maxResults) {
            doSetProperty("maxResults", maxResults);
            return this;
        }
        /**
         * The query to execute on gmail box.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: is:unread
         * Group: consumer
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sendEmptyMessageWhenIdle the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sendEmptyMessageWhenIdle the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffErrorThreshold the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffErrorThreshold the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffIdleThreshold the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffIdleThreshold the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffMultiplier the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder backoffMultiplier(
                int backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffMultiplier the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder backoffMultiplier(
                String backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * Milliseconds before the next poll.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 500
         * Group: scheduler
         * 
         * @param delay the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder delay(long delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * Milliseconds before the next poll.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 500
         * Group: scheduler
         * 
         * @param delay the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder delay(String delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: scheduler
         * 
         * @param greedy the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder greedy(boolean greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: scheduler
         * 
         * @param greedy the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder greedy(String greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * Milliseconds before the first poll starts.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: scheduler
         * 
         * @param initialDelay the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder initialDelay(long initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Milliseconds before the first poll starts.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: scheduler
         * 
         * @param initialDelay the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder initialDelay(String initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: scheduler
         * 
         * @param repeatCount the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder repeatCount(long repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: scheduler
         * 
         * @param repeatCount the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder repeatCount(String repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.LoggingLevel&lt;/code&gt; type.
         * 
         * Default: TRACE
         * Group: scheduler
         * 
         * @param runLoggingLevel the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder runLoggingLevel(
                org.apache.camel.LoggingLevel runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.LoggingLevel&lt;/code&gt; type.
         * 
         * Default: TRACE
         * Group: scheduler
         * 
         * @param runLoggingLevel the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder runLoggingLevel(
                String runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option is a:
         * &lt;code&gt;java.util.concurrent.ScheduledExecutorService&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param scheduledExecutorService the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.concurrent.ScheduledExecutorService&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param scheduledExecutorService the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz
         * component. Use value spring or quartz for built in scheduler.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Default: none
         * Group: scheduler
         * 
         * @param scheduler the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder scheduler(Object scheduler) {
            doSetProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz
         * component. Use value spring or quartz for built in scheduler.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Default: none
         * Group: scheduler
         * 
         * @param scheduler the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder scheduler(String scheduler) {
            doSetProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option is a: &lt;code&gt;java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * schedulerProperties(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: scheduler
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder schedulerProperties(
                String key,
                Object value) {
            doSetMultiValueProperty("schedulerProperties", "scheduler." + key, value);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option is a: &lt;code&gt;java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * schedulerProperties(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: scheduler
         * 
         * @param values the values
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder schedulerProperties(Map values) {
            doSetMultiValueProperties("schedulerProperties", "scheduler.", values);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param startScheduler the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder startScheduler(
                boolean startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param startScheduler the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder startScheduler(
                String startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option is a:
         * &lt;code&gt;java.util.concurrent.TimeUnit&lt;/code&gt; type.
         * 
         * Default: MILLISECONDS
         * Group: scheduler
         * 
         * @param timeUnit the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder timeUnit(TimeUnit timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.concurrent.TimeUnit&lt;/code&gt; type.
         * 
         * Default: MILLISECONDS
         * Group: scheduler
         * 
         * @param timeUnit the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder timeUnit(String timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param useFixedDelay the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder useFixedDelay(
                boolean useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param useFixedDelay the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder useFixedDelay(
                String useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessToken the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Client secret of the mail application.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param clientSecret the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder clientSecret(String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param refreshToken the value to set
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder refreshToken(String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google Mail Stream component.
     */
    public interface AdvancedGoogleMailStreamEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default GoogleMailStreamEndpointBuilder basic() {
            return (GoogleMailStreamEndpointBuilder) this;
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
        default AdvancedGoogleMailStreamEndpointBuilder exceptionHandler(
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
        default AdvancedGoogleMailStreamEndpointBuilder exceptionHandler(
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
        default AdvancedGoogleMailStreamEndpointBuilder exchangePattern(
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
        default AdvancedGoogleMailStreamEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.PollingConsumerPollStrategy&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param pollStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedGoogleMailStreamEndpointBuilder pollStrategy(
                org.apache.camel.spi.PollingConsumerPollStrategy pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.PollingConsumerPollStrategy&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param pollStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedGoogleMailStreamEndpointBuilder pollStrategy(
                String pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
    }

    public interface GoogleMailStreamBuilders {
        /**
         * Google Mail Stream (camel-google-mail)
         * Poll for incoming messages in Google Mail.
         * 
         * Category: cloud,mail
         * Since: 2.22
         * Maven coordinates: org.apache.camel:camel-google-mail
         * 
         * Syntax: <code>google-mail-stream:index</code>
         * 
         * Path parameter: index (required)
         * Currently not in use
         * 
         * @param path index
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder googleMailStream(String path) {
            return GoogleMailStreamEndpointBuilderFactory.endpointBuilder("google-mail-stream", path);
        }
        /**
         * Google Mail Stream (camel-google-mail)
         * Poll for incoming messages in Google Mail.
         * 
         * Category: cloud,mail
         * Since: 2.22
         * Maven coordinates: org.apache.camel:camel-google-mail
         * 
         * Syntax: <code>google-mail-stream:index</code>
         * 
         * Path parameter: index (required)
         * Currently not in use
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path index
         * @return the dsl builder
         */
        default GoogleMailStreamEndpointBuilder googleMailStream(
                String componentName,
                String path) {
            return GoogleMailStreamEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GoogleMailStreamEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GoogleMailStreamEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleMailStreamEndpointBuilder, AdvancedGoogleMailStreamEndpointBuilder {
            public GoogleMailStreamEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GoogleMailStreamEndpointBuilderImpl(path);
    }
}