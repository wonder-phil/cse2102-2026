import asyncio

async def first_task():
    print("First task: starting")
    await asyncio.sleep(3)  # simulate a non-blocking delay 2
    print("First task: finished")

async def second_task():
    print("Second task: starting")
    await asyncio.sleep(1)
    print("Second task: finished")

async def main():
    await first_task()
    await second_task()

async def new_main():
    await asyncio.gather(first_task(),
                         second_task())

#asyncio.run(main())
#asyncio.run(new_main())
