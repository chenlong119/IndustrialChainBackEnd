-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('企业表', '3', '1', 'enterprise', 'coalition/enterprise/index', 1, 0, 'C', '0', '0', 'coalition:enterprise:list', '#', 'admin', sysdate(), '', null, '企业表菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('企业表查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'coalition:enterprise:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('企业表新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'coalition:enterprise:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('企业表修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'coalition:enterprise:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('企业表删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'coalition:enterprise:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('企业表导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'coalition:enterprise:export',       '#', 'admin', sysdate(), '', null, '');