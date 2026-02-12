
inherit dnf-bridge

PN = "mingw-headers"
PE = "0"
PV = "12.0.0"
PR = "3.el10"
PACKAGES = "mingw32-headers mingw64-headers ucrt64-headers"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/mingw-headers-12.0.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mingw32-headers = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-headers-12.0.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mingw32-headers}"
RDEPENDS:mingw32-headers = " \
 mingw32-filesystem \
 mingw32-winpthreads \
"

URI_mingw64-headers = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-headers-12.0.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mingw64-headers}"
RDEPENDS:mingw64-headers = " \
 mingw64-filesystem \
 mingw64-winpthreads \
"

URI_ucrt64-headers = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-headers-12.0.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ucrt64-headers}"
RDEPENDS:ucrt64-headers = " \
 ucrt64-filesystem \
 ucrt64-winpthreads \
"
