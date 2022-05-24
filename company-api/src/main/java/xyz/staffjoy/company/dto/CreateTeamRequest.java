package xyz.staffjoy.company.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.staffjoy.common.validation.DayOfWeek;
import xyz.staffjoy.common.validation.Timezone;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateTeamRequest {
    @NotBlank
    private String companyId;
    @NotBlank
    private String name;
    @Timezone
    private String timezone;
    @DayOfWeek
    private String dayWeekStarts;
    @Pattern(regexp = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$")
    @NotEmpty
    private String color;
}
