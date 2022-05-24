package xyz.staffjoy.account.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.staffjoy.common.validation.PhoneNumber;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {
    @NotBlank
    private String id;
    private String name;
    @Email(message = "Invalid email")
    private String email;
    private boolean confirmedAndActive;
    @NotNull
    private Instant memberSince;
    private boolean support;
    @PhoneNumber
    private String phoneNumber;
    @NotEmpty
    private String photoUrl;
}
