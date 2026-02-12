
inherit dnf-bridge

PN = "mingw-zlib"
PE = "0"
PV = "1.3.1"
PR = "5.el10"
PACKAGES = "mingw32-zlib mingw32-zlib-static mingw64-zlib mingw64-zlib-static ucrt64-zlib ucrt64-zlib-static"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/mingw-zlib-1.3.1-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mingw32-zlib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-zlib-1.3.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mingw32-zlib}"
RDEPENDS:mingw32-zlib = " \
 mingw32-crt \
 mingw32-filesystem \
"

URI_mingw32-zlib-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-zlib-static-1.3.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mingw32-zlib-static}"
RDEPENDS:mingw32-zlib-static = " \
 mingw32-zlib \
"

URI_mingw64-zlib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-zlib-1.3.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mingw64-zlib}"
RDEPENDS:mingw64-zlib = " \
 mingw64-crt \
 mingw64-filesystem \
"

URI_mingw64-zlib-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-zlib-static-1.3.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mingw64-zlib-static}"
RDEPENDS:mingw64-zlib-static = " \
 mingw64-zlib \
"

URI_ucrt64-zlib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-zlib-1.3.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-zlib}"
RDEPENDS:ucrt64-zlib = " \
 ucrt64-crt \
 ucrt64-filesystem \
"

URI_ucrt64-zlib-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-zlib-static-1.3.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-zlib-static}"
RDEPENDS:ucrt64-zlib-static = " \
 ucrt64-zlib \
"
