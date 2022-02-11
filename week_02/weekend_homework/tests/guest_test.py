import unittest
from src.guest import Guest
from src.room import Room
from src.song import Song

class TestGuest(unittest.TestCase):
    
    def setUp(self):
        
        self.guest = Guest('Almas', 5, 'Desert Rose')
        self.room = Room("Alpha", 5, 2, "Paradise")
            
    # def test_customer_has_name(self):
    #     self.assertEqual("Almas", self.guest.name)



