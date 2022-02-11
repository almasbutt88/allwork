from flask import Flask

flask_app = Flask(__name__)

from controllers import controller

if __name__ == '__main__':
    flask_app.run(debug=True)