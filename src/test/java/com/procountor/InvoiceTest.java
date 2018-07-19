
package com.procountor;

import org.junit.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceTest {

    @Test
    public void testCalculateTotalValue() {

        Product product1 = new Product("ziemniak", 5, 4d);
        Invoice invoice = new Invoice(1, Arrays.asList(product1));

        assertThat(invoice.calculateTotalValue()).isEqualTo(20);
    }
}

