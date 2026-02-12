
inherit dnf-bridge

PN = "libtracecmd"
PE = "0"
PV = "1.5.2"
PR = "1.el10"
PACKAGES = "libtracecmd libtracecmd-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libtracecmd-1.5.2-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libtracecmd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtracecmd-1.5.2-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libtracecmd}"
RDEPENDS:libtracecmd = " \
 zlib-ng-compat \
 libzstd \
 glibc \
 libtraceevent \
 libtracefs \
"

URI_libtracecmd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtracecmd-devel-1.5.2-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libtracecmd-devel}"
RDEPENDS:libtracecmd-devel = " \
 libtracefs-devel \
 libtracecmd \
 pkgconf-pkg-config \
"
