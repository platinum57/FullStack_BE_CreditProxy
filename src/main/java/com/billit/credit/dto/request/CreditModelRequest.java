package com.billit.credit.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreditModelRequest {
    private BigDecimal intRate;
    private BigDecimal installment;
    private String issueDPeriod;
    private Integer debt;
    private String crLinePeriod;
    private Integer pubRec;
    private Integer revolBal;
    private BigDecimal revolUtil;
    private Integer totalAcc;
    private Integer mortAcc;
    private BigDecimal collections12MthsExMed;

    private Integer continuousYear;
    private Integer income;

    private String purpose; // model이 요구하는 값의 형식으로 바꿔야 할 수 있음
    private BigDecimal requestAmount;
    private Integer requestTerm;
}
