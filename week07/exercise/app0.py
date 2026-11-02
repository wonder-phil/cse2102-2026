import threading
import time
from flask import Flask, jsonify

app = Flask(__name__)

active_requests = 0
request_lock = threading.Lock()


@app.route("/do/work", methods=["GET"])
def do_work():
  global active_requests

  with request_lock:
    active_requests += 1
    current_load = active_requests

  print(
      f"[SERVER] Request received. Active concurrent requests:"
      f" {current_load}"
  )

  try:
    # Simulate slow database query or downstream dependency
    time.sleep(5)
    return (
        jsonify({"status": "success", "message": "Work completed!"}),
        200,
    )
  finally:
    with request_lock:
      active_requests -= 1
    print(
        f"[SERVER] Request finished. Active concurrent requests:"
        f" {active_requests}"
    )


if __name__ == "__main__":
  # Ensure threaded=True so Flask handles multiple concurrent requests
  app.run(host="0.0.0.0", port=5001, threaded=True)