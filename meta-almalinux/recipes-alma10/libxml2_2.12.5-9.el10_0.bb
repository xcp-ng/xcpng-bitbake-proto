
PN = "libxml2"
PE = "0"
PV = "2.12.5"
PR = "9.el10_0"
PACKAGES = "libxml2 python3-libxml2 libxml2-devel libxml2-static"


URI_libxml2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libxml2-2.12.5-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxml2 = " \
 glibc \
 zlib-ng-compat \
 xz-libs \
"

URI_python3-libxml2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-libxml2-2.12.5-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libxml2 = " \
 glibc \
 python3 \
 libxml2 \
"

URI_libxml2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxml2-devel-2.12.5-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxml2-devel = " \
 xz-devel \
 cmake-filesystem \
 zlib-ng-compat-devel \
 libxml2 \
 pkgconf-pkg-config \
 bash \
"

URI_libxml2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxml2-static-2.12.5-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxml2-static = ""
