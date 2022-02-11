import unittest
from src.song import Song

class TestSong(unittest.TestCase):
   
    def setUp(self):
        self.song = Song("Clocks", 4)
       

    

    
    def test_band_playing_coldplay(self):
        self.assertEqual("coldplay", self.song.playlist["band"])



























    def test_band_members_equal_3(self):
        self.assertEqual(3, len(self.song.playlist["members"]))
    

















































