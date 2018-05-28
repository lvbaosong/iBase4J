package org.ibase4j.service.sys.impl;

import org.ibase4j.mapper.sys.SysEmailTemplateMapper;
import org.ibase4j.model.sys.SysEmailTemplate;
import org.ibase4j.service.sys.SysEmailTemplateService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import top.ibase4j.core.base.BaseServiceImpl;

/**
 * @author ShenHuaJie
 *
 */
@Service
@CacheConfig(cacheNames = "sysEmailTemplate")
public class SysEmailTemplateServiceImpl extends BaseServiceImpl<SysEmailTemplate, SysEmailTemplateMapper>
implements SysEmailTemplateService {

}
