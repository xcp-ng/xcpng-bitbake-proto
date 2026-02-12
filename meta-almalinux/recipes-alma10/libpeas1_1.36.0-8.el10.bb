
inherit dnf-bridge

PN = "libpeas1"
PE = "0"
PV = "1.36.0"
PR = "8.el10"
PACKAGES = "libpeas1 libpeas1-gtk libpeas1-loader-python3 libpeas1-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libpeas1-1.36.0-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libpeas1 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpeas1-1.36.0-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpeas1}"
RDEPENDS:libpeas1 = " \
 glibc \
 glib2 \
 gobject-introspection \
"

URI_libpeas1-gtk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpeas1-gtk-1.36.0-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpeas1-gtk}"
RDEPENDS:libpeas1-gtk = " \
 libpeas1 \
 gobject-introspection \
 glib2 \
 gtk3 \
 glibc \
"

URI_libpeas1-loader-python3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpeas1-loader-python3-1.36.0-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpeas1-loader-python3}"
RDEPENDS:libpeas1-loader-python3 = " \
 python3-gobject \
 libpeas1 \
 python3-libs \
 glib2 \
 glibc \
"

URI_libpeas1-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libpeas1-devel-1.36.0-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpeas1-devel}"
RDEPENDS:libpeas1-devel = " \
 libpeas1 \
 glib2-devel \
 pkgconf-pkg-config \
 libpeas1-gtk \
 libpeas1-devel \
 gobject-introspection-devel \
 gtk3-devel \
"
