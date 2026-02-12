
inherit dnf-bridge

PN = "upower"
PE = "0"
PV = "1.90.6"
PR = "2.el10"
PACKAGES = "upower upower-libs upower-devel upower-devel-docs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/upower-1.90.6-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_upower = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/upower-1.90.6-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_upower}"
RDEPENDS:upower = " \
 python3 \
 systemd-udev \
 libgcc \
 libgudev \
 polkit-libs \
 bash \
 glib2 \
 upower-libs \
 glibc \
"

URI_upower-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/upower-libs-1.90.6-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_upower-libs}"
RDEPENDS:upower-libs = " \
 glibc \
 libgcc \
 glib2 \
 gobject-introspection \
"

URI_upower-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/upower-devel-1.90.6-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_upower-devel}"
RDEPENDS:upower-devel = " \
 glib2-devel \
 polkit-devel \
 pkgconf-pkg-config \
 upower-libs \
"

URI_upower-devel-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/upower-devel-docs-1.90.6-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_upower-devel-docs}"
RDEPENDS:upower-devel-docs = " \
 upower-libs \
"
