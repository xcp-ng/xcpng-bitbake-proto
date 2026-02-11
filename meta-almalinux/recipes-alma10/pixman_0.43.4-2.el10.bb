
inherit dnf-bridge

PN = "pixman"
PE = "0"
PV = "0.43.4"
PR = "2.el10"
PACKAGES = "pixman pixman-devel"


URI_pixman = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pixman-0.43.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pixman = " \
 glibc \
"

URI_pixman-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pixman-devel-0.43.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pixman-devel = " \
 pkgconf-pkg-config \
 pixman \
"
