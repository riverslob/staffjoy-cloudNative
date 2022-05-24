package xyz.staffjoy.account.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import jakarta.validation.constraintsNotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrackEventRequest {
    @NotBlank
    private String userId;
    @NotBlank
    private String event;
}
