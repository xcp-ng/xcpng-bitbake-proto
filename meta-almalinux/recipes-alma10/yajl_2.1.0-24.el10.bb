
PN = "yajl"
PE = "0"
PV = "2.1.0"
PR = "24.el10"
PACKAGES = "yajl yajl-devel"


URI_yajl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yajl-2.1.0-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:yajl = " \
 glibc \
"

URI_yajl-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yajl-devel-2.1.0-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:yajl-devel = " \
 yajl \
 pkgconf-pkg-config \
"
