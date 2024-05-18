package com.dex.FindPartners.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dex.FindPartners.mapper.UserTeamMapper;
import com.dex.FindPartners.model.domain.UserTeam;
import com.dex.FindPartners.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
* @author lanhaohu
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2024-02-27 00:12:29
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




