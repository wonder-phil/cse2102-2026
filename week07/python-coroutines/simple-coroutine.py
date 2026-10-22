import asyncio

async def my_coroutine():
    print("Starting coroutine")
    await asyncio.sleep(1)
    print("Finishing coroutine")
