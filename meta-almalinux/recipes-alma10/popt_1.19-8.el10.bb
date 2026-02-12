
inherit dnf-bridge

PN = "popt"
PE = "0"
PV = "1.19"
PR = "8.el10"
PACKAGES = "popt popt-devel popt-static"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/popt-1.19-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_popt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/popt-1.19-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_popt}"
RDEPENDS:popt = " \
 glibc \
"

URI_popt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/popt-devel-1.19-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_popt-devel}"
RDEPENDS:popt-devel = " \
 popt \
 pkgconf-pkg-config \
"

URI_popt-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/popt-static-1.19-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_popt-static}"
RDEPENDS:popt-static = " \
 popt-devel \
"
