# zatan
杂谈
### git 操作
- git init ：在/home/gab/GitTest/目录下构造本地git库,该目录下会出现 .git/ 文件 
- git remote add origin 远程仓库地址 
- git add . 
- git commit -m “`添加注释`” 
- git push origin master  (再去push一下要上传的文件) 
- git pull origin master 更新代码
- git branch -b `分支名` 创建并跳转到当前分支
- git checkout `分支名` 切换分支
- git reflog 获取你自己的commit id
- git reset --hard HEAD@{`id`} 回到之前提交的id
