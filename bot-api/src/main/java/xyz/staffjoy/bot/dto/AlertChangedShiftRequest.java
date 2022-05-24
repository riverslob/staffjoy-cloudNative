package xyz.staffjoy.bot.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.staffjoy.company.dto.ShiftDto;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlertChangedShiftRequest {
    @NotBlank
    private String userId;
    @NotNull
    private ShiftDto oldShift;
    @NotNull
    private ShiftDto newShift;
}
