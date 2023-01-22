from flask import Flask, jsonify

app = Flask(__name__)

# sample data
books = [
    {
        "name": "Harry Potter and the Philosopher's Stone",
        "author": "J.K. Rowling"
    },
    {
        "name": "The Lord of the Rings",
        "author": "J.R.R. Tolkien"
    }
]

# GET /books
@app.route('/books', methods=['GET'])
def get_books():
    return jsonify({'books': books})

# GET /books/<name>
@app.route('/books/<string:name>', methods=['GET'])
def get_book(name):
    book = [book for book in books if book['name'] == name]
    if len(book) == 0:
        return jsonify({'message': 'book not found'})
    return jsonify({'book': book[0]})

# POST /books
@app.route('/books', methods=['POST'])
def create_book():
