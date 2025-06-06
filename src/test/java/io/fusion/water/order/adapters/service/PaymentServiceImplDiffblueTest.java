/**
 * (C) Copyright 2021 Araf Karsh Hamid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fusion.water.order.adapters.service;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import io.fusion.water.order.domain.models.EchoData;
import io.fusion.water.order.domain.models.EchoResponseData;
import io.fusion.water.order.domain.models.PaymentDetails;
import io.fusion.water.order.domain.models.PaymentStatus;
import io.fusion.water.order.domain.models.PaymentType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {PaymentServiceImpl.class})
@ExtendWith(SpringExtension.class)
class PaymentServiceImplDiffblueTest {
    @Autowired
    private PaymentServiceImpl paymentServiceImpl;

    /**
     * Method under test: {@link PaymentServiceImpl#echo(String)}
     */
    @Test
    void testEcho() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange, Act and Assert
        assertEquals("Hello  word", (new PaymentServiceImpl()).echo(" word"));
    }

    /**
     * Method under test: {@link PaymentServiceImpl#remoteEcho(EchoData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoteEcho() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing Spring properties.
        //   Failed to create Spring context due to unresolvable @Value
        //   properties: private java.util.ArrayList io.fusion.water.order.server.ServiceConfiguration.appPropertyList
        //   Please check that at least one of the property files is provided
        //   and contains required variables:
        //   - application-test.properties (file missing)
        //   See https://diff.blue/R033 to resolve this issue.

        // Arrange
        EchoData word = new EchoData("Hello World!");

        // Act
        EchoResponseData actualRemoteEchoResult = this.paymentServiceImpl.remoteEcho(word);

        // Assert
        assertThat(actualRemoteEchoResult).isNotNull();
    }

    /**
     * Method under test: {@link PaymentServiceImpl#remoteEcho(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoteEcho2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing Spring properties.
        //   Failed to create Spring context due to unresolvable @Value
        //   properties: private java.util.ArrayList io.fusion.water.order.server.ServiceConfiguration.appPropertyList
        //   Please check that at least one of the property files is provided
        //   and contains required variables:
        //   - application-test.properties (file missing)
        //   See https://diff.blue/R033 to resolve this issue.

        // Arrange
        String word = "Hello world!";

        // Act
        EchoResponseData actualRemoteEchoResult = this.paymentServiceImpl.remoteEcho(word);

        // Assert
        assertThat(actualRemoteEchoResult).isNotNull();
    }

    /**
     * Method under test: {@link PaymentServiceImpl#processPayments(PaymentDetails)}
     */
    @Test
    void testProcessPayments() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange
        PaymentServiceImpl paymentService = new PaymentServiceImpl();

        // Act
        PaymentStatus actualProcessPaymentsResult = paymentService.processPayments(new PaymentDetails());

        // Assert
        assertEquals("Accepted", actualProcessPaymentsResult.getPayStatus());
        assertEquals("Ref-uuid", actualProcessPaymentsResult.getPaymentReference());
        assertNull(actualProcessPaymentsResult.getTransactionId());
        assertNull(actualProcessPaymentsResult.getTransactionDate());
        assertEquals(PaymentType.CREDIT_CARD, actualProcessPaymentsResult.getPaymentType());
    }

    /**
     * Method under test:
     * {@link PaymentServiceImpl#processPaymentsExternal(PaymentDetails)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testProcessPaymentsExternal() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing Spring properties.
        //   Failed to create Spring context due to unresolvable @Value
        //   properties: private java.util.ArrayList io.fusion.water.order.server.ServiceConfiguration.appPropertyList
        //   Please check that at least one of the property files is provided
        //   and contains required variables:
        //   - application-test.properties (file missing)
        //   See https://diff.blue/R033 to resolve this issue.

        // Arrange
        PaymentDetails paymentDetails = null;

        // Act
        PaymentStatus actualProcessPaymentsExternalResult = this.paymentServiceImpl
                .processPaymentsExternal(paymentDetails);

        // Assert
        assertThat(actualProcessPaymentsExternalResult).isNotNull();
    }

    /**
     * Method under test:
     * {@link PaymentServiceImpl#processPaymentsDefault(PaymentDetails)}
     */
    @Test
    void testProcessPaymentsDefault() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange
        PaymentServiceImpl paymentService = new PaymentServiceImpl();

        // Act
        PaymentStatus actualProcessPaymentsDefaultResult = paymentService.processPaymentsDefault(new PaymentDetails());

        // Assert
        assertEquals("Accepted", actualProcessPaymentsDefaultResult.getPayStatus());
        assertEquals("Ref-uuid", actualProcessPaymentsDefaultResult.getPaymentReference());
        assertNull(actualProcessPaymentsDefaultResult.getTransactionId());
        assertNull(actualProcessPaymentsDefaultResult.getTransactionDate());
        assertEquals(PaymentType.CREDIT_CARD, actualProcessPaymentsDefaultResult.getPaymentType());
    }
}
