class BusStop:
    def __init__(self, name):
        self.name = name
        self.queue = []

    def add_person(self, new_person):
        return self.queue.append(new_person)
    
    
