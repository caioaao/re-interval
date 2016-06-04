# re-interval

A ClojureScript library for creating intervals controlled by events.

## Usage

To create an interval:

`(register-interval-handlers :interval-prefix middleware timeout-in-ms)`

To activate the interval, dispatch the event `:interval-prefix/activate`. When
active, an event `:interval-prefix/tick` will be dispatched every `timeout` ms.

To temporarily deactivate the interval, dispatch `:interval-prefix/activate`.

## Setup

Most of the following scripts require [rlwrap](http://utopia.knoware.nl/~hlub/uck/rlwrap/) (on OS X installable via brew).

Build your project once in dev mode with the following script and then open `index.html` in your browser.

    ./scripts/build

To auto build your project in dev mode:

    ./scripts/watch

To start an auto-building Node REPL:

    ./scripts/repl

To get source map support in the Node REPL:

    lein npm install

To start a browser REPL:

1. Uncomment the following lines in src/re_interval/core.cljs:
```clojure
;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))
```
2. Run `./scripts/brepl`
3. Browse to `http://localhost:9000` (you should see `Hello world!` in the web console)
4. (back to step 3) you should now see the REPL prompt: `cljs.user=>`
5. You may now evaluate ClojureScript statements in the browser context.

For more info using the browser as a REPL environment, see
[this](https://github.com/clojure/clojurescript/wiki/The-REPL-and-Evaluation-Environments#browser-as-evaluation-environment).

Clean project specific out:

    lein clean

Build a single release artifact with the following script and then open `index_release.html` in your browser.

    ./scripts/release

## Contributing / literate programming

As part of an exercise, I've created this library following
[literate programming techniques](http://orgmode.org/worg/org-contrib/babel/how-to-use-Org-Babel-for-R.html). For
anyone interested, the documentation that generated the source is in the file
`project.org`. Just need to connect to a REPL and run the code blocks :)
