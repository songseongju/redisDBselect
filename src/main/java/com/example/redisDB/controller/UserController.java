package com.example.redisDB.controller;

import com.example.redisDB.service.RedisService;
import com.example.redisDB.vo.RedisVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/redis")
public class UserController {

    private final RedisService serivce;

    @GetMapping("/find/{reqId}")
    public ResponseEntity<?> getUser(@PathVariable String reqId) {
        RedisVo userById = serivce.getUserById(reqId);
        return ResponseEntity.ok(userById);
    }
}