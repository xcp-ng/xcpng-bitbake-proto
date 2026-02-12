
inherit dnf-bridge

PN = "colord"
PE = "0"
PV = "1.4.7"
PR = "6.el10"
PACKAGES = "colord colord-libs colord-devel colord-devel-docs colord-extra-profiles colord-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/colord-1.4.7-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_colord = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/colord-1.4.7-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_colord}"
RDEPENDS:colord = " \
 shadow-utils \
 systemd \
 systemd-libs \
 lcms2 \
 libgcc \
 libgudev \
 sqlite-libs \
 libgusb \
 polkit-libs \
 bash \
 glib2 \
 colord-libs \
 color-filesystem \
 glibc \
"

URI_colord-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/colord-libs-1.4.7-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_colord-libs}"
RDEPENDS:colord-libs = " \
 lcms2 \
 systemd-libs \
 libgcc \
 libgusb \
 glib2 \
 glibc \
"

URI_colord-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/colord-devel-1.4.7-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_colord-devel}"
RDEPENDS:colord-devel = " \
 glib2-devel \
 colord-devel \
 pkgconf-pkg-config \
 libgusb-devel \
 colord \
 colord-libs \
"

URI_colord-devel-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/colord-devel-docs-1.4.7-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_colord-devel-docs}"
RDEPENDS:colord-devel-docs = " \
 colord \
"

URI_colord-extra-profiles = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/colord-extra-profiles-1.4.7-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_colord-extra-profiles}"
RDEPENDS:colord-extra-profiles = " \
 colord \
"

URI_colord-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/colord-tests-1.4.7-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_colord-tests}"
RDEPENDS:colord-tests = " \
 lcms2 \
 libgcc \
 glib2 \
 colord-libs \
 glibc \
"
