
PN = "mingw-gettext"
PE = "0"
PV = "0.22.5"
PR = "2.el10"
PACKAGES = "mingw32-gettext mingw32-gettext-static mingw64-gettext mingw64-gettext-static"


URI_mingw32-gettext = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-gettext-0.22.5-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-gettext = "
 mingw32-libstdc++
 mingw32-termcap
 mingw32-win-iconv
 bash
 mingw32-crt
 mingw32-filesystem
 mingw32-libgcc
"

URI_mingw32-gettext-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-gettext-static-0.22.5-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-gettext-static = "
 mingw32-gettext
"

URI_mingw64-gettext = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-gettext-0.22.5-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-gettext = "
 mingw64-crt
 mingw64-filesystem
 bash
 mingw64-libstdc++
 mingw64-termcap
 mingw64-win-iconv
"

URI_mingw64-gettext-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-gettext-static-0.22.5-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-gettext-static = "
 mingw64-gettext
"
