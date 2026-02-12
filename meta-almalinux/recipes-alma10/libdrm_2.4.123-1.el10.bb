
inherit dnf-bridge

PN = "libdrm"
PE = "0"
PV = "2.4.123"
PR = "1.el10"
PACKAGES = "libdrm libdrm-devel drm-utils"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libdrm-2.4.123-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libdrm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdrm-2.4.123-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdrm}"
RDEPENDS:libdrm = " \
 glibc \
 libpciaccess \
"

URI_libdrm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdrm-devel-2.4.123-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdrm-devel}"
RDEPENDS:libdrm-devel = " \
 kernel-headers \
 libpciaccess-devel \
 pkgconf-pkg-config \
 libdrm \
 libdrm-devel \
"

URI_drm-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/drm-utils-2.4.123-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_drm-utils}"
RDEPENDS:drm-utils = " \
 glibc \
 libdrm \
"
