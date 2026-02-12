
inherit dnf-bridge

PN = "yajl"
PE = "0"
PV = "2.1.0"
PR = "24.el10"
PACKAGES = "yajl yajl-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/yajl-2.1.0-24.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_yajl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yajl-2.1.0-24.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_yajl}"
RDEPENDS:yajl = " \
 glibc \
"

URI_yajl-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yajl-devel-2.1.0-24.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_yajl-devel}"
RDEPENDS:yajl-devel = " \
 yajl \
 pkgconf-pkg-config \
"
