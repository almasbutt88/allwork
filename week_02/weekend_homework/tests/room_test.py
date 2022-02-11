import unittest
from src.room import Room
from src.guest import Guest

class TestRoom(unittest.TestCase):

    def setUp(self):
        self.guest = Guest("Almas", 5, "Clocks")
        self.room = Room("Alpha", 5, 2, ["Paradise"])

    # def test_room_has_capacity(self):
    #     self.assertEqual(5, self.room.capacity)


    # def test_check_in_guest(self):
    #     self.room.check_in(self.guest)
    #     self.assertEqual(1, len(self.room.occupants))
    
    # def test_check_out_guest(self):
    #     self.room.check_in(self.guest)
    #     self.room.check_out_guest(self.guest)
    #     self.assertEqual(0, len(self.room.occupants))

    # def test_room_has_music_playing(self):
    #     self.assertEqual(1, len(self.room.current_song))

    #write a function that prints out a dictionary for PDA

    #for every test, assume its a new room and new guest. you gotta check guest in before checking out