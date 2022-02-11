from models.items import Item
from models.orders import *
from models.items import *

item_1 = Item("A01", "MacBook Pro")
item_2 = Item("L15", '28" LED Screen')
item_3 = Item("P52", "Blutooth headset")
item_4 = Item("Z99", "USB hub")


order_1 = Order("X875", item_1, 10)
order_2 = Order("T026", item_2, 3)
order_3 = Order("d452", item_3, 5)
order_4 = Order("B765", item_4, 2)