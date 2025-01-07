
while True:
    player1=str(input("Enter player 1 choice"))
    player2=str(input("Enter player 2 choice"))

    if player1==player2:
        print("Its a tie")
    elif player1=="rock":
        if player2=="scissor":
            print("player1 wins")
        else:
            ("player2 wins")
    elif player1=="scissor":
        if player2=="paper":
            print("player1 wins")
        else:
            ("player2 wins")
    elif player1=="paper":
        if player2=="rock":
            print("player1 wins")
    else:
        ("player2 wins")
    repeat = input("Do you want to play another round? Yes/No: ").lower()
    if(repeat == "yes"):
        pass
    elif(repeat == "no"):
        raise SystemExit
        
