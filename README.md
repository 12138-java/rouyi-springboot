1. sql文件路径：RuoYi/ry.sql
2. 新表：sys_user_salary(员工薪资表) 新增基础字段，修改创建时间字段
![](https://i.loli.net/2020/11/26/FOLV7eJyl1HuGdm.png)
3. sys_user_salary表与sys_user用户信息表相关联
4. 新增工资管理，工资管理中的组织机构还没做，在用户名称输入框中输入，下面会有待选的用户名和用户id，点击之后，自动赋值
![](https://i.loli.net/2020/11/26/TvS3bEuVtRKmNAk.png)
5. 列表渲染
![](https://i.loli.net/2020/11/25/YvcyFe7K9Jr25DS.png)
6. 删除数据，原本想做伪删除，一个字段0为删除，1为未删除，后面发现不合理
![](https://i.loli.net/2020/11/26/V6LueOAEaBpNwbx.png)
7. 编辑数据
![](https://i.loli.net/2020/11/26/FHlq6wWMsCE7Qh9.png)
8. 通过对姓名进行模糊查询
9. 导出表格数据,时间格式出现问题，在对象类中@Excel，添加dateFormat="yyyy-MM-dd HH:mm:ss")的属性
![](https://i.loli.net/2020/11/26/bP6QHNXEcauRKgO.png)
![](https://i.loli.net/2020/11/26/74foHnUuyDlQZiE.png)