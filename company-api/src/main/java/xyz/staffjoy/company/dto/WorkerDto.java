package xyz.staffjoy.company.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkerDto {
    @NotBlank
    private String companyId;
    @NotBlank
    private String teamId;
    @NotBlank
    private String userId;
}
