# Databases and SQL Introduction

### Objectives

 - Understand what a database is
 - Explain what SQL is
 - Know how to use CRUD
 - Know how to create relationships

## Intro

Last week we were building websites where we could enter data and that data was sent from the browser to our controllers running on a server. Our controllers could use that data which was sent from the browswer, but what if the program running our controller had to be restarted e.g. if the machine it was running on crashed - we would lose all our data. Could you imagine if we were running an e-commerce website and we lost all the data regarding our stock, orders, customers etc - that would not be nice :-( 

Wouldn't it be great, therefore, if there was some way we could store the data which our web application needs (e.g. the details entered by a customer) in such a way that, if we needed to restart our server then we can easily get it all back. This is where databases come in. 

## What is a database?

A database is just somewhere for us to store our data. There are many different shapes and sizes of database. SQL is a language which is often used to query these databases and that's what we will be learning today.

## What do we do with databases

What do we store in databases?
> Get the students to make some suggestions

> Ensure you write the "CRUD" operations on the board under each other as the class suggest them, to read the acronym off vertically. Later, we will align these with the SQL commands written next to them.

 What sorts of manipulations do we make to data in databases?

 - Create (we can't do anything unless we can put data in)
 - Read (once it's in there, we need to get it out)
 - Update (if it needs to change, we need to be able to change it)
 - Delete (we'll need to be able to remove data from our database)

We refer to these four operations as "CRUD". This is important since you will come across it later when we begin web programming

> As you work through the sql commands, tick these off.

## What is SQL?

"SQL" stands for "Structured Query Language" (pronounced either as "ess-queue-ell" or "sequel"). In the same way that we use Python to talk to the computer, we can use SQL to talk to a database.

## PostgreSQL

SQL is just a language - we need an engine to run it on. In the same way that Python is just a language, that runs on an "interpreter" - our Python robot we spoke about before.

PostgreSQL is an open source object-relational database system that we will be using on the course.

To check that psql is installed, we can type this.

```bash
# terminal
which psql
```

> If there are any issues with running `psql`, ensure that the `postgresapp` is installed and running (it should have been configured in installfest), and that the path is updated to include it - launch `psql` from the system icon, and note the path used.

```bash
# terminal
psql
```

To quit the sql terminal

```sql
-- psql terminal
\q
```

## Structure

In SQL, a database is a collection of "tables". A table is a collection of "columns" and "rows".

A table describes the type of item that we want to store. A column represents some information we might find interesting about that item. A row is the physical data we want to save.

> Draw this on the board

For example, we might have a `zoo` database with a table called `animals`. The `animals` table might have the columns `name`, `age` and `species`. The `animals` table would then have rows of data like:

| `name` | `age` | `species` |
| --- | --- | --- |
| Leo | 12 | Lion |
| Tony | 8 | Tiger |

Note: a column is sometimes referred to as a field, but they mean the exact same thing.

## Creating a database

To work with data in databases we perform the four CRUD operations.
So we'll work through the SQL commands that give us that functionality.

Before we can do anything though, we need to create a table to store our records in. But before we can create a table, we have to create a database to put it in!

```sql
-- psql terminal
CREATE DATABASE star_wars; -- REMEMBER SEMI COLON
\q
```

Another, much more convenient way to create or delete a database is through the terminal:

```bash
dropdb star_wars
createdb star_wars
```

## Data Types

So before we run off and create lots of shiny tables, we need to talk about datatypes. You'll be glad to hear they roughly match up to what we have already seen in Python. There are many data types we can use in SQL - the most common we will be using are:

* VARCHAR - fixed length text (string)
* INT - numerical data (integer)
* BOOLEAN - true / false data (trueclass, falseclass, booleans)

We can pass arguments to VARCHAR to say how large we want the data in the field to be as a maximum.

# Creating tables

By convention, we will name our database tables as the plural of the thing we are creating. So rows of animal data would be stored in a table called Animals. Sheep would be stored in a table called... well, sheep.

Let's make a table that's going to store data about Star Wars characters. A character might have the following attributes:

- name
- darkside (true / false)
- age

> Get the students to think about what types these columns will be.

Before we create a table, we will drop it so that we can run our script multiple times. PostgreSQL won't let you create a table that already exists.

```bash
# terminal
touch star_wars.sql
```

We can use the following template every time we create a new database table:

```sql
DROP TABLE table_name;

CREATE TABLE table_name (
  column_name1 DATA_TYPE,
  column_name2 DATA_TYPE,
  column_name3 DATA_TYPE
)

```

So, in our case, it would look like this:

```sql
-- star_wars.sql
DROP TABLE characters;

CREATE TABLE characters (
  name VARCHAR(255),
  darkside BOOLEAN,
  age INT
);
```

- What is our table called?
- What are the names of our columns?
- What are the size constraints?

There is a special command that we can run from the terminal to execute PostgreSQL scripts.

```bash
# terminal
psql -d star_wars -f star_wars.sql
```

We will write all of our statements in the one file and comment them out, so you can keep the story of what we are working through.


## Creating (-C-rud)

> Remember to tick off the CRUD items on the board

We're going to start with the C in CRUD but first let's learn the SQL statement that you'll probably use most of all.

```sql
-- star_wars.sql
SELECT * FROM characters;
```

> You may want to comment out select statements as you go, so only the latest one is shown, or just keep moving the select down the script as we go.

This says "get everything from the characters table." The `*` means 'all the fields'.

To "create" records in SQL, we use the `INSERT` clause.

We are going to make a lot of use of the Atom shortcuts `cmd` + `shift` + `d` to duplicate a line as well as `cmd` + `/` to comment a line.

The template for creating entries is the following:

```sql
INSERT INTO table_name (column_name1, column_name2) VALUES (value1, value2);
```

Let's create some characters!

```sql
-- star_wars.sql
-- REMEMBER SEMI COLONS!
-- We're going for prequel-era Star Wars here
INSERT INTO characters (name, darkside, age) VALUES ('Obi-Wan Kenobi', false,  27);
INSERT INTO characters (name, darkside, age) VALUES ('Anakin Skywalker', false, 19);
INSERT INTO characters (name, darkside, age) VALUES ('Darth Maul', true, 32);

SELECT * FROM characters;
```

```bash
# terminal
psql -d star_wars -f star_wars.sql
```

Note that the `INSERT 1 0` is telling us that 1 row was inserted with an id of 0 (has no id, more on this later).

We need to be careful with quotation marks in PostgreSQL - we should always use single quotes. Single quotes behave in the normal way we'd expect - defining text. Double quotes are reserved for system operations. Try not to worry too much about this, just remember to use single quotes when dealing with data.

If we ever need to use a quotation mark or apostrophe in our inserted text, we need to escape it with a backslash or use two of them.

We use the convention uppercase for SQL keywords and lowercase for our own terms. It's not mandatory but it makes it easier to read.

## Inserting nulls

What would happen if we do this?

```sql
-- star_wars.sql
INSERT INTO characters (name, darkside) VALUES ('Yoda', false);
```

```sql
-- star_wars.sql
SELECT * FROM characters
```

```bash
# terminal
psql -d star_wars -f star_wars.sql
```
Notice that the value for `age` is null. Any values which are not passed in are set to null.

## Selecting (c-R-ud)

This is the R is CRUD.

We have been "reading" records with the `SELECT` clause.

```sql
-- star_wars.sql
SELECT * FROM characters;
```

The star is saying that we want all the fields returned, if we said:

```sql
-- star_wars.sql
SELECT name FROM characters;
```

...it would only list the names.

We can also use `SELECT` to count how many rows we have

```sql
-- star_wars.sql
SELECT COUNT(*) FROM characters;
```

# Updating (cr-U-d)

This is the U in CRUD.

We use the `UPDATE` clause to change the values in existing records.

Template:
```sql
UPDATE table_name SET column_name1 = new_value1;
```

Let's update the darkside column to true!

```sql
-- star_wars.sql
UPDATE characters SET darkside = true;
```

```bash
# terminal
psql -d star_wars -f star_wars.sql
```

Note that it says `UPDATE 3` - what does this mean?

This has updated all our records (3 of them)... what if we only want certain records to update?

We can use a `WHERE` clause to achieve this.

```sql
-- star_wars.sql
UPDATE characters SET darkside = true WHERE name = 'Anakin Skywalker';
```

```bash
# terminal
psql -d star_wars -f star_wars.sql
```

We can even update more than one field at a time! This, however, uses a different syntax. When we select multiple columns to update, we have to put them in brackets, and we have to do the same when we give it the values we want to use. Remember, just like with Insert, order matters!

Template:
```sql
UPDATE table_name SET (column_name1, column_name2) = (new_value1, new_value2) WHERE column_name = target_value;
```

Let's update Anakin according to Star Wars lore!

```sql
-- Change the line you just wrote:
UPDATE characters SET (name, darkside) = ('Darth Vader', true) WHERE name = 'Anakin Skywalker';
```

```bash
# terminal
psql -d star_wars -f star_wars.sql
```

> [TASK:]
- Add a new character "Luke Skywalker" with age 17 and darkside set to false.
- Update "Obi-Wan Kenobi" to be age 65

```sql
-- star_wars.sql
INSERT INTO characters (name, darkside, age) VALUES ('Luke Skywalker', false, 17);
UPDATE characters SET age = 65 WHERE name = 'Obi-Wan Kenobi';
```


# Deleting (cru-D-)

This is the D in CRUD.

To delete records we use the `DELETE` clause. But **be careful**, there's no undo! When a record is deleted from a DB it's gone for ever. "Undelete" in the database world is "restore from last night's backup" (if there *was* a backup...)

Template:
```sql
DELETE FROM table_name WHERE column_name = target_value;
```

**SPOILERS** Let's delete Darth Maul

```sql
-- star_wars.sql
DELETE FROM characters WHERE name = 'Darth Maul';
SELECT * FROM characters;
```

**WARNING**: If you don't specify the row(s) with a WHERE clause, it will delete *everything* from that table!

```sql
DELETE FROM characters; -- DELETES EVERYTHING FROM CHARACTERS
```

```bash
# terminal
psql -d star_wars -f star_wars.sql;
```

[Task:] Add a character and then delete it

# Uniquely identifying rows

What happens if we had several characters with the same data in every field? It's unlikely but it could happen.

```sql
-- star_wars.sql
-- Remember, CMD + SHIFT + D to duplicate lines in Atom
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
```

```bash
# terminal
psql -d star_wars -f star_wars.sql;
```

So it's a Stormtrooper's birthday today! But how can we uniquely identify him in the database to update his age?

We can't. We have no way of uniquely identifying this row, and any query we try to execute will update all the Stormtroopers.

Oops.

The answer to this is to add a column to every table when we create it. That column will contain a number, which will be unique for each row in the database, and ideally is managed by the database itself, so we don't need to worry about adding it when we insert new records.

## Serials

We are going to need an `id` column, to solve our problem of uniquely identifying rows.

The new `id` field is a `SERIAL` type -- an internal type of PostgreSQL's, which will look after numbering for us in an eight byte integer field. This gives us up to 9 quintillion[`*`] ids which is probably enough.

[`*`] Nine quintillion, two hundred twenty-three quadrillion, three hundred seventy-two trillion, thirty-six billion, eight hundred fifty-four million, seven hundred seventy-five thousand, eight hundred and seven. See https://en.wikipedia.org/wiki/9,223,372,036,854,775,807

>Note that you may see SERIAL and INT with a number attached. e.g. `SERIAL4`, `INT2`, etc. This limits the number of bytes assigned to the value therefore reducing the range of the numbers.
i.e.
`SERIAL4` => 4 Bytes.... which gives up to 2,147,483,647 numbers.
`INT2` => 2 Bytes.... which gives us up to 65536 numbers.

Serials are super special integers, that auto increment themselves. If we had simply used INT, we'd have to manually curate them and make sure we added 1 every time we added a row, which would be horrible! This would also cause issues if we had concurrent users - what if they both made a row at the same time? Serials take care of this nightmare for us.

Note that different database engines handle this in different ways, serials are a PostgreSQL specific construct which other engines might use.

Let's update our characters

```sql
-- star_wars.sql
CREATE TABLE characters(
  id SERIAL,
  name VARCHAR(255),
  darkside BOOLEAN,
  age INT
);
```

If we run our script now we should see something cool. Each of our entries magically has a unique id, and we didn't need to do anything to manage it.

Now we have an easier time differentiating between our Stormtroopers!

Let's update one of them to be a bit older than 25!

```sql
UPDATE characters SET age = 29 WHERE id = 9;
```

Our next step is figuring out how to add lightsabers to our characters!
