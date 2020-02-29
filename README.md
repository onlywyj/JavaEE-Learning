## JavaEE学习记录

![study](https://img.shields.io/badge/goodgoodstudy-daydayup-brightgreen)

#### 常用的Git命令

* 设置用户名：$ git config --global user.name "用户名"
* 设置邮箱：$ git config --global user.email 邮箱
* 初始化本地仓库：git init
* 删除本地仓库 (不可恢复)：rm -rf .git
* 检查本地仓库文件状态：git status
* 添加文件：git add -A (all) 	git add -u (modified&delete) 	git add . (new&modeified)
* 撤销add：git reset HEAD XXX/XXX.java (后面加上文件路径的话，就是对文件撤销，不加的话就是对上次add的所有内容撤销)
* 将改动提交到本地仓库并添加注释：git commit -m “注释”
* 撤销commit (返回上一个版本)：git reset --soft HEAD^
* 查看日志：git log
* 从远程仓库拉取：git pull origin master (基本上pull=fetch+merge)
* 推送到远程仓库：git push origin master