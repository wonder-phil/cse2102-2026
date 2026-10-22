from flask import Flask, request, jsonify


# Define the Flask app
app = Flask(__name__)

subscribers = {}
subject = ""

@app.route('/')
def home():
  return "Hello from Flask!"


# Windows> curl.exe -X POST -H "Content-Type: application/json" -d "{\"name\":\"Alice\",\"URI\":\"http://good.site.com\"}" http://localhost:5000/add-subscriber

@app.route('/add-subscriber', methods=['POST'])
def addSubscriber():
  data = request.json
  name = data.get('name')
  URI = data.get('URI')
  subscribers[name] = URI
  print(f"You entered: Name={name}, Address={URI}")
  return jsonify({'message': f'You sent name: {name} and address: {URI}'})


@app.route('/update-and-notify', methods=['POST'])
def updateAndNotifyAllSubscribers():
  data = request.json
  subject = data.get('subject-update')
  print(f"You updated the subject to: {subject}")
  for key in subscribers.keys():
    print(f"Notifying {key} at {subscribers[key]} of the new subject: {subject}")
  return jsonify({'message': f'You updated subject to: {subject} '})

if __name__ == '__main__':
  app.run(host='0.0.0.0', port=5000, debug=True)