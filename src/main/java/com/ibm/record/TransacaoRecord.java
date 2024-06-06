package com.ibm.record;

import java.math.BigDecimal;

public record TransacaoRecord(BigDecimal valor, Long idCliente, Long numeroConta) {

}
