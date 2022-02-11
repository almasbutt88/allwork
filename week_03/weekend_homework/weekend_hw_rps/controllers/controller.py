from rps import app
from models.rps_game import *
from models.players import *
from flask import render_template

@app.route('/')
def home():
    return render_template("index.html")




# @app.route('/<player1_choice>/<player2_choice>')
# def play(player1_choice, player2_choice):
#     player1 = Players("Player 1", player1_choice)
#     player2 = Players("Player 2", player2_choice)
#     game = Game()

#     winner = game.play(player1, player2)
    
#     return render_template("index.html", player1=player1, player2=player2, winner=winner)
