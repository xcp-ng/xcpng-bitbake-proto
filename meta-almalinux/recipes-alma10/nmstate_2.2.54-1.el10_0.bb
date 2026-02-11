
inherit dnf-bridge

PN = "nmstate"
PE = "0"
PV = "2.2.54"
PR = "1.el10_0"
PACKAGES = "nmstate nmstate-libs python3-libnmstate nmstate-devel nmstate-static"


URI_nmstate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nmstate-2.2.54-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nmstate = " \
 glibc \
 nmstate-libs \
 libgcc \
"

URI_nmstate-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nmstate-libs-2.2.54-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nmstate-libs = " \
 glibc \
 libgcc \
"

URI_python3-libnmstate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libnmstate-2.2.54-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libnmstate = " \
 python3 \
 python3-pyyaml \
 nmstate-libs \
"

URI_nmstate-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nmstate-devel-2.2.54-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nmstate-devel = " \
 nmstate-libs \
 pkgconf-pkg-config \
"

URI_nmstate-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nmstate-static-2.2.54-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nmstate-static = " \
 nmstate-devel \
"
