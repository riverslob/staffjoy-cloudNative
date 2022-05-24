package xyz.staffjoy.company.dto;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateShiftRequest {

    static final long MAX_SHIFT_DURATION = TimeUnit.HOURS.toMillis(23);

    @NotBlank
    private String companyId;
    @NotBlank
    private String teamId;
    @NotNull
    private Instant start;
    @NotNull
    private Instant stop;
    @Builder.Default
    private String userId = "";
    @Builder.Default
    private String jobId = "";
    @NotNull
    private boolean published;

    @AssertTrue(message = "stop must be after start")
    private boolean shopIsAfterStart() {
        long duration = stop.toEpochMilli() - start.toEpochMilli();
        return duration > 0;
    }

    @AssertTrue(message = "Shifts exceed max allowed hour duration")
    private boolean withInMaxDuration() {
        long duration = stop.toEpochMilli()- start.toEpochMilli();
        return duration <= MAX_SHIFT_DURATION;
    }
}
