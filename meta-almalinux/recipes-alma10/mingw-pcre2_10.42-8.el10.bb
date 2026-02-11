
PN = "mingw-pcre2"
PE = "0"
PV = "10.42"
PR = "8.el10"
PACKAGES = "mingw32-pcre2 mingw32-pcre2-static mingw64-pcre2 mingw64-pcre2-static"


URI_mingw32-pcre2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-pcre2-10.42-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-pcre2 = " \
 bash \
 mingw32-crt \
 mingw32-filesystem \
"

URI_mingw32-pcre2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-pcre2-static-10.42-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-pcre2-static = ""

URI_mingw64-pcre2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-pcre2-10.42-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-pcre2 = " \
 bash \
 mingw64-crt \
 mingw64-filesystem \
"

URI_mingw64-pcre2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-pcre2-static-10.42-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-pcre2-static = ""
