package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private Long url;
}
