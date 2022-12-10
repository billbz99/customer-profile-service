package com.company.org.customerprofileservice.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Header {
    @Min(value = 1, message = "correlationID can not be null or empty")
    private long correlationID;
    @NotBlank(message = "requestId can not be null or empty")
    private String requestId;
    @Min(value = 1, message = "createdTimestamp can not be null or empty")
    private long createdTimestamp;
    @NotBlank(message = "createdBy can not be null or empty")
    private String createdBy;
    @NotBlank(message = "requestedBy can not be null or empty")
    private String requestedBy;
    @NotBlank(message = "eventId can not be null or empty")
    private String eventId;
    @NotBlank(message = "eventInstanceId can not be null or empty")
    private String eventInstanceId;
}
