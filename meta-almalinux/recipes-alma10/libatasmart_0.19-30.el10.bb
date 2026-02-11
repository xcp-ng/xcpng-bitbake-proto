
inherit dnf-bridge

PN = "libatasmart"
PE = "0"
PV = "0.19"
PR = "30.el10"
PACKAGES = "libatasmart libatasmart-devel"


URI_libatasmart = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libatasmart-0.19-30.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatasmart = " \
 glibc \
 systemd-libs \
"

URI_libatasmart-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libatasmart-devel-0.19-30.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatasmart-devel = " \
 libatasmart \
 vala \
 pkgconf-pkg-config \
"
