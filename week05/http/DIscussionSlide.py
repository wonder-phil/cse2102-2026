from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/', methods=['GET'])
def root():
  return jsonify({'main endpoint':'Ack'})

@app.route('/greeting', methods=['GET'])
def greeting():
  data = request.json
  name = data.get('name')
  return jsonify({'message': f'Hello {name}'})

if __name__ == '__main__':
  app.run(host='0.0.0.0', port=5000, debug=True)
  
  