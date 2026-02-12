
inherit dnf-bridge

PN = "libical"
PE = "0"
PV = "3.0.18"
PR = "3.el10"
PACKAGES = "libical libical-glib libical-devel libical-glib-devel libical-glib-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libical-3.0.18-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libical = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libical-3.0.18-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libical}"
RDEPENDS:libical = " \
 tzdata \
 libgcc \
 libstdc++ \
 glibc \
 libicu \
"

URI_libical-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libical-glib-3.0.18-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libical-glib}"
RDEPENDS:libical-glib = " \
 glibc \
 glib2 \
 libical \
"

URI_libical-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libical-devel-3.0.18-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libical-devel}"
RDEPENDS:libical-devel = " \
 libicu-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 libical \
"

URI_libical-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libical-glib-devel-3.0.18-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libical-glib-devel}"
RDEPENDS:libical-glib-devel = " \
 libical-glib \
 libical-devel \
 glib2-devel \
 pkgconf-pkg-config \
"

URI_libical-glib-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libical-glib-doc-3.0.18-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libical-glib-doc}"
RDEPENDS:libical-glib-doc = ""
