package com.ibm.record;

import java.math.BigDecimal;

public record DepositoRecord(BigDecimal valor, Long idCliente, Long numeroConta) {

}
