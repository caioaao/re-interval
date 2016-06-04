# re-interval

A re-frame/ClojureScript library for creating intervals controlled by events.

## Usage

To create an interval:

```
(require '[re-interval.core :refer [register-interval-handlers]])
(register-interval-handlers :interval-prefix middleware timeout-in-ms)
```

To activate the interval, dispatch the event `:interval-prefix/start`. When
active, an event `:interval-prefix/tick` will be dispatched every `timeout` ms.

To stop and restart, dispatch `:interval-prefix/stop` and
`:interval-prefix/restart`, respectivelly.

## Contributing / literate programming

As part of an exercise, I've created this library following
[literate programming techniques](http://orgmode.org/worg/org-contrib/babel/how-to-use-Org-Babel-for-R.html). For
anyone interested, the documentation that generated the source is in the file
`project.org`. Just need to connect to a REPL and run the code blocks :)
