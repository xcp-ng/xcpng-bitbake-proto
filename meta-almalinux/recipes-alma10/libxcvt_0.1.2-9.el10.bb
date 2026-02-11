
inherit dnf-bridge

PN = "libxcvt"
PE = "0"
PV = "0.1.2"
PR = "9.el10"
PACKAGES = "libxcvt libxcvt-devel cvt"


URI_libxcvt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxcvt-0.1.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcvt = " \
 glibc \
"

URI_libxcvt-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxcvt-devel-0.1.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcvt-devel = " \
 libxcvt \
 pkgconf-pkg-config \
"

URI_cvt = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cvt-0.1.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cvt = " \
 glibc \
 libxcvt \
"
