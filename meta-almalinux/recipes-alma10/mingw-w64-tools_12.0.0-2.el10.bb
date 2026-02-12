
inherit dnf-bridge

PN = "mingw-w64-tools"
PE = "0"
PV = "12.0.0"
PR = "2.el10"
PACKAGES = "mingw-w64-tools"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/mingw-w64-tools-12.0.0-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mingw-w64-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw-w64-tools-12.0.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mingw-w64-tools}"
RDEPENDS:mingw-w64-tools = " \
 glibc \
"
