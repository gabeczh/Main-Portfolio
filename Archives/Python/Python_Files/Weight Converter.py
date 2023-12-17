weight = int(input("Weight: ")) #Integer Input variable
unit = input("(L)bs or (K)g: ") #String input variable

#If the unit equals to uppercase 'L', convert weight to kilos
if unit.upper() == "L":
    converted = weight * 0.45
    print(f"You are {converted} kilos")
#Else convert weight to pounds
else:
    converted = weight / 0.45
    print(f"You are {converted} pounds")