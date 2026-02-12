
inherit dnf-bridge

PN = "libseccomp"
PE = "0"
PV = "2.5.3"
PR = "10.el10"
PACKAGES = "libseccomp libseccomp-devel libseccomp-static"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libseccomp-2.5.3-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libseccomp = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libseccomp-2.5.3-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libseccomp}"
RDEPENDS:libseccomp = " \
 glibc \
"

URI_libseccomp-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libseccomp-devel-2.5.3-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libseccomp-devel}"
RDEPENDS:libseccomp-devel = " \
 glibc \
 pkgconf-pkg-config \
 libseccomp \
"

URI_libseccomp-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libseccomp-static-2.5.3-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libseccomp-static}"
RDEPENDS:libseccomp-static = " \
 libseccomp-devel \
"
