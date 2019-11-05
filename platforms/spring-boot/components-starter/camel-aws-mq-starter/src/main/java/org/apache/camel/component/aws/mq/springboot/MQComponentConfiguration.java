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
package org.apache.camel.component.aws.mq.springboot;

import javax.annotation.Generated;
import com.amazonaws.Protocol;
import com.amazonaws.services.mq.AmazonMQ;
import org.apache.camel.component.aws.mq.MQOperations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The aws-mq is used for managing Amazon MQ instances.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws-mq")
public class MQComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws-mq component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The AWS MQ default configuration
     */
    private MQConfigurationNestedConfiguration configuration;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * The region in which MQ client needs to work
     */
    private String region;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public MQConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            MQConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public static class MQConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws.mq.MQConfiguration.class;
        /**
         * To use a existing configured AmazonMQClient as client
         */
        private AmazonMQ amazonMqClient;
        /**
         * Amazon AWS Access Key
         */
        private String accessKey;
        /**
         * Amazon AWS Secret Key
         */
        private String secretKey;
        /**
         * The operation to perform. It can be
         * listBrokers,createBroker,deleteBroker
         */
        private MQOperations operation;
        /**
         * To define a proxy protocol when instantiating the MQ client
         */
        private Protocol proxyProtocol = Protocol.HTTPS;
        /**
         * To define a proxy host when instantiating the MQ client
         */
        private String proxyHost;
        /**
         * To define a proxy port when instantiating the MQ client
         */
        private Integer proxyPort;
        /**
         * The region in which MQ client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name()
         */
        private String region;

        public AmazonMQ getAmazonMqClient() {
            return amazonMqClient;
        }

        public void setAmazonMqClient(AmazonMQ amazonMqClient) {
            this.amazonMqClient = amazonMqClient;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public MQOperations getOperation() {
            return operation;
        }

        public void setOperation(MQOperations operation) {
            this.operation = operation;
        }

        public Protocol getProxyProtocol() {
            return proxyProtocol;
        }

        public void setProxyProtocol(Protocol proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }
}