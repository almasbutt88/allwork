class Room:
    def __init__(self, name, capacity, fee, current_song):
        self.name = name
        self.capacity = capacity
        self.fee = fee
        self.current_song = current_song
        self.occupants = []


    # def check_in(self, guest):
    #     self.occupants.append(guest)

    # def check_out_guest(self, guest):
    #     self.occupants.remove(guest)