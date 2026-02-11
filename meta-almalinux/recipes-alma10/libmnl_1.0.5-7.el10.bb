
inherit dnf-bridge

PN = "libmnl"
PE = "0"
PV = "1.0.5"
PR = "7.el10"
PACKAGES = "libmnl libmnl-devel libmnl-static"


URI_libmnl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libmnl-1.0.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmnl = " \
 glibc \
"

URI_libmnl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmnl-devel-1.0.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmnl-devel = " \
 libmnl \
 pkgconf-pkg-config \
"

URI_libmnl-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libmnl-static-1.0.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmnl-static = " \
 libmnl-devel \
"
