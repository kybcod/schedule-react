package com.example.scheduleproject.schedule;

import com.example.scheduleproject.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ScheduleController {

    private final MemberService memberService;
    private final ScheduleService scheduleService;

    @Description("캘린더 보여주기")
    @GetMapping("/")
    public String home() {
        return "main/home";
    }

    @Description("캘린더 일정 추가하기")
    @PostMapping("/addEvent")
    public void insert(Schedule schedule){
        scheduleService.insertSchedule(schedule);
    }
}
