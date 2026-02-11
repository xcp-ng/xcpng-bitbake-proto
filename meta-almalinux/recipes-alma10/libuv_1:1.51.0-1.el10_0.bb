
inherit dnf-bridge

PN = "libuv"
PE = "1"
PV = "1.51.0"
PR = "1.el10_0"
PACKAGES = "libuv libuv-devel libuv-static"


URI_libuv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libuv-1.51.0-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libuv = " \
 glibc \
"

URI_libuv-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libuv-devel-1.51.0-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libuv-devel = " \
 libuv \
 cmake-filesystem \
 pkgconf-pkg-config \
 libuv-static \
"

URI_libuv-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libuv-static-1.51.0-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libuv-static = " \
 libuv-devel \
 pkgconf-pkg-config \
"
