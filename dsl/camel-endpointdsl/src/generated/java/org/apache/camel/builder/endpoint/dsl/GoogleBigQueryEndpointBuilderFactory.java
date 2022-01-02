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
 * Google BigQuery data warehouse for analytics.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleBigQueryEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Google BigQuery component.
     */
    public interface GoogleBigQueryEndpointBuilder
            extends
                EndpointProducerBuilder {
        /**
         * ConnectionFactory to obtain connection to Bigquery Service. If not
         * provided the default one will be used.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param connectionFactory the value to set
         * @return the dsl builder
         */
        default GoogleBigQueryEndpointBuilder connectionFactory(
                org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * ConnectionFactory to obtain connection to Bigquery Service. If not
         * provided the default one will be used.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param connectionFactory the value to set
         * @return the dsl builder
         */
        default GoogleBigQueryEndpointBuilder connectionFactory(
                String connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
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
        default GoogleBigQueryEndpointBuilder lazyStartProducer(
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
        default GoogleBigQueryEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Field name to use as insert id.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param useAsInsertId the value to set
         * @return the dsl builder
         */
        default GoogleBigQueryEndpointBuilder useAsInsertId(String useAsInsertId) {
            doSetProperty("useAsInsertId", useAsInsertId);
            return this;
        }
    }

    public interface GoogleBigQueryBuilders {
        /**
         * Google BigQuery (camel-google-bigquery)
         * Google BigQuery data warehouse for analytics.
         * 
         * Category: cloud,bigdata
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-google-bigquery
         * 
         * Syntax: <code>google-bigquery:projectId:datasetId:tableId</code>
         * 
         * Path parameter: projectId (required)
         * Google Cloud Project Id
         * 
         * Path parameter: datasetId (required)
         * BigQuery Dataset Id
         * 
         * Path parameter: tableId
         * BigQuery table id
         * 
         * @param path projectId:datasetId:tableId
         * @return the dsl builder
         */
        default GoogleBigQueryEndpointBuilder googleBigquery(String path) {
            return GoogleBigQueryEndpointBuilderFactory.endpointBuilder("google-bigquery", path);
        }
        /**
         * Google BigQuery (camel-google-bigquery)
         * Google BigQuery data warehouse for analytics.
         * 
         * Category: cloud,bigdata
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-google-bigquery
         * 
         * Syntax: <code>google-bigquery:projectId:datasetId:tableId</code>
         * 
         * Path parameter: projectId (required)
         * Google Cloud Project Id
         * 
         * Path parameter: datasetId (required)
         * BigQuery Dataset Id
         * 
         * Path parameter: tableId
         * BigQuery table id
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path projectId:datasetId:tableId
         * @return the dsl builder
         */
        default GoogleBigQueryEndpointBuilder googleBigquery(
                String componentName,
                String path) {
            return GoogleBigQueryEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GoogleBigQueryEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GoogleBigQueryEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleBigQueryEndpointBuilder {
            public GoogleBigQueryEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GoogleBigQueryEndpointBuilderImpl(path);
    }
}