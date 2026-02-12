
inherit dnf-bridge

PN = "libxslt"
PE = "0"
PV = "1.1.39"
PR = "8.el10_0"
PACKAGES = "libxslt libxslt-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libxslt-1.1.39-8.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libxslt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxslt-1.1.39-8.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libxslt}"
RDEPENDS:libxslt = " \
 glibc \
 libxml2 \
"

URI_libxslt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxslt-devel-1.1.39-8.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libxslt-devel}"
RDEPENDS:libxslt-devel = " \
 libxml2-devel \
 libxslt \
 libxslt-devel \
 libgpg-error-devel \
 pkgconf-pkg-config \
 bash \
"
