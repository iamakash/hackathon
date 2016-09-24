<html>
<head>
    <meta name='layout' content='main'/>
    <title><g:message code="springSecurity.login.title"/></title>
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <!-- start Mixpanel --><script type="text/javascript">(function (e, a) {
    if (!a.__SV) {
        var b = window;
        try {
            var c, l, i, j = b.location, g = j.hash;
            c = function (a, b) {
                return (l = a.match(RegExp(b + "=([^&]*)"))) ? l[1] : null
            };
            g && c(g, "state") && (i = JSON.parse(decodeURIComponent(c(g, "state"))), "mpeditor" === i.action && (b.sessionStorage.setItem("_mpcehash", g), history.replaceState(i.desiredHash || "", e.title, j.pathname + j.search)))
        } catch (m) {
        }
        var k, h;
        window.mixpanel = a;
        a._i = [];
        a.init = function (b, c, f) {
            function e(b, a) {
                var c = a.split(".");
                2 == c.length && (b = b[c[0]], a = c[1]);
                b[a] = function () {
                    b.push([a].concat(Array.prototype.slice.call(arguments,
                            0)))
                }
            }

            var d = a;
            "undefined" !== typeof f ? d = a[f] = [] : f = "mixpanel";
            d.people = d.people || [];
            d.toString = function (b) {
                var a = "mixpanel";
                "mixpanel" !== f && (a += "." + f);
                b || (a += " (stub)");
                return a
            };
            d.people.toString = function () {
                return d.toString(1) + ".people (stub)"
            };
            k = "disable time_event track track_pageview track_links track_forms register register_once alias unregister identify name_tag set_config reset people.set people.set_once people.increment people.append people.union people.track_charge people.clear_charges people.delete_user".split(" ");
            for (h = 0; h < k.length; h++)e(d, k[h]);
            a._i.push([b, c, f])
        };
        a.__SV = 1.2;
        b = e.createElement("script");
        b.type = "text/javascript";
        b.async = !0;
        b.src = "undefined" !== typeof MIXPANEL_CUSTOM_LIB_URL ? MIXPANEL_CUSTOM_LIB_URL : "file:" === e.location.protocol && "//cdn.mxpnl.com/libs/mixpanel-2-latest.min.js".match(/^\/\//) ? "https://cdn.mxpnl.com/libs/mixpanel-2-latest.min.js" : "//cdn.mxpnl.com/libs/mixpanel-2-latest.min.js";
        c = e.getElementsByTagName("script")[0];
        c.parentNode.insertBefore(b, c)
    }
})(document, window.mixpanel || []);
mixpanel.init("cbd8631c9dd948656696bb1cb1a580fe");</script><!-- end Mixpanel -->
</head>

<body>

%{--<div class="container">--}%
<div class="row" style="text-align: center;margin-top: 10%">
    <a href="${createLink(controller: "userRegistration", action: "index")}">Click here to register</a>

    <div class="col-md-offset-4 col-md-4">
        <div class="form-login">
            <form action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off'>
                <g:if test='${flash.message}'>
                    <div class='login_message'>${flash.message}</div>
                </g:if>
                <h4>Welcome back.</h4>
                <input type="text" id="userName" name="j_username" class="form-control input-sm chat-input"
                       placeholder="username"/>
            </br>
                <input type="password" id="userPassword" name="j_password" class="form-control input-sm chat-input"
                       placeholder="password"/>
            </br>
                <div class="wrapper">
                    <span class="group-btn">
                        <input type='submit' class="btn btn-primary btn-md" id="submit"
                               value='${message(code: "springSecurity.login.button")}'/>
                        %{--<a href="#" class="btn btn-primary btn-md">login <i class="fa fa-sign-in"></i></a>--}%
                    </span>
                </div>
            </form>
        </div>

    </div>
    %{--</div>--}%
</div>
<script type='text/javascript'>
    (function () {
        document.forms['loginForm'].elements['j_username'].focus();
    })();
</script>
</body>
</html>
