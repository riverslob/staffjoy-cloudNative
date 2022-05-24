package xyz.staffjoy.sms.dto;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SmsRequest {
    @NotBlank(message = "Please provide a phone number")
    private String to;
    @NotBlank(message = "Please provide a template code")
    private String templateCode;
    private String templateParam;
}
