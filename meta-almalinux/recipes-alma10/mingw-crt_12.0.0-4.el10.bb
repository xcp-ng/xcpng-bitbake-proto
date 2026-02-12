
inherit dnf-bridge

PN = "mingw-crt"
PE = "0"
PV = "12.0.0"
PR = "4.el10"
PACKAGES = "mingw32-crt mingw64-crt ucrt64-crt"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/mingw-crt-12.0.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mingw32-crt = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-crt-12.0.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mingw32-crt}"
RDEPENDS:mingw32-crt = " \
 mingw32-filesystem \
"

URI_mingw64-crt = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-crt-12.0.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mingw64-crt}"
RDEPENDS:mingw64-crt = " \
 mingw64-filesystem \
"

URI_ucrt64-crt = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-crt-12.0.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-crt}"
RDEPENDS:ucrt64-crt = " \
 ucrt64-filesystem \
"
