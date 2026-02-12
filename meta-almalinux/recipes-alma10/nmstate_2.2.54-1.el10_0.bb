
inherit dnf-bridge

PN = "nmstate"
PE = "0"
PV = "2.2.54"
PR = "1.el10_0"
PACKAGES = "nmstate nmstate-libs python3-libnmstate nmstate-devel nmstate-static"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/nmstate-2.2.54-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nmstate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nmstate-2.2.54-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nmstate}"
RDEPENDS:nmstate = " \
 glibc \
 nmstate-libs \
 libgcc \
"

URI_nmstate-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nmstate-libs-2.2.54-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nmstate-libs}"
RDEPENDS:nmstate-libs = " \
 glibc \
 libgcc \
"

URI_python3-libnmstate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libnmstate-2.2.54-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-libnmstate}"
RDEPENDS:python3-libnmstate = " \
 python3 \
 python3-pyyaml \
 nmstate-libs \
"

URI_nmstate-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nmstate-devel-2.2.54-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nmstate-devel}"
RDEPENDS:nmstate-devel = " \
 nmstate-libs \
 pkgconf-pkg-config \
"

URI_nmstate-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nmstate-static-2.2.54-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nmstate-static}"
RDEPENDS:nmstate-static = " \
 nmstate-devel \
"
