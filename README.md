## JavaEE Record

![study](https://img.shields.io/badge/goodgoodstudy-daydayup-brightgreen)

#### 常用的Git命令

* 设置用户名：`$ git config --global user.name <用户名>`
* 设置邮箱：`$ git config --global user.email <你的邮箱>` 
* 初始化本地仓库：`$ git init`
* 添加远程仓库：`$ git remote add <name> <url>`（name的名字可以随意，url可以为http网址也可以为SSH地址，使用SSH需要生成秘钥）
* 删除本地仓库 (不可恢复)：`$ rm -rf .git`
* 检查本地仓库文件状态：`$ git status`
* 添加文件：`$ git add -A (all)` ，	`$ git add -u (modified&delete)`， 	`$ git add . (new&modeified)`
* 撤销add：`$ git reset HEAD <XXX/XXX.java>` (后面加上文件路径的话，就是对文件撤销，不加的话就是对上次add的所有内容撤销)
* 将改动提交到本地仓库并添加注释：`$ git commit -m <注释>`
* 撤销commit (返回上一个版本)：`$ git reset --soft HEAD^`
* 查看全部日志：`$ git log `，按Page Up、Page Down、↓、↑来控制显示
* 从远程仓库拉取：`$ git pull github master` (基本上pull=fetch+merge)
* 推送到远程仓库：`$ git push github master`

#### .gitignore文件过滤规则不生效

出现此种情况的原因是因为文件已被track，.gitignore无法忽略已被纳入版本管理的文件，需要做的有三步：
* `$ git rm -r --cached .` 将所有本地缓存删除，将所有文件变为未track状态
* `$ git add .` 添加所有文件
* `$ git commit -m 'update .gitignore'` 重新提交

#### 本地仓库关联多个远程仓库

首先查看下自己本地仓库所对应的远程仓库
```bash
$ git remote -v
github  git@github.com:onlywyj/onlywyj.github.io.git (fetch)
github  git@github.com:onlywyj/onlywyj.github.io.git (push)
```
然后使用`git remote add <name> <url>`的方式添加新的远程仓库
```bash
git remote add gitee gitee git@gitee.com:onlywyj/onlywyj.gitee.io.git
```
再次查看
```bash
$ git remote -v
gitee   git@gitee.com:onlywyj/onlywyj.gitee.io.git (fetch)
gitee   git@gitee.com:onlywyj/onlywyj.gitee.io.git (push)
github  git@github.com:onlywyj/onlywyj.github.io.git (fetch)
github  git@github.com:onlywyj/onlywyj.github.io.git (push)
```
需要对两个远程仓库分别`push`和`pull`
```bash
$ git push github master
$ git push gitee master
$ git pull github master
$ git pull gitee master
```