1. sql文件路径：RuoYi/ry.sql
2. 新表：sys_user_salary(员工薪资表) 新增基础字段，修改创建时间字段
![](https://i.loli.net/2020/11/26/FOLV7eJyl1HuGdm.png)
3. sys_user_salary表与sys_user用户信息表相关联
4. 新增工资管理，工资管理中的组织机构还没做
5. 列表渲染
![](http://115.159.82.96/group1/M00/00/00/rBEADl-6EQuAZW9MAAIdShBBdvQ598.jpg)
6. 新增页面中，在用户名称输入框中输入，下面会有待选的用户名和用户id，点击之后，自动赋值
7. 删除数据，原本想做伪删除，一个字段0为删除，1为未删除，后面发现不合理
8. 编辑
![](https://i.loli.net/2020/11/26/FHlq6wWMsCE7Qh9.png)
9. 通过对姓名进行模糊查询
10. 导出表格数据,时间格式出现问题，在对象类中@Excel，添加dateFormat="yyyy-MM-dd HH:mm:ss")的属性
![](https://i.loli.net/2020/11/26/bP6QHNXEcauRKgO.png)
![](https://i.loli.net/2020/11/26/74foHnUuyDlQZiE.png)