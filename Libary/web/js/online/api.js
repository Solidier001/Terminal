!function(a) {
    "use strict";
    function b(a, b) {
        b = b || function() {};
        var c = document.createElement("script");
        c.type = "text/javascript", c.charset = "utf-8", c.readyState ? c.onreadystatechange = function() {
            ("loaded" === c.readyState || "complete" === c.readyState) && (c.onreadystatechange = null,
                b());
        } : c.onload = function() {
            b();
        }, c.src = a, document.getElementsByTagName("head")[0].appendChild(c);
    }
    function c() {
        b(h.ucCommonLoginApi.src);
    }
    function d() {
        a.jQuery ? c() : b(h.jQuery.src, function() {
            c();
        });
    }
    function e(a) {
        for (var b, c = 0; c < a.length; c++) b = document.createElement("link"), b.rel = "stylesheet",
            b.href = g[a[c]].src, document.getElementsByTagName("head")[0].appendChild(b);
    }
    var f = "//cas.baidu.com/staticv2", g = {
        ucCommonLoginStyle: {
            name: "ucCommonLoginStyle",
            src: f + "/dep/common-login/css/index.css?1449458029797"
        },
        passportStyle: {
            name: "passportStyle",
            src: f + "/dep/common-login/css/passport.css?1449458029797"
        }
    }, h = {
        jQuery: {
            name: "jQuery",
            src: "//cas.baidu.com/dep/jquery/1.7.2/jquery.min.js"
        },
        ucCommonLoginApi: {
            name: "ucCommonLoginApi",
            src: "/js/online/main.js?1449458029797"
        }
    };
    a.ucCommonLogin = {
        init: function(a) {
            a.defaultCss = "defaultCss" in a ? a.defaultCss : !0;
            var b = [ "ucCommonLoginStyle" ];
            a.multiLogin && b.push("passportStyle"), a.defaultCss && e(b), this.initData = a,
                d();
        },
        show: function() {
            this.PubSub.fire("show");
        },
        hide: function() {
            this.PubSub.fire("hide");
        },
        PubSub: {
            handlers: {},
            on: function(b, c, d) {
                if (b in this.handlers || (this.handlers[b] = []), 1 === d) {
                    var e = c;
                    c = function() {
                        return a.ucCommonLogin.PubSub.off(b), e.apply(this, arguments);
                    };
                }
                return this.handlers[b].push(c), this;
            },
            off: function(a) {
                delete this.handlers[a];
            },
            fire: function(a) {
                var b = Array.prototype.slice.call(arguments, 1);
                if (!this.handlers[a]) return this;
                for (var c = 0; c < this.handlers[a].length; c++) this.handlers[a][c].apply(this, b);
                return this;
            }
        }
    };
}(window);