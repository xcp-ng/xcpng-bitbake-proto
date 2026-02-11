
inherit dnf-bridge

PN = "aspell"
PE = "12"
PV = "0.60.8.1"
PR = "3.el10"
PACKAGES = "aspell aspell-devel"


URI_aspell = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/aspell-0.60.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:aspell = " \
 glibc \
 libstdc++ \
 bash \
 ncurses-libs \
"

URI_aspell-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/aspell-devel-0.60.8.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:aspell-devel = " \
 aspell \
 bash \
 pkgconf-pkg-config \
"
