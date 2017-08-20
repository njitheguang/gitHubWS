print("-----------------------子煜工作室--------------------------")
temp = input("不妨猜一下子煜现在心里想的是哪个数字：")
guess = int(temp)
if guess == 8:
    print("窝草，你是子煜心里的蛔虫吗?!")
    print("哼,猜中了也么有奖励!")
else:
    if guess > 8 :
        print("大了大了")
    else :
        print("小了小了")
print("游戏结束，不玩啦")
