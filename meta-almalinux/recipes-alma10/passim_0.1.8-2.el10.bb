
inherit dnf-bridge

PN = "passim"
PE = "0"
PV = "0.1.8"
PR = "2.el10"
PACKAGES = "passim passim-devel passim-libs"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/passim-0.1.8-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_passim = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/passim-0.1.8-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_passim}"
RDEPENDS:passim = " \
 libsoup3 \
 gnutls \
 libgcc \
 bash \
 glib2 \
 passim-libs \
 glibc \
"

URI_passim-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/passim-devel-0.1.8-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_passim-devel}"
RDEPENDS:passim-devel = " \
 passim \
 passim-libs \
 glib2-devel \
 pkgconf-pkg-config \
"

URI_passim-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/passim-libs-0.1.8-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_passim-libs}"
RDEPENDS:passim-libs = " \
 glibc \
 libgcc \
 glib2 \
"
