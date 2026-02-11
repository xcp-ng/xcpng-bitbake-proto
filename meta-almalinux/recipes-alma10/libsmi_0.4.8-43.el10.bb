
inherit dnf-bridge

PN = "libsmi"
PE = "0"
PV = "0.4.8"
PR = "43.el10"
PACKAGES = "libsmi libsmi-devel"


URI_libsmi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsmi-0.4.8-43.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsmi = " \
 glibc \
 wget \
 gawk \
 bash \
"

URI_libsmi-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsmi-devel-0.4.8-43.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsmi-devel = " \
 pkgconf-pkg-config \
 libsmi \
"
