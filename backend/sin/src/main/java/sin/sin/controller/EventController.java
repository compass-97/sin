package sin.sin.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sin.sin.dto.EventResponse;
import sin.sin.service.EventService;

@RestController
@RequestMapping("/goods/event")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping
    public ResponseEntity<List<EventResponse>> findAllEvent() {
        List<EventResponse> events = eventService.findAllEvent();

        return ResponseEntity.ok()
            .body(events);
    }
}
