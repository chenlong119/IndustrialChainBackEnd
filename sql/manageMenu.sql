-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('操作员表', '3', '1', 'manage', 'operator/manage/index', 1, 0, 'C', '0', '0', 'operator:manage:list', '#', 'admin', sysdate(), '', null, '操作员表菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('操作员表查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'operator:manage:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('操作员表新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'operator:manage:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('操作员表修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'operator:manage:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('操作员表删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'operator:manage:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('操作员表导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'operator:manage:export',       '#', 'admin', sysdate(), '', null, '');