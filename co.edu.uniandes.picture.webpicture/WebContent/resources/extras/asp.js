(function(window, undefined) {
    var rootjQuery, readyList, core_strundefined = typeof undefined, location = window.location, document = window.document, docElem = document.documentElement, _jQuery = window.jQuery, _$ = window.$, class2type = {}, core_deletedIds = [], core_version = "2.0.3", core_concat = core_deletedIds.concat, core_push = core_deletedIds.push, core_slice = core_deletedIds.slice, core_indexOf = core_deletedIds.indexOf, core_toString = class2type.toString, core_hasOwn = class2type.hasOwnProperty, core_trim = core_version.trim, jQuery = function(selector, context) {
        return new jQuery.fn.init(selector, context, rootjQuery)
    }, core_pnum = /[+-]?(?:\d*\.|)\d+(?:[eE][+-]?\d+|)/.source, core_rnotwhite = /\S+/g, rquickExpr = /^(?:\s*(<[\w\W]+>)[^>]*|#([\w-]*))$/, rsingleTag = /^<(\w+)\s*\/?>(?:<\/\1>|)$/, rmsPrefix = /^-ms-/, rdashAlpha = /-([\da-z])/gi, fcamelCase = function(all, letter) {
        return letter.toUpperCase()
    }, completed = function() {
        document.removeEventListener("DOMContentLoaded", completed, false);
        window.removeEventListener("load", completed, false);
        jQuery.ready()
    };
    jQuery.fn = jQuery.prototype = {
        jquery: core_version,
        constructor: jQuery,
        init: function(selector, context, rootjQuery) {
            var match, elem;
            if (!selector) {
                return this
            }
            if (typeof selector === "string") {
                if (selector.charAt(0) === "<" && selector.charAt(selector.length - 1) === ">" && selector.length >= 3) {
                    match = [null, selector, null]
                } else {
                    match = rquickExpr.exec(selector)
                }
                if (match && (match[1] ||!context)) {
                    if (match[1]) {
                        context = context instanceof jQuery ? context[0] : context;
                        jQuery.merge(this, jQuery.parseHTML(match[1], context && context.nodeType ? context.ownerDocument || context : document, true));
                        if (rsingleTag.test(match[1]) && jQuery.isPlainObject(context)) {
                            for (match in context) {
                                if (jQuery.isFunction(this[match])) {
                                    this[match](context[match])
                                } else {
                                    this.attr(match, context[match])
                                }
                            }
                        }
                        return this
                    } else {
                        elem = document.getElementById(match[2]);
                        if (elem && elem.parentNode) {
                            this.length = 1;
                            this[0] = elem
                        }
                        this.context = document;
                        this.selector = selector;
                        return this
                    }
                } else if (!context || context.jquery) {
                    return (context || rootjQuery).find(selector)
                } else {
                    return this.constructor(context).find(selector)
                }
            } else if (selector.nodeType) {
                this.context = this[0] = selector;
                this.length = 1;
                return this
            } else if (jQuery.isFunction(selector)) {
                return rootjQuery.ready(selector)
            }
            if (selector.selector !== undefined) {
                this.selector = selector.selector;
                this.context = selector.context
            }
            return jQuery.makeArray(selector, this)
        },
        selector: "",
        length: 0,
        toArray: function() {
            return core_slice.call(this)
        },
        get: function(num) {
            return num == null ? this.toArray() : num < 0 ? this[this.length + num] : this[num]
        },
        pushStack: function(elems) {
            var ret = jQuery.merge(this.constructor(), elems);
            ret.prevObject = this;
            ret.context = this.context;
            return ret
        },
        each: function(callback, args) {
            return jQuery.each(this, callback, args)
        },
        ready: function(fn) {
            jQuery.ready.promise().done(fn);
            return this
        },
        slice: function() {
            return this.pushStack(core_slice.apply(this, arguments))
        },
        first: function() {
            return this.eq(0)
        },
        last: function() {
            return this.eq( - 1)
        },
        eq: function(i) {
            var len = this.length, j =+ i + (i < 0 ? len : 0);
            return this.pushStack(j >= 0 && j < len ? [this[j]] : [])
        },
        map: function(callback) {
            return this.pushStack(jQuery.map(this, function(elem, i) {
                return callback.call(elem, i, elem)
            }))
        },
        end: function() {
            return this.prevObject || this.constructor(null)
        },
        push: core_push,
        sort: [].sort,
        splice: [].splice
    };
    jQuery.fn.init.prototype = jQuery.fn;
    jQuery.extend = jQuery.fn.extend = function() {
        var options, name, src, copy, copyIsArray, clone, target = arguments[0] || {}, i = 1, length = arguments.length, deep = false;
        if (typeof target === "boolean") {
            deep = target;
            target = arguments[1] || {};
            i = 2
        }
        if (typeof target !== "object"&&!jQuery.isFunction(target)) {
            target = {}
        }
        if (length === i) {
            target = this;
            --i
        }
        for (; i < length; i++) {
            if ((options = arguments[i]) != null) {
                for (name in options) {
                    src = target[name];
                    copy = options[name];
                    if (target === copy) {
                        continue
                    }
                    if (deep && copy && (jQuery.isPlainObject(copy) || (copyIsArray = jQuery.isArray(copy)))) {
                        if (copyIsArray) {
                            copyIsArray = false;
                            clone = src && jQuery.isArray(src) ? src : []
                        } else {
                            clone = src && jQuery.isPlainObject(src) ? src : {}
                        }
                        target[name] = jQuery.extend(deep, clone, copy)
                    } else if (copy !== undefined) {
                        target[name] = copy
                    }
                }
            }
        }
        return target
    };
    jQuery.extend({
        expando: "jQuery" + (core_version + Math.random()).replace(/\D/g, ""),
        noConflict: function(deep) {
            if (window.$ === jQuery) {
                window.$ = _$
            }
            if (deep && window.jQuery === jQuery) {
                window.jQuery = _jQuery
            }
            return jQuery
        },
        isReady: false,
        readyWait: 1,
        holdReady: function(hold) {
            if (hold) {
                jQuery.readyWait++
            } else {
                jQuery.ready(true)
            }
        },
        ready: function(wait) {
            if (wait === true?--jQuery.readyWait : jQuery.isReady) {
                return 
            }
            jQuery.isReady = true;
            if (wait !== true&&--jQuery.readyWait > 0) {
                return 
            }
            readyList.resolveWith(document, [jQuery]);
            if (jQuery.fn.trigger) {
                jQuery(document).trigger("ready").off("ready")
            }
        },
        isFunction: function(obj) {
            return jQuery.type(obj) === "function"
        },
        isArray: Array.isArray,
        isWindow: function(obj) {
            return obj != null && obj === obj.window
        },
        isNumeric: function(obj) {
            return !isNaN(parseFloat(obj)) && isFinite(obj)
        },
        type: function(obj) {
            if (obj == null) {
                return String(obj)
            }
            return typeof obj === "object" || typeof obj === "function" ? class2type[core_toString.call(obj)] || "object" : typeof obj
        },
        isPlainObject: function(obj) {
            if (jQuery.type(obj) !== "object" || obj.nodeType || jQuery.isWindow(obj)) {
                return false
            }
            try {
                if (obj.constructor&&!core_hasOwn.call(obj.constructor.prototype, "isPrototypeOf")) {
                    return false
                }
            } catch (e) {
                return false
            }
            return true
        },
        isEmptyObject: function(obj) {
            var name;
            for (name in obj) {
                return false
            }
            return true
        },
        error: function(msg) {
            throw new Error(msg)
        },
        parseHTML: function(data, context, keepScripts) {
            if (!data || typeof data !== "string") {
                return null
            }
            if (typeof context === "boolean") {
                keepScripts = context;
                context = false
            }
            context = context || document;
            var parsed = rsingleTag.exec(data), scripts=!keepScripts && [];
            if (parsed) {
                return [context.createElement(parsed[1])]
            }
            parsed = jQuery.buildFragment([data], context, scripts);
            if (scripts) {
                jQuery(scripts).remove()
            }
            return jQuery.merge([], parsed.childNodes)
        },
        parseJSON: JSON.parse,
        parseXML: function(data) {
            var xml, tmp;
            if (!data || typeof data !== "string") {
                return null
            }
            try {
                tmp = new DOMParser;
                xml = tmp.parseFromString(data, "text/xml")
            } catch (e) {
                xml = undefined
            }
            if (!xml || xml.getElementsByTagName("parsererror").length) {
                jQuery.error("Invalid XML: " + data)
            }
            return xml
        },
        noop: function() {},
        globalEval: function(code) {
            var script, indirect = eval;
            code = jQuery.trim(code);
            if (code) {
                if (code.indexOf("use strict") === 1) {
                    script = document.createElement("script");
                    script.text = code;
                    document.head.appendChild(script).parentNode.removeChild(script)
                } else {
                    indirect(code)
                }
            }
        },
        camelCase: function(string) {
            return string.replace(rmsPrefix, "ms-").replace(rdashAlpha, fcamelCase)
        },
        nodeName: function(elem, name) {
            return elem.nodeName && elem.nodeName.toLowerCase() === name.toLowerCase()
        },
        each: function(obj, callback, args) {
            var value, i = 0, length = obj.length, isArray = isArraylike(obj);
            if (args) {
                if (isArray) {
                    for (; i < length; i++) {
                        value = callback.apply(obj[i], args);
                        if (value === false) {
                            break
                        }
                    }
                } else {
                    for (i in obj) {
                        value = callback.apply(obj[i], args);
                        if (value === false) {
                            break
                        }
                    }
                }
            } else {
                if (isArray) {
                    for (; i < length; i++) {
                        value = callback.call(obj[i], i, obj[i]);
                        if (value === false) {
                            break
                        }
                    }
                } else {
                    for (i in obj) {
                        value = callback.call(obj[i], i, obj[i]);
                        if (value === false) {
                            break
                        }
                    }
                }
            }
            return obj
        },
        trim: function(text) {
            return text == null ? "" : core_trim.call(text)
        },
        makeArray: function(arr, results) {
            var ret = results || [];
            if (arr != null) {
                if (isArraylike(Object(arr))) {
                    jQuery.merge(ret, typeof arr === "string" ? [arr] : arr)
                } else {
                    core_push.call(ret, arr)
                }
            }
            return ret
        },
        inArray: function(elem, arr, i) {
            return arr == null?-1 : core_indexOf.call(arr, elem, i)
        },
        merge: function(first, second) {
            var l = second.length, i = first.length, j = 0;
            if (typeof l === "number") {
                for (; j < l; j++) {
                    first[i++] = second[j]
                }
            } else {
                while (second[j] !== undefined) {
                    first[i++] = second[j++]
                }
            }
            first.length = i;
            return first
        },
        grep: function(elems, callback, inv) {
            var retVal, ret = [], i = 0, length = elems.length;
            inv=!!inv;
            for (; i < length; i++) {
                retVal=!!callback(elems[i], i);
                if (inv !== retVal) {
                    ret.push(elems[i])
                }
            }
            return ret
        },
        map: function(elems, callback, arg) {
            var value, i = 0, length = elems.length, isArray = isArraylike(elems), ret = [];
            if (isArray) {
                for (; i < length; i++) {
                    value = callback(elems[i], i, arg);
                    if (value != null) {
                        ret[ret.length] = value
                    }
                }
            } else {
                for (i in elems) {
                    value = callback(elems[i], i, arg);
                    if (value != null) {
                        ret[ret.length] = value
                    }
                }
            }
            return core_concat.apply([], ret)
        },
        guid: 1,
        proxy: function(fn, context) {
            var tmp, args, proxy;
            if (typeof context === "string") {
                tmp = fn[context];
                context = fn;
                fn = tmp
            }
            if (!jQuery.isFunction(fn)) {
                return undefined
            }
            args = core_slice.call(arguments, 2);
            proxy = function() {
                return fn.apply(context || this, args.concat(core_slice.call(arguments)))
            };
            proxy.guid = fn.guid = fn.guid || jQuery.guid++;
            return proxy
        },
        access: function(elems, fn, key, value, chainable, emptyGet, raw) {
            var i = 0, length = elems.length, bulk = key == null;
            if (jQuery.type(key) === "object") {
                chainable = true;
                for (i in key) {
                    jQuery.access(elems, fn, i, key[i], true, emptyGet, raw)
                }
            } else if (value !== undefined) {
                chainable = true;
                if (!jQuery.isFunction(value)) {
                    raw = true
                }
                if (bulk) {
                    if (raw) {
                        fn.call(elems, value);
                        fn = null
                    } else {
                        bulk = fn;
                        fn = function(elem, key, value) {
                            return bulk.call(jQuery(elem), value)
                        }
                    }
                }
                if (fn) {
                    for (; i < length; i++) {
                        fn(elems[i], key, raw ? value : value.call(elems[i], i, fn(elems[i], key)))
                    }
                }
            }
            return chainable ? elems : bulk ? fn.call(elems) : length ? fn(elems[0], key) : emptyGet
        },
        now: Date.now,
        swap: function(elem, options, callback, args) {
            var ret, name, old = {};
            for (name in options) {
                old[name] = elem.style[name];
                elem.style[name] = options[name]
            }
            ret = callback.apply(elem, args || []);
            for (name in options) {
                elem.style[name] = old[name]
            }
            return ret
        }
    });
    jQuery.ready.promise = function(obj) {
        if (!readyList) {
            readyList = jQuery.Deferred();
            if (document.readyState === "complete") {
                setTimeout(jQuery.ready)
            } else {
                document.addEventListener("DOMContentLoaded", completed, false);
                window.addEventListener("load", completed, false)
            }
        }
        return readyList.promise(obj)
    };
    jQuery.each("Boolean Number String Function Array Date RegExp Object Error".split(" "), function(i, name) {
        class2type["[object " + name + "]"] = name.toLowerCase()
    });
    function isArraylike(obj) {
        var length = obj.length, type = jQuery.type(obj);
        if (jQuery.isWindow(obj)) {
            return false
        }
        if (obj.nodeType === 1 && length) {
            return true
        }
        return type === "array" || type !== "function" && (length === 0 || typeof length === "number" && length > 0 && length - 1 in obj)
    }
    rootjQuery = jQuery(document);
    (function(window, undefined) {
        var i, support, cachedruns, Expr, getText, isXML, compile, outermostContext, sortInput, setDocument, document, docElem, documentIsHTML, rbuggyQSA, rbuggyMatches, matches, contains, expando = "sizzle" +- new Date, preferredDoc = window.document, dirruns = 0, done = 0, classCache = createCache(), tokenCache = createCache(), compilerCache = createCache(), hasDuplicate = false, sortOrder = function(a, b) {
            if (a === b) {
                hasDuplicate = true;
                return 0
            }
            return 0
        }, strundefined = typeof undefined, MAX_NEGATIVE = 1<<31, hasOwn = {}.hasOwnProperty, arr = [], pop = arr.pop, push_native = arr.push, push = arr.push, slice = arr.slice, indexOf = arr.indexOf || function(elem) {
            var i = 0, len = this.length;
            for (; i < len; i++) {
                if (this[i] === elem) {
                    return i
                }
            }
            return - 1
        }, booleans = "checked|selected|async|autofocus|autoplay|controls|defer|disabled|hidden|ismap|loop|multiple|open|readonly|required|scoped", whitespace = "[\\x20\\t\\r\\n\\f]", characterEncoding = "(?:\\\\.|[\\w-]|[^\\x00-\\xa0])+", identifier = characterEncoding.replace("w", "w#"), attributes = "\\[" + whitespace + "*(" + characterEncoding + ")" + whitespace + "*(?:([*^$|!~]?=)" + whitespace + "*(?:(['\"])((?:\\\\.|[^\\\\])*?)\\3|(" + identifier + ")|)|)" + whitespace + "*\\]", pseudos = ":(" + characterEncoding + ")(?:\\(((['\"])((?:\\\\.|[^\\\\])*?)\\3|((?:\\\\.|[^\\\\()[\\]]|" + attributes.replace(3, 8) + ")*)|.*)\\)|)", rtrim = new RegExp("^" + whitespace + "+|((?:^|[^\\\\])(?:\\\\.)*)" + whitespace + "+$", "g"), rcomma = new RegExp("^" + whitespace + "*," + whitespace + "*"), rcombinators = new RegExp("^" + whitespace + "*([>+~]|" + whitespace + ")" + whitespace + "*"), rsibling = new RegExp(whitespace + "*[+~]"), rattributeQuotes = new RegExp("=" + whitespace + "*([^\\]'\"]*)" + whitespace + "*\\]", "g"), rpseudo = new RegExp(pseudos), ridentifier = new RegExp("^" + identifier + "$"), matchExpr = {
            ID: new RegExp("^#(" + characterEncoding + ")"),
            CLASS: new RegExp("^\\.(" + characterEncoding + ")"),
            TAG: new RegExp("^(" + characterEncoding.replace("w", "w*") + ")"),
            ATTR: new RegExp("^" + attributes),
            PSEUDO: new RegExp("^" + pseudos),
            CHILD: new RegExp("^:(only|first|last|nth|nth-last)-(child|of-type)(?:\\(" + whitespace + "*(even|odd|(([+-]|)(\\d*)n|)" + whitespace + "*(?:([+-]|)" + whitespace + "*(\\d+)|))" + whitespace + "*\\)|)", "i"),
            bool: new RegExp("^(?:" + booleans + ")$", "i"),
            needsContext: new RegExp("^" + whitespace + "*[>+~]|:(even|odd|eq|gt|lt|nth|first|last)(?:\\(" + whitespace + "*((?:-\\d)?\\d*)" + whitespace + "*\\)|)(?=[^-]|$)", "i")
        }, rnative = /^[^{]+\{\s*\[native \w/, rquickExpr = /^(?:#([\w-]+)|(\w+)|\.([\w-]+))$/, rinputs = /^(?:input|select|textarea|button)$/i, rheader = /^h\d$/i, rescape = /'|\\/g, runescape = new RegExp("\\\\([\\da-f]{1,6}" + whitespace + "?|(" + whitespace + ")|.)", "ig"), funescape = function(_, escaped, escapedWhitespace) {
            var high = "0x" + escaped - 65536;
            return high !== high || escapedWhitespace ? escaped : high < 0 ? String.fromCharCode(high + 65536) : String.fromCharCode(high>>10 | 55296, high & 1023 | 56320)
        };
        try {
            push.apply(arr = slice.call(preferredDoc.childNodes), preferredDoc.childNodes);
            arr[preferredDoc.childNodes.length].nodeType
        } catch (e) {
            push = {
                apply: arr.length ? function(target, els) {
                    push_native.apply(target, slice.call(els))
                }
                : function(target, els) {
                    var j = target.length, i = 0;
                    while (target[j++] = els[i++]) {}
                    target.length = j - 1
                }
            }
        }
        function Sizzle(selector, context, results, seed) {
            var match, elem, m, nodeType, i, groups, old, nid, newContext, newSelector;
            if ((context ? context.ownerDocument || context : preferredDoc) !== document) {
                setDocument(context)
            }
            context = context || document;
            results = results || [];
            if (!selector || typeof selector !== "string") {
                return results
            }
            if ((nodeType = context.nodeType) !== 1 && nodeType !== 9) {
                return []
            }
            if (documentIsHTML&&!seed) {
                if (match = rquickExpr.exec(selector)) {
                    if (m = match[1]) {
                        if (nodeType === 9) {
                            elem = context.getElementById(m);
                            if (elem && elem.parentNode) {
                                if (elem.id === m) {
                                    results.push(elem);
                                    return results
                                }
                            } else {
                                return results
                            }
                        } else {
                            if (context.ownerDocument && (elem = context.ownerDocument.getElementById(m)) && contains(context, elem) && elem.id === m) {
                                results.push(elem);
                                return results
                            }
                        }
                    } else if (match[2]) {
                        push.apply(results, context.getElementsByTagName(selector));
                        return results
                    } else if ((m = match[3]) && support.getElementsByClassName && context.getElementsByClassName) {
                        push.apply(results, context.getElementsByClassName(m));
                        return results
                    }
                }
                if (support.qsa && (!rbuggyQSA ||!rbuggyQSA.test(selector))) {
                    nid = old = expando;
                    newContext = context;
                    newSelector = nodeType === 9 && selector;
                    if (nodeType === 1 && context.nodeName.toLowerCase() !== "object") {
                        groups = tokenize(selector);
                        if (old = context.getAttribute("id")) {
                            nid = old.replace(rescape, "\\$&")
                        } else {
                            context.setAttribute("id", nid)
                        }
                        nid = "[id='" + nid + "'] ";
                        i = groups.length;
                        while (i--) {
                            groups[i] = nid + toSelector(groups[i])
                        }
                        newContext = rsibling.test(selector) && context.parentNode || context;
                        newSelector = groups.join(",")
                    }
                    if (newSelector) {
                        try {
                            push.apply(results, newContext.querySelectorAll(newSelector));
                            return results
                        } catch (qsaError) {} finally {
                            if (!old) {
                                context.removeAttribute("id")
                            }
                        }
                    }
                }
            }
            return select(selector.replace(rtrim, "$1"), context, results, seed)
        }
        function createCache() {
            var keys = [];
            function cache(key, value) {
                if (keys.push(key += " ") > Expr.cacheLength) {
                    delete cache[keys.shift()]
                }
                return cache[key] = value
            }
            return cache
        }
        function markFunction(fn) {
            fn[expando] = true;
            return fn
        }
        function assert(fn) {
            var div = document.createElement("div");
            try {
                return !!fn(div)
            } catch (e) {
                return false
            } finally {
                if (div.parentNode) {
                    div.parentNode.removeChild(div)
                }
                div = null
            }
        }
        function addHandle(attrs, handler) {
            var arr = attrs.split("|"), i = attrs.length;
            while (i--) {
                Expr.attrHandle[arr[i]] = handler
            }
        }
        function siblingCheck(a, b) {
            var cur = b && a, diff = cur && a.nodeType === 1 && b.nodeType === 1 && (~b.sourceIndex || MAX_NEGATIVE) - (~a.sourceIndex || MAX_NEGATIVE);
            if (diff) {
                return diff
            }
            if (cur) {
                while (cur = cur.nextSibling) {
                    if (cur === b) {
                        return - 1
                    }
                }
            }
            return a ? 1 : - 1
        }
        function createInputPseudo(type) {
            return function(elem) {
                var name = elem.nodeName.toLowerCase();
                return name === "input" && elem.type === type
            }
        }
        function createButtonPseudo(type) {
            return function(elem) {
                var name = elem.nodeName.toLowerCase();
                return (name === "input" || name === "button") && elem.type === type
            }
        }
        function createPositionalPseudo(fn) {
            return markFunction(function(argument) {
                argument =+ argument;
                return markFunction(function(seed, matches) {
                    var j, matchIndexes = fn([], seed.length, argument), i = matchIndexes.length;
                    while (i--) {
                        if (seed[j = matchIndexes[i]]) {
                            seed[j]=!(matches[j] = seed[j])
                        }
                    }
                })
            })
        }
        isXML = Sizzle.isXML = function(elem) {
            var documentElement = elem && (elem.ownerDocument || elem).documentElement;
            return documentElement ? documentElement.nodeName !== "HTML" : false
        };
        support = Sizzle.support = {};
        setDocument = Sizzle.setDocument = function(node) {
            var doc = node ? node.ownerDocument || node: preferredDoc, parent = doc.defaultView;
            if (doc === document || doc.nodeType !== 9 ||!doc.documentElement) {
                return document
            }
            document = doc;
            docElem = doc.documentElement;
            documentIsHTML=!isXML(doc);
            if (parent && parent.attachEvent && parent !== parent.top) {
                parent.attachEvent("onbeforeunload", function() {
                    setDocument()
                })
            }
            support.attributes = assert(function(div) {
                div.className = "i";
                return !div.getAttribute("className")
            });
            support.getElementsByTagName = assert(function(div) {
                div.appendChild(doc.createComment(""));
                return !div.getElementsByTagName("*").length
            });
            support.getElementsByClassName = assert(function(div) {
                div.innerHTML = "<div class='a'></div><div class='a i'></div>";
                div.firstChild.className = "i";
                return div.getElementsByClassName("i").length === 2
            });
            support.getById = assert(function(div) {
                docElem.appendChild(div).id = expando;
                return !doc.getElementsByName ||!doc.getElementsByName(expando).length
            });
            if (support.getById) {
                Expr.find["ID"] = function(id, context) {
                    if (typeof context.getElementById !== strundefined && documentIsHTML) {
                        var m = context.getElementById(id);
                        return m && m.parentNode ? [m] : []
                    }
                };
                Expr.filter["ID"] = function(id) {
                    var attrId = id.replace(runescape, funescape);
                    return function(elem) {
                        return elem.getAttribute("id") === attrId
                    }
                }
            } else {
                delete Expr.find["ID"];
                Expr.filter["ID"] = function(id) {
                    var attrId = id.replace(runescape, funescape);
                    return function(elem) {
                        var node = typeof elem.getAttributeNode !== strundefined && elem.getAttributeNode("id");
                        return node && node.value === attrId
                    }
                }
            }
            Expr.find["TAG"] = support.getElementsByTagName ? function(tag, context) {
                if (typeof context.getElementsByTagName !== strundefined) {
                    return context.getElementsByTagName(tag)
                }
            } : function(tag, context) {
                var elem, tmp = [], i = 0, results = context.getElementsByTagName(tag);
                if (tag === "*") {
                    while (elem = results[i++]) {
                        if (elem.nodeType === 1) {
                            tmp.push(elem)
                        }
                    }
                    return tmp
                }
                return results
            };
            Expr.find["CLASS"] = support.getElementsByClassName && function(className, context) {
                if (typeof context.getElementsByClassName !== strundefined && documentIsHTML) {
                    return context.getElementsByClassName(className)
                }
            };
            rbuggyMatches = [];
            rbuggyQSA = [];
            if (support.qsa = rnative.test(doc.querySelectorAll)) {
                assert(function(div) {
                    div.innerHTML = "<select><option selected=''></option></select>";
                    if (!div.querySelectorAll("[selected]").length) {
                        rbuggyQSA.push("\\[" + whitespace + "*(?:value|" + booleans + ")")
                    }
                    if (!div.querySelectorAll(":checked").length) {
                        rbuggyQSA.push(":checked")
                    }
                });
                assert(function(div) {
                    var input = doc.createElement("input");
                    input.setAttribute("type", "hidden");
                    div.appendChild(input).setAttribute("t", "");
                    if (div.querySelectorAll("[t^='']").length) {
                        rbuggyQSA.push("[*^$]=" + whitespace + "*(?:''|\"\")")
                    }
                    if (!div.querySelectorAll(":enabled").length) {
                        rbuggyQSA.push(":enabled", ":disabled")
                    }
                    div.querySelectorAll("*,:x");
                    rbuggyQSA.push(",.*:")
                })
            }
            if (support.matchesSelector = rnative.test(matches = docElem.webkitMatchesSelector || docElem.mozMatchesSelector || docElem.oMatchesSelector || docElem.msMatchesSelector)) {
                assert(function(div) {
                    support.disconnectedMatch = matches.call(div, "div");
                    matches.call(div, "[s!='']:x");
                    rbuggyMatches.push("!=", pseudos)
                })
            }
            rbuggyQSA = rbuggyQSA.length && new RegExp(rbuggyQSA.join("|"));
            rbuggyMatches = rbuggyMatches.length && new RegExp(rbuggyMatches.join("|"));
            contains = rnative.test(docElem.contains) || docElem.compareDocumentPosition ? function(a, b) {
                var adown = a.nodeType === 9 ? a.documentElement: a, bup = b && b.parentNode;
                return a === bup||!!(bup && bup.nodeType === 1 && (adown.contains ? adown.contains(bup) : a.compareDocumentPosition && a.compareDocumentPosition(bup) & 16))
            } : function(a, b) {
                if (b) {
                    while (b = b.parentNode) {
                        if (b === a) {
                            return true
                        }
                    }
                }
                return false
            };
            sortOrder = docElem.compareDocumentPosition ? function(a, b) {
                if (a === b) {
                    hasDuplicate = true;
                    return 0
                }
                var compare = b.compareDocumentPosition && a.compareDocumentPosition && a.compareDocumentPosition(b);
                if (compare) {
                    if (compare & 1 ||!support.sortDetached && b.compareDocumentPosition(a) === compare) {
                        if (a === doc || contains(preferredDoc, a)) {
                            return - 1
                        }
                        if (b === doc || contains(preferredDoc, b)) {
                            return 1
                        }
                        return sortInput ? indexOf.call(sortInput, a) - indexOf.call(sortInput, b) : 0
                    }
                    return compare & 4?-1 : 1
                }
                return a.compareDocumentPosition?-1 : 1
            } : function(a, b) {
                var cur, i = 0, aup = a.parentNode, bup = b.parentNode, ap = [a], bp = [b];
                if (a === b) {
                    hasDuplicate = true;
                    return 0
                } else if (!aup ||!bup) {
                    return a === doc?-1 : b === doc ? 1 : aup?-1 : bup ? 1 : sortInput ? indexOf.call(sortInput, a) - indexOf.call(sortInput, b) : 0
                } else if (aup === bup) {
                    return siblingCheck(a, b)
                }
                cur = a;
                while (cur = cur.parentNode) {
                    ap.unshift(cur)
                }
                cur = b;
                while (cur = cur.parentNode) {
                    bp.unshift(cur)
                }
                while (ap[i] === bp[i]) {
                    i++
                }
                return i ? siblingCheck(ap[i], bp[i]) : ap[i] === preferredDoc?-1 : bp[i] === preferredDoc ? 1 : 0
            };
            return doc
        };
        Sizzle.matches = function(expr, elements) {
            return Sizzle(expr, null, null, elements)
        };
        Sizzle.matchesSelector = function(elem, expr) {
            if ((elem.ownerDocument || elem) !== document) {
                setDocument(elem)
            }
            expr = expr.replace(rattributeQuotes, "='$1']");
            if (support.matchesSelector && documentIsHTML && (!rbuggyMatches ||!rbuggyMatches.test(expr)) && (!rbuggyQSA ||!rbuggyQSA.test(expr))) {
                try {
                    var ret = matches.call(elem, expr);
                    if (ret || support.disconnectedMatch || elem.document && elem.document.nodeType !== 11) {
                        return ret
                    }
                } catch (e) {}
            }
            return Sizzle(expr, document, null, [elem]).length > 0
        };
        Sizzle.contains = function(context, elem) {
            if ((context.ownerDocument || context) !== document) {
                setDocument(context)
            }
            return contains(context, elem)
        };
        Sizzle.attr = function(elem, name) {
            if ((elem.ownerDocument || elem) !== document) {
                setDocument(elem)
            }
            var fn = Expr.attrHandle[name.toLowerCase()], val = fn && hasOwn.call(Expr.attrHandle, name.toLowerCase()) ? fn(elem, name, !documentIsHTML): undefined;
            return val === undefined ? support.attributes ||!documentIsHTML ? elem.getAttribute(name) : (val = elem.getAttributeNode(name)) && val.specified ? val.value : null : val
        };
        Sizzle.error = function(msg) {
            throw new Error("Syntax error, unrecognized expression: " + msg)
        };
        Sizzle.uniqueSort = function(results) {
            var elem, duplicates = [], j = 0, i = 0;
            hasDuplicate=!support.detectDuplicates;
            sortInput=!support.sortStable && results.slice(0);
            results.sort(sortOrder);
            if (hasDuplicate) {
                while (elem = results[i++]) {
                    if (elem === results[i]) {
                        j = duplicates.push(i)
                    }
                }
                while (j--) {
                    results.splice(duplicates[j], 1)
                }
            }
            return results
        };
        getText = Sizzle.getText = function(elem) {
            var node, ret = "", i = 0, nodeType = elem.nodeType;
            if (!nodeType) {
                for (; node = elem[i]; i++) {
                    ret += getText(node)
                }
            } else if (nodeType === 1 || nodeType === 9 || nodeType === 11) {
                if (typeof elem.textContent === "string") {
                    return elem.textContent
                } else {
                    for (elem = elem.firstChild; elem; elem = elem.nextSibling) {
                        ret += getText(elem)
                    }
                }
            } else if (nodeType === 3 || nodeType === 4) {
                return elem.nodeValue
            }
            return ret
        };
        Expr = Sizzle.selectors = {
            cacheLength: 50,
            createPseudo: markFunction,
            match: matchExpr,
            attrHandle: {},
            find: {},
            relative: {
                ">": {
                    dir: "parentNode",
                    first: true
                },
                " ": {
                    dir: "parentNode"
                },
                "+": {
                    dir: "previousSibling",
                    first: true
                },
                "~": {
                    dir: "previousSibling"
                }
            },
            preFilter: {
                ATTR: function(match) {
                    match[1] = match[1].replace(runescape, funescape);
                    match[3] = (match[4] || match[5] || "").replace(runescape, funescape);
                    if (match[2] === "~=") {
                        match[3] = " " + match[3] + " "
                    }
                    return match.slice(0, 4)
                },
                CHILD: function(match) {
                    match[1] = match[1].toLowerCase();
                    if (match[1].slice(0, 3) === "nth") {
                        if (!match[3]) {
                            Sizzle.error(match[0])
                        }
                        match[4] =+ (match[4] ? match[5] + (match[6] || 1) : 2 * (match[3] === "even" || match[3] === "odd"));
                        match[5] =+ (match[7] + match[8] || match[3] === "odd")
                    } else if (match[3]) {
                        Sizzle.error(match[0])
                    }
                    return match
                },
                PSEUDO: function(match) {
                    var excess, unquoted=!match[5] && match[2];
                    if (matchExpr["CHILD"].test(match[0])) {
                        return null
                    }
                    if (match[3] && match[4] !== undefined) {
                        match[2] = match[4]
                    } else if (unquoted && rpseudo.test(unquoted) && (excess = tokenize(unquoted, true)) && (excess = unquoted.indexOf(")", unquoted.length - excess) - unquoted.length)) {
                        match[0] = match[0].slice(0, excess);
                        match[2] = unquoted.slice(0, excess)
                    }
                    return match.slice(0, 3)
                }
            },
            filter: {
                TAG: function(nodeNameSelector) {
                    var nodeName = nodeNameSelector.replace(runescape, funescape).toLowerCase();
                    return nodeNameSelector === "*" ? function() {
                        return true
                    } : function(elem) {
                        return elem.nodeName && elem.nodeName.toLowerCase() === nodeName
                    }
                },
                CLASS: function(className) {
                    var pattern = classCache[className + " "];
                    return pattern || (pattern = new RegExp("(^|" + whitespace + ")" + className + "(" + whitespace + "|$)")) && classCache(className, function(elem) {
                        return pattern.test(typeof elem.className === "string" && elem.className || typeof elem.getAttribute !== strundefined && elem.getAttribute("class") || "")
                    })
                },
                ATTR: function(name, operator, check) {
                    return function(elem) {
                        var result = Sizzle.attr(elem, name);
                        if (result == null) {
                            return operator === "!="
                        }
                        if (!operator) {
                            return true
                        }
                        result += "";
                        return operator === "=" ? result === check : operator === "!=" ? result !== check : operator === "^=" ? check && result.indexOf(check) === 0 : operator === "*=" ? check && result.indexOf(check)>-1 : operator === "$=" ? check && result.slice( - check.length) === check : operator === "~=" ? (" " + result + " ").indexOf(check)>-1 : operator === "|=" ? result === check || result.slice(0, check.length + 1) === check + "-" : false
                    }
                },
                CHILD: function(type, what, argument, first, last) {
                    var simple = type.slice(0, 3) !== "nth", forward = type.slice( - 4) !== "last", ofType = what === "of-type";
                    return first === 1 && last === 0 ? function(elem) {
                        return !!elem.parentNode
                    } : function(elem, context, xml) {
                        var cache, outerCache, node, diff, nodeIndex, start, dir = simple !== forward ? "nextSibling": "previousSibling", parent = elem.parentNode, name = ofType && elem.nodeName.toLowerCase(), useCache=!xml&&!ofType;
                        if (parent) {
                            if (simple) {
                                while (dir) {
                                    node = elem;
                                    while (node = node[dir]) {
                                        if (ofType ? node.nodeName.toLowerCase() === name : node.nodeType === 1) {
                                            return false
                                        }
                                    }
                                    start = dir = type === "only"&&!start && "nextSibling"
                                }
                                return true
                            }
                            start = [forward ? parent.firstChild: parent.lastChild];
                            if (forward && useCache) {
                                outerCache = parent[expando] || (parent[expando] = {});
                                cache = outerCache[type] || [];
                                nodeIndex = cache[0] === dirruns && cache[1];
                                diff = cache[0] === dirruns && cache[2];
                                node = nodeIndex && parent.childNodes[nodeIndex];
                                while (node=++nodeIndex && node && node[dir] || (diff = nodeIndex = 0) || start.pop()
                                    ) {
                                    if (node.nodeType === 1&&++diff && node === elem) {
                                        outerCache[type] = [dirruns, nodeIndex, diff];
                                        break
                                    }
                                }
                            } else if (useCache && (cache = (elem[expando] || (elem[expando] = {}))[type]) && cache[0] === dirruns) {
                                diff = cache[1]
                            } else {
                                while (node=++nodeIndex && node && node[dir] || (diff = nodeIndex = 0) || start.pop()
                                    ) {
                                    if ((ofType ? node.nodeName.toLowerCase() === name : node.nodeType === 1)&&++diff) {
                                        if (useCache) {
                                            (node[expando] || (node[expando] = {}))[type] = [dirruns, diff]
                                        }
                                        if (node === elem) {
                                            break
                                        }
                                    }
                                }
                            }
                            diff -= last;
                            return diff === first || diff%first === 0 && diff / first >= 0
                        }
                    }
                },
                PSEUDO: function(pseudo, argument) {
                    var args, fn = Expr.pseudos[pseudo] || Expr.setFilters[pseudo.toLowerCase()] || Sizzle.error("unsupported pseudo: " + pseudo);
                    if (fn[expando]) {
                        return fn(argument)
                    }
                    if (fn.length > 1) {
                        args = [pseudo, pseudo, "", argument];
                        return Expr.setFilters.hasOwnProperty(pseudo.toLowerCase()) ? markFunction(function(seed, matches) {
                            var idx, matched = fn(seed, argument), i = matched.length;
                            while (i--) {
                                idx = indexOf.call(seed, matched[i]);
                                seed[idx]=!(matches[idx] = matched[i])
                            }
                        }) : function(elem) {
                            return fn(elem, 0, args)
                        }
                    }
                    return fn
                }
            },
            pseudos: {
                not: markFunction(function(selector) {
                    var input = [], results = [], matcher = compile(selector.replace(rtrim, "$1"));
                    return matcher[expando] ? markFunction(function(seed, matches, context, xml) {
                        var elem, unmatched = matcher(seed, null, xml, []), i = seed.length;
                        while (i--) {
                            if (elem = unmatched[i]) {
                                seed[i]=!(matches[i] = elem)
                            }
                        }
                    }) : function(elem, context, xml) {
                        input[0] = elem;
                        matcher(input, null, xml, results);
                        return !results.pop()
                    }
                }),
                has: markFunction(function(selector) {
                    return function(elem) {
                        return Sizzle(selector, elem).length > 0
                    }
                }),
                contains: markFunction(function(text) {
                    return function(elem) {
                        return (elem.textContent || elem.innerText || getText(elem)).indexOf(text)>-1
                    }
                }),
                lang: markFunction(function(lang) {
                    if (!ridentifier.test(lang || "")) {
                        Sizzle.error("unsupported lang: " + lang)
                    }
                    lang = lang.replace(runescape, funescape).toLowerCase();
                    return function(elem) {
                        var elemLang;
                        do {
                            if (elemLang = documentIsHTML ? elem.lang : elem.getAttribute("xml:lang") || elem.getAttribute("lang")) {
                                elemLang = elemLang.toLowerCase();
                                return elemLang === lang || elemLang.indexOf(lang + "-") === 0
                            }
                        }
                        while ((elem = elem.parentNode) && elem.nodeType === 1);
                        return false
                    }
                }),
                target: function(elem) {
                    var hash = window.location && window.location.hash;
                    return hash && hash.slice(1) === elem.id
                },
                root: function(elem) {
                    return elem === docElem
                },
                focus: function(elem) {
                    return elem === document.activeElement && (!document.hasFocus || document.hasFocus())&&!!(elem.type || elem.href||~elem.tabIndex)
                },
                enabled: function(elem) {
                    return elem.disabled === false
                },
                disabled: function(elem) {
                    return elem.disabled === true
                },
                checked: function(elem) {
                    var nodeName = elem.nodeName.toLowerCase();
                    return nodeName === "input"&&!!elem.checked || nodeName === "option"&&!!elem.selected
                },
                selected: function(elem) {
                    if (elem.parentNode) {
                        elem.parentNode.selectedIndex
                    }
                    return elem.selected === true
                },
                empty: function(elem) {
                    for (elem = elem.firstChild; elem; elem = elem.nextSibling) {
                        if (elem.nodeName > "@" || elem.nodeType === 3 || elem.nodeType === 4) {
                            return false
                        }
                    }
                    return true
                },
                parent: function(elem) {
                    return !Expr.pseudos["empty"](elem)
                },
                header: function(elem) {
                    return rheader.test(elem.nodeName)
                },
                input: function(elem) {
                    return rinputs.test(elem.nodeName)
                },
                button: function(elem) {
                    var name = elem.nodeName.toLowerCase();
                    return name === "input" && elem.type === "button" || name === "button"
                },
                text: function(elem) {
                    var attr;
                    return elem.nodeName.toLowerCase() === "input" && elem.type === "text" && ((attr = elem.getAttribute("type")) == null || attr.toLowerCase() === elem.type)
                },
                first: createPositionalPseudo(function() {
                    return [0]
                }),
                last: createPositionalPseudo(function(matchIndexes, length) {
                    return [length - 1]
                }),
                eq: createPositionalPseudo(function(matchIndexes, length, argument) {
                    return [argument < 0 ? argument + length: argument]
                }),
                even: createPositionalPseudo(function(matchIndexes, length) {
                    var i = 0;
                    for (; i < length; i += 2) {
                        matchIndexes.push(i)
                    }
                    return matchIndexes
                }),
                odd: createPositionalPseudo(function(matchIndexes, length) {
                    var i = 1;
                    for (; i < length; i += 2) {
                        matchIndexes.push(i)
                    }
                    return matchIndexes
                }),
                lt: createPositionalPseudo(function(matchIndexes, length, argument) {
                    var i = argument < 0 ? argument + length: argument;
                    for (; --i >= 0;) {
                        matchIndexes.push(i)
                    }
                    return matchIndexes
                }),
                gt: createPositionalPseudo(function(matchIndexes, length, argument) {
                    var i = argument < 0 ? argument + length: argument;
                    for (; ++i < length;) {
                        matchIndexes.push(i)
                    }
                    return matchIndexes
                })
            }
        };
        Expr.pseudos["nth"] = Expr.pseudos["eq"];
        for (i in{
            radio: true,
            checkbox: true,
            file: true,
            password: true,
            image: true
        }) {
            Expr.pseudos[i] = createInputPseudo(i)
        }
        for (i in{
            submit: true,
            reset: true
        }) {
            Expr.pseudos[i] = createButtonPseudo(i)
        }
        function setFilters() {}
        setFilters.prototype = Expr.filters = Expr.pseudos;
        Expr.setFilters = new setFilters;
        function tokenize(selector, parseOnly) {
            var matched, match, tokens, type, soFar, groups, preFilters, cached = tokenCache[selector + " "];
            if (cached) {
                return parseOnly ? 0 : cached.slice(0)
            }
            soFar = selector;
            groups = [];
            preFilters = Expr.preFilter;
            while (soFar) {
                if (!matched || (match = rcomma.exec(soFar))) {
                    if (match) {
                        soFar = soFar.slice(match[0].length) || soFar
                    }
                    groups.push(tokens = [])
                }
                matched = false;
                if (match = rcombinators.exec(soFar)) {
                    matched = match.shift();
                    tokens.push({
                        value: matched,
                        type: match[0].replace(rtrim, " ")
                    });
                    soFar = soFar.slice(matched.length)
                }
                for (type in Expr.filter) {
                    if ((match = matchExpr[type].exec(soFar)) && (!preFilters[type] || (match = preFilters[type](match)))) {
                        matched = match.shift();
                        tokens.push({
                            value: matched,
                            type: type,
                            matches: match
                        });
                        soFar = soFar.slice(matched.length)
                    }
                }
                if (!matched) {
                    break
                }
            }
            return parseOnly ? soFar.length : soFar ? Sizzle.error(selector) : tokenCache(selector, groups).slice(0)
        }
        function toSelector(tokens) {
            var i = 0, len = tokens.length, selector = "";
            for (; i < len; i++) {
                selector += tokens[i].value
            }
            return selector
        }
        function addCombinator(matcher, combinator, base) {
            var dir = combinator.dir, checkNonElements = base && dir === "parentNode", doneName = done++;
            return combinator.first ? function(elem, context, xml) {
                while (elem = elem[dir]) {
                    if (elem.nodeType === 1 || checkNonElements) {
                        return matcher(elem, context, xml)
                    }
                }
            } : function(elem, context, xml) {
                var data, cache, outerCache, dirkey = dirruns + " " + doneName;
                if (xml) {
                    while (elem = elem[dir]) {
                        if (elem.nodeType === 1 || checkNonElements) {
                            if (matcher(elem, context, xml)) {
                                return true
                            }
                        }
                    }
                } else {
                    while (elem = elem[dir]) {
                        if (elem.nodeType === 1 || checkNonElements) {
                            outerCache = elem[expando] || (elem[expando] = {});
                            if ((cache = outerCache[dir]) && cache[0] === dirkey) {
                                if ((data = cache[1]) === true || data === cachedruns) {
                                    return data === true
                                }
                            } else {
                                cache = outerCache[dir] = [dirkey];
                                cache[1] = matcher(elem, context, xml) || cachedruns;
                                if (cache[1] === true) {
                                    return true
                                }
                            }
                        }
                    }
                }
            }
        }
        function elementMatcher(matchers) {
            return matchers.length > 1 ? function(elem, context, xml) {
                var i = matchers.length;
                while (i--) {
                    if (!matchers[i](elem, context, xml)) {
                        return false
                    }
                }
                return true
            } : matchers[0]
        }
        function condense(unmatched, map, filter, context, xml) {
            var elem, newUnmatched = [], i = 0, len = unmatched.length, mapped = map != null;
            for (; i < len; i++) {
                if (elem = unmatched[i]) {
                    if (!filter || filter(elem, context, xml)) {
                        newUnmatched.push(elem);
                        if (mapped) {
                            map.push(i)
                        }
                    }
                }
            }
            return newUnmatched
        }
        function setMatcher(preFilter, selector, matcher, postFilter, postFinder, postSelector) {
            if (postFilter&&!postFilter[expando]) {
                postFilter = setMatcher(postFilter)
            }
            if (postFinder&&!postFinder[expando]) {
                postFinder = setMatcher(postFinder, postSelector)
            }
            return markFunction(function(seed, results, context, xml) {
                var temp, i, elem, preMap = [], postMap = [], preexisting = results.length, elems = seed || multipleContexts(selector || "*", context.nodeType ? [context] : context, []), matcherIn = preFilter && (seed ||!selector) ? condense(elems, preMap, preFilter, context, xml): elems, matcherOut = matcher ? postFinder || (seed ? preFilter : preexisting || postFilter) ? []: results: matcherIn;
                if (matcher) {
                    matcher(matcherIn, matcherOut, context, xml)
                }
                if (postFilter) {
                    temp = condense(matcherOut, postMap);
                    postFilter(temp, [], context, xml);
                    i = temp.length;
                    while (i--) {
                        if (elem = temp[i]) {
                            matcherOut[postMap[i]]=!(matcherIn[postMap[i]] = elem)
                        }
                    }
                }
                if (seed) {
                    if (postFinder || preFilter) {
                        if (postFinder) {
                            temp = [];
                            i = matcherOut.length;
                            while (i--) {
                                if (elem = matcherOut[i]) {
                                    temp.push(matcherIn[i] = elem)
                                }
                            }
                            postFinder(null, matcherOut = [], temp, xml)
                        }
                        i = matcherOut.length;
                        while (i--) {
                            if ((elem = matcherOut[i]) && (temp = postFinder ? indexOf.call(seed, elem) : preMap[i])>-1) {
                                seed[temp]=!(results[temp] = elem)
                            }
                        }
                    }
                } else {
                    matcherOut = condense(matcherOut === results ? matcherOut.splice(preexisting, matcherOut.length) : matcherOut);
                    if (postFinder) {
                        postFinder(null, results, matcherOut, xml)
                    } else {
                        push.apply(results, matcherOut)
                    }
                }
            })
        }
        function matcherFromTokens(tokens) {
            var checkContext, matcher, j, len = tokens.length, leadingRelative = Expr.relative[tokens[0].type], implicitRelative = leadingRelative || Expr.relative[" "], i = leadingRelative ? 1: 0, matchContext = addCombinator(function(elem) {
                return elem === checkContext
            }, implicitRelative, true), matchAnyContext = addCombinator(function(elem) {
                return indexOf.call(checkContext, elem)>-1
            }, implicitRelative, true), matchers = [function(elem, context, xml) {
                return !leadingRelative && (xml || context !== outermostContext) || ((checkContext = context).nodeType ? matchContext(elem, context, xml) : matchAnyContext(elem, context, xml))
            }
            ];
            for (; i < len; i++) {
                if (matcher = Expr.relative[tokens[i].type]) {
                    matchers = [addCombinator(elementMatcher(matchers), matcher)]
                } else {
                    matcher = Expr.filter[tokens[i].type].apply(null, tokens[i].matches);
                    if (matcher[expando]) {
                        j=++i;
                        for (; j < len; j++) {
                            if (Expr.relative[tokens[j].type]) {
                                break
                            }
                        }
                        return setMatcher(i > 1 && elementMatcher(matchers), i > 1 && toSelector(tokens.slice(0, i - 1).concat({
                            value: tokens[i - 2].type === " " ? "*": ""
                        })).replace(rtrim, "$1"), matcher, i < j && matcherFromTokens(tokens.slice(i, j)), j < len && matcherFromTokens(tokens = tokens.slice(j)), j < len && toSelector(tokens))
                    }
                    matchers.push(matcher)
                }
            }
            return elementMatcher(matchers)
        }
        function matcherFromGroupMatchers(elementMatchers, setMatchers) {
            var matcherCachedRuns = 0, bySet = setMatchers.length > 0, byElement = elementMatchers.length > 0, superMatcher = function(seed, context, xml, results, expandContext) {
                var elem, j, matcher, setMatched = [], matchedCount = 0, i = "0", unmatched = seed && [], outermost = expandContext != null, contextBackup = outermostContext, elems = seed || byElement && Expr.find["TAG"]("*", expandContext && context.parentNode || context), dirrunsUnique = dirruns += contextBackup == null ? 1: Math.random() || .1;
                if (outermost) {
                    outermostContext = context !== document && context;
                    cachedruns = matcherCachedRuns
                }
                for (; (elem = elems[i]) != null; i++) {
                    if (byElement && elem) {
                        j = 0;
                        while (matcher = elementMatchers[j++]) {
                            if (matcher(elem, context, xml)) {
                                results.push(elem);
                                break
                            }
                        }
                        if (outermost) {
                            dirruns = dirrunsUnique;
                            cachedruns=++matcherCachedRuns
                        }
                    }
                    if (bySet) {
                        if (elem=!matcher && elem) {
                            matchedCount--
                        }
                        if (seed) {
                            unmatched.push(elem)
                        }
                    }
                }
                matchedCount += i;
                if (bySet && i !== matchedCount) {
                    j = 0;
                    while (matcher = setMatchers[j++]) {
                        matcher(unmatched, setMatched, context, xml)
                    }
                    if (seed) {
                        if (matchedCount > 0) {
                            while (i--) {
                                if (!(unmatched[i] || setMatched[i])) {
                                    setMatched[i] = pop.call(results)
                                }
                            }
                        }
                        setMatched = condense(setMatched)
                    }
                    push.apply(results, setMatched);
                    if (outermost&&!seed && setMatched.length > 0 && matchedCount + setMatchers.length > 1) {
                        Sizzle.uniqueSort(results)
                    }
                }
                if (outermost) {
                    dirruns = dirrunsUnique;
                    outermostContext = contextBackup
                }
                return unmatched
            };
            return bySet ? markFunction(superMatcher) : superMatcher
        }
        compile = Sizzle.compile = function(selector, group) {
            var i, setMatchers = [], elementMatchers = [], cached = compilerCache[selector + " "];
            if (!cached) {
                if (!group) {
                    group = tokenize(selector)
                }
                i = group.length;
                while (i--) {
                    cached = matcherFromTokens(group[i]);
                    if (cached[expando]) {
                        setMatchers.push(cached)
                    } else {
                        elementMatchers.push(cached)
                    }
                }
                cached = compilerCache(selector, matcherFromGroupMatchers(elementMatchers, setMatchers))
            }
            return cached
        };
        function multipleContexts(selector, contexts, results) {
            var i = 0, len = contexts.length;
            for (; i < len; i++) {
                Sizzle(selector, contexts[i], results)
            }
            return results
        }
        function select(selector, context, results, seed) {
            var i, tokens, token, type, find, match = tokenize(selector);
            if (!seed) {
                if (match.length === 1) {
                    tokens = match[0] = match[0].slice(0);
                    if (tokens.length > 2 && (token = tokens[0]).type === "ID" && support.getById && context.nodeType === 9 && documentIsHTML && Expr.relative[tokens[1].type]) {
                        context = (Expr.find["ID"](token.matches[0].replace(runescape, funescape), context) || [])[0];
                        if (!context) {
                            return results
                        }
                        selector = selector.slice(tokens.shift().value.length)
                    }
                    i = matchExpr["needsContext"].test(selector) ? 0 : tokens.length;
                    while (i--) {
                        token = tokens[i];
                        if (Expr.relative[type = token.type]) {
                            break
                        }
                        if (find = Expr.find[type]) {
                            if (seed = find(token.matches[0].replace(runescape, funescape), rsibling.test(tokens[0].type) && context.parentNode || context)) {
                                tokens.splice(i, 1);
                                selector = seed.length && toSelector(tokens);
                                if (!selector) {
                                    push.apply(results, seed);
                                    return results
                                }
                                break
                            }
                        }
                    }
                }
            }
            compile(selector, match)(seed, context, !documentIsHTML, results, rsibling.test(selector));
            return results
        }
        support.sortStable = expando.split("").sort(sortOrder).join("") === expando;
        support.detectDuplicates = hasDuplicate;
        setDocument();
        support.sortDetached = assert(function(div1) {
            return div1.compareDocumentPosition(document.createElement("div")) & 1
        });
        if (!assert(function(div) {
            div.innerHTML = "<a href='#'></a>";
            return div.firstChild.getAttribute("href") === "#"
        })) {
            addHandle("type|href|height|width", function(elem, name, isXML) {
                if (!isXML) {
                    return elem.getAttribute(name, name.toLowerCase() === "type" ? 1 : 2)
                }
            })
        }
        if (!support.attributes ||!assert(function(div) {
            div.innerHTML = "<input/>";
            div.firstChild.setAttribute("value", "");
            return div.firstChild.getAttribute("value") === ""
        })) {
            addHandle("value", function(elem, name, isXML) {
                if (!isXML && elem.nodeName.toLowerCase() === "input") {
                    return elem.defaultValue
                }
            })
        }
        if (!assert(function(div) {
            return div.getAttribute("disabled") == null
        })) {
            addHandle(booleans, function(elem, name, isXML) {
                var val;
                if (!isXML) {
                    return (val = elem.getAttributeNode(name)) && val.specified ? val.value : elem[name] === true ? name.toLowerCase() : null
                }
            })
        }
        jQuery.find = Sizzle;
        jQuery.expr = Sizzle.selectors;
        jQuery.expr[":"] = jQuery.expr.pseudos;
        jQuery.unique = Sizzle.uniqueSort;
        jQuery.text = Sizzle.getText;
        jQuery.isXMLDoc = Sizzle.isXML;
        jQuery.contains = Sizzle.contains
    })(window);
    var optionsCache = {};
    function createOptions(options) {
        var object = optionsCache[options] = {};
        jQuery.each(options.match(core_rnotwhite) || [], function(_, flag) {
            object[flag] = true
        });
        return object
    }
    jQuery.Callbacks = function(options) {
        options = typeof options === "string" ? optionsCache[options] || createOptions(options) : jQuery.extend({}, options);
        var memory, fired, firing, firingStart, firingLength, firingIndex, list = [], stack=!options.once && [], fire = function(data) {
            memory = options.memory && data;
            fired = true;
            firingIndex = firingStart || 0;
            firingStart = 0;
            firingLength = list.length;
            firing = true;
            for (; list && firingIndex < firingLength; firingIndex++) {
                if (list[firingIndex].apply(data[0], data[1]) === false && options.stopOnFalse) {
                    memory = false;
                    break
                }
            }
            firing = false;
            if (list) {
                if (stack) {
                    if (stack.length) {
                        fire(stack.shift())
                    }
                } else if (memory) {
                    list = []
                } else {
                    self.disable()
                }
            }
        }, self = {
            add: function() {
                if (list) {
                    var start = list.length;
                    (function add(args) {
                        jQuery.each(args, function(_, arg) {
                            var type = jQuery.type(arg);
                            if (type === "function") {
                                if (!options.unique ||!self.has(arg)) {
                                    list.push(arg)
                                }
                            } else if (arg && arg.length && type !== "string") {
                                add(arg)
                            }
                        })
                    })(arguments);
                    if (firing) {
                        firingLength = list.length
                    } else if (memory) {
                        firingStart = start;
                        fire(memory)
                    }
                }
                return this
            },
            remove: function() {
                if (list) {
                    jQuery.each(arguments, function(_, arg) {
                        var index;
                        while ((index = jQuery.inArray(arg, list, index))>-1) {
                            list.splice(index, 1);
                            if (firing) {
                                if (index <= firingLength) {
                                    firingLength--
                                }
                                if (index <= firingIndex) {
                                    firingIndex--
                                }
                            }
                        }
                    })
                }
                return this
            },
            has: function(fn) {
                return fn ? jQuery.inArray(fn, list)>-1 : !!(list && list.length)
            },
            empty: function() {
                list = [];
                firingLength = 0;
                return this
            },
            disable: function() {
                list = stack = memory = undefined;
                return this
            },
            disabled: function() {
                return !list
            },
            lock: function() {
                stack = undefined;
                if (!memory) {
                    self.disable()
                }
                return this
            },
            locked: function() {
                return !stack
            },
            fireWith: function(context, args) {
                if (list && (!fired || stack)) {
                    args = args || [];
                    args = [context, args.slice ? args.slice(): args];
                    if (firing) {
                        stack.push(args)
                    } else {
                        fire(args)
                    }
                }
                return this
            },
            fire: function() {
                self.fireWith(this, arguments);
                return this
            },
            fired: function() {
                return !!fired
            }
        };
        return self
    };
    jQuery.extend({
        Deferred: function(func) {
            var tuples = [["resolve", "done", jQuery.Callbacks("once memory"), "resolved"], ["reject", "fail", jQuery.Callbacks("once memory"), "rejected"], ["notify", "progress", jQuery.Callbacks("memory")]], state = "pending", promise = {
                state: function() {
                    return state
                },
                always: function() {
                    deferred.done(arguments).fail(arguments);
                    return this
                },
                then: function() {
                    var fns = arguments;
                    return jQuery.Deferred(function(newDefer) {
                        jQuery.each(tuples, function(i, tuple) {
                            var action = tuple[0], fn = jQuery.isFunction(fns[i]) && fns[i];
                            deferred[tuple[1]](function() {
                                var returned = fn && fn.apply(this, arguments);
                                if (returned && jQuery.isFunction(returned.promise)) {
                                    returned.promise().done(newDefer.resolve).fail(newDefer.reject).progress(newDefer.notify)
                                } else {
                                    newDefer[action + "With"](this === promise ? newDefer.promise() : this, fn ? [returned] : arguments)
                                }
                            })
                        });
                        fns = null
                    }).promise()
                },
                promise: function(obj) {
                    return obj != null ? jQuery.extend(obj, promise) : promise
                }
            }, deferred = {};
            promise.pipe = promise.then;
            jQuery.each(tuples, function(i, tuple) {
                var list = tuple[2], stateString = tuple[3];
                promise[tuple[1]] = list.add;
                if (stateString) {
                    list.add(function() {
                        state = stateString
                    }, tuples[i^1][2].disable, tuples[2][2].lock)
                }
                deferred[tuple[0]] = function() {
                    deferred[tuple[0] + "With"](this === deferred ? promise : this, arguments);
                    return this
                };
                deferred[tuple[0] + "With"] = list.fireWith
            });
            promise.promise(deferred);
            if (func) {
                func.call(deferred, deferred)
            }
            return deferred
        },
        when: function(subordinate) {
            var i = 0, resolveValues = core_slice.call(arguments), length = resolveValues.length, remaining = length !== 1 || subordinate && jQuery.isFunction(subordinate.promise) ? length: 0, deferred = remaining === 1 ? subordinate: jQuery.Deferred(), updateFunc = function(i, contexts, values) {
                return function(value) {
                    contexts[i] = this;
                    values[i] = arguments.length > 1 ? core_slice.call(arguments) : value;
                    if (values === progressValues) {
                        deferred.notifyWith(contexts, values)
                    } else if (!--remaining) {
                        deferred.resolveWith(contexts, values)
                    }
                }
            }, progressValues, progressContexts, resolveContexts;
            if (length > 1) {
                progressValues = new Array(length);
                progressContexts = new Array(length);
                resolveContexts = new Array(length);
                for (; i < length; i++) {
                    if (resolveValues[i] && jQuery.isFunction(resolveValues[i].promise)) {
                        resolveValues[i].promise().done(updateFunc(i, resolveContexts, resolveValues)).fail(deferred.reject).progress(updateFunc(i, progressContexts, progressValues))
                    } else {
                        --remaining
                    }
                }
            }
            if (!remaining) {
                deferred.resolveWith(resolveContexts, resolveValues)
            }
            return deferred.promise()
        }
    });
    jQuery.support = function(support) {
        var input = document.createElement("input"), fragment = document.createDocumentFragment(), div = document.createElement("div"), select = document.createElement("select"), opt = select.appendChild(document.createElement("option"));
        if (!input.type) {
            return support
        }
        input.type = "checkbox";
        support.checkOn = input.value !== "";
        support.optSelected = opt.selected;
        support.reliableMarginRight = true;
        support.boxSizingReliable = true;
        support.pixelPosition = false;
        input.checked = true;
        support.noCloneChecked = input.cloneNode(true).checked;
        select.disabled = true;
        support.optDisabled=!opt.disabled;
        input = document.createElement("input");
        input.value = "t";
        input.type = "radio";
        support.radioValue = input.value === "t";
        input.setAttribute("checked", "t");
        input.setAttribute("name", "t");
        fragment.appendChild(input);
        support.checkClone = fragment.cloneNode(true).cloneNode(true).lastChild.checked;
        support.focusinBubbles = "onfocusin"in window;
        div.style.backgroundClip = "content-box";
        div.cloneNode(true).style.backgroundClip = "";
        support.clearCloneStyle = div.style.backgroundClip === "content-box";
        jQuery(function() {
            var container, marginDiv, divReset = "padding:0;margin:0;border:0;display:block;-webkit-box-sizing:content-box;-moz-box-sizing:content-box;box-sizing:content-box", body = document.getElementsByTagName("body")[0];
            if (!body) {
                return 
            }
            container = document.createElement("div");
            container.style.cssText = "border:0;width:0;height:0;position:absolute;top:0;left:-9999px;margin-top:1px";
            body.appendChild(container).appendChild(div);
            div.innerHTML = "";
            div.style.cssText = "-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box;padding:1px;border:1px;display:block;width:4px;margin-top:1%;position:absolute;top:1%";
            jQuery.swap(body, body.style.zoom != null ? {
                zoom: 1
            } : {}, function() {
                support.boxSizing = div.offsetWidth === 4
            });
            if (window.getComputedStyle) {
                support.pixelPosition = (window.getComputedStyle(div, null) || {}).top !== "1%";
                support.boxSizingReliable = (window.getComputedStyle(div, null) || {
                    width: "4px"
                }).width === "4px";
                marginDiv = div.appendChild(document.createElement("div"));
                marginDiv.style.cssText = div.style.cssText = divReset;
                marginDiv.style.marginRight = marginDiv.style.width = "0";
                div.style.width = "1px";
                support.reliableMarginRight=!parseFloat((window.getComputedStyle(marginDiv, null) || {}).marginRight)
            }
            body.removeChild(container)
        });
        return support
    }({});
    var data_user, data_priv, rbrace = /(?:\{[\s\S]*\}|\[[\s\S]*\])$/, rmultiDash = /([A-Z])/g;
    function Data() {
        Object.defineProperty(this.cache = {}, 0, {
            get: function() {
                return {}
            }
        });
        this.expando = jQuery.expando + Math.random()
    }
    Data.uid = 1;
    Data.accepts = function(owner) {
        return owner.nodeType ? owner.nodeType === 1 || owner.nodeType === 9 : true
    };
    Data.prototype = {
        key: function(owner) {
            if (!Data.accepts(owner)) {
                return 0
            }
            var descriptor = {}, unlock = owner[this.expando];
            if (!unlock) {
                unlock = Data.uid++;
                try {
                    descriptor[this.expando] = {
                        value: unlock
                    };
                    Object.defineProperties(owner, descriptor)
                } catch (e) {
                    descriptor[this.expando] = unlock;
                    jQuery.extend(owner, descriptor)
                }
            }
            if (!this.cache[unlock]) {
                this.cache[unlock] = {}
            }
            return unlock
        },
        set: function(owner, data, value) {
            var prop, unlock = this.key(owner), cache = this.cache[unlock];
            if (typeof data === "string") {
                cache[data] = value
            } else {
                if (jQuery.isEmptyObject(cache)) {
                    jQuery.extend(this.cache[unlock], data)
                } else {
                    for (prop in data) {
                        cache[prop] = data[prop]
                    }
                }
            }
            return cache
        },
        get: function(owner, key) {
            var cache = this.cache[this.key(owner)];
            return key === undefined ? cache : cache[key]
        },
        access: function(owner, key, value) {
            var stored;
            if (key === undefined || key && typeof key === "string" && value === undefined) {
                stored = this.get(owner, key);
                return stored !== undefined ? stored : this.get(owner, jQuery.camelCase(key))
            }
            this.set(owner, key, value);
            return value !== undefined ? value : key
        },
        remove: function(owner, key) {
            var i, name, camel, unlock = this.key(owner), cache = this.cache[unlock];
            if (key === undefined) {
                this.cache[unlock] = {}
            } else {
                if (jQuery.isArray(key)) {
                    name = key.concat(key.map(jQuery.camelCase))
                } else {
                    camel = jQuery.camelCase(key);
                    if (key in cache) {
                        name = [key, camel]
                    } else {
                        name = camel;
                        name = name in cache ? [name] : name.match(core_rnotwhite) || []
                    }
                }
                i = name.length;
                while (i--) {
                    delete cache[name[i]]
                }
            }
        },
        hasData: function(owner) {
            return !jQuery.isEmptyObject(this.cache[owner[this.expando]] || {})
        },
        discard: function(owner) {
            if (owner[this.expando]) {
                delete this.cache[owner[this.expando]]
            }
        }
    };
    data_user = new Data;
    data_priv = new Data;
    jQuery.extend({
        acceptData: Data.accepts,
        hasData: function(elem) {
            return data_user.hasData(elem) || data_priv.hasData(elem)
        },
        data: function(elem, name, data) {
            return data_user.access(elem, name, data)
        },
        removeData: function(elem, name) {
            data_user.remove(elem, name)
        },
        _data: function(elem, name, data) {
            return data_priv.access(elem, name, data)
        },
        _removeData: function(elem, name) {
            data_priv.remove(elem, name)
        }
    });
    jQuery.fn.extend({
        data: function(key, value) {
            var attrs, name, elem = this[0], i = 0, data = null;
            if (key === undefined) {
                if (this.length) {
                    data = data_user.get(elem);
                    if (elem.nodeType === 1&&!data_priv.get(elem, "hasDataAttrs")) {
                        attrs = elem.attributes;
                        for (; i < attrs.length; i++) {
                            name = attrs[i].name;
                            if (name.indexOf("data-") === 0) {
                                name = jQuery.camelCase(name.slice(5));
                                dataAttr(elem, name, data[name])
                            }
                        }
                        data_priv.set(elem, "hasDataAttrs", true)
                    }
                }
                return data
            }
            if (typeof key === "object") {
                return this.each(function() {
                    data_user.set(this, key)
                })
            }
            return jQuery.access(this, function(value) {
                var data, camelKey = jQuery.camelCase(key);
                if (elem && value === undefined) {
                    data = data_user.get(elem, key);
                    if (data !== undefined) {
                        return data
                    }
                    data = data_user.get(elem, camelKey);
                    if (data !== undefined) {
                        return data
                    }
                    data = dataAttr(elem, camelKey, undefined);
                    if (data !== undefined) {
                        return data
                    }
                    return 
                }
                this.each(function() {
                    var data = data_user.get(this, camelKey);
                    data_user.set(this, camelKey, value);
                    if (key.indexOf("-")!==-1 && data !== undefined) {
                        data_user.set(this, key, value)
                    }
                })
            }, null, value, arguments.length > 1, null, true)
        },
        removeData: function(key) {
            return this.each(function() {
                data_user.remove(this, key)
            })
        }
    });
    function dataAttr(elem, key, data) {
        var name;
        if (data === undefined && elem.nodeType === 1) {
            name = "data-" + key.replace(rmultiDash, "-$1").toLowerCase();
            data = elem.getAttribute(name);
            if (typeof data === "string") {
                try {
                    data = data === "true" ? true : data === "false" ? false : data === "null" ? null : + data + "" === data?+data : rbrace.test(data) ? JSON.parse(data) : data
                } catch (e) {}
                data_user.set(elem, key, data)
            } else {
                data = undefined
            }
        }
        return data
    }
    jQuery.extend({
        queue: function(elem, type, data) {
            var queue;
            if (elem) {
                type = (type || "fx") + "queue";
                queue = data_priv.get(elem, type);
                if (data) {
                    if (!queue || jQuery.isArray(data)) {
                        queue = data_priv.access(elem, type, jQuery.makeArray(data))
                    } else {
                        queue.push(data)
                    }
                }
                return queue || []
            }
        },
        dequeue: function(elem, type) {
            type = type || "fx";
            var queue = jQuery.queue(elem, type), startLength = queue.length, fn = queue.shift(), hooks = jQuery._queueHooks(elem, type), next = function() {
                jQuery.dequeue(elem, type)
            };
            if (fn === "inprogress") {
                fn = queue.shift();
                startLength--
            }
            if (fn) {
                if (type === "fx") {
                    queue.unshift("inprogress")
                }
                delete hooks.stop;
                fn.call(elem, next, hooks)
            }
            if (!startLength && hooks) {
                hooks.empty.fire()
            }
        },
        _queueHooks: function(elem, type) {
            var key = type + "queueHooks";
            return data_priv.get(elem, key) || data_priv.access(elem, key, {
                empty: jQuery.Callbacks("once memory").add(function() {
                    data_priv.remove(elem, [type + "queue", key])
                })
            })
        }
    });
    jQuery.fn.extend({
        queue: function(type, data) {
            var setter = 2;
            if (typeof type !== "string") {
                data = type;
                type = "fx";
                setter--
            }
            if (arguments.length < setter) {
                return jQuery.queue(this[0], type)
            }
            return data === undefined ? this : this.each(function() {
                var queue = jQuery.queue(this, type, data);
                jQuery._queueHooks(this, type);
                if (type === "fx" && queue[0] !== "inprogress") {
                    jQuery.dequeue(this, type)
                }
            })
        },
        dequeue: function(type) {
            return this.each(function() {
                jQuery.dequeue(this, type)
            })
        },
        delay: function(time, type) {
            time = jQuery.fx ? jQuery.fx.speeds[time] || time : time;
            type = type || "fx";
            return this.queue(type, function(next, hooks) {
                var timeout = setTimeout(next, time);
                hooks.stop = function() {
                    clearTimeout(timeout)
                }
            })
        },
        clearQueue: function(type) {
            return this.queue(type || "fx", [])
        },
        promise: function(type, obj) {
            var tmp, count = 1, defer = jQuery.Deferred(), elements = this, i = this.length, resolve = function() {
                if (!--count) {
                    defer.resolveWith(elements, [elements])
                }
            };
            if (typeof type !== "string") {
                obj = type;
                type = undefined
            }
            type = type || "fx";
            while (i--) {
                tmp = data_priv.get(elements[i], type + "queueHooks");
                if (tmp && tmp.empty) {
                    count++;
                    tmp.empty.add(resolve)
                }
            }
            resolve();
            return defer.promise(obj)
        }
    });
    var nodeHook, boolHook, rclass = /[\t\r\n\f]/g, rreturn = /\r/g, rfocusable = /^(?:input|select|textarea|button)$/i;
    jQuery.fn.extend({
        attr: function(name, value) {
            return jQuery.access(this, jQuery.attr, name, value, arguments.length > 1)
        },
        removeAttr: function(name) {
            return this.each(function() {
                jQuery.removeAttr(this, name)
            })
        },
        prop: function(name, value) {
            return jQuery.access(this, jQuery.prop, name, value, arguments.length > 1)
        },
        removeProp: function(name) {
            return this.each(function() {
                delete this[jQuery.propFix[name] || name]
            })
        },
        addClass: function(value) {
            var classes, elem, cur, clazz, j, i = 0, len = this.length, proceed = typeof value === "string" && value;
            if (jQuery.isFunction(value)) {
                return this.each(function(j) {
                    jQuery(this).addClass(value.call(this, j, this.className))
                })
            }
            if (proceed) {
                classes = (value || "").match(core_rnotwhite) || [];
                for (; i < len; i++) {
                    elem = this[i];
                    cur = elem.nodeType === 1 && (elem.className ? (" " + elem.className + " ").replace(rclass, " ") : " ");
                    if (cur) {
                        j = 0;
                        while (clazz = classes[j++]) {
                            if (cur.indexOf(" " + clazz + " ") < 0) {
                                cur += clazz + " "
                            }
                        }
                        elem.className = jQuery.trim(cur)
                    }
                }
            }
            return this
        },
        removeClass: function(value) {
            var classes, elem, cur, clazz, j, i = 0, len = this.length, proceed = arguments.length === 0 || typeof value === "string" && value;
            if (jQuery.isFunction(value)) {
                return this.each(function(j) {
                    jQuery(this).removeClass(value.call(this, j, this.className))
                })
            }
            if (proceed) {
                classes = (value || "").match(core_rnotwhite) || [];
                for (; i < len; i++) {
                    elem = this[i];
                    cur = elem.nodeType === 1 && (elem.className ? (" " + elem.className + " ").replace(rclass, " ") : "");
                    if (cur) {
                        j = 0;
                        while (clazz = classes[j++]) {
                            while (cur.indexOf(" " + clazz + " ") >= 0) {
                                cur = cur.replace(" " + clazz + " ", " ")
                            }
                        }
                        elem.className = value ? jQuery.trim(cur) : ""
                    }
                }
            }
            return this
        },
        toggleClass: function(value, stateVal) {
            var type = typeof value;
            if (typeof stateVal === "boolean" && type === "string") {
                return stateVal ? this.addClass(value) : this.removeClass(value)
            }
            if (jQuery.isFunction(value)) {
                return this.each(function(i) {
                    jQuery(this).toggleClass(value.call(this, i, this.className, stateVal), stateVal)
                })
            }
            return this.each(function() {
                if (type === "string") {
                    var className, i = 0, self = jQuery(this), classNames = value.match(core_rnotwhite) || [];
                    while (className = classNames[i++]) {
                        if (self.hasClass(className)) {
                            self.removeClass(className)
                        } else {
                            self.addClass(className)
                        }
                    }
                } else if (type === core_strundefined || type === "boolean") {
                    if (this.className) {
                        data_priv.set(this, "__className__", this.className)
                    }
                    this.className = this.className || value === false ? "" : data_priv.get(this, "__className__") || ""
                }
            })
        },
        hasClass: function(selector) {
            var className = " " + selector + " ", i = 0, l = this.length;
            for (; i < l; i++) {
                if (this[i].nodeType === 1 && (" " + this[i].className + " ").replace(rclass, " ").indexOf(className) >= 0) {
                    return true
                }
            }
            return false
        },
        val: function(value) {
            var hooks, ret, isFunction, elem = this[0];
            if (!arguments.length) {
                if (elem) {
                    hooks = jQuery.valHooks[elem.type] || jQuery.valHooks[elem.nodeName.toLowerCase()];
                    if (hooks && "get"in hooks && (ret = hooks.get(elem, "value")) !== undefined) {
                        return ret
                    }
                    ret = elem.value;
                    return typeof ret === "string" ? ret.replace(rreturn, "") : ret == null ? "" : ret
                }
                return 
            }
            isFunction = jQuery.isFunction(value);
            return this.each(function(i) {
                var val;
                if (this.nodeType !== 1) {
                    return 
                }
                if (isFunction) {
                    val = value.call(this, i, jQuery(this).val())
                } else {
                    val = value
                }
                if (val == null) {
                    val = ""
                } else if (typeof val === "number") {
                    val += ""
                } else if (jQuery.isArray(val)) {
                    val = jQuery.map(val, function(value) {
                        return value == null ? "" : value + ""
                    })
                }
                hooks = jQuery.valHooks[this.type] || jQuery.valHooks[this.nodeName.toLowerCase()];
                if (!hooks ||!("set"in hooks) || hooks.set(this, val, "value") === undefined) {
                    this.value = val
                }
            })
        }
    });
    jQuery.extend({
        valHooks: {
            option: {
                get: function(elem) {
                    var val = elem.attributes.value;
                    return !val || val.specified ? elem.value : elem.text
                }
            },
            select: {
                get: function(elem) {
                    var value, option, options = elem.options, index = elem.selectedIndex, one = elem.type === "select-one" || index < 0, values = one ? null: [], max = one ? index + 1: options.length, i = index < 0 ? max: one ? index: 0;
                    for (; i < max; i++) {
                        option = options[i];
                        if ((option.selected || i === index) && (jQuery.support.optDisabled?!option.disabled : option.getAttribute("disabled") === null) && (!option.parentNode.disabled ||!jQuery.nodeName(option.parentNode, "optgroup"))
                            ) {
                            value = jQuery(option).val();
                            if (one) {
                                return value
                            }
                            values.push(value)
                        }
                    }
                    return values
                },
                set: function(elem, value) {
                    var optionSet, option, options = elem.options, values = jQuery.makeArray(value), i = options.length;
                    while (i--) {
                        option = options[i];
                        if (option.selected = jQuery.inArray(jQuery(option).val(), values) >= 0) {
                            optionSet = true
                        }
                    }
                    if (!optionSet) {
                        elem.selectedIndex =- 1
                    }
                    return values
                }
            }
        },
        attr: function(elem, name, value) {
            var hooks, ret, nType = elem.nodeType;
            if (!elem || nType === 3 || nType === 8 || nType === 2) {
                return 
            }
            if (typeof elem.getAttribute === core_strundefined) {
                return jQuery.prop(elem, name, value)
            }
            if (nType !== 1 ||!jQuery.isXMLDoc(elem)) {
                name = name.toLowerCase();
                hooks = jQuery.attrHooks[name] || (jQuery.expr.match.bool.test(name) ? boolHook : nodeHook)
            }
            if (value !== undefined) {
                if (value === null) {
                    jQuery.removeAttr(elem, name)
                } else if (hooks && "set"in hooks && (ret = hooks.set(elem, value, name)) !== undefined) {
                    return ret
                } else {
                    elem.setAttribute(name, value + "");
                    return value
                }
            } else if (hooks && "get"in hooks && (ret = hooks.get(elem, name)) !== null) {
                return ret
            } else {
                ret = jQuery.find.attr(elem, name);
                return ret == null ? undefined : ret
            }
        },
        removeAttr: function(elem, value) {
            var name, propName, i = 0, attrNames = value && value.match(core_rnotwhite);
            if (attrNames && elem.nodeType === 1) {
                while (name = attrNames[i++]) {
                    propName = jQuery.propFix[name] || name;
                    if (jQuery.expr.match.bool.test(name)) {
                        elem[propName] = false
                    }
                    elem.removeAttribute(name)
                }
            }
        },
        attrHooks: {
            type: {
                set: function(elem, value) {
                    if (!jQuery.support.radioValue && value === "radio" && jQuery.nodeName(elem, "input")) {
                        var val = elem.value;
                        elem.setAttribute("type", value);
                        if (val) {
                            elem.value = val
                        }
                        return value
                    }
                }
            }
        },
        propFix: {
            "for": "htmlFor",
            "class": "className"
        },
        prop: function(elem, name, value) {
            var ret, hooks, notxml, nType = elem.nodeType;
            if (!elem || nType === 3 || nType === 8 || nType === 2) {
                return 
            }
            notxml = nType !== 1 ||!jQuery.isXMLDoc(elem);
            if (notxml) {
                name = jQuery.propFix[name] || name;
                hooks = jQuery.propHooks[name]
            }
            if (value !== undefined) {
                return hooks && "set"in hooks && (ret = hooks.set(elem, value, name)) !== undefined ? ret : elem[name] = value
            } else {
                return hooks && "get"in hooks && (ret = hooks.get(elem, name)) !== null ? ret : elem[name]
            }
        },
        propHooks: {
            tabIndex: {
                get: function(elem) {
                    return elem.hasAttribute("tabindex") || rfocusable.test(elem.nodeName) || elem.href ? elem.tabIndex : - 1
                }
            }
        }
    });
    boolHook = {
        set: function(elem, value, name) {
            if (value === false) {
                jQuery.removeAttr(elem, name)
            } else {
                elem.setAttribute(name, name)
            }
            return name
        }
    };
    jQuery.each(jQuery.expr.match.bool.source.match(/\w+/g), function(i, name) {
        var getter = jQuery.expr.attrHandle[name] || jQuery.find.attr;
        jQuery.expr.attrHandle[name] = function(elem, name, isXML) {
            var fn = jQuery.expr.attrHandle[name], ret = isXML ? undefined: (jQuery.expr.attrHandle[name] = undefined) != getter(elem, name, isXML) ? name.toLowerCase(): null;
            jQuery.expr.attrHandle[name] = fn;
            return ret
        }
    });
    if (!jQuery.support.optSelected) {
        jQuery.propHooks.selected = {
            get: function(elem) {
                var parent = elem.parentNode;
                if (parent && parent.parentNode) {
                    parent.parentNode.selectedIndex
                }
                return null
            }
        }
    }
    jQuery.each(["tabIndex", "readOnly", "maxLength", "cellSpacing", "cellPadding", "rowSpan", "colSpan", "useMap", "frameBorder", "contentEditable"], function() {
        jQuery.propFix[this.toLowerCase()] = this
    });
    jQuery.each(["radio", "checkbox"], function() {
        jQuery.valHooks[this] = {
            set: function(elem, value) {
                if (jQuery.isArray(value)) {
                    return elem.checked = jQuery.inArray(jQuery(elem).val(), value) >= 0
                }
            }
        };
        if (!jQuery.support.checkOn) {
            jQuery.valHooks[this].get = function(elem) {
                return elem.getAttribute("value") === null ? "on" : elem.value
            }
        }
    });
    var rkeyEvent = /^key/, rmouseEvent = /^(?:mouse|contextmenu)|click/, rfocusMorph = /^(?:focusinfocus|focusoutblur)$/, rtypenamespace = /^([^.]*)(?:\.(.+)|)$/;
    function returnTrue() {
        return true
    }
    function returnFalse() {
        return false
    }
    function safeActiveElement() {
        try {
            return document.activeElement
        } catch (err) {}
    }
    jQuery.event = {
        global: {},
        add: function(elem, types, handler, data, selector) {
            var handleObjIn, eventHandle, tmp, events, t, handleObj, special, handlers, type, namespaces, origType, elemData = data_priv.get(elem);
            if (!elemData) {
                return 
            }
            if (handler.handler) {
                handleObjIn = handler;
                handler = handleObjIn.handler;
                selector = handleObjIn.selector
            }
            if (!handler.guid) {
                handler.guid = jQuery.guid++
            }
            if (!(events = elemData.events)) {
                events = elemData.events = {}
            }
            if (!(eventHandle = elemData.handle)) {
                eventHandle = elemData.handle = function(e) {
                    return typeof jQuery !== core_strundefined && (!e || jQuery.event.triggered !== e.type) ? jQuery.event.dispatch.apply(eventHandle.elem, arguments) : undefined
                };
                eventHandle.elem = elem
            }
            types = (types || "").match(core_rnotwhite) || [""];
            t = types.length;
            while (t--) {
                tmp = rtypenamespace.exec(types[t]) || [];
                type = origType = tmp[1];
                namespaces = (tmp[2] || "").split(".").sort();
                if (!type) {
                    continue
                }
                special = jQuery.event.special[type] || {};
                type = (selector ? special.delegateType : special.bindType) || type;
                special = jQuery.event.special[type] || {};
                handleObj = jQuery.extend({
                    type: type,
                    origType: origType,
                    data: data,
                    handler: handler,
                    guid: handler.guid,
                    selector: selector,
                    needsContext: selector && jQuery.expr.match.needsContext.test(selector),
                    namespace: namespaces.join(".")
                }, handleObjIn);
                if (!(handlers = events[type])) {
                    handlers = events[type] = [];
                    handlers.delegateCount = 0;
                    if (!special.setup || special.setup.call(elem, data, namespaces, eventHandle) === false) {
                        if (elem.addEventListener) {
                            elem.addEventListener(type, eventHandle, false)
                        }
                    }
                }
                if (special.add) {
                    special.add.call(elem, handleObj);
                    if (!handleObj.handler.guid) {
                        handleObj.handler.guid = handler.guid
                    }
                }
                if (selector) {
                    handlers.splice(handlers.delegateCount++, 0, handleObj)
                } else {
                    handlers.push(handleObj)
                }
                jQuery.event.global[type] = true
            }
            elem = null
        },
        remove: function(elem, types, handler, selector, mappedTypes) {
            var j, origCount, tmp, events, t, handleObj, special, handlers, type, namespaces, origType, elemData = data_priv.hasData(elem) && data_priv.get(elem);
            if (!elemData ||!(events = elemData.events)) {
                return 
            }
            types = (types || "").match(core_rnotwhite) || [""];
            t = types.length;
            while (t--) {
                tmp = rtypenamespace.exec(types[t]) || [];
                type = origType = tmp[1];
                namespaces = (tmp[2] || "").split(".").sort();
                if (!type) {
                    for (type in events) {
                        jQuery.event.remove(elem, type + types[t], handler, selector, true)
                    }
                    continue
                }
                special = jQuery.event.special[type] || {};
                type = (selector ? special.delegateType : special.bindType) || type;
                handlers = events[type] || [];
                tmp = tmp[2] && new RegExp("(^|\\.)" + namespaces.join("\\.(?:.*\\.|)") + "(\\.|$)");
                origCount = j = handlers.length;
                while (j--) {
                    handleObj = handlers[j];
                    if ((mappedTypes || origType === handleObj.origType) && (!handler || handler.guid === handleObj.guid) && (!tmp || tmp.test(handleObj.namespace)) && (!selector || selector === handleObj.selector || selector === "**" && handleObj.selector)) {
                        handlers.splice(j, 1);
                        if (handleObj.selector) {
                            handlers.delegateCount--
                        }
                        if (special.remove) {
                            special.remove.call(elem, handleObj)
                        }
                    }
                }
                if (origCount&&!handlers.length) {
                    if (!special.teardown || special.teardown.call(elem, namespaces, elemData.handle) === false) {
                        jQuery.removeEvent(elem, type, elemData.handle)
                    }
                    delete events[type]
                }
            }
            if (jQuery.isEmptyObject(events)) {
                delete elemData.handle;
                data_priv.remove(elem, "events")
            }
        },
        trigger: function(event, data, elem, onlyHandlers) {
            var i, cur, tmp, bubbleType, ontype, handle, special, eventPath = [elem || document], type = core_hasOwn.call(event, "type") ? event.type: event, namespaces = core_hasOwn.call(event, "namespace") ? event.namespace.split("."): [];
            cur = tmp = elem = elem || document;
            if (elem.nodeType === 3 || elem.nodeType === 8) {
                return 
            }
            if (rfocusMorph.test(type + jQuery.event.triggered)) {
                return 
            }
            if (type.indexOf(".") >= 0) {
                namespaces = type.split(".");
                type = namespaces.shift();
                namespaces.sort()
            }
            ontype = type.indexOf(":") < 0 && "on" + type;
            event = event[jQuery.expando] ? event : new jQuery.Event(type, typeof event === "object" && event);
            event.isTrigger = onlyHandlers ? 2 : 3;
            event.namespace = namespaces.join(".");
            event.namespace_re = event.namespace ? new RegExp("(^|\\.)" + namespaces.join("\\.(?:.*\\.|)") + "(\\.|$)") : null;
            event.result = undefined;
            if (!event.target) {
                event.target = elem
            }
            data = data == null ? [event] : jQuery.makeArray(data, [event]);
            special = jQuery.event.special[type] || {};
            if (!onlyHandlers && special.trigger && special.trigger.apply(elem, data) === false) {
                return 
            }
            if (!onlyHandlers&&!special.noBubble&&!jQuery.isWindow(elem)) {
                bubbleType = special.delegateType || type;
                if (!rfocusMorph.test(bubbleType + type)) {
                    cur = cur.parentNode
                }
                for (; cur; cur = cur.parentNode) {
                    eventPath.push(cur);
                    tmp = cur
                }
                if (tmp === (elem.ownerDocument || document)) {
                    eventPath.push(tmp.defaultView || tmp.parentWindow || window)
                }
            }
            i = 0;
            while ((cur = eventPath[i++])&&!event.isPropagationStopped()) {
                event.type = i > 1 ? bubbleType : special.bindType || type;
                handle = (data_priv.get(cur, "events") || {})[event.type] && data_priv.get(cur, "handle");
                if (handle) {
                    handle.apply(cur, data)
                }
                handle = ontype && cur[ontype];
                if (handle && jQuery.acceptData(cur) && handle.apply && handle.apply(cur, data) === false) {
                    event.preventDefault()
                }
            }
            event.type = type;
            if (!onlyHandlers&&!event.isDefaultPrevented()) {
                if ((!special._default || special._default.apply(eventPath.pop(), data) === false) && jQuery.acceptData(elem)) {
                    if (ontype && jQuery.isFunction(elem[type])&&!jQuery.isWindow(elem)) {
                        tmp = elem[ontype];
                        if (tmp) {
                            elem[ontype] = null
                        }
                        jQuery.event.triggered = type;
                        elem[type]();
                        jQuery.event.triggered = undefined;
                        if (tmp) {
                            elem[ontype] = tmp
                        }
                    }
                }
            }
            return event.result
        },
        dispatch: function(event) {
            event = jQuery.event.fix(event);
            var i, j, ret, matched, handleObj, handlerQueue = [], args = core_slice.call(arguments), handlers = (data_priv.get(this, "events") || {})[event.type] || [], special = jQuery.event.special[event.type] || {};
            args[0] = event;
            event.delegateTarget = this;
            if (special.preDispatch && special.preDispatch.call(this, event) === false) {
                return 
            }
            handlerQueue = jQuery.event.handlers.call(this, event, handlers);
            i = 0;
            while ((matched = handlerQueue[i++])&&!event.isPropagationStopped()) {
                event.currentTarget = matched.elem;
                j = 0;
                while ((handleObj = matched.handlers[j++])&&!event.isImmediatePropagationStopped()) {
                    if (!event.namespace_re || event.namespace_re.test(handleObj.namespace)) {
                        event.handleObj = handleObj;
                        event.data = handleObj.data;
                        ret = ((jQuery.event.special[handleObj.origType] || {}).handle || handleObj.handler).apply(matched.elem, args);
                        if (ret !== undefined) {
                            if ((event.result = ret) === false) {
                                event.preventDefault();
                                event.stopPropagation()
                            }
                        }
                    }
                }
            }
            if (special.postDispatch) {
                special.postDispatch.call(this, event)
            }
            return event.result
        },
        handlers: function(event, handlers) {
            var i, matches, sel, handleObj, handlerQueue = [], delegateCount = handlers.delegateCount, cur = event.target;
            if (delegateCount && cur.nodeType && (!event.button || event.type !== "click")) {
                for (; cur !== this; cur = cur.parentNode || this) {
                    if (cur.disabled !== true || event.type !== "click") {
                        matches = [];
                        for (i = 0; i < delegateCount; i++) {
                            handleObj = handlers[i];
                            sel = handleObj.selector + " ";
                            if (matches[sel] === undefined) {
                                matches[sel] = handleObj.needsContext ? jQuery(sel, this).index(cur) >= 0 : jQuery.find(sel, this, null, [cur]).length
                            }
                            if (matches[sel]) {
                                matches.push(handleObj)
                            }
                        }
                        if (matches.length) {
                            handlerQueue.push({
                                elem: cur,
                                handlers: matches
                            })
                        }
                    }
                }
            }
            if (delegateCount < handlers.length) {
                handlerQueue.push({
                    elem: this,
                    handlers: handlers.slice(delegateCount)
                })
            }
            return handlerQueue
        },
        props: "altKey bubbles cancelable ctrlKey currentTarget eventPhase metaKey relatedTarget shiftKey target timeStamp view which".split(" "),
        fixHooks: {},
        keyHooks: {
            props: "char charCode key keyCode".split(" "),
            filter: function(event, original) {
                if (event.which == null) {
                    event.which = original.charCode != null ? original.charCode : original.keyCode
                }
                return event
            }
        },
        mouseHooks: {
            props: "button buttons clientX clientY offsetX offsetY pageX pageY screenX screenY toElement".split(" "),
            filter: function(event, original) {
                var eventDoc, doc, body, button = original.button;
                if (event.pageX == null && original.clientX != null) {
                    eventDoc = event.target.ownerDocument || document;
                    doc = eventDoc.documentElement;
                    body = eventDoc.body;
                    event.pageX = original.clientX + (doc && doc.scrollLeft || body && body.scrollLeft || 0) - (doc && doc.clientLeft || body && body.clientLeft || 0);
                    event.pageY = original.clientY + (doc && doc.scrollTop || body && body.scrollTop || 0) - (doc && doc.clientTop || body && body.clientTop || 0)
                }
                if (!event.which && button !== undefined) {
                    event.which = button & 1 ? 1 : button & 2 ? 3 : button & 4 ? 2 : 0
                }
                return event
            }
        },
        fix: function(event) {
            if (event[jQuery.expando]) {
                return event
            }
            var i, prop, copy, type = event.type, originalEvent = event, fixHook = this.fixHooks[type];
            if (!fixHook) {
                this.fixHooks[type] = fixHook = rmouseEvent.test(type) ? this.mouseHooks : rkeyEvent.test(type) ? this.keyHooks : {}
            }
            copy = fixHook.props ? this.props.concat(fixHook.props) : this.props;
            event = new jQuery.Event(originalEvent);
            i = copy.length;
            while (i--) {
                prop = copy[i];
                event[prop] = originalEvent[prop]
            }
            if (!event.target) {
                event.target = document
            }
            if (event.target.nodeType === 3) {
                event.target = event.target.parentNode
            }
            return fixHook.filter ? fixHook.filter(event, originalEvent) : event
        },
        special: {
            load: {
                noBubble: true
            },
            focus: {
                trigger: function() {
                    if (this !== safeActiveElement() && this.focus) {
                        this.focus();
                        return false
                    }
                },
                delegateType: "focusin"
            },
            blur: {
                trigger: function() {
                    if (this === safeActiveElement() && this.blur) {
                        this.blur();
                        return false
                    }
                },
                delegateType: "focusout"
            },
            click: {
                trigger: function() {
                    if (this.type === "checkbox" && this.click && jQuery.nodeName(this, "input")) {
                        this.click();
                        return false
                    }
                },
                _default: function(event) {
                    return jQuery.nodeName(event.target, "a")
                }
            },
            beforeunload: {
                postDispatch: function(event) {
                    if (event.result !== undefined) {
                        event.originalEvent.returnValue = event.result
                    }
                }
            }
        },
        simulate: function(type, elem, event, bubble) {
            var e = jQuery.extend(new jQuery.Event, event, {
                type: type,
                isSimulated: true,
                originalEvent: {}
            });
            if (bubble) {
                jQuery.event.trigger(e, null, elem)
            } else {
                jQuery.event.dispatch.call(elem, e)
            }
            if (e.isDefaultPrevented()) {
                event.preventDefault()
            }
        }
    };
    jQuery.removeEvent = function(elem, type, handle) {
        if (elem.removeEventListener) {
            elem.removeEventListener(type, handle, false)
        }
    };
    jQuery.Event = function(src, props) {
        if (!(this instanceof jQuery.Event)) {
            return new jQuery.Event(src, props)
        }
        if (src && src.type) {
            this.originalEvent = src;
            this.type = src.type;
            this.isDefaultPrevented = src.defaultPrevented || src.getPreventDefault && src.getPreventDefault() ? returnTrue : returnFalse
        } else {
            this.type = src
        }
        if (props) {
            jQuery.extend(this, props)
        }
        this.timeStamp = src && src.timeStamp || jQuery.now();
        this[jQuery.expando] = true
    };
    jQuery.Event.prototype = {
        isDefaultPrevented: returnFalse,
        isPropagationStopped: returnFalse,
        isImmediatePropagationStopped: returnFalse,
        preventDefault: function() {
            var e = this.originalEvent;
            this.isDefaultPrevented = returnTrue;
            if (e && e.preventDefault) {
                e.preventDefault()
            }
        },
        stopPropagation: function() {
            var e = this.originalEvent;
            this.isPropagationStopped = returnTrue;
            if (e && e.stopPropagation) {
                e.stopPropagation()
            }
        },
        stopImmediatePropagation: function() {
            this.isImmediatePropagationStopped = returnTrue;
            this.stopPropagation()
        }
    };
    jQuery.each({
        mouseenter: "mouseover",
        mouseleave: "mouseout"
    }, function(orig, fix) {
        jQuery.event.special[orig] = {
            delegateType: fix,
            bindType: fix,
            handle: function(event) {
                var ret, target = this, related = event.relatedTarget, handleObj = event.handleObj;
                if (!related || related !== target&&!jQuery.contains(target, related)) {
                    event.type = handleObj.origType;
                    ret = handleObj.handler.apply(this, arguments);
                    event.type = fix
                }
                return ret
            }
        }
    });
    if (!jQuery.support.focusinBubbles) {
        jQuery.each({
            focus: "focusin",
            blur: "focusout"
        }, function(orig, fix) {
            var attaches = 0, handler = function(event) {
                jQuery.event.simulate(fix, event.target, jQuery.event.fix(event), true)
            };
            jQuery.event.special[fix] = {
                setup: function() {
                    if (attaches++===0) {
                        document.addEventListener(orig, handler, true)
                    }
                },
                teardown: function() {
                    if (--attaches === 0) {
                        document.removeEventListener(orig, handler, true)
                    }
                }
            }
        })
    }
    jQuery.fn.extend({
        on: function(types, selector, data, fn, one) {
            var origFn, type;
            if (typeof types === "object") {
                if (typeof selector !== "string") {
                    data = data || selector;
                    selector = undefined
                }
                for (type in types) {
                    this.on(type, selector, data, types[type], one)
                }
                return this
            }
            if (data == null && fn == null) {
                fn = selector;
                data = selector = undefined
            } else if (fn == null) {
                if (typeof selector === "string") {
                    fn = data;
                    data = undefined
                } else {
                    fn = data;
                    data = selector;
                    selector = undefined
                }
            }
            if (fn === false) {
                fn = returnFalse
            } else if (!fn) {
                return this
            }
            if (one === 1) {
                origFn = fn;
                fn = function(event) {
                    jQuery().off(event);
                    return origFn.apply(this, arguments)
                };
                fn.guid = origFn.guid || (origFn.guid = jQuery.guid++)
            }
            return this.each(function() {
                jQuery.event.add(this, types, fn, data, selector)
            })
        },
        one: function(types, selector, data, fn) {
            return this.on(types, selector, data, fn, 1)
        },
        off: function(types, selector, fn) {
            var handleObj, type;
            if (types && types.preventDefault && types.handleObj) {
                handleObj = types.handleObj;
                jQuery(types.delegateTarget).off(handleObj.namespace ? handleObj.origType + "." + handleObj.namespace : handleObj.origType, handleObj.selector, handleObj.handler);
                return this
            }
            if (typeof types === "object") {
                for (type in types) {
                    this.off(type, selector, types[type])
                }
                return this
            }
            if (selector === false || typeof selector === "function") {
                fn = selector;
                selector = undefined
            }
            if (fn === false) {
                fn = returnFalse
            }
            return this.each(function() {
                jQuery.event.remove(this, types, fn, selector)
            })
        },
        trigger: function(type, data) {
            return this.each(function() {
                jQuery.event.trigger(type, data, this)
            })
        },
        triggerHandler: function(type, data) {
            var elem = this[0];
            if (elem) {
                return jQuery.event.trigger(type, data, elem, true)
            }
        }
    });
    var isSimple = /^.[^:#\[\.,]*$/, rparentsprev = /^(?:parents|prev(?:Until|All))/, rneedsContext = jQuery.expr.match.needsContext, guaranteedUnique = {
        children: true,
        contents: true,
        next: true,
        prev: true
    };
    jQuery.fn.extend({
        find: function(selector) {
            var i, ret = [], self = this, len = self.length;
            if (typeof selector !== "string") {
                return this.pushStack(jQuery(selector).filter(function() {
                    for (i = 0; i < len; i++) {
                        if (jQuery.contains(self[i], this)) {
                            return true
                        }
                    }
                }))
            }
            for (i = 0; i < len; i++) {
                jQuery.find(selector, self[i], ret)
            }
            ret = this.pushStack(len > 1 ? jQuery.unique(ret) : ret);
            ret.selector = this.selector ? this.selector + " " + selector : selector;
            return ret
        },
        has: function(target) {
            var targets = jQuery(target, this), l = targets.length;
            return this.filter(function() {
                var i = 0;
                for (; i < l; i++) {
                    if (jQuery.contains(this, targets[i])) {
                        return true
                    }
                }
            })
        },
        not: function(selector) {
            return this.pushStack(winnow(this, selector || [], true))
        },
        filter: function(selector) {
            return this.pushStack(winnow(this, selector || [], false))
        },
        is: function(selector) {
            return !!winnow(this, typeof selector === "string" && rneedsContext.test(selector) ? jQuery(selector) : selector || [], false).length
        },
        closest: function(selectors, context) {
            var cur, i = 0, l = this.length, matched = [], pos = rneedsContext.test(selectors) || typeof selectors !== "string" ? jQuery(selectors, context || this.context): 0;
            for (; i < l; i++) {
                for (cur = this[i]; cur && cur !== context; cur = cur.parentNode) {
                    if (cur.nodeType < 11 && (pos ? pos.index(cur)>-1 : cur.nodeType === 1 && jQuery.find.matchesSelector(cur, selectors))) {
                        cur = matched.push(cur);
                        break
                    }
                }
            }
            return this.pushStack(matched.length > 1 ? jQuery.unique(matched) : matched)
        },
        index: function(elem) {
            if (!elem) {
                return this[0] && this[0].parentNode ? this.first().prevAll().length : - 1
            }
            if (typeof elem === "string") {
                return core_indexOf.call(jQuery(elem), this[0])
            }
            return core_indexOf.call(this, elem.jquery ? elem[0] : elem)
        },
        add: function(selector, context) {
            var set = typeof selector === "string" ? jQuery(selector, context): jQuery.makeArray(selector && selector.nodeType ? [selector] : selector), all = jQuery.merge(this.get(), set);
            return this.pushStack(jQuery.unique(all))
        },
        addBack: function(selector) {
            return this.add(selector == null ? this.prevObject : this.prevObject.filter(selector))
        }
    });
    function sibling(cur, dir) {
        while ((cur = cur[dir]) && cur.nodeType !== 1) {}
        return cur
    }
    jQuery.each({
        parent: function(elem) {
            var parent = elem.parentNode;
            return parent && parent.nodeType !== 11 ? parent : null
        },
        parents: function(elem) {
            return jQuery.dir(elem, "parentNode")
        },
        parentsUntil: function(elem, i, until) {
            return jQuery.dir(elem, "parentNode", until)
        },
        next: function(elem) {
            return sibling(elem, "nextSibling")
        },
        prev: function(elem) {
            return sibling(elem, "previousSibling")
        },
        nextAll: function(elem) {
            return jQuery.dir(elem, "nextSibling")
        },
        prevAll: function(elem) {
            return jQuery.dir(elem, "previousSibling")
        },
        nextUntil: function(elem, i, until) {
            return jQuery.dir(elem, "nextSibling", until)
        },
        prevUntil: function(elem, i, until) {
            return jQuery.dir(elem, "previousSibling", until)
        },
        siblings: function(elem) {
            return jQuery.sibling((elem.parentNode || {}).firstChild, elem)
        },
        children: function(elem) {
            return jQuery.sibling(elem.firstChild)
        },
        contents: function(elem) {
            return elem.contentDocument || jQuery.merge([], elem.childNodes)
        }
    }, function(name, fn) {
        jQuery.fn[name] = function(until, selector) {
            var matched = jQuery.map(this, fn, until);
            if (name.slice( - 5) !== "Until") {
                selector = until
            }
            if (selector && typeof selector === "string") {
                matched = jQuery.filter(selector, matched)
            }
            if (this.length > 1) {
                if (!guaranteedUnique[name]) {
                    jQuery.unique(matched)
                }
                if (rparentsprev.test(name)) {
                    matched.reverse()
                }
            }
            return this.pushStack(matched)
        }
    });
    jQuery.extend({
        filter: function(expr, elems, not) {
            var elem = elems[0];
            if (not) {
                expr = ":not(" + expr + ")"
            }
            return elems.length === 1 && elem.nodeType === 1 ? jQuery.find.matchesSelector(elem, expr) ? [elem] : [] : jQuery.find.matches(expr, jQuery.grep(elems, function(elem) {
                return elem.nodeType === 1
            }))
        },
        dir: function(elem, dir, until) {
            var matched = [], truncate = until !== undefined;
            while ((elem = elem[dir]) && elem.nodeType !== 9) {
                if (elem.nodeType === 1) {
                    if (truncate && jQuery(elem).is(until)) {
                        break
                    }
                    matched.push(elem)
                }
            }
            return matched
        },
        sibling: function(n, elem) {
            var matched = [];
            for (; n; n = n.nextSibling) {
                if (n.nodeType === 1 && n !== elem) {
                    matched.push(n)
                }
            }
            return matched
        }
    });
    function winnow(elements, qualifier, not) {
        if (jQuery.isFunction(qualifier)) {
            return jQuery.grep(elements, function(elem, i) {
                return !!qualifier.call(elem, i, elem) !== not
            })
        }
        if (qualifier.nodeType) {
            return jQuery.grep(elements, function(elem) {
                return elem === qualifier !== not
            })
        }
        if (typeof qualifier === "string") {
            if (isSimple.test(qualifier)) {
                return jQuery.filter(qualifier, elements, not)
            }
            qualifier = jQuery.filter(qualifier, elements)
        }
        return jQuery.grep(elements, function(elem) {
            return core_indexOf.call(qualifier, elem) >= 0 !== not
        })
    }
    var rxhtmlTag = /<(?!area|br|col|embed|hr|img|input|link|meta|param)(([\w:]+)[^>]*)\/>/gi, rtagName = /<([\w:]+)/, rhtml = /<|&#?\w+;/, rnoInnerhtml = /<(?:script|style|link)/i, manipulation_rcheckableType = /^(?:checkbox|radio)$/i, rchecked = /checked\s*(?:[^=]|=\s*.checked.)/i, rscriptType = /^$|\/(?:java|ecma)script/i, rscriptTypeMasked = /^true\/(.*)/, rcleanScript = /^\s*<!(?:\[CDATA\[|--)|(?:\]\]|--)>\s*$/g, wrapMap = {
        option: [1, "<select multiple='multiple'>", "</select>"],
        thead: [1, "<table>", "</table>"],
        col: [2, "<table><colgroup>", "</colgroup></table>"],
        tr: [2, "<table><tbody>", "</tbody></table>"],
        td: [3, "<table><tbody><tr>", "</tr></tbody></table>"],
        _default: [0, "", ""]
    };
    wrapMap.optgroup = wrapMap.option;
    wrapMap.tbody = wrapMap.tfoot = wrapMap.colgroup = wrapMap.caption = wrapMap.thead;
    wrapMap.th = wrapMap.td;
    jQuery.fn.extend({
        text: function(value) {
            return jQuery.access(this, function(value) {
                return value === undefined ? jQuery.text(this) : this.empty().append((this[0] && this[0].ownerDocument || document).createTextNode(value))
            }, null, value, arguments.length)
        },
        append: function() {
            return this.domManip(arguments, function(elem) {
                if (this.nodeType === 1 || this.nodeType === 11 || this.nodeType === 9) {
                    var target = manipulationTarget(this, elem);
                    target.appendChild(elem)
                }
            })
        },
        prepend: function() {
            return this.domManip(arguments, function(elem) {
                if (this.nodeType === 1 || this.nodeType === 11 || this.nodeType === 9) {
                    var target = manipulationTarget(this, elem);
                    target.insertBefore(elem, target.firstChild)
                }
            })
        },
        before: function() {
            return this.domManip(arguments, function(elem) {
                if (this.parentNode) {
                    this.parentNode.insertBefore(elem, this)
                }
            })
        },
        after: function() {
            return this.domManip(arguments, function(elem) {
                if (this.parentNode) {
                    this.parentNode.insertBefore(elem, this.nextSibling)
                }
            })
        },
        remove: function(selector, keepData) {
            var elem, elems = selector ? jQuery.filter(selector, this): this, i = 0;
            for (; (elem = elems[i]) != null; i++) {
                if (!keepData && elem.nodeType === 1) {
                    jQuery.cleanData(getAll(elem))
                }
                if (elem.parentNode) {
                    if (keepData && jQuery.contains(elem.ownerDocument, elem)) {
                        setGlobalEval(getAll(elem, "script"))
                    }
                    elem.parentNode.removeChild(elem)
                }
            }
            return this
        },
        empty: function() {
            var elem, i = 0;
            for (; (elem = this[i]) != null; i++) {
                if (elem.nodeType === 1) {
                    jQuery.cleanData(getAll(elem, false));
                    elem.textContent = ""
                }
            }
            return this
        },
        clone: function(dataAndEvents, deepDataAndEvents) {
            dataAndEvents = dataAndEvents == null ? false : dataAndEvents;
            deepDataAndEvents = deepDataAndEvents == null ? dataAndEvents : deepDataAndEvents;
            return this.map(function() {
                return jQuery.clone(this, dataAndEvents, deepDataAndEvents)
            })
        },
        html: function(value) {
            return jQuery.access(this, function(value) {
                var elem = this[0] || {}, i = 0, l = this.length;
                if (value === undefined && elem.nodeType === 1) {
                    return elem.innerHTML
                }
                if (typeof value === "string"&&!rnoInnerhtml.test(value)&&!wrapMap[(rtagName.exec(value) || ["", ""])[1].toLowerCase()]) {
                    value = value.replace(rxhtmlTag, "<$1></$2>");
                    try {
                        for (; i < l; i++) {
                            elem = this[i] || {};
                            if (elem.nodeType === 1) {
                                jQuery.cleanData(getAll(elem, false));
                                elem.innerHTML = value
                            }
                        }
                        elem = 0
                    } catch (e) {}
                }
                if (elem) {
                    this.empty().append(value)
                }
            }, null, value, arguments.length)
        },
        replaceWith: function() {
            var args = jQuery.map(this, function(elem) {
                return [elem.nextSibling, elem.parentNode]
            }), i = 0;
            this.domManip(arguments, function(elem) {
                var next = args[i++], parent = args[i++];
                if (parent) {
                    if (next && next.parentNode !== parent) {
                        next = this.nextSibling
                    }
                    jQuery(this).remove();
                    parent.insertBefore(elem, next)
                }
            }, true);
            return i ? this : this.remove()
        },
        detach: function(selector) {
            return this.remove(selector, true)
        },
        domManip: function(args, callback, allowIntersection) {
            args = core_concat.apply([], args);
            var fragment, first, scripts, hasScripts, node, doc, i = 0, l = this.length, set = this, iNoClone = l - 1, value = args[0], isFunction = jQuery.isFunction(value);
            if (isFunction ||!(l <= 1 || typeof value !== "string" || jQuery.support.checkClone ||!rchecked.test(value))) {
                return this.each(function(index) {
                    var self = set.eq(index);
                    if (isFunction) {
                        args[0] = value.call(this, index, self.html())
                    }
                    self.domManip(args, callback, allowIntersection)
                })
            }
            if (l) {
                fragment = jQuery.buildFragment(args, this[0].ownerDocument, false, !allowIntersection && this);
                first = fragment.firstChild;
                if (fragment.childNodes.length === 1) {
                    fragment = first
                }
                if (first) {
                    scripts = jQuery.map(getAll(fragment, "script"), disableScript);
                    hasScripts = scripts.length;
                    for (; i < l; i++) {
                        node = fragment;
                        if (i !== iNoClone) {
                            node = jQuery.clone(node, true, true);
                            if (hasScripts) {
                                jQuery.merge(scripts, getAll(node, "script"))
                            }
                        }
                        callback.call(this[i], node, i)
                    }
                    if (hasScripts) {
                        doc = scripts[scripts.length - 1].ownerDocument;
                        jQuery.map(scripts, restoreScript);
                        for (i = 0; i < hasScripts; i++) {
                            node = scripts[i];
                            if (rscriptType.test(node.type || "")&&!data_priv.access(node, "globalEval") && jQuery.contains(doc, node)) {
                                if (node.src) {
                                    jQuery._evalUrl(node.src)
                                } else {
                                    jQuery.globalEval(node.textContent.replace(rcleanScript, ""))
                                }
                            }
                        }
                    }
                }
            }
            return this
        }
    });
    jQuery.each({
        appendTo: "append",
        prependTo: "prepend",
        insertBefore: "before",
        insertAfter: "after",
        replaceAll: "replaceWith"
    }, function(name, original) {
        jQuery.fn[name] = function(selector) {
            var elems, ret = [], insert = jQuery(selector), last = insert.length - 1, i = 0;
            for (; i <= last; i++) {
                elems = i === last ? this : this.clone(true);
                jQuery(insert[i])[original](elems);
                core_push.apply(ret, elems.get())
            }
            return this.pushStack(ret)
        }
    });
    jQuery.extend({
        clone: function(elem, dataAndEvents, deepDataAndEvents) {
            var i, l, srcElements, destElements, clone = elem.cloneNode(true), inPage = jQuery.contains(elem.ownerDocument, elem);
            if (!jQuery.support.noCloneChecked && (elem.nodeType === 1 || elem.nodeType === 11)&&!jQuery.isXMLDoc(elem)) {
                destElements = getAll(clone);
                srcElements = getAll(elem);
                for (i = 0, l = srcElements.length; i < l; i++) {
                    fixInput(srcElements[i], destElements[i])
                }
            }
            if (dataAndEvents) {
                if (deepDataAndEvents) {
                    srcElements = srcElements || getAll(elem);
                    destElements = destElements || getAll(clone);
                    for (i = 0, l = srcElements.length; i < l; i++) {
                        cloneCopyEvent(srcElements[i], destElements[i])
                    }
                } else {
                    cloneCopyEvent(elem, clone)
                }
            }
            destElements = getAll(clone, "script");
            if (destElements.length > 0) {
                setGlobalEval(destElements, !inPage && getAll(elem, "script"))
            }
            return clone
        },
        buildFragment: function(elems, context, scripts, selection) {
            var elem, tmp, tag, wrap, contains, j, i = 0, l = elems.length, fragment = context.createDocumentFragment(), nodes = [];
            for (; i < l; i++) {
                elem = elems[i];
                if (elem || elem === 0) {
                    if (jQuery.type(elem) === "object") {
                        jQuery.merge(nodes, elem.nodeType ? [elem] : elem)
                    } else if (!rhtml.test(elem)) {
                        nodes.push(context.createTextNode(elem))
                    } else {
                        tmp = tmp || fragment.appendChild(context.createElement("div"));
                        tag = (rtagName.exec(elem) || ["", ""])[1].toLowerCase();
                        wrap = wrapMap[tag] || wrapMap._default;
                        tmp.innerHTML = wrap[1] + elem.replace(rxhtmlTag, "<$1></$2>") + wrap[2];
                        j = wrap[0];
                        while (j--) {
                            tmp = tmp.lastChild
                        }
                        jQuery.merge(nodes, tmp.childNodes);
                        tmp = fragment.firstChild;
                        tmp.textContent = ""
                    }
                }
            }
            fragment.textContent = "";
            i = 0;
            while (elem = nodes[i++]) {
                if (selection && jQuery.inArray(elem, selection)!==-1) {
                    continue
                }
                contains = jQuery.contains(elem.ownerDocument, elem);
                tmp = getAll(fragment.appendChild(elem), "script");
                if (contains) {
                    setGlobalEval(tmp)
                }
                if (scripts) {
                    j = 0;
                    while (elem = tmp[j++]) {
                        if (rscriptType.test(elem.type || "")) {
                            scripts.push(elem)
                        }
                    }
                }
            }
            return fragment
        },
        cleanData: function(elems) {
            var data, elem, events, type, key, j, special = jQuery.event.special, i = 0;
            for (; (elem = elems[i]) !== undefined; i++) {
                if (Data.accepts(elem)) {
                    key = elem[data_priv.expando];
                    if (key && (data = data_priv.cache[key])) {
                        events = Object.keys(data.events || {});
                        if (events.length) {
                            for (j = 0; (type = events[j]) !== undefined; j++) {
                                if (special[type]) {
                                    jQuery.event.remove(elem, type)
                                } else {
                                    jQuery.removeEvent(elem, type, data.handle)
                                }
                            }
                        }
                        if (data_priv.cache[key]) {
                            delete data_priv.cache[key]
                        }
                    }
                }
                delete data_user.cache[elem[data_user.expando]]
            }
        },
        _evalUrl: function(url) {
            return jQuery.ajax({
                url: url,
                type: "GET",
                dataType: "script",
                async: false,
                global: false,
                "throws": true
            })
        }
    });
    function manipulationTarget(elem, content) {
        return jQuery.nodeName(elem, "table") && jQuery.nodeName(content.nodeType === 1 ? content : content.firstChild, "tr") ? elem.getElementsByTagName("tbody")[0] || elem.appendChild(elem.ownerDocument.createElement("tbody")) : elem
    }
    function disableScript(elem) {
        elem.type = (elem.getAttribute("type") !== null) + "/" + elem.type;
        return elem
    }
    function restoreScript(elem) {
        var match = rscriptTypeMasked.exec(elem.type);
        if (match) {
            elem.type = match[1]
        } else {
            elem.removeAttribute("type")
        }
        return elem
    }
    function setGlobalEval(elems, refElements) {
        var l = elems.length, i = 0;
        for (; i < l; i++) {
            data_priv.set(elems[i], "globalEval", !refElements || data_priv.get(refElements[i], "globalEval"))
        }
    }
    function cloneCopyEvent(src, dest) {
        var i, l, type, pdataOld, pdataCur, udataOld, udataCur, events;
        if (dest.nodeType !== 1) {
            return 
        }
        if (data_priv.hasData(src)) {
            pdataOld = data_priv.access(src);
            pdataCur = data_priv.set(dest, pdataOld);
            events = pdataOld.events;
            if (events) {
                delete pdataCur.handle;
                pdataCur.events = {};
                for (type in events) {
                    for (i = 0, l = events[type].length; i < l; i++) {
                        jQuery.event.add(dest, type, events[type][i])
                    }
                }
            }
        }
        if (data_user.hasData(src)) {
            udataOld = data_user.access(src);
            udataCur = jQuery.extend({}, udataOld);
            data_user.set(dest, udataCur)
        }
    }
    function getAll(context, tag) {
        var ret = context.getElementsByTagName ? context.getElementsByTagName(tag || "*"): context.querySelectorAll ? context.querySelectorAll(tag || "*"): [];
        return tag === undefined || tag && jQuery.nodeName(context, tag) ? jQuery.merge([context], ret) : ret
    }
    function fixInput(src, dest) {
        var nodeName = dest.nodeName.toLowerCase();
        if (nodeName === "input" && manipulation_rcheckableType.test(src.type)) {
            dest.checked = src.checked
        } else if (nodeName === "input" || nodeName === "textarea") {
            dest.defaultValue = src.defaultValue
        }
    }
    jQuery.fn.extend({
        wrapAll: function(html) {
            var wrap;
            if (jQuery.isFunction(html)) {
                return this.each(function(i) {
                    jQuery(this).wrapAll(html.call(this, i))
                })
            }
            if (this[0]) {
                wrap = jQuery(html, this[0].ownerDocument).eq(0).clone(true);
                if (this[0].parentNode) {
                    wrap.insertBefore(this[0])
                }
                wrap.map(function() {
                    var elem = this;
                    while (elem.firstElementChild) {
                        elem = elem.firstElementChild
                    }
                    return elem
                }).append(this)
            }
            return this
        },
        wrapInner: function(html) {
            if (jQuery.isFunction(html)) {
                return this.each(function(i) {
                    jQuery(this).wrapInner(html.call(this, i))
                })
            }
            return this.each(function() {
                var self = jQuery(this), contents = self.contents();
                if (contents.length) {
                    contents.wrapAll(html)
                } else {
                    self.append(html)
                }
            })
        },
        wrap: function(html) {
            var isFunction = jQuery.isFunction(html);
            return this.each(function(i) {
                jQuery(this).wrapAll(isFunction ? html.call(this, i) : html)
            })
        },
        unwrap: function() {
            return this.parent().each(function() {
                if (!jQuery.nodeName(this, "body")) {
                    jQuery(this).replaceWith(this.childNodes)
                }
            }).end()
        }
    });
    var curCSS, iframe, rdisplayswap = /^(none|table(?!-c[ea]).+)/, rmargin = /^margin/, rnumsplit = new RegExp("^(" + core_pnum + ")(.*)$", "i"), rnumnonpx = new RegExp("^(" + core_pnum + ")(?!px)[a-z%]+$", "i"), rrelNum = new RegExp("^([+-])=(" + core_pnum + ")", "i"), elemdisplay = {
        BODY: "block"
    }, cssShow = {
        position: "absolute",
        visibility: "hidden",
        display: "block"
    }, cssNormalTransform = {
        letterSpacing: 0,
        fontWeight: 400
    }, cssExpand = ["Top", "Right", "Bottom", "Left"], cssPrefixes = ["Webkit", "O", "Moz", "ms"];
    function vendorPropName(style, name) {
        if (name in style) {
            return name
        }
        var capName = name.charAt(0).toUpperCase() + name.slice(1), origName = name, i = cssPrefixes.length;
        while (i--) {
            name = cssPrefixes[i] + capName;
            if (name in style) {
                return name
            }
        }
        return origName
    }
    function isHidden(elem, el) {
        elem = el || elem;
        return jQuery.css(elem, "display") === "none" ||!jQuery.contains(elem.ownerDocument, elem)
    }
    function getStyles(elem) {
        return window.getComputedStyle(elem, null)
    }
    function showHide(elements, show) {
        var display, elem, hidden, values = [], index = 0, length = elements.length;
        for (; index < length; index++) {
            elem = elements[index];
            if (!elem.style) {
                continue
            }
            values[index] = data_priv.get(elem, "olddisplay");
            display = elem.style.display;
            if (show) {
                if (!values[index] && display === "none") {
                    elem.style.display = ""
                }
                if (elem.style.display === "" && isHidden(elem)) {
                    values[index] = data_priv.access(elem, "olddisplay", css_defaultDisplay(elem.nodeName))
                }
            } else {
                if (!values[index]) {
                    hidden = isHidden(elem);
                    if (display && display !== "none" ||!hidden) {
                        data_priv.set(elem, "olddisplay", hidden ? display : jQuery.css(elem, "display"))
                    }
                }
            }
        }
        for (index = 0; index < length; index++) {
            elem = elements[index];
            if (!elem.style) {
                continue
            }
            if (!show || elem.style.display === "none" || elem.style.display === "") {
                elem.style.display = show ? values[index] || "" : "none"
            }
        }
        return elements
    }
    jQuery.fn.extend({
        css: function(name, value) {
            return jQuery.access(this, function(elem, name, value) {
                var styles, len, map = {}, i = 0;
                if (jQuery.isArray(name)) {
                    styles = getStyles(elem);
                    len = name.length;
                    for (; i < len; i++) {
                        map[name[i]] = jQuery.css(elem, name[i], false, styles)
                    }
                    return map
                }
                return value !== undefined ? jQuery.style(elem, name, value) : jQuery.css(elem, name)
            }, name, value, arguments.length > 1)
        },
        show: function() {
            return showHide(this, true)
        },
        hide: function() {
            return showHide(this)
        },
        toggle: function(state) {
            if (typeof state === "boolean") {
                return state ? this.show() : this.hide()
            }
            return this.each(function() {
                if (isHidden(this)) {
                    jQuery(this).show()
                } else {
                    jQuery(this).hide()
                }
            })
        }
    });
    jQuery.extend({
        cssHooks: {
            opacity: {
                get: function(elem, computed) {
                    if (computed) {
                        var ret = curCSS(elem, "opacity");
                        return ret === "" ? "1" : ret
                    }
                }
            }
        },
        cssNumber: {
            columnCount: true,
            fillOpacity: true,
            fontWeight: true,
            lineHeight: true,
            opacity: true,
            order: true,
            orphans: true,
            widows: true,
            zIndex: true,
            zoom: true
        },
        cssProps: {
            "float": "cssFloat"
        },
        style: function(elem, name, value, extra) {
            if (!elem || elem.nodeType === 3 || elem.nodeType === 8 ||!elem.style) {
                return 
            }
            var ret, type, hooks, origName = jQuery.camelCase(name), style = elem.style;
            name = jQuery.cssProps[origName] || (jQuery.cssProps[origName] = vendorPropName(style, origName));
            hooks = jQuery.cssHooks[name] || jQuery.cssHooks[origName];
            if (value !== undefined) {
                type = typeof value;
                if (type === "string" && (ret = rrelNum.exec(value))) {
                    value = (ret[1] + 1) * ret[2] + parseFloat(jQuery.css(elem, name));
                    type = "number"
                }
                if (value == null || type === "number" && isNaN(value)) {
                    return 
                }
                if (type === "number"&&!jQuery.cssNumber[origName]) {
                    value += "px"
                }
                if (!jQuery.support.clearCloneStyle && value === "" && name.indexOf("background") === 0) {
                    style[name] = "inherit"
                }
                if (!hooks ||!("set"in hooks) || (value = hooks.set(elem, value, extra)) !== undefined) {
                    style[name] = value
                }
            } else {
                if (hooks && "get"in hooks && (ret = hooks.get(elem, false, extra)) !== undefined) {
                    return ret
                }
                return style[name]
            }
        },
        css: function(elem, name, extra, styles) {
            var val, num, hooks, origName = jQuery.camelCase(name);
            name = jQuery.cssProps[origName] || (jQuery.cssProps[origName] = vendorPropName(elem.style, origName));
            hooks = jQuery.cssHooks[name] || jQuery.cssHooks[origName];
            if (hooks && "get"in hooks) {
                val = hooks.get(elem, true, extra)
            }
            if (val === undefined) {
                val = curCSS(elem, name, styles)
            }
            if (val === "normal" && name in cssNormalTransform) {
                val = cssNormalTransform[name]
            }
            if (extra === "" || extra) {
                num = parseFloat(val);
                return extra === true || jQuery.isNumeric(num) ? num || 0 : val
            }
            return val
        }
    });
    curCSS = function(elem, name, _computed) {
        var width, minWidth, maxWidth, computed = _computed || getStyles(elem), ret = computed ? computed.getPropertyValue(name) || computed[name]: undefined, style = elem.style;
        if (computed) {
            if (ret === ""&&!jQuery.contains(elem.ownerDocument, elem)) {
                ret = jQuery.style(elem, name)
            }
            if (rnumnonpx.test(ret) && rmargin.test(name)) {
                width = style.width;
                minWidth = style.minWidth;
                maxWidth = style.maxWidth;
                style.minWidth = style.maxWidth = style.width = ret;
                ret = computed.width;
                style.width = width;
                style.minWidth = minWidth;
                style.maxWidth = maxWidth
            }
        }
        return ret
    };
    function setPositiveNumber(elem, value, subtract) {
        var matches = rnumsplit.exec(value);
        return matches ? Math.max(0, matches[1] - (subtract || 0)) + (matches[2] || "px") : value
    }
    function augmentWidthOrHeight(elem, name, extra, isBorderBox, styles) {
        var i = extra === (isBorderBox ? "border" : "content") ? 4: name === "width" ? 1: 0, val = 0;
        for (; i < 4; i += 2) {
            if (extra === "margin") {
                val += jQuery.css(elem, extra + cssExpand[i], true, styles)
            }
            if (isBorderBox) {
                if (extra === "content") {
                    val -= jQuery.css(elem, "padding" + cssExpand[i], true, styles)
                }
                if (extra !== "margin") {
                    val -= jQuery.css(elem, "border" + cssExpand[i] + "Width", true, styles)
                }
            } else {
                val += jQuery.css(elem, "padding" + cssExpand[i], true, styles);
                if (extra !== "padding") {
                    val += jQuery.css(elem, "border" + cssExpand[i] + "Width", true, styles)
                }
            }
        }
        return val
    }
    function getWidthOrHeight(elem, name, extra) {
        var valueIsBorderBox = true, val = name === "width" ? elem.offsetWidth: elem.offsetHeight, styles = getStyles(elem), isBorderBox = jQuery.support.boxSizing && jQuery.css(elem, "boxSizing", false, styles) === "border-box";
        if (val <= 0 || val == null) {
            val = curCSS(elem, name, styles);
            if (val < 0 || val == null) {
                val = elem.style[name]
            }
            if (rnumnonpx.test(val)) {
                return val
            }
            valueIsBorderBox = isBorderBox && (jQuery.support.boxSizingReliable || val === elem.style[name]);
            val = parseFloat(val) || 0
        }
        return val + augmentWidthOrHeight(elem, name, extra || (isBorderBox ? "border" : "content"), valueIsBorderBox, styles) + "px"
    }
    function css_defaultDisplay(nodeName) {
        var doc = document, display = elemdisplay[nodeName];
        if (!display) {
            display = actualDisplay(nodeName, doc);
            if (display === "none" ||!display) {
                iframe = (iframe || jQuery("<iframe frameborder='0' width='0' height='0'/>").css("cssText", "display:block !important")).appendTo(doc.documentElement);
                doc = (iframe[0].contentWindow || iframe[0].contentDocument).document;
                doc.write("<!doctype html><html><body>");
                doc.close();
                display = actualDisplay(nodeName, doc);
                iframe.detach()
            }
            elemdisplay[nodeName] = display
        }
        return display
    }
    function actualDisplay(name, doc) {
        var elem = jQuery(doc.createElement(name)).appendTo(doc.body), display = jQuery.css(elem[0], "display");
        elem.remove();
        return display
    }
    jQuery.each(["height", "width"], function(i, name) {
        jQuery.cssHooks[name] = {
            get: function(elem, computed, extra) {
                if (computed) {
                    return elem.offsetWidth === 0 && rdisplayswap.test(jQuery.css(elem, "display")) ? jQuery.swap(elem, cssShow, function() {
                        return getWidthOrHeight(elem, name, extra)
                    }) : getWidthOrHeight(elem, name, extra)
                }
            },
            set: function(elem, value, extra) {
                var styles = extra && getStyles(elem);
                return setPositiveNumber(elem, value, extra ? augmentWidthOrHeight(elem, name, extra, jQuery.support.boxSizing && jQuery.css(elem, "boxSizing", false, styles) === "border-box", styles) : 0)
            }
        }
    });
    jQuery(function() {
        if (!jQuery.support.reliableMarginRight) {
            jQuery.cssHooks.marginRight = {
                get: function(elem, computed) {
                    if (computed) {
                        return jQuery.swap(elem, {
                            display: "inline-block"
                        }, curCSS, [elem, "marginRight"])
                    }
                }
            }
        }
        if (!jQuery.support.pixelPosition && jQuery.fn.position) {
            jQuery.each(["top", "left"], function(i, prop) {
                jQuery.cssHooks[prop] = {
                    get: function(elem, computed) {
                        if (computed) {
                            computed = curCSS(elem, prop);
                            return rnumnonpx.test(computed) ? jQuery(elem).position()[prop] + "px" : computed
                        }
                    }
                }
            })
        }
    });
    if (jQuery.expr && jQuery.expr.filters) {
        jQuery.expr.filters.hidden = function(elem) {
            return elem.offsetWidth <= 0 && elem.offsetHeight <= 0
        };
        jQuery.expr.filters.visible = function(elem) {
            return !jQuery.expr.filters.hidden(elem)
        }
    }
    jQuery.each({
        margin: "",
        padding: "",
        border: "Width"
    }, function(prefix, suffix) {
        jQuery.cssHooks[prefix + suffix] = {
            expand: function(value) {
                var i = 0, expanded = {}, parts = typeof value === "string" ? value.split(" "): [value];
                for (; i < 4; i++) {
                    expanded[prefix + cssExpand[i] + suffix] = parts[i] || parts[i - 2] || parts[0]
                }
                return expanded
            }
        };
        if (!rmargin.test(prefix)) {
            jQuery.cssHooks[prefix + suffix].set = setPositiveNumber
        }
    });
    var r20 = /%20/g, rbracket = /\[\]$/, rCRLF = /\r?\n/g, rsubmitterTypes = /^(?:submit|button|image|reset|file)$/i, rsubmittable = /^(?:input|select|textarea|keygen)/i;
    jQuery.fn.extend({
        serialize: function() {
            return jQuery.param(this.serializeArray())
        },
        serializeArray: function() {
            return this.map(function() {
                var elements = jQuery.prop(this, "elements");
                return elements ? jQuery.makeArray(elements) : this
            }).filter(function() {
                var type = this.type;
                return this.name&&!jQuery(this).is(":disabled") && rsubmittable.test(this.nodeName)&&!rsubmitterTypes.test(type) && (this.checked ||!manipulation_rcheckableType.test(type))
            }).map(function(i, elem) {
                var val = jQuery(this).val();
                return val == null ? null : jQuery.isArray(val) ? jQuery.map(val, function(val) {
                    return {
                        name: elem.name,
                        value: val.replace(rCRLF, "\r\n")
                    }
                }) : {
                    name: elem.name,
                    value: val.replace(rCRLF, "\r\n")
                }
            }).get()
        }
    });
    jQuery.param = function(a, traditional) {
        var prefix, s = [], add = function(key, value) {
            value = jQuery.isFunction(value) ? value() : value == null ? "" : value;
            s[s.length] = encodeURIComponent(key) + "=" + encodeURIComponent(value)
        };
        if (traditional === undefined) {
            traditional = jQuery.ajaxSettings && jQuery.ajaxSettings.traditional
        }
        if (jQuery.isArray(a) || a.jquery&&!jQuery.isPlainObject(a)) {
            jQuery.each(a, function() {
                add(this.name, this.value)
            })
        } else {
            for (prefix in a) {
                buildParams(prefix, a[prefix], traditional, add)
            }
        }
        return s.join("&").replace(r20, "+")
    };
    function buildParams(prefix, obj, traditional, add) {
        var name;
        if (jQuery.isArray(obj)) {
            jQuery.each(obj, function(i, v) {
                if (traditional || rbracket.test(prefix)) {
                    add(prefix, v)
                } else {
                    buildParams(prefix + "[" + (typeof v === "object" ? i : "") + "]", v, traditional, add)
                }
            })
        } else if (!traditional && jQuery.type(obj) === "object") {
            for (name in obj) {
                buildParams(prefix + "[" + name + "]", obj[name], traditional, add)
            }
        } else {
            add(prefix, obj)
        }
    }
    jQuery.each(("blur focus focusin focusout load resize scroll unload click dblclick " + "mousedown mouseup mousemove mouseover mouseout mouseenter mouseleave " + "change select submit keydown keypress keyup error contextmenu").split(" "), function(i, name) {
        jQuery.fn[name] = function(data, fn) {
            return arguments.length > 0 ? this.on(name, null, data, fn) : this.trigger(name)
        }
    });
    jQuery.fn.extend({
        hover: function(fnOver, fnOut) {
            return this.mouseenter(fnOver).mouseleave(fnOut || fnOver)
        },
        bind: function(types, data, fn) {
            return this.on(types, null, data, fn)
        },
        unbind: function(types, fn) {
            return this.off(types, null, fn)
        },
        delegate: function(selector, types, data, fn) {
            return this.on(types, selector, data, fn)
        },
        undelegate: function(selector, types, fn) {
            return arguments.length === 1 ? this.off(selector, "**") : this.off(types, selector || "**", fn)
        }
    });
    var ajaxLocParts, ajaxLocation, ajax_nonce = jQuery.now(), ajax_rquery = /\?/, rhash = /#.*$/, rts = /([?&])_=[^&]*/, rheaders = /^(.*?):[ \t]*([^\r\n]*)$/gm, rlocalProtocol = /^(?:about|app|app-storage|.+-extension|file|res|widget):$/, rnoContent = /^(?:GET|HEAD)$/, rprotocol = /^\/\//, rurl = /^([\w.+-]+:)(?:\/\/([^\/?#:]*)(?::(\d+)|)|)/, _load = jQuery.fn.load, prefilters = {}, transports = {}, allTypes = "*/".concat("*");
    try {
        ajaxLocation = location.href
    } catch (e) {
        ajaxLocation = document.createElement("a");
        ajaxLocation.href = "";
        ajaxLocation = ajaxLocation.href
    }
    ajaxLocParts = rurl.exec(ajaxLocation.toLowerCase()) || [];
    function addToPrefiltersOrTransports(structure) {
        return function(dataTypeExpression, func) {
            if (typeof dataTypeExpression !== "string") {
                func = dataTypeExpression;
                dataTypeExpression = "*"
            }
            var dataType, i = 0, dataTypes = dataTypeExpression.toLowerCase().match(core_rnotwhite) || [];
            if (jQuery.isFunction(func)) {
                while (dataType = dataTypes[i++]) {
                    if (dataType[0] === "+") {
                        dataType = dataType.slice(1) || "*";
                        (structure[dataType] = structure[dataType] || []).unshift(func)
                    } else {
                        (structure[dataType] = structure[dataType] || []).push(func)
                    }
                }
            }
        }
    }
    function inspectPrefiltersOrTransports(structure, options, originalOptions, jqXHR) {
        var inspected = {}, seekingTransport = structure === transports;
        function inspect(dataType) {
            var selected;
            inspected[dataType] = true;
            jQuery.each(structure[dataType] || [], function(_, prefilterOrFactory) {
                var dataTypeOrTransport = prefilterOrFactory(options, originalOptions, jqXHR);
                if (typeof dataTypeOrTransport === "string"&&!seekingTransport&&!inspected[dataTypeOrTransport]) {
                    options.dataTypes.unshift(dataTypeOrTransport);
                    inspect(dataTypeOrTransport);
                    return false
                } else if (seekingTransport) {
                    return !(selected = dataTypeOrTransport)
                }
            });
            return selected
        }
        return inspect(options.dataTypes[0]) ||!inspected["*"] && inspect("*")
    }
    function ajaxExtend(target, src) {
        var key, deep, flatOptions = jQuery.ajaxSettings.flatOptions || {};
        for (key in src) {
            if (src[key] !== undefined) {
                (flatOptions[key] ? target : deep || (deep = {}))[key] = src[key]
            }
        }
        if (deep) {
            jQuery.extend(true, target, deep)
        }
        return target
    }
    jQuery.fn.load = function(url, params, callback) {
        if (typeof url !== "string" && _load) {
            return _load.apply(this, arguments)
        }
        var selector, type, response, self = this, off = url.indexOf(" ");
        if (off >= 0) {
            selector = url.slice(off);
            url = url.slice(0, off)
        }
        if (jQuery.isFunction(params)) {
            callback = params;
            params = undefined
        } else if (params && typeof params === "object") {
            type = "POST"
        }
        if (self.length > 0) {
            jQuery.ajax({
                url: url,
                type: type,
                dataType: "html",
                data: params
            }).done(function(responseText) {
                response = arguments;
                self.html(selector ? jQuery("<div>").append(jQuery.parseHTML(responseText)).find(selector) : responseText)
            }).complete(callback && function(jqXHR, status) {
                self.each(callback, response || [jqXHR.responseText, status, jqXHR])
            })
        }
        return this
    };
    jQuery.each(["ajaxStart", "ajaxStop", "ajaxComplete", "ajaxError", "ajaxSuccess", "ajaxSend"], function(i, type) {
        jQuery.fn[type] = function(fn) {
            return this.on(type, fn)
        }
    });
    jQuery.extend({
        active: 0,
        lastModified: {},
        etag: {},
        ajaxSettings: {
            url: ajaxLocation,
            type: "GET",
            isLocal: rlocalProtocol.test(ajaxLocParts[1]),
            global: true,
            processData: true,
            async: true,
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            accepts: {
                "*": allTypes,
                text: "text/plain",
                html: "text/html",
                xml: "application/xml, text/xml",
                json: "application/json, text/javascript"
            },
            contents: {
                xml: /xml/,
                html: /html/,
                json: /json/
            },
            responseFields: {
                xml: "responseXML",
                text: "responseText",
                json: "responseJSON"
            },
            converters: {
                "* text": String,
                "text html": true,
                "text json": jQuery.parseJSON,
                "text xml": jQuery.parseXML
            },
            flatOptions: {
                url: true,
                context: true
            }
        },
        ajaxSetup: function(target, settings) {
            return settings ? ajaxExtend(ajaxExtend(target, jQuery.ajaxSettings), settings) : ajaxExtend(jQuery.ajaxSettings, target)
        },
        ajaxPrefilter: addToPrefiltersOrTransports(prefilters),
        ajaxTransport: addToPrefiltersOrTransports(transports),
        ajax: function(url, options) {
            if (typeof url === "object") {
                options = url;
                url = undefined
            }
            options = options || {};
            var transport, cacheURL, responseHeadersString, responseHeaders, timeoutTimer, parts, fireGlobals, i, s = jQuery.ajaxSetup({}, options), callbackContext = s.context || s, globalEventContext = s.context && (callbackContext.nodeType || callbackContext.jquery) ? jQuery(callbackContext): jQuery.event, deferred = jQuery.Deferred(), completeDeferred = jQuery.Callbacks("once memory"), statusCode = s.statusCode || {}, requestHeaders = {}, requestHeadersNames = {}, state = 0, strAbort = "canceled", jqXHR = {
                readyState: 0,
                getResponseHeader: function(key) {
                    var match;
                    if (state === 2) {
                        if (!responseHeaders) {
                            responseHeaders = {};
                            while (match = rheaders.exec(responseHeadersString)) {
                                responseHeaders[match[1].toLowerCase()] = match[2]
                            }
                        }
                        match = responseHeaders[key.toLowerCase()]
                    }
                    return match == null ? null : match
                },
                getAllResponseHeaders: function() {
                    return state === 2 ? responseHeadersString : null
                },
                setRequestHeader: function(name, value) {
                    var lname = name.toLowerCase();
                    if (!state) {
                        name = requestHeadersNames[lname] = requestHeadersNames[lname] || name;
                        requestHeaders[name] = value
                    }
                    return this
                },
                overrideMimeType: function(type) {
                    if (!state) {
                        s.mimeType = type
                    }
                    return this
                },
                statusCode: function(map) {
                    var code;
                    if (map) {
                        if (state < 2) {
                            for (code in map) {
                                statusCode[code] = [statusCode[code], map[code]]
                            }
                        } else {
                            jqXHR.always(map[jqXHR.status])
                        }
                    }
                    return this
                },
                abort: function(statusText) {
                    var finalText = statusText || strAbort;
                    if (transport) {
                        transport.abort(finalText)
                    }
                    done(0, finalText);
                    return this
                }
            };
            deferred.promise(jqXHR).complete = completeDeferred.add;
            jqXHR.success = jqXHR.done;
            jqXHR.error = jqXHR.fail;
            s.url = ((url || s.url || ajaxLocation) + "").replace(rhash, "").replace(rprotocol, ajaxLocParts[1] + "//");
            s.type = options.method || options.type || s.method || s.type;
            s.dataTypes = jQuery.trim(s.dataType || "*").toLowerCase().match(core_rnotwhite) || [""];
            if (s.crossDomain == null) {
                parts = rurl.exec(s.url.toLowerCase());
                s.crossDomain=!!(parts && (parts[1] !== ajaxLocParts[1] || parts[2] !== ajaxLocParts[2] || (parts[3] || (parts[1] === "http:" ? "80" : "443")) !== (ajaxLocParts[3] || (ajaxLocParts[1] === "http:" ? "80" : "443"))))
            }
            if (s.data && s.processData && typeof s.data !== "string") {
                s.data = jQuery.param(s.data, s.traditional)
            }
            inspectPrefiltersOrTransports(prefilters, s, options, jqXHR);
            if (state === 2) {
                return jqXHR
            }
            fireGlobals = s.global;
            if (fireGlobals && jQuery.active++===0) {
                jQuery.event.trigger("ajaxStart")
            }
            s.type = s.type.toUpperCase();
            s.hasContent=!rnoContent.test(s.type);
            cacheURL = s.url;
            if (!s.hasContent) {
                if (s.data) {
                    cacheURL = s.url += (ajax_rquery.test(cacheURL) ? "&" : "?") + s.data;
                    delete s.data
                }
                if (s.cache === false) {
                    s.url = rts.test(cacheURL) ? cacheURL.replace(rts, "$1_=" + ajax_nonce++) : cacheURL + (ajax_rquery.test(cacheURL) ? "&" : "?") + "_=" + ajax_nonce++
                }
            }
            if (s.ifModified) {
                if (jQuery.lastModified[cacheURL]) {
                    jqXHR.setRequestHeader("If-Modified-Since", jQuery.lastModified[cacheURL])
                }
                if (jQuery.etag[cacheURL]) {
                    jqXHR.setRequestHeader("If-None-Match", jQuery.etag[cacheURL])
                }
            }
            if (s.data && s.hasContent && s.contentType !== false || options.contentType) {
                jqXHR.setRequestHeader("Content-Type", s.contentType)
            }
            jqXHR.setRequestHeader("Accept", s.dataTypes[0] && s.accepts[s.dataTypes[0]] ? s.accepts[s.dataTypes[0]] + (s.dataTypes[0] !== "*" ? ", " + allTypes + "; q=0.01" : "") : s.accepts["*"]);
            for (i in s.headers) {
                jqXHR.setRequestHeader(i, s.headers[i])
            }
            if (s.beforeSend && (s.beforeSend.call(callbackContext, jqXHR, s) === false || state === 2)) {
                return jqXHR.abort()
            }
            strAbort = "abort";
            for (i in{
                success: 1,
                error: 1,
                complete: 1
            }) {
                jqXHR[i](s[i])
            }
            transport = inspectPrefiltersOrTransports(transports, s, options, jqXHR);
            if (!transport) {
                done( - 1, "No Transport")
            } else {
                jqXHR.readyState = 1;
                if (fireGlobals) {
                    globalEventContext.trigger("ajaxSend", [jqXHR, s])
                }
                if (s.async && s.timeout > 0) {
                    timeoutTimer = setTimeout(function() {
                        jqXHR.abort("timeout")
                    }, s.timeout)
                }
                try {
                    state = 1;
                    transport.send(requestHeaders, done)
                } catch (e) {
                    if (state < 2) {
                        done( - 1, e)
                    } else {
                        throw e
                    }
                }
            }
            function done(status, nativeStatusText, responses, headers) {
                var isSuccess, success, error, response, modified, statusText = nativeStatusText;
                if (state === 2) {
                    return 
                }
                state = 2;
                if (timeoutTimer) {
                    clearTimeout(timeoutTimer)
                }
                transport = undefined;
                responseHeadersString = headers || "";
                jqXHR.readyState = status > 0 ? 4 : 0;
                isSuccess = status >= 200 && status < 300 || status === 304;
                if (responses) {
                    response = ajaxHandleResponses(s, jqXHR, responses)
                }
                response = ajaxConvert(s, response, jqXHR, isSuccess);
                if (isSuccess) {
                    if (s.ifModified) {
                        modified = jqXHR.getResponseHeader("Last-Modified");
                        if (modified) {
                            jQuery.lastModified[cacheURL] = modified
                        }
                        modified = jqXHR.getResponseHeader("etag");
                        if (modified) {
                            jQuery.etag[cacheURL] = modified
                        }
                    }
                    if (status === 204 || s.type === "HEAD") {
                        statusText = "nocontent"
                    } else if (status === 304) {
                        statusText = "notmodified"
                    } else {
                        statusText = response.state;
                        success = response.data;
                        error = response.error;
                        isSuccess=!error
                    }
                } else {
                    error = statusText;
                    if (status ||!statusText) {
                        statusText = "error";
                        if (status < 0) {
                            status = 0
                        }
                    }
                }
                jqXHR.status = status;
                jqXHR.statusText = (nativeStatusText || statusText) + "";
                if (isSuccess) {
                    deferred.resolveWith(callbackContext, [success, statusText, jqXHR])
                } else {
                    deferred.rejectWith(callbackContext, [jqXHR, statusText, error])
                }
                jqXHR.statusCode(statusCode);
                statusCode = undefined;
                if (fireGlobals) {
                    globalEventContext.trigger(isSuccess ? "ajaxSuccess" : "ajaxError", [jqXHR, s, isSuccess ? success: error])
                }
                completeDeferred.fireWith(callbackContext, [jqXHR, statusText]);
                if (fireGlobals) {
                    globalEventContext.trigger("ajaxComplete", [jqXHR, s]);
                    if (!--jQuery.active) {
                        jQuery.event.trigger("ajaxStop")
                    }
                }
            }
            return jqXHR
        },
        getJSON: function(url, data, callback) {
            return jQuery.get(url, data, callback, "json")
        },
        getScript: function(url, callback) {
            return jQuery.get(url, undefined, callback, "script")
        }
    });
    jQuery.each(["get", "post"], function(i, method) {
        jQuery[method] = function(url, data, callback, type) {
            if (jQuery.isFunction(data)) {
                type = type || callback;
                callback = data;
                data = undefined
            }
            return jQuery.ajax({
                url: url,
                type: method,
                dataType: type,
                data: data,
                success: callback
            })
        }
    });
    function ajaxHandleResponses(s, jqXHR, responses) {
        var ct, type, finalDataType, firstDataType, contents = s.contents, dataTypes = s.dataTypes;
        while (dataTypes[0] === "*") {
            dataTypes.shift();
            if (ct === undefined) {
                ct = s.mimeType || jqXHR.getResponseHeader("Content-Type")
            }
        }
        if (ct) {
            for (type in contents) {
                if (contents[type] && contents[type].test(ct)) {
                    dataTypes.unshift(type);
                    break
                }
            }
        }
        if (dataTypes[0]in responses) {
            finalDataType = dataTypes[0]
        } else {
            for (type in responses) {
                if (!dataTypes[0] || s.converters[type + " " + dataTypes[0]]) {
                    finalDataType = type;
                    break
                }
                if (!firstDataType) {
                    firstDataType = type
                }
            }
            finalDataType = finalDataType || firstDataType
        }
        if (finalDataType) {
            if (finalDataType !== dataTypes[0]) {
                dataTypes.unshift(finalDataType)
            }
            return responses[finalDataType]
        }
    }
    function ajaxConvert(s, response, jqXHR, isSuccess) {
        var conv2, current, conv, tmp, prev, converters = {}, dataTypes = s.dataTypes.slice();
        if (dataTypes[1]) {
            for (conv in s.converters) {
                converters[conv.toLowerCase()] = s.converters[conv]
            }
        }
        current = dataTypes.shift();
        while (current) {
            if (s.responseFields[current]) {
                jqXHR[s.responseFields[current]] = response
            }
            if (!prev && isSuccess && s.dataFilter) {
                response = s.dataFilter(response, s.dataType)
            }
            prev = current;
            current = dataTypes.shift();
            if (current) {
                if (current === "*") {
                    current = prev
                } else if (prev !== "*" && prev !== current) {
                    conv = converters[prev + " " + current] || converters["* " + current];
                    if (!conv) {
                        for (conv2 in converters) {
                            tmp = conv2.split(" ");
                            if (tmp[1] === current) {
                                conv = converters[prev + " " + tmp[0]] || converters["* " + tmp[0]];
                                if (conv) {
                                    if (conv === true) {
                                        conv = converters[conv2]
                                    } else if (converters[conv2] !== true) {
                                        current = tmp[0];
                                        dataTypes.unshift(tmp[1])
                                    }
                                    break
                                }
                            }
                        }
                    }
                    if (conv !== true) {
                        if (conv && s["throws"]) {
                            response = conv(response)
                        } else {
                            try {
                                response = conv(response)
                            } catch (e) {
                                return {
                                    state: "parsererror",
                                    error: conv ? e: "No conversion from " + prev + " to " + current
                                }
                            }
                        }
                    }
                }
            }
        }
        return {
            state: "success",
            data: response
        }
    }
    jQuery.ajaxSetup({
        accepts: {
            script: "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript"
        },
        contents: {
            script: /(?:java|ecma)script/
        },
        converters: {
            "text script": function(text) {
                jQuery.globalEval(text);
                return text
            }
        }
    });
    jQuery.ajaxPrefilter("script", function(s) {
        if (s.cache === undefined) {
            s.cache = false
        }
        if (s.crossDomain) {
            s.type = "GET"
        }
    });
    jQuery.ajaxTransport("script", function(s) {
        if (s.crossDomain) {
            var script, callback;
            return {
                send: function(_, complete) {
                    script = jQuery("<script>").prop({
                        async: true,
                        charset: s.scriptCharset,
                        src: s.url
                    }).on("load error", callback = function(evt) {
                        script.remove();
                        callback = null;
                        if (evt) {
                            complete(evt.type === "error" ? 404 : 200, evt.type)
                        }
                    });
                    document.head.appendChild(script[0])
                },
                abort: function() {
                    if (callback) {
                        callback()
                    }
                }
            }
        }
    });
    var oldCallbacks = [], rjsonp = /(=)\?(?=&|$)|\?\?/;
    jQuery.ajaxSetup({
        jsonp: "callback",
        jsonpCallback: function() {
            var callback = oldCallbacks.pop() || jQuery.expando + "_" + ajax_nonce++;
            this[callback] = true;
            return callback
        }
    });
    jQuery.ajaxPrefilter("json jsonp", function(s, originalSettings, jqXHR) {
        var callbackName, overwritten, responseContainer, jsonProp = s.jsonp !== false && (rjsonp.test(s.url) ? "url" : typeof s.data === "string"&&!(s.contentType || "").indexOf("application/x-www-form-urlencoded") && rjsonp.test(s.data) && "data");
        if (jsonProp || s.dataTypes[0] === "jsonp") {
            callbackName = s.jsonpCallback = jQuery.isFunction(s.jsonpCallback) ? s.jsonpCallback() : s.jsonpCallback;
            if (jsonProp) {
                s[jsonProp] = s[jsonProp].replace(rjsonp, "$1" + callbackName)
            } else if (s.jsonp !== false) {
                s.url += (ajax_rquery.test(s.url) ? "&" : "?") + s.jsonp + "=" + callbackName
            }
            s.converters["script json"] = function() {
                if (!responseContainer) {
                    jQuery.error(callbackName + " was not called")
                }
                return responseContainer[0]
            };
            s.dataTypes[0] = "json";
            overwritten = window[callbackName];
            window[callbackName] = function() {
                responseContainer = arguments
            };
            jqXHR.always(function() {
                window[callbackName] = overwritten;
                if (s[callbackName]) {
                    s.jsonpCallback = originalSettings.jsonpCallback;
                    oldCallbacks.push(callbackName)
                }
                if (responseContainer && jQuery.isFunction(overwritten)) {
                    overwritten(responseContainer[0])
                }
                responseContainer = overwritten = undefined
            });
            return "script"
        }
    });
    jQuery.ajaxSettings.xhr = function() {
        try {
            return new XMLHttpRequest
        } catch (e) {}
    };
    var xhrSupported = jQuery.ajaxSettings.xhr(), xhrSuccessStatus = {
        0: 200,
        1223: 204
    }, xhrId = 0, xhrCallbacks = {};
    if (window.ActiveXObject) {
        jQuery(window).on("unload", function() {
            for (var key in xhrCallbacks) {
                xhrCallbacks[key]()
            }
            xhrCallbacks = undefined
        })
    }
    jQuery.support.cors=!!xhrSupported && "withCredentials"in xhrSupported;
    jQuery.support.ajax = xhrSupported=!!xhrSupported;
    jQuery.ajaxTransport(function(options) {
        var callback;
        if (jQuery.support.cors || xhrSupported&&!options.crossDomain) {
            return {
                send: function(headers, complete) {
                    var i, id, xhr = options.xhr();
                    xhr.open(options.type, options.url, options.async, options.username, options.password);
                    if (options.xhrFields) {
                        for (i in options.xhrFields) {
                            xhr[i] = options.xhrFields[i]
                        }
                    }
                    if (options.mimeType && xhr.overrideMimeType) {
                        xhr.overrideMimeType(options.mimeType)
                    }
                    if (!options.crossDomain&&!headers["X-Requested-With"]) {
                        headers["X-Requested-With"] = "XMLHttpRequest"
                    }
                    for (i in headers) {
                        xhr.setRequestHeader(i, headers[i])
                    }
                    callback = function(type) {
                        return function() {
                            if (callback) {
                                delete xhrCallbacks[id];
                                callback = xhr.onload = xhr.onerror = null;
                                if (type === "abort") {
                                    xhr.abort()
                                } else if (type === "error") {
                                    complete(xhr.status || 404, xhr.statusText)
                                } else {
                                    complete(xhrSuccessStatus[xhr.status] || xhr.status, xhr.statusText, typeof xhr.responseText === "string" ? {
                                        text: xhr.responseText
                                    } : undefined, xhr.getAllResponseHeaders())
                                }
                            }
                        }
                    };
                    xhr.onload = callback();
                    xhr.onerror = callback("error");
                    callback = xhrCallbacks[id = xhrId++] = callback("abort");
                    xhr.send(options.hasContent && options.data || null)
                },
                abort: function() {
                    if (callback) {
                        callback()
                    }
                }
            }
        }
    });
    var fxNow, timerId, rfxtypes = /^(?:toggle|show|hide)$/, rfxnum = new RegExp("^(?:([+-])=|)(" + core_pnum + ")([a-z%]*)$", "i"), rrun = /queueHooks$/, animationPrefilters = [defaultPrefilter], tweeners = {
        "*": [function(prop, value) {
            var tween = this.createTween(prop, value), target = tween.cur(), parts = rfxnum.exec(value), unit = parts && parts[3] || (jQuery.cssNumber[prop] ? "" : "px"), start = (jQuery.cssNumber[prop] || unit !== "px"&&+target) && rfxnum.exec(jQuery.css(tween.elem, prop)), scale = 1, maxIterations = 20;
            if (start && start[3] !== unit) {
                unit = unit || start[3];
                parts = parts || [];
                start =+ target || 1;
                do {
                    scale = scale || ".5";
                    start = start / scale;
                    jQuery.style(tween.elem, prop, start + unit)
                }
                while (scale !== (scale = tween.cur() / target) && scale !== 1&&--maxIterations)
                }
            if (parts) {
                start = tween.start =+ start||+target || 0;
                tween.unit = unit;
                tween.end = parts[1] ? start + (parts[1] + 1) * parts[2] : + parts[2]
            }
            return tween
        }
        ]
    };
    function createFxNow() {
        setTimeout(function() {
            fxNow = undefined
        });
        return fxNow = jQuery.now()
    }
    function createTween(value, prop, animation) {
        var tween, collection = (tweeners[prop] || []).concat(tweeners["*"]),
        index = 0,
        length = collection.length;
        for (;
        index < length;
        index++) {
            if (tween = collection[index].call(animation,
            prop,
            value)) {
                return tween
            }
        }
    }
    function Animation(elem, properties, options) {
        var result, stopped, index = 0, length = animationPrefilters.length, deferred = jQuery.Deferred().always(function() {
            delete tick.elem
        }), tick = function() {
            if (stopped) {
                return false
            }
            var currentTime = fxNow || createFxNow(), remaining = Math.max(0, animation.startTime + animation.duration - currentTime), temp = remaining / animation.duration || 0, percent = 1 - temp, index = 0, length = animation.tweens.length;
            for (; index < length; index++) {
                animation.tweens[index].run(percent)
            }
            deferred.notifyWith(elem, [animation, percent, remaining]);
            if (percent < 1 && length) {
                return remaining
            } else {
                deferred.resolveWith(elem, [animation]);
                return false
            }
        }, animation = deferred.promise({
            elem: elem,
            props: jQuery.extend({}, properties),
            opts: jQuery.extend(true, {
                specialEasing: {}
            }, options),
            originalProperties: properties,
            originalOptions: options,
            startTime: fxNow || createFxNow(),
            duration: options.duration,
            tweens: [],
            createTween: function(prop, end) {
                var tween = jQuery.Tween(elem, animation.opts, prop, end, animation.opts.specialEasing[prop] || animation.opts.easing);
                animation.tweens.push(tween);
                return tween
            },
            stop: function(gotoEnd) {
                var index = 0, length = gotoEnd ? animation.tweens.length: 0;
                if (stopped) {
                    return this
                }
                stopped = true;
                for (; index < length; index++) {
                    animation.tweens[index].run(1)
                }
                if (gotoEnd) {
                    deferred.resolveWith(elem, [animation, gotoEnd])
                } else {
                    deferred.rejectWith(elem, [animation, gotoEnd])
                }
                return this
            }
        }), props = animation.props;
        propFilter(props, animation.opts.specialEasing);
        for (; index < length; index++) {
            result = animationPrefilters[index].call(animation, elem, props, animation.opts);
            if (result) {
                return result
            }
        }
        jQuery.map(props, createTween, animation);
        if (jQuery.isFunction(animation.opts.start)) {
            animation.opts.start.call(elem, animation)
        }
        jQuery.fx.timer(jQuery.extend(tick, {
            elem: elem,
            anim: animation,
            queue: animation.opts.queue
        }));
        return animation.progress(animation.opts.progress).done(animation.opts.done, animation.opts.complete).fail(animation.opts.fail).always(animation.opts.always)
    }
    function propFilter(props, specialEasing) {
        var index, name, easing, value, hooks;
        for (index in props) {
            name = jQuery.camelCase(index);
            easing = specialEasing[name];
            value = props[index];
            if (jQuery.isArray(value)) {
                easing = value[1];
                value = props[index] = value[0]
            }
            if (index !== name) {
                props[name] = value;
                delete props[index]
            }
            hooks = jQuery.cssHooks[name];
            if (hooks && "expand"in hooks) {
                value = hooks.expand(value);
                delete props[name];
                for (index in value) {
                    if (!(index in props)) {
                        props[index] = value[index];
                        specialEasing[index] = easing
                    }
                }
            } else {
                specialEasing[name] = easing
            }
        }
    }
    jQuery.Animation = jQuery.extend(Animation, {
        tweener: function(props, callback) {
            if (jQuery.isFunction(props)) {
                callback = props;
                props = ["*"]
            } else {
                props = props.split(" ")
            }
            var prop, index = 0, length = props.length;
            for (; index < length; index++) {
                prop = props[index];
                tweeners[prop] = tweeners[prop] || [];
                tweeners[prop].unshift(callback)
            }
        },
        prefilter: function(callback, prepend) {
            if (prepend) {
                animationPrefilters.unshift(callback)
            } else {
                animationPrefilters.push(callback)
            }
        }
    });
    function defaultPrefilter(elem, props, opts) {
        var prop, value, toggle, tween, hooks, oldfire, anim = this, orig = {}, style = elem.style, hidden = elem.nodeType && isHidden(elem), dataShow = data_priv.get(elem, "fxshow");
        if (!opts.queue) {
            hooks = jQuery._queueHooks(elem, "fx");
            if (hooks.unqueued == null) {
                hooks.unqueued = 0;
                oldfire = hooks.empty.fire;
                hooks.empty.fire = function() {
                    if (!hooks.unqueued) {
                        oldfire()
                    }
                }
            }
            hooks.unqueued++;
            anim.always(function() {
                anim.always(function() {
                    hooks.unqueued--;
                    if (!jQuery.queue(elem, "fx").length) {
                        hooks.empty.fire()
                    }
                })
            })
        }
        if (elem.nodeType === 1 && ("height"in props || "width"in props)) {
            opts.overflow = [style.overflow, style.overflowX, style.overflowY];
            if (jQuery.css(elem, "display") === "inline" && jQuery.css(elem, "float") === "none") {
                style.display = "inline-block"
            }
        }
        if (opts.overflow) {
            style.overflow = "hidden";
            anim.always(function() {
                style.overflow = opts.overflow[0];
                style.overflowX = opts.overflow[1];
                style.overflowY = opts.overflow[2]
            })
        }
        for (prop in props) {
            value = props[prop];
            if (rfxtypes.exec(value)) {
                delete props[prop];
                toggle = toggle || value === "toggle";
                if (value === (hidden ? "hide" : "show")) {
                    if (value === "show" && dataShow && dataShow[prop] !== undefined) {
                        hidden = true
                    } else {
                        continue
                    }
                }
                orig[prop] = dataShow && dataShow[prop] || jQuery.style(elem, prop)
            }
        }
        if (!jQuery.isEmptyObject(orig)) {
            if (dataShow) {
                if ("hidden"in dataShow) {
                    hidden = dataShow.hidden
                }
            } else {
                dataShow = data_priv.access(elem, "fxshow", {})
            }
            if (toggle) {
                dataShow.hidden=!hidden
            }
            if (hidden) {
                jQuery(elem).show()
            } else {
                anim.done(function() {
                    jQuery(elem).hide()
                })
            }
            anim.done(function() {
                var prop;
                data_priv.remove(elem, "fxshow");
                for (prop in orig) {
                    jQuery.style(elem, prop, orig[prop])
                }
            });
            for (prop in orig) {
                tween = createTween(hidden ? dataShow[prop] : 0, prop, anim);
                if (!(prop in dataShow)) {
                    dataShow[prop] = tween.start;
                    if (hidden) {
                        tween.end = tween.start;
                        tween.start = prop === "width" || prop === "height" ? 1 : 0
                    }
                }
            }
        }
    }
    function Tween(elem, options, prop, end, easing) {
        return new Tween.prototype.init(elem, options, prop, end, easing)
    }
    jQuery.Tween = Tween;
    Tween.prototype = {
        constructor: Tween,
        init: function(elem, options, prop, end, easing, unit) {
            this.elem = elem;
            this.prop = prop;
            this.easing = easing || "swing";
            this.options = options;
            this.start = this.now = this.cur();
            this.end = end;
            this.unit = unit || (jQuery.cssNumber[prop] ? "" : "px")
        },
        cur: function() {
            var hooks = Tween.propHooks[this.prop];
            return hooks && hooks.get ? hooks.get(this) : Tween.propHooks._default.get(this)
        },
        run: function(percent) {
            var eased, hooks = Tween.propHooks[this.prop];
            if (this.options.duration) {
                this.pos = eased = jQuery.easing[this.easing](percent, this.options.duration * percent, 0, 1, this.options.duration)
            } else {
                this.pos = eased = percent
            }
            this.now = (this.end - this.start) * eased + this.start;
            if (this.options.step) {
                this.options.step.call(this.elem, this.now, this)
            }
            if (hooks && hooks.set) {
                hooks.set(this)
            } else {
                Tween.propHooks._default.set(this)
            }
            return this
        }
    };
    Tween.prototype.init.prototype = Tween.prototype;
    Tween.propHooks = {
        _default: {
            get: function(tween) {
                var result;
                if (tween.elem[tween.prop] != null && (!tween.elem.style || tween.elem.style[tween.prop] == null)) {
                    return tween.elem[tween.prop]
                }
                result = jQuery.css(tween.elem, tween.prop, "");
                return !result || result === "auto" ? 0 : result
            },
            set: function(tween) {
                if (jQuery.fx.step[tween.prop]) {
                    jQuery.fx.step[tween.prop](tween)
                } else if (tween.elem.style && (tween.elem.style[jQuery.cssProps[tween.prop]] != null || jQuery.cssHooks[tween.prop])) {
                    jQuery.style(tween.elem, tween.prop, tween.now + tween.unit)
                } else {
                    tween.elem[tween.prop] = tween.now
                }
            }
        }
    };
    Tween.propHooks.scrollTop = Tween.propHooks.scrollLeft = {
        set: function(tween) {
            if (tween.elem.nodeType && tween.elem.parentNode) {
                tween.elem[tween.prop] = tween.now
            }
        }
    };
    jQuery.each(["toggle", "show", "hide"], function(i, name) {
        var cssFn = jQuery.fn[name];
        jQuery.fn[name] = function(speed, easing, callback) {
            return speed == null || typeof speed === "boolean" ? cssFn.apply(this, arguments) : this.animate(genFx(name, true), speed, easing, callback)
        }
    });
    jQuery.fn.extend({
        fadeTo: function(speed, to, easing, callback) {
            return this.filter(isHidden).css("opacity", 0).show().end().animate({
                opacity: to
            }, speed, easing, callback)
        },
        animate: function(prop, speed, easing, callback) {
            var empty = jQuery.isEmptyObject(prop), optall = jQuery.speed(speed, easing, callback), doAnimation = function() {
                var anim = Animation(this, jQuery.extend({}, prop), optall);
                if (empty || data_priv.get(this, "finish")) {
                    anim.stop(true)
                }
            };
            doAnimation.finish = doAnimation;
            return empty || optall.queue === false ? this.each(doAnimation) : this.queue(optall.queue, doAnimation)
        },
        stop: function(type, clearQueue, gotoEnd) {
            var stopQueue = function(hooks) {
                var stop = hooks.stop;
                delete hooks.stop;
                stop(gotoEnd)
            };
            if (typeof type !== "string") {
                gotoEnd = clearQueue;
                clearQueue = type;
                type = undefined
            }
            if (clearQueue && type !== false) {
                this.queue(type || "fx", [])
            }
            return this.each(function() {
                var dequeue = true, index = type != null && type + "queueHooks", timers = jQuery.timers, data = data_priv.get(this);
                if (index) {
                    if (data[index] && data[index].stop) {
                        stopQueue(data[index])
                    }
                } else {
                    for (index in data) {
                        if (data[index] && data[index].stop && rrun.test(index)) {
                            stopQueue(data[index])
                        }
                    }
                }
                for (index = timers.length; index--;) {
                    if (timers[index].elem === this && (type == null || timers[index].queue === type)) {
                        timers[index].anim.stop(gotoEnd);
                        dequeue = false;
                        timers.splice(index, 1)
                    }
                }
                if (dequeue ||!gotoEnd) {
                    jQuery.dequeue(this, type)
                }
            })
        },
        finish: function(type) {
            if (type !== false) {
                type = type || "fx"
            }
            return this.each(function() {
                var index, data = data_priv.get(this), queue = data[type + "queue"], hooks = data[type + "queueHooks"], timers = jQuery.timers, length = queue ? queue.length: 0;
                data.finish = true;
                jQuery.queue(this, type, []);
                if (hooks && hooks.stop) {
                    hooks.stop.call(this, true)
                }
                for (index = timers.length; index--;) {
                    if (timers[index].elem === this && timers[index].queue === type) {
                        timers[index].anim.stop(true);
                        timers.splice(index, 1)
                    }
                }
                for (index = 0; index < length; index++) {
                    if (queue[index] && queue[index].finish) {
                        queue[index].finish.call(this)
                    }
                }
                delete data.finish
            })
        }
    });
    function genFx(type, includeWidth) {
        var which, attrs = {
            height: type
        }, i = 0;
        includeWidth = includeWidth ? 1 : 0;
        for (; i < 4; i += 2 - includeWidth) {
            which = cssExpand[i];
            attrs["margin" + which] = attrs["padding" + which] = type
        }
        if (includeWidth) {
            attrs.opacity = attrs.width = type
        }
        return attrs
    }
    jQuery.each({
        slideDown: genFx("show"),
        slideUp: genFx("hide"),
        slideToggle: genFx("toggle"),
        fadeIn: {
            opacity: "show"
        },
        fadeOut: {
            opacity: "hide"
        },
        fadeToggle: {
            opacity: "toggle"
        }
    }, function(name, props) {
        jQuery.fn[name] = function(speed, easing, callback) {
            return this.animate(props, speed, easing, callback)
        }
    });
    jQuery.speed = function(speed, easing, fn) {
        var opt = speed && typeof speed === "object" ? jQuery.extend({}, speed): {
            complete: fn ||!fn && easing || jQuery.isFunction(speed) && speed,
            duration: speed,
            easing: fn && easing || easing&&!jQuery.isFunction(easing) && easing
        };
        opt.duration = jQuery.fx.off ? 0 : typeof opt.duration === "number" ? opt.duration : opt.duration in jQuery.fx.speeds ? jQuery.fx.speeds[opt.duration] : jQuery.fx.speeds._default;
        if (opt.queue == null || opt.queue === true) {
            opt.queue = "fx"
        }
        opt.old = opt.complete;
        opt.complete = function() {
            if (jQuery.isFunction(opt.old)) {
                opt.old.call(this)
            }
            if (opt.queue) {
                jQuery.dequeue(this, opt.queue)
            }
        };
        return opt
    };
    jQuery.easing = {
        linear: function(p) {
            return p
        },
        swing: function(p) {
            return .5 - Math.cos(p * Math.PI) / 2
        }
    };
    jQuery.timers = [];
    jQuery.fx = Tween.prototype.init;
    jQuery.fx.tick = function() {
        var timer, timers = jQuery.timers, i = 0;
        fxNow = jQuery.now();
        for (; i < timers.length; i++) {
            timer = timers[i];
            if (!timer() && timers[i] === timer) {
                timers.splice(i--, 1)
            }
        }
        if (!timers.length) {
            jQuery.fx.stop()
        }
        fxNow = undefined
    };
    jQuery.fx.timer = function(timer) {
        if (timer() && jQuery.timers.push(timer)) {
            jQuery.fx.start()
        }
    };
    jQuery.fx.interval = 13;
    jQuery.fx.start = function() {
        if (!timerId) {
            timerId = setInterval(jQuery.fx.tick, jQuery.fx.interval)
        }
    };
    jQuery.fx.stop = function() {
        clearInterval(timerId);
        timerId = null
    };
    jQuery.fx.speeds = {
        slow: 600,
        fast: 200,
        _default: 400
    };
    jQuery.fx.step = {};
    if (jQuery.expr && jQuery.expr.filters) {
        jQuery.expr.filters.animated = function(elem) {
            return jQuery.grep(jQuery.timers, function(fn) {
                return elem === fn.elem
            }).length
        }
    }
    jQuery.fn.offset = function(options) {
        if (arguments.length) {
            return options === undefined ? this : this.each(function(i) {
                jQuery.offset.setOffset(this, options, i)
            })
        }
        var docElem, win, elem = this[0], box = {
            top: 0,
            left: 0
        }, doc = elem && elem.ownerDocument;
        if (!doc) {
            return 
        }
        docElem = doc.documentElement;
        if (!jQuery.contains(docElem, elem)) {
            return box
        }
        if (typeof elem.getBoundingClientRect !== core_strundefined) {
            box = elem.getBoundingClientRect()
        }
        win = getWindow(doc);
        return {
            top: box.top + win.pageYOffset - docElem.clientTop,
            left: box.left + win.pageXOffset - docElem.clientLeft
        }
    };
    jQuery.offset = {
        setOffset: function(elem, options, i) {
            var curPosition, curLeft, curCSSTop, curTop, curOffset, curCSSLeft, calculatePosition, position = jQuery.css(elem, "position"), curElem = jQuery(elem), props = {};
            if (position === "static") {
                elem.style.position = "relative"
            }
            curOffset = curElem.offset();
            curCSSTop = jQuery.css(elem, "top");
            curCSSLeft = jQuery.css(elem, "left");
            calculatePosition = (position === "absolute" || position === "fixed") && (curCSSTop + curCSSLeft).indexOf("auto")>-1;
            if (calculatePosition) {
                curPosition = curElem.position();
                curTop = curPosition.top;
                curLeft = curPosition.left
            } else {
                curTop = parseFloat(curCSSTop) || 0;
                curLeft = parseFloat(curCSSLeft) || 0
            }
            if (jQuery.isFunction(options)) {
                options = options.call(elem, i, curOffset)
            }
            if (options.top != null) {
                props.top = options.top - curOffset.top + curTop
            }
            if (options.left != null) {
                props.left = options.left - curOffset.left + curLeft
            }
            if ("using"in options) {
                options.using.call(elem, props)
            } else {
                curElem.css(props)
            }
        }
    };
    jQuery.fn.extend({
        position: function() {
            if (!this[0]) {
                return 
            }
            var offsetParent, offset, elem = this[0], parentOffset = {
                top: 0,
                left: 0
            };
            if (jQuery.css(elem, "position") === "fixed") {
                offset = elem.getBoundingClientRect()
            } else {
                offsetParent = this.offsetParent();
                offset = this.offset();
                if (!jQuery.nodeName(offsetParent[0], "html")) {
                    parentOffset = offsetParent.offset()
                }
                parentOffset.top += jQuery.css(offsetParent[0], "borderTopWidth", true);
                parentOffset.left += jQuery.css(offsetParent[0], "borderLeftWidth", true)
            }
            return {
                top: offset.top - parentOffset.top - jQuery.css(elem, "marginTop", true),
                left: offset.left - parentOffset.left - jQuery.css(elem, "marginLeft", true)
            }
        },
        offsetParent: function() {
            return this.map(function() {
                var offsetParent = this.offsetParent || docElem;
                while (offsetParent && (!jQuery.nodeName(offsetParent, "html") && jQuery.css(offsetParent, "position") === "static")) {
                    offsetParent = offsetParent.offsetParent
                }
                return offsetParent || docElem
            })
        }
    });
    jQuery.each({
        scrollLeft: "pageXOffset",
        scrollTop: "pageYOffset"
    }, function(method, prop) {
        var top = "pageYOffset" === prop;
        jQuery.fn[method] = function(val) {
            return jQuery.access(this, function(elem, method, val) {
                var win = getWindow(elem);
                if (val === undefined) {
                    return win ? win[prop] : elem[method]
                }
                if (win) {
                    win.scrollTo(!top ? val : window.pageXOffset, top ? val : window.pageYOffset)
                } else {
                    elem[method] = val
                }
            }, method, val, arguments.length, null)
        }
    });
    function getWindow(elem) {
        return jQuery.isWindow(elem) ? elem : elem.nodeType === 9 && elem.defaultView
    }
    jQuery.each({
        Height: "height",
        Width: "width"
    }, function(name, type) {
        jQuery.each({
            padding: "inner" + name,
            content: type,
            "": "outer" + name
        }, function(defaultExtra, funcName) {
            jQuery.fn[funcName] = function(margin, value) {
                var chainable = arguments.length && (defaultExtra || typeof margin !== "boolean"), extra = defaultExtra || (margin === true || value === true ? "margin" : "border");
                return jQuery.access(this, function(elem, type, value) {
                    var doc;
                    if (jQuery.isWindow(elem)) {
                        return elem.document.documentElement["client" + name]
                    }
                    if (elem.nodeType === 9) {
                        doc = elem.documentElement;
                        return Math.max(elem.body["scroll" + name], doc["scroll" + name], elem.body["offset" + name], doc["offset" + name], doc["client" + name])
                    }
                    return value === undefined ? jQuery.css(elem, type, extra) : jQuery.style(elem, type, value, extra)
                }, type, chainable ? margin : undefined, chainable, null)
            }
        })
    });
    jQuery.fn.size = function() {
        return this.length
    };
    jQuery.fn.andSelf = jQuery.fn.addBack;
    if (typeof module === "object" && module && typeof module.exports === "object") {
        module.exports = jQuery
    } else {
        if (typeof define === "function" && define.amd) {
            define("jquery", [], function() {
                return jQuery
            })
        }
    }
    if (typeof window === "object" && typeof window.document === "object") {
        window.jQuery = window.$ = jQuery
    }
})(window);
(function() {
    var undefined;
    var arrayPool = [], objectPool = [];
    var idCounter = 0;
    var keyPrefix =+ new Date + "";
    var largeArraySize = 75;
    var maxPoolSize = 40;
    var whitespace = " 	\f ﻿" + "\n\r\u2028\u2029" + " ᠎             　";
    var reEmptyStringLeading = /\b__p \+= '';/g, reEmptyStringMiddle = /\b(__p \+=) '' \+/g, reEmptyStringTrailing = /(__e\(.*?\)|\b__t\)) \+\n'';/g;
    var reEsTemplate = /\$\{([^\\}]*(?:\\.[^\\}]*)*)\}/g;
    var reFlags = /\w*$/;
    var reFuncName = /^function[ \n\r\t]+\w/;
    var reInterpolate = /<%=([\s\S]+?)%>/g;
    var reLeadingSpacesAndZeros = RegExp("^[" + whitespace + "]*0+(?=.$)");
    var reNoMatch = /($^)/;
    var reThis = /\bthis\b/;
    var reUnescapedString = /['\n\r\t\u2028\u2029\\]/g;
    var contextProps = ["Array", "Boolean", "Date", "Function", "Math", "Number", "Object", "RegExp", "String", "_", "attachEvent", "clearTimeout", "isFinite", "isNaN", "parseInt", "setImmediate", "setTimeout"];
    var templateCounter = 0;
    var argsClass = "[object Arguments]", arrayClass = "[object Array]", boolClass = "[object Boolean]", dateClass = "[object Date]", funcClass = "[object Function]", numberClass = "[object Number]", objectClass = "[object Object]", regexpClass = "[object RegExp]", stringClass = "[object String]";
    var cloneableClasses = {};
    cloneableClasses[funcClass] = false;
    cloneableClasses[argsClass] = cloneableClasses[arrayClass] = cloneableClasses[boolClass] = cloneableClasses[dateClass] = cloneableClasses[numberClass] = cloneableClasses[objectClass] = cloneableClasses[regexpClass] = cloneableClasses[stringClass] = true;
    var debounceOptions = {
        leading: false,
        maxWait: 0,
        trailing: false
    };
    var descriptor = {
        configurable: false,
        enumerable: false,
        value: null,
        writable: false
    };
    var objectTypes = {
        "boolean": false,
        "function": true,
        object: true,
        number: false,
        string: false,
        undefined: false
    };
    var stringEscapes = {
        "\\": "\\",
        "'": "'",
        "\n": "n",
        "\r": "r",
        "	": "t",
        "\u2028": "u2028",
        "\u2029": "u2029"
    };
    var root = objectTypes[typeof window] && window || this;
    var freeExports = objectTypes[typeof exports] && exports&&!exports.nodeType && exports;
    var freeModule = objectTypes[typeof module] && module&&!module.nodeType && module;
    var moduleExports = freeModule && freeModule.exports === freeExports && freeExports;
    var freeGlobal = objectTypes[typeof global] && global;
    if (freeGlobal && (freeGlobal.global === freeGlobal || freeGlobal.window === freeGlobal)) {
        root = freeGlobal
    }
    function baseIndexOf(array, value, fromIndex) {
        var index = (fromIndex || 0) - 1, length = array ? array.length: 0;
        while (++index < length) {
            if (array[index] === value) {
                return index
            }
        }
        return - 1
    }
    function cacheIndexOf(cache, value) {
        var type = typeof value;
        cache = cache.cache;
        if (type == "boolean" || value == null) {
            return cache[value] ? 0 : - 1
        }
        if (type != "number" && type != "string") {
            type = "object"
        }
        var key = type == "number" ? value: keyPrefix + value;
        cache = (cache = cache[type]) && cache[key];
        return type == "object" ? cache && baseIndexOf(cache, value)>-1 ? 0 : - 1 : cache ? 0 : - 1
    }
    function cachePush(value) {
        var cache = this.cache, type = typeof value;
        if (type == "boolean" || value == null) {
            cache[value] = true
        } else {
            if (type != "number" && type != "string") {
                type = "object"
            }
            var key = type == "number" ? value: keyPrefix + value, typeCache = cache[type] || (cache[type] = {});
            if (type == "object") {
                (typeCache[key] || (typeCache[key] = [])).push(value)
            } else {
                typeCache[key] = true
            }
        }
    }
    function charAtCallback(value) {
        return value.charCodeAt(0)
    }
    function compareAscending(a, b) {
        var ac = a.criteria, bc = b.criteria;
        if (ac !== bc) {
            if (ac > bc || typeof ac == "undefined") {
                return 1
            }
            if (ac < bc || typeof bc == "undefined") {
                return - 1
            }
        }
        return a.index - b.index
    }
    function createCache(array) {
        var index =- 1, length = array.length, first = array[0], mid = array[length / 2 | 0], last = array[length - 1];
        if (first && typeof first == "object" && mid && typeof mid == "object" && last && typeof last == "object") {
            return false
        }
        var cache = getObject();
        cache["false"] = cache["null"] = cache["true"] = cache["undefined"] = false;
        var result = getObject();
        result.array = array;
        result.cache = cache;
        result.push = cachePush;
        while (++index < length) {
            result.push(array[index])
        }
        return result
    }
    function escapeStringChar(match) {
        return "\\" + stringEscapes[match]
    }
    function getArray() {
        return arrayPool.pop() || []
    }
    function getObject() {
        return objectPool.pop() || {
            array: null,
            cache: null,
            criteria: null,
            "false": false,
            index: 0,
            "null": false,
            number: null,
            object: null,
            push: null,
            string: null,
            "true": false,
            undefined: false,
            value: null
        }
    }
    function noop() {}
    function releaseArray(array) {
        array.length = 0;
        if (arrayPool.length < maxPoolSize) {
            arrayPool.push(array)
        }
    }
    function releaseObject(object) {
        var cache = object.cache;
        if (cache) {
            releaseObject(cache)
        }
        object.array = object.cache = object.criteria = object.object = object.number = object.string = object.value = null;
        if (objectPool.length < maxPoolSize) {
            objectPool.push(object)
        }
    }
    function slice(array, start, end) {
        start || (start = 0);
        if (typeof end == "undefined") {
            end = array ? array.length : 0
        }
        var index =- 1, length = end - start || 0, result = Array(length < 0 ? 0 : length);
        while (++index < length) {
            result[index] = array[start + index]
        }
        return result
    }
    function runInContext(context) {
        context = context ? _.defaults(root.Object(), context, _.pick(root, contextProps)) : root;
        var Array = context.Array, Boolean = context.Boolean, Date = context.Date, Function = context.Function, Math = context.Math, Number = context.Number, Object = context.Object, RegExp = context.RegExp, String = context.String, TypeError = context.TypeError;
        var arrayRef = [];
        var objectProto = Object.prototype;
        var oldDash = context._;
        var reNative = RegExp("^" + String(objectProto.valueOf).replace(/[.*+?^${}()|[\]\\]/g, "\\$&").replace(/valueOf|for [^\]]+/g, ".+?") + "$");
        var ceil = Math.ceil, clearTimeout = context.clearTimeout, floor = Math.floor, fnToString = Function.prototype.toString, getPrototypeOf = reNative.test(getPrototypeOf = Object.getPrototypeOf) && getPrototypeOf, hasOwnProperty = objectProto.hasOwnProperty, now = reNative.test(now = Date.now) && now || function() {
            return + new Date
        }, push = arrayRef.push, setImmediate = context.setImmediate, setTimeout = context.setTimeout, splice = arrayRef.splice, toString = objectProto.toString, unshift = arrayRef.unshift;
        var defineProperty = function() {
            try {
                var o = {}, func = reNative.test(func = Object.defineProperty) && func, result = func(o, o, o) && func
            } catch (e) {}
            return result
        }();
        var nativeBind = reNative.test(nativeBind = toString.bind) && nativeBind, nativeCreate = reNative.test(nativeCreate = Object.create) && nativeCreate, nativeIsArray = reNative.test(nativeIsArray = Array.isArray) && nativeIsArray, nativeIsFinite = context.isFinite, nativeIsNaN = context.isNaN, nativeKeys = reNative.test(nativeKeys = Object.keys) && nativeKeys, nativeMax = Math.max, nativeMin = Math.min, nativeParseInt = context.parseInt, nativeRandom = Math.random, nativeSlice = arrayRef.slice;
        var isIeOpera = reNative.test(context.attachEvent), isV8 = nativeBind&&!/\n|true/.test(nativeBind + isIeOpera);
        var ctorByClass = {};
        ctorByClass[arrayClass] = Array;
        ctorByClass[boolClass] = Boolean;
        ctorByClass[dateClass] = Date;
        ctorByClass[funcClass] = Function;
        ctorByClass[objectClass] = Object;
        ctorByClass[numberClass] = Number;
        ctorByClass[regexpClass] = RegExp;
        ctorByClass[stringClass] = String;
        function lodash(value) {
            return value && typeof value == "object"&&!isArray(value) && hasOwnProperty.call(value, "__wrapped__") ? value : new lodashWrapper(value)
        }
        function lodashWrapper(value, chainAll) {
            this.__chain__=!!chainAll;
            this.__wrapped__ = value
        }
        lodashWrapper.prototype = lodash.prototype;
        var support = lodash.support = {};
        support.fastBind = nativeBind&&!isV8;
        support.funcDecomp=!reNative.test(context.WinRTError) && reThis.test(runInContext);
        support.funcNames = typeof Function.name == "string";
        lodash.templateSettings = {
            escape: /<%-([\s\S]+?)%>/g,
            evaluate: /<%([\s\S]+?)%>/g,
            interpolate: reInterpolate,
            variable: "",
            imports: {
                _: lodash
            }
        };
        function baseClone(value, deep, callback, stackA, stackB) {
            if (callback) {
                var result = callback(value);
                if (typeof result != "undefined") {
                    return result
                }
            }
            var isObj = isObject(value);
            if (isObj) {
                var className = toString.call(value);
                if (!cloneableClasses[className]) {
                    return value
                }
                var ctor = ctorByClass[className];
                switch (className) {
                case boolClass:
                case dateClass:
                    return new ctor( + value);
                case numberClass:
                case stringClass:
                    return new ctor(value);
                case regexpClass:
                    result = ctor(value.source, reFlags.exec(value));
                    result.lastIndex = value.lastIndex;
                    return result
                }
            } else {
                return value
            }
            var isArr = isArray(value);
            if (deep) {
                var initedStack=!stackA;
                stackA || (stackA = getArray());
                stackB || (stackB = getArray());
                var length = stackA.length;
                while (length--) {
                    if (stackA[length] == value) {
                        return stackB[length]
                    }
                }
                result = isArr ? ctor(value.length) : {}
            } else {
                result = isArr ? slice(value) : assign({}, value)
            }
            if (isArr) {
                if (hasOwnProperty.call(value, "index")) {
                    result.index = value.index
                }
                if (hasOwnProperty.call(value, "input")) {
                    result.input = value.input
                }
            }
            if (!deep) {
                return result
            }
            stackA.push(value);
            stackB.push(result);
            (isArr ? forEach : forOwn)(value, function(objValue, key) {
                result[key] = baseClone(objValue, deep, callback, stackA, stackB)
            });
            if (initedStack) {
                releaseArray(stackA);
                releaseArray(stackB)
            }
            return result
        }
        function baseCreateCallback(func, thisArg, argCount) {
            if (typeof func != "function") {
                return identity
            }
            if (typeof thisArg == "undefined") {
                return func
            }
            var bindData = func.__bindData__ || support.funcNames&&!func.name;
            if (typeof bindData == "undefined") {
                var source = reThis && fnToString.call(func);
                if (!support.funcNames && source&&!reFuncName.test(source)) {
                    bindData = true
                }
                if (support.funcNames ||!bindData) {
                    bindData=!support.funcDecomp || reThis.test(source);
                    setBindData(func, bindData)
                }
            }
            if (bindData !== true && (bindData && bindData[1] & 1)) {
                return func
            }
            switch (argCount) {
            case 1:
                return function(value) {
                    return func.call(thisArg, value)
                };
            case 2:
                return function(a, b) {
                    return func.call(thisArg, a, b)
                };
            case 3:
                return function(value, index, collection) {
                    return func.call(thisArg, value, index, collection)
                };
            case 4:
                return function(accumulator, value, index, collection) {
                    return func.call(thisArg, accumulator, value, index, collection)
                }
            }
            return bind(func, thisArg)
        }
        function baseFlatten(array, isShallow, isArgArrays, fromIndex) {
            var index = (fromIndex || 0) - 1, length = array ? array.length: 0, result = [];
            while (++index < length) {
                var value = array[index];
                if (value && typeof value == "object" && typeof value.length == "number" && (isArray(value) || isArguments(value))) {
                    if (!isShallow) {
                        value = baseFlatten(value, isShallow, isArgArrays)
                    }
                    var valIndex =- 1, valLength = value.length, resIndex = result.length;
                    result.length += valLength;
                    while (++valIndex < valLength) {
                        result[resIndex++] = value[valIndex]
                    }
                } else if (!isArgArrays) {
                    result.push(value)
                }
            }
            return result
        }
        function baseIsEqual(a, b, callback, isWhere, stackA, stackB) {
            if (callback) {
                var result = callback(a, b);
                if (typeof result != "undefined") {
                    return !!result
                }
            }
            if (a === b) {
                return a !== 0 || 1 / a == 1 / b
            }
            var type = typeof a, otherType = typeof b;
            if (a === a&&!(a && objectTypes[type])&&!(b && objectTypes[otherType])) {
                return false
            }
            if (a == null || b == null) {
                return a === b
            }
            var className = toString.call(a), otherClass = toString.call(b);
            if (className == argsClass) {
                className = objectClass
            }
            if (otherClass == argsClass) {
                otherClass = objectClass
            }
            if (className != otherClass) {
                return false
            }
            switch (className) {
            case boolClass:
            case dateClass:
                return + a ==+ b;
            case numberClass:
                return a!=+a ? b!=+b : a == 0 ? 1 / a == 1 / b : a ==+ b;
            case regexpClass:
            case stringClass:
                return a == String(b)
            }
            var isArr = className == arrayClass;
            if (!isArr) {
                if (hasOwnProperty.call(a, "__wrapped__ ") || hasOwnProperty.call(b, "__wrapped__")) {
                    return baseIsEqual(a.__wrapped__ || a, b.__wrapped__ || b, callback, isWhere, stackA, stackB)
                }
                if (className != objectClass) {
                    return false
                }
                var ctorA = a.constructor, ctorB = b.constructor;
                if (ctorA != ctorB&&!(isFunction(ctorA) && ctorA instanceof ctorA && isFunction(ctorB) && ctorB instanceof ctorB)) {
                    return false
                }
            }
            var initedStack=!stackA;
            stackA || (stackA = getArray());
            stackB || (stackB = getArray());
            var length = stackA.length;
            while (length--) {
                if (stackA[length] == a) {
                    return stackB[length] == b
                }
            }
            var size = 0;
            result = true;
            stackA.push(a);
            stackB.push(b);
            if (isArr) {
                length = a.length;
                size = b.length;
                result = size == a.length;
                if (!result&&!isWhere) {
                    return result
                }
                while (size--) {
                    var index = length, value = b[size];
                    if (isWhere) {
                        while (index--) {
                            if (result = baseIsEqual(a[index], value, callback, isWhere, stackA, stackB)) {
                                break
                            }
                        }
                    } else if (!(result = baseIsEqual(a[size], value, callback, isWhere, stackA, stackB))) {
                        break
                    }
                }
                return result
            }
            forIn(b, function(value, key, b) {
                if (hasOwnProperty.call(b, key)) {
                    size++;
                    return result = hasOwnProperty.call(a, key) && baseIsEqual(a[key], value, callback, isWhere, stackA, stackB)
                }
            });
            if (result&&!isWhere) {
                forIn(a, function(value, key, a) {
                    if (hasOwnProperty.call(a, key)) {
                        return result=--size>-1
                    }
                })
            }
            if (initedStack) {
                releaseArray(stackA);
                releaseArray(stackB)
            }
            return result
        }
        function baseMerge(object, source, callback, stackA, stackB) {
            (isArray(source) ? forEach : forOwn)(source, function(source, key) {
                var found, isArr, result = source, value = object[key];
                if (source && ((isArr = isArray(source)) || isPlainObject(source))) {
                    var stackLength = stackA.length;
                    while (stackLength--) {
                        if (found = stackA[stackLength] == source) {
                            value = stackB[stackLength];
                            break
                        }
                    }
                    if (!found) {
                        var isShallow;
                        if (callback) {
                            result = callback(value, source);
                            if (isShallow = typeof result != "undefined") {
                                value = result
                            }
                        }
                        if (!isShallow) {
                            value = isArr ? isArray(value) ? value : [] : isPlainObject(value) ? value : {}
                        }
                        stackA.push(source);
                        stackB.push(value);
                        if (!isShallow) {
                            baseMerge(value, source, callback, stackA, stackB)
                        }
                    }
                } else {
                    if (callback) {
                        result = callback(value, source);
                        if (typeof result == "undefined") {
                            result = source
                        }
                    }
                    if (typeof result != "undefined") {
                        value = result
                    }
                }
                object[key] = value
            })
        }
        function baseUniq(array, isSorted, callback) {
            var index =- 1, indexOf = getIndexOf(), length = array ? array.length : 0, result = [];
            var isLarge=!isSorted && length >= largeArraySize && indexOf === baseIndexOf, seen = callback || isLarge ? getArray() : result;
            if (isLarge) {
                var cache = createCache(seen);
                if (cache) {
                    indexOf = cacheIndexOf;
                    seen = cache
                } else {
                    isLarge = false;
                    seen = callback ? seen : (releaseArray(seen), result)
                }
            }
            while (++index < length) {
                var value = array[index], computed = callback ? callback(value, index, array): value;
                if (isSorted?!index || seen[seen.length - 1] !== computed : indexOf(seen, computed) < 0) {
                    if (callback || isLarge) {
                        seen.push(computed)
                    }
                    result.push(value)
                }
            }
            if (isLarge) {
                releaseArray(seen.array);
                releaseObject(seen)
            } else if (callback) {
                releaseArray(seen)
            }
            return result
        }
        function createAggregator(setter) {
            return function(collection, callback, thisArg) {
                var result = {};
                callback = lodash.createCallback(callback, thisArg, 3);
                var index =- 1, length = collection ? collection.length : 0;
                if (typeof length == "number") {
                    while (++index < length) {
                        var value = collection[index];
                        setter(result, value, callback(value, index, collection), collection)
                    }
                } else {
                    forOwn(collection, function(value, key, collection) {
                        setter(result, value, callback(value, key, collection), collection)
                    })
                }
                return result
            }
        }
        function createBound(func, bitmask, partialArgs, partialRightArgs, thisArg, arity) {
            var isBind = bitmask & 1, isBindKey = bitmask & 2, isCurry = bitmask & 4, isCurryBound = bitmask & 8, isPartial = bitmask & 16, isPartialRight = bitmask & 32, key = func;
            if (!isBindKey&&!isFunction(func)) {
                throw new TypeError
            }
            if (isPartial&&!partialArgs.length) {
                bitmask&=~16;
                isPartial = partialArgs = false
            }
            if (isPartialRight&&!partialRightArgs.length) {
                bitmask&=~32;
                isPartialRight = partialRightArgs = false
            }
            var bindData = func && func.__bindData__;
            if (bindData) {
                if (isBind&&!(bindData[1] & 1)) {
                    bindData[4] = thisArg
                }
                if (!isBind && bindData[1] & 1) {
                    bitmask|=8
                }
                if (isCurry&&!(bindData[1] & 4)) {
                    bindData[5] = arity
                }
                if (isPartial) {
                    push.apply(bindData[2] || (bindData[2] = []), partialArgs)
                }
                if (isPartialRight) {
                    push.apply(bindData[3] || (bindData[3] = []), partialRightArgs)
                }
                bindData[1]|=bitmask;
                return createBound.apply(null, bindData)
            }
            if (isBind&&!(isBindKey || isCurry || isPartialRight) && (support.fastBind || nativeBind && isPartial)) {
                if (isPartial) {
                    var args = [thisArg];
                    push.apply(args, partialArgs)
                }
                var bound = isPartial ? nativeBind.apply(func, args): nativeBind.call(func, thisArg)
            } else {
                bound = function() {
                    var args = arguments, thisBinding = isBind ? thisArg: this;
                    if (isCurry || isPartial || isPartialRight) {
                        args = nativeSlice.call(args);
                        if (isPartial) {
                            unshift.apply(args, partialArgs)
                        }
                        if (isPartialRight) {
                            push.apply(args, partialRightArgs)
                        }
                        if (isCurry && args.length < arity) {
                            bitmask|=16&~32;
                            return createBound(func, isCurryBound ? bitmask : bitmask&~3, args, null, thisArg, arity)
                        }
                    }
                    if (isBindKey) {
                        func = thisBinding[key]
                    }
                    if (this instanceof bound) {
                        thisBinding = createObject(func.prototype);
                        var result = func.apply(thisBinding, args);
                        return isObject(result) ? result : thisBinding
                    }
                    return func.apply(thisBinding, args)
                }
            }
            setBindData(bound, nativeSlice.call(arguments));
            return bound
        }
        function createObject(prototype) {
            return isObject(prototype) ? nativeCreate(prototype) : {}
        }
        if (!nativeCreate) {
            createObject = function(prototype) {
                if (isObject(prototype)) {
                    noop.prototype = prototype;
                    var result = new noop;
                    noop.prototype = null
                }
                return result || {}
            }
        }
        function escapeHtmlChar(match) {
            return htmlEscapes[match]
        }
        function getIndexOf() {
            var result = (result = lodash.indexOf) === indexOf ? baseIndexOf: result;
            return result
        }
        var setBindData=!defineProperty ? noop : function(func, value) {
            descriptor.value = value;
            defineProperty(func, "__bindData__", descriptor)
        };
        function shimIsPlainObject(value) {
            var ctor, result;
            if (!(value && toString.call(value) == objectClass) || (ctor = value.constructor, isFunction(ctor)&&!(ctor instanceof ctor))) {
                return false
            }
            forIn(value, function(value, key) {
                result = key
            });
            return typeof result == "undefined" || hasOwnProperty.call(value, result)
        }
        function unescapeHtmlChar(match) {
            return htmlUnescapes[match]
        }
        function isArguments(value) {
            return value && typeof value == "object" && typeof value.length == "number" && toString.call(value) == argsClass || false
        }
        var isArray = nativeIsArray || function(value) {
            return value && typeof value == "object" && typeof value.length == "number" && toString.call(value) == arrayClass || false
        };
        var shimKeys = function(object) {
            var index, iterable = object, result = [];
            if (!iterable)
                return result;
            if (!objectTypes[typeof object])
                return result;
            for (index in iterable) {
                if (hasOwnProperty.call(iterable, index)) {
                    result.push(index)
                }
            }
            return result
        };
        var keys=!nativeKeys ? shimKeys : function(object) {
            if (!isObject(object)) {
                return []
            }
            return nativeKeys(object)
        };
        var htmlEscapes = {
            "&": "&amp;",
            "<": "&lt;",
            ">": "&gt;",
            '"': "&quot;",
            "'": "&#39;"
        };
        var htmlUnescapes = invert(htmlEscapes);
        var reEscapedHtml = RegExp("(" + keys(htmlUnescapes).join("|") + ")", "g"), reUnescapedHtml = RegExp("[" + keys(htmlEscapes).join("") + "]", "g");
        var assign = function(object, source, guard) {
            var index, iterable = object, result = iterable;
            if (!iterable)
                return result;
            var args = arguments, argsIndex = 0, argsLength = typeof guard == "number" ? 2: args.length;
            if (argsLength > 3 && typeof args[argsLength - 2] == "function") {
                var callback = baseCreateCallback(args[--argsLength - 1], args[argsLength--], 2)
            } else if (argsLength > 2 && typeof args[argsLength - 1] == "function") {
                callback = args[--argsLength]
            }
            while (++argsIndex < argsLength) {
                iterable = args[argsIndex];
                if (iterable && objectTypes[typeof iterable]) {
                    var ownIndex =- 1, ownProps = objectTypes[typeof iterable] && keys(iterable), length = ownProps ? ownProps.length : 0;
                    while (++ownIndex < length) {
                        index = ownProps[ownIndex];
                        result[index] = callback ? callback(result[index], iterable[index]) : iterable[index]
                    }
                }
            }
            return result
        };
        function clone(value, deep, callback, thisArg) {
            if (typeof deep != "boolean" && deep != null) {
                thisArg = callback;
                callback = deep;
                deep = false
            }
            return baseClone(value, deep, typeof callback == "function" && baseCreateCallback(callback, thisArg, 1))
        }
        function cloneDeep(value, callback, thisArg) {
            return baseClone(value, true, typeof callback == "function" && baseCreateCallback(callback, thisArg, 1))
        }
        var defaults = function(object, source, guard) {
            var index, iterable = object, result = iterable;
            if (!iterable)
                return result;
            var args = arguments, argsIndex = 0, argsLength = typeof guard == "number" ? 2: args.length;
            while (++argsIndex < argsLength) {
                iterable = args[argsIndex];
                if (iterable && objectTypes[typeof iterable]) {
                    var ownIndex =- 1, ownProps = objectTypes[typeof iterable] && keys(iterable), length = ownProps ? ownProps.length : 0;
                    while (++ownIndex < length) {
                        index = ownProps[ownIndex];
                        if (typeof result[index] == "undefined")
                            result[index] = iterable[index]
                    }
                }
            }
            return result
        };
        function findKey(object, callback, thisArg) {
            var result;
            callback = lodash.createCallback(callback, thisArg, 3);
            forOwn(object, function(value, key, object) {
                if (callback(value, key, object)) {
                    result = key;
                    return false
                }
            });
            return result
        }
        function findLastKey(object, callback, thisArg) {
            var result;
            callback = lodash.createCallback(callback, thisArg, 3);
            forOwnRight(object, function(value, key, object) {
                if (callback(value, key, object)) {
                    result = key;
                    return false
                }
            });
            return result
        }
        var forIn = function(collection, callback, thisArg) {
            var index, iterable = collection, result = iterable;
            if (!iterable)
                return result;
            if (!objectTypes[typeof iterable])
                return result;
            callback = callback && typeof thisArg == "undefined" ? callback : baseCreateCallback(callback, thisArg, 3);
            for (index in iterable) {
                if (callback(iterable[index], index, collection) === false)
                    return result
            }
            return result
        };
        function forInRight(object, callback, thisArg) {
            var pairs = [];
            forIn(object, function(value, key) {
                pairs.push(key, value)
            });
            var length = pairs.length;
            callback = baseCreateCallback(callback, thisArg, 3);
            while (length--) {
                if (callback(pairs[length--], pairs[length], object) === false) {
                    break
                }
            }
            return object
        }
        var forOwn = function(collection, callback, thisArg) {
            var index, iterable = collection, result = iterable;
            if (!iterable)
                return result;
            if (!objectTypes[typeof iterable])
                return result;
            callback = callback && typeof thisArg == "undefined" ? callback : baseCreateCallback(callback, thisArg, 3);
            var ownIndex =- 1, ownProps = objectTypes[typeof iterable] && keys(iterable), length = ownProps ? ownProps.length : 0;
            while (++ownIndex < length) {
                index = ownProps[ownIndex];
                if (callback(iterable[index], index, collection) === false)
                    return result
            }
            return result
        };
        function forOwnRight(object, callback, thisArg) {
            var props = keys(object), length = props.length;
            callback = baseCreateCallback(callback, thisArg, 3);
            while (length--) {
                var key = props[length];
                if (callback(object[key], key, object) === false) {
                    break
                }
            }
            return object
        }
        function functions(object) {
            var result = [];
            forIn(object, function(value, key) {
                if (isFunction(value)) {
                    result.push(key)
                }
            });
            return result.sort()
        }
        function has(object, property) {
            return object ? hasOwnProperty.call(object, property) : false
        }
        function invert(object) {
            var index =- 1, props = keys(object), length = props.length, result = {};
            while (++index < length) {
                var key = props[index];
                result[object[key]] = key
            }
            return result
        }
        function isBoolean(value) {
            return value === true || value === false || toString.call(value) == boolClass
        }
        function isDate(value) {
            return value ? typeof value == "object" && toString.call(value) == dateClass : false
        }
        function isElement(value) {
            return value ? value.nodeType === 1 : false
        }
        function isEmpty(value) {
            var result = true;
            if (!value) {
                return result
            }
            var className = toString.call(value), length = value.length;
            if (className == arrayClass || className == stringClass || className == argsClass || className == objectClass && typeof length == "number" && isFunction(value.splice)) {
                return !length
            }
            forOwn(value, function() {
                return result = false
            });
            return result
        }
        function isEqual(a, b, callback, thisArg) {
            return baseIsEqual(a, b, typeof callback == "function" && baseCreateCallback(callback, thisArg, 2))
        }
        function isFinite(value) {
            return nativeIsFinite(value)&&!nativeIsNaN(parseFloat(value))
        }
        function isFunction(value) {
            return typeof value == "function"
        }
        function isObject(value) {
            return !!(value && objectTypes[typeof value])
        }
        function isNaN(value) {
            return isNumber(value) && value!=+value
        }
        function isNull(value) {
            return value === null
        }
        function isNumber(value) {
            return typeof value == "number" || toString.call(value) == numberClass
        }
        var isPlainObject = function(value) {
            if (!(value && toString.call(value) == objectClass)) {
                return false
            }
            var valueOf = value.valueOf, objProto = typeof valueOf == "function" && (objProto = getPrototypeOf(valueOf)) && getPrototypeOf(objProto);
            return objProto ? value == objProto || getPrototypeOf(value) == objProto : shimIsPlainObject(value)
        };
        function isRegExp(value) {
            return value ? typeof value == "object" && toString.call(value) == regexpClass : false
        }
        function isString(value) {
            return typeof value == "string" || toString.call(value) == stringClass
        }
        function isUndefined(value) {
            return typeof value == "undefined"
        }
        function merge(object) {
            var args = arguments, length = 2;
            if (!isObject(object)) {
                return object
            }
            if (typeof args[2] != "number") {
                length = args.length
            }
            if (length > 3 && typeof args[length - 2] == "function") {
                var callback = baseCreateCallback(args[--length - 1], args[length--], 2)
            } else if (length > 2 && typeof args[length - 1] == "function") {
                callback = args[--length]
            }
            var sources = nativeSlice.call(arguments, 1, length), index =- 1, stackA = getArray(), stackB = getArray();
            while (++index < length) {
                baseMerge(object, sources[index], callback, stackA, stackB)
            }
            releaseArray(stackA);
            releaseArray(stackB);
            return object
        }
        function omit(object, callback, thisArg) {
            var indexOf = getIndexOf(), isFunc = typeof callback == "function", result = {};
            if (isFunc) {
                callback = lodash.createCallback(callback, thisArg, 3)
            } else {
                var props = baseFlatten(arguments, true, false, 1)
            }
            forIn(object, function(value, key, object) {
                if (isFunc?!callback(value, key, object) : indexOf(props, key) < 0) {
                    result[key] = value
                }
            });
            return result
        }
        function pairs(object) {
            var index =- 1, props = keys(object), length = props.length, result = Array(length);
            while (++index < length) {
                var key = props[index];
                result[index] = [key, object[key]]
            }
            return result
        }
        function pick(object, callback, thisArg) {
            var result = {};
            if (typeof callback != "function") {
                var index =- 1, props = baseFlatten(arguments, true, false, 1), length = isObject(object) ? props.length : 0;
                while (++index < length) {
                    var key = props[index];
                    if (key in object) {
                        result[key] = object[key]
                    }
                }
            } else {
                callback = lodash.createCallback(callback, thisArg, 3);
                forIn(object, function(value, key, object) {
                    if (callback(value, key, object)) {
                        result[key] = value
                    }
                })
            }
            return result
        }
        function transform(object, callback, accumulator, thisArg) {
            var isArr = isArray(object);
            callback = baseCreateCallback(callback, thisArg, 4);
            if (accumulator == null) {
                if (isArr) {
                    accumulator = []
                } else {
                    var ctor = object && object.constructor, proto = ctor && ctor.prototype;
                    accumulator = createObject(proto)
                }
            }(isArr ? forEach : forOwn)(object, function(value, index, object) {
                return callback(accumulator, value, index, object)
            });
            return accumulator
        }
        function values(object) {
            var index =- 1, props = keys(object), length = props.length, result = Array(length);
            while (++index < length) {
                result[index] = object[props[index]]
            }
            return result
        }
        function at(collection) {
            var args = arguments, index =- 1, props = baseFlatten(args, true, false, 1), length = args[2] && args[2][args[1]] === collection ? 1 : props.length, result = Array(length);
            while (++index < length) {
                result[index] = collection[props[index]]
            }
            return result
        }
        function contains(collection, target, fromIndex) {
            var index =- 1, indexOf = getIndexOf(), length = collection ? collection.length : 0, result = false;
            fromIndex = (fromIndex < 0 ? nativeMax(0, length + fromIndex) : fromIndex) || 0;
            if (isArray(collection)) {
                result = indexOf(collection, target, fromIndex)>-1
            } else if (typeof length == "number") {
                result = (isString(collection) ? collection.indexOf(target, fromIndex) : indexOf(collection, target, fromIndex))>-1
            } else {
                forOwn(collection, function(value) {
                    if (++index >= fromIndex) {
                        return !(result = value === target)
                    }
                })
            }
            return result
        }
        var countBy = createAggregator(function(result, value, key) {
            hasOwnProperty.call(result, key) ? result[key]++ : result[key] = 1
        });
        function every(collection, callback, thisArg) {
            var result = true;
            callback = lodash.createCallback(callback, thisArg, 3);
            var index =- 1, length = collection ? collection.length : 0;
            if (typeof length == "number") {
                while (++index < length) {
                    if (!(result=!!callback(collection[index], index, collection))) {
                        break
                    }
                }
            } else {
                forOwn(collection, function(value, index, collection) {
                    return result=!!callback(value, index, collection)
                })
            }
            return result
        }
        function filter(collection, callback, thisArg) {
            var result = [];
            callback = lodash.createCallback(callback, thisArg, 3);
            var index =- 1, length = collection ? collection.length : 0;
            if (typeof length == "number") {
                while (++index < length) {
                    var value = collection[index];
                    if (callback(value, index, collection)) {
                        result.push(value)
                    }
                }
            } else {
                forOwn(collection, function(value, index, collection) {
                    if (callback(value, index, collection)) {
                        result.push(value)
                    }
                })
            }
            return result
        }
        function find(collection, callback, thisArg) {
            callback = lodash.createCallback(callback, thisArg, 3);
            var index =- 1, length = collection ? collection.length : 0;
            if (typeof length == "number") {
                while (++index < length) {
                    var value = collection[index];
                    if (callback(value, index, collection)) {
                        return value
                    }
                }
            } else {
                var result;
                forOwn(collection, function(value, index, collection) {
                    if (callback(value, index, collection)) {
                        result = value;
                        return false
                    }
                });
                return result
            }
        }
        function findLast(collection, callback, thisArg) {
            var result;
            callback = lodash.createCallback(callback, thisArg, 3);
            forEachRight(collection, function(value, index, collection) {
                if (callback(value, index, collection)) {
                    result = value;
                    return false
                }
            });
            return result
        }
        function forEach(collection, callback, thisArg) {
            var index =- 1, length = collection ? collection.length : 0;
            callback = callback && typeof thisArg == "undefined" ? callback : baseCreateCallback(callback, thisArg, 3);
            if (typeof length == "number") {
                while (++index < length) {
                    if (callback(collection[index], index, collection) === false) {
                        break
                    }
                }
            } else {
                forOwn(collection, callback)
            }
            return collection
        }
        function forEachRight(collection, callback, thisArg) {
            var length = collection ? collection.length: 0;
            callback = callback && typeof thisArg == "undefined" ? callback : baseCreateCallback(callback, thisArg, 3);
            if (typeof length == "number") {
                while (length--) {
                    if (callback(collection[length], length, collection) === false) {
                        break
                    }
                }
            } else {
                var props = keys(collection);
                length = props.length;
                forOwn(collection, function(value, key, collection) {
                    key = props ? props[--length] : --length;
                    return callback(collection[key], key, collection)
                })
            }
            return collection
        }
        var groupBy = createAggregator(function(result, value, key) {
            (hasOwnProperty.call(result, key) ? result[key] : result[key] = []).push(value)
        });
        var indexBy = createAggregator(function(result, value, key) {
            result[key] = value
        });
        function invoke(collection, methodName) {
            var args = nativeSlice.call(arguments, 2), index =- 1, isFunc = typeof methodName == "function", length = collection ? collection.length : 0, result = Array(typeof length == "number" ? length : 0);
            forEach(collection, function(value) {
                result[++index] = (isFunc ? methodName : value[methodName]).apply(value, args)
            });
            return result
        }
        function map(collection, callback, thisArg) {
            var index =- 1, length = collection ? collection.length : 0;
            callback = lodash.createCallback(callback, thisArg, 3);
            if (typeof length == "number") {
                var result = Array(length);
                while (++index < length) {
                    result[index] = callback(collection[index], index, collection)
                }
            } else {
                result = [];
                forOwn(collection, function(value, key, collection) {
                    result[++index] = callback(value, key, collection)
                })
            }
            return result
        }
        function max(collection, callback, thisArg) {
            var computed =- Infinity, result = computed;
            if (!callback && isArray(collection)) {
                var index =- 1, length = collection.length;
                while (++index < length) {
                    var value = collection[index];
                    if (value > result) {
                        result = value
                    }
                }
            } else {
                callback=!callback && isString(collection) ? charAtCallback : lodash.createCallback(callback, thisArg, 3);
                forEach(collection, function(value, index, collection) {
                    var current = callback(value, index, collection);
                    if (current > computed) {
                        computed = current;
                        result = value
                    }
                })
            }
            return result
        }
        function min(collection, callback, thisArg) {
            var computed = Infinity, result = computed;
            if (!callback && isArray(collection)) {
                var index =- 1, length = collection.length;
                while (++index < length) {
                    var value = collection[index];
                    if (value < result) {
                        result = value
                    }
                }
            } else {
                callback=!callback && isString(collection) ? charAtCallback : lodash.createCallback(callback, thisArg, 3);
                forEach(collection, function(value, index, collection) {
                    var current = callback(value, index, collection);
                    if (current < computed) {
                        computed = current;
                        result = value
                    }
                })
            }
            return result
        }
        function pluck(collection, property) {
            var index =- 1, length = collection ? collection.length : 0;
            if (typeof length == "number") {
                var result = Array(length);
                while (++index < length) {
                    result[index] = collection[index][property]
                }
            }
            return result || map(collection, property)
        }
        function reduce(collection, callback, accumulator, thisArg) {
            if (!collection)
                return accumulator;
            var noaccum = arguments.length < 3;
            callback = baseCreateCallback(callback, thisArg, 4);
            var index =- 1, length = collection.length;
            if (typeof length == "number") {
                if (noaccum) {
                    accumulator = collection[++index]
                }
                while (++index < length) {
                    accumulator = callback(accumulator, collection[index], index, collection)
                }
            } else {
                forOwn(collection, function(value, index, collection) {
                    accumulator = noaccum ? (noaccum = false, value) : callback(accumulator, value, index, collection)
                })
            }
            return accumulator
        }
        function reduceRight(collection, callback, accumulator, thisArg) {
            var noaccum = arguments.length < 3;
            callback = baseCreateCallback(callback, thisArg, 4);
            forEachRight(collection, function(value, index, collection) {
                accumulator = noaccum ? (noaccum = false, value) : callback(accumulator, value, index, collection)
            });
            return accumulator
        }
        function reject(collection, callback, thisArg) {
            callback = lodash.createCallback(callback, thisArg, 3);
            return filter(collection, function(value, index, collection) {
                return !callback(value, index, collection)
            })
        }
        function sample(collection, n, guard) {
            var length = collection ? collection.length: 0;
            if (typeof length != "number") {
                collection = values(collection)
            }
            if (n == null || guard) {
                return collection ? collection[random(length - 1)] : undefined
            }
            var result = shuffle(collection);
            result.length = nativeMin(nativeMax(0, n), result.length);
            return result
        }
        function shuffle(collection) {
            var index =- 1, length = collection ? collection.length : 0, result = Array(typeof length == "number" ? length : 0);
            forEach(collection, function(value) {
                var rand = random(++index);
                result[index] = result[rand];
                result[rand] = value
            });
            return result
        }
        function size(collection) {
            var length = collection ? collection.length: 0;
            return typeof length == "number" ? length : keys(collection).length
        }
        function some(collection, callback, thisArg) {
            var result;
            callback = lodash.createCallback(callback, thisArg, 3);
            var index =- 1, length = collection ? collection.length : 0;
            if (typeof length == "number") {
                while (++index < length) {
                    if (result = callback(collection[index], index, collection)) {
                        break
                    }
                }
            } else {
                forOwn(collection, function(value, index, collection) {
                    return !(result = callback(value, index, collection))
                })
            }
            return !!result
        }
        function sortBy(collection, callback, thisArg) {
            var index =- 1, length = collection ? collection.length : 0, result = Array(typeof length == "number" ? length : 0);
            callback = lodash.createCallback(callback, thisArg, 3);
            forEach(collection, function(value, key, collection) {
                var object = result[++index] = getObject();
                object.criteria = callback(value, key, collection);
                object.index = index;
                object.value = value
            });
            length = result.length;
            result.sort(compareAscending);
            while (length--) {
                var object = result[length];
                result[length] = object.value;
                releaseObject(object)
            }
            return result
        }
        function toArray(collection) {
            if (collection && typeof collection.length == "number") {
                return slice(collection)
            }
            return values(collection)
        }
        var where = filter;
        function compact(array) {
            var index =- 1, length = array ? array.length : 0, result = [];
            while (++index < length) {
                var value = array[index];
                if (value) {
                    result.push(value)
                }
            }
            return result
        }
        function difference(array) {
            var index =- 1, indexOf = getIndexOf(), length = array ? array.length : 0, seen = baseFlatten(arguments, true, true, 1), result = [];
            var isLarge = length >= largeArraySize && indexOf === baseIndexOf;
            if (isLarge) {
                var cache = createCache(seen);
                if (cache) {
                    indexOf = cacheIndexOf;
                    seen = cache
                } else {
                    isLarge = false
                }
            }
            while (++index < length) {
                var value = array[index];
                if (indexOf(seen, value) < 0) {
                    result.push(value)
                }
            }
            if (isLarge) {
                releaseObject(seen)
            }
            return result
        }
        function findIndex(array, callback, thisArg) {
            var index =- 1, length = array ? array.length : 0;
            callback = lodash.createCallback(callback, thisArg, 3);
            while (++index < length) {
                if (callback(array[index], index, array)) {
                    return index
                }
            }
            return - 1
        }
        function findLastIndex(array, callback, thisArg) {
            var length = array ? array.length: 0;
            callback = lodash.createCallback(callback, thisArg, 3);
            while (length--) {
                if (callback(array[length], length, array)) {
                    return length
                }
            }
            return - 1
        }
        function first(array, callback, thisArg) {
            var n = 0, length = array ? array.length: 0;
            if (typeof callback != "number" && callback != null) {
                var index =- 1;
                callback = lodash.createCallback(callback, thisArg, 3);
                while (++index < length && callback(array[index], index, array)) {
                    n++
                }
            } else {
                n = callback;
                if (n == null || thisArg) {
                    return array ? array[0] : undefined
                }
            }
            return slice(array, 0, nativeMin(nativeMax(0, n), length))
        }
        function flatten(array, isShallow, callback, thisArg) {
            if (typeof isShallow != "boolean" && isShallow != null) {
                thisArg = callback;
                callback=!(thisArg && thisArg[isShallow] === array) ? isShallow : null;
                isShallow = false
            }
            if (callback != null) {
                array = map(array, callback, thisArg)
            }
            return baseFlatten(array, isShallow)
        }
        function indexOf(array, value, fromIndex) {
            if (typeof fromIndex == "number") {
                var length = array ? array.length: 0;
                fromIndex = fromIndex < 0 ? nativeMax(0, length + fromIndex) : fromIndex || 0
            } else if (fromIndex) {
                var index = sortedIndex(array, value);
                return array[index] === value ? index : - 1
            }
            return baseIndexOf(array, value, fromIndex)
        }
        function initial(array, callback, thisArg) {
            var n = 0, length = array ? array.length: 0;
            if (typeof callback != "number" && callback != null) {
                var index = length;
                callback = lodash.createCallback(callback, thisArg, 3);
                while (index--&&callback(array[index], index, array)
                    ) {
                    n++
                }
            } else {
                n = callback == null || thisArg ? 1 : callback || n
            }
            return slice(array, 0, nativeMin(nativeMax(0, length - n), length))
        }
        function intersection(array) {
            var args = arguments, argsLength = args.length, argsIndex =- 1, caches = getArray(), index =- 1, indexOf = getIndexOf(), length = array ? array.length : 0, result = [], seen = getArray();
            while (++argsIndex < argsLength) {
                var value = args[argsIndex];
                caches[argsIndex] = indexOf === baseIndexOf && (value ? value.length : 0) >= largeArraySize && createCache(argsIndex ? args[argsIndex] : seen)
            }
            outer: while (++index < length) {
                var cache = caches[0];
                value = array[index];
                if ((cache ? cacheIndexOf(cache, value) : indexOf(seen, value)) < 0) {
                    argsIndex = argsLength;
                    (cache || seen).push(value);
                    while (--argsIndex) {
                        cache = caches[argsIndex];
                        if ((cache ? cacheIndexOf(cache, value) : indexOf(args[argsIndex], value)) < 0) {
                            continue outer
                        }
                    }
                    result.push(value)
                }
            }
            while (argsLength--) {
                cache = caches[argsLength];
                if (cache) {
                    releaseObject(cache)
                }
            }
            releaseArray(caches);
            releaseArray(seen);
            return result
        }
        function last(array, callback, thisArg) {
            var n = 0, length = array ? array.length: 0;
            if (typeof callback != "number" && callback != null) {
                var index = length;
                callback = lodash.createCallback(callback, thisArg, 3);
                while (index--&&callback(array[index], index, array)
                    ) {
                    n++
                }
            } else {
                n = callback;
                if (n == null || thisArg) {
                    return array ? array[length - 1] : undefined
                }
            }
            return slice(array, nativeMax(0, length - n))
        }
        function lastIndexOf(array, value, fromIndex) {
            var index = array ? array.length: 0;
            if (typeof fromIndex == "number") {
                index = (fromIndex < 0 ? nativeMax(0, index + fromIndex) : nativeMin(fromIndex, index - 1)) + 1
            }
            while (index--) {
                if (array[index] === value) {
                    return index
                }
            }
            return - 1
        }
        function pull(array) {
            var args = arguments, argsIndex = 0, argsLength = args.length, length = array ? array.length: 0;
            while (++argsIndex < argsLength) {
                var index =- 1, value = args[argsIndex];
                while (++index < length) {
                    if (array[index] === value) {
                        splice.call(array, index--, 1);
                        length--
                    }
                }
            }
            return array
        }
        function range(start, end, step) {
            start =+ start || 0;
            step = typeof step == "number" ? step : + step || 1;
            if (end == null) {
                end = start;
                start = 0
            }
            var index =- 1, length = nativeMax(0, ceil((end - start) / (step || 1))), result = Array(length);
            while (++index < length) {
                result[index] = start;
                start += step
            }
            return result
        }
        function remove(array, callback, thisArg) {
            var index =- 1, length = array ? array.length : 0, result = [];
            callback = lodash.createCallback(callback, thisArg, 3);
            while (++index < length) {
                var value = array[index];
                if (callback(value, index, array)) {
                    result.push(value);
                    splice.call(array, index--, 1);
                    length--
                }
            }
            return result
        }
        function rest(array, callback, thisArg) {
            if (typeof callback != "number" && callback != null) {
                var n = 0, index =- 1, length = array ? array.length : 0;
                callback = lodash.createCallback(callback, thisArg, 3);
                while (++index < length && callback(array[index], index, array)) {
                    n++
                }
            } else {
                n = callback == null || thisArg ? 1 : nativeMax(0, callback)
            }
            return slice(array, n)
        }
        function sortedIndex(array, value, callback, thisArg) {
            var low = 0, high = array ? array.length: low;
            callback = callback ? lodash.createCallback(callback, thisArg, 1) : identity;
            value = callback(value);
            while (low < high) {
                var mid = low + high>>>1;
                callback(array[mid]) < value ? low = mid + 1 : high = mid
            }
            return low
        }
        function union(array) {
            return baseUniq(baseFlatten(arguments, true, true))
        }
        function uniq(array, isSorted, callback, thisArg) {
            if (typeof isSorted != "boolean" && isSorted != null) {
                thisArg = callback;
                callback=!(thisArg && thisArg[isSorted] === array) ? isSorted : null;
                isSorted = false
            }
            if (callback != null) {
                callback = lodash.createCallback(callback, thisArg, 3)
            }
            return baseUniq(array, isSorted, callback)
        }
        function without(array) {
            return difference(array, nativeSlice.call(arguments, 1))
        }
        function zip() {
            var array = arguments.length > 1 ? arguments: arguments[0], index =- 1, length = array ? max(pluck(array, "length")) : 0, result = Array(length < 0 ? 0 : length);
            while (++index < length) {
                result[index] = pluck(array, index)
            }
            return result
        }
        function zipObject(keys, values) {
            var index =- 1, length = keys ? keys.length : 0, result = {};
            while (++index < length) {
                var key = keys[index];
                if (values) {
                    result[key] = values[index]
                } else if (key) {
                    result[key[0]] = key[1]
                }
            }
            return result
        }
        function after(n, func) {
            if (!isFunction(func)) {
                throw new TypeError
            }
            return function() {
                if (--n < 1) {
                    return func.apply(this, arguments)
                }
            }
        }
        function bind(func, thisArg) {
            return arguments.length > 2 ? createBound(func, 17, nativeSlice.call(arguments, 2), null, thisArg) : createBound(func, 1, null, null, thisArg)
        }
        function bindAll(object) {
            var funcs = arguments.length > 1 ? baseFlatten(arguments, true, false, 1): functions(object), index =- 1, length = funcs.length;
            while (++index < length) {
                var key = funcs[index];
                object[key] = createBound(object[key], 1, null, null, object)
            }
            return object
        }
        function bindKey(object, key) {
            return arguments.length > 2 ? createBound(key, 19, nativeSlice.call(arguments, 2), null, object) : createBound(key, 3, null, null, object)
        }
        function compose() {
            var funcs = arguments, length = funcs.length;
            while (length--) {
                if (!isFunction(funcs[length])) {
                    throw new TypeError
                }
            }
            return function() {
                var args = arguments, length = funcs.length;
                while (length--) {
                    args = [funcs[length].apply(this, args)]
                }
                return args[0]
            }
        }
        function createCallback(func, thisArg, argCount) {
            var type = typeof func;
            if (func == null || type == "function") {
                return baseCreateCallback(func, thisArg, argCount)
            }
            if (type != "object") {
                return function(object) {
                    return object[func]
                }
            }
            var props = keys(func), key = props[0], a = func[key];
            if (props.length == 1 && a === a&&!isObject(a)) {
                return function(object) {
                    var b = object[key];
                    return a === b && (a !== 0 || 1 / a == 1 / b)
                }
            }
            return function(object) {
                var length = props.length, result = false;
                while (length--) {
                    if (!(result = baseIsEqual(object[props[length]], func[props[length]], null, true))) {
                        break
                    }
                }
                return result
            }
        }
        function curry(func, arity) {
            arity = typeof arity == "number" ? arity : + arity || func.length;
            return createBound(func, 4, null, null, null, arity)
        }
        function debounce(func, wait, options) {
            var args, maxTimeoutId, result, stamp, thisArg, timeoutId, trailingCall, lastCalled = 0, maxWait = false, trailing = true;
            if (!isFunction(func)) {
                throw new TypeError
            }
            wait = nativeMax(0, wait) || 0;
            if (options === true) {
                var leading = true;
                trailing = false
            } else if (isObject(options)) {
                leading = options.leading;
                maxWait = "maxWait"in options && (nativeMax(wait, options.maxWait) || 0);
                trailing = "trailing"in options ? options.trailing : trailing
            }
            var delayed = function() {
                var remaining = wait - (now() - stamp);
                if (remaining <= 0) {
                    if (maxTimeoutId) {
                        clearTimeout(maxTimeoutId)
                    }
                    var isCalled = trailingCall;
                    maxTimeoutId = timeoutId = trailingCall = undefined;
                    if (isCalled) {
                        lastCalled = now();
                        result = func.apply(thisArg, args)
                    }
                } else {
                    timeoutId = setTimeout(delayed, remaining)
                }
            };
            var maxDelayed = function() {
                if (timeoutId) {
                    clearTimeout(timeoutId)
                }
                maxTimeoutId = timeoutId = trailingCall = undefined;
                if (trailing || maxWait !== wait) {
                    lastCalled = now();
                    result = func.apply(thisArg, args)
                }
            };
            return function() {
                args = arguments;
                stamp = now();
                thisArg = this;
                trailingCall = trailing && (timeoutId ||!leading);
                if (maxWait === false) {
                    var leadingCall = leading&&!timeoutId
                } else {
                    if (!maxTimeoutId&&!leading) {
                        lastCalled = stamp
                    }
                    var remaining = maxWait - (stamp - lastCalled);
                    if (remaining <= 0) {
                        if (maxTimeoutId) {
                            maxTimeoutId = clearTimeout(maxTimeoutId)
                        }
                        lastCalled = stamp;
                        result = func.apply(thisArg, args)
                    } else if (!maxTimeoutId) {
                        maxTimeoutId = setTimeout(maxDelayed, remaining)
                    }
                }
                if (!timeoutId && wait !== maxWait) {
                    timeoutId = setTimeout(delayed, wait)
                }
                if (leadingCall) {
                    result = func.apply(thisArg, args)
                }
                return result
            }
        }
        function defer(func) {
            if (!isFunction(func)) {
                throw new TypeError
            }
            var args = nativeSlice.call(arguments, 1);
            return setTimeout(function() {
                func.apply(undefined, args)
            }, 1)
        }
        if (isV8 && moduleExports && typeof setImmediate == "function") {
            defer = function(func) {
                if (!isFunction(func)) {
                    throw new TypeError
                }
                return setImmediate.apply(context, arguments)
            }
        }
        function delay(func, wait) {
            if (!isFunction(func)) {
                throw new TypeError
            }
            var args = nativeSlice.call(arguments, 2);
            return setTimeout(function() {
                func.apply(undefined, args)
            }, wait)
        }
        function memoize(func, resolver) {
            if (!isFunction(func)) {
                throw new TypeError
            }
            var memoized = function() {
                var cache = memoized.cache, key = resolver ? resolver.apply(this, arguments): keyPrefix + arguments[0];
                return hasOwnProperty.call(cache, key) ? cache[key] : cache[key] = func.apply(this, arguments)
            };
            memoized.cache = {};
            return memoized
        }
        function once(func) {
            var ran, result;
            if (!isFunction(func)) {
                throw new TypeError
            }
            return function() {
                if (ran) {
                    return result
                }
                ran = true;
                result = func.apply(this, arguments);
                func = null;
                return result
            }
        }
        function partial(func) {
            return createBound(func, 16, nativeSlice.call(arguments, 1))
        }
        function partialRight(func) {
            return createBound(func, 32, null, nativeSlice.call(arguments, 1))
        }
        function throttle(func, wait, options) {
            var leading = true, trailing = true;
            if (!isFunction(func)) {
                throw new TypeError
            }
            if (options === false) {
                leading = false
            } else if (isObject(options)) {
                leading = "leading"in options ? options.leading : leading;
                trailing = "trailing"in options ? options.trailing : trailing
            }
            debounceOptions.leading = leading;
            debounceOptions.maxWait = wait;
            debounceOptions.trailing = trailing;
            var result = debounce(func, wait, debounceOptions);
            return result
        }
        function wrap(value, wrapper) {
            if (!isFunction(wrapper)) {
                throw new TypeError
            }
            return function() {
                var args = [value];
                push.apply(args, arguments);
                return wrapper.apply(this, args)
            }
        }
        function escape(string) {
            return string == null ? "" : String(string).replace(reUnescapedHtml, escapeHtmlChar)
        }
        function identity(value) {
            return value
        }
        function mixin(object, source) {
            var ctor = object, isFunc=!source || isFunction(ctor);
            if (!source) {
                ctor = lodashWrapper;
                source = object;
                object = lodash
            }
            forEach(functions(source), function(methodName) {
                var func = object[methodName] = source[methodName];
                if (isFunc) {
                    ctor.prototype[methodName] = function() {
                        var value = this.__wrapped__, args = [value];
                        push.apply(args, arguments);
                        var result = func.apply(object, args);
                        if (value && typeof value == "object" && value === result) {
                            return this
                        }
                        result = new ctor(result);
                        result.__chain__ = this.__chain__;
                        return result
                    }
                }
            })
        }
        function noConflict() {
            context._ = oldDash;
            return this
        }
        var parseInt = nativeParseInt(whitespace + "08") == 8 ? nativeParseInt: function(value, radix) {
            return nativeParseInt(isString(value) ? value.replace(reLeadingSpacesAndZeros, "") : value, radix || 0)
        };
        function random(min, max, floating) {
            var noMin = min == null, noMax = max == null;
            if (floating == null) {
                if (typeof min == "boolean" && noMax) {
                    floating = min;
                    min = 1
                } else if (!noMax && typeof max == "boolean") {
                    floating = max;
                    noMax = true
                }
            }
            if (noMin && noMax) {
                max = 1
            }
            min =+ min || 0;
            if (noMax) {
                max = min;
                min = 0
            } else {
                max =+ max || 0
            }
            var rand = nativeRandom();
            return floating || min%1 || max%1 ? nativeMin(min + rand * (max - min + parseFloat("1e-" + ((rand + "").length - 1))), max) : min + floor(rand * (max - min + 1))
        }
        function result(object, property) {
            if (object) {
                var value = object[property];
                return isFunction(value) ? object[property]() : value
            }
        }
        function template(text, data, options) {
            var settings = lodash.templateSettings;
            text || (text = "");
            options = defaults({}, options, settings);
            var imports = defaults({}, options.imports, settings.imports), importsKeys = keys(imports), importsValues = values(imports);
            var isEvaluating, index = 0, interpolate = options.interpolate || reNoMatch, source = "__p += '";
            var reDelimiters = RegExp((options.escape || reNoMatch).source + "|" + interpolate.source + "|" + (interpolate === reInterpolate ? reEsTemplate : reNoMatch).source + "|" + (options.evaluate || reNoMatch).source + "|$", "g");
            text.replace(reDelimiters, function(match, escapeValue, interpolateValue, esTemplateValue, evaluateValue, offset) {
                interpolateValue || (interpolateValue = esTemplateValue);
                source += text.slice(index, offset).replace(reUnescapedString, escapeStringChar);
                if (escapeValue) {
                    source += "' +\n__e(" + escapeValue + ") +\n'"
                }
                if (evaluateValue) {
                    isEvaluating = true;
                    source += "';\n" + evaluateValue + ";\n__p += '"
                }
                if (interpolateValue) {
                    source += "' +\n((__t = (" + interpolateValue + ")) == null ? '' : __t) +\n'"
                }
                index = offset + match.length;
                return match
            });
            source += "';\n";
            var variable = options.variable, hasVariable = variable;
            if (!hasVariable) {
                variable = "obj";
                source = "with (" + variable + ") {\n" + source + "\n}\n"
            }
            source = (isEvaluating ? source.replace(reEmptyStringLeading, "") : source).replace(reEmptyStringMiddle, "$1").replace(reEmptyStringTrailing, "$1;");
            source = "function(" + variable + ") {\n" + (hasVariable ? "" : variable + " || (" + variable + " = {});\n") + "var __t, __p = '', __e = _.escape" + (isEvaluating ? ", __j = Array.prototype.join;\n" + "function print() { __p += __j.call(arguments, '') }\n" : ";\n") + source + "return __p\n}";
            var sourceURL = "\n/*\n//# sourceURL=" + (options.sourceURL || "/lodash/template/source[" + templateCounter++ + "]") + "\n*/";
            try {
                var result = Function(importsKeys, "return " + source + sourceURL).apply(undefined, importsValues)
            } catch (e) {
                e.source = source;
                throw e
            }
            if (data) {
                return result(data)
            }
            result.source = source;
            return result
        }
        function times(n, callback, thisArg) {
            n = (n =+ n)>-1 ? n : 0;
            var index =- 1, result = Array(n);
            callback = baseCreateCallback(callback, thisArg, 1);
            while (++index < n) {
                result[index] = callback(index)
            }
            return result
        }
        function unescape(string) {
            return string == null ? "" : String(string).replace(reEscapedHtml, unescapeHtmlChar)
        }
        function uniqueId(prefix) {
            var id=++idCounter;
            return String(prefix == null ? "" : prefix) + id
        }
        function chain(value) {
            value = new lodashWrapper(value);
            value.__chain__ = true;
            return value
        }
        function tap(value, interceptor) {
            interceptor(value);
            return value
        }
        function wrapperChain() {
            this.__chain__ = true;
            return this
        }
        function wrapperToString() {
            return String(this.__wrapped__)
        }
        function wrapperValueOf() {
            return this.__wrapped__
        }
        lodash.after = after;
        lodash.assign = assign;
        lodash.at = at;
        lodash.bind = bind;
        lodash.bindAll = bindAll;
        lodash.bindKey = bindKey;
        lodash.chain = chain;
        lodash.compact = compact;
        lodash.compose = compose;
        lodash.countBy = countBy;
        lodash.createCallback = createCallback;
        lodash.curry = curry;
        lodash.debounce = debounce;
        lodash.defaults = defaults;
        lodash.defer = defer;
        lodash.delay = delay;
        lodash.difference = difference;
        lodash.filter = filter;
        lodash.flatten = flatten;
        lodash.forEach = forEach;
        lodash.forEachRight = forEachRight;
        lodash.forIn = forIn;
        lodash.forInRight = forInRight;
        lodash.forOwn = forOwn;
        lodash.forOwnRight = forOwnRight;
        lodash.functions = functions;
        lodash.groupBy = groupBy;
        lodash.indexBy = indexBy;
        lodash.initial = initial;
        lodash.intersection = intersection;
        lodash.invert = invert;
        lodash.invoke = invoke;
        lodash.keys = keys;
        lodash.map = map;
        lodash.max = max;
        lodash.memoize = memoize;
        lodash.merge = merge;
        lodash.min = min;
        lodash.omit = omit;
        lodash.once = once;
        lodash.pairs = pairs;
        lodash.partial = partial;
        lodash.partialRight = partialRight;
        lodash.pick = pick;
        lodash.pluck = pluck;
        lodash.pull = pull;
        lodash.range = range;
        lodash.reject = reject;
        lodash.remove = remove;
        lodash.rest = rest;
        lodash.shuffle = shuffle;
        lodash.sortBy = sortBy;
        lodash.tap = tap;
        lodash.throttle = throttle;
        lodash.times = times;
        lodash.toArray = toArray;
        lodash.transform = transform;
        lodash.union = union;
        lodash.uniq = uniq;
        lodash.values = values;
        lodash.where = where;
        lodash.without = without;
        lodash.wrap = wrap;
        lodash.zip = zip;
        lodash.zipObject = zipObject;
        lodash.collect = map;
        lodash.drop = rest;
        lodash.each = forEach;
        lodash.eachRight = forEachRight;
        lodash.extend = assign;
        lodash.methods = functions;
        lodash.object = zipObject;
        lodash.select = filter;
        lodash.tail = rest;
        lodash.unique = uniq;
        lodash.unzip = zip;
        mixin(lodash);
        lodash.clone = clone;
        lodash.cloneDeep = cloneDeep;
        lodash.contains = contains;
        lodash.escape = escape;
        lodash.every = every;
        lodash.find = find;
        lodash.findIndex = findIndex;
        lodash.findKey = findKey;
        lodash.findLast = findLast;
        lodash.findLastIndex = findLastIndex;
        lodash.findLastKey = findLastKey;
        lodash.has = has;
        lodash.identity = identity;
        lodash.indexOf = indexOf;
        lodash.isArguments = isArguments;
        lodash.isArray = isArray;
        lodash.isBoolean = isBoolean;
        lodash.isDate = isDate;
        lodash.isElement = isElement;
        lodash.isEmpty = isEmpty;
        lodash.isEqual = isEqual;
        lodash.isFinite = isFinite;
        lodash.isFunction = isFunction;
        lodash.isNaN = isNaN;
        lodash.isNull = isNull;
        lodash.isNumber = isNumber;
        lodash.isObject = isObject;
        lodash.isPlainObject = isPlainObject;
        lodash.isRegExp = isRegExp;
        lodash.isString = isString;
        lodash.isUndefined = isUndefined;
        lodash.lastIndexOf = lastIndexOf;
        lodash.mixin = mixin;
        lodash.noConflict = noConflict;
        lodash.parseInt = parseInt;
        lodash.random = random;
        lodash.reduce = reduce;
        lodash.reduceRight = reduceRight;
        lodash.result = result;
        lodash.runInContext = runInContext;
        lodash.size = size;
        lodash.some = some;
        lodash.sortedIndex = sortedIndex;
        lodash.template = template;
        lodash.unescape = unescape;
        lodash.uniqueId = uniqueId;
        lodash.all = every;
        lodash.any = some;
        lodash.detect = find;
        lodash.findWhere = find;
        lodash.foldl = reduce;
        lodash.foldr = reduceRight;
        lodash.include = contains;
        lodash.inject = reduce;
        forOwn(lodash, function(func, methodName) {
            if (!lodash.prototype[methodName]) {
                lodash.prototype[methodName] = function() {
                    var args = [this.__wrapped__], chainAll = this.__chain__;
                    push.apply(args, arguments);
                    var result = func.apply(lodash, args);
                    return chainAll ? new lodashWrapper(result, chainAll) : result
                }
            }
        });
        lodash.first = first;
        lodash.last = last;
        lodash.sample = sample;
        lodash.take = first;
        lodash.head = first;
        forOwn(lodash, function(func, methodName) {
            var callbackable = methodName !== "sample";
            if (!lodash.prototype[methodName]) {
                lodash.prototype[methodName] = function(n, guard) {
                    var chainAll = this.__chain__, result = func(this.__wrapped__, n, guard);
                    return !chainAll && (n == null || guard&&!(callbackable && typeof n == "function")) ? result : new lodashWrapper(result, chainAll)
                }
            }
        });
        lodash.VERSION = "2.2.1";
        lodash.prototype.chain = wrapperChain;
        lodash.prototype.toString = wrapperToString;
        lodash.prototype.value = wrapperValueOf;
        lodash.prototype.valueOf = wrapperValueOf;
        forEach(["join", "pop", "shift"], function(methodName) {
            var func = arrayRef[methodName];
            lodash.prototype[methodName] = function() {
                var chainAll = this.__chain__, result = func.apply(this.__wrapped__, arguments);
                return chainAll ? new lodashWrapper(result, chainAll) : result
            }
        });
        forEach(["push", "reverse", "sort", "unshift"], function(methodName) {
            var func = arrayRef[methodName];
            lodash.prototype[methodName] = function() {
                func.apply(this.__wrapped__, arguments);
                return this
            }
        });
        forEach(["concat", "slice", "splice"], function(methodName) {
            var func = arrayRef[methodName];
            lodash.prototype[methodName] = function() {
                return new lodashWrapper(func.apply(this.__wrapped__, arguments), this.__chain__)
            }
        });
        return lodash
    }
    var _ = runInContext();
    if (typeof define == "function" && typeof define.amd == "object" && define.amd) {
        root._ = _;
        define(function() {
            return _
        })
    } else if (freeExports && freeModule) {
        if (moduleExports) {
            (freeModule.exports = _)._ = _
        } else {
            freeExports._ = _
        }
    } else {
        root._ = _
    }
}).call(this);
(function(root, factory) {
    if (typeof define === "function" && define.amd) {
        define(["underscore", "jquery", "exports"], function(_, $, exports) {
            root.Backbone = factory(root, exports, _, $)
        })
    } else if (typeof exports !== "undefined") {
        var _ = require("underscore");
        factory(root, exports, _)
    } else {
        root.Backbone = factory(root, {}, root._, root.jQuery || root.Zepto || root.ender || root.$)
    }
})(this, function(root, Backbone, _, $) {
    var previousBackbone = root.Backbone;
    var array = [];
    var push = array.push;
    var slice = array.slice;
    var splice = array.splice;
    Backbone.VERSION = "1.1.2";
    Backbone.$ = $;
    Backbone.noConflict = function() {
        root.Backbone = previousBackbone;
        return this
    };
    Backbone.emulateHTTP = false;
    Backbone.emulateJSON = false;
    var Events = Backbone.Events = {
        on: function(name, callback, context) {
            if (!eventsApi(this, "on", name, [callback, context]) ||!callback)
                return this;
            this._events || (this._events = {});
            var events = this._events[name] || (this._events[name] = []);
            events.push({
                callback: callback,
                context: context,
                ctx: context || this
            });
            return this
        },
        once: function(name, callback, context) {
            if (!eventsApi(this, "once", name, [callback, context]) ||!callback)
                return this;
            var self = this;
            var once = _.once(function() {
                self.off(name, once);
                callback.apply(this, arguments)
            });
            once._callback = callback;
            return this.on(name, once, context)
        },
        off: function(name, callback, context) {
            var retain, ev, events, names, i, l, j, k;
            if (!this._events ||!eventsApi(this, "off", name, [callback, context]))
                return this;
            if (!name&&!callback&&!context) {
                this._events = void 0;
                return this
            }
            names = name ? [name] : _.keys(this._events);
            for (i = 0, l = names.length; i < l; i++) {
                name = names[i];
                if (events = this._events[name]) {
                    this._events[name] = retain = [];
                    if (callback || context) {
                        for (j = 0, k = events.length; j < k; j++) {
                            ev = events[j];
                            if (callback && callback !== ev.callback && callback !== ev.callback._callback || context && context !== ev.context) {
                                retain.push(ev)
                            }
                        }
                    }
                    if (!retain.length)
                        delete this._events[name]
                }
            }
            return this
        },
        trigger: function(name) {
            if (!this._events)
                return this;
            var args = slice.call(arguments, 1);
            if (!eventsApi(this, "trigger", name, args))
                return this;
            var events = this._events[name];
            var allEvents = this._events.all;
            if (events)
                triggerEvents(events, args);
            if (allEvents)
                triggerEvents(allEvents, arguments);
            return this
        },
        stopListening: function(obj, name, callback) {
            var listeningTo = this._listeningTo;
            if (!listeningTo)
                return this;
            var remove=!name&&!callback;
            if (!callback && typeof name === "object")
                callback = this;
            if (obj)(listeningTo = {})
                [obj._listenId] = obj;
            for (var id in listeningTo) {
                obj = listeningTo[id];
                obj.off(name, callback, this);
                if (remove || _.isEmpty(obj._events))
                    delete this._listeningTo[id]
            }
            return this
        }
    };
    var eventSplitter = /\s+/;
    var eventsApi = function(obj, action, name, rest) {
        if (!name)
            return true;
        if (typeof name === "object") {
            for (var key in name) {
                obj[action].apply(obj, [key, name[key]].concat(rest))
            }
            return false
        }
        if (eventSplitter.test(name)) {
            var names = name.split(eventSplitter);
            for (var i = 0, l = names.length; i < l; i++) {
                obj[action].apply(obj, [names[i]].concat(rest))
            }
            return false
        }
        return true
    };
    var triggerEvents = function(events, args) {
        var ev, i =- 1, l = events.length, a1 = args[0], a2 = args[1], a3 = args[2];
        switch (args.length) {
        case 0:
            while (++i < l)(ev = events[i]).callback.call(ev.ctx);
            return;
        case 1:
            while (++i < l)(ev = events[i]).callback.call(ev.ctx, a1);
            return;
        case 2:
            while (++i < l)(ev = events[i]).callback.call(ev.ctx, a1, a2);
            return;
        case 3:
            while (++i < l)(ev = events[i]).callback.call(ev.ctx, a1, a2, a3);
            return;
        default:
            while (++i < l)(ev = events[i]).callback.apply(ev.ctx, args);
            return 
        }
    };
    var listenMethods = {
        listenTo: "on",
        listenToOnce: "once"
    };
    _.each(listenMethods, function(implementation, method) {
        Events[method] = function(obj, name, callback) {
            var listeningTo = this._listeningTo || (this._listeningTo = {});
            var id = obj._listenId || (obj._listenId = _.uniqueId("l"));
            listeningTo[id] = obj;
            if (!callback && typeof name === "object")
                callback = this;
            obj[implementation](name, callback, this);
            return this
        }
    });
    Events.bind = Events.on;
    Events.unbind = Events.off;
    _.extend(Backbone, Events);
    var Model = Backbone.Model = function(attributes, options) {
        var attrs = attributes || {};
        options || (options = {});
        this.cid = _.uniqueId("c");
        this.attributes = {};
        if (options.collection)
            this.collection = options.collection;
        if (options.parse)
            attrs = this.parse(attrs, options) || {};
        attrs = _.defaults({}, attrs, _.result(this, "defaults"));
        this.set(attrs, options);
        this.changed = {};
        this.initialize.apply(this, arguments)
    };
    _.extend(Model.prototype, Events, {
        changed: null,
        validationError: null,
        idAttribute: "id",
        initialize: function() {},
        toJSON: function(options) {
            return _.clone(this.attributes)
        },
        sync: function() {
            return Backbone.sync.apply(this, arguments)
        },
        get: function(attr) {
            return this.attributes[attr]
        },
        escape: function(attr) {
            return _.escape(this.get(attr))
        },
        has: function(attr) {
            return this.get(attr) != null
        },
        set: function(key, val, options) {
            var attr, attrs, unset, changes, silent, changing, prev, current;
            if (key == null)
                return this;
            if (typeof key === "object") {
                attrs = key;
                options = val
            } else {
                (attrs = {})[key] = val
            }
            options || (options = {});
            if (!this._validate(attrs, options))
                return false;
            unset = options.unset;
            silent = options.silent;
            changes = [];
            changing = this._changing;
            this._changing = true;
            if (!changing) {
                this._previousAttributes = _.clone(this.attributes);
                this.changed = {}
            }
            current = this.attributes, prev = this._previousAttributes;
            if (this.idAttribute in attrs)
                this.id = attrs[this.idAttribute];
            for (attr in attrs) {
                val = attrs[attr];
                if (!_.isEqual(current[attr], val))
                    changes.push(attr);
                if (!_.isEqual(prev[attr], val)) {
                    this.changed[attr] = val
                } else {
                    delete this.changed[attr]
                }
                unset ? delete current[attr] : current[attr] = val
            }
            if (!silent) {
                if (changes.length)
                    this._pending = options;
                for (var i = 0, l = changes.length; i < l; i++) {
                    this.trigger("change:" + changes[i], this, current[changes[i]], options)
                }
            }
            if (changing)
                return this;
            if (!silent) {
                while (this._pending) {
                    options = this._pending;
                    this._pending = false;
                    this.trigger("change", this, options)
                }
            }
            this._pending = false;
            this._changing = false;
            return this
        },
        unset: function(attr, options) {
            return this.set(attr, void 0, _.extend({}, options, {
                unset : true
            }))
        },
        clear: function(options) {
            var attrs = {};
            for (var key in this.attributes)
                attrs[key] = void 0;
            return this.set(attrs, _.extend({}, options, {
                unset: true
            }))
        },
        hasChanged: function(attr) {
            if (attr == null)
                return !_.isEmpty(this.changed);
            return _.has(this.changed, attr)
        },
        changedAttributes: function(diff) {
            if (!diff)
                return this.hasChanged() ? _.clone(this.changed) : false;
            var val, changed = false;
            var old = this._changing ? this._previousAttributes: this.attributes;
            for (var attr in diff) {
                if (_.isEqual(old[attr], val = diff[attr]))
                    continue;
                (changed || (changed = {}))[attr] = val
            }
            return changed
        },
        previous: function(attr) {
            if (attr == null ||!this._previousAttributes)
                return null;
            return this._previousAttributes[attr]
        },
        previousAttributes: function() {
            return _.clone(this._previousAttributes)
        },
        fetch: function(options) {
            options = options ? _.clone(options) : {};
            if (options.parse === void 0)
                options.parse = true;
            var model = this;
            var success = options.success;
            options.success = function(resp) {
                if (!model.set(model.parse(resp, options), options))
                    return false;
                if (success)
                    success(model, resp, options);
                model.trigger("sync", model, resp, options)
            };
            wrapError(this, options);
            return this.sync("read", this, options)
        },
        save: function(key, val, options) {
            var attrs, method, xhr, attributes = this.attributes;
            if (key == null || typeof key === "object") {
                attrs = key;
                options = val
            } else {
                (attrs = {})[key] = val
            }
            options = _.extend({
                validate: true
            }, options);
            if (attrs&&!options.wait) {
                if (!this.set(attrs, options))
                    return false
            } else {
                if (!this._validate(attrs, options))
                    return false
            }
            if (attrs && options.wait) {
                this.attributes = _.extend({}, attributes, attrs)
            }
            if (options.parse === void 0)
                options.parse = true;
            var model = this;
            var success = options.success;
            options.success = function(resp) {
                model.attributes = attributes;
                var serverAttrs = model.parse(resp, options);
                if (options.wait)
                    serverAttrs = _.extend(attrs || {}, serverAttrs);
                if (_.isObject(serverAttrs)&&!model.set(serverAttrs, options)) {
                    return false
                }
                if (success)
                    success(model, resp, options);
                model.trigger("sync", model, resp, options)
            };
            wrapError(this, options);
            method = this.isNew() ? "create" : options.patch ? "patch" : "update";
            if (method === "patch")
                options.attrs = attrs;
            xhr = this.sync(method, this, options);
            if (attrs && options.wait)
                this.attributes = attributes;
            return xhr
        },
        destroy: function(options) {
            options = options ? _.clone(options) : {};
            var model = this;
            var success = options.success;
            var destroy = function() {
                model.trigger("destroy", model, model.collection, options)
            };
            options.success = function(resp) {
                if (options.wait || model.isNew())
                    destroy();
                if (success)
                    success(model, resp, options);
                if (!model.isNew())
                    model.trigger("sync", model, resp, options)
            };
            if (this.isNew()) {
                options.success();
                return false
            }
            wrapError(this, options);
            var xhr = this.sync("delete", this, options);
            if (!options.wait)
                destroy();
            return xhr
        },
        url: function() {
            var base = _.result(this, "urlRoot") || _.result(this.collection, "url") || urlError();
            if (this.isNew())
                return base;
            return base.replace(/([^\/])$/, "$1/") + encodeURIComponent(this.id)
        },
        parse: function(resp, options) {
            return resp
        },
        clone: function() {
            return new this.constructor(this.attributes)
        },
        isNew: function() {
            return !this.has(this.idAttribute)
        },
        isValid: function(options) {
            return this._validate({}, _.extend(options || {}, {
                validate: true
            }))
        },
        _validate: function(attrs, options) {
            if (!options.validate ||!this.validate)
                return true;
            attrs = _.extend({}, this.attributes, attrs);
            var error = this.validationError = this.validate(attrs, options) || null;
            if (!error)
                return true;
            this.trigger("invalid", this, error, _.extend(options, {
                validationError: error
            }));
            return false
        }
    });
    var modelMethods = ["keys", "values", "pairs", "invert", "pick", "omit"];
    _.each(modelMethods, function(method) {
        Model.prototype[method] = function() {
            var args = slice.call(arguments);
            args.unshift(this.attributes);
            return _[method].apply(_, args)
        }
    });
    var Collection = Backbone.Collection = function(models, options) {
        options || (options = {});
        if (options.model)
            this.model = options.model;
        if (options.comparator !== void 0)
            this.comparator = options.comparator;
        this._reset();
        this.initialize.apply(this, arguments);
        if (models)
            this.reset(models, _.extend({
                silent: true
            }, options))
    };
    var setOptions = {
        add: true,
        remove: true,
        merge: true
    };
    var addOptions = {
        add: true,
        remove: false
    };
    _.extend(Collection.prototype, Events, {
        model: Model,
        initialize: function() {},
        toJSON: function(options) {
            return this.map(function(model) {
                return model.toJSON(options)
            })
        },
        sync: function() {
            return Backbone.sync.apply(this, arguments)
        },
        add: function(models, options) {
            return this.set(models, _.extend({
                merge: false
            }, options, addOptions))
        },
        remove: function(models, options) {
            var singular=!_.isArray(models);
            models = singular ? [models] : _.clone(models);
            options || (options = {});
            var i, l, index, model;
            for (i = 0, l = models.length; i < l; i++) {
                model = models[i] = this.get(models[i]);
                if (!model)
                    continue;
                delete this._byId[model.id];
                delete this._byId[model.cid];
                index = this.indexOf(model);
                this.models.splice(index, 1);
                this.length--;
                if (!options.silent) {
                    options.index = index;
                    model.trigger("remove", model, this, options)
                }
                this._removeReference(model, options)
            }
            return singular ? models[0] : models
        },
        set: function(models, options) {
            options = _.defaults({}, options, setOptions);
            if (options.parse)
                models = this.parse(models, options);
            var singular=!_.isArray(models);
            models = singular ? models ? [models] : [] : _.clone(models);
            var i, l, id, model, attrs, existing, sort;
            var at = options.at;
            var targetModel = this.model;
            var sortable = this.comparator && at == null && options.sort !== false;
            var sortAttr = _.isString(this.comparator) ? this.comparator: null;
            var toAdd = [], toRemove = [], modelMap = {};
            var add = options.add, merge = options.merge, remove = options.remove;
            var order=!sortable && add && remove ? [] : false;
            for (i = 0, l = models.length; i < l; i++) {
                attrs = models[i] || {};
                if (attrs instanceof Model) {
                    id = model = attrs
                } else {
                    id = attrs[targetModel.prototype.idAttribute || "id"]
                }
                if (existing = this.get(id)) {
                    if (remove)
                        modelMap[existing.cid] = true;
                    if (merge) {
                        attrs = attrs === model ? model.attributes : attrs;
                        if (options.parse)
                            attrs = existing.parse(attrs, options);
                        existing.set(attrs, options);
                        if (sortable&&!sort && existing.hasChanged(sortAttr))
                            sort = true
                    }
                    models[i] = existing
                } else if (add) {
                    model = models[i] = this._prepareModel(attrs, options);
                    if (!model)
                        continue;
                    toAdd.push(model);
                    this._addReference(model, options)
                }
                model = existing || model;
                if (order && (model.isNew() ||!modelMap[model.id]))
                    order.push(model);
                modelMap[model.id] = true
            }
            if (remove) {
                for (i = 0, l = this.length; i < l; ++i) {
                    if (!modelMap[(model = this.models[i]).cid])
                        toRemove.push(model)
                    }
                if (toRemove.length)
                    this.remove(toRemove, options)
            }
            if (toAdd.length || order && order.length) {
                if (sortable)
                    sort = true;
                this.length += toAdd.length;
                if (at != null) {
                    for (i = 0, l = toAdd.length; i < l; i++) {
                        this.models.splice(at + i, 0, toAdd[i])
                    }
                } else {
                    if (order)
                        this.models.length = 0;
                    var orderedModels = order || toAdd;
                    for (i = 0, l = orderedModels.length; i < l; i++) {
                        this.models.push(orderedModels[i])
                    }
                }
            }
            if (sort)
                this.sort({
                    silent: true
                });
            if (!options.silent) {
                for (i = 0, l = toAdd.length; i < l; i++) {
                    (model = toAdd[i]).trigger("add", model, this, options)
                }
                if (sort || order && order.length)
                    this.trigger("sort", this, options)
            }
            return singular ? models[0] : models
        },
        reset: function(models, options) {
            options || (options = {});
            for (var i = 0, l = this.models.length; i < l; i++) {
                this._removeReference(this.models[i], options)
            }
            options.previousModels = this.models;
            this._reset();
            models = this.add(models, _.extend({
                silent: true
            }, options));
            if (!options.silent)
                this.trigger("reset", this, options);
            return models
        },
        push: function(model, options) {
            return this.add(model, _.extend({
                at: this.length
            }, options))
        },
        pop: function(options) {
            var model = this.at(this.length - 1);
            this.remove(model, options);
            return model
        },
        unshift: function(model, options) {
            return this.add(model, _.extend({
                at: 0
            }, options))
        },
        shift: function(options) {
            var model = this.at(0);
            this.remove(model, options);
            return model
        },
        slice: function() {
            return slice.apply(this.models, arguments)
        },
        get: function(obj) {
            if (obj == null)
                return void 0;
            return this._byId[obj] || this._byId[obj.id] || this._byId[obj.cid]
        },
        at: function(index) {
            return this.models[index]
        },
        where: function(attrs, first) {
            if (_.isEmpty(attrs))
                return first ? void 0 : [];
            return this[first ? "find": "filter"](function(model) {
                for (var key in attrs) {
                    if (attrs[key] !== model.get(key))
                        return false
                }
                return true
            })
        },
        findWhere: function(attrs) {
            return this.where(attrs, true)
        },
        sort: function(options) {
            if (!this.comparator)
                throw new Error("Cannot sort a set without a comparator");
            options || (options = {});
            if (_.isString(this.comparator) || this.comparator.length === 1) {
                this.models = this.sortBy(this.comparator, this)
            } else {
                this.models.sort(_.bind(this.comparator, this))
            }
            if (!options.silent)
                this.trigger("sort", this, options);
            return this
        },
        pluck: function(attr) {
            return _.invoke(this.models, "get", attr)
        },
        fetch: function(options) {
            options = options ? _.clone(options) : {};
            if (options.parse === void 0)
                options.parse = true;
            var success = options.success;
            var collection = this;
            options.success = function(resp) {
                var method = options.reset ? "reset": "set";
                collection[method](resp, options);
                if (success)
                    success(collection, resp, options);
                collection.trigger("sync", collection, resp, options)
            };
            wrapError(this, options);
            return this.sync("read", this, options)
        },
        create: function(model, options) {
            options = options ? _.clone(options) : {};
            if (!(model = this._prepareModel(model, options)))
                return false;
            if (!options.wait)
                this.add(model, options);
            var collection = this;
            var success = options.success;
            options.success = function(model, resp) {
                if (options.wait)
                    collection.add(model, options);
                if (success)
                    success(model, resp, options)
            };
            model.save(null, options);
            return model
        },
        parse: function(resp, options) {
            return resp
        },
        clone: function() {
            return new this.constructor(this.models)
        },
        _reset: function() {
            this.length = 0;
            this.models = [];
            this._byId = {}
        },
        _prepareModel: function(attrs, options) {
            if (attrs instanceof Model)
                return attrs;
            options = options ? _.clone(options) : {};
            options.collection = this;
            var model = new this.model(attrs, options);
            if (!model.validationError)
                return model;
            this.trigger("invalid", this, model.validationError, options);
            return false
        },
        _addReference: function(model, options) {
            this._byId[model.cid] = model;
            if (model.id != null)
                this._byId[model.id] = model;
            if (!model.collection)
                model.collection = this;
            model.on("all", this._onModelEvent, this)
        },
        _removeReference: function(model, options) {
            if (this === model.collection)
                delete model.collection;
            model.off("all", this._onModelEvent, this)
        },
        _onModelEvent: function(event, model, collection, options) {
            if ((event === "add" || event === "remove") && collection !== this)
                return;
            if (event === "destroy")
                this.remove(model, options);
            if (model && event === "change:" + model.idAttribute) {
                delete this._byId[model.previous(model.idAttribute)];
                if (model.id != null)
                    this._byId[model.id] = model
            }
            this.trigger.apply(this, arguments)
        }
    });
    var methods = ["forEach", "each", "map", "collect", "reduce", "foldl", "inject", "reduceRight", "foldr", "find", "detect", "filter", "select", "reject", "every", "all", "some", "any", "include", "contains", "invoke", "max", "min", "toArray", "size", "first", "head", "take", "initial", "rest", "tail", "drop", "last", "without", "difference", "indexOf", "shuffle", "lastIndexOf", "isEmpty", "chain", "sample"];
    _.each(methods, function(method) {
        Collection.prototype[method] = function() {
            var args = slice.call(arguments);
            args.unshift(this.models);
            return _[method].apply(_, args)
        }
    });
    var attributeMethods = ["groupBy", "countBy", "sortBy", "indexBy"];
    _.each(attributeMethods, function(method) {
        Collection.prototype[method] = function(value, context) {
            var iterator = _.isFunction(value) ? value: function(model) {
                return model.get(value)
            };
            return _[method](this.models, iterator, context)
        }
    });
    var View = Backbone.View = function(options) {
        this.cid = _.uniqueId("view");
        options || (options = {});
        _.extend(this, _.pick(options, viewOptions));
        this._ensureElement();
        this.initialize.apply(this, arguments);
        this.delegateEvents()
    };
    var delegateEventSplitter = /^(\S+)\s*(.*)$/;
    var viewOptions = ["model", "collection", "el", "id", "attributes", "className", "tagName", "events"];
    _.extend(View.prototype, Events, {
        tagName: "div",
        $: function(selector) {
            return this.$el.find(selector)
        },
        initialize: function() {},
        render: function() {
            return this
        },
        remove: function() {
            this.$el.remove();
            this.stopListening();
            return this
        },
        setElement: function(element, delegate) {
            if (this.$el)
                this.undelegateEvents();
            this.$el = element instanceof Backbone.$ ? element : Backbone.$(element);
            this.el = this.$el[0];
            if (delegate !== false)
                this.delegateEvents();
            return this
        },
        delegateEvents: function(events) {
            if (!(events || (events = _.result(this, "events"))))
                return this;
            this.undelegateEvents();
            for (var key in events) {
                var method = events[key];
                if (!_.isFunction(method))
                    method = this[events[key]];
                if (!method)
                    continue;
                var match = key.match(delegateEventSplitter);
                var eventName = match[1], selector = match[2];
                method = _.bind(method, this);
                eventName += ".delegateEvents" + this.cid;
                if (selector === "") {
                    this.$el.on(eventName, method)
                } else {
                    this.$el.on(eventName, selector, method)
                }
            }
            return this
        },
        undelegateEvents: function() {
            this.$el.off(".delegateEvents" + this.cid);
            return this
        },
        _ensureElement: function() {
            if (!this.el) {
                var attrs = _.extend({}, _.result(this, "attributes"));
                if (this.id)
                    attrs.id = _.result(this, "id");
                if (this.className)
                    attrs["class"] = _.result(this, "className");
                var $el = Backbone.$("<" + _.result(this, "tagName") + ">").attr(attrs);
                this.setElement($el, false)
            } else {
                this.setElement(_.result(this, "el"), false)
            }
        }
    });
    Backbone.sync = function(method, model, options) {
        var type = methodMap[method];
        _.defaults(options || (options = {}), {
            emulateHTTP: Backbone.emulateHTTP,
            emulateJSON: Backbone.emulateJSON
        });
        var params = {
            type: type,
            dataType: "json"
        };
        if (!options.url) {
            params.url = _.result(model, "url") || urlError()
        }
        if (options.data == null && model && (method === "create" || method === "update" || method === "patch")) {
            params.contentType = "application/json";
            params.data = JSON.stringify(options.attrs || model.toJSON(options))
        }
        if (options.emulateJSON) {
            params.contentType = "application/x-www-form-urlencoded";
            params.data = params.data ? {
                model: params.data
            } : {}
        }
        if (options.emulateHTTP && (type === "PUT" || type === "DELETE" || type === "PATCH")) {
            params.type = "POST";
            if (options.emulateJSON)
                params.data._method = type;
            var beforeSend = options.beforeSend;
            options.beforeSend = function(xhr) {
                xhr.setRequestHeader("X-HTTP-Method-Override", type);
                if (beforeSend)
                    return beforeSend.apply(this, arguments)
            }
        }
        if (params.type !== "GET"&&!options.emulateJSON) {
            params.processData = false
        }
        if (params.type === "PATCH" && noXhrPatch) {
            params.xhr = function() {
                return new ActiveXObject("Microsoft.XMLHTTP")
            }
        }
        var xhr = options.xhr = Backbone.ajax(_.extend(params, options));
        model.trigger("request", model, xhr, options);
        return xhr
    };
    var noXhrPatch = typeof window !== "undefined"&&!!window.ActiveXObject&&!(window.XMLHttpRequest && (new XMLHttpRequest).dispatchEvent);
    var methodMap = {
        create: "POST",
        update: "PUT",
        patch: "PATCH",
        "delete": "DELETE",
        read: "GET"
    };
    Backbone.ajax = function() {
        return Backbone.$.ajax.apply(Backbone.$, arguments)
    };
    var Router = Backbone.Router = function(options) {
        options || (options = {});
        if (options.routes)
            this.routes = options.routes;
        this._bindRoutes();
        this.initialize.apply(this, arguments)
    };
    var optionalParam = /\((.*?)\)/g;
    var namedParam = /(\(\?)?:\w+/g;
    var splatParam = /\*\w+/g;
    var escapeRegExp = /[\-{}\[\]+?.,\\\^$|#\s]/g;
    _.extend(Router.prototype, Events, {
        initialize: function() {},
        route: function(route, name, callback) {
            if (!_.isRegExp(route))
                route = this._routeToRegExp(route);
            if (_.isFunction(name)) {
                callback = name;
                name = ""
            }
            if (!callback)
                callback = this[name];
            var router = this;
            Backbone.history.route(route, function(fragment) {
                var args = router._extractParameters(route, fragment);
                router.execute(callback, args);
                router.trigger.apply(router, ["route:" + name].concat(args));
                router.trigger("route", name, args);
                Backbone.history.trigger("route", router, name, args)
            });
            return this
        },
        execute: function(callback, args) {
            if (callback)
                callback.apply(this, args)
        },
        navigate: function(fragment, options) {
            Backbone.history.navigate(fragment, options);
            return this
        },
        _bindRoutes: function() {
            if (!this.routes)
                return;
            this.routes = _.result(this, "routes");
            var route, routes = _.keys(this.routes);
            while ((route = routes.pop()) != null) {
                this.route(route, this.routes[route])
            }
        },
        _routeToRegExp: function(route) {
            route = route.replace(escapeRegExp, "\\$&").replace(optionalParam, "(?:$1)?").replace(namedParam, function(match, optional) {
                return optional ? match : "([^/?]+)"
            }).replace(splatParam, "([^?]*?)");
            return new RegExp("^" + route + "(?:\\?([\\s\\S]*))?$")
        },
        _extractParameters: function(route, fragment) {
            var params = route.exec(fragment).slice(1);
            return _.map(params, function(param, i) {
                if (i === params.length - 1)
                    return param || null;
                return param ? decodeURIComponent(param) : null
            })
        }
    });
    var History = Backbone.History = function() {
        this.handlers = [];
        _.bindAll(this, "checkUrl");
        if (typeof window !== "undefined") {
            this.location = window.location;
            this.history = window.history
        }
    };
    var routeStripper = /^[#\/]|\s+$/g;
    var rootStripper = /^\/+|\/+$/g;
    var isExplorer = /msie [\w.]+/;
    var trailingSlash = /\/$/;
    var pathStripper = /#.*$/;
    History.started = false;
    _.extend(History.prototype, Events, {
        interval: 50,
        atRoot: function() {
            return this.location.pathname.replace(/[^\/]$/, "$&/") === this.root
        },
        getHash: function(window) {
            var match = (window || this).location.href.match(/#(.*)$/);
            return match ? match[1] : ""
        },
        getFragment: function(fragment, forcePushState) {
            if (fragment == null) {
                if (this._hasPushState ||!this._wantsHashChange || forcePushState) {
                    fragment = decodeURI(this.location.pathname + this.location.search);
                    var root = this.root.replace(trailingSlash, "");
                    if (!fragment.indexOf(root))
                        fragment = fragment.slice(root.length)
                    } else {
                    fragment = this.getHash()
                }
            }
            return fragment.replace(routeStripper, "")
        },
        start: function(options) {
            if (History.started)
                throw new Error("Backbone.history has already been started");
            History.started = true;
            this.options = _.extend({
                root: "/"
            }, this.options, options);
            this.root = this.options.root;
            this._wantsHashChange = this.options.hashChange !== false;
            this._wantsPushState=!!this.options.pushState;
            this._hasPushState=!!(this.options.pushState && this.history && this.history.pushState);
            var fragment = this.getFragment();
            var docMode = document.documentMode;
            var oldIE = isExplorer.exec(navigator.userAgent.toLowerCase()) && (!docMode || docMode <= 7);
            this.root = ("/" + this.root + "/").replace(rootStripper, "/");
            if (oldIE && this._wantsHashChange) {
                var frame = Backbone.$('<iframe src="javascript:0" tabindex="-1">');
                this.iframe = frame.hide().appendTo("body")[0].contentWindow;
                this.navigate(fragment)
            }
            if (this._hasPushState) {
                Backbone.$(window).on("popstate", this.checkUrl)
            } else if (this._wantsHashChange && "onhashchange"in window&&!oldIE) {
                Backbone.$(window).on("hashchange", this.checkUrl)
            } else if (this._wantsHashChange) {
                this._checkUrlInterval = setInterval(this.checkUrl, this.interval)
            }
            this.fragment = fragment;
            var loc = this.location;
            if (this._wantsHashChange && this._wantsPushState) {
                if (!this._hasPushState&&!this.atRoot()) {
                    this.fragment = this.getFragment(null, true);
                    this.location.replace(this.root + "#" + this.fragment);
                    return true
                } else if (this._hasPushState && this.atRoot() && loc.hash) {
                    this.fragment = this.getHash().replace(routeStripper, "");
                    this.history.replaceState({}, document.title, this.root + this.fragment)
                }
            }
            if (!this.options.silent)
                return this.loadUrl()
        },
        stop: function() {
            Backbone.$(window).off("popstate", this.checkUrl).off("hashchange", this.checkUrl);
            if (this._checkUrlInterval)
                clearInterval(this._checkUrlInterval);
            History.started = false
        },
        route: function(route, callback) {
            this.handlers.unshift({
                route: route,
                callback: callback
            })
        },
        checkUrl: function(e) {
            var current = this.getFragment();
            if (current === this.fragment && this.iframe) {
                current = this.getFragment(this.getHash(this.iframe))
            }
            if (current === this.fragment)
                return false;
            if (this.iframe)
                this.navigate(current);
            this.loadUrl()
        },
        loadUrl: function(fragment) {
            fragment = this.fragment = this.getFragment(fragment);
            return _.any(this.handlers, function(handler) {
                if (handler.route.test(fragment)) {
                    handler.callback(fragment);
                    return true
                }
            })
        },
        navigate: function(fragment, options) {
            if (!History.started)
                return false;
            if (!options || options === true)
                options = {
                    trigger: !!options
                };
            var url = this.root + (fragment = this.getFragment(fragment || ""));
            fragment = fragment.replace(pathStripper, "");
            if (this.fragment === fragment)
                return;
            this.fragment = fragment;
            if (fragment === "" && url !== "/")
                url = url.slice(0, - 1);
            if (this._hasPushState) {
                this.history[options.replace ? "replaceState": "pushState"]({}, document.title, url)
            } else if (this._wantsHashChange) {
                this._updateHash(this.location, fragment, options.replace);
                if (this.iframe && fragment !== this.getFragment(this.getHash(this.iframe))) {
                    if (!options.replace)
                        this.iframe.document.open().close();
                    this._updateHash(this.iframe.location, fragment, options.replace)
                }
            } else {
                return this.location.assign(url)
            }
            if (options.trigger)
                return this.loadUrl(fragment)
        },
        _updateHash: function(location, fragment, replace) {
            if (replace) {
                var href = location.href.replace(/(javascript:|#).*$/, "");
                location.replace(href + "#" + fragment)
            } else {
                location.hash = "#" + fragment
            }
        }
    });
    Backbone.history = new History;
    var extend = function(protoProps, staticProps) {
        var parent = this;
        var child;
        if (protoProps && _.has(protoProps, "constructor")) {
            child = protoProps.constructor
        } else {
            child = function() {
                return parent.apply(this, arguments)
            }
        }
        _.extend(child, parent, staticProps);
        var Surrogate = function() {
            this.constructor = child
        };
        Surrogate.prototype = parent.prototype;
        child.prototype = new Surrogate;
        if (protoProps)
            _.extend(child.prototype, protoProps);
        child.__super__ = parent.prototype;
        return child
    };
    Model.extend = Collection.extend = Router.extend = View.extend = History.extend = extend;
    var urlError = function() {
        throw new Error('A "url" property or function must be specified')
    };
    var wrapError = function(model, options) {
        var error = options.error;
        options.error = function(resp) {
            if (error)
                error(model, resp, options);
            model.trigger("error", model, resp, options)
        }
    };
    return Backbone
});
(function(root, factory) {
    if (typeof define === "function" && define.amd) {
        define([], factory)
    } else {
        root.Vectorizer = root.V = factory()
    }
})(this, function() {
    var SVGsupported=!!(window.SVGAngle || document.implementation.hasFeature("http://www.w3.org/TR/SVG11/feature#BasicStructure", "1.1"));
    var ns = {
        xmlns: "http://www.w3.org/2000/svg",
        xlink: "http://www.w3.org/1999/xlink"
    };
    var SVGversion = "1.1";
    var idCounter = 0;
    function uniqueId() {
        var id=++idCounter + "";
        return "v-" + id
    }
    function createElement(el, attrs, children) {
        if (!el)
            return undefined;
        if (typeof el === "object") {
            return new VElement(el)
        }
        attrs = attrs || {};
        if (el.toLowerCase() === "svg") {
            attrs.xmlns = ns.xmlns;
            attrs["xmlns:xlink"] = ns.xlink;
            attrs.version = SVGversion
        } else if (el[0] === "<") {
            var svg = '<svg xmlns="' + ns.xmlns + '" xmlns:xlink="' + ns.xlink + '" version="' + SVGversion + '">' + el + "</svg>";
            var parser = new DOMParser;
            parser.async = false;
            var svgDoc = parser.parseFromString(svg, "text/xml").documentElement;
            if (svgDoc.childNodes.length > 1) {
                var ret = [];
                for (var i = 0, len = svgDoc.childNodes.length; i < len; i++) {
                    var childNode = svgDoc.childNodes[i];
                    ret.push(new VElement(document.importNode(childNode, true)))
                }
                return ret
            }
            return new VElement(document.importNode(svgDoc.firstChild, true))
        }
        el = document.createElementNS(ns.xmlns, el);
        for (var key in attrs) {
            setAttribute(el, key, attrs[key])
        }
        if (Object.prototype.toString.call(children) != "[object Array]")
            children = [children];
        var i = 0, len = children[0] && children.length || 0, child;
        for (; i < len; i++) {
            child = children[i];
            el.appendChild(child instanceof VElement ? child.node : child)
        }
        return new VElement(el)
    }
    function setAttribute(el, name, value) {
        if (name.indexOf(":")>-1) {
            var combinedKey = name.split(":");
            el.setAttributeNS(ns[combinedKey[0]], combinedKey[1], value)
        } else if (name === "id") {
            el.id = value
        } else {
            el.setAttribute(name, value)
        }
    }
    function parseTransformString(transform) {
        var translate, rotate, scale;
        if (transform) {
            var separator = /[ ,]+/;
            var translateMatch = transform.match(/translate\((.*)\)/);
            if (translateMatch) {
                translate = translateMatch[1].split(separator)
            }
            var rotateMatch = transform.match(/rotate\((.*)\)/);
            if (rotateMatch) {
                rotate = rotateMatch[1].split(separator)
            }
            var scaleMatch = transform.match(/scale\((.*)\)/);
            if (scaleMatch) {
                scale = scaleMatch[1].split(separator)
            }
        }
        var sx = scale && scale[0] ? parseFloat(scale[0]): 1;
        return {
            translate: {
                tx: translate && translate[0] ? parseInt(translate[0], 10): 0,
                ty: translate && translate[1] ? parseInt(translate[1], 10): 0
            },
            rotate: {
                angle: rotate && rotate[0] ? parseInt(rotate[0], 10): 0,
                cx: rotate && rotate[1] ? parseInt(rotate[1], 10): undefined,
                cy: rotate && rotate[2] ? parseInt(rotate[2], 10): undefined
            },
            scale: {
                sx: sx,
                sy: scale && scale[1] ? parseFloat(scale[1]): sx
            }
        }
    }
    function deltaTransformPoint(matrix, point) {
        var dx = point.x * matrix.a + point.y * matrix.c + 0;
        var dy = point.x * matrix.b + point.y * matrix.d + 0;
        return {
            x: dx,
            y: dy
        }
    }
    function decomposeMatrix(matrix) {
        var px = deltaTransformPoint(matrix, {
            x: 0,
            y: 1
        });
        var py = deltaTransformPoint(matrix, {
            x: 1,
            y: 0
        });
        var skewX = 180 / Math.PI * Math.atan2(px.y, px.x) - 90;
        var skewY = 180 / Math.PI * Math.atan2(py.y, py.x);
        return {
            translateX: matrix.e,
            translateY: matrix.f,
            scaleX: Math.sqrt(matrix.a * matrix.a + matrix.b * matrix.b),
            scaleY: Math.sqrt(matrix.c * matrix.c + matrix.d * matrix.d),
            skewX: skewX,
            skewY: skewY,
            rotation: skewX
        }
    }
    function VElement(el) {
        this.node = el;
        if (!this.node.id) {
            this.node.id = uniqueId()
        }
    }
    VElement.prototype = {
        translate: function(tx, ty, opt) {
            opt = opt || {};
            ty = ty || 0;
            var transformAttr = this.attr("transform") || "", transform = parseTransformString(transformAttr);
            if (typeof tx === "undefined") {
                return transform.translate
            }
            transformAttr = transformAttr.replace(/translate\([^\)]*\)/g, "").trim();
            var newTx = opt.absolute ? tx: transform.translate.tx + tx, newTy = opt.absolute ? ty: transform.translate.ty + ty, newTranslate = "translate(" + newTx + "," + newTy + ")";
            this.attr("transform", (newTranslate + " " + transformAttr).trim());
            return this
        },
        rotate: function(angle, cx, cy, opt) {
            opt = opt || {};
            var transformAttr = this.attr("transform") || "", transform = parseTransformString(transformAttr);
            if (typeof angle === "undefined") {
                return transform.rotate
            }
            transformAttr = transformAttr.replace(/rotate\([^\)]*\)/g, "").trim();
            angle%=360;
            var newAngle = opt.absolute ? angle: transform.rotate.angle + angle, newOrigin = cx !== undefined && cy !== undefined ? "," + cx + "," + cy: "", newRotate = "rotate(" + newAngle + newOrigin + ")";
            this.attr("transform", (transformAttr + " " + newRotate).trim());
            return this
        },
        scale: function(sx, sy) {
            sy = typeof sy === "undefined" ? sx : sy;
            var transformAttr = this.attr("transform") || "", transform = parseTransformString(transformAttr);
            if (typeof sx === "undefined") {
                return transform.scale
            }
            transformAttr = transformAttr.replace(/scale\([^\)]*\)/g, "").trim();
            var newScale = "scale(" + sx + "," + sy + ")";
            this.attr("transform", (transformAttr + " " + newScale).trim());
            return this
        },
        bbox: function(withoutTransformations, target) {
            if (!this.node.ownerSVGElement)
                return {
                    x: 0,
                    y: 0,
                    width: 0,
                    height: 0
                };
            var box;
            try {
                box = this.node.getBBox();
                box = {
                    x: box.x | 0,
                    y: box.y | 0,
                    width: box.width | 0,
                    height: box.height | 0
                }
            } catch (e) {
                box = {
                    x: this.node.clientLeft,
                    y: this.node.clientTop,
                    width: this.node.clientWidth,
                    height: this.node.clientHeight
                }
            }
            if (withoutTransformations) {
                return box
            }
            var matrix = this.node.getTransformToElement(target || this.node.ownerSVGElement);
            var corners = [];
            var point = this.node.ownerSVGElement.createSVGPoint();
            point.x = box.x;
            point.y = box.y;
            corners.push(point.matrixTransform(matrix));
            point.x = box.x + box.width;
            point.y = box.y;
            corners.push(point.matrixTransform(matrix));
            point.x = box.x + box.width;
            point.y = box.y + box.height;
            corners.push(point.matrixTransform(matrix));
            point.x = box.x;
            point.y = box.y + box.height;
            corners.push(point.matrixTransform(matrix));
            var minX = corners[0].x;
            var maxX = minX;
            var minY = corners[0].y;
            var maxY = minY;
            for (var i = 1, len = corners.length; i < len; i++) {
                var x = corners[i].x;
                var y = corners[i].y;
                if (x < minX) {
                    minX = x
                } else if (x > maxX) {
                    maxX = x
                }
                if (y < minY) {
                    minY = y
                } else if (y > maxY) {
                    maxY = y
                }
            }
            return {
                x: minX,
                y: minY,
                width: maxX - minX,
                height: maxY - minY
            }
        },
        text: function(content, opt) {
            opt = opt || {};
            var lines = content.split("\n");
            var i = 0;
            var tspan;
            this.attr("y", "0.8em");
            this.attr("display", content ? null : "none");
            this.node.setAttributeNS("http://www.w3.org/XML/1998/namespace", "xml:space", "preserve");
            if (lines.length === 1) {
                this.node.textContent = content;
                return this
            }
            this.node.textContent = "";
            for (; i < lines.length; i++) {
                tspan = V("tspan", {
                    dy: i == 0 ? "0em": opt.lineHeight || "1em",
                    x: this.attr("x") || 0
                });
                tspan.node.textContent = lines[i] || " ";
                this.append(tspan)
            }
            return this
        },
        attr: function(name, value) {
            if (typeof name === "string" && typeof value === "undefined") {
                return this.node.getAttribute(name)
            }
            if (typeof name === "object") {
                for (var attrName in name) {
                    if (name.hasOwnProperty(attrName)) {
                        setAttribute(this.node, attrName, name[attrName])
                    }
                }
            } else {
                setAttribute(this.node, name, value)
            }
            return this
        },
        remove: function() {
            if (this.node.parentNode) {
                this.node.parentNode.removeChild(this.node)
            }
        },
        append: function(el) {
            var els = el;
            if (Object.prototype.toString.call(el) !== "[object Array]") {
                els = [el]
            }
            for (var i = 0, len = els.length; i < len; i++) {
                el = els[i];
                this.node.appendChild(el instanceof VElement ? el.node : el)
            }
            return this
        },
        prepend: function(el) {
            this.node.insertBefore(el instanceof VElement ? el.node : el, this.node.firstChild)
        },
        svg: function() {
            return this.node instanceof window.SVGSVGElement ? this : V(this.node.ownerSVGElement)
        },
        defs: function() {
            var defs = this.svg().node.getElementsByTagName("defs");
            return defs && defs.length ? V(defs[0]) : undefined
        },
        clone: function() {
            var clone = V(this.node.cloneNode(true));
            clone.node.id = uniqueId();
            return clone
        },
        findOne: function(selector) {
            var found = this.node.querySelector(selector);
            return found ? V(found) : undefined
        },
        find: function(selector) {
            var nodes = this.node.querySelectorAll(selector);
            for (var i = 0, len = nodes.length; i < len; i++) {
                nodes[i] = V(nodes[i])
            }
            return nodes
        },
        toLocalPoint: function(x, y) {
            var svg = this.svg().node;
            var p = svg.createSVGPoint();
            p.x = x;
            p.y = y;
            try {
                var globalPoint = p.matrixTransform(svg.getScreenCTM().inverse());
                var globalToLocalMatrix = this.node.getTransformToElement(svg).inverse()
            } catch (e) {
                return p
            }
            return globalPoint.matrixTransform(globalToLocalMatrix)
        },
        translateCenterToPoint: function(p) {
            var bbox = this.bbox();
            var center = g.rect(bbox).center();
            this.translate(p.x - center.x, p.y - center.y)
        },
        translateAndAutoOrient: function(position, reference, target) {
            var s = this.scale();
            this.attr("transform", "");
            this.scale(s.sx, s.sy);
            var svg = this.svg().node;
            var bbox = this.bbox(false, target);
            var translateToOrigin = svg.createSVGTransform();
            translateToOrigin.setTranslate( - bbox.x - bbox.width / 2, - bbox.y - bbox.height / 2);
            var rotateAroundOrigin = svg.createSVGTransform();
            var angle = g.point(position).changeInAngle(position.x - reference.x, position.y - reference.y, reference);
            rotateAroundOrigin.setRotate(angle, 0, 0);
            var translateFinal = svg.createSVGTransform();
            var finalPosition = g.point(position).move(reference, bbox.width / 2);
            translateFinal.setTranslate(position.x + (position.x - finalPosition.x), position.y + (position.y - finalPosition.y));
            var ctm = this.node.getTransformToElement(target);
            var transform = svg.createSVGTransform();
            transform.setMatrix(translateFinal.matrix.multiply(rotateAroundOrigin.matrix.multiply(translateToOrigin.matrix.multiply(ctm))));
            var decomposition = decomposeMatrix(transform.matrix);
            this.translate(decomposition.translateX, decomposition.translateY);
            this.rotate(decomposition.rotation);
            return this
        },
        animateAlongPath: function(attrs, path) {
            var animateMotion = V("animateMotion", attrs);
            var mpath = V("mpath", {
                "xlink:href": "#" + V(path).node.id
            });
            animateMotion.append(mpath);
            this.append(animateMotion);
            try {
                animateMotion.node.beginElement()
            } catch (e) {
                if (document.documentElement.getAttribute("smiling") === "fake") {
                    var animation = animateMotion.node;
                    animation.animators = [];
                    var animationID = animation.getAttribute("id");
                    if (animationID)
                        id2anim[animationID] = animation;
                    var targets = getTargets(animation);
                    for (var i = 0, len = targets.length; i < len; i++) {
                        var target = targets[i];
                        var animator = new Animator(animation, target, i);
                        animators.push(animator);
                        animation.animators[i] = animator;
                        animator.register()
                    }
                }
            }
        },
        hasClass: function(className) {
            return new RegExp("(\\s|^)" + className + "(\\s|$)").test(this.node.getAttribute("class"))
        },
        addClass: function(className) {
            if (!this.hasClass(className)) {
                var prevClasses = this.node.getAttribute("class") || "";
                this.node.setAttribute("class", (prevClasses + " " + className).trim())
            }
            return this
        },
        removeClass: function(className) {
            if (this.hasClass(className)) {
                var newClasses = this.node.getAttribute("class").replace(new RegExp("(\\s|^)" + className + "(\\s|$)", "g"), "$2");
                this.node.setAttribute("class", newClasses)
            }
            return this
        },
        toggleClass: function(className, toAdd) {
            var toRemove = typeof toAdd === "undefined" ? this.hasClass(className): !toAdd;
            if (toRemove) {
                this.removeClass(className)
            } else {
                this.addClass(className)
            }
            return this
        }
    };
    function rectToPath(r) {
        var topRx = r.rx || r["top-rx"] || 0;
        var bottomRx = r.rx || r["bottom-rx"] || 0;
        var topRy = r.ry || r["top-ry"] || 0;
        var bottomRy = r.ry || r["bottom-ry"] || 0;
        return ["M", r.x, r.y + topRy, "v", r.height - topRy - bottomRy, "a", bottomRx, bottomRy, 0, 0, 0, bottomRx, bottomRy, "h", r.width - 2 * bottomRx, "a", bottomRx, bottomRy, 0, 0, 0, bottomRx, - bottomRy, "v", - (r.height - bottomRy - topRy), "a", topRx, topRy, 0, 0, 0, - topRx, - topRy, "h", - (r.width - 2 * topRx), "a", topRx, topRy, 0, 0, 0, - topRx, topRy].join(" ")
    }
    var V = createElement;
    V.decomposeMatrix = decomposeMatrix;
    V.rectToPath = rectToPath;
    var svgDocument = V("svg").node;
    V.createSVGMatrix = function(m) {
        var svgMatrix = svgDocument.createSVGMatrix();
        for (var component in m) {
            svgMatrix[component] = m[component]
        }
        return svgMatrix
    };
    V.createSVGTransform = function() {
        return svgDocument.createSVGTransform()
    };
    V.createSVGPoint = function(x, y) {
        var p = svgDocument.createSVGPoint();
        p.x = x;
        p.y = y;
        return p
    };
    return V
});
(function(root, factory) {
    if (typeof define === "function" && define.amd) {
        define([], factory)
    } else if (typeof exports === "object") {
        module.exports = factory()
    } else {
        root.g = factory()
    }
})(this, function() {
    var math = Math;
    var abs = math.abs;
    var cos = math.cos;
    var sin = math.sin;
    var sqrt = math.sqrt;
    var mmin = math.min;
    var mmax = math.max;
    var atan = math.atan;
    var atan2 = math.atan2;
    var acos = math.acos;
    var round = math.round;
    var floor = math.floor;
    var PI = math.PI;
    var random = math.random;
    var toDeg = function(rad) {
        return 180 * rad / PI%360
    };
    var toRad = function(deg) {
        return deg%360 * PI / 180
    };
    var snapToGrid = function(val, gridSize) {
        return gridSize * Math.round(val / gridSize)
    };
    var normalizeAngle = function(angle) {
        return angle%360 + (angle < 0 ? 360 : 0)
    };
    function point(x, y) {
        if (!(this instanceof point))
            return new point(x, y);
        var xy;
        if (y === undefined && Object(x) !== x) {
            xy = x.split(x.indexOf("@")===-1 ? " " : "@");
            this.x = parseInt(xy[0], 10);
            this.y = parseInt(xy[1], 10)
        } else if (Object(x) === x) {
            this.x = x.x;
            this.y = x.y
        } else {
            this.x = x;
            this.y = y
        }
    }
    point.prototype = {
        toString: function() {
            return this.x + "@" + this.y
        },
        adhereToRect: function(r) {
            if (r.containsPoint(this)) {
                return this
            }
            this.x = mmin(mmax(this.x, r.x), r.x + r.width);
            this.y = mmin(mmax(this.y, r.y), r.y + r.height);
            return this
        },
        theta: function(p) {
            p = point(p);
            var y =- (p.y - this.y);
            var x = p.x - this.x;
            var PRECISION = 10;
            var rad = y.toFixed(PRECISION) == 0 && x.toFixed(PRECISION) == 0 ? 0: atan2(y, x);
            if (rad < 0) {
                rad = 2 * PI + rad
            }
            return 180 * rad / PI
        },
        distance: function(p) {
            return line(this, p).length()
        },
        manhattanDistance: function(p) {
            return abs(p.x - this.x) + abs(p.y - this.y)
        },
        offset: function(dx, dy) {
            this.x += dx || 0;
            this.y += dy || 0;
            return this
        },
        magnitude: function() {
            return sqrt(this.x * this.x + this.y * this.y) || .01
        },
        update: function(x, y) {
            this.x = x || 0;
            this.y = y || 0;
            return this
        },
        round: function(decimals) {
            this.x = decimals ? this.x.toFixed(decimals) : round(this.x);
            this.y = decimals ? this.y.toFixed(decimals) : round(this.y);
            return this
        },
        normalize: function(len) {
            var s = (len || 1) / this.magnitude();
            this.x = s * this.x;
            this.y = s * this.y;
            return this
        },
        difference: function(p) {
            return point(this.x - p.x, this.y - p.y)
        },
        bearing: function(p) {
            return line(this, p).bearing()
        },
        toPolar: function(o) {
            o = o && point(o) || point(0, 0);
            var x = this.x;
            var y = this.y;
            this.x = sqrt((x - o.x) * (x - o.x) + (y - o.y) * (y - o.y));
            this.y = toRad(o.theta(point(x, y)));
            return this
        },
        rotate: function(o, angle) {
            angle = (angle + 360)%360;
            this.toPolar(o);
            this.y += toRad(angle);
            var p = point.fromPolar(this.x, this.y, o);
            this.x = p.x;
            this.y = p.y;
            return this
        },
        move: function(ref, distance) {
            var theta = toRad(point(ref).theta(this));
            return this.offset(cos(theta) * distance, - sin(theta) * distance)
        },
        changeInAngle: function(dx, dy, ref) {
            return point(this).offset( - dx, - dy).theta(ref) - this.theta(ref)
        },
        equals: function(p) {
            return this.x === p.x && this.y === p.y
        },
        snapToGrid: function(gx, gy) {
            this.x = snapToGrid(this.x, gx);
            this.y = snapToGrid(this.y, gy || gx);
            return this
        },
        reflection: function(ref) {
            return point(ref).move(this, this.distance(ref))
        }
    };
    point.fromPolar = function(r, angle, o) {
        o = o && point(o) || point(0, 0);
        var x = abs(r * cos(angle));
        var y = abs(r * sin(angle));
        var deg = normalizeAngle(toDeg(angle));
        if (deg < 90)
            y =- y;
        else if (deg < 180) {
            x =- x;
            y =- y
        } else if (deg < 270)
            x =- x;
        return point(o.x + x, o.y + y)
    };
    point.random = function(x1, x2, y1, y2) {
        return point(floor(random() * (x2 - x1 + 1) + x1), floor(random() * (y2 - y1 + 1) + y1))
    };
    function line(p1, p2) {
        if (!(this instanceof line))
            return new line(p1, p2);
        this.start = point(p1);
        this.end = point(p2)
    }
    line.prototype = {
        toString: function() {
            return this.start.toString() + " " + this.end.toString()
        },
        length: function() {
            return sqrt(this.squaredLength())
        },
        squaredLength: function() {
            var x0 = this.start.x;
            var y0 = this.start.y;
            var x1 = this.end.x;
            var y1 = this.end.y;
            return (x0 -= x1) * x0 + (y0 -= y1) * y0
        },
        midpoint: function() {
            return point((this.start.x + this.end.x) / 2, (this.start.y + this.end.y) / 2)
        },
        intersection: function(l) {
            var pt1Dir = point(this.end.x - this.start.x, this.end.y - this.start.y);
            var pt2Dir = point(l.end.x - l.start.x, l.end.y - l.start.y);
            var det = pt1Dir.x * pt2Dir.y - pt1Dir.y * pt2Dir.x;
            var deltaPt = point(l.start.x - this.start.x, l.start.y - this.start.y);
            var alpha = deltaPt.x * pt2Dir.y - deltaPt.y * pt2Dir.x;
            var beta = deltaPt.x * pt1Dir.y - deltaPt.y * pt1Dir.x;
            if (det === 0 || alpha * det < 0 || beta * det < 0) {
                return null
            }
            if (det > 0) {
                if (alpha > det || beta > det) {
                    return null
                }
            } else {
                if (alpha < det || beta < det) {
                    return null
                }
            }
            return point(this.start.x + alpha * pt1Dir.x / det, this.start.y + alpha * pt1Dir.y / det)
        },
        bearing: function() {
            var lat1 = toRad(this.start.y);
            var lat2 = toRad(this.end.y);
            var lon1 = this.start.x;
            var lon2 = this.end.x;
            var dLon = toRad(lon2 - lon1);
            var y = sin(dLon) * cos(lat2);
            var x = cos(lat1) * sin(lat2) - sin(lat1) * cos(lat2) * cos(dLon);
            var brng = toDeg(atan2(y, x));
            var bearings = ["NE", "E", "SE", "S", "SW", "W", "NW", "N"];
            var index = brng - 22.5;
            if (index < 0)
                index += 360;
            index = parseInt(index / 45);
            return bearings[index]
        },
        pointAt: function(t) {
            var x = (1 - t) * this.start.x + t * this.end.x;
            var y = (1 - t) * this.start.y + t * this.end.y;
            return point(x, y)
        }
    };
    function rect(x, y, w, h) {
        if (!(this instanceof rect))
            return new rect(x, y, w, h);
        if (y === undefined) {
            y = x.y;
            w = x.width;
            h = x.height;
            x = x.x
        }
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h
    }
    rect.prototype = {
        toString: function() {
            return this.origin().toString() + " " + this.corner().toString()
        },
        origin: function() {
            return point(this.x, this.y)
        },
        corner: function() {
            return point(this.x + this.width, this.y + this.height)
        },
        topRight: function() {
            return point(this.x + this.width, this.y)
        },
        bottomLeft: function() {
            return point(this.x, this.y + this.height)
        },
        center: function() {
            return point(this.x + this.width / 2, this.y + this.height / 2)
        },
        intersect: function(r) {
            var myOrigin = this.origin();
            var myCorner = this.corner();
            var rOrigin = r.origin();
            var rCorner = r.corner();
            if (rCorner.x <= myOrigin.x || rCorner.y <= myOrigin.y || rOrigin.x >= myCorner.x || rOrigin.y >= myCorner.y)
                return false;
            return true
        },
        sideNearestToPoint: function(p) {
            p = point(p);
            var distToLeft = p.x - this.x;
            var distToRight = this.x + this.width - p.x;
            var distToTop = p.y - this.y;
            var distToBottom = this.y + this.height - p.y;
            var closest = distToLeft;
            var side = "left";
            if (distToRight < closest) {
                closest = distToRight;
                side = "right"
            }
            if (distToTop < closest) {
                closest = distToTop;
                side = "top"
            }
            if (distToBottom < closest) {
                closest = distToBottom;
                side = "bottom"
            }
            return side
        },
        containsPoint: function(p) {
            p = point(p);
            if (p.x >= this.x && p.x <= this.x + this.width && p.y >= this.y && p.y <= this.y + this.height) {
                return true
            }
            return false
        },
        containsRect: function(r) {
            var nr = rect(r).normalize();
            var W = nr.width;
            var H = nr.height;
            var X = nr.x;
            var Y = nr.y;
            var w = this.width;
            var h = this.height;
            if ((w | h | W | H) < 0) {
                return false
            }
            var x = this.x;
            var y = this.y;
            if (X < x || Y < y) {
                return false
            }
            w += x;
            W += X;
            if (W <= X) {
                if (w >= x || W > w)
                    return false
            } else {
                if (w >= x && W > w)
                    return false
            }
            h += y;
            H += Y;
            if (H <= Y) {
                if (h >= y || H > h)
                    return false
            } else {
                if (h >= y && H > h)
                    return false
            }
            return true
        },
        pointNearestToPoint: function(p) {
            p = point(p);
            if (this.containsPoint(p)) {
                var side = this.sideNearestToPoint(p);
                switch (side) {
                case"right":
                    return point(this.x + this.width, p.y);
                case"left":
                    return point(this.x, p.y);
                case"bottom":
                    return point(p.x, this.y + this.height);
                case"top":
                    return point(p.x, this.y)
                }
            }
            return p.adhereToRect(this)
        },
        intersectionWithLineFromCenterToPoint: function(p, angle) {
            p = point(p);
            var center = point(this.x + this.width / 2, this.y + this.height / 2);
            var result;
            if (angle)
                p.rotate(center, angle);
            var sides = [line(this.origin(), this.topRight()), line(this.topRight(), this.corner()), line(this.corner(), this.bottomLeft()), line(this.bottomLeft(), this.origin())];
            var connector = line(center, p);
            for (var i = sides.length - 1; i >= 0; --i) {
                var intersection = sides[i].intersection(connector);
                if (intersection !== null) {
                    result = intersection;
                    break
                }
            }
            if (result && angle)
                result.rotate(center, - angle);
            return result
        },
        moveAndExpand: function(r) {
            this.x += r.x;
            this.y += r.y;
            this.width += r.width;
            this.height += r.height;
            return this
        },
        round: function(decimals) {
            this.x = decimals ? this.x.toFixed(decimals) : round(this.x);
            this.y = decimals ? this.y.toFixed(decimals) : round(this.y);
            this.width = decimals ? this.width.toFixed(decimals) : round(this.width);
            this.height = decimals ? this.height.toFixed(decimals) : round(this.height);
            return this
        },
        normalize: function() {
            var newx = this.x;
            var newy = this.y;
            var newwidth = this.width;
            var newheight = this.height;
            if (this.width < 0) {
                newx = this.x + this.width;
                newwidth =- this.width
            }
            if (this.height < 0) {
                newy = this.y + this.height;
                newheight =- this.height
            }
            this.x = newx;
            this.y = newy;
            this.width = newwidth;
            this.height = newheight;
            return this
        },
        bbox: function(angle) {
            var theta = toRad(angle || 0);
            var st = abs(sin(theta));
            var ct = abs(cos(theta));
            var w = this.width * ct + this.height * st;
            var h = this.width * st + this.height * ct;
            return rect(this.x + (this.width - w) / 2, this.y + (this.height - h) / 2, w, h)
        }
    };
    function ellipse(c, a, b) {
        if (!(this instanceof ellipse))
            return new ellipse(c, a, b);
        c = point(c);
        this.x = c.x;
        this.y = c.y;
        this.a = a;
        this.b = b
    }
    ellipse.prototype = {
        toString: function() {
            return point(this.x, this.y).toString() + " " + this.a + " " + this.b
        },
        bbox: function() {
            return rect(this.x - this.a, this.y - this.b, 2 * this.a, 2 * this.b)
        },
        intersectionWithLineFromCenterToPoint: function(p, angle) {
            p = point(p);
            if (angle)
                p.rotate(point(this.x, this.y), angle);
            var dx = p.x - this.x;
            var dy = p.y - this.y;
            var result;
            if (dx === 0) {
                result = this.bbox().pointNearestToPoint(p);
                if (angle)
                    return result.rotate(point(this.x, this.y), - angle);
                return result
            }
            var m = dy / dx;
            var mSquared = m * m;
            var aSquared = this.a * this.a;
            var bSquared = this.b * this.b;
            var x = sqrt(1 / (1 / aSquared + mSquared / bSquared));
            x = dx < 0?-x : x;
            var y = m * x;
            result = point(this.x + x, this.y + y);
            if (angle)
                return result.rotate(point(this.x, this.y), - angle);
            return result
        }
    };
    var bezier = {
        curveThroughPoints: function(points) {
            var controlPoints = this.getCurveControlPoints(points);
            var path = ["M", points[0].x, points[0].y];
            for (var i = 0; i < controlPoints[0].length; i++) {
                path.push("C", controlPoints[0][i].x, controlPoints[0][i].y, controlPoints[1][i].x, controlPoints[1][i].y, points[i + 1].x, points[i + 1].y)
            }
            return path
        },
        getCurveControlPoints: function(knots) {
            var firstControlPoints = [];
            var secondControlPoints = [];
            var n = knots.length - 1;
            var i;
            if (n == 1) {
                firstControlPoints[0] = point((2 * knots[0].x + knots[1].x) / 3, (2 * knots[0].y + knots[1].y) / 3);
                secondControlPoints[0] = point(2 * firstControlPoints[0].x - knots[0].x, 2 * firstControlPoints[0].y - knots[0].y);
                return [firstControlPoints, secondControlPoints]
            }
            var rhs = [];
            for (i = 1; i < n - 1; i++) {
                rhs[i] = 4 * knots[i].x + 2 * knots[i + 1].x
            }
            rhs[0] = knots[0].x + 2 * knots[1].x;
            rhs[n - 1] = (8 * knots[n - 1].x + knots[n].x) / 2;
            var x = this.getFirstControlPoints(rhs);
            for (i = 1; i < n - 1; ++i) {
                rhs[i] = 4 * knots[i].y + 2 * knots[i + 1].y
            }
            rhs[0] = knots[0].y + 2 * knots[1].y;
            rhs[n - 1] = (8 * knots[n - 1].y + knots[n].y) / 2;
            var y = this.getFirstControlPoints(rhs);
            for (i = 0; i < n; i++) {
                firstControlPoints.push(point(x[i], y[i]));
                if (i < n - 1) {
                    secondControlPoints.push(point(2 * knots[i + 1].x - x[i + 1], 2 * knots[i + 1].y - y[i + 1]))
                } else {
                    secondControlPoints.push(point((knots[n].x + x[n - 1]) / 2, (knots[n].y + y[n - 1]) / 2))
                }
            }
            return [firstControlPoints, secondControlPoints]
        },
        getFirstControlPoints: function(rhs) {
            var n = rhs.length;
            var x = [];
            var tmp = [];
            var b = 2;
            x[0] = rhs[0] / b;
            for (var i = 1; i < n; i++) {
                tmp[i] = 1 / b;
                b = (i < n - 1 ? 4 : 3.5) - tmp[i];
                x[i] = (rhs[i] - x[i - 1]) / b
            }
            for (i = 1; i < n; i++) {
                x[n - i - 1] -= tmp[n - i] * x[n - i]
            }
            return x
        },
        getInversionSolver: function(p0, p1, p2, p3) {
            var pts = arguments;
            function l(i, j) {
                var pi = pts[i], pj = pts[j];
                return function(p) {
                    var w = (i%3 ? 3 : 1) * (j%3 ? 3 : 1);
                    var lij = p.x * (pi.y - pj.y) + p.y * (pj.x - pi.x) + pi.x * pj.y - pi.y * pj.x;
                    return w * lij
                }
            }
            return function solveInversion(p) {
                var ct = 3 * l(2, 3)(p1);
                var c1 = l(1, 3)(p0) / ct;
                var c2 =- l(2, 3)(p0) / ct;
                var la = c1 * l(3, 1)(p) + c2 * (l(3, 0)(p) + l(2, 1)(p)) + l(2, 0)(p);
                var lb = c1 * l(3, 0)(p) + c2 * l(2, 0)(p) + l(1, 0)(p);
                return lb / (lb - la)
            }
        },
        getCurveDivider: function(p0, p1, p2, p3) {
            return function divideCurve(t) {
                var l = line(p0, p1).pointAt(t);
                var m = line(p1, p2).pointAt(t);
                var n = line(p2, p3).pointAt(t);
                var p = line(l, m).pointAt(t);
                var q = line(m, n).pointAt(t);
                var r = line(p, q).pointAt(t);
                return [{
                    p0: p0,
                    p1: l,
                    p2: p,
                    p3: r
                }, {
                    p0: r,
                    p1: q,
                    p2: n,
                    p3: p3
                }
                ]
            }
        }
    };
    var scale = {
        linear: function(domain, range, value) {
            var domainSpan = domain[1] - domain[0];
            var rangeSpan = range[1] - range[0];
            return (value - domain[0]) / domainSpan * rangeSpan + range[0] || 0
        }
    };
    return {
        toDeg: toDeg,
        toRad: toRad,
        snapToGrid: snapToGrid,
        normalizeAngle: normalizeAngle,
        point: point,
        line: line,
        rect: rect,
        ellipse: ellipse,
        bezier: bezier,
        scale: scale
    }
});
if (typeof exports === "object") {
    var _ = require("lodash")
}
var joint = {
    dia: {},
    ui: {},
    layout: {},
    shapes: {},
    format: {},
    connectors: {},
    routers: {},
    util: {
        hashCode: function(str) {
            var hash = 0;
            if (str.length == 0)
                return hash;
            for (var i = 0; i < str.length; i++) {
                var c = str.charCodeAt(i);
                hash = (hash<<5) - hash + c;
                hash = hash & hash
            }
            return hash
        },
        getByPath: function(obj, path, delim) {
            delim = delim || ".";
            var keys = path.split(delim);
            var key;
            while (keys.length) {
                key = keys.shift();
                if (key in obj) {
                    obj = obj[key]
                } else {
                    return undefined
                }
            }
            return obj
        },
        setByPath: function(obj, path, value, delim) {
            delim = delim || ".";
            var keys = path.split(delim);
            var diver = obj;
            var i = 0;
            if (path.indexOf(delim)>-1) {
                for (var len = keys.length; i < len - 1; i++) {
                    diver = diver[keys[i]] || (diver[keys[i]] = {})
                }
                diver[keys[len - 1]] = value
            } else {
                obj[path] = value
            }
            return obj
        },
        unsetByPath: function(obj, path, delim) {
            delim = delim || ".";
            var i = path.lastIndexOf(delim);
            if (i>-1) {
                var parent = joint.util.getByPath(obj, path.substr(0, i), delim);
                if (parent) {
                    delete parent[path.slice(i + 1)]
                }
            } else {
                delete obj[path]
            }
            return obj
        },
        flattenObject: function(obj, delim, stop) {
            delim = delim || ".";
            var ret = {};
            for (var key in obj) {
                if (!obj.hasOwnProperty(key))
                    continue;
                var shouldGoDeeper = typeof obj[key] === "object";
                if (shouldGoDeeper && stop && stop(obj[key])) {
                    shouldGoDeeper = false
                }
                if (shouldGoDeeper) {
                    var flatObject = this.flattenObject(obj[key], delim, stop);
                    for (var flatKey in flatObject) {
                        if (!flatObject.hasOwnProperty(flatKey))
                            continue;
                        ret[key + delim + flatKey] = flatObject[flatKey]
                    }
                } else {
                    ret[key] = obj[key]
                }
            }
            return ret
        },
        uuid: function() {
            return "xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx".replace(/[xy]/g, function(c) {
                var r = Math.random() * 16 | 0, v = c == "x" ? r: r & 3 | 8;
                return v.toString(16)
            })
        },
        guid: function(obj) {
            this.guid.id = this.guid.id || 1;
            obj.id = obj.id === undefined ? "j_" + this.guid.id++ : obj.id;
            return obj.id
        },
        mixin: function() {
            var target = arguments[0];
            for (var i = 1, l = arguments.length; i < l; i++) {
                var extension = arguments[i];
                if (Object(extension) !== extension&&!_.isFunction(extension) && (extension === null || extension === undefined)) {
                    continue
                }
                _.each(extension, function(copy, key) {
                    if (this.mixin.deep && Object(copy) === copy) {
                        if (!target[key]) {
                            target[key] = _.isArray(copy) ? [] : {}
                        }
                        this.mixin(target[key], copy);
                        return 
                    }
                    if (target[key] !== copy) {
                        if (!this.mixin.supplement ||!target.hasOwnProperty(key)) {
                            target[key] = copy
                        }
                    }
                }, this)
            }
            return target
        },
        supplement: function() {
            this.mixin.supplement = true;
            var ret = this.mixin.apply(this, arguments);
            this.mixin.supplement = false;
            return ret
        },
        deepMixin: function() {
            this.mixin.deep = true;
            var ret = this.mixin.apply(this, arguments);
            this.mixin.deep = false;
            return ret
        },
        deepSupplement: function() {
            this.mixin.deep = this.mixin.supplement = true;
            var ret = this.mixin.apply(this, arguments);
            this.mixin.deep = this.mixin.supplement = false;
            return ret
        },
        normalizeEvent: function(evt) {
            return evt.originalEvent && evt.originalEvent.changedTouches && evt.originalEvent.changedTouches.length ? evt.originalEvent.changedTouches[0] : evt
        },
        nextFrame: function() {
            var raf;
            var client = typeof window != "undefined";
            if (client) {
                raf = window.requestAnimationFrame || window.webkitRequestAnimationFrame || window.mozRequestAnimationFrame || window.oRequestAnimationFrame || window.msRequestAnimationFrame
            }
            if (!raf) {
                var lastTime = 0;
                raf = function(callback) {
                    var currTime = (new Date).getTime();
                    var timeToCall = Math.max(0, 16 - (currTime - lastTime));
                    var id = setTimeout(function() {
                        callback(currTime + timeToCall)
                    }, timeToCall);
                    lastTime = currTime + timeToCall;
                    return id
                }
            }
            return client ? _.bind(raf, window) : raf
        }(),
        cancelFrame: function() {
            var caf;
            var client = typeof window != "undefined";
            if (client) {
                caf = window.cancelAnimationFrame || window.webkitCancelAnimationFrame || window.webkitCancelRequestAnimationFrame || window.msCancelAnimationFrame || window.msCancelRequestAnimationFrame || window.oCancelAnimationFrame || window.oCancelRequestAnimationFrame || window.mozCancelAnimationFrame || window.mozCancelRequestAnimationFrame
            }
            caf = caf || clearTimeout;
            return client ? _.bind(caf, window) : caf
        }(),
        breakText: function(text, size, styles, opt) {
            opt = opt || {};
            var width = size.width;
            var height = size.height;
            var svgDocument = opt.svgDocument || V("svg").node;
            var textElement = V("<text><tspan></tspan></text>").attr(styles || {}).node;
            var textSpan = textElement.firstChild;
            var textNode = document.createTextNode("");
            textSpan.appendChild(textNode);
            svgDocument.appendChild(textElement);
            if (!opt.svgDocument) {
                document.body.appendChild(svgDocument)
            }
            var words = text.split(" ");
            var full = [];
            var lines = [];
            var p;
            for (var i = 0, l = 0, len = words.length; i < len; i++) {
                var word = words[i];
                textNode.data = lines[l] ? lines[l] + " " + word : word;
                if (textSpan.getComputedTextLength() <= width) {
                    lines[l] = textNode.data;
                    if (p) {
                        full[l++] = true;
                        p = 0
                    }
                } else {
                    if (!lines[l] || p) {
                        var partition=!!p;
                        p = word.length - 1;
                        if (partition ||!p) {
                            if (!p) {
                                if (!lines[l]) {
                                    lines = [];
                                    break
                                }
                                words.splice(i, 2, word + words[i + 1]);
                                len--;
                                full[l++] = true;
                                i--;
                                continue
                            }
                            words[i] = word.substring(0, p);
                            words[i + 1] = word.substring(p) + words[i + 1]
                        } else {
                            words.splice(i, 1, word.substring(0, p), word.substring(p));
                            len++;
                            if (l&&!full[l - 1]) {
                                l--
                            }
                        }
                        i--;
                        continue
                    }
                    l++;
                    i--
                }
                if (typeof height !== "undefined") {
                    var lh = lh || textElement.getBBox().height * 1.25;
                    if (lh * lines.length > height) {
                        lines.splice(Math.floor(height / lh));
                        break
                    }
                }
            }
            if (opt.svgDocument) {
                svgDocument.removeChild(textElement)
            } else {
                document.body.removeChild(svgDocument)
            }
            return lines.join("\n")
        },
        timing: {
            linear: function(t) {
                return t
            },
            quad: function(t) {
                return t * t
            },
            cubic: function(t) {
                return t * t * t
            },
            inout: function(t) {
                if (t <= 0)
                    return 0;
                if (t >= 1)
                    return 1;
                var t2 = t * t, t3 = t2 * t;
                return 4 * (t < .5 ? t3 : 3 * (t - t2) + t3 - .75)
            },
            exponential: function(t) {
                return Math.pow(2, 10 * (t - 1))
            },
            bounce: function(t) {
                for (var a = 0, b = 1; 1; a += b, b/=2) {
                    if (t >= (7 - 4 * a) / 11) {
                        var q = (11 - 6 * a - 11 * t) / 4;
                        return - q * q + b * b
                    }
                }
            },
            reverse: function(f) {
                return function(t) {
                    return 1 - f(1 - t)
                }
            },
            reflect: function(f) {
                return function(t) {
                    return .5 * (t < .5 ? f(2 * t) : 2 - f(2 - 2 * t))
                }
            },
            clamp: function(f, n, x) {
                n = n || 0;
                x = x || 1;
                return function(t) {
                    var r = f(t);
                    return r < n ? n : r > x ? x : r
                }
            },
            back: function(s) {
                if (!s)
                    s = 1.70158;
                return function(t) {
                    return t * t * ((s + 1) * t - s)
                }
            },
            elastic: function(x) {
                if (!x)
                    x = 1.5;
                return function(t) {
                    return Math.pow(2, 10 * (t - 1)) * Math.cos(20 * Math.PI * x / 3 * t)
                }
            }
        },
        interpolate: {
            number: function(a, b) {
                var d = b - a;
                return function(t) {
                    return a + d * t
                }
            },
            object: function(a, b) {
                var s = _.keys(a);
                return function(t) {
                    var i, p, r = {};
                    for (i = s.length - 1; i!=-1; i--) {
                        p = s[i];
                        r[p] = a[p] + (b[p] - a[p]) * t
                    }
                    return r
                }
            },
            hexColor: function(a, b) {
                var ca = parseInt(a.slice(1), 16), cb = parseInt(b.slice(1), 16);
                var ra = ca & 255, rd = (cb & 255) - ra;
                var ga = ca & 65280, gd = (cb & 65280) - ga;
                var ba = ca & 16711680, bd = (cb & 16711680) - ba;
                return function(t) {
                    var r = ra + rd * t & 255;
                    var g = ga + gd * t & 65280;
                    var b = ba + bd * t & 16711680;
                    return "#" + (1<<24 | r | g | b).toString(16).slice(1)
                }
            },
            unit: function(a, b) {
                var r = /(-?[0-9]*.[0-9]*)(px|em|cm|mm|in|pt|pc|%)/;
                var ma = r.exec(a), mb = r.exec(b);
                var p = mb[1].indexOf("."), f = p > 0 ? mb[1].length - p - 1: 0;
                var a =+ ma[1], d =+ mb[1] - a, u = ma[2];
                return function(t) {
                    return (a + d * t).toFixed(f) + u
                }
            }
        },
        filter: {
            blur: function(args) {
                var x = _.isFinite(args.x) ? args.x: 2;
                return _.template('<filter><feGaussianBlur stdDeviation="${stdDeviation}"/></filter>', {
                    stdDeviation: _.isFinite(args.y) ? [x, args.y]: x
                })
            },
            dropShadow: function(args) {
                var tpl = "SVGFEDropShadowElement"in window ? '<filter><feDropShadow stdDeviation="${blur}" dx="${dx}" dy="${dy}" flood-color="${color}" flood-opacity="${opacity}"/></filter>': '<filter><feGaussianBlur in="SourceAlpha" stdDeviation="${blur}"/><feOffset dx="${dx}" dy="${dy}" result="offsetblur"/><feFlood flood-color="${color}"/><feComposite in2="offsetblur" operator="in"/><feComponentTransfer><feFuncA type="linear" slope="${opacity}"/></feComponentTransfer><feMerge><feMergeNode/><feMergeNode in="SourceGraphic"/></feMerge></filter>';
                return _.template(tpl, {
                    dx: args.dx || 0,
                    dy: args.dy || 0,
                    opacity: _.isFinite(args.opacity) ? args.opacity: 1,
                    color: args.color || "black",
                    blur: _.isFinite(args.blur) ? args.blur: 4
                })
            },
            grayscale: function(args) {
                var amount = _.isFinite(args.amount) ? args.amount: 1;
                return _.template('<filter><feColorMatrix type="matrix" values="${a} ${b} ${c} 0 0 ${d} ${e} ${f} 0 0 ${g} ${b} ${h} 0 0 0 0 0 1 0"/></filter>', {
                    a: .2126 + .7874 * (1 - amount),
                    b: .7152 - .7152 * (1 - amount),
                    c: .0722 - .0722 * (1 - amount),
                    d: .2126 - .2126 * (1 - amount),
                    e: .7152 + .2848 * (1 - amount),
                    f: .0722 - .0722 * (1 - amount),
                    g: .2126 - .2126 * (1 - amount),
                    h: .0722 + .9278 * (1 - amount)
                })
            },
            sepia: function(args) {
                var amount = _.isFinite(args.amount) ? args.amount: 1;
                return _.template('<filter><feColorMatrix type="matrix" values="${a} ${b} ${c} 0 0 ${d} ${e} ${f} 0 0 ${g} ${h} ${i} 0 0 0 0 0 1 0"/></filter>', {
                    a: .393 + .607 * (1 - amount),
                    b: .769 - .769 * (1 - amount),
                    c: .189 - .189 * (1 - amount),
                    d: .349 - .349 * (1 - amount),
                    e: .686 + .314 * (1 - amount),
                    f: .168 - .168 * (1 - amount),
                    g: .272 - .272 * (1 - amount),
                    h: .534 - .534 * (1 - amount),
                    i: .131 + .869 * (1 - amount)
                })
            },
            saturate: function(args) {
                var amount = _.isFinite(args.amount) ? args.amount: 1;
                return _.template('<filter><feColorMatrix type="saturate" values="${amount}"/></filter>', {
                    amount: 1 - amount
                })
            },
            hueRotate: function(args) {
                return _.template('<filter><feColorMatrix type="hueRotate" values="${angle}"/></filter>', {
                    angle: args.angle || 0
                })
            },
            invert: function(args) {
                var amount = _.isFinite(args.amount) ? args.amount: 1;
                return _.template('<filter><feComponentTransfer><feFuncR type="table" tableValues="${amount} ${amount2}"/><feFuncG type="table" tableValues="${amount} ${amount2}"/><feFuncB type="table" tableValues="${amount} ${amount2}"/></feComponentTransfer></filter>', {
                    amount: amount,
                    amount2: 1 - amount
                })
            },
            brightness: function(args) {
                return _.template('<filter><feComponentTransfer><feFuncR type="linear" slope="${amount}"/><feFuncG type="linear" slope="${amount}"/><feFuncB type="linear" slope="${amount}"/></feComponentTransfer></filter>', {
                    amount: _.isFinite(args.amount) ? args.amount: 1
                })
            },
            contrast: function(args) {
                var amount = _.isFinite(args.amount) ? args.amount: 1;
                return _.template('<filter><feComponentTransfer><feFuncR type="linear" slope="${amount}" intercept="${amount2}"/><feFuncG type="linear" slope="${amount}" intercept="${amount2}"/><feFuncB type="linear" slope="${amount}" intercept="${amount2}"/></feComponentTransfer></filter>', {
                    amount: amount,
                    amount2: .5 - amount / 2
                })
            }
        },
        format: {
            number: function(specifier, value, locale) {
                locale = locale || {
                    currency: ["$", ""],
                    decimal: ".",
                    thousands: ",",
                    grouping: [3]
                };
                var re = /(?:([^{])?([<>=^]))?([+\- ])?([$#])?(0)?(\d+)?(,)?(\.-?\d+)?([a-z%])?/i;
                var match = re.exec(specifier);
                var fill = match[1] || " ";
                var align = match[2] || ">";
                var sign = match[3] || "";
                var symbol = match[4] || "";
                var zfill = match[5];
                var width =+ match[6];
                var comma = match[7];
                var precision = match[8];
                var type = match[9];
                var scale = 1;
                var prefix = "";
                var suffix = "";
                var integer = false;
                if (precision)
                    precision =+ precision.substring(1);
                if (zfill || fill === "0" && align === "=") {
                    zfill = fill = "0";
                    align = "=";
                    if (comma)
                        width -= Math.floor((width - 1) / 4)
                }
                switch (type) {
                case"n":
                    comma = true;
                    type = "g";
                    break;
                case"%":
                    scale = 100;
                    suffix = "%";
                    type = "f";
                    break;
                case"p":
                    scale = 100;
                    suffix = "%";
                    type = "r";
                    break;
                case"b":
                case"o":
                case"x":
                case"X":
                    if (symbol === "#")
                        prefix = "0" + type.toLowerCase();
                case"c":
                case"d":
                    integer = true;
                    precision = 0;
                    break;
                case"s":
                    scale =- 1;
                    type = "r";
                    break
                }
                if (symbol === "$") {
                    prefix = locale.currency[0];
                    suffix = locale.currency[1]
                }
                if (type == "r"&&!precision)
                    type = "g";
                if (precision != null) {
                    if (type == "g")
                        precision = Math.max(1, Math.min(21, precision));
                    else if (type == "e" || type == "f")
                        precision = Math.max(0, Math.min(20, precision))
                }
                var zcomma = zfill && comma;
                if (integer && value%1)
                    return "";
                var negative = value < 0 || value === 0 && 1 / value < 0 ? (value =- value, "-"): sign;
                var fullSuffix = suffix;
                if (scale < 0) {
                    var unit = this.prefix(value, precision);
                    value = unit.scale(value);
                    fullSuffix = unit.symbol + suffix
                } else {
                    value*=scale
                }
                value = this.convert(type, value, precision);
                var i = value.lastIndexOf(".");
                var before = i < 0 ? value: value.substring(0, i);
                var after = i < 0 ? "": locale.decimal + value.substring(i + 1);
                function formatGroup(value) {
                    var i = value.length;
                    var t = [];
                    var j = 0;
                    var g = locale.grouping[0];
                    while (i > 0 && g > 0) {
                        t.push(value.substring(i -= g, i + g));
                        g = locale.grouping[j = (j + 1)%locale.grouping.length]
                    }
                    return t.reverse().join(locale.thousands)
                }
                if (!zfill && comma && locale.grouping) {
                    before = formatGroup(before)
                }
                var length = prefix.length + before.length + after.length + (zcomma ? 0 : negative.length);
                var padding = length < width ? new Array(length = width - length + 1).join(fill): "";
                if (zcomma)
                    before = formatGroup(padding + before);
                negative += prefix;
                value = before + after;
                return (align === "<" ? negative + value + padding : align === ">" ? padding + negative + value : align === "^" ? padding.substring(0, length>>=1) + negative + value + padding.substring(length) : negative + (zcomma ? value : padding + value)) + fullSuffix
            },
            convert: function(type, value, precision) {
                switch (type) {
                case"b":
                    return value.toString(2);
                case"c":
                    return String.fromCharCode(value);
                case"o":
                    return value.toString(8);
                case"x":
                    return value.toString(16);
                case"X":
                    return value.toString(16).toUpperCase();
                case"g":
                    return value.toPrecision(precision);
                case"e":
                    return value.toExponential(precision);
                case"f":
                    return value.toFixed(precision);
                case"r":
                    return (value = this.round(value, this.precision(value, precision))).toFixed(Math.max(0, Math.min(20, this.precision(value * (1 + 1e-15), precision))));
                default:
                    return value + ""
                }
            },
            round: function(value, precision) {
                return precision ? Math.round(value * (precision = Math.pow(10, precision))) / precision : Math.round(value)
            },
            precision: function(value, precision) {
                return precision - (value ? Math.ceil(Math.log(value) / Math.LN10) : 1)
            },
            prefix: function(value, precision) {
                var prefixes = _.map(["y", "z", "a", "f", "p", "n", "µ", "m", "", "k", "M", "G", "T", "P", "E", "Z", "Y"], function(d, i) {
                    var k = Math.pow(10, abs(8 - i) * 3);
                    return {
                        scale: i > 8 ? function(d) {
                            return d / k
                        }
                        : function(d) {
                            return d * k
                        },
                        symbol: d
                    }
                });
                var i = 0;
                if (value) {
                    if (value < 0)
                        value*=-1;
                    if (precision)
                        value = d3.round(value, this.precision(value, precision));
                    i = 1 + Math.floor(1e-12 + Math.log(value) / Math.LN10);
                    i = Math.max( - 24, Math.min(24, Math.floor((i <= 0 ? i + 1 : i - 1) / 3) * 3))
                }
                return prefixes[8 + i / 3]
            }
        }
    }
};
if (typeof exports === "object") {
    module.exports = joint
}
if (typeof exports === "object") {
    var joint = {
        dia: {
            Link: require("./joint.dia.link").Link,
            Element: require("./joint.dia.element").Element
        },
        shapes: require("../plugins/shapes")
    };
    var Backbone = require("backbone");
    var _ = require("lodash");
    var g = require("./geometry")
}
joint.dia.GraphCells = Backbone.Collection.extend({
    initialize: function() {
        this.on("change:z", this.sort, this)
    },
    model: function(attrs, options) {
        if (attrs.type === "link") {
            return new joint.dia.Link(attrs, options)
        }
        var module = attrs.type.split(".")[0];
        var entity = attrs.type.split(".")[1];
        if (joint.shapes[module] && joint.shapes[module][entity]) {
            return new joint.shapes[module][entity](attrs, options)
        }
        return new joint.dia.Element(attrs, options)
    },
    comparator: function(model) {
        return model.get("z") || 0
    },
    getConnectedLinks: function(model, opt) {
        opt = opt || {};
        if (_.isUndefined(opt.inbound) && _.isUndefined(opt.outbound)) {
            opt.inbound = opt.outbound = true
        }
        var links = [];
        this.each(function(cell) {
            var source = cell.get("source");
            var target = cell.get("target");
            if (source && source.id === model.id && opt.outbound) {
                links.push(cell)
            }
            if (target && target.id === model.id && opt.inbound) {
                links.push(cell)
            }
        });
        return links
    }
});
joint.dia.Graph = Backbone.Model.extend({
    initialize: function() {
        this.set("cells", new joint.dia.GraphCells);
        this.get("cells").on("all", this.trigger, this);
        this.get("cells").on("remove", this.removeCell, this)
    },
    toJSON: function() {
        var json = Backbone.Model.prototype.toJSON.apply(this, arguments);
        json.cells = this.get("cells").toJSON();
        return json
    },
    fromJSON: function(json, opt) {
        if (!json.cells) {
            throw new Error("Graph JSON must contain cells array.")
        }
        this.set(_.omit(json, "cells"), opt);
        this.resetCells(json.cells, opt)
    },
    clear: function(opt) {
        this.trigger("batch:start");
        this.get("cells").remove(this.get("cells").models, opt);
        this.trigger("batch:stop")
    },
    _prepareCell: function(cell) {
        if (cell instanceof Backbone.Model && _.isUndefined(cell.get("z"))) {
            cell.set("z", this.maxZIndex() + 1, {
                silent: true
            })
        } else if (_.isUndefined(cell.z)) {
            cell.z = this.maxZIndex() + 1
        }
        return cell
    },
    maxZIndex: function() {
        var lastCell = this.get("cells").last();
        return lastCell ? lastCell.get("z") || 0 : 0
    },
    addCell: function(cell, options) {
        if (_.isArray(cell)) {
            return this.addCells(cell, options)
        }
        this.get("cells").add(this._prepareCell(cell), options || {});
        return this
    },
    addCells: function(cells, options) {
        _.each(cells, function(cell) {
            this.addCell(cell, options)
        }, this);
        return this
    },
    resetCells: function(cells, opt) {
        this.get("cells").reset(_.map(cells, this._prepareCell, this), opt);
        return this
    },
    removeCell: function(cell, collection, options) {
        if (options && options.disconnectLinks) {
            this.disconnectLinks(cell)
        } else {
            this.removeLinks(cell)
        }
        this.get("cells").remove(cell, {
            silent: true
        })
    },
    getCell: function(id) {
        return this.get("cells").get(id)
    },
    getElements: function() {
        return this.get("cells").filter(function(cell) {
            return cell instanceof joint.dia.Element
        })
    },
    getLinks: function() {
        return this.get("cells").filter(function(cell) {
            return cell instanceof joint.dia.Link
        })
    },
    getConnectedLinks: function(model, opt) {
        return this.get("cells").getConnectedLinks(model, opt)
    },
    getNeighbors: function(el) {
        var links = this.getConnectedLinks(el);
        var neighbors = [];
        var cells = this.get("cells");
        _.each(links, function(link) {
            var source = link.get("source");
            var target = link.get("target");
            if (!source.x) {
                var sourceElement = cells.get(source.id);
                if (sourceElement !== el) {
                    neighbors.push(sourceElement)
                }
            }
            if (!target.x) {
                var targetElement = cells.get(target.id);
                if (targetElement !== el) {
                    neighbors.push(targetElement)
                }
            }
        });
        return neighbors
    },
    disconnectLinks: function(model) {
        _.each(this.getConnectedLinks(model), function(link) {
            link.set(link.get("source").id === model.id ? "source" : "target", g.point(0, 0))
        })
    },
    removeLinks: function(model) {
        _.invoke(this.getConnectedLinks(model), "remove")
    },
    findModelsFromPoint: function(p) {
        return _.filter(this.getElements(), function(el) {
            return el.getBBox().containsPoint(p)
        })
    },
    findModelsInArea: function(r) {
        return _.filter(this.getElements(), function(el) {
            return el.getBBox().intersect(r)
        })
    }
});
if (typeof exports === "object") {
    module.exports.Graph = joint.dia.Graph
}
if (typeof exports === "object") {
    var joint = {
        util: require("./core").util,
        dia: {
            Link: require("./joint.dia.link").Link
        }
    };
    var Backbone = require("backbone");
    var _ = require("lodash")
}
joint.dia.Cell = Backbone.Model.extend({
    constructor: function(attributes, options) {
        var defaults;
        var attrs = attributes || {};
        this.cid = _.uniqueId("c");
        this.attributes = {};
        if (options && options.collection)
            this.collection = options.collection;
        if (options && options.parse)
            attrs = this.parse(attrs, options) || {};
        if (defaults = _.result(this, "defaults")) {
            attrs = _.merge({}, defaults, attrs)
        }
        this.set(attrs, options);
        this.changed = {};
        this.initialize.apply(this, arguments)
    },
    toJSON: function() {
        var defaultAttrs = this.constructor.prototype.defaults.attrs || {};
        var attrs = this.attributes.attrs;
        var finalAttrs = {};
        _.each(attrs, function(attr, selector) {
            var defaultAttr = defaultAttrs[selector];
            _.each(attr, function(value, name) {
                if (_.isObject(value)&&!_.isArray(value)) {
                    _.each(value, function(value2, name2) {
                        if (!defaultAttr ||!defaultAttr[name] ||!_.isEqual(defaultAttr[name][name2], value2)) {
                            finalAttrs[selector] = finalAttrs[selector] || {};
                            (finalAttrs[selector][name] || (finalAttrs[selector][name] = {}))[name2] = value2
                        }
                    })
                } else if (!defaultAttr ||!_.isEqual(defaultAttr[name], value)) {
                    finalAttrs[selector] = finalAttrs[selector] || {};
                    finalAttrs[selector][name] = value
                }
            })
        });
        var attributes = _.cloneDeep(_.omit(this.attributes, "attrs"));
        attributes.attrs = finalAttrs;
        return attributes
    },
    initialize: function(options) {
        if (!options ||!options.id) {
            this.set("id", joint.util.uuid(), {
                silent: true
            })
        }
        this._transitionIds = {};
        this.processPorts();
        this.on("change:attrs", this.processPorts, this)
    },
    processPorts: function() {
        var previousPorts = this.ports;
        var ports = {};
        _.each(this.get("attrs"), function(attrs, selector) {
            if (attrs && attrs.port) {
                if (!_.isUndefined(attrs.port.id)) {
                    ports[attrs.port.id] = attrs.port
                } else {
                    ports[attrs.port] = {
                        id: attrs.port
                    }
                }
            }
        });
        var removedPorts = {};
        _.each(previousPorts, function(port, id) {
            if (!ports[id])
                removedPorts[id] = true
        });
        if (this.collection&&!_.isEmpty(removedPorts)) {
            var inboundLinks = this.collection.getConnectedLinks(this, {
                inbound: true
            });
            _.each(inboundLinks, function(link) {
                if (removedPorts[link.get("target").port])
                    link.remove()
            });
            var outboundLinks = this.collection.getConnectedLinks(this, {
                outbound: true
            });
            _.each(outboundLinks, function(link) {
                if (removedPorts[link.get("source").port])
                    link.remove()
            })
        }
        this.ports = ports
    },
    remove: function(options) {
        var collection = this.collection;
        if (collection) {
            collection.trigger("batch:start")
        }
        var parentCellId = this.get("parent");
        if (parentCellId) {
            var parentCell = this.collection && this.collection.get(parentCellId);
            parentCell.unembed(this)
        }
        _.invoke(this.getEmbeddedCells(), "remove", options);
        this.trigger("remove", this, this.collection, options);
        if (collection) {
            collection.trigger("batch:stop")
        }
    },
    toFront: function() {
        if (this.collection) {
            this.set("z", (this.collection.last().get("z") || 0) + 1)
        }
    },
    toBack: function() {
        if (this.collection) {
            this.set("z", (this.collection.first().get("z") || 0) - 1)
        }
    },
    embed: function(cell) {
        if (this.get("parent") == cell.id) {
            throw new Error("Recursive embedding not allowed.")
        } else {
            this.trigger("batch:start");
            cell.set("parent", this.id);
            this.set("embeds", _.uniq((this.get("embeds") || []).concat([cell.id])));
            this.trigger("batch:stop")
        }
    },
    unembed: function(cell) {
        this.trigger("batch:start");
        var cellId = cell.id;
        cell.unset("parent");
        this.set("embeds", _.without(this.get("embeds"), cellId));
        this.trigger("batch:stop")
    },
    getEmbeddedCells: function() {
        if (this.collection) {
            return _.map(this.get("embeds") || [], function(cellId) {
                return this.collection.get(cellId)
            }, this)
        }
        return []
    },
    clone: function(opt) {
        opt = opt || {};
        var clone = Backbone.Model.prototype.clone.apply(this, arguments);
        clone.set("id", joint.util.uuid(), {
            silent: true
        });
        clone.set("embeds", "");
        if (!opt.deep)
            return clone;
        var embeds = this.getEmbeddedCells();
        var clones = [clone];
        var linkCloneMapping = {};
        _.each(embeds, function(embed) {
            var embedClones = embed.clone({
                deep: true
            });
            clone.embed(embedClones[0]);
            _.each(embedClones, function(embedClone) {
                clones.push(embedClone);
                if (embedClone instanceof joint.dia.Link) {
                    return 
                }
                var inboundLinks = this.collection.getConnectedLinks(embed, {
                    inbound: true
                });
                _.each(inboundLinks, function(link) {
                    var linkClone = linkCloneMapping[link.id] || link.clone();
                    linkCloneMapping[link.id] = linkClone;
                    var target = _.clone(linkClone.get("target"));
                    target.id = embedClone.id;
                    linkClone.set("target", target)
                });
                var outboundLinks = this.collection.getConnectedLinks(embed, {
                    outbound: true
                });
                _.each(outboundLinks, function(link) {
                    var linkClone = linkCloneMapping[link.id] || link.clone();
                    linkCloneMapping[link.id] = linkClone;
                    var source = _.clone(linkClone.get("source"));
                    source.id = embedClone.id;
                    linkClone.set("source", source)
                })
            }, this)
        }, this);
        clones = clones.concat(_.values(linkCloneMapping));
        return clones
    },
    attr: function(attrs, value, opt) {
        var currentAttrs = this.get("attrs");
        var delim = "/";
        if (_.isString(attrs)) {
            if (typeof value != "undefined") {
                var attr = {};
                joint.util.setByPath(attr, attrs, value, delim);
                return this.set("attrs", _.merge({}, currentAttrs, attr), opt)
            } else {
                return joint.util.getByPath(currentAttrs, attrs, delim)
            }
        }
        return this.set("attrs", _.merge({}, currentAttrs, attrs), value, opt)
    },
    removeAttr: function(path, opt) {
        if (_.isArray(path)) {
            _.each(path, function(p) {
                this.removeAttr(p, opt)
            }, this);
            return this
        }
        var attrs = joint.util.unsetByPath(_.merge({}, this.get("attrs")), path, "/");
        return this.set("attrs", attrs, _.extend({
            dirty: true
        }, opt))
    },
    transition: function(path, value, opt, delim) {
        delim = delim || "/";
        var defaults = {
            duration: 100,
            delay: 10,
            timingFunction: joint.util.timing.linear,
            valueFunction: joint.util.interpolate.number
        };
        opt = _.extend(defaults, opt);
        var pathArray = path.split(delim);
        var property = pathArray[0];
        var isPropertyNested = pathArray.length > 1;
        var firstFrameTime = 0;
        var interpolatingFunction;
        var setter = _.bind(function(runtime) {
            var id, progress, propertyValue, status;
            firstFrameTime = firstFrameTime || runtime;
            runtime -= firstFrameTime;
            progress = runtime / opt.duration;
            if (progress < 1) {
                this._transitionIds[path] = id = joint.util.nextFrame(setter)
            } else {
                progress = 1;
                delete this._transitionIds[path]
            }
            propertyValue = interpolatingFunction(opt.timingFunction(progress));
            if (isPropertyNested) {
                var nestedPropertyValue = joint.util.setByPath({}, path, propertyValue, delim)[property];
                propertyValue = _.merge({}, this.get(property), nestedPropertyValue)
            }
            opt.transitionId = id;
            this.set(property, propertyValue, opt);
            if (!id)
                this.trigger("transition:end", this, path)
        }, this);
        var initiator = _.bind(function(callback) {
            this.stopTransitions(path);
            interpolatingFunction = opt.valueFunction(joint.util.getByPath(this.attributes, path, delim), value);
            this._transitionIds[path] = joint.util.nextFrame(callback);
            this.trigger("transition:start", this, path)
        }, this);
        return _.delay(initiator, opt.delay, setter)
    },
    getTransitions: function() {
        return _.keys(this._transitionIds)
    },
    stopTransitions: function(path, delim) {
        delim = delim || "/";
        var pathArray = path && path.split(delim);
        _(this._transitionIds).keys().filter(pathArray && function(key) {
            return _.isEqual(pathArray, key.split(delim).slice(0, pathArray.length))
        }).each(function(key) {
            joint.util.cancelFrame(this._transitionIds[key]);
            delete this._transitionIds[key];
            this.trigger("transition:end", this, key)
        }, this)
    }
});
joint.dia.CellView = Backbone.View.extend({
    tagName: "g",
    attributes: function() {
        return {
            "model-id": this.model.id
        }
    },
    constructor: function(options) {
        this._configure(options);
        Backbone.View.apply(this, arguments)
    },
    _configure: function(options) {
        if (this.options)
            options = _.extend({}, _.result(this, "options"), options);
        this.options = options;
        this.options.id = this.options.id || joint.util.guid(this)
    },
    initialize: function() {
        _.bindAll(this, "remove", "update");
        this.$el.data("view", this);
        this.listenTo(this.model, "remove", this.remove);
        this.listenTo(this.model, "change:attrs", this.onChangeAttrs)
    },
    onChangeAttrs: function(cell, attrs, opt) {
        if (opt.dirty) {
            return this.render()
        }
        return this.update()
    },
    _ensureElement: function() {
        var el;
        if (!this.el) {
            var attrs = _.extend({
                id: this.id
            }, _.result(this, "attributes"));
            if (this.className)
                attrs["class"] = _.result(this, "className");
            el = V(_.result(this, "tagName"), attrs).node
        } else {
            el = _.result(this, "el")
        }
        this.setElement(el, false)
    },
    findBySelector: function(selector) {
        var $selected = selector === "." ? this.$el: this.$el.find(selector);
        return $selected
    },
    notify: function(evt) {
        if (this.paper) {
            var args = Array.prototype.slice.call(arguments, 1);
            this.trigger.apply(this, [evt].concat(args));
            this.paper.trigger.apply(this.paper, [evt, this].concat(args))
        }
    },
    getStrokeBBox: function(el) {
        var isMagnet=!!el;
        el = el || this.el;
        var bbox = V(el).bbox(false, this.paper.viewport);
        var strokeWidth;
        if (isMagnet) {
            strokeWidth = V(el).attr("stroke-width")
        } else {
            strokeWidth = this.model.attr("rect/stroke-width") || this.model.attr("circle/stroke-width") || this.model.attr("ellipse/stroke-width") || this.model.attr("path/stroke-width")
        }
        strokeWidth = parseFloat(strokeWidth) || 0;
        return g.rect(bbox).moveAndExpand({
            x: - strokeWidth / 2,
            y: - strokeWidth / 2,
            width: strokeWidth,
            height: strokeWidth
        })
    },
    getBBox: function() {
        return V(this.el).bbox()
    },
    highlight: function(el) {
        el=!el ? this.el : this.$(el)[0] || this.el;
        V(el).addClass("highlighted")
    },
    unhighlight: function(el) {
        el=!el ? this.el : this.$(el)[0] || this.el;
        V(el).removeClass("highlighted")
    },
    findMagnet: function(el) {
        var $el = this.$(el);
        if ($el.length === 0 || $el[0] === this.el) {
            var attrs = this.model.get("attrs") || {};
            if (attrs["."] && attrs["."]["magnet"] === false) {
                return undefined
            }
            return this.el
        }
        if ($el.attr("magnet")) {
            return $el[0]
        }
        return this.findMagnet($el.parent())
    },
    applyFilter: function(selector, filter) {
        var $selected = this.findBySelector(selector);
        var filterId = filter.name + this.paper.svg.id + joint.util.hashCode(JSON.stringify(filter));
        if (!this.paper.svg.getElementById(filterId)) {
            var filterSVGString = joint.util.filter[filter.name] && joint.util.filter[filter.name](filter.args || {});
            if (!filterSVGString) {
                throw new Error("Non-existing filter " + filter.name)
            }
            var filterElement = V(filterSVGString);
            filterElement.attr("filterUnits", "userSpaceOnUse");
            if (filter.attrs)
                filterElement.attr(filter.attrs);
            filterElement.node.id = filterId;
            V(this.paper.svg).defs().append(filterElement)
        }
        $selected.each(function() {
            V(this).attr("filter", "url(#" + filterId + ")")
        })
    },
    applyGradient: function(selector, attr, gradient) {
        var $selected = this.findBySelector(selector);
        var gradientId = gradient.type + this.paper.svg.id + joint.util.hashCode(JSON.stringify(gradient));
        if (!this.paper.svg.getElementById(gradientId)) {
            var gradientSVGString = ["<" + gradient.type + ">", _.map(gradient.stops, function(stop) {
                return '<stop offset="' + stop.offset + '" stop-color="' + stop.color + '" stop-opacity="' + (_.isFinite(stop.opacity) ? stop.opacity : 1) + '" />'
            }).join(""), "</" + gradient.type + ">"].join("");
            var gradientElement = V(gradientSVGString);
            if (gradient.attrs) {
                gradientElement.attr(gradient.attrs)
            }
            gradientElement.node.id = gradientId;
            V(this.paper.svg).defs().append(gradientElement)
        }
        $selected.each(function() {
            V(this).attr(attr, "url(#" + gradientId + ")")
        })
    },
    getSelector: function(el, selector) {
        if (el === this.el) {
            return selector
        }
        var index = $(el).index();
        selector = el.tagName + ":nth-child(" + (index + 1) + ")" + " " + (selector || "");
        return this.getSelector($(el).parent()[0], selector + " ")
    },
    pointerdblclick: function(evt, x, y) {
        this.notify("cell:pointerdblclick", evt, x, y)
    },
    pointerclick: function(evt, x, y) {
        this.notify("cell:pointerclick", evt, x, y)
    },
    pointerdown: function(evt, x, y) {
        if (this.model.collection) {
            this.model.trigger("batch:start");
            this._collection = this.model.collection
        }
        this.notify("cell:pointerdown", evt, x, y)
    },
    pointermove: function(evt, x, y) {
        this.notify("cell:pointermove", evt, x, y)
    },
    pointerup: function(evt, x, y) {
        this.notify("cell:pointerup", evt, x, y);
        if (this._collection) {
            this._collection.trigger("batch:stop");
            delete this._collection
        }
    }
});
if (typeof exports === "object") {
    module.exports.Cell = joint.dia.Cell;
    module.exports.CellView = joint.dia.CellView
}
if (typeof exports === "object") {
    var joint = {
        util: require("./core").util,
        dia: {
            Cell: require("./joint.dia.cell").Cell,
            CellView: require("./joint.dia.cell").CellView
        }
    };
    var Backbone = require("backbone");
    var _ = require("lodash")
}
joint.dia.Element = joint.dia.Cell.extend({
    defaults: {
        position: {
            x: 0,
            y: 0
        },
        size: {
            width: 1,
            height: 1
        },
        angle: 0
    },
    position: function(x, y) {
        this.set("position", {
            x: x,
            y: y
        })
    },
    translate: function(tx, ty, opt) {
        ty = ty || 0;
        if (tx === 0 && ty === 0) {
            return this
        }
        var position = this.get("position") || {
            x: 0,
            y: 0
        };
        var translatedPosition = {
            x: position.x + tx || 0,
            y: position.y + ty || 0
        };
        if (opt && opt.transition) {
            if (!_.isObject(opt.transition))
                opt.transition = {};
            this.transition("position", translatedPosition, _.extend({}, opt.transition, {
                valueFunction: joint.util.interpolate.object
            }))
        } else {
            this.set("position", translatedPosition, opt);
            _.invoke(this.getEmbeddedCells(), "translate", tx, ty, opt)
        }
        return this
    },
    resize: function(width, height) {
        this.trigger("batch:start");
        this.set("size", {
            width: width,
            height: height
        });
        this.trigger("batch:stop");
        return this
    },
    rotate: function(angle, absolute) {
        return this.set("angle", absolute ? angle : ((this.get("angle") || 0) + angle)%360)
    },
    getBBox: function() {
        var position = this.get("position");
        var size = this.get("size");
        return g.rect(position.x, position.y, size.width, size.height)
    }
});
joint.dia.ElementView = joint.dia.CellView.extend({
    className: function() {
        return "element " + this.model.get("type").split(".").join(" ")
    },
    initialize: function() {
        _.bindAll(this, "translate", "resize", "rotate");
        joint.dia.CellView.prototype.initialize.apply(this, arguments);
        this.listenTo(this.model, "change:position", this.translate);
        this.listenTo(this.model, "change:size", this.resize);
        this.listenTo(this.model, "change:angle", this.rotate)
    },
    update: function(cell, renderingOnlyAttrs) {
        var allAttrs = this.model.get("attrs");
        var rotatable = V(this.$(".rotatable")[0]);
        if (rotatable) {
            var rotation = rotatable.attr("transform");
            rotatable.attr("transform", "")
        }
        var relativelyPositioned = [];
        _.each(renderingOnlyAttrs || allAttrs, function(attrs, selector) {
            var $selected = this.findBySelector(selector);
            if ($selected.length === 0)
                return;
            var specialAttributes = ["style", "text", "html", "ref-x", "ref-y", "ref-dx", "ref-dy", "ref-width", "ref-height", "ref", "x-alignment", "y-alignment", "port"];
            if (_.isObject(attrs.filter)) {
                specialAttributes.push("filter");
                this.applyFilter(selector, attrs.filter)
            }
            if (_.isObject(attrs.fill)) {
                specialAttributes.push("fill");
                this.applyGradient(selector, "fill", attrs.fill)
            }
            if (_.isObject(attrs.stroke)) {
                specialAttributes.push("stroke");
                this.applyGradient(selector, "stroke", attrs.stroke)
            }
            if (!_.isUndefined(attrs.text)) {
                $selected.each(function() {
                    V(this).text(attrs.text + "", {
                        lineHeight: attrs.lineHeight
                    })
                })
            }
            var finalAttributes = _.omit(attrs, specialAttributes);
            $selected.each(function() {
                V(this).attr(finalAttributes)
            });
            if (attrs.port) {
                $selected.attr("port", _.isUndefined(attrs.port.id) ? attrs.port : attrs.port.id)
            }
            if (attrs.style) {
                $selected.css(attrs.style)
            }
            if (!_.isUndefined(attrs.html)) {
                $selected.each(function() {
                    $(this).html(attrs.html + "")
                })
            }
            if (!_.isUndefined(attrs["ref-x"]) ||!_.isUndefined(attrs["ref-y"]) ||!_.isUndefined(attrs["ref-dx"]) ||!_.isUndefined(attrs["ref-dy"]) ||!_.isUndefined(attrs["x-alignment"]) ||!_.isUndefined(attrs["y-alignment"]) ||!_.isUndefined(attrs["ref-width"]) ||!_.isUndefined(attrs["ref-height"])) {
                _.each($selected, function(el, index, list) {
                    var $el = $(el);
                    $el.selector = list.selector;
                    relativelyPositioned.push($el)
                })
            }
        }, this);
        var bbox = this.el.getBBox();
        renderingOnlyAttrs = renderingOnlyAttrs || {};
        _.each(relativelyPositioned, function($el) {
            var renderingOnlyElAttrs = renderingOnlyAttrs[$el.selector];
            var elAttrs = renderingOnlyElAttrs ? _.merge({}, allAttrs[$el.selector], renderingOnlyElAttrs): allAttrs[$el.selector];
            this.positionRelative($el, bbox, elAttrs)
        }, this);
        if (rotatable) {
            rotatable.attr("transform", rotation || "")
        }
    },
    positionRelative: function($el, bbox, elAttrs) {
        var ref = elAttrs["ref"];
        var refX = parseFloat(elAttrs["ref-x"]);
        var refY = parseFloat(elAttrs["ref-y"]);
        var refDx = parseFloat(elAttrs["ref-dx"]);
        var refDy = parseFloat(elAttrs["ref-dy"]);
        var yAlignment = elAttrs["y-alignment"];
        var xAlignment = elAttrs["x-alignment"];
        var refWidth = parseFloat(elAttrs["ref-width"]);
        var refHeight = parseFloat(elAttrs["ref-height"]);
        var isScalable = _.contains(_.pluck(_.pluck($el.parents("g"), "className"), "baseVal"), "scalable");
        if (ref) {
            bbox = V(this.findBySelector(ref)[0]).bbox(false, this.el)
        }
        var vel = V($el[0]);
        if (vel.attr("transform")) {
            vel.attr("transform", vel.attr("transform").replace(/translate\([^)]*\)/g, "").trim() || "")
        }
        function isDefined(x) {
            return _.isNumber(x)&&!_.isNaN(x)
        }
        var tx = 0;
        var ty = 0;
        if (isDefined(refWidth)) {
            if (refWidth >= 0 && refWidth <= 1) {
                vel.attr("width", refWidth * bbox.width)
            } else {
                vel.attr("width", Math.max(refWidth + bbox.width, 0))
            }
        }
        if (isDefined(refHeight)) {
            if (refHeight >= 0 && refHeight <= 1) {
                vel.attr("height", refHeight * bbox.height)
            } else {
                vel.attr("height", Math.max(refHeight + bbox.height, 0))
            }
        }
        if (isDefined(refDx)) {
            if (isScalable) {
                var scale = V(this.$(".scalable")[0]).scale();
                tx = bbox.x + bbox.width + refDx / scale.sx
            } else {
                tx = bbox.x + bbox.width + refDx
            }
        }
        if (isDefined(refDy)) {
            if (isScalable) {
                var scale = V(this.$(".scalable")[0]).scale();
                ty = bbox.y + bbox.height + refDy / scale.sy
            } else {
                ty = bbox.y + bbox.height + refDy
            }
        }
        if (isDefined(refX)) {
            if (refX > 0 && refX < 1) {
                tx = bbox.x + bbox.width * refX
            } else if (isScalable) {
                var scale = V(this.$(".scalable")[0]).scale();
                tx = bbox.x + refX / scale.sx
            } else {
                tx = bbox.x + refX
            }
        }
        if (isDefined(refY)) {
            if (refY > 0 && refY < 1) {
                ty = bbox.y + bbox.height * refY
            } else if (isScalable) {
                var scale = V(this.$(".scalable")[0]).scale();
                ty = bbox.y + refY / scale.sy
            } else {
                ty = bbox.y + refY
            }
        }
        var velbbox = vel.bbox(false, this.paper.viewport);
        if (yAlignment === "middle") {
            ty -= velbbox.height / 2
        } else if (isDefined(yAlignment)) {
            ty += yAlignment>-1 && yAlignment < 1 ? velbbox.height * yAlignment : yAlignment
        }
        if (xAlignment === "middle") {
            tx -= velbbox.width / 2
        } else if (isDefined(xAlignment)) {
            tx += xAlignment>-1 && xAlignment < 1 ? velbbox.width * xAlignment : xAlignment
        }
        vel.translate(tx, ty)
    },
    renderMarkup: function() {
        var markup = this.model.markup || this.model.get("markup");
        if (markup) {
            var nodes = V(markup);
            V(this.el).append(nodes)
        } else {
            throw new Error("properties.markup is missing while the default render() implementation is used.")
        }
    },
    render: function() {
        this.$el.empty();
        this.renderMarkup();
        this.update();
        this.resize();
        this.rotate();
        this.translate();
        return this
    },
    scale: function(sx, sy) {
        V(this.el).scale(sx, sy)
    },
    resize: function() {
        var size = this.model.get("size") || {
            width: 1,
            height: 1
        };
        var angle = this.model.get("angle") || 0;
        var scalable = V(this.$(".scalable")[0]);
        if (!scalable) {
            return 
        }
        var scalableBbox = scalable.bbox(true);
        scalable.attr("transform", "scale(" + size.width / (scalableBbox.width || 1) + "," + size.height / (scalableBbox.height || 1) + ")");
        var rotatable = V(this.$(".rotatable")[0]);
        var rotation = rotatable && rotatable.attr("transform");
        if (rotation && rotation !== "null") {
            rotatable.attr("transform", rotation + " rotate(" +- angle + "," + size.width / 2 + "," + size.height / 2 + ")");
            var rotatableBbox = scalable.bbox(false, this.paper.viewport);
            this.model.set("position", {
                x: rotatableBbox.x,
                y: rotatableBbox.y
            });
            this.rotate()
        }
        this.update()
    },
    translate: function(model, changes, opt) {
        var position = this.model.get("position") || {
            x: 0,
            y: 0
        };
        V(this.el).attr("transform", "translate(" + position.x + "," + position.y + ")")
    },
    rotate: function() {
        var rotatable = V(this.$(".rotatable")[0]);
        if (!rotatable) {
            return 
        }
        var angle = this.model.get("angle") || 0;
        var size = this.model.get("size") || {
            width: 1,
            height: 1
        };
        var ox = size.width / 2;
        var oy = size.height / 2;
        rotatable.attr("transform", "rotate(" + angle + "," + ox + "," + oy + ")")
    },
    pointerdown: function(evt, x, y) {
        if (evt.target.getAttribute("magnet") && this.paper.options.validateMagnet.call(this.paper, this, evt.target)) {
            this.model.trigger("batch:start");
            var link = this.paper.getDefaultLink(this, evt.target);
            link.set({
                source: {
                    id: this.model.id,
                    selector: this.getSelector(evt.target),
                    port: $(evt.target).attr("port")
                },
                target: {
                    x: x,
                    y: y
                }
            });
            this.paper.model.addCell(link);
            this._linkView = this.paper.findViewByModel(link);
            this._linkView.startArrowheadMove("target")
        } else {
            this._dx = x;
            this._dy = y;
            joint.dia.CellView.prototype.pointerdown.apply(this, arguments)
        }
    },
    pointermove: function(evt, x, y) {
        if (this._linkView) {
            this._linkView.pointermove(evt, x, y)
        } else {
            var grid = this.paper.options.gridSize;
            if (this.options.interactive !== false) {
                var position = this.model.get("position");
                this.model.translate(g.snapToGrid(position.x, grid) - position.x + g.snapToGrid(x - this._dx, grid), g.snapToGrid(position.y, grid) - position.y + g.snapToGrid(y - this._dy, grid))
            }
            this._dx = g.snapToGrid(x, grid);
            this._dy = g.snapToGrid(y, grid);
            joint.dia.CellView.prototype.pointermove.apply(this, arguments)
        }
    },
    pointerup: function(evt, x, y) {
        if (this._linkView) {
            this._linkView.pointerup(evt, x, y);
            delete this._linkView;
            this.model.trigger("batch:stop")
        } else {
            joint.dia.CellView.prototype.pointerup.apply(this, arguments)
        }
    }
});
if (typeof exports === "object") {
    module.exports.Element = joint.dia.Element;
    module.exports.ElementView = joint.dia.ElementView
}
if (typeof exports === "object") {
    var joint = {
        dia: {
            Cell: require("./joint.dia.cell").Cell,
            CellView: require("./joint.dia.cell").CellView
        }
    };
    var Backbone = require("backbone");
    var _ = require("lodash");
    var g = require("./geometry")
}
joint.dia.Link = joint.dia.Cell.extend({
    markup: ['<path class="connection" stroke="black"/>', '<path class="marker-source" fill="black" stroke="black" />', '<path class="marker-target" fill="black" stroke="black" />', '<path class="connection-wrap"/>', '<g class="labels"/>', '<g class="marker-vertices"/>', '<g class="marker-arrowheads"/>', '<g class="link-tools"/>'].join(""),
    labelMarkup: ['<g class="label">', "<rect />", "<text />", "</g>"].join(""),
    toolMarkup: ['<g class="link-tool">', '<g class="tool-remove" event="remove">', '<circle r="11" />', '<path transform="scale(.8) translate(-16, -16)" d="M24.778,21.419 19.276,15.917 24.777,10.415 21.949,7.585 16.447,13.087 10.945,7.585 8.117,10.415 13.618,15.917 8.116,21.419 10.946,24.248 16.447,18.746 21.948,24.248z"/>', "<title>Remove link.</title>", "</g>", '<g class="tool-options" event="link:options">', '<circle r="11" transform="translate(25)"/>', '<path fill="white" transform="scale(.55) translate(29, -16)" d="M31.229,17.736c0.064-0.571,0.104-1.148,0.104-1.736s-0.04-1.166-0.104-1.737l-4.377-1.557c-0.218-0.716-0.504-1.401-0.851-2.05l1.993-4.192c-0.725-0.91-1.549-1.734-2.458-2.459l-4.193,1.994c-0.647-0.347-1.334-0.632-2.049-0.849l-1.558-4.378C17.165,0.708,16.588,0.667,16,0.667s-1.166,0.041-1.737,0.105L12.707,5.15c-0.716,0.217-1.401,0.502-2.05,0.849L6.464,4.005C5.554,4.73,4.73,5.554,4.005,6.464l1.994,4.192c-0.347,0.648-0.632,1.334-0.849,2.05l-4.378,1.557C0.708,14.834,0.667,15.412,0.667,16s0.041,1.165,0.105,1.736l4.378,1.558c0.217,0.715,0.502,1.401,0.849,2.049l-1.994,4.193c0.725,0.909,1.549,1.733,2.459,2.458l4.192-1.993c0.648,0.347,1.334,0.633,2.05,0.851l1.557,4.377c0.571,0.064,1.148,0.104,1.737,0.104c0.588,0,1.165-0.04,1.736-0.104l1.558-4.377c0.715-0.218,1.399-0.504,2.049-0.851l4.193,1.993c0.909-0.725,1.733-1.549,2.458-2.458l-1.993-4.193c0.347-0.647,0.633-1.334,0.851-2.049L31.229,17.736zM16,20.871c-2.69,0-4.872-2.182-4.872-4.871c0-2.69,2.182-4.872,4.872-4.872c2.689,0,4.871,2.182,4.871,4.872C20.871,18.689,18.689,20.871,16,20.871z"/>', "<title>Link options.</title>", "</g>", "</g>"].join(""),
    vertexMarkup: ['<g class="marker-vertex-group" transform="translate(<%= x %>, <%= y %>)">', '<circle class="marker-vertex" idx="<%= idx %>" r="10" />', '<path class="marker-vertex-remove-area" idx="<%= idx %>" d="M16,5.333c-7.732,0-14,4.701-14,10.5c0,1.982,0.741,3.833,2.016,5.414L2,25.667l5.613-1.441c2.339,1.317,5.237,2.107,8.387,2.107c7.732,0,14-4.701,14-10.5C30,10.034,23.732,5.333,16,5.333z" transform="translate(5, -33)"/>', '<path class="marker-vertex-remove" idx="<%= idx %>" transform="scale(.8) translate(9.5, -37)" d="M24.778,21.419 19.276,15.917 24.777,10.415 21.949,7.585 16.447,13.087 10.945,7.585 8.117,10.415 13.618,15.917 8.116,21.419 10.946,24.248 16.447,18.746 21.948,24.248z">', "<title>Remove vertex.</title>", "</path>", "</g>"].join(""),
    arrowheadMarkup: ['<g class="marker-arrowhead-group marker-arrowhead-group-<%= end %>">', '<path class="marker-arrowhead" end="<%= end %>" d="M 26 0 L 0 13 L 26 26 z" />', "</g>"].join(""),
    defaults: {
        type: "link"
    },
    disconnect: function() {
        return this.set({
            source: g.point(0, 0),
            target: g.point(0, 0)
        })
    },
    label: function(idx, value) {
        idx = idx || 0;
        var labels = this.get("labels") || [];
        if (arguments.length === 0 || arguments.length === 1) {
            return labels[idx]
        }
        var newValue = _.merge({}, labels[idx], value);
        var newLabels = labels.slice();
        newLabels[idx] = newValue;
        return this.set({
            labels: newLabels
        })
    }
});
joint.dia.LinkView = joint.dia.CellView.extend({
    className: function() {
        return _.unique(this.model.get("type").split(".").concat("link")).join(" ")
    },
    options: {
        shortLinkLength: 100
    },
    initialize: function() {
        joint.dia.CellView.prototype.initialize.apply(this, arguments);
        if (typeof this.constructor.prototype.watchSource !== "function") {
            this.constructor.prototype.watchSource = this._createWatcher("source");
            this.constructor.prototype.watchTarget = this._createWatcher("target")
        }
        this._labelCache = {};
        this._markerCache = {};
        this.startListening()
    },
    startListening: function() {
        this.listenTo(this.model, "change:markup", this.render);
        this.listenTo(this.model, "change:smooth change:manhattan change:router change:connector", this.update);
        this.listenTo(this.model, "change:toolMarkup", function() {
            this.renderTools().updateToolsPosition()
        });
        this.listenTo(this.model, "change:labels change:labelMarkup", function() {
            this.renderLabels().updateLabelPositions()
        });
        this.listenTo(this.model, "change:vertices change:vertexMarkup", function() {
            this.renderVertexMarkers().update()
        });
        this.listenTo(this.model, "change:source", function(cell, source) {
            this.watchSource(cell, source).update()
        });
        this.listenTo(this.model, "change:target", function(cell, target) {
            this.watchTarget(cell, target).update()
        })
    },
    render: function() {
        this.$el.empty();
        var children = V(this.model.get("markup") || this.model.markup);
        if (!_.isArray(children))
            children = [children];
        this._V = {};
        _.each(children, function(child) {
            var c = child.attr("class");
            c && (this._V[$.camelCase(c)] = child)
        }, this);
        if (!this._V.connection)
            throw new Error("link: no connection path in the markup");
        this.renderTools();
        this.renderVertexMarkers();
        this.renderArrowheadMarkers();
        V(this.el).append(children);
        this.renderLabels();
        this.watchSource(this.model, this.model.get("source")).watchTarget(this.model, this.model.get("target")).update();
        return this
    },
    renderLabels: function() {
        if (!this._V.labels)
            return this;
        this._labelCache = {};
        var $labels = $(this._V.labels.node).empty();
        var labels = this.model.get("labels") || [];
        if (!labels.length)
            return this;
        var labelTemplate = _.template(this.model.get("labelMarkup") || this.model.labelMarkup);
        var labelNodeInstance = V(labelTemplate());
        _.each(labels, function(label, idx) {
            var labelNode = labelNodeInstance.clone().node;
            this._labelCache[idx] = V(labelNode);
            var $text = $(labelNode).find("text");
            var $rect = $(labelNode).find("rect");
            var textAttributes = _.extend({
                "text-anchor": "middle",
                "font-size": 14
            }, joint.util.getByPath(label, "attrs/text", "/"));
            $text.attr(_.omit(textAttributes, "text"));
            if (!_.isUndefined(textAttributes.text)) {
                V($text[0]).text(textAttributes.text + "")
            }
            $labels.append(labelNode);
            var textBbox = V($text[0]).bbox(true, $labels[0]);
            V($text[0]).translate(0, - textBbox.height / 2);
            var rectAttributes = _.extend({
                fill: "white",
                rx: 3,
                ry: 3
            }, joint.util.getByPath(label, "attrs/rect", "/"));
            $rect.attr(_.extend(rectAttributes, {
                x: textBbox.x,
                y: textBbox.y - textBbox.height / 2,
                width: textBbox.width,
                height: textBbox.height
            }))
        }, this);
        return this
    },
    renderTools: function() {
        if (!this._V.linkTools)
            return this;
        var $tools = $(this._V.linkTools.node).empty();
        var toolTemplate = _.template(this.model.get("toolMarkup") || this.model.toolMarkup);
        var tool = V(toolTemplate());
        $tools.append(tool.node);
        this._toolCache = tool;
        return this
    },
    renderVertexMarkers: function() {
        if (!this._V.markerVertices)
            return this;
        var $markerVertices = $(this._V.markerVertices.node).empty();
        var markupTemplate = _.template(this.model.get("vertexMarkup") || this.model.vertexMarkup);
        _.each(this.model.get("vertices"), function(vertex, idx) {
            $markerVertices.append(V(markupTemplate(_.extend({
                idx: idx
            }, vertex))).node)
        });
        return this
    },
    renderArrowheadMarkers: function() {
        if (!this._V.markerArrowheads)
            return this;
        var $markerArrowheads = $(this._V.markerArrowheads.node);
        $markerArrowheads.empty();
        var markupTemplate = _.template(this.model.get("arrowheadMarkup") || this.model.arrowheadMarkup);
        this._V.sourceArrowhead = V(markupTemplate({
            end: "source"
        }));
        this._V.targetArrowhead = V(markupTemplate({
            end: "target"
        }));
        $markerArrowheads.append(this._V.sourceArrowhead.node, this._V.targetArrowhead.node);
        return this
    },
    update: function() {
        _.each(this.model.get("attrs"), function(attrs, selector) {
            if (_.isObject(attrs.filter)) {
                this.findBySelector(selector).attr(_.omit(attrs, "filter"));
                this.applyFilter(selector, attrs.filter)
            } else {
                this.findBySelector(selector).attr(attrs)
            }
        }, this);
        var vertices = this.route = this.findRoute(this.model.get("vertices") || []);
        this._findConnectionPoints(vertices);
        var pathData = this.getPathData(vertices);
        this._V.connection.attr("d", pathData);
        this._V.connectionWrap && this._V.connectionWrap.attr("d", pathData);
        this._translateAndAutoOrientArrows(this._V.markerSource, this._V.markerTarget);
        this.updateLabelPositions();
        this.updateToolsPosition();
        this.updateArrowheadMarkers();
        delete this.options.perpendicular;
        return this
    },
    _findConnectionPoints: function(vertices) {
        var sourcePoint, targetPoint, sourceMarkerPoint, targetMarkerPoint;
        var firstVertex = _.first(vertices);
        sourcePoint = this.getConnectionPoint("source", this.model.get("source"), firstVertex || this.model.get("target")).round();
        var lastVertex = _.last(vertices);
        targetPoint = this.getConnectionPoint("target", this.model.get("target"), lastVertex || sourcePoint).round();
        var cache = this._markerCache;
        if (this._V.markerSource) {
            cache.sourceBBox = cache.sourceBBox || this._V.markerSource.bbox(true);
            sourceMarkerPoint = g.point(sourcePoint).move(firstVertex || targetPoint, cache.sourceBBox.width * this._V.markerSource.scale().sx*-1).round()
        }
        if (this._V.markerTarget) {
            cache.targetBBox = cache.targetBBox || this._V.markerTarget.bbox(true);
            targetMarkerPoint = g.point(targetPoint).move(lastVertex || sourcePoint, cache.targetBBox.width * this._V.markerTarget.scale().sx*-1).round()
        }
        cache.sourcePoint = sourceMarkerPoint || sourcePoint;
        cache.targetPoint = targetMarkerPoint || targetPoint;
        this.sourcePoint = sourcePoint;
        this.targetPoint = targetPoint
    },
    updateLabelPositions: function() {
        if (!this._V.labels)
            return this;
        var labels = this.model.get("labels") || [];
        if (!labels.length)
            return this;
        var connectionElement = this._V.connection.node;
        var connectionLength = connectionElement.getTotalLength();
        _.each(labels, function(label, idx) {
            var position = label.position;
            position = position > connectionLength ? connectionLength : position;
            position = position < 0 ? connectionLength + position : position;
            position = position > 1 ? position : connectionLength * position;
            var labelCoordinates = connectionElement.getPointAtLength(position);
            this._labelCache[idx].attr("transform", "translate(" + labelCoordinates.x + ", " + labelCoordinates.y + ")")
        }, this);
        return this
    },
    updateToolsPosition: function() {
        if (!this._V.linkTools)
            return this;
        var scale = "";
        var offset = 40;
        if (this.getConnectionLength() < this.options.shortLinkLength) {
            scale = "scale(.5)";
            offset/=2
        }
        var toolPosition = this.getPointAtLength(offset);
        this._toolCache.attr("transform", "translate(" + toolPosition.x + ", " + toolPosition.y + ") " + scale);
        return this
    },
    updateArrowheadMarkers: function() {
        if (!this._V.markerArrowheads)
            return this;
        if ($.css(this._V.markerArrowheads.node, "display") === "none")
            return this;
        var sx = this.getConnectionLength() < this.options.shortLinkLength ? .5: 1;
        this._V.sourceArrowhead.scale(sx);
        this._V.targetArrowhead.scale(sx);
        this._translateAndAutoOrientArrows(this._V.sourceArrowhead, this._V.targetArrowhead);
        return this
    },
    _createWatcher: function(endType) {
        function watchEnd(link, end) {
            end = end || {};
            var previousEnd = link.previous(endType) || {};
            var updateEndFunction = this["_" + endType + "BBoxUpdate"];
            if (this._isModel(previousEnd)) {
                this.stopListening(this.paper.getModelById(previousEnd.id), "change", updateEndFunction)
            }
            if (this._isModel(end)) {
                this.listenTo(this.paper.getModelById(end.id), "change", updateEndFunction)
            }
            _.bind(updateEndFunction, this)({
                cacheOnly: true
            });
            return this
        }
        return watchEnd
    },
    _sourceBBoxUpdate: function(update) {
        this.lastEndChange = "source";
        update = update || {};
        var end = this.model.get("source");
        if (this._isModel(end)) {
            var selector = this._makeSelector(end);
            var view = this.paper.findViewByModel(end.id);
            var magnetElement = this.paper.viewport.querySelector(selector);
            this.sourceBBox = view.getStrokeBBox(magnetElement)
        } else if (end) {
            this.sourceBBox = g.rect(end.x, end.y, 1, 1)
        }
        if (!update.cacheOnly)
            this.update()
    },
    _targetBBoxUpdate: function(update) {
        this.lastEndChange = "target";
        update = update || {};
        var end = this.model.get("target");
        if (this._isModel(end)) {
            var selector = this._makeSelector(end);
            var view = this.paper.findViewByModel(end.id);
            var magnetElement = this.paper.viewport.querySelector(selector);
            this.targetBBox = view.getStrokeBBox(magnetElement)
        } else if (end) {
            this.targetBBox = g.rect(end.x, end.y, 1, 1)
        }
        if (!update.cacheOnly)
            this.update()
    },
    _translateAndAutoOrientArrows: function(sourceArrow, targetArrow) {
        if (sourceArrow) {
            sourceArrow.translateAndAutoOrient(this.sourcePoint, _.first(this.route) || this.targetPoint, this.paper.viewport)
        }
        if (targetArrow) {
            targetArrow.translateAndAutoOrient(this.targetPoint, _.last(this.route) || this.sourcePoint, this.paper.viewport)
        }
    },
    removeVertex: function(idx) {
        var vertices = _.clone(this.model.get("vertices"));
        if (vertices && vertices.length) {
            vertices.splice(idx, 1);
            this.model.set("vertices", vertices)
        }
        return this
    },
    addVertex: function(vertex) {
        this.model.set("attrs", this.model.get("attrs") || {});
        var attrs = this.model.get("attrs");
        var vertices = (this.model.get("vertices") || []).slice();
        var originalVertices = vertices.slice();
        var path = this._V.connection.node.cloneNode(false);
        var originalPathLength = path.getTotalLength();
        var pathLength;
        var pathLengthTolerance = 20;
        var idx = vertices.length + 1;
        while (idx--) {
            vertices.splice(idx, 0, vertex);
            V(path).attr("d", this.getPathData(this.findRoute(vertices)));
            pathLength = path.getTotalLength();
            if (pathLength - originalPathLength > pathLengthTolerance) {
                vertices = originalVertices.slice()
            } else {
                break
            }
        }
        this.model.set("vertices", vertices);
        return Math.max(idx, 0)
    },
    sendToken: function(token, duration, callback) {
        duration = duration || 1e3;
        V(this.paper.viewport).append(token);
        V(token).animateAlongPath({
            dur: duration + "ms",
            repeatCount: 1
        }, this._V.connection.node);
        _.delay(function() {
            V(token).remove();
            callback && callback()
        }, duration)
    },
    findRoute: function(oldVertices) {
        var router = this.model.get("router");
        if (!router) {
            if (this.model.get("manhattan")) {
                router = {
                    name: "orthogonal"
                }
            } else {
                return oldVertices
            }
        }
        var fn = joint.routers[router.name];
        if (!_.isFunction(fn)) {
            throw "unknown router: " + router.name
        }
        var newVertices = fn.call(this, oldVertices || [], router.args || {}, this);
        return newVertices
    },
    getPathData: function(vertices) {
        var connector = this.model.get("connector");
        if (!connector) {
            connector = this.model.get("smooth") ? {
                name: "smooth"
            } : {
                name: "normal"
            }
        }
        if (!_.isFunction(joint.connectors[connector.name])) {
            throw "unknown connector: " + connector.name
        }
        var pathData = joint.connectors[connector.name].call(this, this._markerCache.sourcePoint, this._markerCache.targetPoint, vertices || (this.model.get("vertices") || {}), connector.args || {}, this);
        return pathData
    },
    getConnectionPoint: function(end, selectorOrPoint, referenceSelectorOrPoint) {
        var spot;
        selectorOrPoint = selectorOrPoint || {
            x: 0,
            y: 0
        };
        referenceSelectorOrPoint = referenceSelectorOrPoint || {
            x: 0,
            y: 0
        };
        if (this._isPoint(selectorOrPoint)) {
            spot = g.point(selectorOrPoint)
        } else {
            var spotBbox = end === "source" ? this.sourceBBox: this.targetBBox;
            var reference;
            if (this._isPoint(referenceSelectorOrPoint)) {
                reference = g.point(referenceSelectorOrPoint)
            } else {
                var referenceBbox = end === "source" ? this.targetBBox: this.sourceBBox;
                reference = g.rect(referenceBbox).intersectionWithLineFromCenterToPoint(g.rect(spotBbox).center());
                reference = reference || g.rect(referenceBbox).center()
            }
            if (this.paper.options.perpendicularLinks || this.options.perpendicular) {
                var horizontalLineRect = g.rect(0, reference.y, this.paper.options.width, 1);
                var verticalLineRect = g.rect(reference.x, 0, 1, this.paper.options.height);
                var nearestSide;
                if (horizontalLineRect.intersect(g.rect(spotBbox))) {
                    nearestSide = g.rect(spotBbox).sideNearestToPoint(reference);
                    switch (nearestSide) {
                    case"left":
                        spot = g.point(spotBbox.x, reference.y);
                        break;
                    case"right":
                        spot = g.point(spotBbox.x + spotBbox.width, reference.y);
                        break;
                    default:
                        spot = g.rect(spotBbox).center();
                        break
                    }
                } else if (verticalLineRect.intersect(g.rect(spotBbox))) {
                    nearestSide = g.rect(spotBbox).sideNearestToPoint(reference);
                    switch (nearestSide) {
                    case"top":
                        spot = g.point(reference.x, spotBbox.y);
                        break;
                    case"bottom":
                        spot = g.point(reference.x, spotBbox.y + spotBbox.height);
                        break;
                    default:
                        spot = g.rect(spotBbox).center();
                        break
                    }
                } else {
                    spot = g.rect(spotBbox).intersectionWithLineFromCenterToPoint(reference);
                    spot = spot || g.rect(spotBbox).center()
                }
            } else {
                spot = g.rect(spotBbox).intersectionWithLineFromCenterToPoint(reference);
                spot = spot || g.rect(spotBbox).center()
            }
        }
        return spot
    },
    _isModel: function(end) {
        return end && end.id
    },
    _isPoint: function(end) {
        return !this._isModel(end)
    },
    _makeSelector: function(end) {
        var selector = '[model-id="' + end.id + '"]';
        if (end.port) {
            selector += ' [port="' + end.port + '"]'
        } else if (end.selector) {
            selector += " " + end.selector
        }
        return selector
    },
    getConnectionLength: function() {
        return this._V.connection.node.getTotalLength()
    },
    getPointAtLength: function(length) {
        return this._V.connection.node.getPointAtLength(length)
    },
    _beforeArrowheadMove: function() {
        this.model.trigger("batch:start");
        this._z = this.model.get("z");
        this.model.set("z", Number.MAX_VALUE);
        this.el.style.pointerEvents = "none";
        if (this.paper.options.markAvailable) {
            this._markAvailableMagnets()
        }
    },
    _afterArrowheadMove: function() {
        if (this._z) {
            this.model.set("z", this._z);
            delete this._z
        }
        this.el.style.pointerEvents = "visiblePainted";
        if (this.paper.options.markAvailable) {
            this._unmarkAvailableMagnets()
        }
        this.model.trigger("batch:stop")
    },
    _createValidateConnectionArgs: function(arrowhead) {
        var args = [];
        args[4] = arrowhead;
        args[5] = this;
        var oppositeArrowhead, i = 0, j = 0;
        if (arrowhead === "source") {
            i = 2;
            oppositeArrowhead = "target"
        } else {
            j = 2;
            oppositeArrowhead = "source"
        }
        var end = this.model.get(oppositeArrowhead);
        if (end.id) {
            args[i] = this.paper.findViewByModel(end.id);
            args[i + 1] = end.selector && args[i].el.querySelector(end.selector)
        }
        function validateConnectionArgs(cellView, magnet) {
            args[j] = cellView;
            args[j + 1] = cellView.el === magnet ? undefined : magnet;
            return args
        }
        return validateConnectionArgs
    },
    _markAvailableMagnets: function() {
        var elements = this.paper.model.getElements();
        var validate = this.paper.options.validateConnection;
        _.chain(elements).map(this.paper.findViewByModel, this.paper).each(function(view) {
            var isElementAvailable = view.el.getAttribute("magnet") !== "false" && validate.apply(this.paper, this._validateConnectionArgs(view, null));
            var availableMagnets = _.filter(view.el.querySelectorAll("[magnet]"), function(magnet) {
                return validate.apply(this.paper, this._validateConnectionArgs(view, magnet))
            }, this);
            if (isElementAvailable) {
                V(view.el).addClass("available-magnet")
            }
            _.each(availableMagnets, function(magnet) {
                V(magnet).addClass("available-magnet")
            });
            if (isElementAvailable || availableMagnets.length) {
                V(view.el).addClass("available-cell")
            }
        }, this)
    },
    _unmarkAvailableMagnets: function() {
        _.each(this.paper.el.querySelectorAll(".available-cell, .available-magnet"), function(magnet) {
            V(magnet).removeClass("available-magnet").removeClass("available-cell")
        })
    },
    startArrowheadMove: function(end) {
        this._action = "arrowhead-move";
        this._arrowhead = end;
        this._validateConnectionArgs = this._createValidateConnectionArgs(this._arrowhead);
        this._beforeArrowheadMove()
    },
    pointerdown: function(evt, x, y) {
        joint.dia.CellView.prototype.pointerdown.apply(this, arguments);
        this._dx = x;
        this._dy = y;
        if (this.options.interactive === false)
            return;
        var className = evt.target.getAttribute("class");
        switch (className) {
        case"marker-vertex":
            this._action = "vertex-move";
            this._vertexIdx = evt.target.getAttribute("idx");
            break;
        case"marker-vertex-remove":
        case"marker-vertex-remove-area":
            this.removeVertex(evt.target.getAttribute("idx"));
            break;
        case"marker-arrowhead":
            this.startArrowheadMove(evt.target.getAttribute("end"));
            break;
        default:
            var targetParentEvent = evt.target.parentNode.getAttribute("event");
            if (targetParentEvent) {
                if (targetParentEvent === "remove") {
                    this.model.remove()
                } else {
                    this.paper.trigger(targetParentEvent, evt, this, x, y)
                }
            } else {
                this._vertexIdx = this.addVertex({
                    x: x,
                    y: y
                });
                this._action = "vertex-move"
            }
        }
    },
    pointermove: function(evt, x, y) {
        joint.dia.CellView.prototype.pointermove.apply(this, arguments);
        switch (this._action) {
        case"vertex-move":
            var vertices = _.clone(this.model.get("vertices"));
            vertices[this._vertexIdx] = {
                x: x,
                y: y
            };
            this.model.set("vertices", vertices);
            break;
        case"arrowhead-move":
            if (this.paper.options.snapLinks) {
                var r = this.paper.options.snapLinks.radius || 50;
                var viewsInArea = this.paper.findViewsInArea({
                    x: x - r,
                    y: y - r,
                    width: 2 * r,
                    height: 2 * r
                });
                this._closestView && this._closestView.unhighlight(this._closestEnd.selector);
                this._closestView = this._closestEnd = null;
                var pointer = g.point(x, y);
                var distance, minDistance = Number.MAX_VALUE;
                _.each(viewsInArea, function(view) {
                    if (view.el.getAttribute("magnet") !== "false") {
                        distance = view.model.getBBox().center().distance(pointer);
                        if (distance < r && distance < minDistance) {
                            if (this.paper.options.validateConnection.apply(this.paper, this._validateConnectionArgs(view, null))) {
                                minDistance = distance;
                                this._closestView = view;
                                this._closestEnd = {
                                    id: view.model.id
                                }
                            }
                        }
                    }
                    view.$("[magnet]").each(_.bind(function(index, magnet) {
                        var bbox = V(magnet).bbox(false, this.paper.viewport);
                        distance = pointer.distance({
                            x: bbox.x + bbox.width / 2,
                            y: bbox.y + bbox.height / 2
                        });
                        if (distance < r && distance < minDistance) {
                            if (this.paper.options.validateConnection.apply(this.paper, this._validateConnectionArgs(view, magnet))) {
                                minDistance = distance;
                                this._closestView = view;
                                this._closestEnd = {
                                    id: view.model.id,
                                    selector: view.getSelector(magnet),
                                    port: magnet.getAttribute("port")
                                }
                            }
                        }
                    }, this))
                }, this);
                this._closestView && this._closestView.highlight(this._closestEnd.selector);
                this.model.set(this._arrowhead, this._closestEnd || {
                    x: x,
                    y: y
                })
            } else {
                var target = evt.type === "mousemove" ? evt.target: document.elementFromPoint(evt.clientX, evt.clientY);
                if (this._targetEvent !== target) {
                    this._magnetUnderPointer && this._viewUnderPointer.unhighlight(this._magnetUnderPointer);
                    this._viewUnderPointer = this.paper.findView(target);
                    if (this._viewUnderPointer) {
                        this._magnetUnderPointer = this._viewUnderPointer.findMagnet(target);
                        if (this._magnetUnderPointer && this.paper.options.validateConnection.apply(this.paper, this._validateConnectionArgs(this._viewUnderPointer, this._magnetUnderPointer))) {
                            this._magnetUnderPointer && this._viewUnderPointer.highlight(this._magnetUnderPointer)
                        } else {
                            this._magnetUnderPointer = null
                        }
                    } else {
                        this._magnetUnderPointer = null
                    }
                }
                this._targetEvent = target;
                this.model.set(this._arrowhead, {
                    x: x,
                    y: y
                })
            }
            break
        }
        this._dx = x;
        this._dy = y
    },
    pointerup: function(evt) {
        joint.dia.CellView.prototype.pointerup.apply(this, arguments);
        if (this._action === "arrowhead-move") {
            if (this.paper.options.snapLinks) {
                this._closestView && this._closestView.unhighlight(this._closestEnd.selector);
                this._closestView = this._closestEnd = null
            } else {
                if (this._magnetUnderPointer) {
                    this._viewUnderPointer.unhighlight(this._magnetUnderPointer);
                    this.model.set(this._arrowhead, {
                        id: this._viewUnderPointer.model.id,
                        selector: this._viewUnderPointer.getSelector(this._magnetUnderPointer),
                        port: $(this._magnetUnderPointer).attr("port")
                    })
                }
                delete this._viewUnderPointer;
                delete this._magnetUnderPointer;
                delete this._staticView;
                delete this._staticMagnet
            }
            this._afterArrowheadMove()
        }
        delete this._action
    }
});
if (typeof exports === "object") {
    module.exports.Link = joint.dia.Link;
    module.exports.LinkView = joint.dia.LinkView
}
joint.dia.Paper = Backbone.View.extend({
    className: "paper",
    options: {
        width: 800,
        height: 600,
        origin: {
            x: 0,
            y: 0
        },
        gridSize: 50,
        perpendicularLinks: false,
        elementView: joint.dia.ElementView,
        linkView: joint.dia.LinkView,
        snapLinks: false,
        markAvailable: false,
        defaultLink: new joint.dia.Link,
        validateMagnet: function(cellView, magnet) {
            return magnet.getAttribute("magnet") !== "passive"
        },
        validateConnection: function(cellViewS, magnetS, cellViewT, magnetT, end, linkView) {
            return (end === "target" ? cellViewT : cellViewS)instanceof joint.dia.ElementView
        }
    },
    events: {
        mousedown: "pointerdown",
        dblclick: "mousedblclick",
        click: "mouseclick",
        touchstart: "pointerdown",
        mousemove: "pointermove",
        touchmove: "pointermove"
    },
    constructor: function(options) {
        this._configure(options);
        Backbone.View.apply(this, arguments)
    },
    _configure: function(options) {
        if (this.options)
            options = _.extend({}, _.result(this, "options"), options);
        this.options = options
    },
    initialize: function() {
        _.bindAll(this, "addCell", "sortCells", "resetCells", "pointerup", "asyncRenderCells");
        this.svg = V("svg").node;
        this.viewport = V("g").node;
        V(this.svg).append(V("defs").node);
        V(this.viewport).attr({
            "class": "viewport"
        });
        V(this.svg).append(this.viewport);
        this.$el.append(this.svg);
        this.setDimensions();
        this.listenTo(this.model, "add", this.addCell);
        this.listenTo(this.model, "reset", this.resetCells);
        this.listenTo(this.model, "sort", this.sortCells);
        $(document).on("mouseup touchend", this.pointerup);
        this._mousemoved = false
    },
    remove: function() {
        $(document).off("mouseup touchend", this.pointerup);
        Backbone.View.prototype.remove.call(this)
    },
    setDimensions: function(width, height, origin) {
        width = this.options.width = width || this.options.width;
        height = this.options.height = height || this.options.height;
        origin = this.options.origin = origin || this.options.origin;
        V(this.svg).attr({
            width: width,
            height: height
        });
        V(this.viewport).translate( - origin.x, - origin.y, {
            absolute: true
        });
        this.trigger("resize", width, height, origin)
    },
    fitToContent: function(gridWidth, gridHeight, padding, opt) {
        gridWidth = gridWidth || 1;
        gridHeight = gridHeight || 1;
        padding = padding || 0;
        opt = opt || {};
        var bbox = V(this.viewport).bbox(true, this.svg);
        var calcWidth = Math.max(Math.ceil((bbox.width + bbox.x) / gridWidth), 1) * gridWidth;
        var calcHeight = Math.max(Math.ceil((bbox.height + bbox.y) / gridHeight), 1) * gridHeight;
        var tx = 0;
        var ty = 0;
        if (opt.fitNegative) {
            if (bbox.x < 0) {
                tx =- Math.ceil( - bbox.x / gridWidth) * gridWidth;
                calcWidth -= tx
            }
            if (bbox.y < 0) {
                ty =- Math.ceil( - bbox.y / gridHeight) * gridHeight;
                calcHeight -= ty
            }
        }
        calcWidth += padding;
        calcHeight += padding;
        var dimensionChange = calcWidth != this.options.width || calcHeight != this.options.height;
        var originChange = opt.fitNegative && (tx != this.options.origin.x || ty != this.options.origin.y);
        if (dimensionChange || originChange) {
            this.setDimensions(calcWidth, calcHeight, {
                x: tx,
                y: ty
            })
        }
    },
    getContentBBox: function() {
        var crect = this.viewport.getBoundingClientRect();
        var ctm = this.viewport.getScreenCTM();
        var bbox = g.rect(crect.left - ctm.e, crect.top - ctm.f, crect.width, crect.height);
        return bbox
    },
    createViewForModel: function(cell) {
        var view;
        var type = cell.get("type");
        var module = type.split(".")[0];
        var entity = type.split(".")[1];
        if (joint.shapes[module] && joint.shapes[module][entity + "View"]) {
            view = new joint.shapes[module][entity + "View"]({
                model: cell,
                interactive: this.options.interactive
            })
        } else if (cell instanceof joint.dia.Element) {
            view = new this.options.elementView({
                model: cell,
                interactive: this.options.interactive
            })
        } else {
            view = new this.options.linkView({
                model: cell,
                interactive: this.options.interactive
            })
        }
        return view
    },
    addCell: function(cell) {
        var view = this.createViewForModel(cell);
        V(this.viewport).append(view.el);
        view.paper = this;
        view.render();
        $(view.el).find("image").on("dragstart", function() {
            return false
        })
    },
    resetCells: function(cellsCollection) {
        $(this.viewport).empty();
        var cells = cellsCollection.models.slice();
        cells.sort(function(a, b) {
            return a instanceof joint.dia.Link ? 1 : - 1
        });
        if (this._frameId) {
            joint.util.cancelFrame(this._frameId)
        }
        if (this.options.async) {
            this.asyncRenderCells(cells)
        } else {
            _.each(cells, this.addCell, this)
        }
        this.sortCells()
    },
    asyncRenderCells: function(cells) {
        var done = false;
        _.each(_.range(this.options.async && this.options.async.batchSize || 50), function() {
            var cell = cells.shift();
            done=!cell;
            if (!done)
                this.addCell(cell)
        }, this);
        if (done) {
            this.trigger("render:done")
        } else {
            this._frameId = joint.util.nextFrame(_.bind(function() {
                this.asyncRenderCells(cells)
            }, this))
        }
    },
    sortCells: function() {
        var $cells = $(this.viewport).children("[model-id]");
        var cells = this.model.get("cells");
        this.sortElements($cells, function(a, b) {
            var cellA = cells.get($(a).attr("model-id"));
            var cellB = cells.get($(b).attr("model-id"));
            return (cellA.get("z") || 0) > (cellB.get("z") || 0) ? 1 : - 1
        })
    },
    sortElements: function(elements, comparator) {
        var $elements = $(elements);
        var placements = $elements.map(function() {
            var sortElement = this;
            var parentNode = sortElement.parentNode;
            var nextSibling = parentNode.insertBefore(document.createTextNode(""), sortElement.nextSibling);
            return function() {
                if (parentNode === this) {
                    throw new Error("You can't sort elements if any one is a descendant of another.")
                }
                parentNode.insertBefore(this, nextSibling);
                parentNode.removeChild(nextSibling)
            }
        });
        return Array.prototype.sort.call($elements, comparator).each(function(i) {
            placements[i].call(this)
        })
    },
    scale: function(sx, sy, ox, oy) {
        if (!ox) {
            ox = 0;
            oy = 0
        }
        V(this.viewport).attr("transform", "");
        if (ox || oy) {
            V(this.viewport).translate( - ox * (sx - 1), - oy * (sy - 1))
        }
        V(this.viewport).scale(sx, sy);
        this.trigger("scale", ox, oy);
        return this
    },
    rotate: function(deg, ox, oy) {
        if (_.isUndefined(ox)) {
            var bbox = this.viewport.getBBox();
            ox = bbox.width / 2;
            oy = bbox.height / 2
        }
        V(this.viewport).rotate(deg, ox, oy)
    },
    findView: function(el) {
        var $el = this.$(el);
        if ($el.length === 0 || $el[0] === this.el) {
            return undefined
        }
        if ($el.data("view")) {
            return $el.data("view")
        }
        return this.findView($el.parent())
    },
    findViewByModel: function(cell) {
        var id = _.isString(cell) ? cell: cell.id;
        var $view = this.$('[model-id="' + id + '"]');
        if ($view.length) {
            return $view.data("view")
        }
        return undefined
    },
    findViewsFromPoint: function(p) {
        p = g.point(p);
        var views = _.map(this.model.getElements(), this.findViewByModel);
        return _.filter(views, function(view) {
            return g.rect(V(view.el).bbox(false, this.viewport)).containsPoint(p)
        }, this)
    },
    findViewsInArea: function(r) {
        r = g.rect(r);
        var views = _.map(this.model.getElements(), this.findViewByModel);
        return _.filter(views, function(view) {
            return r.intersect(g.rect(V(view.el).bbox(false, this.viewport)))
        }, this)
    },
    getModelById: function(id) {
        return this.model.getCell(id)
    },
    snapToGrid: function(p) {
        var localPoint = V(this.viewport).toLocalPoint(p.x, p.y);
        return {
            x: g.snapToGrid(localPoint.x, this.options.gridSize),
            y: g.snapToGrid(localPoint.y, this.options.gridSize)
        }
    },
    getDefaultLink: function(cellView, magnet) {
        return _.isFunction(this.options.defaultLink) ? this.options.defaultLink.call(this, cellView, magnet) : this.options.defaultLink.clone()
    },
    mousedblclick: function(evt) {
        evt.preventDefault();
        evt = joint.util.normalizeEvent(evt);
        var view = this.findView(evt.target);
        var localPoint = this.snapToGrid({
            x: evt.clientX,
            y: evt.clientY
        });
        if (view) {
            view.pointerdblclick(evt, localPoint.x, localPoint.y)
        } else {
            this.trigger("blank:pointerdblclick", evt, localPoint.x, localPoint.y)
        }
    },
    mouseclick: function(evt) {
        if (!this._mousemoved) {
            evt.preventDefault();
            evt = joint.util.normalizeEvent(evt);
            var view = this.findView(evt.target);
            var localPoint = this.snapToGrid({
                x: evt.clientX,
                y: evt.clientY
            });
            if (view) {
                view.pointerclick(evt, localPoint.x, localPoint.y)
            } else {
                this.trigger("blank:pointerclick", evt, localPoint.x, localPoint.y)
            }
        }
        this._mousemoved = false
    },
    pointerdown: function(evt) {
        evt.preventDefault();
        evt = joint.util.normalizeEvent(evt);
        var view = this.findView(evt.target);
        var localPoint = this.snapToGrid({
            x: evt.clientX,
            y: evt.clientY
        });
        if (view) {
            this.sourceView = view;
            view.pointerdown(evt, localPoint.x, localPoint.y)
        } else {
            this.trigger("blank:pointerdown", evt, localPoint.x, localPoint.y)
        }
    },
    pointermove: function(evt) {
        evt.preventDefault();
        evt = joint.util.normalizeEvent(evt);
        if (this.sourceView) {
            this._mousemoved = true;
            var localPoint = this.snapToGrid({
                x: evt.clientX,
                y: evt.clientY
            });
            this.sourceView.pointermove(evt, localPoint.x, localPoint.y)
        }
    },
    pointerup: function(evt) {
        evt = joint.util.normalizeEvent(evt);
        var localPoint = this.snapToGrid({
            x: evt.clientX,
            y: evt.clientY
        });
        if (this.sourceView) {
            this.sourceView.pointerup(evt, localPoint.x, localPoint.y);
            this.sourceView = null
        } else {
            this.trigger("blank:pointerup", evt, localPoint.x, localPoint.y)
        }
    }
});
if (typeof exports === "object") {
    var joint = {
        util: require("../src/core").util,
        shapes: {},
        dia: {
            Element: require("../src/joint.dia.element").Element,
            ElementView: require("../src/joint.dia.element").ElementView
        }
    };
    var _ = require("lodash")
}
joint.shapes.basic = {};
joint.shapes.basic.Generic = joint.dia.Element.extend({
    defaults: joint.util.deepSupplement({
        type: "basic.Generic",
        attrs: {
            ".": {
                fill: "#FFFFFF",
                stroke: "none"
            }
        }
    }, joint.dia.Element.prototype.defaults)
});
joint.shapes.basic.Rect = joint.shapes.basic.Generic.extend({
    markup: '<g class="rotatable"><g class="scalable"><rect/></g><text/></g>',
    defaults: joint.util.deepSupplement({
        type: "basic.Rect",
        attrs: {
            rect: {
                fill: "#FFFFFF",
                stroke: "black",
                width: 100,
                height: 60
            },
            text: {
                "font-size": 14,
                text: "",
                "ref-x": .5,
                "ref-y": .5,
                ref: "rect",
                "y-alignment": "middle",
                "x-alignment": "middle",
                fill: "black",
                "font-family": "Arial, helvetica, sans-serif"
            }
        }
    }, joint.shapes.basic.Generic.prototype.defaults)
});
joint.shapes.basic.Text = joint.shapes.basic.Generic.extend({
    markup: '<g class="rotatable"><g class="scalable"><text/></g></g>',
    defaults: joint.util.deepSupplement({
        type: "basic.Text",
        attrs: {
            text: {
                "font-size": 18,
                fill: "black"
            }
        }
    }, joint.shapes.basic.Generic.prototype.defaults)
});
joint.shapes.basic.Circle = joint.shapes.basic.Generic.extend({
    markup: '<g class="rotatable"><g class="scalable"><circle/></g><text/></g>',
    defaults: joint.util.deepSupplement({
        type: "basic.Circle",
        size: {
            width: 60,
            height: 60
        },
        attrs: {
            circle: {
                fill: "#FFFFFF",
                stroke: "black",
                r: 30,
                transform: "translate(30, 30)"
            },
            text: {
                "font-size": 14,
                text: "",
                "text-anchor": "middle",
                "ref-x": .5,
                "ref-y": .5,
                ref: "circle",
                "y-alignment": "middle",
                fill: "black",
                "font-family": "Arial, helvetica, sans-serif"
            }
        }
    }, joint.shapes.basic.Generic.prototype.defaults)
});
joint.shapes.basic.Image = joint.shapes.basic.Generic.extend({
    markup: '<g class="rotatable"><g class="scalable"><image/></g><text/></g>',
    defaults: joint.util.deepSupplement({
        type: "basic.Image",
        attrs: {
            text: {
                "font-size": 14,
                text: "",
                "text-anchor": "middle",
                "ref-x": .5,
                "ref-dy": 20,
                ref: "image",
                "y-alignment": "middle",
                fill: "black",
                "font-family": "Arial, helvetica, sans-serif"
            }
        }
    }, joint.shapes.basic.Generic.prototype.defaults)
});
joint.shapes.basic.Path = joint.shapes.basic.Generic.extend({
    markup: '<g class="rotatable"><g class="scalable"><path/></g><text/></g>',
    defaults: joint.util.deepSupplement({
        type: "basic.Path",
        size: {
            width: 60,
            height: 60
        },
        attrs: {
            path: {
                fill: "#FFFFFF",
                stroke: "black"
            },
            text: {
                "font-size": 14,
                text: "",
                "text-anchor": "middle",
                "ref-x": .5,
                "ref-dy": 20,
                ref: "path",
                "y-alignment": "middle",
                fill: "black",
                "font-family": "Arial, helvetica, sans-serif"
            }
        }
    }, joint.shapes.basic.Generic.prototype.defaults)
});
joint.shapes.basic.Rhombus = joint.shapes.basic.Path.extend({
    defaults: joint.util.deepSupplement({
        type: "basic.Rhombus",
        attrs: {
            path: {
                d: "M 30 0 L 60 30 30 60 0 30 z"
            },
            text: {
                "ref-y": .5
            }
        }
    }, joint.shapes.basic.Path.prototype.defaults)
});
joint.shapes.basic.PortsModelInterface = {
    initialize: function() {
        this.updatePortsAttrs();
        this.on("change:inPorts change:outPorts", this.updatePortsAttrs, this);
        this.constructor.__super__.constructor.__super__.initialize.apply(this, arguments)
    },
    updatePortsAttrs: function(eventName) {
        var currAttrs = this.get("attrs");
        _.each(this._portSelectors, function(selector) {
            if (currAttrs[selector])
                delete currAttrs[selector]
        });
        this._portSelectors = [];
        var attrs = {};
        _.each(this.get("inPorts"), function(portName, index, ports) {
            var portAttributes = this.getPortAttrs(portName, index, ports.length, ".inPorts", "in");
            this._portSelectors = this._portSelectors.concat(_.keys(portAttributes));
            _.extend(attrs, portAttributes)
        }, this);
        _.each(this.get("outPorts"), function(portName, index, ports) {
            var portAttributes = this.getPortAttrs(portName, index, ports.length, ".outPorts", "out");
            this._portSelectors = this._portSelectors.concat(_.keys(portAttributes));
            _.extend(attrs, portAttributes)
        }, this);
        this.attr(attrs, {
            silent: true
        });
        this.processPorts();
        this.trigger("process:ports")
    },
    getPortSelector: function(name) {
        var selector = ".inPorts";
        var index = this.get("inPorts").indexOf(name);
        if (index < 0) {
            selector = ".outPorts";
            index = this.get("outPorts").indexOf(name);
            if (index < 0)
                throw new Error("getPortSelector(): Port doesn't exist.")
        }
        return selector + ">g:nth-child(" + (index + 1) + ")>circle"
    }
};
joint.shapes.basic.PortsViewInterface = {
    initialize: function() {
        this.listenTo(this.model, "process:ports", this.update);
        joint.dia.ElementView.prototype.initialize.apply(this, arguments)
    },
    update: function() {
        this.renderPorts();
        joint.dia.ElementView.prototype.update.apply(this, arguments)
    },
    renderPorts: function() {
        var $inPorts = this.$(".inPorts").empty();
        var $outPorts = this.$(".outPorts").empty();
        var portTemplate = _.template(this.model.portMarkup);
        _.each(_.filter(this.model.ports, function(p) {
            return p.type === "in"
        }), function(port, index) {
            $inPorts.append(V(portTemplate({
                id: index,
                port: port
            })).node)
        });
        _.each(_.filter(this.model.ports, function(p) {
            return p.type === "out"
        }), function(port, index) {
            $outPorts.append(V(portTemplate({
                id: index,
                port: port
            })).node)
        })
    }
};
joint.shapes.basic.TextBlock = joint.shapes.basic.Generic.extend({
    markup: ['<g class="rotatable"><g class="scalable"><rect/></g><switch>', '<foreignObject requiredFeatures="http://www.w3.org/TR/SVG11/feature#Extensibility" class="fobj">', '<body xmlns="http://www.w3.org/1999/xhtml"><div/></body>', "</foreignObject>", '<text class="content"/>', "</switch></g>"].join(""),
    defaults: joint.util.deepSupplement({
        type: "basic.TextBlock",
        attrs: {
            rect: {
                fill: "#ffffff",
                stroke: "#000000",
                width: 80,
                height: 100
            },
            text: {
                fill: "#000000",
                "font-size": 14,
                "font-family": "Arial, helvetica, sans-serif"
            },
            ".content": {
                text: "",
                ref: "rect",
                "ref-x": .5,
                "ref-y": .5,
                "y-alignment": "middle",
                "x-alignment": "middle"
            }
        },
        content: ""
    }, joint.shapes.basic.Generic.prototype.defaults),
    initialize: function() {
        if (typeof SVGForeignObjectElement !== "undefined") {
            this.setForeignObjectSize(this, this.get("size"));
            this.setDivContent(this, this.get("content"));
            this.listenTo(this, "change:size", this.setForeignObjectSize);
            this.listenTo(this, "change:content", this.setDivContent)
        }
        joint.shapes.basic.Generic.prototype.initialize.apply(this, arguments)
    },
    setForeignObjectSize: function(cell, size) {
        cell.attr({
            ".fobj": _.clone(size),
            div: {
                style: _.clone(size)
            }
        })
    },
    setDivContent: function(cell, content) {
        cell.attr({
            div: {
                html: content
            }
        })
    }
});
joint.shapes.basic.TextBlockView = joint.dia.ElementView.extend({
    initialize: function() {
        joint.dia.ElementView.prototype.initialize.apply(this, arguments);
        if (typeof SVGForeignObjectElement === "undefined") {
            this.noSVGForeignObjectElement = true;
            this.listenTo(this.model, "change:content", function(cell) {
                this.updateContent(cell)
            })
        }
    },
    update: function(cell, renderingOnlyAttrs) {
        if (this.noSVGForeignObjectElement) {
            var model = this.model;
            var noTextAttrs = _.omit(renderingOnlyAttrs || model.get("attrs"), ".content");
            joint.dia.ElementView.prototype.update.call(this, model, noTextAttrs);
            if (!renderingOnlyAttrs || _.has(renderingOnlyAttrs, ".content")) {
                this.updateContent(model, renderingOnlyAttrs)
            }
        } else {
            joint.dia.ElementView.prototype.update.call(this, model, renderingOnlyAttrs)
        }
    },
    updateContent: function(cell, renderingOnlyAttrs) {
        var textAttrs = _.merge({}, (renderingOnlyAttrs || cell.get("attrs"))[".content"]);
        delete textAttrs.text;
        var text = joint.util.breakText(cell.get("content"), cell.get("size"), textAttrs, {
            svgDocument: this.paper.svg
        });
        var attrs = joint.util.setByPath({}, ".content", textAttrs, "/");
        attrs[".content"].text = text;
        joint.dia.ElementView.prototype.update.call(this, cell, attrs)
    }
});
if (typeof exports === "object") {
    module.exports = joint.shapes.basic
}
joint.routers.orthogonal = function() {
    var sourceBBox, targetBBox;
    function direction(p1, p2) {
        if (p1.y < p2.y && p1.x === p2.x) {
            return "down"
        } else if (p1.y > p2.y && p1.x === p2.x) {
            return "up"
        } else if (p1.x < p2.x && p1.y === p2.y) {
            return "right"
        }
        return "left"
    }
    function bestDirection(p1, p2, preferredDirection) {
        var directions;
        if (p1.x < p2.x) {
            if (p1.y > p2.y) {
                directions = ["up", "right"]
            } else if (p1.y < p2.y) {
                directions = ["down", "right"]
            } else {
                directions = ["right"]
            }
        } else if (p1.x > p2.x) {
            if (p1.y > p2.y) {
                directions = ["up", "left"]
            } else if (p1.y < p2.y) {
                directions = ["down", "left"]
            } else {
                directions = ["left"]
            }
        } else {
            if (p1.y > p2.y) {
                directions = ["up"]
            } else {
                directions = ["down"]
            }
        }
        if (_.contains(directions, preferredDirection)) {
            return preferredDirection
        }
        var direction = _.first(directions);
        switch (preferredDirection) {
        case"down":
            if (direction === "up")
                return _.last(directions);
            break;
        case"up":
            if (direction === "down")
                return _.last(directions);
            break;
        case"left":
            if (direction === "right")
                return _.last(directions);
            break;
        case"right":
            if (direction === "left")
                return _.last(directions);
            break
        }
        return direction
    }
    function findMiddleVertex(p1, p2, preferredDirection) {
        var direction = bestDirection(p1, p2, preferredDirection);
        if (direction === "down" || direction === "up") {
            return {
                x: p1.x,
                y: p2.y,
                d: direction
            }
        }
        return {
            x: p2.x,
            y: p1.y,
            d: direction
        }
    }
    function findOrthogonalRoute(vertices) {
        vertices = (vertices || []).slice();
        var orthogonalVertices = [];
        var sourceCenter = sourceBBox.center();
        var targetCenter = targetBBox.center();
        if (!vertices.length) {
            if (Math.abs(sourceCenter.x - targetCenter.x) < sourceBBox.width / 2 || Math.abs(sourceCenter.y - targetCenter.y) < sourceBBox.height / 2) {
                vertices = [{
                    x: Math.min(sourceCenter.x, targetCenter.x) + Math.abs(sourceCenter.x - targetCenter.x) / 2,
                    y: Math.min(sourceCenter.y, targetCenter.y) + Math.abs(sourceCenter.y - targetCenter.y) / 2
                }
                ]
            }
        }
        vertices.unshift(sourceCenter);
        vertices.push(targetCenter);
        var orthogonalVertex;
        var lastOrthogonalVertex;
        var vertex;
        var nextVertex;
        for (var i = 0; i < vertices.length - 1; i++) {
            vertex = vertices[i];
            nextVertex = vertices[i + 1];
            lastOrthogonalVertex = _.last(orthogonalVertices);
            if (i > 0) {
                orthogonalVertex = vertex;
                orthogonalVertex.d = lastOrthogonalVertex ? direction(lastOrthogonalVertex, vertex) : "top";
                orthogonalVertices.push(orthogonalVertex);
                lastOrthogonalVertex = orthogonalVertex
            }
            var d = lastOrthogonalVertex && lastOrthogonalVertex.d;
            orthogonalVertex = findMiddleVertex(vertex, nextVertex, d);
            if (!g.point(orthogonalVertex).equals(g.point(vertex))&&!g.point(orthogonalVertex).equals(g.point(nextVertex))) {
                orthogonalVertices.push(orthogonalVertex)
            }
        }
        return orthogonalVertices
    }
    return function(vertices) {
        sourceBBox = this.sourceBBox;
        targetBBox = this.targetBBox;
        return findOrthogonalRoute(vertices)
    }
}();
joint.routers.manhattan = function() {
    "use strict";
    var config = {
        step: 10,
        perpendicular: true,
        mapGridSize: 100,
        excludeEnds: [],
        excludeTypes: ["basic.Text"],
        maximumLoops: 500,
        startDirections: ["left", "right", "top", "bottom"],
        endDirections: ["left", "right", "top", "bottom"],
        directionMap: {
            right: {
                x: 1,
                y: 0
            },
            bottom: {
                x: 0,
                y: 1
            },
            left: {
                x: - 1,
                y: 0
            },
            top: {
                x: 0,
                y: - 1
            }
        },
        maxAllowedDirectionChange: 1,
        paddingBox: function() {
            var step = this.step;
            return {
                x: - step,
                y: - step,
                width: 2 * step,
                height: 2 * step
            }
        },
        directions: function() {
            var step = this.step;
            return [{
                offsetX: step,
                offsetY: 0,
                cost: step
            }, {
                offsetX: 0,
                offsetY: step,
                cost: step
            }, {
                offsetX: - step,
                offsetY: 0,
                cost: step
            }, {
                offsetX: 0,
                offsetY: - step,
                cost: step
            }
            ]
        },
        penalties: function() {
            return [0, this.step / 2, this.step]
        },
        estimateCost: function(from, to) {
            return from.manhattanDistance(to)
        },
        fallbackRoute: function(from, to, opts) {
            var prevDirIndexes = opts.prevDirIndexes || {};
            var point = (prevDirIndexes[from] || 0)%2 ? g.point(from.x, to.y): g.point(to.x, from.y);
            return [point, to]
        },
        draggingRoute: null
    };
    function reconstructRoute(parents, point) {
        var route = [];
        var prevDiff = {
            x: 0,
            y: 0
        };
        var current = point;
        var parent;
        while (parent = parents[current]) {
            var diff = parent.difference(current);
            if (!diff.equals(prevDiff)) {
                route.unshift(current);
                prevDiff = diff
            }
            current = parent
        }
        route.unshift(current);
        return route
    }
    function getRectPoints(bbox, directionList, opts) {
        var step = opts.step;
        var center = bbox.center();
        var startPoints = _.chain(opts.directionMap).pick(directionList).map(function(direction) {
            var x = direction.x * bbox.width / 2;
            var y = direction.y * bbox.height / 2;
            var point = g.point(center).offset(x, y).snapToGrid(step);
            if (bbox.containsPoint(point)) {
                point.offset(direction.x * step, direction.y * step)
            }
            return point
        }).value();
        return startPoints
    }
    function getDirection(start, end, dirLen) {
        var dirAngle = 360 / dirLen;
        var q = Math.floor(start.theta(end) / dirAngle);
        return dirLen - q
    }
    function findRoute(start, end, map, opt) {
        var startDirections = opt.reversed ? opt.endDirections: opt.startDirections;
        var endDirections = opt.reversed ? opt.startDirections: opt.endDirections;
        var startSet = start instanceof g.rect ? getRectPoints(start, startDirections, opt): [start];
        var endSet = end instanceof g.rect ? getRectPoints(end, endDirections, opt): [end];
        var startCenter = startSet.length > 1 ? start.center(): startSet[0];
        var endCenter = endSet.length > 1 ? end.center(): endSet[0];
        var endPoints = _.filter(endSet, function(point) {
            var mapKey = g.point(point).snapToGrid(opt.mapGridSize).toString();
            var accesible = _.every(map[mapKey], function(obstacle) {
                return !obstacle.containsPoint(point)
            });
            return accesible
        });
        if (endPoints.length) {
            var step = opt.step;
            var penalties = opt.penalties;
            var endPoint = _.chain(endPoints).invoke("snapToGrid", step).min(function(point) {
                return opt.estimateCost(startCenter, point)
            }).value();
            var parents = {};
            var costFromStart = {};
            var totalCost = {};
            var dirs = opt.directions;
            var dirLen = dirs.length;
            var dirHalfLen = dirLen / 2;
            var dirIndexes = opt.previousDirIndexes || {};
            var closeHash = {};
            var openHash = {};
            var openSet = _.chain(startSet).invoke("snapToGrid", step).each(function(point) {
                var key = point.toString();
                costFromStart[key] = 0;
                totalCost[key] = opt.estimateCost(point, endPoint);
                dirIndexes[key] = dirIndexes[key] || getDirection(startCenter, point, dirLen);
                openHash[key] = true
            }).map(function(point) {
                return point.toString()
            }).sortBy(function(pointKey) {
                return totalCost[pointKey]
            }).value();
            var loopCounter = opt.maximumLoops;
            var maxAllowedDirectionChange = opt.maxAllowedDirectionChange;
            while (openSet.length && loopCounter--) {
                var currentKey = openSet[0];
                var currentPoint = g.point(currentKey);
                if (endPoint.equals(currentPoint)) {
                    opt.previousDirIndexes = _.pick(dirIndexes, currentKey);
                    return reconstructRoute(parents, currentPoint)
                }
                openSet.splice(0, 1);
                openHash[neighborKey] = null;
                closeHash[neighborKey] = true;
                var currentDirIndex = dirIndexes[currentKey];
                var currentDist = costFromStart[currentKey];
                for (var dirIndex = 0; dirIndex < dirLen; dirIndex++) {
                    var dirChange = Math.abs(dirIndex - currentDirIndex);
                    if (dirChange > dirHalfLen) {
                        dirChange = dirLen - dirChange
                    }
                    if (dirChange > maxAllowedDirectionChange) {
                        continue
                    }
                    var dir = dirs[dirIndex];
                    var neighborPoint = g.point(currentPoint).offset(dir.offsetX, dir.offsetY);
                    var neighborKey = neighborPoint.toString();
                    if (closeHash[neighborKey]) {
                        continue
                    }
                    var mapKey = g.point(neighborPoint).snapToGrid(opt.mapGridSize).toString();
                    var isAccesible = _.every(map[mapKey], function(obstacle) {
                        return !obstacle.containsPoint(neighborPoint)
                    });
                    if (!isAccesible) {
                        continue
                    }
                    var inOpenSet = _.has(openHash, neighborKey);
                    var costToNeighbor = currentDist + dir.cost;
                    if (!inOpenSet || costToNeighbor < costFromStart[neighborKey]) {
                        parents[neighborKey] = currentPoint;
                        dirIndexes[neighborKey] = dirIndex;
                        costFromStart[neighborKey] = costToNeighbor;
                        totalCost[neighborKey] = costToNeighbor + opt.estimateCost(neighborPoint, endPoint) + penalties[dirChange];
                        if (!inOpenSet) {
                            var openIndex = _.sortedIndex(openSet, neighborKey, function(openKey) {
                                return totalCost[openKey]
                            });
                            openSet.splice(openIndex, 0, neighborKey);
                            openHash[neighborKey] = true
                        }
                    }
                }
            }
        }
        return opt.fallbackRoute(startCenter, endCenter, opt)
    }
    function router(oldVertices, opt) {
        opt.directions = _.result(opt, "directions");
        opt.penalties = _.result(opt, "penalties");
        opt.paddingBox = _.result(opt, "paddingBox");
        this.options.perpendicular=!!opt.perpendicular;
        var reverseRouting = opt.reversed = this.lastEndChange === "source";
        var sourceBBox = reverseRouting ? g.rect(this.targetBBox): g.rect(this.sourceBBox);
        var targetBBox = reverseRouting ? g.rect(this.sourceBBox): g.rect(this.targetBBox);
        sourceBBox.moveAndExpand(opt.paddingBox);
        targetBBox.moveAndExpand(opt.paddingBox);
        var link = this.model;
        var graph = this.paper.model;
        var excludedEnds = _.chain(opt.excludeEnds).map(link.get, link).pluck("id").map(graph.getCell, graph).value();
        var mapGridSize = opt.mapGridSize;
        var map = _.chain(graph.getElements()).difference(excludedEnds).reject(function(element) {
            return _.contains(opt.excludeTypes, element.get("type"))
        }).invoke("getBBox").invoke("moveAndExpand", opt.paddingBox).foldl(function(res, bbox) {
            var origin = bbox.origin().snapToGrid(mapGridSize);
            var corner = bbox.corner().snapToGrid(mapGridSize);
            for (var x = origin.x; x <= corner.x; x += mapGridSize) {
                for (var y = origin.y; y <= corner.y; y += mapGridSize) {
                    var gridKey = x + "@" + y;
                    res[gridKey] = res[gridKey] || [];
                    res[gridKey].push(bbox)
                }
            }
            return res
        }, {}).value();
        var newVertices = [];
        var points = _.map(oldVertices, g.point);
        var tailPoint = sourceBBox.center();
        for (var i = 0, len = points.length; i <= len; i++) {
            var partialRoute = null;
            var from = to || sourceBBox;
            var to = points[i];
            if (!to) {
                to = targetBBox;
                var endingAtPoint=!this.model.get("source").id ||!this.model.get("target").id;
                if (endingAtPoint && _.isFunction(opt.draggingRoute)) {
                    var dragFrom = from instanceof g.rect ? from.center(): from;
                    partialRoute = opt.draggingRoute(dragFrom, to.origin(), opt)
                }
            }
            partialRoute = partialRoute || findRoute(from, to, map, opt);
            var leadPoint = _.first(partialRoute);
            if (leadPoint && leadPoint.equals(tailPoint)) {
                partialRoute.shift()
            }
            tailPoint = _.last(partialRoute) || tailPoint;
            newVertices = newVertices.concat(partialRoute)
        }
        return reverseRouting ? newVertices.reverse() : newVertices
    }
    return function(vertices, opt, linkView) {
        return router.call(linkView, vertices, _.extend({}, config, opt))
    }
}();
joint.routers.metro = function() {
    if (!_.isFunction(joint.routers.manhattan)) {
        throw "Metro requires the manhattan router."
    }
    var config = {
        diagonalCost: null,
        directions: function() {
            var step = this.step;
            var diagonalCost = this.diagonalCost || Math.ceil(Math.sqrt(step * step<<1));
            return [{
                offsetX: step,
                offsetY: 0,
                cost: step
            }, {
                offsetX: step,
                offsetY: step,
                cost: diagonalCost
            }, {
                offsetX: 0,
                offsetY: step,
                cost: step
            }, {
                offsetX: - step,
                offsetY: step,
                cost: diagonalCost
            }, {
                offsetX: - step,
                offsetY: 0,
                cost: step
            }, {
                offsetX: - step,
                offsetY: - step,
                cost: diagonalCost
            }, {
                offsetX: 0,
                offsetY: - step,
                cost: step
            }, {
                offsetX: step,
                offsetY: - step,
                cost: diagonalCost
            }
            ]
        },
        fallbackRoute: function(from, to, opts) {
            var theta = from.theta(to);
            var a = {
                x: to.x,
                y: from.y
            };
            var b = {
                x: from.x,
                y: to.y
            };
            if (theta%180 > 90) {
                var t = a;
                a = b;
                b = t
            }
            var p1 = theta%90 < 45 ? a: b;
            var l1 = g.line(from, p1);
            var alpha = 90 * Math.ceil(theta / 90);
            var p2 = g.point.fromPolar(l1.squaredLength(), g.toRad(alpha + 135), p1);
            var l2 = g.line(to, p2);
            var point = l1.intersection(l2);
            return point ? [point.round(), to] : [to]
        }
    };
    return function(vertices, opts, linkView) {
        return joint.routers.manhattan(vertices, _.extend({}, config, opts), linkView)
    }
}();
joint.connectors.normal = function(sourcePoint, targetPoint, vertices) {
    var d = ["M", sourcePoint.x, sourcePoint.y];
    _.each(vertices, function(vertex) {
        d.push(vertex.x, vertex.y)
    });
    d.push(targetPoint.x, targetPoint.y);
    return d.join(" ")
};
joint.connectors.rounded = function(sourcePoint, targetPoint, vertices, opts) {
    var offset = opts.radius || 10;
    var c1, c2, d1, d2, prev, next;
    var d = ["M", sourcePoint.x, sourcePoint.y];
    _.each(vertices, function(vertex, index) {
        prev = vertices[index - 1] || sourcePoint;
        next = vertices[index + 1] || targetPoint;
        d1 = d2 || g.point(vertex).distance(prev) / 2;
        d2 = g.point(vertex).distance(next) / 2;
        c1 = g.point(vertex).move(prev, - Math.min(offset, d1)).round();
        c2 = g.point(vertex).move(next, - Math.min(offset, d2)).round();
        d.push(c1.x, c1.y, "S", vertex.x, vertex.y, c2.x, c2.y, "L")
    });
    d.push(targetPoint.x, targetPoint.y);
    return d.join(" ")
};
joint.connectors.smooth = function(sourcePoint, targetPoint, vertices) {
    var d;
    if (vertices.length) {
        d = g.bezier.curveThroughPoints([sourcePoint].concat(vertices).concat([targetPoint]))
    } else {
        var controlPointX = sourcePoint.x < targetPoint.x ? targetPoint.x - (targetPoint.x - sourcePoint.x) / 2: sourcePoint.x - (sourcePoint.x - targetPoint.x) / 2;
        d = ["M", sourcePoint.x, sourcePoint.y, "C", controlPointX, sourcePoint.y, controlPointX, targetPoint.y, targetPoint.x, targetPoint.y]
    }
    return d.join(" ")
};
(function e(t, n, r) {
    function s(o, u) {
        if (!n[o]) {
            if (!t[o]) {
                var a = typeof require == "function" && require;
                if (!u && a)
                    return a(o, !0);
                if (i)
                    return i(o, !0);
                throw new Error("Cannot find module '" + o + "'")
            }
            var f = n[o] = {
                exports: {}
            };
            t[o][0].call(f.exports, function(e) {
                var n = t[o][1][e];
                return s(n ? n : e)
            }, f, f.exports, e, t, n, r)
        }
        return n[o].exports
    }
    var i = typeof require == "function" && require;
    for (var o = 0; o < r.length; o++)
        s(r[o]);
    return s
})({
    1: [function(require, module, exports) {
        var global = typeof self !== "undefined" ? self: typeof window !== "undefined" ? window: {};
        global.dagre = require("./index")
    }, {
        "./index": 2
    }
    ],
    2: [function(require, module, exports) {
        exports.Digraph = require("graphlib").Digraph;
        exports.Graph = require("graphlib").Graph;
        exports.layout = require("./lib/layout");
        exports.version = require("./lib/version")
    }, {
        "./lib/layout": 3,
        "./lib/version": 18,
        graphlib: 24
    }
    ],
    3: [function(require, module, exports) {
        var util = require("./util"), rank = require("./rank"), order = require("./order"), CGraph = require("graphlib").CGraph, CDigraph = require("graphlib").CDigraph;
        module.exports = function() {
            var config = {
                debugLevel: 0,
                orderMaxSweeps: order.DEFAULT_MAX_SWEEPS,
                rankSimplex: false,
                rankDir: "TB"
            };
            var position = require("./position")();
            var self = {};
            self.orderIters = util.propertyAccessor(self, config, "orderMaxSweeps");
            self.rankSimplex = util.propertyAccessor(self, config, "rankSimplex");
            self.nodeSep = delegateProperty(position.nodeSep);
            self.edgeSep = delegateProperty(position.edgeSep);
            self.universalSep = delegateProperty(position.universalSep);
            self.rankSep = delegateProperty(position.rankSep);
            self.rankDir = util.propertyAccessor(self, config, "rankDir");
            self.debugAlignment = delegateProperty(position.debugAlignment);
            self.debugLevel = util.propertyAccessor(self, config, "debugLevel", function(x) {
                util.log.level = x;
                position.debugLevel(x)
            });
            self.run = util.time("Total layout", run);
            self._normalize = normalize;
            return self;
            function initLayoutGraph(inputGraph) {
                var g = new CDigraph;
                inputGraph.eachNode(function(u, value) {
                    if (value === undefined)
                        value = {};
                    g.addNode(u, {
                        width: value.width,
                        height: value.height
                    });
                    if (value.hasOwnProperty("rank")) {
                        g.node(u).prefRank = value.rank
                    }
                });
                if (inputGraph.parent) {
                    inputGraph.nodes().forEach(function(u) {
                        g.parent(u, inputGraph.parent(u))
                    })
                }
                inputGraph.eachEdge(function(e, u, v, value) {
                    if (value === undefined)
                        value = {};
                    var newValue = {
                        e: e,
                        minLen: value.minLen || 1,
                        width: value.width || 0,
                        height: value.height || 0,
                        points: []
                    };
                    g.addEdge(null, u, v, newValue)
                });
                var graphValue = inputGraph.graph() || {};
                g.graph({
                    rankDir: graphValue.rankDir || config.rankDir,
                    orderRestarts: graphValue.orderRestarts
                });
                return g
            }
            function run(inputGraph) {
                var rankSep = self.rankSep();
                var g;
                try {
                    g = util.time("initLayoutGraph", initLayoutGraph)(inputGraph);
                    if (g.order() === 0) {
                        return g
                    }
                    g.eachEdge(function(e, s, t, a) {
                        a.minLen*=2
                    });
                    self.rankSep(rankSep / 2);
                    util.time("rank.run", rank.run)(g, config.rankSimplex);
                    util.time("normalize", normalize)(g);
                    util.time("order", order)(g, config.orderMaxSweeps);
                    util.time("position", position.run)(g);
                    util.time("undoNormalize", undoNormalize)(g);
                    util.time("fixupEdgePoints", fixupEdgePoints)(g);
                    util.time("rank.restoreEdges", rank.restoreEdges)(g);
                    return util.time("createFinalGraph", createFinalGraph)(g, inputGraph.isDirected())
                } finally {
                    self.rankSep(rankSep)
                }
            }
            function normalize(g) {
                var dummyCount = 0;
                g.eachEdge(function(e, s, t, a) {
                    var sourceRank = g.node(s).rank;
                    var targetRank = g.node(t).rank;
                    if (sourceRank + 1 < targetRank) {
                        for (var u = s, rank = sourceRank + 1, i = 0; rank < targetRank; ++rank, ++i) {
                            var v = "_D" + ++dummyCount;
                            var node = {
                                width: a.width,
                                height: a.height,
                                edge: {
                                    id: e,
                                    source: s,
                                    target: t,
                                    attrs: a
                                },
                                rank: rank,
                                dummy: true
                            };
                            if (i === 0)
                                node.index = 0;
                            else if (rank + 1 === targetRank)
                                node.index = 1;
                            g.addNode(v, node);
                            g.addEdge(null, u, v, {});
                            u = v
                        }
                        g.addEdge(null, u, t, {});
                        g.delEdge(e)
                    }
                })
            }
            function undoNormalize(g) {
                g.eachNode(function(u, a) {
                    if (a.dummy) {
                        if ("index"in a) {
                            var edge = a.edge;
                            if (!g.hasEdge(edge.id)) {
                                g.addEdge(edge.id, edge.source, edge.target, edge.attrs)
                            }
                            var points = g.edge(edge.id).points;
                            points[a.index] = {
                                x: a.x,
                                y: a.y,
                                ul: a.ul,
                                ur: a.ur,
                                dl: a.dl,
                                dr: a.dr
                            }
                        }
                        g.delNode(u)
                    }
                })
            }
            function fixupEdgePoints(g) {
                g.eachEdge(function(e, s, t, a) {
                    if (a.reversed)
                        a.points.reverse()
                })
            }
            function createFinalGraph(g, isDirected) {
                var out = isDirected ? new CDigraph: new CGraph;
                out.graph(g.graph());
                g.eachNode(function(u, value) {
                    out.addNode(u, value)
                });
                g.eachNode(function(u) {
                    out.parent(u, g.parent(u))
                });
                g.eachEdge(function(e, u, v, value) {
                    out.addEdge(value.e, u, v, value)
                });
                var maxX = 0, maxY = 0;
                g.eachNode(function(u, value) {
                    if (!g.children(u).length) {
                        maxX = Math.max(maxX, value.x + value.width / 2);
                        maxY = Math.max(maxY, value.y + value.height / 2)
                    }
                });
                g.eachEdge(function(e, u, v, value) {
                    var maxXPoints = Math.max.apply(Math, value.points.map(function(p) {
                        return p.x
                    }));
                    var maxYPoints = Math.max.apply(Math, value.points.map(function(p) {
                        return p.y
                    }));
                    maxX = Math.max(maxX, maxXPoints + value.width / 2);
                    maxY = Math.max(maxY, maxYPoints + value.height / 2)
                });
                out.graph().width = maxX;
                out.graph().height = maxY;
                return out
            }
            function delegateProperty(f) {
                return function() {
                    if (!arguments.length)
                        return f();
                    f.apply(null, arguments);
                    return self
                }
            }
        }
    }, {
        "./order": 4,
        "./position": 9,
        "./rank": 10,
        "./util": 17,
        graphlib: 24
    }
    ],
    4: [function(require, module, exports) {
        var util = require("./util"), crossCount = require("./order/crossCount"), initLayerGraphs = require("./order/initLayerGraphs"), initOrder = require("./order/initOrder"), sortLayer = require("./order/sortLayer");
        module.exports = order;
        var DEFAULT_MAX_SWEEPS = 24;
        order.DEFAULT_MAX_SWEEPS = DEFAULT_MAX_SWEEPS;
        function order(g, maxSweeps) {
            if (arguments.length < 2) {
                maxSweeps = DEFAULT_MAX_SWEEPS
            }
            var restarts = g.graph().orderRestarts || 0;
            var layerGraphs = initLayerGraphs(g);
            layerGraphs.forEach(function(lg) {
                lg = lg.filterNodes(function(u) {
                    return !g.children(u).length
                })
            });
            var iters = 0, currentBestCC, allTimeBestCC = Number.MAX_VALUE, allTimeBest = {};
            function saveAllTimeBest() {
                g.eachNode(function(u, value) {
                    allTimeBest[u] = value.order
                })
            }
            for (var j = 0; j < Number(restarts) + 1 && allTimeBestCC !== 0; ++j) {
                currentBestCC = Number.MAX_VALUE;
                initOrder(g, restarts > 0);
                util.log(2, "Order phase start cross count: " + g.graph().orderInitCC);
                var i, lastBest, cc;
                for (i = 0, lastBest = 0; lastBest < 4 && i < maxSweeps && currentBestCC > 0; ++i, ++lastBest, ++iters) {
                    sweep(g, layerGraphs, i);
                    cc = crossCount(g);
                    if (cc < currentBestCC) {
                        lastBest = 0;
                        currentBestCC = cc;
                        if (cc < allTimeBestCC) {
                            saveAllTimeBest();
                            allTimeBestCC = cc
                        }
                    }
                    util.log(3, "Order phase start " + j + " iter " + i + " cross count: " + cc)
                }
            }
            Object.keys(allTimeBest).forEach(function(u) {
                if (!g.children ||!g.children(u).length) {
                    g.node(u).order = allTimeBest[u]
                }
            });
            g.graph().orderCC = allTimeBestCC;
            util.log(2, "Order iterations: " + iters);
            util.log(2, "Order phase best cross count: " + g.graph().orderCC)
        }
        function predecessorWeights(g, nodes) {
            var weights = {};
            nodes.forEach(function(u) {
                weights[u] = g.inEdges(u).map(function(e) {
                    return g.node(g.source(e)).order
                })
            });
            return weights
        }
        function successorWeights(g, nodes) {
            var weights = {};
            nodes.forEach(function(u) {
                weights[u] = g.outEdges(u).map(function(e) {
                    return g.node(g.target(e)).order
                })
            });
            return weights
        }
        function sweep(g, layerGraphs, iter) {
            if (iter%2 === 0) {
                sweepDown(g, layerGraphs, iter)
            } else {
                sweepUp(g, layerGraphs, iter)
            }
        }
        function sweepDown(g, layerGraphs) {
            var cg;
            for (i = 1; i < layerGraphs.length; ++i) {
                cg = sortLayer(layerGraphs[i], cg, predecessorWeights(g, layerGraphs[i].nodes()))
            }
        }
        function sweepUp(g, layerGraphs) {
            var cg;
            for (i = layerGraphs.length - 2; i >= 0; --i) {
                sortLayer(layerGraphs[i], cg, successorWeights(g, layerGraphs[i].nodes()))
            }
        }
    }, {
        "./order/crossCount": 5,
        "./order/initLayerGraphs": 6,
        "./order/initOrder": 7,
        "./order/sortLayer": 8,
        "./util": 17
    }
    ],
    5: [function(require, module, exports) {
        var util = require("../util");
        module.exports = crossCount;
        function crossCount(g) {
            var cc = 0;
            var ordering = util.ordering(g);
            for (var i = 1; i < ordering.length; ++i) {
                cc += twoLayerCrossCount(g, ordering[i - 1], ordering[i])
            }
            return cc
        }
        function twoLayerCrossCount(g, layer1, layer2) {
            var indices = [];
            layer1.forEach(function(u) {
                var nodeIndices = [];
                g.outEdges(u).forEach(function(e) {
                    nodeIndices.push(g.node(g.target(e)).order)
                });
                nodeIndices.sort(function(x, y) {
                    return x - y
                });
                indices = indices.concat(nodeIndices)
            });
            var firstIndex = 1;
            while (firstIndex < layer2.length)
                firstIndex<<=1;
            var treeSize = 2 * firstIndex - 1;
            firstIndex -= 1;
            var tree = [];
            for (var i = 0; i < treeSize; ++i) {
                tree[i] = 0
            }
            var cc = 0;
            indices.forEach(function(i) {
                var treeIndex = i + firstIndex;
                ++tree[treeIndex];
                while (treeIndex > 0) {
                    if (treeIndex%2) {
                        cc += tree[treeIndex + 1]
                    }
                    treeIndex = treeIndex - 1>>1;
                    ++tree[treeIndex]
                }
            });
            return cc
        }
    }, {
        "../util": 17
    }
    ],
    6: [function(require, module, exports) {
        var nodesFromList = require("graphlib").filter.nodesFromList, Set = require("cp-data").Set;
        module.exports = initLayerGraphs;
        function initLayerGraphs(g) {
            var ranks = [];
            function dfs(u) {
                if (u === null) {
                    g.children(u).forEach(function(v) {
                        dfs(v)
                    });
                    return 
                }
                var value = g.node(u);
                value.minRank = "rank"in value ? value.rank : Number.MAX_VALUE;
                value.maxRank = "rank"in value ? value.rank : Number.MIN_VALUE;
                var uRanks = new Set;
                g.children(u).forEach(function(v) {
                    var rs = dfs(v);
                    uRanks = Set.union([uRanks, rs]);
                    value.minRank = Math.min(value.minRank, g.node(v).minRank);
                    value.maxRank = Math.max(value.maxRank, g.node(v).maxRank)
                });
                if ("rank"in value)
                    uRanks.add(value.rank);
                uRanks.keys().forEach(function(r) {
                    if (!(r in ranks))
                        ranks[r] = [];
                    ranks[r].push(u)
                });
                return uRanks
            }
            dfs(null);
            var layerGraphs = [];
            ranks.forEach(function(us, rank) {
                layerGraphs[rank] = g.filterNodes(nodesFromList(us))
            });
            return layerGraphs
        }
    }, {
        "cp-data": 19,
        graphlib: 24
    }
    ],
    7: [function(require, module, exports) {
        var crossCount = require("./crossCount"), util = require("../util");
        module.exports = initOrder;
        function initOrder(g, random) {
            var layers = [];
            g.eachNode(function(u, value) {
                var layer = layers[value.rank];
                if (g.children && g.children(u).length > 0)
                    return;
                if (!layer) {
                    layer = layers[value.rank] = []
                }
                layer.push(u)
            });
            layers.forEach(function(layer) {
                if (random) {
                    util.shuffle(layer)
                }
                layer.forEach(function(u, i) {
                    g.node(u).order = i
                })
            });
            var cc = crossCount(g);
            g.graph().orderInitCC = cc;
            g.graph().orderCC = Number.MAX_VALUE
        }
    }, {
        "../util": 17,
        "./crossCount": 5
    }
    ],
    8: [function(require, module, exports) {
        var util = require("../util");
        module.exports = sortLayer;
        function sortLayer(g, cg, weights) {
            var ordering = [];
            var bs = {};
            g.eachNode(function(u, value) {
                ordering[value.order] = u;
                var ws = weights[u];
                if (ws.length) {
                    bs[u] = util.sum(ws) / ws.length
                }
            });
            var toSort = g.nodes().filter(function(u) {
                return bs[u] !== undefined
            });
            toSort.sort(function(x, y) {
                return bs[x] - bs[y] || g.node(x).order - g.node(y).order
            });
            for (var i = 0, j = 0, jl = toSort.length; j < jl; ++i) {
                if (bs[ordering[i]] !== undefined) {
                    g.node(toSort[j++]).order = i
                }
            }
        }
    }, {
        "../util": 17
    }
    ],
    9: [function(require, module, exports) {
        var util = require("./util");
        module.exports = function() {
            var config = {
                nodeSep: 50,
                edgeSep: 10,
                universalSep: null,
                rankSep: 30
            };
            var self = {};
            self.nodeSep = util.propertyAccessor(self, config, "nodeSep");
            self.edgeSep = util.propertyAccessor(self, config, "edgeSep");
            self.universalSep = util.propertyAccessor(self, config, "universalSep");
            self.rankSep = util.propertyAccessor(self, config, "rankSep");
            self.debugLevel = util.propertyAccessor(self, config, "debugLevel");
            self.run = run;
            return self;
            function run(g) {
                g = g.filterNodes(util.filterNonSubgraphs(g));
                var layering = util.ordering(g);
                var conflicts = findConflicts(g, layering);
                var xss = {};
                ["u", "d"].forEach(function(vertDir) {
                    if (vertDir === "d")
                        layering.reverse();
                    ["l", "r"].forEach(function(horizDir) {
                        if (horizDir === "r")
                            reverseInnerOrder(layering);
                        var dir = vertDir + horizDir;
                        var align = verticalAlignment(g, layering, conflicts, vertDir === "u" ? "predecessors" : "successors");
                        xss[dir] = horizontalCompaction(g, layering, align.pos, align.root, align.align);
                        if (config.debugLevel >= 3)
                            debugPositioning(vertDir + horizDir, g, layering, xss[dir]);
                        if (horizDir === "r")
                            flipHorizontally(xss[dir]);
                        if (horizDir === "r")
                            reverseInnerOrder(layering)
                    });
                    if (vertDir === "d")
                        layering.reverse()
                });
                balance(g, layering, xss);
                g.eachNode(function(v) {
                    var xs = [];
                    for (var alignment in xss) {
                        var alignmentX = xss[alignment][v];
                        posXDebug(alignment, g, v, alignmentX);
                        xs.push(alignmentX)
                    }
                    xs.sort(function(x, y) {
                        return x - y
                    });
                    posX(g, v, (xs[1] + xs[2]) / 2)
                });
                var y = 0, reverseY = g.graph().rankDir === "BT" || g.graph().rankDir === "RL";
                layering.forEach(function(layer) {
                    var maxHeight = util.max(layer.map(function(u) {
                        return height(g, u)
                    }));
                    y += maxHeight / 2;
                    layer.forEach(function(u) {
                        posY(g, u, reverseY?-y : y)
                    });
                    y += maxHeight / 2 + config.rankSep
                });
                var minX = util.min(g.nodes().map(function(u) {
                    return posX(g, u) - width(g, u) / 2
                }));
                var minY = util.min(g.nodes().map(function(u) {
                    return posY(g, u) - height(g, u) / 2
                }));
                g.eachNode(function(u) {
                    posX(g, u, posX(g, u) - minX);
                    posY(g, u, posY(g, u) - minY)
                })
            }
            function undirEdgeId(u, v) {
                return u < v ? u.toString().length + ":" + u + "-" + v : v.toString().length + ":" + v + "-" + u
            }
            function findConflicts(g, layering) {
                var conflicts = {}, pos = {}, prevLayer, currLayer, k0, l, k1;
                if (layering.length <= 2)
                    return conflicts;
                function updateConflicts(v) {
                    var k = pos[v];
                    if (k < k0 || k > k1) {
                        conflicts[undirEdgeId(currLayer[l], v)] = true
                    }
                }
                layering[1].forEach(function(u, i) {
                    pos[u] = i
                });
                for (var i = 1; i < layering.length - 1; ++i) {
                    prevLayer = layering[i];
                    currLayer = layering[i + 1];
                    k0 = 0;
                    l = 0;
                    for (var l1 = 0; l1 < currLayer.length; ++l1) {
                        var u = currLayer[l1];
                        pos[u] = l1;
                        k1 = undefined;
                        if (g.node(u).dummy) {
                            var uPred = g.predecessors(u)[0];
                            if (uPred !== undefined && g.node(uPred).dummy)
                                k1 = pos[uPred]
                        }
                        if (k1 === undefined && l1 === currLayer.length - 1)
                            k1 = prevLayer.length - 1;
                        if (k1 !== undefined) {
                            for (; l <= l1; ++l) {
                                g.predecessors(currLayer[l]).forEach(updateConflicts)
                            }
                            k0 = k1
                        }
                    }
                }
                return conflicts
            }
            function verticalAlignment(g, layering, conflicts, relationship) {
                var pos = {}, root = {}, align = {};
                layering.forEach(function(layer) {
                    layer.forEach(function(u, i) {
                        root[u] = u;
                        align[u] = u;
                        pos[u] = i
                    })
                });
                layering.forEach(function(layer) {
                    var prevIdx =- 1;
                    layer.forEach(function(v) {
                        var related = g[relationship](v), mid;
                        if (related.length > 0) {
                            related.sort(function(x, y) {
                                return pos[x] - pos[y]
                            });
                            mid = (related.length - 1) / 2;
                            related.slice(Math.floor(mid), Math.ceil(mid) + 1).forEach(function(u) {
                                if (align[v] === v) {
                                    if (!conflicts[undirEdgeId(u, v)] && prevIdx < pos[u]) {
                                        align[u] = v;
                                        align[v] = root[v] = root[u];
                                        prevIdx = pos[u]
                                    }
                                }
                            })
                        }
                    })
                });
                return {
                    pos: pos,
                    root: root,
                    align: align
                }
            }
            function horizontalCompaction(g, layering, pos, root, align) {
                var sink = {}, maybeShift = {}, shift = {}, pred = {}, xs = {};
                layering.forEach(function(layer) {
                    layer.forEach(function(u, i) {
                        sink[u] = u;
                        maybeShift[u] = {};
                        if (i > 0)
                            pred[u] = layer[i - 1]
                    })
                });
                function updateShift(toShift, neighbor, delta) {
                    if (!(neighbor in maybeShift[toShift])) {
                        maybeShift[toShift][neighbor] = delta
                    } else {
                        maybeShift[toShift][neighbor] = Math.min(maybeShift[toShift][neighbor], delta)
                    }
                }
                function placeBlock(v) {
                    if (!(v in xs)) {
                        xs[v] = 0;
                        var w = v;
                        do {
                            if (pos[w] > 0) {
                                var u = root[pred[w]];
                                placeBlock(u);
                                if (sink[v] === v) {
                                    sink[v] = sink[u]
                                }
                                var delta = sep(g, pred[w]) + sep(g, w);
                                if (sink[v] !== sink[u]) {
                                    updateShift(sink[u], sink[v], xs[v] - xs[u] - delta)
                                } else {
                                    xs[v] = Math.max(xs[v], xs[u] + delta)
                                }
                            }
                            w = align[w]
                        }
                        while (w !== v)
                        }
                }
                util.values(root).forEach(function(v) {
                    placeBlock(v)
                });
                layering.forEach(function(layer) {
                    layer.forEach(function(v) {
                        xs[v] = xs[root[v]];
                        if (v === root[v] && v === sink[v]) {
                            var minShift = 0;
                            if (v in maybeShift && Object.keys(maybeShift[v]).length > 0) {
                                minShift = util.min(Object.keys(maybeShift[v]).map(function(u) {
                                    return maybeShift[v][u] + (u in shift ? shift[u] : 0)
                                }))
                            }
                            shift[v] = minShift
                        }
                    })
                });
                layering.forEach(function(layer) {
                    layer.forEach(function(v) {
                        xs[v] += shift[sink[root[v]]] || 0
                    })
                });
                return xs
            }
            function findMinCoord(g, layering, xs) {
                return util.min(layering.map(function(layer) {
                    var u = layer[0];
                    return xs[u]
                }))
            }
            function findMaxCoord(g, layering, xs) {
                return util.max(layering.map(function(layer) {
                    var u = layer[layer.length - 1];
                    return xs[u]
                }))
            }
            function balance(g, layering, xss) {
                var min = {}, max = {}, smallestAlignment, shift = {};
                function updateAlignment(v) {
                    xss[alignment][v] += shift[alignment]
                }
                var smallest = Number.POSITIVE_INFINITY;
                for (var alignment in xss) {
                    var xs = xss[alignment];
                    min[alignment] = findMinCoord(g, layering, xs);
                    max[alignment] = findMaxCoord(g, layering, xs);
                    var w = max[alignment] - min[alignment];
                    if (w < smallest) {
                        smallest = w;
                        smallestAlignment = alignment
                    }
                }
                ["u", "d"].forEach(function(vertDir) {
                    ["l", "r"].forEach(function(horizDir) {
                        var alignment = vertDir + horizDir;
                        shift[alignment] = horizDir === "l" ? min[smallestAlignment] - min[alignment] : max[smallestAlignment] - max[alignment]
                    })
                });
                for (alignment in xss) {
                    g.eachNode(updateAlignment)
                }
            }
            function flipHorizontally(xs) {
                for (var u in xs) {
                    xs[u] =- xs[u]
                }
            }
            function reverseInnerOrder(layering) {
                layering.forEach(function(layer) {
                    layer.reverse()
                })
            }
            function width(g, u) {
                switch (g.graph().rankDir) {
                case"LR":
                    return g.node(u).height;
                case"RL":
                    return g.node(u).height;
                default:
                    return g.node(u).width
                }
            }
            function height(g, u) {
                switch (g.graph().rankDir) {
                case"LR":
                    return g.node(u).width;
                case"RL":
                    return g.node(u).width;
                default:
                    return g.node(u).height
                }
            }
            function sep(g, u) {
                if (config.universalSep !== null) {
                    return config.universalSep
                }
                var w = width(g, u);
                var s = g.node(u).dummy ? config.edgeSep: config.nodeSep;
                return (w + s) / 2
            }
            function posX(g, u, x) {
                if (g.graph().rankDir === "LR" || g.graph().rankDir === "RL") {
                    if (arguments.length < 3) {
                        return g.node(u).y
                    } else {
                        g.node(u).y = x
                    }
                } else {
                    if (arguments.length < 3) {
                        return g.node(u).x
                    } else {
                        g.node(u).x = x
                    }
                }
            }
            function posXDebug(name, g, u, x) {
                if (g.graph().rankDir === "LR" || g.graph().rankDir === "RL") {
                    if (arguments.length < 3) {
                        return g.node(u)[name]
                    } else {
                        g.node(u)[name] = x
                    }
                } else {
                    if (arguments.length < 3) {
                        return g.node(u)[name]
                    } else {
                        g.node(u)[name] = x
                    }
                }
            }
            function posY(g, u, y) {
                if (g.graph().rankDir === "LR" || g.graph().rankDir === "RL") {
                    if (arguments.length < 3) {
                        return g.node(u).x
                    } else {
                        g.node(u).x = y
                    }
                } else {
                    if (arguments.length < 3) {
                        return g.node(u).y
                    } else {
                        g.node(u).y = y
                    }
                }
            }
            function debugPositioning(align, g, layering, xs) {
                layering.forEach(function(l, li) {
                    var u, xU;
                    l.forEach(function(v) {
                        var xV = xs[v];
                        if (u) {
                            var s = sep(g, u) + sep(g, v);
                            if (xV - xU < s)
                                console.log("Position phase: sep violation. Align: " + align + ". Layer: " + li + ". " + "U: " + u + " V: " + v + ". Actual sep: " + (xV - xU) + " Expected sep: " + s)
                        }
                        u = v;
                        xU = xV
                    })
                })
            }
        }
    }, {
        "./util": 17
    }
    ], 10 : [function(require, module, exports) {
        var util = require("./util"), acyclic = require("./rank/acyclic"), initRank = require("./rank/initRank"), feasibleTree = require("./rank/feasibleTree"), constraints = require("./rank/constraints"), simplex = require("./rank/simplex"), components = require("graphlib").alg.components, filter = require("graphlib").filter;
        exports.run = run;
        exports.restoreEdges = restoreEdges;
        function run(g, useSimplex) {
            expandSelfLoops(g);
            util.time("constraints.apply", constraints.apply)(g);
            expandSidewaysEdges(g);
            util.time("acyclic", acyclic)(g);
            var flatGraph = g.filterNodes(util.filterNonSubgraphs(g));
            initRank(flatGraph);
            components(flatGraph).forEach(function(cmpt) {
                var subgraph = flatGraph.filterNodes(filter.nodesFromList(cmpt));
                rankComponent(subgraph, useSimplex)
            });
            util.time("constraints.relax", constraints.relax(g));
            util.time("reorientEdges", reorientEdges)(g)
        }
        function restoreEdges(g) {
            acyclic.undo(g)
        }
        function expandSelfLoops(g) {
            g.eachEdge(function(e, u, v, a) {
                if (u === v) {
                    var x = addDummyNode(g, e, u, v, a, 0, false), y = addDummyNode(g, e, u, v, a, 1, true), z = addDummyNode(g, e, u, v, a, 2, false);
                    g.addEdge(null, x, u, {
                        minLen: 1,
                        selfLoop: true
                    });
                    g.addEdge(null, x, y, {
                        minLen: 1,
                        selfLoop: true
                    });
                    g.addEdge(null, u, z, {
                        minLen: 1,
                        selfLoop: true
                    });
                    g.addEdge(null, y, z, {
                        minLen: 1,
                        selfLoop: true
                    });
                    g.delEdge(e)
                }
            })
        }
        function expandSidewaysEdges(g) {
            g.eachEdge(function(e, u, v, a) {
                if (u === v) {
                    var origEdge = a.originalEdge, dummy = addDummyNode(g, origEdge.e, origEdge.u, origEdge.v, origEdge.value, 0, true);
                    g.addEdge(null, u, dummy, {
                        minLen: 1
                    });
                    g.addEdge(null, dummy, v, {
                        minLen: 1
                    });
                    g.delEdge(e)
                }
            })
        }
        function addDummyNode(g, e, u, v, a, index, isLabel) {
            return g.addNode(null, {
                width: isLabel ? a.width: 0,
                height: isLabel ? a.height: 0,
                edge: {
                    id: e,
                    source: u,
                    target: v,
                    attrs: a
                },
                dummy: true,
                index: index
            })
        }
        function reorientEdges(g) {
            g.eachEdge(function(e, u, v, value) {
                if (g.node(u).rank > g.node(v).rank) {
                    g.delEdge(e);
                    value.reversed = true;
                    g.addEdge(e, v, u, value)
                }
            })
        }
        function rankComponent(subgraph, useSimplex) {
            var spanningTree = feasibleTree(subgraph);
            if (useSimplex) {
                util.log(1, "Using network simplex for ranking");
                simplex(subgraph, spanningTree)
            }
            normalize(subgraph)
        }
        function normalize(g) {
            var m = util.min(g.nodes().map(function(u) {
                return g.node(u).rank
            }));
            g.eachNode(function(u, node) {
                node.rank -= m
            })
        }
    }, {
        "./rank/acyclic": 11,
        "./rank/constraints": 12,
        "./rank/feasibleTree": 13,
        "./rank/initRank": 14,
        "./rank/simplex": 16,
        "./util": 17,
        graphlib: 24
    }
    ], 11 : [function(require, module, exports) {
        var util = require("../util");
        module.exports = acyclic;
        module.exports.undo = undo;
        function acyclic(g) {
            var onStack = {}, visited = {}, reverseCount = 0;
            function dfs(u) {
                if (u in visited)
                    return;
                visited[u] = onStack[u] = true;
                g.outEdges(u).forEach(function(e) {
                    var t = g.target(e), value;
                    if (u === t) {
                        console.error('Warning: found self loop "' + e + '" for node "' + u + '"')
                    } else if (t in onStack) {
                        value = g.edge(e);
                        g.delEdge(e);
                        value.reversed = true;
                        ++reverseCount;
                        g.addEdge(e, t, u, value)
                    } else {
                        dfs(t)
                    }
                });
                delete onStack[u]
            }
            g.eachNode(function(u) {
                dfs(u)
            });
            util.log(2, "Acyclic Phase: reversed " + reverseCount + " edge(s)");
            return reverseCount
        }
        function undo(g) {
            g.eachEdge(function(e, s, t, a) {
                if (a.reversed) {
                    delete a.reversed;
                    g.delEdge(e);
                    g.addEdge(e, t, s, a)
                }
            })
        }
    }, {
        "../util": 17
    }
    ], 12 : [function(require, module, exports) {
        exports.apply = function(g) {
            function dfs(sg) {
                var rankSets = {};
                g.children(sg).forEach(function(u) {
                    if (g.children(u).length) {
                        dfs(u);
                        return 
                    }
                    var value = g.node(u), prefRank = value.prefRank;
                    if (prefRank !== undefined) {
                        if (!checkSupportedPrefRank(prefRank)) {
                            return 
                        }
                        if (!(prefRank in rankSets)) {
                            rankSets.prefRank = [u]
                        } else {
                            rankSets.prefRank.push(u)
                        }
                        var newU = rankSets[prefRank];
                        if (newU === undefined) {
                            newU = rankSets[prefRank] = g.addNode(null, {
                                originalNodes: []
                            });
                            g.parent(newU, sg)
                        }
                        redirectInEdges(g, u, newU, prefRank === "min");
                        redirectOutEdges(g, u, newU, prefRank === "max");
                        g.node(newU).originalNodes.push({
                            u: u,
                            value: value,
                            parent: sg
                        });
                        g.delNode(u)
                    }
                });
                addLightEdgesFromMinNode(g, sg, rankSets.min);
                addLightEdgesToMaxNode(g, sg, rankSets.max)
            }
            dfs(null)
        };
        function checkSupportedPrefRank(prefRank) {
            if (prefRank !== "min" && prefRank !== "max" && prefRank.indexOf("same_") !== 0) {
                console.error("Unsupported rank type: " + prefRank);
                return false
            }
            return true
        }
        function redirectInEdges(g, u, newU, reverse) {
            g.inEdges(u).forEach(function(e) {
                var origValue = g.edge(e), value;
                if (origValue.originalEdge) {
                    value = origValue
                } else {
                    value = {
                        originalEdge: {
                            e: e,
                            u: g.source(e),
                            v: g.target(e),
                            value: origValue
                        },
                        minLen: g.edge(e).minLen
                    }
                }
                if (origValue.selfLoop) {
                    reverse = false
                }
                if (reverse) {
                    g.addEdge(null, newU, g.source(e), value);
                    value.reversed = true
                } else {
                    g.addEdge(null, g.source(e), newU, value)
                }
            })
        }
        function redirectOutEdges(g, u, newU, reverse) {
            g.outEdges(u).forEach(function(e) {
                var origValue = g.edge(e), value;
                if (origValue.originalEdge) {
                    value = origValue
                } else {
                    value = {
                        originalEdge: {
                            e: e,
                            u: g.source(e),
                            v: g.target(e),
                            value: origValue
                        },
                        minLen: g.edge(e).minLen
                    }
                }
                if (origValue.selfLoop) {
                    reverse = false
                }
                if (reverse) {
                    g.addEdge(null, g.target(e), newU, value);
                    value.reversed = true
                } else {
                    g.addEdge(null, newU, g.target(e), value)
                }
            })
        }
        function addLightEdgesFromMinNode(g, sg, minNode) {
            if (minNode !== undefined) {
                g.children(sg).forEach(function(u) {
                    if (u !== minNode&&!g.outEdges(minNode, u).length&&!g.node(u).dummy) {
                        g.addEdge(null, minNode, u, {
                            minLen: 0
                        })
                    }
                })
            }
        }
        function addLightEdgesToMaxNode(g, sg, maxNode) {
            if (maxNode !== undefined) {
                g.children(sg).forEach(function(u) {
                    if (u !== maxNode&&!g.outEdges(u, maxNode).length&&!g.node(u).dummy) {
                        g.addEdge(null, u, maxNode, {
                            minLen: 0
                        })
                    }
                })
            }
        }
        exports.relax = function(g) {
            var originalEdges = [];
            g.eachEdge(function(e, u, v, value) {
                var originalEdge = value.originalEdge;
                if (originalEdge) {
                    originalEdges.push(originalEdge)
                }
            });
            g.eachNode(function(u, value) {
                var originalNodes = value.originalNodes;
                if (originalNodes) {
                    originalNodes.forEach(function(originalNode) {
                        originalNode.value.rank = value.rank;
                        g.addNode(originalNode.u, originalNode.value);
                        g.parent(originalNode.u, originalNode.parent)
                    });
                    g.delNode(u)
                }
            });
            originalEdges.forEach(function(edge) {
                g.addEdge(edge.e, edge.u, edge.v, edge.value)
            })
        }
    }, {}
    ], 13 : [function(require, module, exports) {
        var Set = require("cp-data").Set, Digraph = require("graphlib").Digraph, util = require("../util");
        module.exports = feasibleTree;
        function feasibleTree(g) {
            var remaining = new Set(g.nodes()), tree = new Digraph;
            if (remaining.size() === 1) {
                var root = g.nodes()[0];
                tree.addNode(root, {});
                tree.graph({
                    root: root
                });
                return tree
            }
            function addTightEdges(v) {
                var continueToScan = true;
                g.predecessors(v).forEach(function(u) {
                    if (remaining.has(u)&&!slack(g, u, v)) {
                        if (remaining.has(v)) {
                            tree.addNode(v, {});
                            remaining.remove(v);
                            tree.graph({
                                root: v
                            })
                        }
                        tree.addNode(u, {});
                        tree.addEdge(null, u, v, {
                            reversed: true
                        });
                        remaining.remove(u);
                        addTightEdges(u);
                        continueToScan = false
                    }
                });
                g.successors(v).forEach(function(w) {
                    if (remaining.has(w)&&!slack(g, v, w)) {
                        if (remaining.has(v)) {
                            tree.addNode(v, {});
                            remaining.remove(v);
                            tree.graph({
                                root: v
                            })
                        }
                        tree.addNode(w, {});
                        tree.addEdge(null, v, w, {});
                        remaining.remove(w);
                        addTightEdges(w);
                        continueToScan = false
                    }
                });
                return continueToScan
            }
            function createTightEdge() {
                var minSlack = Number.MAX_VALUE;
                remaining.keys().forEach(function(v) {
                    g.predecessors(v).forEach(function(u) {
                        if (!remaining.has(u)) {
                            var edgeSlack = slack(g, u, v);
                            if (Math.abs(edgeSlack) < Math.abs(minSlack)) {
                                minSlack =- edgeSlack
                            }
                        }
                    });
                    g.successors(v).forEach(function(w) {
                        if (!remaining.has(w)) {
                            var edgeSlack = slack(g, v, w);
                            if (Math.abs(edgeSlack) < Math.abs(minSlack)) {
                                minSlack = edgeSlack
                            }
                        }
                    })
                });
                tree.eachNode(function(u) {
                    g.node(u).rank -= minSlack
                })
            }
            while (remaining.size()) {
                var nodesToSearch=!tree.order() ? remaining.keys() : tree.nodes();
                for (var i = 0, il = nodesToSearch.length; i < il && addTightEdges(nodesToSearch[i]); ++i);
                if (remaining.size()) {
                    createTightEdge()
                }
            }
            return tree
        }
        function slack(g, u, v) {
            var rankDiff = g.node(v).rank - g.node(u).rank;
            var maxMinLen = util.max(g.outEdges(u, v).map(function(e) {
                return g.edge(e).minLen
            }));
            return rankDiff - maxMinLen
        }
    }, {
        "../util": 17,
        "cp-data": 19,
        graphlib: 24
    }
    ], 14 : [function(require, module, exports) {
        var util = require("../util"), topsort = require("graphlib").alg.topsort;
        module.exports = initRank;
        function initRank(g) {
            var sorted = topsort(g);
            sorted.forEach(function(u) {
                var inEdges = g.inEdges(u);
                if (inEdges.length === 0) {
                    g.node(u).rank = 0;
                    return 
                }
                var minLens = inEdges.map(function(e) {
                    return g.node(g.source(e)).rank + g.edge(e).minLen
                });
                g.node(u).rank = util.max(minLens)
            })
        }
    }, {
        "../util": 17,
        graphlib: 24
    }
    ], 15 : [function(require, module, exports) {
        module.exports = {
            slack: slack
        };
        function slack(graph, u, v, minLen) {
            return Math.abs(graph.node(u).rank - graph.node(v).rank) - minLen
        }
    }, {}
    ], 16 : [function(require, module, exports) {
        var util = require("../util"), rankUtil = require("./rankUtil");
        module.exports = simplex;
        function simplex(graph, spanningTree) {
            initCutValues(graph, spanningTree);
            while (true) {
                var e = leaveEdge(spanningTree);
                if (e === null)
                    break;
                var f = enterEdge(graph, spanningTree, e);
                exchange(graph, spanningTree, e, f)
            }
        }
        function initCutValues(graph, spanningTree) {
            computeLowLim(spanningTree);
            spanningTree.eachEdge(function(id, u, v, treeValue) {
                treeValue.cutValue = 0
            });
            function dfs(n) {
                var children = spanningTree.successors(n);
                for (var c in children) {
                    var child = children[c];
                    dfs(child)
                }
                if (n !== spanningTree.graph().root) {
                    setCutValue(graph, spanningTree, n)
                }
            }
            dfs(spanningTree.graph().root)
        }
        function computeLowLim(tree) {
            var postOrderNum = 0;
            function dfs(n) {
                var children = tree.successors(n);
                var low = postOrderNum;
                for (var c in children) {
                    var child = children[c];
                    dfs(child);
                    low = Math.min(low, tree.node(child).low)
                }
                tree.node(n).low = low;
                tree.node(n).lim = postOrderNum++
            }
            dfs(tree.graph().root)
        }
        function setCutValue(graph, tree, child) {
            var parentEdge = tree.inEdges(child)[0];
            var grandchildren = [];
            var grandchildEdges = tree.outEdges(child);
            for (var gce in grandchildEdges) {
                grandchildren.push(tree.target(grandchildEdges[gce]))
            }
            var cutValue = 0;
            var E = 0;
            var F = 0;
            var G = 0;
            var H = 0;
            var outEdges = graph.outEdges(child);
            var gc;
            for (var oe in outEdges) {
                var succ = graph.target(outEdges[oe]);
                for (gc in grandchildren) {
                    if (inSubtree(tree, succ, grandchildren[gc])) {
                        E++
                    }
                }
                if (!inSubtree(tree, succ, child)) {
                    G++
                }
            }
            var inEdges = graph.inEdges(child);
            for (var ie in inEdges) {
                var pred = graph.source(inEdges[ie]);
                for (gc in grandchildren) {
                    if (inSubtree(tree, pred, grandchildren[gc])) {
                        F++
                    }
                }
                if (!inSubtree(tree, pred, child)) {
                    H++
                }
            }
            var grandchildCutSum = 0;
            for (gc in grandchildren) {
                var cv = tree.edge(grandchildEdges[gc]).cutValue;
                if (!tree.edge(grandchildEdges[gc]).reversed) {
                    grandchildCutSum += cv
                } else {
                    grandchildCutSum -= cv
                }
            }
            if (!tree.edge(parentEdge).reversed) {
                cutValue += grandchildCutSum - E + F - G + H
            } else {
                cutValue -= grandchildCutSum - E + F - G + H
            }
            tree.edge(parentEdge).cutValue = cutValue
        }
        function inSubtree(tree, n, root) {
            return tree.node(root).low <= tree.node(n).lim && tree.node(n).lim <= tree.node(root).lim
        }
        function leaveEdge(tree) {
            var edges = tree.edges();
            for (var n in edges) {
                var e = edges[n];
                var treeValue = tree.edge(e);
                if (treeValue.cutValue < 0) {
                    return e
                }
            }
            return null
        }
        function enterEdge(graph, tree, e) {
            var source = tree.source(e);
            var target = tree.target(e);
            var lower = tree.node(target).lim < tree.node(source).lim ? target: source;
            var aligned=!tree.edge(e).reversed;
            var minSlack = Number.POSITIVE_INFINITY;
            var minSlackEdge;
            if (aligned) {
                graph.eachEdge(function(id, u, v, value) {
                    if (id !== e && inSubtree(tree, u, lower)&&!inSubtree(tree, v, lower)) {
                        var slack = rankUtil.slack(graph, u, v, value.minLen);
                        if (slack < minSlack) {
                            minSlack = slack;
                            minSlackEdge = id
                        }
                    }
                })
            } else {
                graph.eachEdge(function(id, u, v, value) {
                    if (id !== e&&!inSubtree(tree, u, lower) && inSubtree(tree, v, lower)) {
                        var slack = rankUtil.slack(graph, u, v, value.minLen);
                        if (slack < minSlack) {
                            minSlack = slack;
                            minSlackEdge = id
                        }
                    }
                })
            }
            if (minSlackEdge === undefined) {
                var outside = [];
                var inside = [];
                graph.eachNode(function(id) {
                    if (!inSubtree(tree, id, lower)) {
                        outside.push(id)
                    } else {
                        inside.push(id)
                    }
                });
                throw new Error("No edge found from outside of tree to inside")
            }
            return minSlackEdge
        }
        function exchange(graph, tree, e, f) {
            tree.delEdge(e);
            var source = graph.source(f);
            var target = graph.target(f);
            function redirect(v) {
                var edges = tree.inEdges(v);
                for (var i in edges) {
                    var e = edges[i];
                    var u = tree.source(e);
                    var value = tree.edge(e);
                    redirect(u);
                    tree.delEdge(e);
                    value.reversed=!value.reversed;
                    tree.addEdge(e, v, u, value)
                }
            }
            redirect(target);
            var root = source;
            var edges = tree.inEdges(root);
            while (edges.length > 0) {
                root = tree.source(edges[0]);
                edges = tree.inEdges(root)
            }
            tree.graph().root = root;
            tree.addEdge(null, source, target, {
                cutValue: 0
            });
            initCutValues(graph, tree);
            adjustRanks(graph, tree)
        }
        function adjustRanks(graph, tree) {
            function dfs(p) {
                var children = tree.successors(p);
                children.forEach(function(c) {
                    var minLen = minimumLength(graph, p, c);
                    graph.node(c).rank = graph.node(p).rank + minLen;
                    dfs(c)
                })
            }
            dfs(tree.graph().root)
        }
        function minimumLength(graph, u, v) {
            var outEdges = graph.outEdges(u, v);
            if (outEdges.length > 0) {
                return util.max(outEdges.map(function(e) {
                    return graph.edge(e).minLen
                }))
            }
            var inEdges = graph.inEdges(u, v);
            if (inEdges.length > 0) {
                return - util.max(inEdges.map(function(e) {
                    return graph.edge(e).minLen
                }))
            }
        }
    }, {
        "../util": 17,
        "./rankUtil": 15
    }
    ], 17 : [function(require, module, exports) {
        exports.min = function(values) {
            return Math.min.apply(Math, values)
        };
        exports.max = function(values) {
            return Math.max.apply(Math, values)
        };
        exports.all = function(xs, f) {
            for (var i = 0; i < xs.length; ++i) {
                if (!f(xs[i])) {
                    return false
                }
            }
            return true
        };
        exports.sum = function(values) {
            return values.reduce(function(acc, x) {
                return acc + x
            }, 0)
        };
        exports.values = function(obj) {
            return Object.keys(obj).map(function(k) {
                return obj[k]
            })
        };
        exports.shuffle = function(array) {
            for (i = array.length - 1; i > 0; --i) {
                var j = Math.floor(Math.random() * (i + 1));
                var aj = array[j];
                array[j] = array[i];
                array[i] = aj
            }
        };
        exports.propertyAccessor = function(self, config, field, setHook) {
            return function(x) {
                if (!arguments.length)
                    return config[field];
                config[field] = x;
                if (setHook)
                    setHook(x);
                return self
            }
        };
        exports.ordering = function(g) {
            var ordering = [];
            g.eachNode(function(u, value) {
                var rank = ordering[value.rank] || (ordering[value.rank] = []);
                rank[value.order] = u
            });
            return ordering
        };
        exports.filterNonSubgraphs = function(g) {
            return function(u) {
                return g.children(u).length === 0
            }
        };
        function time(name, func) {
            return function() {
                var start = (new Date).getTime();
                try {
                    return func.apply(null, arguments)
                } finally {
                    log(1, name + " time: " + ((new Date).getTime() - start) + "ms")
                }
            }
        }
        time.enabled = false;
        exports.time = time;
        function log(level) {
            if (log.level >= level) {
                console.log.apply(console, Array.prototype.slice.call(arguments, 1))
            }
        }
        log.level = 0;
        exports.log = log
    }, {}
    ], 18 : [function(require, module, exports) {
        module.exports = "0.4.5"
    }, {}
    ], 19 : [function(require, module, exports) {
        exports.Set = require("./lib/Set");
        exports.PriorityQueue = require("./lib/PriorityQueue");
        exports.version = require("./lib/version")
    }, {
        "./lib/PriorityQueue": 20,
        "./lib/Set": 21,
        "./lib/version": 23
    }
    ], 20 : [function(require, module, exports) {
        module.exports = PriorityQueue;
        function PriorityQueue() {
            this._arr = [];
            this._keyIndices = {}
        }
        PriorityQueue.prototype.size = function() {
            return this._arr.length
        };
        PriorityQueue.prototype.keys = function() {
            return this._arr.map(function(x) {
                return x.key
            })
        };
        PriorityQueue.prototype.has = function(key) {
            return key in this._keyIndices
        };
        PriorityQueue.prototype.priority = function(key) {
            var index = this._keyIndices[key];
            if (index !== undefined) {
                return this._arr[index].priority
            }
        };
        PriorityQueue.prototype.min = function() {
            if (this.size() === 0) {
                throw new Error("Queue underflow")
            }
            return this._arr[0].key
        };
        PriorityQueue.prototype.add = function(key, priority) {
            var keyIndices = this._keyIndices;
            if (!(key in keyIndices)) {
                var arr = this._arr;
                var index = arr.length;
                keyIndices[key] = index;
                arr.push({
                    key: key,
                    priority: priority
                });
                this._decrease(index);
                return true
            }
            return false
        };
        PriorityQueue.prototype.removeMin = function() {
            this._swap(0, this._arr.length - 1);
            var min = this._arr.pop();
            delete this._keyIndices[min.key];
            this._heapify(0);
            return min.key
        };
        PriorityQueue.prototype.decrease = function(key, priority) {
            var index = this._keyIndices[key];
            if (priority > this._arr[index].priority) {
                throw new Error("New priority is greater than current priority. " + "Key: " + key + " Old: " + this._arr[index].priority + " New: " + priority)
            }
            this._arr[index].priority = priority;
            this._decrease(index)
        };
        PriorityQueue.prototype._heapify = function(i) {
            var arr = this._arr;
            var l = 2 * i, r = l + 1, largest = i;
            if (l < arr.length) {
                largest = arr[l].priority < arr[largest].priority ? l : largest;
                if (r < arr.length) {
                    largest = arr[r].priority < arr[largest].priority ? r : largest
                }
                if (largest !== i) {
                    this._swap(i, largest);
                    this._heapify(largest)
                }
            }
        };
        PriorityQueue.prototype._decrease = function(index) {
            var arr = this._arr;
            var priority = arr[index].priority;
            var parent;
            while (index !== 0) {
                parent = index>>1;
                if (arr[parent].priority < priority) {
                    break
                }
                this._swap(index, parent);
                index = parent
            }
        };
        PriorityQueue.prototype._swap = function(i, j) {
            var arr = this._arr;
            var keyIndices = this._keyIndices;
            var origArrI = arr[i];
            var origArrJ = arr[j];
            arr[i] = origArrJ;
            arr[j] = origArrI;
            keyIndices[origArrJ.key] = i;
            keyIndices[origArrI.key] = j
        }
    }, {}
    ], 21 : [function(require, module, exports) {
        var util = require("./util");
        module.exports = Set;
        function Set(initialKeys) {
            this._size = 0;
            this._keys = {};
            if (initialKeys) {
                for (var i = 0, il = initialKeys.length; i < il; ++i) {
                    this.add(initialKeys[i])
                }
            }
        }
        Set.intersect = function(sets) {
            if (sets.length === 0) {
                return new Set
            }
            var result = new Set(!util.isArray(sets[0]) ? sets[0].keys() : sets[0]);
            for (var i = 1, il = sets.length; i < il; ++i) {
                var resultKeys = result.keys(), other=!util.isArray(sets[i]) ? sets[i] : new Set(sets[i]);
                for (var j = 0, jl = resultKeys.length; j < jl; ++j) {
                    var key = resultKeys[j];
                    if (!other.has(key)) {
                        result.remove(key)
                    }
                }
            }
            return result
        };
        Set.union = function(sets) {
            var totalElems = util.reduce(sets, function(lhs, rhs) {
                return lhs + (rhs.size ? rhs.size() : rhs.length)
            }, 0);
            var arr = new Array(totalElems);
            var k = 0;
            for (var i = 0, il = sets.length; i < il; ++i) {
                var cur = sets[i], keys=!util.isArray(cur) ? cur.keys() : cur;
                for (var j = 0, jl = keys.length; j < jl; ++j) {
                    arr[k++] = keys[j]
                }
            }
            return new Set(arr)
        };
        Set.prototype.size = function() {
            return this._size
        };
        Set.prototype.keys = function() {
            return values(this._keys)
        };
        Set.prototype.has = function(key) {
            return key in this._keys
        };
        Set.prototype.add = function(key) {
            if (!(key in this._keys)) {
                this._keys[key] = key;
                ++this._size;
                return true
            }
            return false
        };
        Set.prototype.remove = function(key) {
            if (key in this._keys) {
                delete this._keys[key];
                --this._size;
                return true
            }
            return false
        };
        function values(o) {
            var ks = Object.keys(o), len = ks.length, result = new Array(len), i;
            for (i = 0; i < len; ++i) {
                result[i] = o[ks[i]]
            }
            return result
        }
    }, {
        "./util": 22
    }
    ], 22 : [function(require, module, exports) {
        if (!Array.isArray) {
            exports.isArray = function(vArg) {
                return Object.prototype.toString.call(vArg) === "[object Array]"
            }
        } else {
            exports.isArray = Array.isArray
        }
        if ("function" !== typeof Array.prototype.reduce) {
            exports.reduce = function(array, callback, opt_initialValue) {
                "use strict";
                if (null === array || "undefined" === typeof array) {
                    throw new TypeError("Array.prototype.reduce called on null or undefined")
                }
                if ("function" !== typeof callback) {
                    throw new TypeError(callback + " is not a function")
                }
                var index, value, length = array.length>>>0, isValueSet = false;
                if (1 < arguments.length) {
                    value = opt_initialValue;
                    isValueSet = true
                }
                for (index = 0; length > index; ++index) {
                    if (array.hasOwnProperty(index)) {
                        if (isValueSet) {
                            value = callback(value, array[index], index, array)
                        } else {
                            value = array[index];
                            isValueSet = true
                        }
                    }
                }
                if (!isValueSet) {
                    throw new TypeError("Reduce of empty array with no initial value")
                }
                return value
            }
        } else {
            exports.reduce = function(array, callback, opt_initialValue) {
                return array.reduce(callback, opt_initialValue)
            }
        }
    }, {}
    ], 23 : [function(require, module, exports) {
        module.exports = "1.1.3"
    }, {}
    ], 24 : [function(require, module, exports) {
        exports.Graph = require("./lib/Graph");
        exports.Digraph = require("./lib/Digraph");
        exports.CGraph = require("./lib/CGraph");
        exports.CDigraph = require("./lib/CDigraph");
        require("./lib/graph-converters");
        exports.alg = {
            isAcyclic: require("./lib/alg/isAcyclic"),
            components: require("./lib/alg/components"),
            dijkstra: require("./lib/alg/dijkstra"),
            dijkstraAll: require("./lib/alg/dijkstraAll"),
            findCycles: require("./lib/alg/findCycles"),
            floydWarshall: require("./lib/alg/floydWarshall"),
            postorder: require("./lib/alg/postorder"),
            preorder: require("./lib/alg/preorder"),
            prim: require("./lib/alg/prim"),
            tarjan: require("./lib/alg/tarjan"),
            topsort: require("./lib/alg/topsort")
        };
        exports.converter = {
            json: require("./lib/converter/json.js")
        };
        var filter = require("./lib/filter");
        exports.filter = {
            all: filter.all,
            nodesFromList: filter.nodesFromList
        };
        exports.version = require("./lib/version")
    }, {
        "./lib/CDigraph": 26,
        "./lib/CGraph": 27,
        "./lib/Digraph": 28,
        "./lib/Graph": 29,
        "./lib/alg/components": 30,
        "./lib/alg/dijkstra": 31,
        "./lib/alg/dijkstraAll": 32,
        "./lib/alg/findCycles": 33,
        "./lib/alg/floydWarshall": 34,
        "./lib/alg/isAcyclic": 35,
        "./lib/alg/postorder": 36,
        "./lib/alg/preorder": 37,
        "./lib/alg/prim": 38,
        "./lib/alg/tarjan": 39,
        "./lib/alg/topsort": 40,
        "./lib/converter/json.js": 42,
        "./lib/filter": 43,
        "./lib/graph-converters": 44,
        "./lib/version": 46
    }
    ], 25 : [function(require, module, exports) {
        var Set = require("cp-data").Set;
        module.exports = BaseGraph;
        function BaseGraph() {
            this._value = undefined;
            this._nodes = {};
            this._edges = {};
            this._nextId = 0
        }
        BaseGraph.prototype.order = function() {
            return Object.keys(this._nodes).length
        };
        BaseGraph.prototype.size = function() {
            return Object.keys(this._edges).length
        };
        BaseGraph.prototype.graph = function(value) {
            if (arguments.length === 0) {
                return this._value
            }
            this._value = value
        };
        BaseGraph.prototype.hasNode = function(u) {
            return u in this._nodes
        };
        BaseGraph.prototype.node = function(u, value) {
            var node = this._strictGetNode(u);
            if (arguments.length === 1) {
                return node.value
            }
            node.value = value
        };
        BaseGraph.prototype.nodes = function() {
            var nodes = [];
            this.eachNode(function(id) {
                nodes.push(id)
            });
            return nodes
        };
        BaseGraph.prototype.eachNode = function(func) {
            for (var k in this._nodes) {
                var node = this._nodes[k];
                func(node.id, node.value)
            }
        };
        BaseGraph.prototype.hasEdge = function(e) {
            return e in this._edges
        };
        BaseGraph.prototype.edge = function(e, value) {
            var edge = this._strictGetEdge(e);
            if (arguments.length === 1) {
                return edge.value
            }
            edge.value = value
        };
        BaseGraph.prototype.edges = function() {
            var es = [];
            this.eachEdge(function(id) {
                es.push(id)
            });
            return es
        };
        BaseGraph.prototype.eachEdge = function(func) {
            for (var k in this._edges) {
                var edge = this._edges[k];
                func(edge.id, edge.u, edge.v, edge.value)
            }
        };
        BaseGraph.prototype.incidentNodes = function(e) {
            var edge = this._strictGetEdge(e);
            return [edge.u, edge.v]
        };
        BaseGraph.prototype.addNode = function(u, value) {
            if (u === undefined || u === null) {
                do {
                    u = "_" + ++this._nextId
                }
                while (this.hasNode(u))
                } else if (this.hasNode(u)) {
                    throw new Error("Graph already has node '" + u + "'")
                }
            this._nodes[u] = {
                id: u,
                value: value
            };
            return u
        };
        BaseGraph.prototype.delNode = function(u) {
            this._strictGetNode(u);
            this.incidentEdges(u).forEach(function(e) {
                this.delEdge(e)
            }, this);
            delete this._nodes[u]
        };
        BaseGraph.prototype._addEdge = function(e, u, v, value, inMap, outMap) {
            this._strictGetNode(u);
            this._strictGetNode(v);
            if (e === undefined || e === null) {
                do {
                    e = "_" + ++this._nextId
                }
                while (this.hasEdge(e))
                } else if (this.hasEdge(e)) {
                    throw new Error("Graph already has edge '" + e + "'")
                }
            this._edges[e] = {
                id: e,
                u: u,
                v: v,
                value: value
            };
            addEdgeToMap(inMap[v], u, e);
            addEdgeToMap(outMap[u], v, e);
            return e
        };
        BaseGraph.prototype._delEdge = function(e, inMap, outMap) {
            var edge = this._strictGetEdge(e);
            delEdgeFromMap(inMap[edge.v], edge.u, e);
            delEdgeFromMap(outMap[edge.u], edge.v, e);
            delete this._edges[e]
        };
        BaseGraph.prototype.copy = function() {
            var copy = new this.constructor;
            copy.graph(this.graph());
            this.eachNode(function(u, value) {
                copy.addNode(u, value)
            });
            this.eachEdge(function(e, u, v, value) {
                copy.addEdge(e, u, v, value)
            });
            copy._nextId = this._nextId;
            return copy
        };
        BaseGraph.prototype.filterNodes = function(filter) {
            var copy = new this.constructor;
            copy.graph(this.graph());
            this.eachNode(function(u, value) {
                if (filter(u)) {
                    copy.addNode(u, value)
                }
            });
            this.eachEdge(function(e, u, v, value) {
                if (copy.hasNode(u) && copy.hasNode(v)) {
                    copy.addEdge(e, u, v, value)
                }
            });
            return copy
        };
        BaseGraph.prototype._strictGetNode = function(u) {
            var node = this._nodes[u];
            if (node === undefined) {
                throw new Error("Node '" + u + "' is not in graph")
            }
            return node
        };
        BaseGraph.prototype._strictGetEdge = function(e) {
            var edge = this._edges[e];
            if (edge === undefined) {
                throw new Error("Edge '" + e + "' is not in graph")
            }
            return edge
        };
        function addEdgeToMap(map, v, e) {
            (map[v] || (map[v] = new Set)).add(e)
        }
        function delEdgeFromMap(map, v, e) {
            var vEntry = map[v];
            vEntry.remove(e);
            if (vEntry.size() === 0) {
                delete map[v]
            }
        }
    }, {
        "cp-data": 19
    }
    ], 26 : [function(require, module, exports) {
        var Digraph = require("./Digraph"), compoundify = require("./compoundify");
        var CDigraph = compoundify(Digraph);
        module.exports = CDigraph;
        CDigraph.fromDigraph = function(src) {
            var g = new CDigraph, graphValue = src.graph();
            if (graphValue !== undefined) {
                g.graph(graphValue)
            }
            src.eachNode(function(u, value) {
                if (value === undefined) {
                    g.addNode(u)
                } else {
                    g.addNode(u, value)
                }
            });
            src.eachEdge(function(e, u, v, value) {
                if (value === undefined) {
                    g.addEdge(null, u, v)
                } else {
                    g.addEdge(null, u, v, value)
                }
            });
            return g
        };
        CDigraph.prototype.toString = function() {
            return "CDigraph " + JSON.stringify(this, null, 2)
        }
    }, {
        "./Digraph": 28,
        "./compoundify": 41
    }
    ], 27 : [function(require, module, exports) {
        var Graph = require("./Graph"), compoundify = require("./compoundify");
        var CGraph = compoundify(Graph);
        module.exports = CGraph;
        CGraph.fromGraph = function(src) {
            var g = new CGraph, graphValue = src.graph();
            if (graphValue !== undefined) {
                g.graph(graphValue)
            }
            src.eachNode(function(u, value) {
                if (value === undefined) {
                    g.addNode(u)
                } else {
                    g.addNode(u, value)
                }
            });
            src.eachEdge(function(e, u, v, value) {
                if (value === undefined) {
                    g.addEdge(null, u, v)
                } else {
                    g.addEdge(null, u, v, value)
                }
            });
            return g
        };
        CGraph.prototype.toString = function() {
            return "CGraph " + JSON.stringify(this, null, 2)
        }
    }, {
        "./Graph": 29,
        "./compoundify": 41
    }
    ], 28 : [function(require, module, exports) {
        var util = require("./util"), BaseGraph = require("./BaseGraph"), Set = require("cp-data").Set;
        module.exports = Digraph;
        function Digraph() {
            BaseGraph.call(this);
            this._inEdges = {};
            this._outEdges = {}
        }
        Digraph.prototype = new BaseGraph;
        Digraph.prototype.constructor = Digraph;
        Digraph.prototype.isDirected = function() {
            return true
        };
        Digraph.prototype.successors = function(u) {
            this._strictGetNode(u);
            return Object.keys(this._outEdges[u]).map(function(v) {
                return this._nodes[v].id
            }, this)
        };
        Digraph.prototype.predecessors = function(u) {
            this._strictGetNode(u);
            return Object.keys(this._inEdges[u]).map(function(v) {
                return this._nodes[v].id
            }, this)
        };
        Digraph.prototype.neighbors = function(u) {
            return Set.union([this.successors(u), this.predecessors(u)]).keys()
        };
        Digraph.prototype.sources = function() {
            var self = this;
            return this._filterNodes(function(u) {
                return self.inEdges(u).length === 0
            })
        };
        Digraph.prototype.sinks = function() {
            var self = this;
            return this._filterNodes(function(u) {
                return self.outEdges(u).length === 0
            })
        };
        Digraph.prototype.source = function(e) {
            return this._strictGetEdge(e).u
        };
        Digraph.prototype.target = function(e) {
            return this._strictGetEdge(e).v
        };
        Digraph.prototype.inEdges = function(target, source) {
            this._strictGetNode(target);
            var results = Set.union(util.values(this._inEdges[target])).keys();
            if (arguments.length > 1) {
                this._strictGetNode(source);
                results = results.filter(function(e) {
                    return this.source(e) === source
                }, this)
            }
            return results
        };
        Digraph.prototype.outEdges = function(source, target) {
            this._strictGetNode(source);
            var results = Set.union(util.values(this._outEdges[source])).keys();
            if (arguments.length > 1) {
                this._strictGetNode(target);
                results = results.filter(function(e) {
                    return this.target(e) === target
                }, this)
            }
            return results
        };
        Digraph.prototype.incidentEdges = function(u, v) {
            if (arguments.length > 1) {
                return Set.union([this.outEdges(u, v), this.outEdges(v, u)]).keys()
            } else {
                return Set.union([this.inEdges(u), this.outEdges(u)]).keys()
            }
        };
        Digraph.prototype.toString = function() {
            return "Digraph " + JSON.stringify(this, null, 2)
        };
        Digraph.prototype.addNode = function(u, value) {
            u = BaseGraph.prototype.addNode.call(this, u, value);
            this._inEdges[u] = {};
            this._outEdges[u] = {};
            return u
        };
        Digraph.prototype.delNode = function(u) {
            BaseGraph.prototype.delNode.call(this, u);
            delete this._inEdges[u];
            delete this._outEdges[u]
        };
        Digraph.prototype.addEdge = function(e, source, target, value) {
            return BaseGraph.prototype._addEdge.call(this, e, source, target, value, this._inEdges, this._outEdges)
        };
        Digraph.prototype.delEdge = function(e) {
            BaseGraph.prototype._delEdge.call(this, e, this._inEdges, this._outEdges)
        };
        Digraph.prototype._filterNodes = function(pred) {
            var filtered = [];
            this.eachNode(function(u) {
                if (pred(u)) {
                    filtered.push(u)
                }
            });
            return filtered
        }
    }, {
        "./BaseGraph": 25,
        "./util": 45,
        "cp-data": 19
    }
    ], 29 : [function(require, module, exports) {
        var util = require("./util"), BaseGraph = require("./BaseGraph"), Set = require("cp-data").Set;
        module.exports = Graph;
        function Graph() {
            BaseGraph.call(this);
            this._incidentEdges = {}
        }
        Graph.prototype = new BaseGraph;
        Graph.prototype.constructor = Graph;
        Graph.prototype.isDirected = function() {
            return false
        };
        Graph.prototype.neighbors = function(u) {
            this._strictGetNode(u);
            return Object.keys(this._incidentEdges[u]).map(function(v) {
                return this._nodes[v].id
            }, this)
        };
        Graph.prototype.incidentEdges = function(u, v) {
            this._strictGetNode(u);
            if (arguments.length > 1) {
                this._strictGetNode(v);
                return v in this._incidentEdges[u] ? this._incidentEdges[u][v].keys() : []
            } else {
                return Set.union(util.values(this._incidentEdges[u])).keys()
            }
        };
        Graph.prototype.toString = function() {
            return "Graph " + JSON.stringify(this, null, 2)
        };
        Graph.prototype.addNode = function(u, value) {
            u = BaseGraph.prototype.addNode.call(this, u, value);
            this._incidentEdges[u] = {};
            return u
        };
        Graph.prototype.delNode = function(u) {
            BaseGraph.prototype.delNode.call(this, u);
            delete this._incidentEdges[u]
        };
        Graph.prototype.addEdge = function(e, u, v, value) {
            return BaseGraph.prototype._addEdge.call(this, e, u, v, value, this._incidentEdges, this._incidentEdges)
        };
        Graph.prototype.delEdge = function(e) {
            BaseGraph.prototype._delEdge.call(this, e, this._incidentEdges, this._incidentEdges)
        }
    }, {
        "./BaseGraph": 25,
        "./util": 45,
        "cp-data": 19
    }
    ], 30 : [function(require, module, exports) {
        var Set = require("cp-data").Set;
        module.exports = components;
        function components(g) {
            var results = [];
            var visited = new Set;
            function dfs(v, component) {
                if (!visited.has(v)) {
                    visited.add(v);
                    component.push(v);
                    g.neighbors(v).forEach(function(w) {
                        dfs(w, component)
                    })
                }
            }
            g.nodes().forEach(function(v) {
                var component = [];
                dfs(v, component);
                if (component.length > 0) {
                    results.push(component)
                }
            });
            return results
        }
    }, {
        "cp-data": 19
    }
    ], 31 : [function(require, module, exports) {
        var PriorityQueue = require("cp-data").PriorityQueue;
        module.exports = dijkstra;
        function dijkstra(g, source, weightFunc, incidentFunc) {
            var results = {}, pq = new PriorityQueue;
            function updateNeighbors(e) {
                var incidentNodes = g.incidentNodes(e), v = incidentNodes[0] !== u ? incidentNodes[0]: incidentNodes[1], vEntry = results[v], weight = weightFunc(e), distance = uEntry.distance + weight;
                if (weight < 0) {
                    throw new Error("dijkstra does not allow negative edge weights. Bad edge: " + e + " Weight: " + weight)
                }
                if (distance < vEntry.distance) {
                    vEntry.distance = distance;
                    vEntry.predecessor = u;
                    pq.decrease(v, distance)
                }
            }
            weightFunc = weightFunc || function() {
                return 1
            };
            incidentFunc = incidentFunc || (g.isDirected() ? function(u) {
                return g.outEdges(u)
            } : function(u) {
                return g.incidentEdges(u)
            });
            g.eachNode(function(u) {
                var distance = u === source ? 0: Number.POSITIVE_INFINITY;
                results[u] = {
                    distance: distance
                };
                pq.add(u, distance)
            });
            var u, uEntry;
            while (pq.size() > 0) {
                u = pq.removeMin();
                uEntry = results[u];
                if (uEntry.distance === Number.POSITIVE_INFINITY) {
                    break
                }
                incidentFunc(u).forEach(updateNeighbors)
            }
            return results
        }
    }, {
        "cp-data": 19
    }
    ], 32 : [function(require, module, exports) {
        var dijkstra = require("./dijkstra");
        module.exports = dijkstraAll;
        function dijkstraAll(g, weightFunc, incidentFunc) {
            var results = {};
            g.eachNode(function(u) {
                results[u] = dijkstra(g, u, weightFunc, incidentFunc)
            });
            return results
        }
    }, {
        "./dijkstra": 31
    }
    ], 33 : [function(require, module, exports) {
        var tarjan = require("./tarjan");
        module.exports = findCycles;
        function findCycles(g) {
            return tarjan(g).filter(function(cmpt) {
                return cmpt.length > 1
            })
        }
    }, {
        "./tarjan": 39
    }
    ], 34 : [function(require, module, exports) {
        module.exports = floydWarshall;
        function floydWarshall(g, weightFunc, incidentFunc) {
            var results = {}, nodes = g.nodes();
            weightFunc = weightFunc || function() {
                return 1
            };
            incidentFunc = incidentFunc || (g.isDirected() ? function(u) {
                return g.outEdges(u)
            } : function(u) {
                return g.incidentEdges(u)
            });
            nodes.forEach(function(u) {
                results[u] = {};
                results[u][u] = {
                    distance: 0
                };
                nodes.forEach(function(v) {
                    if (u !== v) {
                        results[u][v] = {
                            distance: Number.POSITIVE_INFINITY
                        }
                    }
                });
                incidentFunc(u).forEach(function(e) {
                    var incidentNodes = g.incidentNodes(e), v = incidentNodes[0] !== u ? incidentNodes[0]: incidentNodes[1], d = weightFunc(e);
                    if (d < results[u][v].distance) {
                        results[u][v] = {
                            distance: d,
                            predecessor: u
                        }
                    }
                })
            });
            nodes.forEach(function(k) {
                var rowK = results[k];
                nodes.forEach(function(i) {
                    var rowI = results[i];
                    nodes.forEach(function(j) {
                        var ik = rowI[k];
                        var kj = rowK[j];
                        var ij = rowI[j];
                        var altDistance = ik.distance + kj.distance;
                        if (altDistance < ij.distance) {
                            ij.distance = altDistance;
                            ij.predecessor = kj.predecessor
                        }
                    })
                })
            });
            return results
        }
    }, {}
    ], 35 : [function(require, module, exports) {
        var topsort = require("./topsort");
        module.exports = isAcyclic;
        function isAcyclic(g) {
            try {
                topsort(g)
            } catch (e) {
                if (e instanceof topsort.CycleException)
                    return false;
                throw e
            }
            return true
        }
    }, {
        "./topsort": 40
    }
    ], 36 : [function(require, module, exports) {
        var Set = require("cp-data").Set;
        module.exports = postorder;
        function postorder(g, root, f) {
            var visited = new Set;
            if (g.isDirected()) {
                throw new Error("This function only works for undirected graphs")
            }
            function dfs(u, prev) {
                if (visited.has(u)) {
                    throw new Error("The input graph is not a tree: " + g)
                }
                visited.add(u);
                g.neighbors(u).forEach(function(v) {
                    if (v !== prev)
                        dfs(v, u)
                });
                f(u)
            }
            dfs(root)
        }
    }, {
        "cp-data": 19
    }
    ], 37 : [function(require, module, exports) {
        var Set = require("cp-data").Set;
        module.exports = preorder;
        function preorder(g, root, f) {
            var visited = new Set;
            if (g.isDirected()) {
                throw new Error("This function only works for undirected graphs")
            }
            function dfs(u, prev) {
                if (visited.has(u)) {
                    throw new Error("The input graph is not a tree: " + g)
                }
                visited.add(u);
                f(u);
                g.neighbors(u).forEach(function(v) {
                    if (v !== prev)
                        dfs(v, u)
                })
            }
            dfs(root)
        }
    }, {
        "cp-data": 19
    }
    ], 38 : [function(require, module, exports) {
        var Graph = require("../Graph"), PriorityQueue = require("cp-data").PriorityQueue;
        module.exports = prim;
        function prim(g, weightFunc) {
            var result = new Graph, parents = {}, pq = new PriorityQueue, u;
            function updateNeighbors(e) {
                var incidentNodes = g.incidentNodes(e), v = incidentNodes[0] !== u ? incidentNodes[0]: incidentNodes[1], pri = pq.priority(v);
                if (pri !== undefined) {
                    var edgeWeight = weightFunc(e);
                    if (edgeWeight < pri) {
                        parents[v] = u;
                        pq.decrease(v, edgeWeight)
                    }
                }
            }
            if (g.order() === 0) {
                return result
            }
            g.eachNode(function(u) {
                pq.add(u, Number.POSITIVE_INFINITY);
                result.addNode(u)
            });
            pq.decrease(g.nodes()[0], 0);
            var init = false;
            while (pq.size() > 0) {
                u = pq.removeMin();
                if (u in parents) {
                    result.addEdge(null, u, parents[u])
                } else if (init) {
                    throw new Error("Input graph is not connected: " + g)
                } else {
                    init = true
                }
                g.incidentEdges(u).forEach(updateNeighbors)
            }
            return result
        }
    }, {
        "../Graph": 29,
        "cp-data": 19
    }
    ], 39 : [function(require, module, exports) {
        module.exports = tarjan;
        function tarjan(g) {
            if (!g.isDirected()) {
                throw new Error("tarjan can only be applied to a directed graph. Bad input: " + g)
            }
            var index = 0, stack = [], visited = {}, results = [];
            function dfs(u) {
                var entry = visited[u] = {
                    onStack: true,
                    lowlink: index,
                    index: index++
                };
                stack.push(u);
                g.successors(u).forEach(function(v) {
                    if (!(v in visited)) {
                        dfs(v);
                        entry.lowlink = Math.min(entry.lowlink, visited[v].lowlink)
                    } else if (visited[v].onStack) {
                        entry.lowlink = Math.min(entry.lowlink, visited[v].index)
                    }
                });
                if (entry.lowlink === entry.index) {
                    var cmpt = [], v;
                    do {
                        v = stack.pop();
                        visited[v].onStack = false;
                        cmpt.push(v)
                    }
                    while (u !== v);
                    results.push(cmpt)
                }
            }
            g.nodes().forEach(function(u) {
                if (!(u in visited)) {
                    dfs(u)
                }
            });
            return results
        }
    }, {}
    ], 40 : [function(require, module, exports) {
        module.exports = topsort;
        topsort.CycleException = CycleException;
        function topsort(g) {
            if (!g.isDirected()) {
                throw new Error("topsort can only be applied to a directed graph. Bad input: " + g)
            }
            var visited = {};
            var stack = {};
            var results = [];
            function visit(node) {
                if (node in stack) {
                    throw new CycleException
                }
                if (!(node in visited)) {
                    stack[node] = true;
                    visited[node] = true;
                    g.predecessors(node).forEach(function(pred) {
                        visit(pred)
                    });
                    delete stack[node];
                    results.push(node)
                }
            }
            var sinks = g.sinks();
            if (g.order() !== 0 && sinks.length === 0) {
                throw new CycleException
            }
            g.sinks().forEach(function(sink) {
                visit(sink)
            });
            return results
        }
        function CycleException() {}
        CycleException.prototype.toString = function() {
            return "Graph has at least one cycle"
        }
    }, {}
    ], 41 : [function(require, module, exports) {
        var Set = require("cp-data").Set;
        module.exports = compoundify;
        function compoundify(SuperConstructor) {
            function Constructor() {
                SuperConstructor.call(this);
                this._parents = {};
                this._children = {};
                this._children[null] = new Set
            }
            Constructor.prototype = new SuperConstructor;
            Constructor.prototype.constructor = Constructor;
            Constructor.prototype.parent = function(u, parent) {
                this._strictGetNode(u);
                if (arguments.length < 2) {
                    return this._parents[u]
                }
                if (u === parent) {
                    throw new Error("Cannot make " + u + " a parent of itself")
                }
                if (parent !== null) {
                    this._strictGetNode(parent)
                }
                this._children[this._parents[u]].remove(u);
                this._parents[u] = parent;
                this._children[parent].add(u)
            };
            Constructor.prototype.children = function(u) {
                if (u !== null) {
                    this._strictGetNode(u)
                }
                return this._children[u].keys()
            };
            Constructor.prototype.addNode = function(u, value) {
                u = SuperConstructor.prototype.addNode.call(this, u, value);
                this._parents[u] = null;
                this._children[u] = new Set;
                this._children[null].add(u);
                return u
            };
            Constructor.prototype.delNode = function(u) {
                var parent = this.parent(u);
                this._children[u].keys().forEach(function(child) {
                    this.parent(child, parent)
                }, this);
                this._children[parent].remove(u);
                delete this._parents[u];
                delete this._children[u];
                return SuperConstructor.prototype.delNode.call(this, u)
            };
            Constructor.prototype.copy = function() {
                var copy = SuperConstructor.prototype.copy.call(this);
                this.nodes().forEach(function(u) {
                    copy.parent(u, this.parent(u))
                }, this);
                return copy
            };
            Constructor.prototype.filterNodes = function(filter) {
                var self = this, copy = SuperConstructor.prototype.filterNodes.call(this, filter);
                var parents = {};
                function findParent(u) {
                    var parent = self.parent(u);
                    if (parent === null || copy.hasNode(parent)) {
                        parents[u] = parent;
                        return parent
                    } else if (parent in parents) {
                        return parents[parent]
                    } else {
                        return findParent(parent)
                    }
                }
                copy.eachNode(function(u) {
                    copy.parent(u, findParent(u))
                });
                return copy
            };
            return Constructor
        }
    }, {
        "cp-data": 19
    }
    ], 42 : [function(require, module, exports) {
        var Graph = require("../Graph"), Digraph = require("../Digraph"), CGraph = require("../CGraph"), CDigraph = require("../CDigraph");
        exports.decode = function(nodes, edges, Ctor) {
            Ctor = Ctor || Digraph;
            if (typeOf(nodes) !== "Array") {
                throw new Error("nodes is not an Array")
            }
            if (typeOf(edges) !== "Array") {
                throw new Error("edges is not an Array")
            }
            if (typeof Ctor === "string") {
                switch (Ctor) {
                case"graph":
                    Ctor = Graph;
                    break;
                case"digraph":
                    Ctor = Digraph;
                    break;
                case"cgraph":
                    Ctor = CGraph;
                    break;
                case"cdigraph":
                    Ctor = CDigraph;
                    break;
                default:
                    throw new Error("Unrecognized graph type: " + Ctor)
                }
            }
            var graph = new Ctor;
            nodes.forEach(function(u) {
                graph.addNode(u.id, u.value)
            });
            if (graph.parent) {
                nodes.forEach(function(u) {
                    if (u.children) {
                        u.children.forEach(function(v) {
                            graph.parent(v, u.id)
                        })
                    }
                })
            }
            edges.forEach(function(e) {
                graph.addEdge(e.id, e.u, e.v, e.value)
            });
            return graph
        };
        exports.encode = function(graph) {
            var nodes = [];
            var edges = [];
            graph.eachNode(function(u, value) {
                var node = {
                    id: u,
                    value: value
                };
                if (graph.children) {
                    var children = graph.children(u);
                    if (children.length) {
                        node.children = children
                    }
                }
                nodes.push(node)
            });
            graph.eachEdge(function(e, u, v, value) {
                edges.push({
                    id: e,
                    u: u,
                    v: v,
                    value: value
                })
            });
            var type;
            if (graph instanceof CDigraph) {
                type = "cdigraph"
            } else if (graph instanceof CGraph) {
                type = "cgraph"
            } else if (graph instanceof Digraph) {
                type = "digraph"
            } else if (graph instanceof Graph) {
                type = "graph"
            } else {
                throw new Error("Couldn't determine type of graph: " + graph)
            }
            return {
                nodes: nodes,
                edges: edges,
                type: type
            }
        };
        function typeOf(obj) {
            return Object.prototype.toString.call(obj).slice(8, - 1)
        }
    }, {
        "../CDigraph": 26,
        "../CGraph": 27,
        "../Digraph": 28,
        "../Graph": 29
    }
    ], 43 : [function(require, module, exports) {
        var Set = require("cp-data").Set;
        exports.all = function() {
            return function() {
                return true
            }
        };
        exports.nodesFromList = function(nodes) {
            var set = new Set(nodes);
            return function(u) {
                return set.has(u)
            }
        }
    }, {
        "cp-data": 19
    }
    ], 44 : [function(require, module, exports) {
        var Graph = require("./Graph"), Digraph = require("./Digraph");
        Graph.prototype.toDigraph = Graph.prototype.asDirected = function() {
            var g = new Digraph;
            this.eachNode(function(u, value) {
                g.addNode(u, value)
            });
            this.eachEdge(function(e, u, v, value) {
                g.addEdge(null, u, v, value);
                g.addEdge(null, v, u, value)
            });
            return g
        };
        Digraph.prototype.toGraph = Digraph.prototype.asUndirected = function() {
            var g = new Graph;
            this.eachNode(function(u, value) {
                g.addNode(u, value)
            });
            this.eachEdge(function(e, u, v, value) {
                g.addEdge(e, u, v, value)
            });
            return g
        }
    }, {
        "./Digraph": 28,
        "./Graph": 29
    }
    ], 45 : [function(require, module, exports) {
        exports.values = function(o) {
            var ks = Object.keys(o), len = ks.length, result = new Array(len), i;
            for (i = 0; i < len; ++i) {
                result[i] = o[ks[i]]
            }
            return result
        }
    }, {}
    ], 46 : [function(require, module, exports) {
        module.exports = "0.7.4"
    }, {}
    ]
}, {}, [1]);
joint.layout.DirectedGraph = {
    layout: function(graph, opt) {
        opt = opt || {};
        var inputGraph = this._prepareData(graph);
        var runner = dagre.layout();
        if (opt.debugLevel) {
            runner.debugLevel(opt.debugLevel)
        }
        if (opt.rankDir) {
            runner.rankDir(opt.rankDir)
        }
        if (opt.rankSep) {
            runner.rankSep(opt.rankSep)
        }
        if (opt.edgeSep) {
            runner.edgeSep(opt.edgeSep)
        }
        if (opt.nodeSep) {
            runner.nodeSep(opt.nodeSep)
        }
        var layoutGraph = runner.run(inputGraph);
        layoutGraph.eachNode(function(u, value) {
            if (!value.dummy) {
                var cell = graph.getCell(u);
                opt.setPosition ? opt.setPosition(cell, value) : graph.get("cells").get(u).set("position", {
                    x: value.x - value.width / 2,
                    y: value.y - value.height / 2
                })
            }
        });
        if (opt.setLinkVertices) {
            layoutGraph.eachEdge(function(e, u, v, value) {
                var link = graph.getCell(e);
                if (link) {
                    opt.setVertices ? opt.setVertices(link, value.points) : link.set("vertices", value.points)
                }
            })
        }
        return {
            width: layoutGraph.graph().width,
            height: layoutGraph.graph().height
        }
    },
    _prepareData: function(graph) {
        var dagreGraph = new dagre.Digraph;
        _.each(graph.getElements(), function(cell) {
            if (dagreGraph.hasNode(cell.id))
                return;
            dagreGraph.addNode(cell.id, {
                width: cell.get("size").width,
                height: cell.get("size").height,
                rank: cell.get("rank")
            })
        });
        _.each(graph.getLinks(), function(cell) {
            if (dagreGraph.hasEdge(cell.id))
                return;
            var sourceId = cell.get("source").id;
            var targetId = cell.get("target").id;
            dagreGraph.addEdge(cell.id, sourceId, targetId, {
                minLen: cell.get("minLen") || 1
            })
        });
        return dagreGraph
    }
};
joint.ui.PaperScroller = Backbone.View.extend({
    className: "paper-scroller",
    events: {
        mousedown: "pointerdown",
        mousemove: "pointermove",
        touchmove: "pointermove",
        mouseout: "stopPanning"
    },
    options: {
        paper: undefined,
        padding: 0,
        autoResizePaper: false
    },
    initialize: function(options) {
        this.options = _.extend({}, _.result(this, "options"), options || {});
        _.bindAll(this, "startPanning", "stopPanning");
        this.$el.append(this.options.paper.el);
        this.addPadding();
        this.listenTo(this.options.paper, "scale", function(ox, oy) {
            this.adjustPaper();
            if (ox || oy)
                this.center(ox, oy)
        });
        this.listenTo(this.options.paper, "resize", function() {
            this.adjustPaper();
            if (this._center)
                this.center(this._center.x, this._center.y)
        });
        if (this.options.autoResizePaper) {
            var ow = this.options.paper.options.width;
            var oh = this.options.paper.options.height;
            this.listenTo(this.options.paper.model, "all", function(event) {
                if (_.contains(["change", "batch:start", "batch:stop"], event))
                    return;
                this._center = this.toLocalPoint(this.el.clientWidth / 2, this.el.clientHeight / 2);
                this.options.paper.fitToContent(ow, oh, 0, {
                    fitNegative: true
                })
            })
        }
        $(document.body).on("mouseup.stopPanning touchend.stopPanning", this.stopPanning)
    },
    toLocalPoint: function(x, y) {
        var ctm = this.options.paper.viewport.getCTM();
        x += this.el.scrollLeft - this.padding.paddingLeft - ctm.e;
        x/=ctm.a;
        y += this.el.scrollTop - this.padding.paddingTop - ctm.f;
        y/=ctm.d;
        return g.point(x, y)
    },
    adjustPaper: function() {
        var paper = this.options.paper;
        var scale = V(paper.viewport).scale();
        var w = paper.options.width * scale.sx;
        var h = paper.options.height * scale.sy;
        var tx = paper.options.origin.x * scale.sx;
        var ty = paper.options.origin.y * scale.sy;
        V(paper.svg).attr({
            width: w,
            height: h
        });
        V(paper.viewport).translate( - tx, - ty, {
            absolute: true
        })
    },
    center: function(x, y) {
        var ctm = this.options.paper.viewport.getCTM();
        var x1 =- ctm.e;
        var y1 =- ctm.f;
        var x2 = x1 + ctm.a * this.options.paper.options.width;
        var y2 = y1 + ctm.d * this.options.paper.options.height;
        if (_.isUndefined(x) || _.isUndefined(y)) {
            x = (x1 + x2) / 2;
            y = (y1 + y2) / 2
        } else {
            x*=ctm.a;
            y*=ctm.d
        }
        var p = this.options.padding;
        var cx = this.el.clientWidth / 2;
        var cy = this.el.clientHeight / 2;
        var left = cx - p - x + x1;
        var right = cx - p + x - x2;
        var top = cy - p - y + y1;
        var bottom = cy - p + y - y2;
        this.addPadding(Math.max(left, 0), Math.max(right, 0), Math.max(top, 0), Math.max(bottom, 0));
        this.el.scrollLeft = x - cx + ctm.e + this.padding.paddingLeft;
        this.el.scrollTop = y - cy + ctm.f + this.padding.paddingTop
    },
    centerContent: function() {
        var vbox = V(this.options.paper.viewport).bbox(true, this.options.paper.svg);
        this.center(vbox.x + vbox.width / 2, vbox.y + vbox.height / 2)
    },
    addPadding: function(left, right, top, bottom) {
        var base = this.options.padding;
        var padding = this.padding = {
            paddingLeft: Math.round(base + (left || 0)),
            paddingTop: Math.round(base + (top || 0))
        };
        var margin = {
            marginBottom: Math.round(base + (bottom || 0)),
            marginRight: Math.round(base + (right || 0))
        };
        padding.paddingLeft = Math.min(padding.paddingLeft, this.el.clientWidth * .9);
        padding.paddingTop = Math.min(padding.paddingTop, this.el.clientHeight * .9);
        this.$el.css(padding);
        this.options.paper.$el.css(margin)
    },
    zoom: function(value, opt) {
        opt = opt || {};
        var sx = value;
        var sy = value;
        var current = V(this.options.paper.viewport).scale();
        if (!opt.absolute) {
            sx += current.sx;
            sy += current.sy
        }
        if ((!opt.max || sx < opt.max && sy < opt.max) && (!opt.min || sx > opt.min && sy > opt.min)) {
            var center = this.toLocalPoint(this.el.clientWidth / 2, this.el.clientHeight / 2);
            var ox, oy;
            if (_.isUndefined(opt.ox) || _.isUndefined(opt.oy)) {
                ox = center.x;
                oy = center.y
            } else {
                var fsx = sx / current.sx;
                var fsy = sy / current.sy;
                ox = opt.ox - (opt.ox - center.x) / fsx;
                oy = opt.oy - (opt.oy - center.y) / fsy
            }
            this.options.paper.scale(sx, sy, ox, oy)
        }
    },
    startPanning: function(evt) {
        evt = joint.util.normalizeEvent(evt);
        this._panning = true;
        this._clientX = evt.clientX;
        this._clientY = evt.clientY
    },
    pan: function(evt) {
        if (!this._panning)
            return;
        evt = joint.util.normalizeEvent(evt);
        var dx = evt.clientX - this._clientX;
        var dy = evt.clientY - this._clientY;
        this.el.scrollTop -= dy;
        this.el.scrollLeft -= dx;
        this._clientX = evt.clientX;
        this._clientY = evt.clientY
    },
    stopPanning: function() {
        delete this._panning
    },
    pointerdown: function(evt) {
        if (evt.target == this.el) {
            this.options.paper.pointerdown.apply(this.options.paper, arguments)
        }
    },
    pointermove: function(evt) {
        this.pan.apply(this, arguments);
        if (evt.target == this.el) {
            this.options.paper.pointermove.apply(this.options.paper, arguments)
        }
    },
    remove: function() {
        Backbone.View.prototype.remove.apply(this, arguments);
        $(document.body).off(".stopPanning", this.stopPanning)
    }
});
joint.ui.Tooltip = Backbone.View.extend({
    className: "tooltip",
    options: {
        left: undefined,
        right: undefined,
        top: undefined,
        bottom: undefined,
        padding: 10,
        target: undefined,
        rootTarget: undefined
    },
    initialize: function(options) {
        this.options = _.extend({}, _.result(this, "options"), options || {});
        _.bindAll(this, "render", "hide", "position");
        if (this.options.rootTarget) {
            this.$rootTarget = $(this.options.rootTarget);
            this.$rootTarget.on("mouseover", this.options.target, this.render);
            this.$rootTarget.on("mouseout", this.options.target, this.hide);
            this.$rootTarget.on("mousedown", this.options.target, this.hide)
        } else {
            this.$target = $(this.options.target);
            this.$target.on("mouseover", this.render);
            this.$target.on("mouseout", this.hide);
            this.$target.on("mousedown", this.hide)
        }
        this.$el.addClass(this.options.direction)
    },
    remove: function() {
        this.$target.off("mouseover", this.render);
        this.$target.off("mouseout", this.hide);
        this.$target.off("mousedown", this.hide);
        Backbone.View.prototype.remove.apply(this, arguments)
    },
    hide: function() {
        Backbone.View.prototype.remove.apply(this, arguments)
    },
    render: function(evt) {
        var target;
        var isPoint=!_.isUndefined(evt.x)&&!_.isUndefined(evt.y);
        if (isPoint) {
            target = evt
        } else {
            this.$target = $(evt.target).closest(this.options.target);
            target = this.$target[0]
        }
        this.$el.html(_.isFunction(this.options.content) ? this.options.content(target) : this.options.content);
        this.$el.hide();
        $(document.body).append(this.$el);
        var $images = this.$("img");
        if ($images.length) {
            $images.on("load", _.bind(function() {
                this.position(isPoint ? target : undefined)
            }, this))
        } else {
            this.position(isPoint ? target : undefined)
        }
    },
    getElementBBox: function(el) {
        var $el = $(el);
        var offset = $el.offset();
        var bbox;
        var scrollTop = document.body.scrollTop || document.documentElement.scrollTop;
        var scrollLeft = document.body.scrollLeft || document.documentElement.scrollLeft;
        offset.top -= scrollTop || 0;
        offset.left -= scrollLeft || 0;
        if (el.ownerSVGElement) {
            bbox = V(el).bbox();
            bbox.x = offset.left;
            bbox.y = offset.top
        } else {
            bbox = {
                x: offset.left,
                y: offset.top,
                width: $el.outerWidth(),
                height: $el.outerHeight()
            }
        }
        return bbox
    },
    position: function(p) {
        var bbox;
        if (p) {
            bbox = {
                x: p.x,
                y: p.y,
                width: 1,
                height: 1
            }
        } else {
            bbox = this.getElementBBox(this.$target[0])
        }
        var padding = this.options.padding;
        this.$el.show();
        var height = this.$el.outerHeight();
        var width = this.$el.outerWidth();
        if (this.options.left) {
            var $left = $(_.isFunction(this.options.left) ? this.options.left(this.$target[0]) : this.options.left);
            var leftBbox = this.getElementBBox($left[0]);
            this.$el.css({
                left: leftBbox.x + leftBbox.width + padding,
                top: bbox.y + bbox.height / 2 - height / 2
            })
        } else if (this.options.right) {
            var $right = $(_.isFunction(this.options.right) ? this.options.right(this.$target[0]) : this.options.right);
            var rightBbox = this.getElementBBox($right[0]);
            this.$el.css({
                left: rightBbox.x - width - padding,
                top: bbox.y + bbox.height / 2 - height / 2
            })
        } else if (this.options.top) {
            var $top = $(_.isFunction(this.options.top) ? this.options.top(this.$target[0]) : this.options.top);
            var topBbox = this.getElementBBox($top[0]);
            this.$el.css({
                top: topBbox.y + topBbox.height + padding,
                left: bbox.x + bbox.width / 2 - width / 2
            })
        } else if (this.options.bottom) {
            var $bottom = $(_.isFunction(this.options.bottom) ? this.options.bottom(this.$target[0]) : this.options.bottom);
            var bottomBbox = this.getElementBBox($bottom[0]);
            this.$el.css({
                top: bottomBbox.y - height - padding,
                left: bbox.x + bbox.width / 2 - width / 2
            })
        } else {
            this.$el.css({
                left: bbox.x + bbox.width + padding,
                top: bbox.y + bbox.height / 2 - height / 2
            })
        }
    }
});
joint.dia.Paper.prototype.toSVG = function(opt) {
    opt = opt || {};
    var viewportTransform = V(this.viewport).attr("transform");
    V(this.viewport).attr("transform", "");
    var viewportBbox = this.getContentBBox();
    var svgClone = this.svg.cloneNode(true);
    V(this.viewport).attr("transform", viewportTransform || "");
    svgClone.removeAttribute("style");
    if (opt.preserveDimensions) {
        V(svgClone).attr({
            width: viewportBbox.width,
            height: viewportBbox.height
        })
    } else {
        V(svgClone).attr({
            width: "100%",
            height: "100%"
        })
    }
    V(svgClone).attr("viewBox", viewportBbox.x + " " + viewportBbox.y + " " + viewportBbox.width + " " + viewportBbox.height);
    var styleSheetsCount = document.styleSheets.length;
    var styleSheetsCopy = [];
    for (var i = styleSheetsCount - 1; i >= 0; i--) {
        styleSheetsCopy[i] = document.styleSheets[i];
        document.styleSheets[i].disabled = true
    }
    var defaultComputedStyles = {};
    $(this.svg).find("*").each(function(idx) {
        var computedStyle = window.getComputedStyle(this, null);
        var defaultComputedStyle = {};
        _.each(computedStyle, function(property) {
            defaultComputedStyle[property] = computedStyle.getPropertyValue(property)
        });
        defaultComputedStyles[idx] = defaultComputedStyle
    });
    if (styleSheetsCount != document.styleSheets.length) {
        _.each(styleSheetsCopy, function(copy, i) {
            document.styleSheets[i] = copy
        })
    }
    for (var i = 0; i < styleSheetsCount; i++) {
        document.styleSheets[i].disabled = false
    }
    var customStyles = {};
    $(this.svg).find("*").each(function(idx) {
        var computedStyle = window.getComputedStyle(this, null);
        var defaultComputedStyle = defaultComputedStyles[idx];
        var customStyle = {};
        _.each(computedStyle, function(property) {
            if (computedStyle.getPropertyValue(property) !== defaultComputedStyle[property]) {
                customStyle[property] = computedStyle.getPropertyValue(property)
            }
        });
        customStyles[idx] = customStyle
    });
    $(svgClone).find("*").each(function(idx) {
        $(this).css(customStyles[idx])
    });
    $(svgClone).find(".connection-wrap, .marker-vertices, .link-tools, .marker-arrowheads").remove();
    var svgString;
    try {
        var serializer = new XMLSerializer;
        svgString = serializer.serializeToString(svgClone)
    } catch (err) {
        console.error("Error serializing paper to SVG:", err)
    }
    var isChrome=!!window.chrome&&!window.opera;
    var isIE = navigator.appName == "Microsoft Internet Explorer";
    var isSafari = Object.prototype.toString.call(window.HTMLElement).indexOf("Constructor") > 0;
    if (isChrome) {}
    if (isIE) {
        var xmlns = 'xmlns="' + this.svg.namespaceURI + '"';
        var matches = svgString.match(new RegExp(xmlns, "g"));
        if (matches && matches.length >= 2)
            svgString = svgString.replace(new RegExp(xmlns), "")
    }
    if (isSafari) {
        svgString = svgString.replace('xlink="', 'xmlns:xlink="');
        svgString = svgString.replace(/href="/g, 'xlink:href="')
    }
    return svgString
};
joint.dia.Paper.prototype.openAsSVG = function() {
    var svg = this.toSVG();
    var windowFeatures = "menubar=yes,location=yes,resizable=yes,scrollbars=yes,status=yes";
    var windowName = _.uniqueId("svg_output");
    var dataImageUri = "data:image/svg+xml;base64," + btoa(unescape(encodeURIComponent(svg)));
    var imageWindow = window.open("", windowName, windowFeatures);
    imageWindow.document.write('<img src="' + dataImageUri + '" style="max-height:100%" />')
};
(function() {
    this.canvg = function(target, s, opts) {
        if (target == null && s == null && opts == null) {
            var svgTags = document.getElementsByTagName("svg");
            for (var i = 0; i < svgTags.length; i++) {
                var svgTag = svgTags[i];
                var c = document.createElement("canvas");
                c.width = svgTag.clientWidth;
                c.height = svgTag.clientHeight;
                svgTag.parentNode.insertBefore(c, svgTag);
                svgTag.parentNode.removeChild(svgTag);
                var div = document.createElement("div");
                div.appendChild(svgTag);
                canvg(c, div.innerHTML)
            }
            return 
        }
        opts = opts || {};
        if (typeof target == "string") {
            target = document.getElementById(target)
        }
        if (target.svg != null)
            target.svg.stop();
        var svg = build();
        if (!(target.childNodes.length == 1 && target.childNodes[0].nodeName == "OBJECT"))
            target.svg = svg;
        svg.opts = opts;
        var ctx = target.getContext("2d");
        if (typeof s.documentElement != "undefined") {
            svg.loadXmlDoc(ctx, s)
        } else if (s.substr(0, 1) == "<") {
            svg.loadXml(ctx, s)
        } else {
            svg.load(ctx, s)
        }
    };
    function build() {
        var svg = {};
        svg.FRAMERATE = 30;
        svg.MAX_VIRTUAL_PIXELS = 3e4;
        svg.init = function(ctx) {
            var uniqueId = 0;
            svg.UniqueId = function() {
                uniqueId++;
                return "canvg" + uniqueId
            };
            svg.Definitions = {};
            svg.Styles = {};
            svg.Animations = [];
            svg.Images = [];
            svg.ctx = ctx;
            svg.ViewPort = new function() {
                this.viewPorts = [];
                this.Clear = function() {
                    this.viewPorts = []
                };
                this.SetCurrent = function(width, height) {
                    this.viewPorts.push({
                        width: width,
                        height: height
                    })
                };
                this.RemoveCurrent = function() {
                    this.viewPorts.pop()
                };
                this.Current = function() {
                    return this.viewPorts[this.viewPorts.length - 1]
                };
                this.width = function() {
                    return this.Current().width
                };
                this.height = function() {
                    return this.Current().height
                };
                this.ComputeSize = function(d) {
                    if (d != null && typeof d == "number")
                        return d;
                    if (d == "x")
                        return this.width();
                    if (d == "y")
                        return this.height();
                    return Math.sqrt(Math.pow(this.width(), 2) + Math.pow(this.height(), 2)) / Math.sqrt(2)
                }
            }
        };
        svg.init();
        svg.ImagesLoaded = function() {
            for (var i = 0; i < svg.Images.length; i++) {
                if (!svg.Images[i].loaded)
                    return false
            }
            return true
        };
        svg.trim = function(s) {
            return s.replace(/^\s+|\s+$/g, "")
        };
        svg.compressSpaces = function(s) {
            return s.replace(/[\s\r\t\n]+/gm, " ")
        };
        svg.ajax = function(url) {
            var AJAX;
            if (window.XMLHttpRequest) {
                AJAX = new XMLHttpRequest
            } else {
                AJAX = new ActiveXObject("Microsoft.XMLHTTP")
            }
            if (AJAX) {
                AJAX.open("GET", url, false);
                AJAX.send(null);
                return AJAX.responseText
            }
            return null
        };
        svg.parseXml = function(xml) {
            if (window.DOMParser) {
                var parser = new DOMParser;
                return parser.parseFromString(xml, "text/xml")
            } else {
                xml = xml.replace(/<!DOCTYPE svg[^>]*>/, "");
                var xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
                xmlDoc.async = "false";
                xmlDoc.loadXML(xml);
                return xmlDoc
            }
        };
        svg.Property = function(name, value) {
            this.name = name;
            this.value = value
        };
        svg.Property.prototype.getValue = function() {
            return this.value
        };
        svg.Property.prototype.hasValue = function() {
            return this.value != null && this.value !== ""
        };
        svg.Property.prototype.numValue = function() {
            if (!this.hasValue())
                return 0;
            var n = parseFloat(this.value);
            if ((this.value + "").match(/%$/)) {
                n = n / 100
            }
            return n
        };
        svg.Property.prototype.valueOrDefault = function(def) {
            if (this.hasValue())
                return this.value;
            return def
        };
        svg.Property.prototype.numValueOrDefault = function(def) {
            if (this.hasValue())
                return this.numValue();
            return def
        };
        svg.Property.prototype.addOpacity = function(opacity) {
            var newValue = this.value;
            if (opacity != null && opacity != "" && typeof this.value == "string") {
                var color = new RGBColor(this.value);
                if (color.ok) {
                    newValue = "rgba(" + color.r + ", " + color.g + ", " + color.b + ", " + opacity + ")"
                }
            }
            return new svg.Property(this.name, newValue)
        };
        svg.Property.prototype.getDefinition = function() {
            var name = this.value.match(/#([^\)'"]+)/);
            if (name) {
                name = name[1]
            }
            if (!name) {
                name = this.value
            }
            return svg.Definitions[name]
        };
        svg.Property.prototype.isUrlDefinition = function() {
            return this.value.indexOf("url(") == 0
        };
        svg.Property.prototype.getFillStyleDefinition = function(e, opacityProp) {
            var def = this.getDefinition();
            if (def != null && def.createGradient) {
                return def.createGradient(svg.ctx, e, opacityProp)
            }
            if (def != null && def.createPattern) {
                if (def.getHrefAttribute().hasValue()) {
                    var pt = def.attribute("patternTransform");
                    def = def.getHrefAttribute().getDefinition();
                    if (pt.hasValue()) {
                        def.attribute("patternTransform", true).value = pt.value
                    }
                }
                return def.createPattern(svg.ctx, e)
            }
            return null
        };
        svg.Property.prototype.getDPI = function(viewPort) {
            return 96
        };
        svg.Property.prototype.getEM = function(viewPort) {
            var em = 12;
            var fontSize = new svg.Property("fontSize", svg.Font.Parse(svg.ctx.font).fontSize);
            if (fontSize.hasValue())
                em = fontSize.toPixels(viewPort);
            return em
        };
        svg.Property.prototype.getUnits = function() {
            var s = this.value + "";
            return s.replace(/[0-9\.\-]/g, "")
        };
        svg.Property.prototype.toPixels = function(viewPort, processPercent) {
            if (!this.hasValue())
                return 0;
            var s = this.value + "";
            if (s.match(/em$/))
                return this.numValue() * this.getEM(viewPort);
            if (s.match(/ex$/))
                return this.numValue() * this.getEM(viewPort) / 2;
            if (s.match(/px$/))
                return this.numValue();
            if (s.match(/pt$/))
                return this.numValue() * this.getDPI(viewPort) * (1 / 72);
            if (s.match(/pc$/))
                return this.numValue() * 15;
            if (s.match(/cm$/))
                return this.numValue() * this.getDPI(viewPort) / 2.54;
            if (s.match(/mm$/))
                return this.numValue() * this.getDPI(viewPort) / 25.4;
            if (s.match(/in$/))
                return this.numValue() * this.getDPI(viewPort);
            if (s.match(/%$/))
                return this.numValue() * svg.ViewPort.ComputeSize(viewPort);
            var n = this.numValue();
            if (processPercent && n < 1)
                return n * svg.ViewPort.ComputeSize(viewPort);
            return n
        };
        svg.Property.prototype.toMilliseconds = function() {
            if (!this.hasValue())
                return 0;
            var s = this.value + "";
            if (s.match(/s$/))
                return this.numValue() * 1e3;
            if (s.match(/ms$/))
                return this.numValue();
            return this.numValue()
        };
        svg.Property.prototype.toRadians = function() {
            if (!this.hasValue())
                return 0;
            var s = this.value + "";
            if (s.match(/deg$/))
                return this.numValue() * (Math.PI / 180);
            if (s.match(/grad$/))
                return this.numValue() * (Math.PI / 200);
            if (s.match(/rad$/))
                return this.numValue();
            return this.numValue() * (Math.PI / 180)
        };
        svg.Font = new function() {
            this.Styles = "normal|italic|oblique|inherit";
            this.Variants = "normal|small-caps|inherit";
            this.Weights = "normal|bold|bolder|lighter|100|200|300|400|500|600|700|800|900|inherit";
            this.CreateFont = function(fontStyle, fontVariant, fontWeight, fontSize, fontFamily, inherit) {
                var f = inherit != null ? this.Parse(inherit): this.CreateFont("", "", "", "", "", svg.ctx.font);
                return {
                    fontFamily: fontFamily || f.fontFamily,
                    fontSize: fontSize || f.fontSize,
                    fontStyle: fontStyle || f.fontStyle,
                    fontWeight: fontWeight || f.fontWeight,
                    fontVariant: fontVariant || f.fontVariant,
                    toString: function() {
                        return [this.fontStyle, this.fontVariant, this.fontWeight, this.fontSize, this.fontFamily].join(" ")
                    }
                }
            };
            var that = this;
            this.Parse = function(s) {
                var f = {};
                var d = svg.trim(svg.compressSpaces(s || "")).split(" ");
                var set = {
                    fontSize: false,
                    fontStyle: false,
                    fontWeight: false,
                    fontVariant: false
                };
                var ff = "";
                for (var i = 0; i < d.length; i++) {
                    if (!set.fontStyle && that.Styles.indexOf(d[i])!=-1) {
                        if (d[i] != "inherit")
                            f.fontStyle = d[i];
                        set.fontStyle = true
                    } else if (!set.fontVariant && that.Variants.indexOf(d[i])!=-1) {
                        if (d[i] != "inherit")
                            f.fontVariant = d[i];
                        set.fontStyle = set.fontVariant = true
                    } else if (!set.fontWeight && that.Weights.indexOf(d[i])!=-1) {
                        if (d[i] != "inherit")
                            f.fontWeight = d[i];
                        set.fontStyle = set.fontVariant = set.fontWeight = true
                    } else if (!set.fontSize) {
                        if (d[i] != "inherit")
                            f.fontSize = d[i].split("/")[0];
                        set.fontStyle = set.fontVariant = set.fontWeight = set.fontSize = true
                    } else {
                        if (d[i] != "inherit")
                            ff += d[i]
                    }
                }
                if (ff != "")
                    f.fontFamily = ff;
                return f
            }
        };
        svg.ToNumberArray = function(s) {
            var a = svg.trim(svg.compressSpaces((s || "").replace(/,/g, " "))).split(" ");
            for (var i = 0; i < a.length; i++) {
                a[i] = parseFloat(a[i])
            }
            return a
        };
        svg.Point = function(x, y) {
            this.x = x;
            this.y = y
        };
        svg.Point.prototype.angleTo = function(p) {
            return Math.atan2(p.y - this.y, p.x - this.x)
        };
        svg.Point.prototype.applyTransform = function(v) {
            var xp = this.x * v[0] + this.y * v[2] + v[4];
            var yp = this.x * v[1] + this.y * v[3] + v[5];
            this.x = xp;
            this.y = yp
        };
        svg.CreatePoint = function(s) {
            var a = svg.ToNumberArray(s);
            return new svg.Point(a[0], a[1])
        };
        svg.CreatePath = function(s) {
            var a = svg.ToNumberArray(s);
            var path = [];
            for (var i = 0; i < a.length; i += 2) {
                path.push(new svg.Point(a[i], a[i + 1]))
            }
            return path
        };
        svg.BoundingBox = function(x1, y1, x2, y2) {
            this.x1 = Number.NaN;
            this.y1 = Number.NaN;
            this.x2 = Number.NaN;
            this.y2 = Number.NaN;
            this.x = function() {
                return this.x1
            };
            this.y = function() {
                return this.y1
            };
            this.width = function() {
                return this.x2 - this.x1
            };
            this.height = function() {
                return this.y2 - this.y1
            };
            this.addPoint = function(x, y) {
                if (x != null) {
                    if (isNaN(this.x1) || isNaN(this.x2)) {
                        this.x1 = x;
                        this.x2 = x
                    }
                    if (x < this.x1)
                        this.x1 = x;
                    if (x > this.x2)
                        this.x2 = x
                }
                if (y != null) {
                    if (isNaN(this.y1) || isNaN(this.y2)) {
                        this.y1 = y;
                        this.y2 = y
                    }
                    if (y < this.y1)
                        this.y1 = y;
                    if (y > this.y2)
                        this.y2 = y
                }
            };
            this.addX = function(x) {
                this.addPoint(x, null)
            };
            this.addY = function(y) {
                this.addPoint(null, y)
            };
            this.addBoundingBox = function(bb) {
                this.addPoint(bb.x1, bb.y1);
                this.addPoint(bb.x2, bb.y2)
            };
            this.addQuadraticCurve = function(p0x, p0y, p1x, p1y, p2x, p2y) {
                var cp1x = p0x + 2 / 3 * (p1x - p0x);
                var cp1y = p0y + 2 / 3 * (p1y - p0y);
                var cp2x = cp1x + 1 / 3 * (p2x - p0x);
                var cp2y = cp1y + 1 / 3 * (p2y - p0y);
                this.addBezierCurve(p0x, p0y, cp1x, cp2x, cp1y, cp2y, p2x, p2y)
            };
            this.addBezierCurve = function(p0x, p0y, p1x, p1y, p2x, p2y, p3x, p3y) {
                var p0 = [p0x, p0y], p1 = [p1x, p1y], p2 = [p2x, p2y], p3 = [p3x, p3y];
                this.addPoint(p0[0], p0[1]);
                this.addPoint(p3[0], p3[1]);
                for (i = 0; i <= 1; i++) {
                    var f = function(t) {
                        return Math.pow(1 - t, 3) * p0[i] + 3 * Math.pow(1 - t, 2) * t * p1[i] + 3 * (1 - t) * Math.pow(t, 2) * p2[i] + Math.pow(t, 3) * p3[i]
                    };
                    var b = 6 * p0[i] - 12 * p1[i] + 6 * p2[i];
                    var a =- 3 * p0[i] + 9 * p1[i] - 9 * p2[i] + 3 * p3[i];
                    var c = 3 * p1[i] - 3 * p0[i];
                    if (a == 0) {
                        if (b == 0)
                            continue;
                        var t =- c / b;
                        if (0 < t && t < 1) {
                            if (i == 0)
                                this.addX(f(t));
                            if (i == 1)
                                this.addY(f(t))
                            }
                        continue
                    }
                    var b2ac = Math.pow(b, 2) - 4 * c * a;
                    if (b2ac < 0)
                        continue;
                    var t1 = ( - b + Math.sqrt(b2ac)) / (2 * a);
                    if (0 < t1 && t1 < 1) {
                        if (i == 0)
                            this.addX(f(t1));
                        if (i == 1)
                            this.addY(f(t1))
                        }
                    var t2 = ( - b - Math.sqrt(b2ac)) / (2 * a);
                    if (0 < t2 && t2 < 1) {
                        if (i == 0)
                            this.addX(f(t2));
                        if (i == 1)
                            this.addY(f(t2))
                        }
                }
            };
            this.isPointInBox = function(x, y) {
                return this.x1 <= x && x <= this.x2 && this.y1 <= y && y <= this.y2
            };
            this.addPoint(x1, y1);
            this.addPoint(x2, y2)
        };
        svg.Transform = function(v) {
            var that = this;
            this.Type = {};
            this.Type.translate = function(s) {
                this.p = svg.CreatePoint(s);
                this.apply = function(ctx) {
                    ctx.translate(this.p.x || 0, this.p.y || 0)
                };
                this.unapply = function(ctx) {
                    ctx.translate( - 1 * this.p.x || 0, - 1 * this.p.y || 0)
                };
                this.applyToPoint = function(p) {
                    p.applyTransform([1, 0, 0, 1, this.p.x || 0, this.p.y || 0])
                }
            };
            this.Type.rotate = function(s) {
                var a = svg.ToNumberArray(s);
                this.angle = new svg.Property("angle", a[0]);
                this.cx = a[1] || 0;
                this.cy = a[2] || 0;
                this.apply = function(ctx) {
                    ctx.translate(this.cx, this.cy);
                    ctx.rotate(this.angle.toRadians());
                    ctx.translate( - this.cx, - this.cy)
                };
                this.unapply = function(ctx) {
                    ctx.translate(this.cx, this.cy);
                    ctx.rotate( - 1 * this.angle.toRadians());
                    ctx.translate( - this.cx, - this.cy)
                };
                this.applyToPoint = function(p) {
                    var a = this.angle.toRadians();
                    p.applyTransform([1, 0, 0, 1, this.p.x || 0, this.p.y || 0]);
                    p.applyTransform([Math.cos(a), Math.sin(a), - Math.sin(a), Math.cos(a), 0, 0]);
                    p.applyTransform([1, 0, 0, 1, - this.p.x || 0, - this.p.y || 0])
                }
            };
            this.Type.scale = function(s) {
                this.p = svg.CreatePoint(s);
                this.apply = function(ctx) {
                    ctx.scale(this.p.x || 1, this.p.y || this.p.x || 1)
                };
                this.unapply = function(ctx) {
                    ctx.scale(1 / this.p.x || 1, 1 / this.p.y || this.p.x || 1)
                };
                this.applyToPoint = function(p) {
                    p.applyTransform([this.p.x || 0, 0, 0, this.p.y || 0, 0, 0])
                }
            };
            this.Type.matrix = function(s) {
                this.m = svg.ToNumberArray(s);
                this.apply = function(ctx) {
                    ctx.transform(this.m[0], this.m[1], this.m[2], this.m[3], this.m[4], this.m[5])
                };
                this.applyToPoint = function(p) {
                    p.applyTransform(this.m)
                }
            };
            this.Type.SkewBase = function(s) {
                this.base = that.Type.matrix;
                this.base(s);
                this.angle = new svg.Property("angle", s)
            };
            this.Type.SkewBase.prototype = new this.Type.matrix;
            this.Type.skewX = function(s) {
                this.base = that.Type.SkewBase;
                this.base(s);
                this.m = [1, 0, Math.tan(this.angle.toRadians()), 1, 0, 0]
            };
            this.Type.skewX.prototype = new this.Type.SkewBase;
            this.Type.skewY = function(s) {
                this.base = that.Type.SkewBase;
                this.base(s);
                this.m = [1, Math.tan(this.angle.toRadians()), 0, 1, 0, 0]
            };
            this.Type.skewY.prototype = new this.Type.SkewBase;
            this.transforms = [];
            this.apply = function(ctx) {
                for (var i = 0; i < this.transforms.length; i++) {
                    this.transforms[i].apply(ctx)
                }
            };
            this.unapply = function(ctx) {
                for (var i = this.transforms.length - 1; i >= 0; i--) {
                    this.transforms[i].unapply(ctx)
                }
            };
            this.applyToPoint = function(p) {
                for (var i = 0; i < this.transforms.length; i++) {
                    this.transforms[i].applyToPoint(p)
                }
            };
            var data = svg.trim(svg.compressSpaces(v)).replace(/\)(\s?,\s?)/g, ") ").split(/\s(?=[a-z])/);
            for (var i = 0; i < data.length; i++) {
                var type = svg.trim(data[i].split("(")[0]);
                var s = data[i].split("(")[1].replace(")", "");
                var transform = new this.Type[type](s);
                transform.type = type;
                this.transforms.push(transform)
            }
        };
        svg.AspectRatio = function(ctx, aspectRatio, width, desiredWidth, height, desiredHeight, minX, minY, refX, refY) {
            aspectRatio = svg.compressSpaces(aspectRatio);
            aspectRatio = aspectRatio.replace(/^defer\s/, "");
            var align = aspectRatio.split(" ")[0] || "xMidYMid";
            var meetOrSlice = aspectRatio.split(" ")[1] || "meet";
            var scaleX = width / desiredWidth;
            var scaleY = height / desiredHeight;
            var scaleMin = Math.min(scaleX, scaleY);
            var scaleMax = Math.max(scaleX, scaleY);
            if (meetOrSlice == "meet") {
                desiredWidth*=scaleMin;
                desiredHeight*=scaleMin
            }
            if (meetOrSlice == "slice") {
                desiredWidth*=scaleMax;
                desiredHeight*=scaleMax
            }
            refX = new svg.Property("refX", refX);
            refY = new svg.Property("refY", refY);
            if (refX.hasValue() && refY.hasValue()) {
                ctx.translate( - scaleMin * refX.toPixels("x"), - scaleMin * refY.toPixels("y"))
            } else {
                if (align.match(/^xMid/) && (meetOrSlice == "meet" && scaleMin == scaleY || meetOrSlice == "slice" && scaleMax == scaleY))
                    ctx.translate(width / 2 - desiredWidth / 2, 0);
                if (align.match(/YMid$/) && (meetOrSlice == "meet" && scaleMin == scaleX || meetOrSlice == "slice" && scaleMax == scaleX))
                    ctx.translate(0, height / 2 - desiredHeight / 2);
                if (align.match(/^xMax/) && (meetOrSlice == "meet" && scaleMin == scaleY || meetOrSlice == "slice" && scaleMax == scaleY))
                    ctx.translate(width - desiredWidth, 0);
                if (align.match(/YMax$/) && (meetOrSlice == "meet" && scaleMin == scaleX || meetOrSlice == "slice" && scaleMax == scaleX))
                    ctx.translate(0, height - desiredHeight)
            }
            if (align == "none")
                ctx.scale(scaleX, scaleY);
            else if (meetOrSlice == "meet")
                ctx.scale(scaleMin, scaleMin);
            else if (meetOrSlice == "slice")
                ctx.scale(scaleMax, scaleMax);
            ctx.translate(minX == null ? 0 : - minX, minY == null ? 0 : - minY)
        };
        svg.Element = {};
        svg.EmptyProperty = new svg.Property("EMPTY", "");
        svg.Element.ElementBase = function(node) {
            this.attributes = {};
            this.styles = {};
            this.children = [];
            this.attribute = function(name, createIfNotExists) {
                var a = this.attributes[name];
                if (a != null)
                    return a;
                if (createIfNotExists == true) {
                    a = new svg.Property(name, "");
                    this.attributes[name] = a
                }
                return a || svg.EmptyProperty
            };
            this.getHrefAttribute = function() {
                for (var a in this.attributes) {
                    if (a.match(/:href$/)) {
                        return this.attributes[a]
                    }
                }
                return svg.EmptyProperty
            };
            this.style = function(name, createIfNotExists) {
                var s = this.styles[name];
                if (s != null)
                    return s;
                var a = this.attribute(name);
                if (a != null && a.hasValue()) {
                    this.styles[name] = a;
                    return a
                }
                var p = this.parent;
                if (p != null) {
                    var ps = p.style(name);
                    if (ps != null && ps.hasValue()) {
                        return ps
                    }
                }
                if (createIfNotExists == true) {
                    s = new svg.Property(name, "");
                    this.styles[name] = s
                }
                return s || svg.EmptyProperty
            };
            this.render = function(ctx) {
                if (this.style("display").value == "none")
                    return;
                if (this.attribute("visibility").value == "hidden")
                    return;
                ctx.save();
                if (this.attribute("mask").hasValue()) {
                    var mask = this.attribute("mask").getDefinition();
                    if (mask != null)
                        mask.apply(ctx, this)
                } else if (this.style("filter").hasValue()) {
                    var filter = this.style("filter").getDefinition();
                    if (filter != null)
                        filter.apply(ctx, this)
                } else {
                    this.setContext(ctx);
                    this.renderChildren(ctx);
                    this.clearContext(ctx)
                }
                ctx.restore()
            };
            this.setContext = function(ctx) {};
            this.clearContext = function(ctx) {};
            this.renderChildren = function(ctx) {
                for (var i = 0; i < this.children.length; i++) {
                    this.children[i].render(ctx)
                }
            };
            this.addChild = function(childNode, create) {
                var child = childNode;
                if (create)
                    child = svg.CreateElement(childNode);
                child.parent = this;
                this.children.push(child)
            };
            if (node != null && node.nodeType == 1) {
                for (var i = 0; i < node.childNodes.length; i++) {
                    var childNode = node.childNodes[i];
                    if (childNode.nodeType == 1)
                        this.addChild(childNode, true);
                    if (this.captureTextNodes && childNode.nodeType == 3) {
                        var text = childNode.nodeValue || childNode.text || "";
                        if (svg.trim(svg.compressSpaces(text)) != "") {
                            this.addChild(new svg.Element.tspan(childNode), false)
                        }
                    }
                }
                for (var i = 0; i < node.attributes.length; i++) {
                    var attribute = node.attributes[i];
                    this.attributes[attribute.nodeName] = new svg.Property(attribute.nodeName, attribute.nodeValue)
                }
                var styles = svg.Styles[node.nodeName];
                if (styles != null) {
                    for (var name in styles) {
                        this.styles[name] = styles[name]
                    }
                }
                if (this.attribute("class").hasValue()) {
                    var classes = svg.compressSpaces(this.attribute("class").value).split(" ");
                    for (var j = 0; j < classes.length; j++) {
                        styles = svg.Styles["." + classes[j]];
                        if (styles != null) {
                            for (var name in styles) {
                                this.styles[name] = styles[name]
                            }
                        }
                        styles = svg.Styles[node.nodeName + "." + classes[j]];
                        if (styles != null) {
                            for (var name in styles) {
                                this.styles[name] = styles[name]
                            }
                        }
                    }
                }
                if (this.attribute("id").hasValue()) {
                    var styles = svg.Styles["#" + this.attribute("id").value];
                    if (styles != null) {
                        for (var name in styles) {
                            this.styles[name] = styles[name]
                        }
                    }
                }
                if (this.attribute("style").hasValue()) {
                    var styles = this.attribute("style").value.split(";");
                    for (var i = 0; i < styles.length; i++) {
                        if (svg.trim(styles[i]) != "") {
                            var style = styles[i].split(":");
                            var name = svg.trim(style[0]);
                            var value = svg.trim(style[1]);
                            this.styles[name] = new svg.Property(name, value)
                        }
                    }
                }
                if (this.attribute("id").hasValue()) {
                    if (svg.Definitions[this.attribute("id").value] == null) {
                        svg.Definitions[this.attribute("id").value] = this
                    }
                }
            }
        };
        svg.Element.RenderedElementBase = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.setContext = function(ctx) {
                if (this.style("fill").isUrlDefinition()) {
                    var fs = this.style("fill").getFillStyleDefinition(this, this.style("fill-opacity"));
                    if (fs != null)
                        ctx.fillStyle = fs
                } else if (this.style("fill").hasValue()) {
                    var fillStyle = this.style("fill");
                    if (fillStyle.value == "currentColor")
                        fillStyle.value = this.style("color").value;
                    ctx.fillStyle = fillStyle.value == "none" ? "rgba(0,0,0,0)" : fillStyle.value
                }
                if (this.style("fill-opacity").hasValue()) {
                    var fillStyle = new svg.Property("fill", ctx.fillStyle);
                    fillStyle = fillStyle.addOpacity(this.style("fill-opacity").value);
                    ctx.fillStyle = fillStyle.value
                }
                if (this.style("stroke").isUrlDefinition()) {
                    var fs = this.style("stroke").getFillStyleDefinition(this, this.style("stroke-opacity"));
                    if (fs != null)
                        ctx.strokeStyle = fs
                } else if (this.style("stroke").hasValue()) {
                    var strokeStyle = this.style("stroke");
                    if (strokeStyle.value == "currentColor")
                        strokeStyle.value = this.style("color").value;
                    ctx.strokeStyle = strokeStyle.value == "none" ? "rgba(0,0,0,0)" : strokeStyle.value
                }
                if (this.style("stroke-opacity").hasValue()) {
                    var strokeStyle = new svg.Property("stroke", ctx.strokeStyle);
                    strokeStyle = strokeStyle.addOpacity(this.style("stroke-opacity").value);
                    ctx.strokeStyle = strokeStyle.value
                }
                if (this.style("stroke-width").hasValue()) {
                    var newLineWidth = this.style("stroke-width").toPixels();
                    ctx.lineWidth = newLineWidth == 0 ? .001 : newLineWidth
                }
                if (this.style("stroke-linecap").hasValue())
                    ctx.lineCap = this.style("stroke-linecap").value;
                if (this.style("stroke-linejoin").hasValue())
                    ctx.lineJoin = this.style("stroke-linejoin").value;
                if (this.style("stroke-miterlimit").hasValue())
                    ctx.miterLimit = this.style("stroke-miterlimit").value;
                if (this.style("stroke-dasharray").hasValue()) {
                    var gaps = svg.ToNumberArray(this.style("stroke-dasharray").value);
                    if (typeof ctx.setLineDash != "undefined") {
                        ctx.setLineDash(gaps)
                    } else if (typeof ctx.webkitLineDash != "undefined") {
                        ctx.webkitLineDash = gaps
                    } else if (typeof ctx.mozDash != "undefined") {
                        ctx.mozDash = gaps
                    }
                    var offset = this.style("stroke-dashoffset").numValueOrDefault(1);
                    if (typeof ctx.lineDashOffset != "undefined") {
                        ctx.lineDashOffset = offset
                    } else if (typeof ctx.webkitLineDashOffset != "undefined") {
                        ctx.webkitLineDashOffset = offset
                    } else if (typeof ctx.mozDashOffset != "undefined") {
                        ctx.mozDashOffset = offset
                    }
                }
                if (typeof ctx.font != "undefined") {
                    ctx.font = svg.Font.CreateFont(this.style("font-style").value, this.style("font-variant").value, this.style("font-weight").value, this.style("font-size").hasValue() ? this.style("font-size").toPixels() + "px" : "", this.style("font-family").value).toString()
                }
                if (this.attribute("transform").hasValue()) {
                    var transform = new svg.Transform(this.attribute("transform").value);
                    transform.apply(ctx)
                }
                if (this.style("clip-path").hasValue()) {
                    var clip = this.style("clip-path").getDefinition();
                    if (clip != null)
                        clip.apply(ctx)
                }
                if (this.style("opacity").hasValue()) {
                    ctx.globalAlpha = this.style("opacity").numValue()
                }
            }
        };
        svg.Element.RenderedElementBase.prototype = new svg.Element.ElementBase;
        svg.Element.PathElementBase = function(node) {
            this.base = svg.Element.RenderedElementBase;
            this.base(node);
            this.path = function(ctx) {
                if (ctx != null)
                    ctx.beginPath();
                return new svg.BoundingBox
            };
            this.renderChildren = function(ctx) {
                this.path(ctx);
                svg.Mouse.checkPath(this, ctx);
                if (ctx.fillStyle != "") {
                    if (this.attribute("fill-rule").hasValue()) {
                        ctx.fill(this.attribute("fill-rule").value)
                    } else {
                        ctx.fill()
                    }
                }
                if (ctx.strokeStyle != "")
                    ctx.stroke();
                var markers = this.getMarkers();
                if (markers != null) {
                    if (this.style("marker-start").isUrlDefinition()) {
                        var marker = this.style("marker-start").getDefinition();
                        marker.render(ctx, markers[0][0], markers[0][1])
                    }
                    if (this.style("marker-mid").isUrlDefinition()) {
                        var marker = this.style("marker-mid").getDefinition();
                        for (var i = 1; i < markers.length - 1; i++) {
                            marker.render(ctx, markers[i][0], markers[i][1])
                        }
                    }
                    if (this.style("marker-end").isUrlDefinition()) {
                        var marker = this.style("marker-end").getDefinition();
                        marker.render(ctx, markers[markers.length - 1][0], markers[markers.length - 1][1])
                    }
                }
            };
            this.getBoundingBox = function() {
                return this.path()
            };
            this.getMarkers = function() {
                return null
            }
        };
        svg.Element.PathElementBase.prototype = new svg.Element.RenderedElementBase;
        svg.Element.svg = function(node) {
            this.base = svg.Element.RenderedElementBase;
            this.base(node);
            this.baseClearContext = this.clearContext;
            this.clearContext = function(ctx) {
                this.baseClearContext(ctx);
                svg.ViewPort.RemoveCurrent()
            };
            this.baseSetContext = this.setContext;
            this.setContext = function(ctx) {
                ctx.strokeStyle = "rgba(0,0,0,0)";
                ctx.lineCap = "butt";
                ctx.lineJoin = "miter";
                ctx.miterLimit = 4;
                this.baseSetContext(ctx);
                if (!this.attribute("x").hasValue())
                    this.attribute("x", true).value = 0;
                if (!this.attribute("y").hasValue())
                    this.attribute("y", true).value = 0;
                ctx.translate(this.attribute("x").toPixels("x"), this.attribute("y").toPixels("y"));
                var width = svg.ViewPort.width();
                var height = svg.ViewPort.height();
                if (!this.attribute("width").hasValue())
                    this.attribute("width", true).value = "100%";
                if (!this.attribute("height").hasValue())
                    this.attribute("height", true).value = "100%";
                if (typeof this.root == "undefined") {
                    width = this.attribute("width").toPixels("x");
                    height = this.attribute("height").toPixels("y");
                    var x = 0;
                    var y = 0;
                    if (this.attribute("refX").hasValue() && this.attribute("refY").hasValue()) {
                        x =- this.attribute("refX").toPixels("x");
                        y =- this.attribute("refY").toPixels("y")
                    }
                    ctx.beginPath();
                    ctx.moveTo(x, y);
                    ctx.lineTo(width, y);
                    ctx.lineTo(width, height);
                    ctx.lineTo(x, height);
                    ctx.closePath();
                    ctx.clip()
                }
                svg.ViewPort.SetCurrent(width, height);
                if (this.attribute("viewBox").hasValue()) {
                    var viewBox = svg.ToNumberArray(this.attribute("viewBox").value);
                    var minX = viewBox[0];
                    var minY = viewBox[1];
                    width = viewBox[2];
                    height = viewBox[3];
                    svg.AspectRatio(ctx, this.attribute("preserveAspectRatio").value, svg.ViewPort.width(), width, svg.ViewPort.height(), height, minX, minY, this.attribute("refX").value, this.attribute("refY").value);
                    svg.ViewPort.RemoveCurrent();
                    svg.ViewPort.SetCurrent(viewBox[2], viewBox[3])
                }
            }
        };
        svg.Element.svg.prototype = new svg.Element.RenderedElementBase;
        svg.Element.rect = function(node) {
            this.base = svg.Element.PathElementBase;
            this.base(node);
            this.path = function(ctx) {
                var x = this.attribute("x").toPixels("x");
                var y = this.attribute("y").toPixels("y");
                var width = this.attribute("width").toPixels("x");
                var height = this.attribute("height").toPixels("y");
                var rx = this.attribute("rx").toPixels("x");
                var ry = this.attribute("ry").toPixels("y");
                if (this.attribute("rx").hasValue()&&!this.attribute("ry").hasValue())
                    ry = rx;
                if (this.attribute("ry").hasValue()&&!this.attribute("rx").hasValue())
                    rx = ry;
                rx = Math.min(rx, width / 2);
                ry = Math.min(ry, height / 2);
                if (ctx != null) {
                    ctx.beginPath();
                    ctx.moveTo(x + rx, y);
                    ctx.lineTo(x + width - rx, y);
                    ctx.quadraticCurveTo(x + width, y, x + width, y + ry);
                    ctx.lineTo(x + width, y + height - ry);
                    ctx.quadraticCurveTo(x + width, y + height, x + width - rx, y + height);
                    ctx.lineTo(x + rx, y + height);
                    ctx.quadraticCurveTo(x, y + height, x, y + height - ry);
                    ctx.lineTo(x, y + ry);
                    ctx.quadraticCurveTo(x, y, x + rx, y);
                    ctx.closePath()
                }
                return new svg.BoundingBox(x, y, x + width, y + height)
            }
        };
        svg.Element.rect.prototype = new svg.Element.PathElementBase;
        svg.Element.circle = function(node) {
            this.base = svg.Element.PathElementBase;
            this.base(node);
            this.path = function(ctx) {
                var cx = this.attribute("cx").toPixels("x");
                var cy = this.attribute("cy").toPixels("y");
                var r = this.attribute("r").toPixels();
                if (ctx != null) {
                    ctx.beginPath();
                    ctx.arc(cx, cy, r, 0, Math.PI * 2, true);
                    ctx.closePath()
                }
                return new svg.BoundingBox(cx - r, cy - r, cx + r, cy + r)
            }
        };
        svg.Element.circle.prototype = new svg.Element.PathElementBase;
        svg.Element.ellipse = function(node) {
            this.base = svg.Element.PathElementBase;
            this.base(node);
            this.path = function(ctx) {
                var KAPPA = 4 * ((Math.sqrt(2) - 1) / 3);
                var rx = this.attribute("rx").toPixels("x");
                var ry = this.attribute("ry").toPixels("y");
                var cx = this.attribute("cx").toPixels("x");
                var cy = this.attribute("cy").toPixels("y");
                if (ctx != null) {
                    ctx.beginPath();
                    ctx.moveTo(cx, cy - ry);
                    ctx.bezierCurveTo(cx + KAPPA * rx, cy - ry, cx + rx, cy - KAPPA * ry, cx + rx, cy);
                    ctx.bezierCurveTo(cx + rx, cy + KAPPA * ry, cx + KAPPA * rx, cy + ry, cx, cy + ry);
                    ctx.bezierCurveTo(cx - KAPPA * rx, cy + ry, cx - rx, cy + KAPPA * ry, cx - rx, cy);
                    ctx.bezierCurveTo(cx - rx, cy - KAPPA * ry, cx - KAPPA * rx, cy - ry, cx, cy - ry);
                    ctx.closePath()
                }
                return new svg.BoundingBox(cx - rx, cy - ry, cx + rx, cy + ry)
            }
        };
        svg.Element.ellipse.prototype = new svg.Element.PathElementBase;
        svg.Element.line = function(node) {
            this.base = svg.Element.PathElementBase;
            this.base(node);
            this.getPoints = function() {
                return [new svg.Point(this.attribute("x1").toPixels("x"), this.attribute("y1").toPixels("y")), new svg.Point(this.attribute("x2").toPixels("x"), this.attribute("y2").toPixels("y"))]
            };
            this.path = function(ctx) {
                var points = this.getPoints();
                if (ctx != null) {
                    ctx.beginPath();
                    ctx.moveTo(points[0].x, points[0].y);
                    ctx.lineTo(points[1].x, points[1].y)
                }
                return new svg.BoundingBox(points[0].x, points[0].y, points[1].x, points[1].y)
            };
            this.getMarkers = function() {
                var points = this.getPoints();
                var a = points[0].angleTo(points[1]);
                return [[points[0], a], [points[1], a]]
            }
        };
        svg.Element.line.prototype = new svg.Element.PathElementBase;
        svg.Element.polyline = function(node) {
            this.base = svg.Element.PathElementBase;
            this.base(node);
            this.points = svg.CreatePath(this.attribute("points").value);
            this.path = function(ctx) {
                var bb = new svg.BoundingBox(this.points[0].x, this.points[0].y);
                if (ctx != null) {
                    ctx.beginPath();
                    ctx.moveTo(this.points[0].x, this.points[0].y)
                }
                for (var i = 1; i < this.points.length; i++) {
                    bb.addPoint(this.points[i].x, this.points[i].y);
                    if (ctx != null)
                        ctx.lineTo(this.points[i].x, this.points[i].y)
                }
                return bb
            };
            this.getMarkers = function() {
                var markers = [];
                for (var i = 0; i < this.points.length - 1; i++) {
                    markers.push([this.points[i], this.points[i].angleTo(this.points[i + 1])])
                }
                markers.push([this.points[this.points.length - 1], markers[markers.length - 1][1]]);
                return markers
            }
        };
        svg.Element.polyline.prototype = new svg.Element.PathElementBase;
        svg.Element.polygon = function(node) {
            this.base = svg.Element.polyline;
            this.base(node);
            this.basePath = this.path;
            this.path = function(ctx) {
                var bb = this.basePath(ctx);
                if (ctx != null) {
                    ctx.lineTo(this.points[0].x, this.points[0].y);
                    ctx.closePath()
                }
                return bb
            }
        };
        svg.Element.polygon.prototype = new svg.Element.polyline;
        svg.Element.path = function(node) {
            this.base = svg.Element.PathElementBase;
            this.base(node);
            var d = this.attribute("d").value;
            d = d.replace(/,/gm, " ");
            d = d.replace(/([MmZzLlHhVvCcSsQqTtAa])([MmZzLlHhVvCcSsQqTtAa])/gm, "$1 $2");
            d = d.replace(/([MmZzLlHhVvCcSsQqTtAa])([MmZzLlHhVvCcSsQqTtAa])/gm, "$1 $2");
            d = d.replace(/([MmZzLlHhVvCcSsQqTtAa])([^\s])/gm, "$1 $2");
            d = d.replace(/([^\s])([MmZzLlHhVvCcSsQqTtAa])/gm, "$1 $2");
            d = d.replace(/([0-9])([+\-])/gm, "$1 $2");
            d = d.replace(/(\.[0-9]*)(\.)/gm, "$1 $2");
            d = d.replace(/([Aa](\s+[0-9]+){3})\s+([01])\s*([01])/gm, "$1 $3 $4 ");
            d = svg.compressSpaces(d);
            d = svg.trim(d);
            this.PathParser = new function(d) {
                this.tokens = d.split(" ");
                this.reset = function() {
                    this.i =- 1;
                    this.command = "";
                    this.previousCommand = "";
                    this.start = new svg.Point(0, 0);
                    this.control = new svg.Point(0, 0);
                    this.current = new svg.Point(0, 0);
                    this.points = [];
                    this.angles = []
                };
                this.isEnd = function() {
                    return this.i >= this.tokens.length - 1
                };
                this.isCommandOrEnd = function() {
                    if (this.isEnd())
                        return true;
                    return this.tokens[this.i + 1].match(/^[A-Za-z]$/) != null
                };
                this.isRelativeCommand = function() {
                    switch (this.command) {
                    case"m":
                    case"l":
                    case"h":
                    case"v":
                    case"c":
                    case"s":
                    case"q":
                    case"t":
                    case"a":
                    case"z":
                        return true;
                        break
                    }
                    return false
                };
                this.getToken = function() {
                    this.i++;
                    return this.tokens[this.i]
                };
                this.getScalar = function() {
                    return parseFloat(this.getToken())
                };
                this.nextCommand = function() {
                    this.previousCommand = this.command;
                    this.command = this.getToken()
                };
                this.getPoint = function() {
                    var p = new svg.Point(this.getScalar(), this.getScalar());
                    return this.makeAbsolute(p)
                };
                this.getAsControlPoint = function() {
                    var p = this.getPoint();
                    this.control = p;
                    return p
                };
                this.getAsCurrentPoint = function() {
                    var p = this.getPoint();
                    this.current = p;
                    return p
                };
                this.getReflectedControlPoint = function() {
                    if (this.previousCommand.toLowerCase() != "c" && this.previousCommand.toLowerCase() != "s" && this.previousCommand.toLowerCase() != "q" && this.previousCommand.toLowerCase() != "t") {
                        return this.current
                    }
                    var p = new svg.Point(2 * this.current.x - this.control.x, 2 * this.current.y - this.control.y);
                    return p
                };
                this.makeAbsolute = function(p) {
                    if (this.isRelativeCommand()) {
                        p.x += this.current.x;
                        p.y += this.current.y
                    }
                    return p
                };
                this.addMarker = function(p, from, priorTo) {
                    if (priorTo != null && this.angles.length > 0 && this.angles[this.angles.length - 1] == null) {
                        this.angles[this.angles.length - 1] = this.points[this.points.length - 1].angleTo(priorTo)
                    }
                    this.addMarkerAngle(p, from == null ? null : from.angleTo(p))
                };
                this.addMarkerAngle = function(p, a) {
                    this.points.push(p);
                    this.angles.push(a)
                };
                this.getMarkerPoints = function() {
                    return this.points
                };
                this.getMarkerAngles = function() {
                    for (var i = 0; i < this.angles.length; i++) {
                        if (this.angles[i] == null) {
                            for (var j = i + 1; j < this.angles.length; j++) {
                                if (this.angles[j] != null) {
                                    this.angles[i] = this.angles[j];
                                    break
                                }
                            }
                        }
                    }
                    return this.angles
                }
            }(d);
            this.path = function(ctx) {
                var pp = this.PathParser;
                pp.reset();
                var bb = new svg.BoundingBox;
                if (ctx != null)
                    ctx.beginPath();
                while (!pp.isEnd()) {
                    pp.nextCommand();
                    switch (pp.command) {
                    case"M":
                    case"m":
                        var p = pp.getAsCurrentPoint();
                        pp.addMarker(p);
                        bb.addPoint(p.x, p.y);
                        if (ctx != null)
                            ctx.moveTo(p.x, p.y);
                        pp.start = pp.current;
                        while (!pp.isCommandOrEnd()) {
                            var p = pp.getAsCurrentPoint();
                            pp.addMarker(p, pp.start);
                            bb.addPoint(p.x, p.y);
                            if (ctx != null)
                                ctx.lineTo(p.x, p.y)
                            }
                        break;
                    case"L":
                    case"l":
                        while (!pp.isCommandOrEnd()) {
                            var c = pp.current;
                            var p = pp.getAsCurrentPoint();
                            pp.addMarker(p, c);
                            bb.addPoint(p.x, p.y);
                            if (ctx != null)
                                ctx.lineTo(p.x, p.y)
                            }
                        break;
                    case"H":
                    case"h":
                        while (!pp.isCommandOrEnd()) {
                            var newP = new svg.Point((pp.isRelativeCommand() ? pp.current.x : 0) + pp.getScalar(), pp.current.y);
                            pp.addMarker(newP, pp.current);
                            pp.current = newP;
                            bb.addPoint(pp.current.x, pp.current.y);
                            if (ctx != null)
                                ctx.lineTo(pp.current.x, pp.current.y)
                            }
                        break;
                    case"V":
                    case"v":
                        while (!pp.isCommandOrEnd()) {
                            var newP = new svg.Point(pp.current.x, (pp.isRelativeCommand() ? pp.current.y : 0) + pp.getScalar());
                            pp.addMarker(newP, pp.current);
                            pp.current = newP;
                            bb.addPoint(pp.current.x, pp.current.y);
                            if (ctx != null)
                                ctx.lineTo(pp.current.x, pp.current.y)
                            }
                        break;
                    case"C":
                    case"c":
                        while (!pp.isCommandOrEnd()) {
                            var curr = pp.current;
                            var p1 = pp.getPoint();
                            var cntrl = pp.getAsControlPoint();
                            var cp = pp.getAsCurrentPoint();
                            pp.addMarker(cp, cntrl, p1);
                            bb.addBezierCurve(curr.x, curr.y, p1.x, p1.y, cntrl.x, cntrl.y, cp.x, cp.y);
                            if (ctx != null)
                                ctx.bezierCurveTo(p1.x, p1.y, cntrl.x, cntrl.y, cp.x, cp.y)
                            }
                        break;
                    case"S":
                    case"s":
                        while (!pp.isCommandOrEnd()) {
                            var curr = pp.current;
                            var p1 = pp.getReflectedControlPoint();
                            var cntrl = pp.getAsControlPoint();
                            var cp = pp.getAsCurrentPoint();
                            pp.addMarker(cp, cntrl, p1);
                            bb.addBezierCurve(curr.x, curr.y, p1.x, p1.y, cntrl.x, cntrl.y, cp.x, cp.y);
                            if (ctx != null)
                                ctx.bezierCurveTo(p1.x, p1.y, cntrl.x, cntrl.y, cp.x, cp.y)
                            }
                        break;
                    case"Q":
                    case"q":
                        while (!pp.isCommandOrEnd()) {
                            var curr = pp.current;
                            var cntrl = pp.getAsControlPoint();
                            var cp = pp.getAsCurrentPoint();
                            pp.addMarker(cp, cntrl, cntrl);
                            bb.addQuadraticCurve(curr.x, curr.y, cntrl.x, cntrl.y, cp.x, cp.y);
                            if (ctx != null)
                                ctx.quadraticCurveTo(cntrl.x, cntrl.y, cp.x, cp.y)
                            }
                        break;
                    case"T":
                    case"t":
                        while (!pp.isCommandOrEnd()) {
                            var curr = pp.current;
                            var cntrl = pp.getReflectedControlPoint();
                            pp.control = cntrl;
                            var cp = pp.getAsCurrentPoint();
                            pp.addMarker(cp, cntrl, cntrl);
                            bb.addQuadraticCurve(curr.x, curr.y, cntrl.x, cntrl.y, cp.x, cp.y);
                            if (ctx != null)
                                ctx.quadraticCurveTo(cntrl.x, cntrl.y, cp.x, cp.y)
                            }
                        break;
                    case"A":
                    case"a":
                        while (!pp.isCommandOrEnd()) {
                            var curr = pp.current;
                            var rx = pp.getScalar();
                            var ry = pp.getScalar();
                            var xAxisRotation = pp.getScalar() * (Math.PI / 180);
                            var largeArcFlag = pp.getScalar();
                            var sweepFlag = pp.getScalar();
                            var cp = pp.getAsCurrentPoint();
                            var currp = new svg.Point(Math.cos(xAxisRotation) * (curr.x - cp.x) / 2 + Math.sin(xAxisRotation) * (curr.y - cp.y) / 2, - Math.sin(xAxisRotation) * (curr.x - cp.x) / 2 + Math.cos(xAxisRotation) * (curr.y - cp.y) / 2);
                            var l = Math.pow(currp.x, 2) / Math.pow(rx, 2) + Math.pow(currp.y, 2) / Math.pow(ry, 2);
                            if (l > 1) {
                                rx*=Math.sqrt(l);
                                ry*=Math.sqrt(l)
                            }
                            var s = (largeArcFlag == sweepFlag?-1 : 1) * Math.sqrt((Math.pow(rx, 2) * Math.pow(ry, 2) - Math.pow(rx, 2) * Math.pow(currp.y, 2) - Math.pow(ry, 2) * Math.pow(currp.x, 2)) / (Math.pow(rx, 2) * Math.pow(currp.y, 2) + Math.pow(ry, 2) * Math.pow(currp.x, 2)));
                            if (isNaN(s))
                                s = 0;
                            var cpp = new svg.Point(s * rx * currp.y / ry, s*-ry * currp.x / rx);
                            var centp = new svg.Point((curr.x + cp.x) / 2 + Math.cos(xAxisRotation) * cpp.x - Math.sin(xAxisRotation) * cpp.y, (curr.y + cp.y) / 2 + Math.sin(xAxisRotation) * cpp.x + Math.cos(xAxisRotation) * cpp.y);
                            var m = function(v) {
                                return Math.sqrt(Math.pow(v[0], 2) + Math.pow(v[1], 2))
                            };
                            var r = function(u, v) {
                                return (u[0] * v[0] + u[1] * v[1]) / (m(u) * m(v))
                            };
                            var a = function(u, v) {
                                return (u[0] * v[1] < u[1] * v[0]?-1 : 1) * Math.acos(r(u, v))
                            };
                            var a1 = a([1, 0], [(currp.x - cpp.x) / rx, (currp.y - cpp.y) / ry]);
                            var u = [(currp.x - cpp.x) / rx, (currp.y - cpp.y) / ry];
                            var v = [( - currp.x - cpp.x) / rx, ( - currp.y - cpp.y) / ry];
                            var ad = a(u, v);
                            if (r(u, v)<=-1)
                                ad = Math.PI;
                            if (r(u, v) >= 1)
                                ad = 0;
                            var dir = 1 - sweepFlag ? 1: - 1;
                            var ah = a1 + dir * (ad / 2);
                            var halfWay = new svg.Point(centp.x + rx * Math.cos(ah), centp.y + ry * Math.sin(ah));
                            pp.addMarkerAngle(halfWay, ah - dir * Math.PI / 2);
                            pp.addMarkerAngle(cp, ah - dir * Math.PI);
                            bb.addPoint(cp.x, cp.y);
                            if (ctx != null) {
                                var r = rx > ry ? rx: ry;
                                var sx = rx > ry ? 1: rx / ry;
                                var sy = rx > ry ? ry / rx: 1;
                                ctx.translate(centp.x, centp.y);
                                ctx.rotate(xAxisRotation);
                                ctx.scale(sx, sy);
                                ctx.arc(0, 0, r, a1, a1 + ad, 1 - sweepFlag);
                                ctx.scale(1 / sx, 1 / sy);
                                ctx.rotate( - xAxisRotation);
                                ctx.translate( - centp.x, - centp.y)
                            }
                        }
                        break;
                    case"Z":
                    case"z":
                        if (ctx != null)
                            ctx.closePath();
                        pp.current = pp.start
                    }
                }
                return bb
            };
            this.getMarkers = function() {
                var points = this.PathParser.getMarkerPoints();
                var angles = this.PathParser.getMarkerAngles();
                var markers = [];
                for (var i = 0; i < points.length; i++) {
                    markers.push([points[i], angles[i]])
                }
                return markers
            }
        };
        svg.Element.path.prototype = new svg.Element.PathElementBase;
        svg.Element.pattern = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.createPattern = function(ctx, element) {
                var width = this.attribute("width").toPixels("x", true);
                var height = this.attribute("height").toPixels("y", true);
                var tempSvg = new svg.Element.svg;
                tempSvg.attributes["viewBox"] = new svg.Property("viewBox", this.attribute("viewBox").value);
                tempSvg.attributes["width"] = new svg.Property("width", width + "px");
                tempSvg.attributes["height"] = new svg.Property("height", height + "px");
                tempSvg.attributes["transform"] = new svg.Property("transform", this.attribute("patternTransform").value);
                tempSvg.children = this.children;
                var c = document.createElement("canvas");
                c.width = width;
                c.height = height;
                var cctx = c.getContext("2d");
                if (this.attribute("x").hasValue() && this.attribute("y").hasValue()) {
                    cctx.translate(this.attribute("x").toPixels("x", true), this.attribute("y").toPixels("y", true))
                }
                for (var x =- 1; x <= 1; x++) {
                    for (var y =- 1; y <= 1; y++) {
                        cctx.save();
                        cctx.translate(x * c.width, y * c.height);
                        tempSvg.render(cctx);
                        cctx.restore()
                    }
                }
                var pattern = ctx.createPattern(c, "repeat");
                return pattern
            }
        };
        svg.Element.pattern.prototype = new svg.Element.ElementBase;
        svg.Element.marker = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.baseRender = this.render;
            this.render = function(ctx, point, angle) {
                ctx.translate(point.x, point.y);
                if (this.attribute("orient").valueOrDefault("auto") == "auto")
                    ctx.rotate(angle);
                if (this.attribute("markerUnits").valueOrDefault("strokeWidth") == "strokeWidth")
                    ctx.scale(ctx.lineWidth, ctx.lineWidth);
                ctx.save();
                var tempSvg = new svg.Element.svg;
                tempSvg.attributes["viewBox"] = new svg.Property("viewBox", this.attribute("viewBox").value);
                tempSvg.attributes["refX"] = new svg.Property("refX", this.attribute("refX").value);
                tempSvg.attributes["refY"] = new svg.Property("refY", this.attribute("refY").value);
                tempSvg.attributes["width"] = new svg.Property("width", this.attribute("markerWidth").value);
                tempSvg.attributes["height"] = new svg.Property("height", this.attribute("markerHeight").value);
                tempSvg.attributes["fill"] = new svg.Property("fill", this.attribute("fill").valueOrDefault("black"));
                tempSvg.attributes["stroke"] = new svg.Property("stroke", this.attribute("stroke").valueOrDefault("none"));
                tempSvg.children = this.children;
                tempSvg.render(ctx);
                ctx.restore();
                if (this.attribute("markerUnits").valueOrDefault("strokeWidth") == "strokeWidth")
                    ctx.scale(1 / ctx.lineWidth, 1 / ctx.lineWidth);
                if (this.attribute("orient").valueOrDefault("auto") == "auto")
                    ctx.rotate( - angle);
                ctx.translate( - point.x, - point.y)
            }
        };
        svg.Element.marker.prototype = new svg.Element.ElementBase;
        svg.Element.defs = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.render = function(ctx) {}
        };
        svg.Element.defs.prototype = new svg.Element.ElementBase;
        svg.Element.GradientBase = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.gradientUnits = this.attribute("gradientUnits").valueOrDefault("objectBoundingBox");
            this.stops = [];
            for (var i = 0; i < this.children.length; i++) {
                var child = this.children[i];
                if (child.type == "stop")
                    this.stops.push(child)
            }
            this.getGradient = function() {};
            this.createGradient = function(ctx, element, parentOpacityProp) {
                var stopsContainer = this;
                if (this.getHrefAttribute().hasValue()) {
                    stopsContainer = this.getHrefAttribute().getDefinition()
                }
                var addParentOpacity = function(color) {
                    if (parentOpacityProp.hasValue()) {
                        var p = new svg.Property("color", color);
                        return p.addOpacity(parentOpacityProp.value).value
                    }
                    return color
                };
                var g = this.getGradient(ctx, element);
                if (g == null)
                    return addParentOpacity(stopsContainer.stops[stopsContainer.stops.length - 1].color);
                for (var i = 0; i < stopsContainer.stops.length; i++) {
                    g.addColorStop(stopsContainer.stops[i].offset, addParentOpacity(stopsContainer.stops[i].color))
                }
                if (this.attribute("gradientTransform").hasValue()) {
                    var rootView = svg.ViewPort.viewPorts[0];
                    var rect = new svg.Element.rect;
                    rect.attributes["x"] = new svg.Property("x", - svg.MAX_VIRTUAL_PIXELS / 3);
                    rect.attributes["y"] = new svg.Property("y", - svg.MAX_VIRTUAL_PIXELS / 3);
                    rect.attributes["width"] = new svg.Property("width", svg.MAX_VIRTUAL_PIXELS);
                    rect.attributes["height"] = new svg.Property("height", svg.MAX_VIRTUAL_PIXELS);
                    var group = new svg.Element.g;
                    group.attributes["transform"] = new svg.Property("transform", this.attribute("gradientTransform").value);
                    group.children = [rect];
                    var tempSvg = new svg.Element.svg;
                    tempSvg.attributes["x"] = new svg.Property("x", 0);
                    tempSvg.attributes["y"] = new svg.Property("y", 0);
                    tempSvg.attributes["width"] = new svg.Property("width", rootView.width);
                    tempSvg.attributes["height"] = new svg.Property("height", rootView.height);
                    tempSvg.children = [group];
                    var c = document.createElement("canvas");
                    c.width = rootView.width;
                    c.height = rootView.height;
                    var tempCtx = c.getContext("2d");
                    tempCtx.fillStyle = g;
                    tempSvg.render(tempCtx);
                    return tempCtx.createPattern(c, "no-repeat")
                }
                return g
            }
        };
        svg.Element.GradientBase.prototype = new svg.Element.ElementBase;
        svg.Element.linearGradient = function(node) {
            this.base = svg.Element.GradientBase;
            this.base(node);
            this.getGradient = function(ctx, element) {
                var bb = element.getBoundingBox();
                if (!this.attribute("x1").hasValue()&&!this.attribute("y1").hasValue()&&!this.attribute("x2").hasValue()&&!this.attribute("y2").hasValue()) {
                    this.attribute("x1", true).value = 0;
                    this.attribute("y1", true).value = 0;
                    this.attribute("x2", true).value = 1;
                    this.attribute("y2", true).value = 0
                }
                var x1 = this.gradientUnits == "objectBoundingBox" ? bb.x() + bb.width() * this.attribute("x1").numValue(): this.attribute("x1").toPixels("x");
                var y1 = this.gradientUnits == "objectBoundingBox" ? bb.y() + bb.height() * this.attribute("y1").numValue(): this.attribute("y1").toPixels("y");
                var x2 = this.gradientUnits == "objectBoundingBox" ? bb.x() + bb.width() * this.attribute("x2").numValue(): this.attribute("x2").toPixels("x");
                var y2 = this.gradientUnits == "objectBoundingBox" ? bb.y() + bb.height() * this.attribute("y2").numValue(): this.attribute("y2").toPixels("y");
                if (x1 == x2 && y1 == y2)
                    return null;
                return ctx.createLinearGradient(x1, y1, x2, y2)
            }
        };
        svg.Element.linearGradient.prototype = new svg.Element.GradientBase;
        svg.Element.radialGradient = function(node) {
            this.base = svg.Element.GradientBase;
            this.base(node);
            this.getGradient = function(ctx, element) {
                var bb = element.getBoundingBox();
                if (!this.attribute("cx").hasValue())
                    this.attribute("cx", true).value = "50%";
                if (!this.attribute("cy").hasValue())
                    this.attribute("cy", true).value = "50%";
                if (!this.attribute("r").hasValue())
                    this.attribute("r", true).value = "50%";
                var cx = this.gradientUnits == "objectBoundingBox" ? bb.x() + bb.width() * this.attribute("cx").numValue(): this.attribute("cx").toPixels("x");
                var cy = this.gradientUnits == "objectBoundingBox" ? bb.y() + bb.height() * this.attribute("cy").numValue(): this.attribute("cy").toPixels("y");
                var fx = cx;
                var fy = cy;
                if (this.attribute("fx").hasValue()) {
                    fx = this.gradientUnits == "objectBoundingBox" ? bb.x() + bb.width() * this.attribute("fx").numValue() : this.attribute("fx").toPixels("x")
                }
                if (this.attribute("fy").hasValue()) {
                    fy = this.gradientUnits == "objectBoundingBox" ? bb.y() + bb.height() * this.attribute("fy").numValue() : this.attribute("fy").toPixels("y")
                }
                var r = this.gradientUnits == "objectBoundingBox" ? (bb.width() + bb.height()) / 2 * this.attribute("r").numValue(): this.attribute("r").toPixels();
                return ctx.createRadialGradient(fx, fy, 0, cx, cy, r)
            }
        };
        svg.Element.radialGradient.prototype = new svg.Element.GradientBase;
        svg.Element.stop = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.offset = this.attribute("offset").numValue();
            if (this.offset < 0)
                this.offset = 0;
            if (this.offset > 1)
                this.offset = 1;
            var stopColor = this.style("stop-color");
            if (this.style("stop-opacity").hasValue())
                stopColor = stopColor.addOpacity(this.style("stop-opacity").value);
            this.color = stopColor.value
        };
        svg.Element.stop.prototype = new svg.Element.ElementBase;
        svg.Element.AnimateBase = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            svg.Animations.push(this);
            this.duration = 0;
            this.begin = this.attribute("begin").toMilliseconds();
            this.maxDuration = this.begin + this.attribute("dur").toMilliseconds();
            this.getProperty = function() {
                var attributeType = this.attribute("attributeType").value;
                var attributeName = this.attribute("attributeName").value;
                if (attributeType == "CSS") {
                    return this.parent.style(attributeName, true)
                }
                return this.parent.attribute(attributeName, true)
            };
            this.initialValue = null;
            this.initialUnits = "";
            this.removed = false;
            this.calcValue = function() {
                return ""
            };
            this.update = function(delta) {
                if (this.initialValue == null) {
                    this.initialValue = this.getProperty().value;
                    this.initialUnits = this.getProperty().getUnits()
                }
                if (this.duration > this.maxDuration) {
                    if (this.attribute("repeatCount").value == "indefinite" || this.attribute("repeatDur").value == "indefinite") {
                        this.duration = 0
                    } else if (this.attribute("fill").valueOrDefault("remove") == "remove"&&!this.removed) {
                        this.removed = true;
                        this.getProperty().value = this.initialValue;
                        return true
                    } else {
                        return false
                    }
                }
                this.duration = this.duration + delta;
                var updated = false;
                if (this.begin < this.duration) {
                    var newValue = this.calcValue();
                    if (this.attribute("type").hasValue()) {
                        var type = this.attribute("type").value;
                        newValue = type + "(" + newValue + ")"
                    }
                    this.getProperty().value = newValue;
                    updated = true
                }
                return updated
            };
            this.from = this.attribute("from");
            this.to = this.attribute("to");
            this.values = this.attribute("values");
            if (this.values.hasValue())
                this.values.value = this.values.value.split(";");
            this.progress = function() {
                var ret = {
                    progress: (this.duration - this.begin) / (this.maxDuration - this.begin)
                };
                if (this.values.hasValue()) {
                    var p = ret.progress * (this.values.value.length - 1);
                    var lb = Math.floor(p), ub = Math.ceil(p);
                    ret.from = new svg.Property("from", parseFloat(this.values.value[lb]));
                    ret.to = new svg.Property("to", parseFloat(this.values.value[ub]));
                    ret.progress = (p - lb) / (ub - lb)
                } else {
                    ret.from = this.from;
                    ret.to = this.to
                }
                return ret
            }
        };
        svg.Element.AnimateBase.prototype = new svg.Element.ElementBase;
        svg.Element.animate = function(node) {
            this.base = svg.Element.AnimateBase;
            this.base(node);
            this.calcValue = function() {
                var p = this.progress();
                var newValue = p.from.numValue() + (p.to.numValue() - p.from.numValue()) * p.progress;
                return newValue + this.initialUnits
            }
        };
        svg.Element.animate.prototype = new svg.Element.AnimateBase;
        svg.Element.animateColor = function(node) {
            this.base = svg.Element.AnimateBase;
            this.base(node);
            this.calcValue = function() {
                var p = this.progress();
                var from = new RGBColor(p.from.value);
                var to = new RGBColor(p.to.value);
                if (from.ok && to.ok) {
                    var r = from.r + (to.r - from.r) * p.progress;
                    var g = from.g + (to.g - from.g) * p.progress;
                    var b = from.b + (to.b - from.b) * p.progress;
                    return "rgb(" + parseInt(r, 10) + "," + parseInt(g, 10) + "," + parseInt(b, 10) + ")"
                }
                return this.attribute("from").value
            }
        };
        svg.Element.animateColor.prototype = new svg.Element.AnimateBase;
        svg.Element.animateTransform = function(node) {
            this.base = svg.Element.AnimateBase;
            this.base(node);
            this.calcValue = function() {
                var p = this.progress();
                var from = svg.ToNumberArray(p.from.value);
                var to = svg.ToNumberArray(p.to.value);
                var newValue = "";
                for (var i = 0; i < from.length; i++) {
                    newValue += from[i] + (to[i] - from[i]) * p.progress + " "
                }
                return newValue
            }
        };
        svg.Element.animateTransform.prototype = new svg.Element.animate;
        svg.Element.font = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.horizAdvX = this.attribute("horiz-adv-x").numValue();
            this.isRTL = false;
            this.isArabic = false;
            this.fontFace = null;
            this.missingGlyph = null;
            this.glyphs = [];
            for (var i = 0; i < this.children.length; i++) {
                var child = this.children[i];
                if (child.type == "font-face") {
                    this.fontFace = child;
                    if (child.style("font-family").hasValue()) {
                        svg.Definitions[child.style("font-family").value] = this
                    }
                } else if (child.type == "missing-glyph")
                    this.missingGlyph = child;
                else if (child.type == "glyph") {
                    if (child.arabicForm != "") {
                        this.isRTL = true;
                        this.isArabic = true;
                        if (typeof this.glyphs[child.unicode] == "undefined")
                            this.glyphs[child.unicode] = [];
                        this.glyphs[child.unicode][child.arabicForm] = child
                    } else {
                        this.glyphs[child.unicode] = child
                    }
                }
            }
        };
        svg.Element.font.prototype = new svg.Element.ElementBase;
        svg.Element.fontface = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.ascent = this.attribute("ascent").value;
            this.descent = this.attribute("descent").value;
            this.unitsPerEm = this.attribute("units-per-em").numValue()
        };
        svg.Element.fontface.prototype = new svg.Element.ElementBase;
        svg.Element.missingglyph = function(node) {
            this.base = svg.Element.path;
            this.base(node);
            this.horizAdvX = 0
        };
        svg.Element.missingglyph.prototype = new svg.Element.path;
        svg.Element.glyph = function(node) {
            this.base = svg.Element.path;
            this.base(node);
            this.horizAdvX = this.attribute("horiz-adv-x").numValue();
            this.unicode = this.attribute("unicode").value;
            this.arabicForm = this.attribute("arabic-form").value
        };
        svg.Element.glyph.prototype = new svg.Element.path;
        svg.Element.text = function(node) {
            this.captureTextNodes = true;
            this.base = svg.Element.RenderedElementBase;
            this.base(node);
            this.baseSetContext = this.setContext;
            this.setContext = function(ctx) {
                this.baseSetContext(ctx);
                if (this.style("dominant-baseline").hasValue())
                    ctx.textBaseline = this.style("dominant-baseline").value;
                if (this.style("alignment-baseline").hasValue())
                    ctx.textBaseline = this.style("alignment-baseline").value
            };
            this.getBoundingBox = function() {
                return new svg.BoundingBox(this.attribute("x").toPixels("x"), this.attribute("y").toPixels("y"), 0, 0)
            };
            this.renderChildren = function(ctx) {
                this.x = this.attribute("x").toPixels("x");
                this.y = this.attribute("y").toPixels("y");
                this.x += this.getAnchorDelta(ctx, this, 0);
                for (var i = 0; i < this.children.length; i++) {
                    this.renderChild(ctx, this, i)
                }
            };
            this.getAnchorDelta = function(ctx, parent, startI) {
                var textAnchor = this.style("text-anchor").valueOrDefault("start");
                if (textAnchor != "start") {
                    var width = 0;
                    for (var i = startI; i < parent.children.length; i++) {
                        var child = parent.children[i];
                        if (i > startI && child.attribute("x").hasValue())
                            break;
                        width += child.measureTextRecursive(ctx)
                    }
                    return - 1 * (textAnchor == "end" ? width : width / 2)
                }
                return 0
            };
            this.renderChild = function(ctx, parent, i) {
                var child = parent.children[i];
                if (child.attribute("x").hasValue()) {
                    child.x = child.attribute("x").toPixels("x") + this.getAnchorDelta(ctx, parent, i)
                } else {
                    if (this.attribute("dx").hasValue())
                        this.x += this.attribute("dx").toPixels("x");
                    if (child.attribute("dx").hasValue())
                        this.x += child.attribute("dx").toPixels("x");
                    child.x = this.x
                }
                this.x = child.x + child.measureText(ctx);
                if (child.attribute("y").hasValue()) {
                    child.y = child.attribute("y").toPixels("y")
                } else {
                    if (this.attribute("dy").hasValue())
                        this.y += this.attribute("dy").toPixels("y");
                    if (child.attribute("dy").hasValue())
                        this.y += child.attribute("dy").toPixels("y");
                    child.y = this.y
                }
                this.y = child.y;
                child.render(ctx);
                for (var i = 0; i < child.children.length; i++) {
                    this.renderChild(ctx, child, i)
                }
            }
        };
        svg.Element.text.prototype = new svg.Element.RenderedElementBase;
        svg.Element.TextElementBase = function(node) {
            this.base = svg.Element.RenderedElementBase;
            this.base(node);
            this.getGlyph = function(font, text, i) {
                var c = text[i];
                var glyph = null;
                if (font.isArabic) {
                    var arabicForm = "isolated";
                    if ((i == 0 || text[i - 1] == " ") && i < text.length - 2 && text[i + 1] != " ")
                        arabicForm = "terminal";
                    if (i > 0 && text[i - 1] != " " && i < text.length - 2 && text[i + 1] != " ")
                        arabicForm = "medial";
                    if (i > 0 && text[i - 1] != " " && (i == text.length - 1 || text[i + 1] == " "))
                        arabicForm = "initial";
                    if (typeof font.glyphs[c] != "undefined") {
                        glyph = font.glyphs[c][arabicForm];
                        if (glyph == null && font.glyphs[c].type == "glyph")
                            glyph = font.glyphs[c]
                    }
                } else {
                    glyph = font.glyphs[c]
                }
                if (glyph == null)
                    glyph = font.missingGlyph;
                return glyph
            };
            this.renderChildren = function(ctx) {
                var customFont = this.parent.style("font-family").getDefinition();
                if (customFont != null) {
                    var fontSize = this.parent.style("font-size").numValueOrDefault(svg.Font.Parse(svg.ctx.font).fontSize);
                    var fontStyle = this.parent.style("font-style").valueOrDefault(svg.Font.Parse(svg.ctx.font).fontStyle);
                    var text = this.getText();
                    if (customFont.isRTL)
                        text = text.split("").reverse().join("");
                    var dx = svg.ToNumberArray(this.parent.attribute("dx").value);
                    for (var i = 0; i < text.length; i++) {
                        var glyph = this.getGlyph(customFont, text, i);
                        var scale = fontSize / customFont.fontFace.unitsPerEm;
                        ctx.translate(this.x, this.y);
                        ctx.scale(scale, - scale);
                        var lw = ctx.lineWidth;
                        ctx.lineWidth = ctx.lineWidth * customFont.fontFace.unitsPerEm / fontSize;
                        if (fontStyle == "italic")
                            ctx.transform(1, 0, .4, 1, 0, 0);
                        glyph.render(ctx);
                        if (fontStyle == "italic")
                            ctx.transform(1, 0, - .4, 1, 0, 0);
                        ctx.lineWidth = lw;
                        ctx.scale(1 / scale, - 1 / scale);
                        ctx.translate( - this.x, - this.y);
                        this.x += fontSize * (glyph.horizAdvX || customFont.horizAdvX) / customFont.fontFace.unitsPerEm;
                        if (typeof dx[i] != "undefined"&&!isNaN(dx[i])) {
                            this.x += dx[i]
                        }
                    }
                    return 
                }
                if (ctx.fillStyle != "")
                    ctx.fillText(svg.compressSpaces(this.getText()), this.x, this.y);
                if (ctx.strokeStyle != "")
                    ctx.strokeText(svg.compressSpaces(this.getText()), this.x, this.y)
            };
            this.getText = function() {};
            this.measureTextRecursive = function(ctx) {
                var width = this.measureText(ctx);
                for (var i = 0; i < this.children.length; i++) {
                    width += this.children[i].measureTextRecursive(ctx)
                }
                return width
            };
            this.measureText = function(ctx) {
                var customFont = this.parent.style("font-family").getDefinition();
                if (customFont != null) {
                    var fontSize = this.parent.style("font-size").numValueOrDefault(svg.Font.Parse(svg.ctx.font).fontSize);
                    var measure = 0;
                    var text = this.getText();
                    if (customFont.isRTL)
                        text = text.split("").reverse().join("");
                    var dx = svg.ToNumberArray(this.parent.attribute("dx").value);
                    for (var i = 0; i < text.length; i++) {
                        var glyph = this.getGlyph(customFont, text, i);
                        measure += (glyph.horizAdvX || customFont.horizAdvX) * fontSize / customFont.fontFace.unitsPerEm;
                        if (typeof dx[i] != "undefined"&&!isNaN(dx[i])) {
                            measure += dx[i]
                        }
                    }
                    return measure
                }
                var textToMeasure = svg.compressSpaces(this.getText());
                if (!ctx.measureText)
                    return textToMeasure.length * 10;
                ctx.save();
                this.setContext(ctx);
                var width = ctx.measureText(textToMeasure).width;
                ctx.restore();
                return width
            }
        };
        svg.Element.TextElementBase.prototype = new svg.Element.RenderedElementBase;
        svg.Element.tspan = function(node) {
            this.captureTextNodes = true;
            this.base = svg.Element.TextElementBase;
            this.base(node);
            this.text = node.nodeValue || node.text || "";
            this.getText = function() {
                return this.text
            }
        };
        svg.Element.tspan.prototype = new svg.Element.TextElementBase;
        svg.Element.tref = function(node) {
            this.base = svg.Element.TextElementBase;
            this.base(node);
            this.getText = function() {
                var element = this.getHrefAttribute().getDefinition();
                if (element != null)
                    return element.children[0].getText()
            }
        };
        svg.Element.tref.prototype = new svg.Element.TextElementBase;
        svg.Element.a = function(node) {
            this.base = svg.Element.TextElementBase;
            this.base(node);
            this.hasText = true;
            for (var i = 0; i < node.childNodes.length; i++) {
                if (node.childNodes[i].nodeType != 3)
                    this.hasText = false
            }
            this.text = this.hasText ? node.childNodes[0].nodeValue : "";
            this.getText = function() {
                return this.text
            };
            this.baseRenderChildren = this.renderChildren;
            this.renderChildren = function(ctx) {
                if (this.hasText) {
                    this.baseRenderChildren(ctx);
                    var fontSize = new svg.Property("fontSize", svg.Font.Parse(svg.ctx.font).fontSize);
                    svg.Mouse.checkBoundingBox(this, new svg.BoundingBox(this.x, this.y - fontSize.toPixels("y"), this.x + this.measureText(ctx), this.y))
                } else {
                    var g = new svg.Element.g;
                    g.children = this.children;
                    g.parent = this;
                    g.render(ctx)
                }
            };
            this.onclick = function() {
                window.open(this.getHrefAttribute().value)
            };
            this.onmousemove = function() {
                svg.ctx.canvas.style.cursor = "pointer"
            }
        };
        svg.Element.a.prototype = new svg.Element.TextElementBase;
        svg.Element.image = function(node) {
            this.base = svg.Element.RenderedElementBase;
            this.base(node);
            var href = this.getHrefAttribute().value;
            var isSvg = href.match(/\.svg$/);
            svg.Images.push(this);
            this.loaded = false;
            if (!isSvg) {
                this.img = document.createElement("img");
                var self = this;
                this.img.onload = function() {
                    self.loaded = true
                };
                this.img.onerror = function() {
                    if (typeof console != "undefined") {
                        console.log('ERROR: image "' + href + '" not found');
                        self.loaded = true
                    }
                };
                this.img.src = href
            } else {
                this.img = svg.ajax(href);
                this.loaded = true
            }
            this.renderChildren = function(ctx) {
                var x = this.attribute("x").toPixels("x");
                var y = this.attribute("y").toPixels("y");
                var width = this.attribute("width").toPixels("x");
                var height = this.attribute("height").toPixels("y");
                if (width == 0 || height == 0)
                    return;
                ctx.save();
                if (isSvg) {
                    ctx.drawSvg(this.img, x, y, width, height)
                } else {
                    ctx.translate(x, y);
                    svg.AspectRatio(ctx, this.attribute("preserveAspectRatio").value, width, this.img.width, height, this.img.height, 0, 0);
                    ctx.drawImage(this.img, 0, 0)
                }
                ctx.restore()
            };
            this.getBoundingBox = function() {
                var x = this.attribute("x").toPixels("x");
                var y = this.attribute("y").toPixels("y");
                var width = this.attribute("width").toPixels("x");
                var height = this.attribute("height").toPixels("y");
                return new svg.BoundingBox(x, y, x + width, y + height)
            }
        };
        svg.Element.image.prototype = new svg.Element.RenderedElementBase;
        svg.Element.g = function(node) {
            this.base = svg.Element.RenderedElementBase;
            this.base(node);
            this.getBoundingBox = function() {
                var bb = new svg.BoundingBox;
                for (var i = 0; i < this.children.length; i++) {
                    bb.addBoundingBox(this.children[i].getBoundingBox())
                }
                return bb
            }
        };
        svg.Element.g.prototype = new svg.Element.RenderedElementBase;
        svg.Element.symbol = function(node) {
            this.base = svg.Element.RenderedElementBase;
            this.base(node);
            this.baseSetContext = this.setContext;
            this.setContext = function(ctx) {
                this.baseSetContext(ctx);
                if (this.attribute("viewBox").hasValue()) {
                    var viewBox = svg.ToNumberArray(this.attribute("viewBox").value);
                    var minX = viewBox[0];
                    var minY = viewBox[1];
                    width = viewBox[2];
                    height = viewBox[3];
                    svg.AspectRatio(ctx, this.attribute("preserveAspectRatio").value, this.attribute("width").toPixels("x"), width, this.attribute("height").toPixels("y"), height, minX, minY);
                    svg.ViewPort.SetCurrent(viewBox[2], viewBox[3])
                }
            }
        };
        svg.Element.symbol.prototype = new svg.Element.RenderedElementBase;
        svg.Element.style = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            var css = "";
            for (var i = 0; i < node.childNodes.length; i++) {
                css += node.childNodes[i].nodeValue
            }
            css = css.replace(/(\/\*([^*]|[\r\n]|(\*+([^*\/]|[\r\n])))*\*+\/)|(^[\s]*\/\/.*)/gm, "");
            css = svg.compressSpaces(css);
            var cssDefs = css.split("}");
            for (var i = 0; i < cssDefs.length; i++) {
                if (svg.trim(cssDefs[i]) != "") {
                    var cssDef = cssDefs[i].split("{");
                    var cssClasses = cssDef[0].split(",");
                    var cssProps = cssDef[1].split(";");
                    for (var j = 0; j < cssClasses.length; j++) {
                        var cssClass = svg.trim(cssClasses[j]);
                        if (cssClass != "") {
                            var props = {};
                            for (var k = 0; k < cssProps.length; k++) {
                                var prop = cssProps[k].indexOf(":");
                                var name = cssProps[k].substr(0, prop);
                                var value = cssProps[k].substr(prop + 1, cssProps[k].length - prop);
                                if (name != null && value != null) {
                                    props[svg.trim(name)] = new svg.Property(svg.trim(name), svg.trim(value))
                                }
                            }
                            svg.Styles[cssClass] = props;
                            if (cssClass == "@font-face") {
                                var fontFamily = props["font-family"].value.replace(/"/g, "");
                                var srcs = props["src"].value.split(",");
                                for (var s = 0; s < srcs.length; s++) {
                                    if (srcs[s].indexOf('format("svg")') > 0) {
                                        var urlStart = srcs[s].indexOf("url");
                                        var urlEnd = srcs[s].indexOf(")", urlStart);
                                        var url = srcs[s].substr(urlStart + 5, urlEnd - urlStart - 6);
                                        var doc = svg.parseXml(svg.ajax(url));
                                        var fonts = doc.getElementsByTagName("font");
                                        for (var f = 0; f < fonts.length; f++) {
                                            var font = svg.CreateElement(fonts[f]);
                                            svg.Definitions[fontFamily] = font
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        };
        svg.Element.style.prototype = new svg.Element.ElementBase;
        svg.Element.use = function(node) {
            this.base = svg.Element.RenderedElementBase;
            this.base(node);
            this.baseSetContext = this.setContext;
            this.setContext = function(ctx) {
                this.baseSetContext(ctx);
                if (this.attribute("x").hasValue())
                    ctx.translate(this.attribute("x").toPixels("x"), 0);
                if (this.attribute("y").hasValue())
                    ctx.translate(0, this.attribute("y").toPixels("y"))
            };
            this.getDefinition = function() {
                var element = this.getHrefAttribute().getDefinition();
                if (this.attribute("width").hasValue())
                    element.attribute("width", true).value = this.attribute("width").value;
                if (this.attribute("height").hasValue())
                    element.attribute("height", true).value = this.attribute("height").value;
                return element
            };
            this.path = function(ctx) {
                var element = this.getDefinition();
                if (element != null)
                    element.path(ctx)
            };
            this.getBoundingBox = function() {
                var element = this.getDefinition();
                if (element != null)
                    return element.getBoundingBox()
            };
            this.renderChildren = function(ctx) {
                var element = this.getDefinition();
                if (element != null) {
                    var oldParent = element.parent;
                    element.parent = null;
                    element.render(ctx);
                    element.parent = oldParent
                }
            }
        };
        svg.Element.use.prototype = new svg.Element.RenderedElementBase;
        svg.Element.mask = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.apply = function(ctx, element) {
                var x = this.attribute("x").toPixels("x");
                var y = this.attribute("y").toPixels("y");
                var width = this.attribute("width").toPixels("x");
                var height = this.attribute("height").toPixels("y");
                if (width == 0 && height == 0) {
                    var bb = new svg.BoundingBox;
                    for (var i = 0; i < this.children.length; i++) {
                        bb.addBoundingBox(this.children[i].getBoundingBox())
                    }
                    var x = Math.floor(bb.x1);
                    var y = Math.floor(bb.y1);
                    var width = Math.floor(bb.width());
                    var height = Math.floor(bb.height())
                }
                var mask = element.attribute("mask").value;
                element.attribute("mask").value = "";
                var cMask = document.createElement("canvas");
                cMask.width = x + width;
                cMask.height = y + height;
                var maskCtx = cMask.getContext("2d");
                this.renderChildren(maskCtx);
                var c = document.createElement("canvas");
                c.width = x + width;
                c.height = y + height;
                var tempCtx = c.getContext("2d");
                element.render(tempCtx);
                tempCtx.globalCompositeOperation = "destination-in";
                tempCtx.fillStyle = maskCtx.createPattern(cMask, "no-repeat");
                tempCtx.fillRect(0, 0, x + width, y + height);
                ctx.fillStyle = tempCtx.createPattern(c, "no-repeat");
                ctx.fillRect(0, 0, x + width, y + height);
                element.attribute("mask").value = mask
            };
            this.render = function(ctx) {}
        };
        svg.Element.mask.prototype = new svg.Element.ElementBase;
        svg.Element.clipPath = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.apply = function(ctx) {
                for (var i = 0; i < this.children.length; i++) {
                    var child = this.children[i];
                    if (typeof child.path != "undefined") {
                        var transform = null;
                        if (child.attribute("transform").hasValue()) {
                            transform = new svg.Transform(child.attribute("transform").value);
                            transform.apply(ctx)
                        }
                        child.path(ctx);
                        ctx.clip();
                        if (transform) {
                            transform.unapply(ctx)
                        }
                    }
                }
            };
            this.render = function(ctx) {}
        };
        svg.Element.clipPath.prototype = new svg.Element.ElementBase;
        svg.Element.filter = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.apply = function(ctx, element) {
                var bb = element.getBoundingBox();
                var x = Math.floor(bb.x1);
                var y = Math.floor(bb.y1);
                var width = Math.floor(bb.width());
                var height = Math.floor(bb.height());
                var filter = element.style("filter").value;
                element.style("filter").value = "";
                var px = 0, py = 0;
                for (var i = 0; i < this.children.length; i++) {
                    var efd = this.children[i].extraFilterDistance || 0;
                    px = Math.max(px, efd);
                    py = Math.max(py, efd)
                }
                var c = document.createElement("canvas");
                c.width = width + 2 * px;
                c.height = height + 2 * py;
                var tempCtx = c.getContext("2d");
                tempCtx.translate( - x + px, - y + py);
                element.render(tempCtx);
                for (var i = 0; i < this.children.length; i++) {
                    this.children[i].apply(tempCtx, 0, 0, width + 2 * px, height + 2 * py)
                }
                ctx.drawImage(c, 0, 0, width + 2 * px, height + 2 * py, x - px, y - py, width + 2 * px, height + 2 * py);
                element.style("filter", true).value = filter
            };
            this.render = function(ctx) {}
        };
        svg.Element.filter.prototype = new svg.Element.ElementBase;
        svg.Element.feMorphology = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.apply = function(ctx, x, y, width, height) {}
        };
        svg.Element.feMorphology.prototype = new svg.Element.ElementBase;
        svg.Element.feColorMatrix = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            function imGet(img, x, y, width, height, rgba) {
                return img[y * width * 4 + x * 4 + rgba]
            }
            function imSet(img, x, y, width, height, rgba, val) {
                img[y * width * 4 + x * 4 + rgba] = val
            }
            this.apply = function(ctx, x, y, width, height) {
                var srcData = ctx.getImageData(0, 0, width, height);
                for (var y = 0; y < height; y++) {
                    for (var x = 0; x < width; x++) {
                        var r = imGet(srcData.data, x, y, width, height, 0);
                        var g = imGet(srcData.data, x, y, width, height, 1);
                        var b = imGet(srcData.data, x, y, width, height, 2);
                        var gray = (r + g + b) / 3;
                        imSet(srcData.data, x, y, width, height, 0, gray);
                        imSet(srcData.data, x, y, width, height, 1, gray);
                        imSet(srcData.data, x, y, width, height, 2, gray)
                    }
                }
                ctx.clearRect(0, 0, width, height);
                ctx.putImageData(srcData, 0, 0)
            }
        };
        svg.Element.feColorMatrix.prototype = new svg.Element.ElementBase;
        svg.Element.feGaussianBlur = function(node) {
            this.base = svg.Element.ElementBase;
            this.base(node);
            this.blurRadius = Math.floor(this.attribute("stdDeviation").numValue());
            this.extraFilterDistance = this.blurRadius;
            this.apply = function(ctx, x, y, width, height) {
                if (typeof stackBlurCanvasRGBA == "undefined") {
                    if (typeof console != "undefined") {
                        console.log("ERROR: StackBlur.js must be included for blur to work")
                    }
                    return 
                }
                ctx.canvas.id = svg.UniqueId();
                ctx.canvas.style.display = "none";
                document.body.appendChild(ctx.canvas);
                stackBlurCanvasRGBA(ctx.canvas.id, x, y, width, height, this.blurRadius);
                document.body.removeChild(ctx.canvas)
            }
        };
        svg.Element.feGaussianBlur.prototype = new svg.Element.ElementBase;
        svg.Element.title = function(node) {};
        svg.Element.title.prototype = new svg.Element.ElementBase;
        svg.Element.desc = function(node) {};
        svg.Element.desc.prototype = new svg.Element.ElementBase;
        svg.Element.MISSING = function(node) {
            if (typeof console != "undefined") {
                console.log("ERROR: Element '" + node.nodeName + "' not yet implemented.")
            }
        };
        svg.Element.MISSING.prototype = new svg.Element.ElementBase;
        svg.CreateElement = function(node) {
            var className = node.nodeName.replace(/^[^:]+:/, "");
            className = className.replace(/\-/g, "");
            var e = null;
            if (typeof svg.Element[className] != "undefined") {
                e = new svg.Element[className](node)
            } else {
                e = new svg.Element.MISSING(node)
            }
            e.type = node.nodeName;
            return e
        };
        svg.load = function(ctx, url) {
            svg.loadXml(ctx, svg.ajax(url))
        };
        svg.loadXml = function(ctx, xml) {
            svg.loadXmlDoc(ctx, svg.parseXml(xml))
        };
        svg.loadXmlDoc = function(ctx, dom) {
            svg.init(ctx);
            var mapXY = function(p) {
                var e = ctx.canvas;
                while (e) {
                    p.x -= e.offsetLeft;
                    p.y -= e.offsetTop;
                    e = e.offsetParent
                }
                if (window.scrollX)
                    p.x += window.scrollX;
                if (window.scrollY)
                    p.y += window.scrollY;
                return p
            };
            if (svg.opts["ignoreMouse"] != true) {
                ctx.canvas.onclick = function(e) {
                    var p = mapXY(new svg.Point(e != null ? e.clientX : event.clientX, e != null ? e.clientY : event.clientY));
                    svg.Mouse.onclick(p.x, p.y)
                };
                ctx.canvas.onmousemove = function(e) {
                    var p = mapXY(new svg.Point(e != null ? e.clientX : event.clientX, e != null ? e.clientY : event.clientY));
                    svg.Mouse.onmousemove(p.x, p.y)
                }
            }
            var e = svg.CreateElement(dom.documentElement);
            e.root = true;
            var isFirstRender = true;
            var draw = function() {
                svg.ViewPort.Clear();
                if (ctx.canvas.parentNode)
                    svg.ViewPort.SetCurrent(ctx.canvas.parentNode.clientWidth, ctx.canvas.parentNode.clientHeight);
                if (svg.opts["ignoreDimensions"] != true) {
                    if (e.style("width").hasValue()) {
                        ctx.canvas.width = e.style("width").toPixels("x");
                        ctx.canvas.style.width = ctx.canvas.width + "px"
                    }
                    if (e.style("height").hasValue()) {
                        ctx.canvas.height = e.style("height").toPixels("y");
                        ctx.canvas.style.height = ctx.canvas.height + "px"
                    }
                }
                var cWidth = ctx.canvas.clientWidth || ctx.canvas.width;
                var cHeight = ctx.canvas.clientHeight || ctx.canvas.height;
                if (svg.opts["ignoreDimensions"] == true && e.style("width").hasValue() && e.style("height").hasValue()) {
                    cWidth = e.style("width").toPixels("x");
                    cHeight = e.style("height").toPixels("y")
                }
                svg.ViewPort.SetCurrent(cWidth, cHeight);
                if (svg.opts["offsetX"] != null)
                    e.attribute("x", true).value = svg.opts["offsetX"];
                if (svg.opts["offsetY"] != null)
                    e.attribute("y", true).value = svg.opts["offsetY"];
                if (svg.opts["scaleWidth"] != null && svg.opts["scaleHeight"] != null) {
                    var xRatio = 1, yRatio = 1, viewBox = svg.ToNumberArray(e.attribute("viewBox").value);
                    if (e.attribute("width").hasValue())
                        xRatio = e.attribute("width").toPixels("x") / svg.opts["scaleWidth"];
                    else if (!isNaN(viewBox[2]))
                        xRatio = viewBox[2] / svg.opts["scaleWidth"];
                    if (e.attribute("height").hasValue())
                        yRatio = e.attribute("height").toPixels("y") / svg.opts["scaleHeight"];
                    else if (!isNaN(viewBox[3]))
                        yRatio = viewBox[3] / svg.opts["scaleHeight"];
                    e.attribute("width", true).value = svg.opts["scaleWidth"];
                    e.attribute("height", true).value = svg.opts["scaleHeight"];
                    e.attribute("viewBox", true).value = "0 0 " + cWidth * xRatio + " " + cHeight * yRatio;
                    e.attribute("preserveAspectRatio", true).value = "none"
                }
                if (svg.opts["ignoreClear"] != true) {
                    ctx.clearRect(0, 0, cWidth, cHeight)
                }
                e.render(ctx);
                if (isFirstRender) {
                    isFirstRender = false;
                    if (typeof svg.opts["renderCallback"] == "function")
                        svg.opts["renderCallback"](dom)
                }
            };
            var waitingForImages = true;
            if (svg.ImagesLoaded()) {
                waitingForImages = false;
                draw()
            }
            svg.intervalID = setInterval(function() {
                var needUpdate = false;
                if (waitingForImages && svg.ImagesLoaded()) {
                    waitingForImages = false;
                    needUpdate = true
                }
                if (svg.opts["ignoreMouse"] != true) {
                    needUpdate = needUpdate | svg.Mouse.hasEvents()
                }
                if (svg.opts["ignoreAnimation"] != true) {
                    for (var i = 0; i < svg.Animations.length; i++) {
                        needUpdate = needUpdate | svg.Animations[i].update(1e3 / svg.FRAMERATE)
                    }
                }
                if (typeof svg.opts["forceRedraw"] == "function") {
                    if (svg.opts["forceRedraw"]() == true)
                        needUpdate = true
                }
                if (needUpdate) {
                    draw();
                    svg.Mouse.runEvents()
                }
            }, 1e3 / svg.FRAMERATE)
        };
        svg.stop = function() {
            if (svg.intervalID) {
                clearInterval(svg.intervalID)
            }
        };
        svg.Mouse = new function() {
            this.events = [];
            this.hasEvents = function() {
                return this.events.length != 0
            };
            this.onclick = function(x, y) {
                this.events.push({
                    type: "onclick",
                    x: x,
                    y: y,
                    run: function(e) {
                        if (e.onclick)
                            e.onclick()
                    }
                })
            };
            this.onmousemove = function(x, y) {
                this.events.push({
                    type: "onmousemove",
                    x: x,
                    y: y,
                    run: function(e) {
                        if (e.onmousemove)
                            e.onmousemove()
                    }
                })
            };
            this.eventElements = [];
            this.checkPath = function(element, ctx) {
                for (var i = 0; i < this.events.length; i++) {
                    var e = this.events[i];
                    if (ctx.isPointInPath && ctx.isPointInPath(e.x, e.y))
                        this.eventElements[i] = element
                }
            };
            this.checkBoundingBox = function(element, bb) {
                for (var i = 0; i < this.events.length; i++) {
                    var e = this.events[i];
                    if (bb.isPointInBox(e.x, e.y))
                        this.eventElements[i] = element
                }
            };
            this.runEvents = function() {
                svg.ctx.canvas.style.cursor = "";
                for (var i = 0; i < this.events.length; i++) {
                    var e = this.events[i];
                    var element = this.eventElements[i];
                    while (element) {
                        e.run(element);
                        element = element.parent
                    }
                }
                this.events = [];
                this.eventElements = []
            }
        };
        return svg
    }
})();
if (typeof CanvasRenderingContext2D != "undefined") {
    CanvasRenderingContext2D.prototype.drawSvg = function(s, dx, dy, dw, dh) {
        canvg(this.canvas, s, {
            ignoreMouse: true,
            ignoreAnimation: true,
            ignoreDimensions: true,
            ignoreClear: true,
            offsetX: dx,
            offsetY: dy,
            scaleWidth: dw,
            scaleHeight: dh
        })
    }
}
function RGBColor(color_string) {
    this.ok = false;
    if (color_string.charAt(0) == "#") {
        color_string = color_string.substr(1, 6)
    }
    color_string = color_string.replace(/ /g, "");
    color_string = color_string.toLowerCase();
    var simple_colors = {
        aliceblue: "f0f8ff",
        antiquewhite: "faebd7",
        aqua: "00ffff",
        aquamarine: "7fffd4",
        azure: "f0ffff",
        beige: "f5f5dc",
        bisque: "ffe4c4",
        black: "000000",
        blanchedalmond: "ffebcd",
        blue: "0000ff",
        blueviolet: "8a2be2",
        brown: "a52a2a",
        burlywood: "deb887",
        cadetblue: "5f9ea0",
        chartreuse: "7fff00",
        chocolate: "d2691e",
        coral: "ff7f50",
        cornflowerblue: "6495ed",
        cornsilk: "fff8dc",
        crimson: "dc143c",
        cyan: "00ffff",
        darkblue: "00008b",
        darkcyan: "008b8b",
        darkgoldenrod: "b8860b",
        darkgray: "a9a9a9",
        darkgreen: "006400",
        darkkhaki: "bdb76b",
        darkmagenta: "8b008b",
        darkolivegreen: "556b2f",
        darkorange: "ff8c00",
        darkorchid: "9932cc",
        darkred: "8b0000",
        darksalmon: "e9967a",
        darkseagreen: "8fbc8f",
        darkslateblue: "483d8b",
        darkslategray: "2f4f4f",
        darkturquoise: "00ced1",
        darkviolet: "9400d3",
        deeppink: "ff1493",
        deepskyblue: "00bfff",
        dimgray: "696969",
        dodgerblue: "1e90ff",
        feldspar: "d19275",
        firebrick: "b22222",
        floralwhite: "fffaf0",
        forestgreen: "228b22",
        fuchsia: "ff00ff",
        gainsboro: "dcdcdc",
        ghostwhite: "f8f8ff",
        gold: "ffd700",
        goldenrod: "daa520",
        gray: "808080",
        green: "008000",
        greenyellow: "adff2f",
        honeydew: "f0fff0",
        hotpink: "ff69b4",
        indianred: "cd5c5c",
        indigo: "4b0082",
        ivory: "fffff0",
        khaki: "f0e68c",
        lavender: "e6e6fa",
        lavenderblush: "fff0f5",
        lawngreen: "7cfc00",
        lemonchiffon: "fffacd",
        lightblue: "add8e6",
        lightcoral: "f08080",
        lightcyan: "e0ffff",
        lightgoldenrodyellow: "fafad2",
        lightgrey: "d3d3d3",
        lightgreen: "90ee90",
        lightpink: "ffb6c1",
        lightsalmon: "ffa07a",
        lightseagreen: "20b2aa",
        lightskyblue: "87cefa",
        lightslateblue: "8470ff",
        lightslategray: "778899",
        lightsteelblue: "b0c4de",
        lightyellow: "ffffe0",
        lime: "00ff00",
        limegreen: "32cd32",
        linen: "faf0e6",
        magenta: "ff00ff",
        maroon: "800000",
        mediumaquamarine: "66cdaa",
        mediumblue: "0000cd",
        mediumorchid: "ba55d3",
        mediumpurple: "9370d8",
        mediumseagreen: "3cb371",
        mediumslateblue: "7b68ee",
        mediumspringgreen: "00fa9a",
        mediumturquoise: "48d1cc",
        mediumvioletred: "c71585",
        midnightblue: "191970",
        mintcream: "f5fffa",
        mistyrose: "ffe4e1",
        moccasin: "ffe4b5",
        navajowhite: "ffdead",
        navy: "000080",
        oldlace: "fdf5e6",
        olive: "808000",
        olivedrab: "6b8e23",
        orange: "ffa500",
        orangered: "ff4500",
        orchid: "da70d6",
        palegoldenrod: "eee8aa",
        palegreen: "98fb98",
        paleturquoise: "afeeee",
        palevioletred: "d87093",
        papayawhip: "ffefd5",
        peachpuff: "ffdab9",
        peru: "cd853f",
        pink: "ffc0cb",
        plum: "dda0dd",
        powderblue: "b0e0e6",
        purple: "800080",
        red: "ff0000",
        rosybrown: "bc8f8f",
        royalblue: "4169e1",
        saddlebrown: "8b4513",
        salmon: "fa8072",
        sandybrown: "f4a460",
        seagreen: "2e8b57",
        seashell: "fff5ee",
        sienna: "a0522d",
        silver: "c0c0c0",
        skyblue: "87ceeb",
        slateblue: "6a5acd",
        slategray: "708090",
        snow: "fffafa",
        springgreen: "00ff7f",
        steelblue: "4682b4",
        tan: "d2b48c",
        teal: "008080",
        thistle: "d8bfd8",
        tomato: "ff6347",
        turquoise: "40e0d0",
        violet: "ee82ee",
        violetred: "d02090",
        wheat: "f5deb3",
        white: "ffffff",
        whitesmoke: "f5f5f5",
        yellow: "ffff00",
        yellowgreen: "9acd32"
    };
    for (var key in simple_colors) {
        if (color_string == key) {
            color_string = simple_colors[key]
        }
    }
    var color_defs = [{
        re: /^rgb\((\d{1,3}),\s*(\d{1,3}),\s*(\d{1,3})\)$/,
        example: ["rgb(123, 234, 45)", "rgb(255,234,245)"],
        process: function(bits) {
            return [parseInt(bits[1]), parseInt(bits[2]), parseInt(bits[3])]
        }
    }, {
        re: /^(\w{2})(\w{2})(\w{2})$/,
        example: ["#00ff00", "336699"],
        process: function(bits) {
            return [parseInt(bits[1], 16), parseInt(bits[2], 16), parseInt(bits[3], 16)]
        }
    }, {
        re: /^(\w{1})(\w{1})(\w{1})$/,
        example: ["#fb0", "f0f"],
        process: function(bits) {
            return [parseInt(bits[1] + bits[1], 16), parseInt(bits[2] + bits[2], 16), parseInt(bits[3] + bits[3], 16)]
        }
    }
    ];
    for (var i = 0; i < color_defs.length; i++) {
        var re = color_defs[i].re;
        var processor = color_defs[i].process;
        var bits = re.exec(color_string);
        if (bits) {
            channels = processor(bits);
            this.r = channels[0];
            this.g = channels[1];
            this.b = channels[2];
            this.ok = true
        }
    }
    this.r = this.r < 0 || isNaN(this.r) ? 0 : this.r > 255 ? 255 : this.r;
    this.g = this.g < 0 || isNaN(this.g) ? 0 : this.g > 255 ? 255 : this.g;
    this.b = this.b < 0 || isNaN(this.b) ? 0 : this.b > 255 ? 255 : this.b;
    this.toRGB = function() {
        return "rgb(" + this.r + ", " + this.g + ", " + this.b + ")"
    };
    this.toHex = function() {
        var r = this.r.toString(16);
        var g = this.g.toString(16);
        var b = this.b.toString(16);
        if (r.length == 1)
            r = "0" + r;
        if (g.length == 1)
            g = "0" + g;
        if (b.length == 1)
            b = "0" + b;
        return "#" + r + g + b
    };
    this.getHelpXML = function() {
        var examples = new Array;
        for (var i = 0; i < color_defs.length; i++) {
            var example = color_defs[i].example;
            for (var j = 0; j < example.length; j++) {
                examples[examples.length] = example[j]
            }
        }
        for (var sc in simple_colors) {
            examples[examples.length] = sc
        }
        var xml = document.createElement("ul");
        xml.setAttribute("id", "rgbcolor-examples");
        for (var i = 0; i < examples.length; i++) {
            try {
                var list_item = document.createElement("li");
                var list_color = new RGBColor(examples[i]);
                var example_div = document.createElement("div");
                example_div.style.cssText = "margin: 3px; " + "border: 1px solid black; " + "background:" + list_color.toHex() + "; " + "color:" + list_color.toHex();
                example_div.appendChild(document.createTextNode("test"));
                var list_item_value = document.createTextNode(" " + examples[i] + " -> " + list_color.toRGB() + " -> " + list_color.toHex());
                list_item.appendChild(example_div);
                list_item.appendChild(list_item_value);
                xml.appendChild(list_item)
            } catch (e) {}
        }
        return xml
    }
}
var mul_table = [512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259];
var shg_table = [9, 11, 12, 13, 13, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24];
function stackBlurImage(imageID, canvasID, radius, blurAlphaChannel) {
    var img = document.getElementById(imageID);
    var w = img.naturalWidth;
    var h = img.naturalHeight;
    var canvas = document.getElementById(canvasID);
    canvas.style.width = w + "px";
    canvas.style.height = h + "px";
    canvas.width = w;
    canvas.height = h;
    var context = canvas.getContext("2d");
    context.clearRect(0, 0, w, h);
    context.drawImage(img, 0, 0);
    if (isNaN(radius) || radius < 1)
        return;
    if (blurAlphaChannel)
        stackBlurCanvasRGBA(canvasID, 0, 0, w, h, radius);
    else 
        stackBlurCanvasRGB(canvasID, 0, 0, w, h, radius)
}
function stackBlurCanvasRGBA(id, top_x, top_y, width, height, radius) {
    if (isNaN(radius) || radius < 1)
        return;
    radius|=0;
    var canvas = document.getElementById(id);
    var context = canvas.getContext("2d");
    var imageData;
    try {
        try {
            imageData = context.getImageData(top_x, top_y, width, height)
        } catch (e) {
            try {
                netscape.security.PrivilegeManager.enablePrivilege("UniversalBrowserRead");
                imageData = context.getImageData(top_x, top_y, width, height)
            } catch (e) {
                alert("Cannot access local image");
                throw new Error("unable to access local image data: " + e);
                return 
            }
        }
    } catch (e) {
        alert("Cannot access image");
        throw new Error("unable to access image data: " + e)
    }
    var pixels = imageData.data;
    var x, y, i, p, yp, yi, yw, r_sum, g_sum, b_sum, a_sum, r_out_sum, g_out_sum, b_out_sum, a_out_sum, r_in_sum, g_in_sum, b_in_sum, a_in_sum, pr, pg, pb, pa, rbs;
    var div = radius + radius + 1;
    var w4 = width<<2;
    var widthMinus1 = width - 1;
    var heightMinus1 = height - 1;
    var radiusPlus1 = radius + 1;
    var sumFactor = radiusPlus1 * (radiusPlus1 + 1) / 2;
    var stackStart = new BlurStack;
    var stack = stackStart;
    for (i = 1; i < div; i++) {
        stack = stack.next = new BlurStack;
        if (i == radiusPlus1)
            var stackEnd = stack
    }
    stack.next = stackStart;
    var stackIn = null;
    var stackOut = null;
    yw = yi = 0;
    var mul_sum = mul_table[radius];
    var shg_sum = shg_table[radius];
    for (y = 0; y < height; y++) {
        r_in_sum = g_in_sum = b_in_sum = a_in_sum = r_sum = g_sum = b_sum = a_sum = 0;
        r_out_sum = radiusPlus1 * (pr = pixels[yi]);
        g_out_sum = radiusPlus1 * (pg = pixels[yi + 1]);
        b_out_sum = radiusPlus1 * (pb = pixels[yi + 2]);
        a_out_sum = radiusPlus1 * (pa = pixels[yi + 3]);
        r_sum += sumFactor * pr;
        g_sum += sumFactor * pg;
        b_sum += sumFactor * pb;
        a_sum += sumFactor * pa;
        stack = stackStart;
        for (i = 0; i < radiusPlus1; i++) {
            stack.r = pr;
            stack.g = pg;
            stack.b = pb;
            stack.a = pa;
            stack = stack.next
        }
        for (i = 1; i < radiusPlus1; i++) {
            p = yi + ((widthMinus1 < i ? widthMinus1 : i)<<2);
            r_sum += (stack.r = pr = pixels[p]) * (rbs = radiusPlus1 - i);
            g_sum += (stack.g = pg = pixels[p + 1]) * rbs;
            b_sum += (stack.b = pb = pixels[p + 2]) * rbs;
            a_sum += (stack.a = pa = pixels[p + 3]) * rbs;
            r_in_sum += pr;
            g_in_sum += pg;
            b_in_sum += pb;
            a_in_sum += pa;
            stack = stack.next
        }
        stackIn = stackStart;
        stackOut = stackEnd;
        for (x = 0; x < width; x++) {
            pixels[yi + 3] = pa = a_sum * mul_sum>>shg_sum;
            if (pa != 0) {
                pa = 255 / pa;
                pixels[yi] = (r_sum * mul_sum>>shg_sum) * pa;
                pixels[yi + 1] = (g_sum * mul_sum>>shg_sum) * pa;
                pixels[yi + 2] = (b_sum * mul_sum>>shg_sum) * pa
            } else {
                pixels[yi] = pixels[yi + 1] = pixels[yi + 2] = 0
            }
            r_sum -= r_out_sum;
            g_sum -= g_out_sum;
            b_sum -= b_out_sum;
            a_sum -= a_out_sum;
            r_out_sum -= stackIn.r;
            g_out_sum -= stackIn.g;
            b_out_sum -= stackIn.b;
            a_out_sum -= stackIn.a;
            p = yw + ((p = x + radius + 1) < widthMinus1 ? p : widthMinus1)<<2;
            r_in_sum += stackIn.r = pixels[p];
            g_in_sum += stackIn.g = pixels[p + 1];
            b_in_sum += stackIn.b = pixels[p + 2];
            a_in_sum += stackIn.a = pixels[p + 3];
            r_sum += r_in_sum;
            g_sum += g_in_sum;
            b_sum += b_in_sum;
            a_sum += a_in_sum;
            stackIn = stackIn.next;
            r_out_sum += pr = stackOut.r;
            g_out_sum += pg = stackOut.g;
            b_out_sum += pb = stackOut.b;
            a_out_sum += pa = stackOut.a;
            r_in_sum -= pr;
            g_in_sum -= pg;
            b_in_sum -= pb;
            a_in_sum -= pa;
            stackOut = stackOut.next;
            yi += 4
        }
        yw += width
    }
    for (x = 0; x < width; x++) {
        g_in_sum = b_in_sum = a_in_sum = r_in_sum = g_sum = b_sum = a_sum = r_sum = 0;
        yi = x<<2;
        r_out_sum = radiusPlus1 * (pr = pixels[yi]);
        g_out_sum = radiusPlus1 * (pg = pixels[yi + 1]);
        b_out_sum = radiusPlus1 * (pb = pixels[yi + 2]);
        a_out_sum = radiusPlus1 * (pa = pixels[yi + 3]);
        r_sum += sumFactor * pr;
        g_sum += sumFactor * pg;
        b_sum += sumFactor * pb;
        a_sum += sumFactor * pa;
        stack = stackStart;
        for (i = 0; i < radiusPlus1; i++) {
            stack.r = pr;
            stack.g = pg;
            stack.b = pb;
            stack.a = pa;
            stack = stack.next
        }
        yp = width;
        for (i = 1; i <= radius; i++) {
            yi = yp + x<<2;
            r_sum += (stack.r = pr = pixels[yi]) * (rbs = radiusPlus1 - i);
            g_sum += (stack.g = pg = pixels[yi + 1]) * rbs;
            b_sum += (stack.b = pb = pixels[yi + 2]) * rbs;
            a_sum += (stack.a = pa = pixels[yi + 3]) * rbs;
            r_in_sum += pr;
            g_in_sum += pg;
            b_in_sum += pb;
            a_in_sum += pa;
            stack = stack.next;
            if (i < heightMinus1) {
                yp += width
            }
        }
        yi = x;
        stackIn = stackStart;
        stackOut = stackEnd;
        for (y = 0; y < height; y++) {
            p = yi<<2;
            pixels[p + 3] = pa = a_sum * mul_sum>>shg_sum;
            if (pa > 0) {
                pa = 255 / pa;
                pixels[p] = (r_sum * mul_sum>>shg_sum) * pa;
                pixels[p + 1] = (g_sum * mul_sum>>shg_sum) * pa;
                pixels[p + 2] = (b_sum * mul_sum>>shg_sum) * pa
            } else {
                pixels[p] = pixels[p + 1] = pixels[p + 2] = 0
            }
            r_sum -= r_out_sum;
            g_sum -= g_out_sum;
            b_sum -= b_out_sum;
            a_sum -= a_out_sum;
            r_out_sum -= stackIn.r;
            g_out_sum -= stackIn.g;
            b_out_sum -= stackIn.b;
            a_out_sum -= stackIn.a;
            p = x + ((p = y + radiusPlus1) < heightMinus1 ? p : heightMinus1) * width<<2;
            r_sum += r_in_sum += stackIn.r = pixels[p];
            g_sum += g_in_sum += stackIn.g = pixels[p + 1];
            b_sum += b_in_sum += stackIn.b = pixels[p + 2];
            a_sum += a_in_sum += stackIn.a = pixels[p + 3];
            stackIn = stackIn.next;
            r_out_sum += pr = stackOut.r;
            g_out_sum += pg = stackOut.g;
            b_out_sum += pb = stackOut.b;
            a_out_sum += pa = stackOut.a;
            r_in_sum -= pr;
            g_in_sum -= pg;
            b_in_sum -= pb;
            a_in_sum -= pa;
            stackOut = stackOut.next;
            yi += width
        }
    }
    context.putImageData(imageData, top_x, top_y)
}
function stackBlurCanvasRGB(id, top_x, top_y, width, height, radius) {
    if (isNaN(radius) || radius < 1)
        return;
    radius|=0;
    var canvas = document.getElementById(id);
    var context = canvas.getContext("2d");
    var imageData;
    try {
        try {
            imageData = context.getImageData(top_x, top_y, width, height)
        } catch (e) {
            try {
                netscape.security.PrivilegeManager.enablePrivilege("UniversalBrowserRead");
                imageData = context.getImageData(top_x, top_y, width, height)
            } catch (e) {
                alert("Cannot access local image");
                throw new Error("unable to access local image data: " + e);
                return 
            }
        }
    } catch (e) {
        alert("Cannot access image");
        throw new Error("unable to access image data: " + e)
    }
    var pixels = imageData.data;
    var x, y, i, p, yp, yi, yw, r_sum, g_sum, b_sum, r_out_sum, g_out_sum, b_out_sum, r_in_sum, g_in_sum, b_in_sum, pr, pg, pb, rbs;
    var div = radius + radius + 1;
    var w4 = width<<2;
    var widthMinus1 = width - 1;
    var heightMinus1 = height - 1;
    var radiusPlus1 = radius + 1;
    var sumFactor = radiusPlus1 * (radiusPlus1 + 1) / 2;
    var stackStart = new BlurStack;
    var stack = stackStart;
    for (i = 1; i < div; i++) {
        stack = stack.next = new BlurStack;
        if (i == radiusPlus1)
            var stackEnd = stack
    }
    stack.next = stackStart;
    var stackIn = null;
    var stackOut = null;
    yw = yi = 0;
    var mul_sum = mul_table[radius];
    var shg_sum = shg_table[radius];
    for (y = 0; y < height; y++) {
        r_in_sum = g_in_sum = b_in_sum = r_sum = g_sum = b_sum = 0;
        r_out_sum = radiusPlus1 * (pr = pixels[yi]);
        g_out_sum = radiusPlus1 * (pg = pixels[yi + 1]);
        b_out_sum = radiusPlus1 * (pb = pixels[yi + 2]);
        r_sum += sumFactor * pr;
        g_sum += sumFactor * pg;
        b_sum += sumFactor * pb;
        stack = stackStart;
        for (i = 0; i < radiusPlus1; i++) {
            stack.r = pr;
            stack.g = pg;
            stack.b = pb;
            stack = stack.next
        }
        for (i = 1; i < radiusPlus1; i++) {
            p = yi + ((widthMinus1 < i ? widthMinus1 : i)<<2);
            r_sum += (stack.r = pr = pixels[p]) * (rbs = radiusPlus1 - i);
            g_sum += (stack.g = pg = pixels[p + 1]) * rbs;
            b_sum += (stack.b = pb = pixels[p + 2]) * rbs;
            r_in_sum += pr;
            g_in_sum += pg;
            b_in_sum += pb;
            stack = stack.next
        }
        stackIn = stackStart;
        stackOut = stackEnd;
        for (x = 0; x < width; x++) {
            pixels[yi] = r_sum * mul_sum>>shg_sum;
            pixels[yi + 1] = g_sum * mul_sum>>shg_sum;
            pixels[yi + 2] = b_sum * mul_sum>>shg_sum;
            r_sum -= r_out_sum;
            g_sum -= g_out_sum;
            b_sum -= b_out_sum;
            r_out_sum -= stackIn.r;
            g_out_sum -= stackIn.g;
            b_out_sum -= stackIn.b;
            p = yw + ((p = x + radius + 1) < widthMinus1 ? p : widthMinus1)<<2;
            r_in_sum += stackIn.r = pixels[p];
            g_in_sum += stackIn.g = pixels[p + 1];
            b_in_sum += stackIn.b = pixels[p + 2];
            r_sum += r_in_sum;
            g_sum += g_in_sum;
            b_sum += b_in_sum;
            stackIn = stackIn.next;
            r_out_sum += pr = stackOut.r;
            g_out_sum += pg = stackOut.g;
            b_out_sum += pb = stackOut.b;
            r_in_sum -= pr;
            g_in_sum -= pg;
            b_in_sum -= pb;
            stackOut = stackOut.next;
            yi += 4
        }
        yw += width
    }
    for (x = 0; x < width; x++) {
        g_in_sum = b_in_sum = r_in_sum = g_sum = b_sum = r_sum = 0;
        yi = x<<2;
        r_out_sum = radiusPlus1 * (pr = pixels[yi]);
        g_out_sum = radiusPlus1 * (pg = pixels[yi + 1]);
        b_out_sum = radiusPlus1 * (pb = pixels[yi + 2]);
        r_sum += sumFactor * pr;
        g_sum += sumFactor * pg;
        b_sum += sumFactor * pb;
        stack = stackStart;
        for (i = 0; i < radiusPlus1; i++) {
            stack.r = pr;
            stack.g = pg;
            stack.b = pb;
            stack = stack.next
        }
        yp = width;
        for (i = 1; i <= radius; i++) {
            yi = yp + x<<2;
            r_sum += (stack.r = pr = pixels[yi]) * (rbs = radiusPlus1 - i);
            g_sum += (stack.g = pg = pixels[yi + 1]) * rbs;
            b_sum += (stack.b = pb = pixels[yi + 2]) * rbs;
            r_in_sum += pr;
            g_in_sum += pg;
            b_in_sum += pb;
            stack = stack.next;
            if (i < heightMinus1) {
                yp += width
            }
        }
        yi = x;
        stackIn = stackStart;
        stackOut = stackEnd;
        for (y = 0; y < height; y++) {
            p = yi<<2;
            pixels[p] = r_sum * mul_sum>>shg_sum;
            pixels[p + 1] = g_sum * mul_sum>>shg_sum;
            pixels[p + 2] = b_sum * mul_sum>>shg_sum;
            r_sum -= r_out_sum;
            g_sum -= g_out_sum;
            b_sum -= b_out_sum;
            r_out_sum -= stackIn.r;
            g_out_sum -= stackIn.g;
            b_out_sum -= stackIn.b;
            p = x + ((p = y + radiusPlus1) < heightMinus1 ? p : heightMinus1) * width<<2;
            r_sum += r_in_sum += stackIn.r = pixels[p];
            g_sum += g_in_sum += stackIn.g = pixels[p + 1];
            b_sum += b_in_sum += stackIn.b = pixels[p + 2];
            stackIn = stackIn.next;
            r_out_sum += pr = stackOut.r;
            g_out_sum += pg = stackOut.g;
            b_out_sum += pb = stackOut.b;
            r_in_sum -= pr;
            g_in_sum -= pg;
            b_in_sum -= pb;
            stackOut = stackOut.next;
            yi += width
        }
    }
    context.putImageData(imageData, top_x, top_y)
}
function BlurStack() {
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.a = 0;
    this.next = null
}
joint.dia.Paper.prototype.toDataURL = function(callback, options) {
    if (typeof this.toSVG !== "function")
        throw new Error("The joint.format.svg.js plugin must be loaded.");
	options = options || {};
    var imageWidth, imageHeight, contentHeight, contentWidth, padding = options.padding || 0;
    if (!options.width ||!options.height) {
        var clientRect = this.viewport.getBoundingClientRect();
        contentWidth = clientRect.width || 1;
        contentHeight = clientRect.height || 1;
        imageWidth = contentWidth + 2 * padding;
        imageHeight = contentHeight + 2 * padding
    } else {
        imageWidth = options.width;
        imageHeight = options.height;
        padding = Math.min(padding, imageWidth / 2 - 1, imageHeight / 2 - 1);
        contentWidth = imageWidth - 2 * padding;
        contentHeight = imageHeight - 2 * padding
    }
    var img = new Image;
    img.onload = function() {
        var dataURL, context, canvas;
        function createCanvas() {
            canvas = document.createElement("canvas");
            canvas.width = imageWidth;
            canvas.height = imageHeight;
            context = canvas.getContext("2d");
            context.fillStyle = options.backgroundColor || "white";
            context.fillRect(0, 0, imageWidth, imageHeight)
        }
        createCanvas();
        context.drawImage(img, padding, padding, contentWidth, contentHeight);
        try {
            dataURL = canvas.toDataURL(options.type, options.quality)
        } catch (e) {
            if (typeof canvg === "undefined") {
                console.error("Canvas tainted. Canvg library required.");
                return 
            }
            createCanvas();
            canvg(canvas, svg, {
                ignoreDimensions: true,
                ignoreClear: true,
                offsetX: padding,
                offsetY: padding,
                renderCallback: function() {
                    dataURL = canvas.toDataURL(options.type, options.quality);
                    callback(dataURL)
                }
            });
            return 
        }
        callback(dataURL)
    };
    var svg = this.toSVG();
    svg = svg.replace('width="100%"', 'width="' + contentWidth + '"').replace('height="100%"', 'height="' + contentHeight + '"');
    img.src = "data:image/svg+xml;base64," + btoa(svg)
};
joint.dia.Paper.prototype.toPNG = function(callback, options) {
    options = options || {};
    options.type = "image/png";
    this.toDataURL(callback, options)
};
joint.dia.Paper.prototype.toJPEG = function(callback, options) {
    options = options || {};
    options.type = "image/jpeg";
    this.toDataURL(callback, options)
};
joint.dia.Paper.prototype.openAsPNG = function() {
    var windowFeatures = "menubar=yes,location=yes,resizable=yes,scrollbars=yes,status=yes";
    var windowName = _.uniqueId("png_output");
    var imageWindow = window.open("", windowName, windowFeatures);
    this.toPNG(function(dataURL) {
        imageWindow.document.write('<img src="' + dataURL + '"/>')
    }, {
        padding: 10
    })
};
joint.dia.Graph.prototype.constructTree = function(parent, opt, parentElement, collector) {
    collector = collector || [];
    var children = _.isFunction(opt.children) ? opt.children(parent): parent[opt.children || "children"];
    if (!parentElement) {
        parentElement = opt.makeElement(parent);
        collector.push(parentElement)
    }
    _.each(children, function(child) {
        var childElement = opt.makeElement(child);
        var link = opt.makeLink(parentElement, childElement);
        collector.push(childElement, link);
        this.constructTree(child, opt, childElement, collector)
    }, this);
    return collector
};
var graph = new joint.dia.Graph;
var paper = new joint.dia.Paper({
    width: 1e3,
    height: 1e3,
    gridSize: 1,
    model: graph,
    async: {
        batchSize: 50
    }
});
var paperScroller = new joint.ui.PaperScroller({
    paper: paper
});
paperScroller.$el.appendTo("#paper");
$(".paper-scroller").on("mousewheel DOMMouseScroll", function(evt) {
    if (evt.altKey) {
        evt.preventDefault();
        var delta = Math.max( - 1, Math.min(1, evt.originalEvent.wheelDelta||-evt.originalEvent.detail));
        delta = delta / 5;
        var offset = paperScroller.$el.offset();
        var o = paperScroller.toLocalPoint(evt.pageX - offset.left, evt.pageY - offset.top);
        paperScroller.zoom(delta, {
            min: .2,
            max: 5,
            ox: o.x,
            oy: o.y
        })
    }
});
paper.on("blank:pointerdown", function(evt, x, y) {
    paperScroller.startPanning(evt, x, y)
});
var renderStartTime;
function printStats() {
    console.log("rendering time", (new Date).getTime() - renderStartTime.getTime() + " ms");
    console.log("cells: " + graph.get("cells").length + ", elements: " + graph.getElements().length + ", links: " + graph.getLinks().length)
}
function getChildren(node) {
    switch (node.type) {
    case"Program":
        return node.body;
    case"VariableDeclaration":
        return node.declarations;
    case"VariableDeclarator":
        return node.init ? [node.id, node.init] : [node.id];
    case"ExpressionStatement":
        return [node.expression];
    case"BinaryExpression":
        return [node.left, node.right];
    case"AssignmentExpression":
        return [node.left, node.right];
    case"CallExpression":
        return [node.callee, {
            type: "arguments",
            arguments: node.arguments
        }
        ];
    case"arguments":
        return node.arguments;
    case"MemberExpression":
        return [node.object, node.property];
    case"NewExpression":
        return node.arguments;
    case"ObjectExpression":
        return node.properties;
    case"Property":
        return [node.key, node.value];
    case"FunctionDeclaration":
        return [node.body];
    case"FunctionExpression":
        return [node.body];
    case"BlockStatement":
        return node.body;
    case"ReturnStatement":
        return node.argument ? [node.argument] : [];
    case"UnaryExpression":
        return [node.argument];
    case"IfStatement":
        return [node.test, node.consequent];
    case"ConditionalExpression":
        return [node.test, node.consequent, node.alternate];
    default:
        return []
    }
}
function getLabel(node) {
    switch (node.type) {
    case"Identifier":
        return node.name;
    case"Literal":
        return node.raw;
    case"UnaryExpression":
        return node.operator;
    case"BinaryExpression":
        return node.operator;
    case"AssignmentExpression":
        return node.operator;
    case"FunctionDeclaration":
        return "function " + (node.id && node.id.name || "") + "(" + _.pluck(node.params, "name").join(",") + ")";
    case"FunctionExpression":
        return "function " + (node.id && node.id.name || "") + "(" + _.pluck(node.params, "name").join(",") + ")";
    default:
        return node.type
    }
}
function getElementColor(node) {
    var color = {
        Program: "black",
        VariableDeclarator: "#414141",
        arguments: "#63c1f1",
        BinaryExpression: "#fcbc2a",
        UnaryExpression: "#fcbc2a",
        AssignmentExpression: "#fcbc2a",
        Identifier: "#ff5246",
        Literal: "#77c63d"
    }
    [node.type];
    return color || "#232323"
}
var program;
var FastLink = joint.dia.Link.extend({
    markup: '<path class="connection" stroke="gray" fill="none" d=""/>'
});
function displayTree() {
    program = $("#program").val();
    var syntax = esprima.parse(program, {
        loc: true,
        range: true,
        raw: true,
        tokens: true,
        comment: true
    });
    var cells = graph.constructTree(syntax, {
        children: getChildren,
        makeElement: function(node) {
            return new joint.shapes.basic.Rect({
                size: {
                    width: 80,
                    height: 30
                },
                attrs: {
                    text: {
                        text: getLabel(node),
                        fill: "white",
                        "font-size": 8
                    },
                    rect: {
                        fill: getElementColor(node),
                        rx: 5,
                        ry: 5,
                        stroke: "none"
                    }
                },
                node: node
            })
        },
        makeLink: function(parentElement, childElement) {
            return new FastLink({
                source: {
                    id: parentElement.id
                },
                target: {
                    id: childElement.id
                },
                attrs: {
                    ".marker-target": {
                        d: "M 4 0 L 0 2 L 4 4 z"
                    }
                }
            })
        }
    });
    renderStartTime = new Date;
    graph.resetCells(cells);
    $("#stats .stats-n-nodes").text(graph.getElements().length);
    $("#stats .stats-n-tokens").text(syntax.tokens.length);
    $("#stats .stats-tokens").empty();
    _.each(syntax.tokens, function(token) {
        var $li = $("<li/>", {
            text: token.type + "(",
            "data-range": JSON.stringify(token.range)
        });
        $li.append($("<span/>", {
            text: token.value
        }));
        $li.append(")");
        $("#stats .stats-tokens").append($li)
    })
}
var fitToContent = _.debounce(function() {
    paper.fitToContent()
}, 100);
function layout() {
    joint.layout.DirectedGraph.layout(graph, {
        rankDir: $(".toggle-layout-direction input").is(":checked") ? "LR": "TB",
        setLinkVertices: false,
        setPosition: function(cell, position) {
            cell.transition("position/x", position.x - position.width / 2);
            cell.transition("position/y", position.y - position.height / 2);
            cell.on("transition:end", fitToContent)
        }
    })
}
var subtrees = {};
paper.on("cell:pointerclick", function(cellView, evt, x, y) {
    var cell = cellView.model;
    console.log(cell.get("node"));
    if (subtrees[cell.id]) {
        graph.addCells(subtrees[cell.id].sort(function(a, b) {
            return a instanceof joint.dia.Link ? 1 : - 1
        }));
        delete subtrees[cell.id];
        return layout()
    }
    function store(cell) {
        (subtrees[cellView.model.id] || (subtrees[cellView.model.id] = [])).push(cell)
    }
    graph.on("remove", store);
    removeSubtree(cellView.model);
    layout();
    graph.off("remove", store)
});
function removeSubtree(element) {
    _.each(graph.getConnectedLinks(element, {
        outbound: true
    }), function(link) {
        var target = graph.getCell(link.get("target").id);
        removeSubtree(target);
        target.remove()
    })
}
function loadProgram(program) {
    var code = $("#program-" + program).text();
    $("#program").val(code);
    codeEditor.setValue(code);
    displayTree();
    layout()
}
$("#select-program").on("change", function() {
    loadProgram($(this).val())
});
var codeEditor = CodeMirror.fromTextArea(document.getElementById("program"), {
    lineNumbers: true,
    mode: "javascript"
});
codeEditor.on("change", function() {
    $("#program").val(codeEditor.getValue())
});
loadProgram("function");
$("#btn-clear").on("click", function() {
    graph.clear();
    $("#program").val("");
    codeEditor.setValue("");
    $(".stats-tokens").empty()
});
$("#btn-visualize").on("click", function() {
    displayTree();
    layout()
});
$(".toggle-layout-direction input").on("change", layout);
$("#btn-export-svg").on("click", function() {
    paper.openAsSVG();
    console.log(paper.toSVG())
});
$("#btn-export-png").on("click", function() {
    paper.openAsPNG()
});
var tooltip = new joint.ui.Tooltip({
    rootTarget: "#paper",
    target: ".element",
    content: function(element) {
        var cell = paper.findView(element).model;
        var node = cell.get("node");
        var snippet = node.range ? program.substring(node.range[0], node.range[1]): "";
        return "<b>" + node.type + "</b>" + snippet.replace(/\n/g, "<br/>").replace(/\ /g, "&nbsp;")
    },
    direction: "left",
    padding: 20
});
var tokenMarker;
$(".stats-tokens").on("mouseenter", "li", function() {
    var $li = $(this).closest("li");
    var range = $li.data("range");
    tokenMarker = codeEditor.markText(codeEditor.posFromIndex(range[0]), codeEditor.posFromIndex(range[1]), {
        className: "syntax-token"
    })
});
$(".stats-tokens").on("mouseleave", "li", function() {
    if (tokenMarker)
        tokenMarker.clear()
});

