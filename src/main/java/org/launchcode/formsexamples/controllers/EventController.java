package org.launchcode.formsexamples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    private static List<String> events = new ArrayList<>();
    private static String title = "Events";

    @GetMapping
    public String displayAllEvents(Model model){
        model.addAttribute("events", events);
        return "events/index";
    }

    //lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm(Model model) {
        return "events/create";
    }

    //lives at events/create but handles POST requests so it's okay
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:"; //redirects to the root path, ie events/index
    }
}
