
PN = "libfastjson"
PE = "0"
PV = "1.2304.0"
PR = "6.el10"
PACKAGES = "libfastjson libfastjson-devel"


URI_libfastjson = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libfastjson-1.2304.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfastjson = " \
 glibc \
"

URI_libfastjson-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfastjson-devel-1.2304.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfastjson-devel = " \
 libfastjson \
 pkgconf-pkg-config \
"
