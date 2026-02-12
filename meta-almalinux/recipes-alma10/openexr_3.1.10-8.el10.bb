
inherit dnf-bridge

PN = "openexr"
PE = "0"
PV = "3.1.10"
PR = "8.el10"
PACKAGES = "openexr openexr-libs openexr-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/openexr-3.1.10-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_openexr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openexr-3.1.10-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openexr}"
RDEPENDS:openexr = " \
 imath \
 openexr-libs \
 libgcc \
 libstdc++ \
 glibc \
"

URI_openexr-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openexr-libs-3.1.10-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openexr-libs}"
RDEPENDS:openexr-libs = " \
 imath \
 zlib-ng-compat \
 libgcc \
 libstdc++ \
 glibc \
"

URI_openexr-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openexr-devel-3.1.10-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openexr-devel}"
RDEPENDS:openexr-devel = " \
 openexr-libs \
 cmake-filesystem \
 pkgconf-pkg-config \
 imath-devel \
"
