from flask import render_template, request, redirect
from app import app
from models.todo_list import add_new_task, tasks
from models.task import Task

print(tasks)
#index route
@app.route('/tasks')
def index():
    return render_template('index.html', title = "Todo List!", my_tasks = tasks)

#create
@app.route('/tasks', methods = ['POST'])
def create():
    #grab hold of the data that was submitted in the form
    print(request.form) #dictionary
    task_title = request.form['title']
    task_description = request.form['description']
    #create a new Task object 
    new_task = Task(task_title, task_description, False)
    #append the new Task to the task_list 
    add_new_task(new_task)
    return redirect('/tasks')   

@app.route('/news')
def news():
    return render_template('news.html', title = "Todo List!")