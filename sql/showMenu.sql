-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('正在执行的任务表 ', '3', '1', 'show', 'ctask/show/index', 1, 0, 'C', '0', '0', 'ctask:show:list', '#', 'admin', sysdate(), '', null, '正在执行的任务表 菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('正在执行的任务表 查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'ctask:show:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('正在执行的任务表 新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'ctask:show:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('正在执行的任务表 修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'ctask:show:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('正在执行的任务表 删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'ctask:show:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('正在执行的任务表 导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'ctask:show:export',       '#', 'admin', sysdate(), '', null, '');