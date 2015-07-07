/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.esb.rabbitmq.utils;

import org.wso2.carbon.automation.engine.context.AutomationContext;
import org.wso2.esb.integration.common.utils.exception.RabbitMQTransportException;
import org.wso2.esb.integration.common.utils.servers.RabbitMQServer;

import javax.xml.xpath.XPathExpressionException;

public class RabbitMQTestUtils {

    private static final String RABBITMQ_HOME_XPATH = "//rabbitmq/rabbitmqhome";

    public static RabbitMQServer getRabbitMQServerInstance() throws XPathExpressionException, RabbitMQTransportException {
        AutomationContext automationContext = new AutomationContext();
        String rabbitMQHome = automationContext.getConfigurationValue(RABBITMQ_HOME_XPATH);
        return new RabbitMQServer(rabbitMQHome);
    }
}