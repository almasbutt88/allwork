from flask import Flask

app = Flask(__name__) #__name__ is a preexisting variable, when you use flask here, you talking about the app module

from controllers import controller


if __name__ == '__main__':
    app.run(debug = True)
