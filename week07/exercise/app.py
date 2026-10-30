import asyncio
import threading
from time import time
from flask import Flask, jsonify

app = Flask(__name__)

# Thread-safe counter to track active concurrent requests
active_requests = 0
request_lock = threading.Lock()


@app.route("/do/work", methods=["GET"])
def do_work():
  global active_requests

  with request_lock:
    active_requests += 1
    current_load = active_requests

  print(f"[SERVER] Request received. Active concurrent requests: {current_load}")

  try:
    # Simulate slow response asynchronously
    asyncio.sleep(5)
    #time.sleep(5)
    return (
        jsonify({"status": 201, "message": "Work completed!"}),
        202,
    )
  finally:
    with request_lock:
      active_requests -= 1
    print(f"[SERVER] Request finished. Active concurrent requests: {active_requests}")


if __name__ == "__main__":
  # Ensure threaded=True so Flask handles multiple concurrent requests
  app.run(host="0.0.0.0", port=5000, threaded=True)