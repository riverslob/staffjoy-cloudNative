package xyz.staffjoy.company.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DirectoryEntryRequest {
    @NotBlank
    private String companyId;
    @NotBlank
    private String userId;
}
