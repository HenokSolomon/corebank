package com.bankx.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CustomerDetailDto {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String accountNumber;
    private final double savingAccountBalance;
    private final double currentAccountBalance;

}
