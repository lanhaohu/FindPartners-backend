package com.dex.FindPartners.controller;

import com.dex.FindPartners.common.BaseResponse;
import com.dex.FindPartners.common.ErrorCode;
import com.dex.FindPartners.common.ResultUtils;
import com.dex.FindPartners.exception.BusinessException;
import com.dex.FindPartners.model.domain.User;
import com.dex.FindPartners.model.request.ChatRequest;
import com.dex.FindPartners.model.vo.MessageVo;
import com.dex.FindPartners.service.ChatService;
import com.dex.FindPartners.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.dex.FindPartners.contant.ChatConstant.*;

/**
 * @Author: lanhaohu
 * @Date: 2024年03月01日 11:37
 * @Version: 1.0
 * @Description:
 */
@RestController
@RequestMapping("/chat")
@CrossOrigin(origins = { "http://localhost:5173" })//后边自己加的
public class ChatController {
    @Resource
    private ChatService chatService;
    @Resource
    private UserService userService;

    @PostMapping("/privateChat")
    public BaseResponse<List<MessageVo>> getPrivateChat(@RequestBody ChatRequest chatRequest, HttpServletRequest request) {
        if (chatRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "请求有误");
        }
        User loginUser = userService.getLoginUser(request);
        List<MessageVo> privateChat = chatService.getPrivateChat(chatRequest, PRIVATE_CHAT, loginUser);
        return ResultUtils.success(privateChat);
    }

    @GetMapping("/hallChat")
    public BaseResponse<List<MessageVo>> getHallChat(HttpServletRequest request) {
        User loginUser = userService.getLoginUser(request);
        List<MessageVo> hallChat = chatService.getHallChat(HALL_CHAT, loginUser);
        return ResultUtils.success(hallChat);
    }

    @PostMapping("/teamChat")
    public BaseResponse<List<MessageVo>> getTeamChat(@RequestBody ChatRequest chatRequest, HttpServletRequest request) {
        if (chatRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "请求有误");
        }
        User loginUser = userService.getLoginUser(request);
        List<MessageVo> teamChat = chatService.getTeamChat(chatRequest, TEAM_CHAT, loginUser);
        return ResultUtils.success(teamChat);
    }
}
