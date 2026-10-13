from flask import Flask, request, jsonify


# Define the Flask app
app = Flask(__name__)

def home():
  return "Hello from Flask!"

@app.route('/', methods=['GET'])
def root():
  print(f"Hello at the root")
  return jsonify({'main endpoint':'Ack'})

@app.route('/greeting', methods=['GET'])
def greeting():
  data = request.json
  name = data.get('name')
  return jsonify({'message': f'Hello {name}'})

# Windows> curl.exe -X POST -H "Content-Type: application/json" -d "{\"name\":\"Alice\",\"address\":\"Wonderland\"}" http://localhost:5000/submit
@app.route('/submit', methods=['POST'])
def submit():
  data = request.json
  name = data.get('name')
  address = data.get('address')
  print(f"You entered: Name={name}, Address={address}")
  return jsonify({'message': f'You sent name: {name} and address: {address}'})

if __name__ == '__main__':
  app.run(host='0.0.0.0', port=5000, debug=True)