
inherit dnf-bridge

PN = "libunistring"
PE = "0"
PV = "1.1"
PR = "10.el10"
PACKAGES = "libunistring libunistring-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libunistring-1.1-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libunistring = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libunistring-1.1-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libunistring}"
RDEPENDS:libunistring = " \
 glibc \
"

URI_libunistring-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libunistring-devel-1.1-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libunistring-devel}"
RDEPENDS:libunistring-devel = " \
 libunistring \
"
