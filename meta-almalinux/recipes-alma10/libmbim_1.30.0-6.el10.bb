
inherit dnf-bridge

PN = "libmbim"
PE = "0"
PV = "1.30.0"
PR = "6.el10"
PACKAGES = "libmbim libmbim-utils libmbim-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libmbim-1.30.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libmbim = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libmbim-1.30.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmbim}"
RDEPENDS:libmbim = " \
 glibc \
 libgcc \
 glib2 \
"

URI_libmbim-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libmbim-utils-1.30.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmbim-utils}"
RDEPENDS:libmbim-utils = " \
 libmbim \
 libgcc \
 bash \
 glib2 \
 glibc \
"

URI_libmbim-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libmbim-devel-1.30.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmbim-devel}"
RDEPENDS:libmbim-devel = " \
 libmbim \
 glib2-devel \
 pkgconf-pkg-config \
"
